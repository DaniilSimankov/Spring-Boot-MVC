package ru.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.models.Account;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Account, Long> {
}
