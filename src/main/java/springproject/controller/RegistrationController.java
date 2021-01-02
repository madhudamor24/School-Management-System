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

import springproject.dao.RegistrationDao;
import springproject.model.Registration;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationDao registrationDao;
	
	
	
	@RequestMapping("/registration")
	public String home(Model m)
	{
		List<Registration> registrations = registrationDao.getRegistrations();
		m.addAttribute("registrations", registrations);
		
		return "registration";
	}
	
	
	//show add product form
	@RequestMapping("/add-registration")
	public String addRegistration(Model m)
	{
		m.addAttribute("title", "Add Registration");
		return "add_registration_form";
	}
	
	
	//handle add product form
	@RequestMapping(value="/handle-registration", method = RequestMethod.POST)
	public RedirectView handleStudent(@ModelAttribute Registration registration, HttpServletRequest request)
	{
		System.out.println(registration);
		registrationDao.createRegistration(registration);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/registration");
		return redirectView;
	}
	
	
	//delete handler
	@RequestMapping(value="/registration/delete/{student_id}")
	public RedirectView deleteStudent(@PathVariable("student_id") int student_id, HttpServletRequest request)
	{
		this.registrationDao.deleteRegistration(student_id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/registration");
		return redirectView;
	}
	
	@RequestMapping("/registration/update/{student_id}")
	public String updateForm(@PathVariable("student_id") int student_id, Model model)
	{
		Registration registration = this.registrationDao.getRegistration(student_id);
		model.addAttribute("registration", registration);
		return "update_form_registration";
	}
	
	
	
	
}
