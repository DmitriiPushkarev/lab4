package ru.pushkarev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.pushkarev.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;

@Service
public interface UnsupportedCodeService {
    void isValid(BindingResult bindingResult) throws UnsupportedCodeException;
}