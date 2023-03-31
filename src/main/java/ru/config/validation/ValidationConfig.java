package ru.config.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidationConfig {

//    @Bean // надо сделать @Override
//    public MessageCodesResolver getMessagesCodesResolver(){
//        DefaultMessageCodesResolver resolver = new DefaultMessageCodesResolver();
//        resolver.setMessageCodeFormatter(DefaultMessageCodesResolver.Format.POSTFIX_ERROR_CODE);
//        return resolver;
//    }

    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean(){
        return new LocalValidatorFactoryBean();
    }

}
