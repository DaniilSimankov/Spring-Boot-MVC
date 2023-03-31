package ru.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dto.SignUpForm;
import ru.models.Account;
import ru.repositories.AccountsRepository;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final AccountsRepository accountsRepository;

    @Override
    public void signUp(SignUpForm form) {
        Account account = Account.builder()
                .email(form.getEmail().toLowerCase(Locale.ROOT))
                .fistName(form.getFirstName())
                .lastName(form.getLastName())
                .password(form.getPassword())
                .build();

        accountsRepository.save(account);
    }
}
