package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.PurchaseOrderDao;
import com.project.model.PurchaseOrder;


@Controller
public class PurchaseOrderController {
	
	@Autowired
	PurchaseOrderDao purchaseOrderDao;
	
	@RequestMapping(value="/purchaseOrder",method=RequestMethod.POST)
	public ModelAndView raisePurchaseOrder(@ModelAttribute("purchaseobj") PurchaseOrder purchaseobj  ) {
		System.out.println("i m here");
		ModelAndView mv=new ModelAndView("SellerSuccess") ;
		System.out.println("i am goin to finish");
		mv.addObject("msg","po is raised");
		return null;
		
		
	}
	

}