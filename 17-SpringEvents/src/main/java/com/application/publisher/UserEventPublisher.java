/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.application.events.RegisterUserEvent;
import com.application.model.User;

@Component
public class UserEventPublisher {
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void userRegister() {
		String title = "Kayıt Onayı";
		String content = "Kaydınızı tamamlamak için tıklayınız";
		
		User user = new User("Mehmet Şerefoğlu","memet.serefoglu@gmail.com","123456");
		
		RegisterUserEvent event = new RegisterUserEvent(user, title, content);
		this.eventPublisher.publishEvent(event);
	}
}
