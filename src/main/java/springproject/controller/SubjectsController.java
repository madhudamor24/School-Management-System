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

import springproject.dao.SubjectsDao;
import springproject.model.Subjects;

@Controller
public class SubjectsController {

	@Autowired
	private SubjectsDao subjectsDao;
	
	
	
	@RequestMapping("/subjects")
	public String home(Model m)
	{
		List<Subjects> subjectss = subjectsDao.getSubjectss();
		m.addAttribute("subjectss", subjectss);
		
		return "subjects";
	}
	
	
	//show add product form
	@RequestMapping("/add-subjects")
	public String addSubjects(Model m)
	{
		m.addAttribute("title", "Add Subjects");
		return "add_subjects_form";
	}
	
	
	//handle add product form
	@RequestMapping(value="/handle-subjects", method = RequestMethod.POST)
	public RedirectView handleSubjects(@ModelAttribute Subjects subjects, HttpServletRequest request)
	{
		System.out.println(subjects);
		subjectsDao.createSubjects(subjects);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/subjects");
		return redirectView;
	}
	
	
	//delete handler
	@RequestMapping(value="/delete/{subject_code}")
	public RedirectView deleteSubjects(@PathVariable("subject_code") int subject_code, HttpServletRequest request)
	{
		this.subjectsDao.deleteSubjects(subject_code);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/subjects");
		return redirectView;
	}
	
	@RequestMapping("/update/{subject_code}")
	public String updateForm(@PathVariable("subject_code") int subject_code, Model model)
	{
		Subjects subjects = this.subjectsDao.getSubjects(subject_code);
		model.addAttribute("subjects", subjects);
		return "update_form_subjects";
	}
	
	
}
