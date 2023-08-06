package com.codewithashu.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class UserDto {
 
	private int id;
	
	@NotEmpty
	@Size(min = 4, message= "Username Must be minimum 4 Character")
	private String name;
	@NotEmpty(message= "Email Address is not valid")
	@Email
	private String email;
	@NotEmpty
	@Size(min =3, max=10,message="Password must be Minimum of 3 char and maximum 10 char")
	
	private String password;
	@NotEmpty
	private String about;
	
	
}
