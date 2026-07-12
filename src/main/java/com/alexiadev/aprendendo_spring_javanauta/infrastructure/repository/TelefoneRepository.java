package com.alexiadev.aprendendo_spring_javanauta.infrastructure.repository;

import com.alexiadev.aprendendo_spring_javanauta.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
