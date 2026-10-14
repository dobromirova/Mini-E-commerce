package ecommerce.Service.Impl;

import ecommerce.Model.Service.UserServiceModel;
import org.springframework.stereotype.Service;
import ecommerce.Service.UserService;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public void registerUser(UserServiceModel userServiceModel) {

    }

    @Override
    public UserServiceModel findById(Long id) {
        return null;
    }
}
