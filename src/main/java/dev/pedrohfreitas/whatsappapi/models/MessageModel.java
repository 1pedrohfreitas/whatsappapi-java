package dev.pedrohfreitas.whatsappapi.models;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dev.pedrohfreitas.whatsappapi.enums.MessageDestinationType;
import dev.pedrohfreitas.whatsappapi.enums.MessageStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "message")
public class MessageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "fromNumber", length = 50)
	private String fromNumber;
	
	@Column(name = "toNumber", length = 50)
	private String toNumber;
	
	@Column(name = "text", length = 250)
	private String text;
	
	@Builder.Default
	@Column(name = "message_destination_type", length = 250)
	@Enumerated(EnumType.STRING)
	private MessageDestinationType messageDestinationType = MessageDestinationType.PRIVATE;
	
	@Builder.Default
	@Column(name = "message_status", length = 250)
	@Enumerated(EnumType.STRING)
	private MessageStatus messageStatus = MessageStatus.PENDING;
	
	@CreationTimestamp
	@Column(name = "created", nullable = false)
	private Timestamp created;

	@JsonIgnore
	@Column(name = "created_by")
	private Long createdBy;

	@JsonIgnore
	@UpdateTimestamp
	@Column(name = "updated", nullable = false)
	private Timestamp updated;

	@JsonIgnore
	@Column(name = "updated_by")
	private Long updatedBy;
}
