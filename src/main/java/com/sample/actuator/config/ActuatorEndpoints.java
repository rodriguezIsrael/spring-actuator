package com.sample.actuator.config;

import java.time.LocalDateTime;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Configuration;

/**
 * Endpoint creado para ser utilizado con actuator, en este caso solo es un
 * ejemplo que te entrega la fecha y hora actual
 * 
 * @author isivroes
 *
 */
@Configuration
@Endpoint(id = "time")
public class ActuatorEndpoints {

	@ReadOperation
	public LocalDateTime getTime() {

		return LocalDateTime.now();

	}

}
