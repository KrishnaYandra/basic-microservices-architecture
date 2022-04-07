package com.krishna.user.service.entity;

import java.security.KeyStore.PrivateKeyEntry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTemplateVO {
	
	private User user;
	private Department department;

}
