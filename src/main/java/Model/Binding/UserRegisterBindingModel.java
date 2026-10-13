package Model.Binding;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterBindingModel {

    private String username;
    private String email;
    private String password;
    private String confirmPassword;



}
