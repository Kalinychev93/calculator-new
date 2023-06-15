package pro.sky.java.course2.calculatornew.controller.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculatorImpl implements ServiceCalculator{

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя, ты что!";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
