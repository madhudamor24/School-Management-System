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

import springproject.dao.TeacherDao;
import springproject.model.Teacher;

@Controller
public class TeacherController {

	@Autowired
	private TeacherDao teacherDao;
	
	
	
	@RequestMapping("/teacher")
	public String home(Model m)
	{
		List<Teacher> teachers = teacherDao.getTeachers();
		m.addAttribute("teachers", teachers);
		
		return "teacher";
	}
	
	
	//show add product form
	@RequestMapping("/add-teacher")
	public String addTeacher(Model m)
	{
		m.addAttribute("title", "Add Teacher");
		return "add_teacher_form";
	}
	
	
	//handle add product form
	@RequestMapping(value="/handle-teacher", method = RequestMethod.POST)
	public RedirectView handleTeacher(@ModelAttribute Teacher teacher, HttpServletRequest request)
	{
		System.out.println(teacher);
		teacherDao.createTeacher(teacher);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/teacher");
		return redirectView;
	}
	
	
	//delete handler
	@RequestMapping(value="/teacher/delete/{teacher_id}")
	public RedirectView deleteTeacher(@PathVariable("teacher_id") int teacher_id, HttpServletRequest request)
	{
		this.teacherDao.deleteTeacher(teacher_id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/teacher");
		return redirectView;
	}
	
	@RequestMapping("/teacher/update/{teacher_id}")
	public String updateForm(@PathVariable("teacher_id") int teacher_id, Model model)
	{
		Teacher teacher = this.teacherDao.getTeacher(teacher_id);
		model.addAttribute("teacher", teacher);
		return "update_form_teacher";
	}
	
	
	
}
