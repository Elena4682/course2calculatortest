package pro.sky.course2calculatortest;

import org.springframework.stereotype.Component;


public interface Service {
    String text();
    String addition(int number1,int number2);
    String subtraction(int number1,int number2);
    String multiplication(int number1,int number2);
    String division(float number1,float number2);
}
