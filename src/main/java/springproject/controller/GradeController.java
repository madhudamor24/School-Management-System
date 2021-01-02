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

import springproject.dao.GradeDao;
import springproject.model.Grade;

@Controller
public class GradeController {

	@Autowired
	private GradeDao gradeDao;
	
	@RequestMapping("/grade")
	public String home(Model m)
	{
		List<Grade> grades = gradeDao.getGrades();
		m.addAttribute("grades", grades);
		
		return "grade";
	}
	
	
	//show add product form
	@RequestMapping("/add-grade")
	public String addGrade(Model m)
	{
		m.addAttribute("title", "Add Grade");
		return "add_grade_form";
	}
	
	
	//handle add product form
	@RequestMapping(value="/handle-grade", method = RequestMethod.POST)
	public RedirectView handleGrade(@ModelAttribute Grade grade, HttpServletRequest request)
	{
		System.out.println(grade);
		gradeDao.createGrade(grade);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/grade");
		return redirectView;
	}
	
	
	//delete handler
	@RequestMapping(value="/grade/delete/{grade_id}")
	public RedirectView deleteGrade(@PathVariable("grade_id") int grade_id, HttpServletRequest request)
	{
		this.gradeDao.deleteGrade(grade_id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/grade");
		return redirectView;
	}
	
	@RequestMapping("/grade/update/{grade_id}")
	public String updateForm(@PathVariable("grade_id") int grade_id, Model model)
	{
		Grade grade = this.gradeDao.getGrade(grade_id);
		model.addAttribute("grade", grade);
		return "update_form_grade";
	}
	
	
	
}
