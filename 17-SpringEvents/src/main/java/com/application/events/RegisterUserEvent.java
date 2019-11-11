/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.events;

import org.springframework.context.ApplicationEvent;

import com.application.model.User;

public class RegisterUserEvent extends ApplicationEvent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	private String title;
	private String content;

	public RegisterUserEvent(User user, String title, String content) {
		super(user);
		this.title = title;
		this.content = content;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
