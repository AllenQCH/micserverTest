package com.kinroy.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController1 {

//    @Autowired
//    private OrderService orderService;
//
//    @GetMapping("/{orderId}")
//    public Order getById(@PathVariable Long orderId){
//       return orderService.getById(orderId);
//    }
    @RequestMapping(value = "/getStr",method = RequestMethod.POST)
    public String getStr(){
        return "hello world!!!!";
    }
}
