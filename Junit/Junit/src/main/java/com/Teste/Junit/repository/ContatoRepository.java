package com.Teste.Junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Teste.Junit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
