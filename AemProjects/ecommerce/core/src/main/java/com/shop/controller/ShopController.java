package com.shop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.shop.domain.Address;
import com.shop.domain.Shop;
import com.shop.service.ShopService;

/**
 * To get the Patient details.
 * @author arunkumar sadhasivam
 *
 */
@Controller
@SessionAttributes({"shop"})
public class ShopController {
	
	List<Address> addresslist = new ArrayList<Address>();
	@Autowired
	ShopService shopService;
	public ShopController(){
		System.out.println("PatientController.PatientController()");
	}
	 

	
	
	

	/**
	 * To get the Customer Master Main Entry screen.
	 * @param model
	 * @param req
	 * @return
	 */
	@RequestMapping("/main")
	public ModelAndView main(Model model,@ModelAttribute("shop") Shop shop,HttpServletRequest req) {
		
		ModelAndView mv = new ModelAndView();

		model.addAttribute("shop", shop);
		mv.addObject("shop", shop);//session object

		mv.setViewName("/main.jsp");
		
		return mv;
	}
	

	/**
	 * To search the customer
	 * @param model
	 * @param shop
	 * @param req
	 * @return
	 */
	@RequestMapping("/search")
	public ModelAndView search(Model model,@ModelAttribute("shop") Shop shop,HttpServletRequest req) {
		System.out.println("ShopController.search()");
		ModelAndView mv = new ModelAndView();
		String custNo = req.getParameter("custNo");
		List<Shop> shopList = shopService.searchCustomer(custNo);
		mv.addObject("shopList", shopList);

		model.addAttribute("shop", shop);
		mv.setViewName("/jsps/CustomerDetails.jsp");
		
		return mv;
	}
	
	
	/**
	 * To Address to customer
	 * @param model
	 * @param shop
	 * @param req
	 * @return
	 */
	@RequestMapping("/addAddress")
	public ModelAndView addAddress(Model model,@ModelAttribute("shop") Shop shop,
			HttpServletRequest req) {
		System.out.println("ShopController.Add()");
		Shop shop1= (Shop)req.getSession().getAttribute("shop");
		ModelAndView mv = new ModelAndView();
		System.out.println("ShopController.addAddress()"+shop.getCustomerNo());

		int size = addresslist.size();

		Address address = new Address();
		address.setStreetName("street"+size);
		address.setAptNo("AptNo:"+size);
		address.setCity("city"+size);
		
		addresslist.add(address);
		shop.setAddressList(addresslist);
		model.addAttribute("shop", shop);
		model.addAttribute("addresslist", addresslist);

		mv.setViewName("/jsps/CustomerMaster.jsp");
		
		return mv;
	}
	
	
	
	
	

	/**
	 * To get the Customer Master Main Entry screen.
	 * @param model
	 * @param req
	 * @return
	 */
	@RequestMapping("/customerMaster")
	public ModelAndView customerMaster(Model model) {
		Shop shop  = new Shop();
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "");
		model.addAttribute("shop", shop);
		mv.setViewName("/jsps/CustomerMaster.jsp");
		
		return mv;
	}


	/**
	 * To save patient Details.
	 * @param model
	 * @param req
	 * @return
	 */
	@RequestMapping("/saveCustomerDetails")
	public ModelAndView saveCustomerDetails(Model model,HttpServletRequest request,@ModelAttribute("shop") Shop shop) {
		System.out.println("saveCustomerDetails: BEGIN");
		int resut = shopService.insert(shop);
		String message ="Error in insertion...";
		
		if(resut == 0){
			message ="Customer details inserted Sucessfully";
		}

		shop.setMessage(message);
		request.setAttribute("message", message);
		addresslist.clear();//clear after insertion.
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/jsps/CustomerMaster.jsp");
		mv.addObject("shop",shop);

		
		return mv;
	}
	

	
	/**
	 * To get the Patient details.
	 * @param model
	 * @param req
	 * @return
	 */
	@RequestMapping("/getCustomerDetails")
	public ModelAndView getCustomerDetails(Model model,HttpServletRequest req) {
		System.out.println("ShopController.getCustomerDetails()");
		List<Shop> shopList = shopService.getCustomerDetails();

		ModelAndView mv = new ModelAndView();
		mv.addObject("status", 1);
		mv.addObject("shopList", shopList);
		mv.setViewName("/jsps/CustomerDetails.jsp");
		
		return mv;
	}

	

	
	/**
	 * To get the Patient Insurance details.
	 * @param model
	 * @param req
	 * @return
	 */
	@RequestMapping("/contact")
	public ModelAndView getInsuranceDetails(Model model,HttpServletRequest req) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("/jsps/contact.jsp");
		
		return mv;
	}
}
