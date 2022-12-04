package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import peaksoft.entities.Product;
import peaksoft.service.ProductServiceImpl;

@Controller
@RequiredArgsConstructor
public class ProductApi {

    private final ProductServiceImpl service;

    @RequestMapping("/")
    public String findAll(Model model) {
        model.addAttribute("allProduct", service.findAllProduct());
        return "/mainPage";
    }

    @RequestMapping("/new")
    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        return "/innerPage";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        service.saveProduct(product);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView updateProduct(@PathVariable("id") Long id) {
        ModelAndView view = new ModelAndView("edit_product");
        Product product = service.findByIdProduct(id);
        view.addObject("product", product);
        return view;
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id")Long id) {
        service.deleteByIdProduct(id);
        return "redirect:/";
    }
}
