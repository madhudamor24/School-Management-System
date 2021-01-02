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

import springproject.dao.AttendanceDao;
import springproject.model.Attendance;

@Controller
public class AttendanceController {

	@Autowired
	private AttendanceDao attendanceDao;

	@RequestMapping("/attendance")
	public String home(Model m) {
		List<Attendance> attendances = attendanceDao.getAllAttendance();
		m.addAttribute("attendances", attendances);

		return "attendance";
	}

	// show add product form
	@RequestMapping("/add-attendance")
	public String addAttendance(Model m) {
		m.addAttribute("title", "Add Attendance");
		return "add_attendance_form";
	}

	// handle add product form
	@RequestMapping(value = "/handle-attendance", method = RequestMethod.POST)
	public RedirectView handleAttendance(@ModelAttribute Attendance attendance, HttpServletRequest request) {
		System.out.println(attendance);
		attendanceDao.insert(attendance);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/attendance");
		return redirectView;
	}

	
	  //delete handler
	  
	  @RequestMapping(value="attendance/delete/{student_id}") 
	  public RedirectView deleteAttendance(@PathVariable("student_id") int student_id, HttpServletRequest request) 
	  {
		  this.attendanceDao.delete(student_id); 
		  RedirectView redirectView = new RedirectView(); 
		  redirectView.setUrl(request.getContextPath()+ "/attendance"); 
		  return redirectView; 
	  }
	 

	
	  @RequestMapping("attendance/update/{student_id}") 
	  public String updateForm(@PathVariable("student_id") int student_id, Model model) 
	  {
		  Attendance attendance = this.attendanceDao.getAttendance(student_id);
		  model.addAttribute("attendance", attendance); 
		  return "update_form_attendance"; 
	  }
	 

}
