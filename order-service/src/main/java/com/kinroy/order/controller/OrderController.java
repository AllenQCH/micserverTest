//package com.kinroy.order.controller;
//
//import com.kinroy.order.pojo.Order;
//import com.kinroy.order.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/order")
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//
//    @GetMapping("/{orderId}")
//    public Order getById(@PathVariable Long orderId){
//       return orderService.getById(orderId);
//    }
//}
