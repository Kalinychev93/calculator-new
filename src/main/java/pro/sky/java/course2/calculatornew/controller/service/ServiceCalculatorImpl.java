package pro.sky.java.course2.calculatornew.controller.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculatorImpl implements ServiceCalculator{

    @Override
    public String hello() {
        return "<h1 style=\"color: red\"> Добро пожаловать в калькулятор</h1>";
    }

    @Override
    public String plus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один из параметров";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один из параметров";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один из параметров";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один из параметров";
        } else if (num2 == 0) {
            return "На ноль делить нельзя, ты что!";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
