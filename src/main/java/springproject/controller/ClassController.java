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

import springproject.dao.ClassDao;
import springproject.model.Class;

@Controller
public class ClassController {
	
	@Autowired
	private ClassDao classDao;
	
	@RequestMapping("/class")
	public String home(Model m)
	{
		List<Class> Classes = classDao.getClasses();
		m.addAttribute("Classes", Classes);
		return "class";
	}
	
	
	//show add product form
	@RequestMapping("/add-class")
	public String addClass(Model m)
	{
		m.addAttribute("title", "Add Class");
		return "add_class_form";
	}
	
	
	//handle add product form
	@RequestMapping(value="/handle-class", method = RequestMethod.POST)
	public RedirectView handleClass(@ModelAttribute Class Class, HttpServletRequest request)
	{
		System.out.println(Class);
		classDao.createClass(Class);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/class");
		return redirectView;
	}
	
	
	//delete handler
	@RequestMapping(value="/class/delete/{class_id}")
	public RedirectView deleteClass(@PathVariable("class_id") int class_id, HttpServletRequest request)
	{
		this.classDao.deleteClass(class_id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/class");
		return redirectView;
	}
	
	@RequestMapping("/class/update/{class_id}")
	public String updateForm(@PathVariable("class_id") int class_id, Model model)
	{
		Class Class = this.classDao.getClass(class_id);
		model.addAttribute("Class", Class);
		return "update_form_class";
	}
	
	
	
}
