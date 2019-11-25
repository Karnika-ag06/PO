package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.PurchaseOrderDao;
import com.project.dao.UserDao;
import com.project.model.PurchaseOrder;
import com.project.model.PurchaseOrderItems;
import com.project.model.User;
import com.project.service.ProductService;

@Controller
public class POController {
	
	@Autowired
	PurchaseOrderDao purchaseOrderDao;
	
	@Autowired
	HttpSession session;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/getRaisePOform",method=RequestMethod.POST)
	public String raisePurchaseOrder(@RequestBody List<PurchaseOrderItems> purchaseOrderItemsList,ModelMap map) {
		User bObj=(User)session.getAttribute("userObj");
		
		PurchaseOrder po=new PurchaseOrder();
		po.setUserObj(bObj);
		po.setSellerObj(userDao.getSeller());


		
		for(PurchaseOrderItems obj:purchaseOrderItemsList) {
			obj.setProductObj(productService.getProductById(obj.getProductId()));
			obj.setPurchaseOrderObj(po);
		}
		
		po.setPurchaseOrderItemsObj(purchaseOrderItemsList);
		
				
		System.out.println("Purchase Order : "+po);
		
		
		purchaseOrderDao.addPurchaseOrder(po);
		
		map.addAttribute("msg","Purchase Order has been raised succesfully...");
		return "success";
		
		
	}
	}
	/*
	@RequestMapping(value="/viewAllProducts",method=RequestMethod.GET)
	public ModelAndView getAllProducts(){
	
	ModelAndView mv=new ModelAndView("ViewProducts");
	mv.addObject("productDetails",productService.viewAllProducts());
	return mv;
	}*/
	
