package ecommerce.Web;

import ecommerce.Model.Binding.UserRegisterBindingModel;
import ecommerce.Service.UserService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }


    // TODO: explanations
    @ModelAttribute
    public UserRegisterBindingModel userRegisterBindingModel() {
        return new UserRegisterBindingModel();
    }



    @GetMapping("/register")
    public String register(Model model){
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

//    @PostMapping("/register")
//    public String doRegister(@Valid UserRegisterBindingModel userRegisterBindingModel,
//                             BindingResult bindingResult, RedirectAttributes redirectAttributes) {
//
//
//        if (bindingResult.hasErrors() || !userRegisterBindingModel
//                .getPassword().equals(userRegisterBindingModel.getConfirmPassword())) {
//            redirectAttributes
//                    .addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel)
//                    .addFlashAttribute("org.springframework.validation.BindingResult.userRegisterBindingModel",
//                            bindingResult);
//
//            return "redirect:register";
//        }
//
////        userService.registerUser(modelMapper.map(userRegisterBindingModel, UserServiceModel.class));
//
//        return "redirect:login";
//    }


//    @GetMapping("/profile/{id}")
//    private String profile(@PathVariable Long id, Model model) {
//
//        model.addAttribute("user",
//                modelMapper.map(userService.findById(id), UserViewModel.class));
//
//        return "view-profile"; TODO: VIEW ORDERS
//    }




}
