package ru.kuper.trickyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kuper.trickyshop.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
