package dev.pedrohfreitas.whatsappapi.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.pedrohfreitas.whatsappapi.dtos.ResponseDTO;
import dev.pedrohfreitas.whatsappapi.models.MessageModel;
import dev.pedrohfreitas.whatsappapi.services.MessageService;

@RestController
@RequestMapping(value = "api/message", produces = { MediaType.APPLICATION_JSON_VALUE })
public class MessageController {

	private final MessageService messageService;
	
	MessageController(MessageService messageService){
		this.messageService = messageService;
	}
	
	@PostMapping(path = "", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResponseDTO<String>> post(@RequestBody MessageModel body) {
        messageService.insertMessage(body);
        return new ResponseDTO<String>().created("OK");
    }
}
