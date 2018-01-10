package com.raptorplan.raptorplan.auth.validator;

import com.raptorplan.raptorplan.auth.model.UserEntity;
import com.raptorplan.raptorplan.auth.model.request.UserRequest;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Service
public class UserValidator {
    public void validate(UserRequest user, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length()<8 || user.getPassword().length()>32){
            errors.rejectValue("password","Size.userForm.password");
        }

        if(!user.getPassword().equals(user.getPasswordConfirm())){
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }
}
