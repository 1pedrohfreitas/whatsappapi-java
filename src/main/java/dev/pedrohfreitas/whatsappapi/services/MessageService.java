package dev.pedrohfreitas.whatsappapi.services;

import org.springframework.stereotype.Service;

import dev.pedrohfreitas.whatsappapi.models.MessageModel;
import dev.pedrohfreitas.whatsappapi.repositories.MessageRepository;

@Service
public class MessageService {
	
	private final MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public void insertMessage(MessageModel messageModel){
		messageRepository.save(messageModel);
	}

}