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

import springproject.dao.Class_detailDao;
import springproject.model.Class_detail;

@Controller
public class Class_detailController {
	
	@Autowired
	private Class_detailDao class_detailDao;
	
	
	@RequestMapping("/class_detail")
	public String home(Model m)
	{
		List<Class_detail> class_details = class_detailDao.getAllClass_details();
		m.addAttribute("class_details", class_details);
		return "class_detail";
	}
	
	//show add product form
	@RequestMapping("/add-class_detail")
	public String addClass_detail(Model m)
	{
		m.addAttribute("title", "Add Class_detail");
		return "add_class_detail_form";
	}
	
	//handle add product form
	@RequestMapping(value="/handle-class_detail", method = RequestMethod.POST)
	public RedirectView handleClass_detail(@ModelAttribute Class_detail Class_detail, HttpServletRequest request)
	{
		System.out.println(Class_detail);
		class_detailDao.insert(Class_detail);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/class_detail");
		return redirectView;
	}
	
	//delete handler
	@RequestMapping(value="/class_detail/delete/{class_id}/{subject_code}")
	public RedirectView deleteClass_detail(@PathVariable("class_id") int class_id,@PathVariable("subject_code") int subject_code, HttpServletRequest request)
	{
		this.class_detailDao.delete(class_id, subject_code);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/class_detail");
		return redirectView;
	}
	
	@RequestMapping("/class_detail/update/{class_id}/{subject_code}")
	public String updateForm(@PathVariable("class_id") int class_id,@PathVariable("subject_code") int subject_code, Model model)
	{
		Class_detail Class_detail = this.class_detailDao.getClass_detail(class_id, subject_code);
		model.addAttribute("Class_detail", Class_detail);
		return "update_form_class_detail";
	}
		
}
