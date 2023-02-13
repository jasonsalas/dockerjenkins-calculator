package com.jasonsalas.dockerjenkinscalculator;
import org.springframework.beans.factory.annotation.AutoWired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DockerjenkinsCalculatorController {
    @AutoWired
    private DockerjenkinsCalculator calculator;

    @RequestMapping("/sum")
    String sum(@RequestMapping("a") Integer a, @RequestMapping("b") Integer b) {
        return String.valueOf(calculator.sum(a,b));
    }
}
