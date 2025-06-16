package com.hyunjun.simlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/stocks")
    public String stocks(Model model) {
        model.addAttribute("user", null);
        model.addAttribute("stocks", List.of(
                new Stock(1L, "삼성전자", 65000),
                new Stock(2L, "현대차", 220000)
        ));
        return "stock_list";
    }

    public static class Stock {
        private Long id;
        private String name;
        private int currentPrice;

        public Stock(Long id, String name, int currentPrice) {
            this.id = id;
            this.name = name;
            this.currentPrice = currentPrice;
        }

        public Long getId() { return id; }
        public String getName() { return name; }
        public int getCurrentPrice() { return currentPrice; }
    }
}
