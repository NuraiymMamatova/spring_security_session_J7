//package peaksoft.api;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import peaksoft.service.PersonServiceImpl;
//
//@Controller
//@RequiredArgsConstructor
//public class PersonApi {
//
//    private final PersonServiceImpl service;
//
//    @RequestMapping("/allPersons")
//    public String findAll(Model model) {
//        model.addAttribute("allPerson", service.findAllPerson());
//        return "/person/allPersons";
//    }
//}
