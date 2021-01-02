package springproject.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
//	@RequestMapping(path="/home", method = RequestMethod.POST)
	@RequestMapping("/home")
	public String home(Model m)
	{
		System.out.println("This is home url....!!");
		
//		
//		m.addAttribute("name","hero");
//		m.addAttribute("id",12);
		
		return "index";
	}
	
	
	
	@RequestMapping("/login")
	public String login()
	{
		System.out.println("This is login page....!!");
		return "login";
	}
	
	@RequestMapping("/register")
	public String registration()
	{
		System.out.println("This is registration page....!!");
		return "register";
	}
	
	@RequestMapping("/data")
	public ModelAndView data()
	{
		System.out.println("This is help Controller");
		
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name", "Happy");
		modelAndView.addObject("rollnumber", 18064013);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer>list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2134);
		list.add(2345);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("data");
		
		return modelAndView;
	}
	
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about url....!!");
		return "about";
	}
	
	
	@RequestMapping("/help")
	public String help()
	{
		System.out.println("this is help url....!!");
		return "help";
	}
	
	
	@RequestMapping("/front")
	public String front()
	{
		System.out.println("This is school Front page....!!");
		return "front";
	}
	
	@RequestMapping("/form")
	public String form()
	{
		System.out.println("Fill the form....!!");
		return "form";
	}
	
	@RequestMapping("/enter")
	public String enter()
	{
		System.out.println("Entry page for User....!!");
		return "enter";
	}
	
}
