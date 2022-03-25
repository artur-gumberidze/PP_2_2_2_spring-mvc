package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping (value = "/cars")
    public String Hello (@RequestParam(value = "count", required = false) Integer count, Model model ){
        if (count == null) {
            model.addAttribute("transport", carService.getCar(0));
        } else {
            model.addAttribute("transport", carService.getCar(count));
        }

        return "cars";
    }

}
