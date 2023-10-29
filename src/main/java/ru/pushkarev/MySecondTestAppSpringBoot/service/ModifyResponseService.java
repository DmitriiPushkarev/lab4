package ru.pushkarev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.pushkarev.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
