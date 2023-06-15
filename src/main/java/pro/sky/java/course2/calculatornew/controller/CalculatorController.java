package pro.sky.java.course2.calculatornew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculatornew.controller.service.ServiceCalculator;

@RestController
public class CalculatorController {

    private final ServiceCalculator serviceCalculator;

    public CalculatorController(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return serviceCalculator.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return serviceCalculator.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return serviceCalculator.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return serviceCalculator.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return serviceCalculator.divide(num1, num2);
    }
}
