package dev.pedrohfreitas.whatsappapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pedrohfreitas.whatsappapi.models.MessageModel;

public interface MessageRepository extends JpaRepository<MessageModel, Long> {

}