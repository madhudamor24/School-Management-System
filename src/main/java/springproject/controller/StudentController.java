package springproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springproject.dao.StudentDao;
import springproject.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao studentDao;
	
	
	@RequestMapping("/student")
	public String home(Model m)
	{
		List<Student> students = studentDao.getStudents();
		m.addAttribute("students", students);
		
		return "student";
	}
	
	
	//show add student form
	@RequestMapping("/add-student")
	public String addStudent(Model m)
	{
		m.addAttribute("title", "Add Student");
		return "add_student_form";
	}
	
	
	//handle student form
	@RequestMapping(value="/handle-student", method = RequestMethod.POST)
	public RedirectView handleStudent(@ModelAttribute Student student, HttpServletRequest request)
	{
		System.out.println(student);
		studentDao.createStudent(student);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/student");
		return redirectView;
	}
	
	
	//delete student
	@RequestMapping(value="/student/delete/{student_id}")
	public RedirectView deleteStudent(@PathVariable("student_id") int student_id, HttpServletRequest request)
	{
		this.studentDao.deleteStudent(student_id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/student");
		return redirectView;
	}
	
//	update student
	@RequestMapping(value="/student/update/{student_id}")
	public String updateForm(@PathVariable("student_id") int student_id, Model model)
	{
		Student student = this.studentDao.getStudent(student_id);
		model.addAttribute("student", student);
		return "update_form_student";
	}
	
	
	
}
