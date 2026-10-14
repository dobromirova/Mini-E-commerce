package ecommerce.Service;

import ecommerce.Model.Service.UserServiceModel;

public interface UserService {

    void registerUser(UserServiceModel userServiceModel);
    UserServiceModel findById(Long id);

}
