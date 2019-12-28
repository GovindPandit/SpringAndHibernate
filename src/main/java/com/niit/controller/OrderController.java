package com.niit.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.instamojo.wrapper.api.ApiContext;
import com.instamojo.wrapper.api.Instamojo;
import com.instamojo.wrapper.api.InstamojoImpl;
import com.instamojo.wrapper.model.PaymentOrder;
import com.instamojo.wrapper.model.PaymentOrderResponse;

@Controller
@RequestMapping("/order")
public class OrderController 
{
	@RequestMapping("/buy")
	public String m1(HttpServletResponse resp)
	{
		  try 
	       {
	           ApiContext context = ApiContext.create("test_BaRDDGvbDNj0ZcudrrjqHnGKHtQqkC6iiDF", "test_5qikY6U2ikPAqCCcje7IZjXDG7yHMKG8nnLnibJXaZHiO8kmW8ayuXFyxGwOzqqc4u0PhrkqG4jfJ3RjXGEefqSdIwnnKfPiCvegi0qmjM62DX97ZHNFIWmqcyV", ApiContext.Mode.TEST);
	           Instamojo api = new InstamojoImpl(context);

	           PaymentOrder order = new PaymentOrder();
	           order.setName("Govind123");
	           order.setEmail("govindpanditniit@gmail.com");
	           order.setPhone("7977518582");
	           order.setCurrency("INR");
	           order.setAmount((double)11);
	           order.setDescription("This is a test transaction.");
	           order.setRedirectUrl("https://www.google.com");
	           order.setWebhookUrl("https://www.google.com");
	           order.setTransactionId(UUID.randomUUID().toString());

	           PaymentOrderResponse paymentOrderResponse = api.createPaymentOrder(order);
	           resp.sendRedirect(paymentOrderResponse.getPaymentOptions().getPaymentUrl());
	       }
	       catch (Exception e) 
	       {
	           System.out.println(e);
	       }
		  return "redirect:/home";
	}
}
