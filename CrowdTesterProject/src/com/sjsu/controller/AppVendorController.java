package com.sjsu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.TesterDetails;

@Controller
@RequestMapping("appVendor")
public class AppVendorController {
	
	@RequestMapping("/showAppVendorDashboard")
	public String showTesterDashboard(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		
		return "AppVendorDashboard";
	}
	
	@RequestMapping("/showAppVendorProfileform")
	public String showProfileform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("appVendorDetails", appVendorDetails);
		return "AppVendorProfileForm";
	}
	
	
	@RequestMapping("/showAppVendorAssistform")
	public String showAssistform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("appVendorDetails", appVendorDetails);
		return "AppVendorAssistForm";
	}

}