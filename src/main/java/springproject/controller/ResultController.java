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

import springproject.dao.ResultDao;
import springproject.model.Result;

@Controller
public class ResultController {

	@Autowired
	private ResultDao resultDao;
	
	@RequestMapping("/result")
	public String home(Model m)
	{
		List<Result> results = resultDao.getAllResults();
		m.addAttribute("results", results);
		
		return "result";
	}
	
	
	//show add result form
	@RequestMapping("/add-result")
	public String addResult(Model m)
	{
		m.addAttribute("title", "Add Result");
		return "add_result_form";
	}
	
	
	//handle add result form
	@RequestMapping(value="/handle-result", method = RequestMethod.POST)
	public RedirectView handleResult(@ModelAttribute Result result, HttpServletRequest request)
	{
		System.out.println(result);
		resultDao.insert(result);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/result");
		return redirectView;
	}
	
	
	//delete handler
	@RequestMapping(value="/result/delete/{student_id}/{subject_code}")
	public RedirectView deleteResult(@PathVariable("student_id") int student_id, @PathVariable("subject_code") int subject_code, HttpServletRequest request)
	{
		this.resultDao.delete(student_id, subject_code);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/result");
		return redirectView;
	}
	
	@RequestMapping("/result/update/{student_id}/{subject_code}")
	public String updateForm(@PathVariable("student_id") int student_id, @PathVariable("subject_code") int subject_code, Model model)
	{
		Result result = this.resultDao.getResult(student_id, subject_code);
		model.addAttribute("result", result);
		return "update_form_result";
	}
		
}
