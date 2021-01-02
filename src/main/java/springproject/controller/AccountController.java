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

import springproject.dao.AccountDao;
import springproject.model.Account;

@Controller
public class AccountController {
	
	@Autowired
	private AccountDao accountDao;
	
	@RequestMapping("/account")
	public String home(Model m)
	{
		List<Account> accounts = accountDao.getAllAccounts();
		m.addAttribute("accounts", accounts);
		
		return "account";
	}
	
	
	//show add product form
	@RequestMapping("/add-account")
	public String addAccount(Model m)
	{
		m.addAttribute("title", "Add Account");
		return "add_account_form";
	}
	
	
	//handle add product form
	@RequestMapping(value="/handle-account", method = RequestMethod.POST)
	public RedirectView handleAccount(@ModelAttribute Account account, HttpServletRequest request)
	{
		System.out.println(account);
		accountDao.insert(account);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/account");
		return redirectView;
	}
	
	
	  //delete handler
	  @RequestMapping(value="/account/delete/{student_id}") 
	  public RedirectView deleteAccount(@PathVariable("student_id") int student_id, HttpServletRequest request) 
	  { 
		  this.accountDao.delete(student_id); 
		  RedirectView redirectView = new RedirectView();
		  redirectView.setUrl(request.getContextPath()+ "/account"); 
		  return redirectView; 
	  }
	 
	
	
	 @RequestMapping("/account/update/{student_id}") 
	 public String updateForm(@PathVariable("student_id") int student_id, Model model) 
	 { 
		 Account account = this.accountDao.getAccount(student_id);
		 model.addAttribute("account", account); 
		 return "update_form_account"; 
	}
	
	
}
