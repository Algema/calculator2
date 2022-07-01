package pro.sky.java.course2.calculator2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class firstController {


    @GetMapping
    public String sayWelcome (){
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping (path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2 ) {
        return calculatorService.sum(num1,num2);
    }

    @GetMapping (path = "/minus")
    public String minus (@RequestParam int num1,@RequestParam int num2) {
        return calculatorService.minus(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam int num1,@RequestParam int num2) {
        return  calculatorService.multiply(num1,num2);
    }

    @GetMapping (path = "/divide")
    public String divide (@RequestParam int num1,@RequestParam int num2) {
        return calculatorService.divide(num1,num2);
    }

}
