package kuziv.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sum")
public class FormController {
    @RequestMapping(method = RequestMethod.GET)
    public String showCalculationForm() {
        return "form";
    }

    @RequestMapping(value = "/{a}/{b}", method = RequestMethod.GET)
    public String processUrlCalculation(@PathVariable String a, @PathVariable String b, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int valueA = Integer.parseInt(a);
        int valueB = Integer.parseInt(b);
        model.addAttribute("sum", valueA + valueB);
        return "form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processFormCalculation(Sum sum, Errors errors) {
        if (errors.hasErrors())
            return "form";

        return "redirect:/sum/" + sum.getA() + "/" + sum.getB();
    }
}
