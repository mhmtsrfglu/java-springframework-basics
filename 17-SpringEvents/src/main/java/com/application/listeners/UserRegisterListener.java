/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.application.events.RegisterUserEvent;
import com.application.model.User;


@Component
public class UserRegisterListener implements ApplicationListener<RegisterUserEvent> {


	
	@Override
	public void onApplicationEvent(RegisterUserEvent userEvent) {
		// TODO Auto-generated method stub
		
		User user = userEvent.getUser();
		System.out.println("Mail Gönderilecek kişi : " +user.getName());
		System.out.println("Mail Gönderilecek kişinin email adresi : " +user.getEmail());
		System.out.println(user);
		
		System.out.println("Mail Başlığı : "+ userEvent.getTitle());
		System.out.println("Mail içeriği : "+ userEvent.getContent());
		
		System.out.println("Mail gönderildi.");
	}

}
