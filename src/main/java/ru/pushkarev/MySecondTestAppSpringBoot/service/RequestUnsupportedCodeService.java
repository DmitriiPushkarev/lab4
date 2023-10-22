package ru.pushkarev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.pushkarev.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;

@Service
public class RequestUnsupportedCodeService implements UnsupportedCodeService{
    @Override
    public void isValid(BindingResult bindingResult) throws UnsupportedCodeException {
        if(bindingResult.hasErrors() && bindingResult.getFieldError().getRejectedValue().equals("123")){
            throw new UnsupportedCodeException(bindingResult.getFieldError().toString());
        }
    }
}
