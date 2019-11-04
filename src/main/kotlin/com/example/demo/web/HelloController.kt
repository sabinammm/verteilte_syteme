package com.example.demo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    /*application.properties nutzen:

    @Value("$(custom.welcome.message")
    customWelcomMessage
     */

    @GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =  "Hello, $name"

/*	Objekt zurück in Java geschrieben:

	@GetMapping("/user/u")
	public User getUserU() {
		return new User();
	}

	@GetMapping("/user/s")
	public String getUserS() {
		final User s = new User();
		return s.toString();
	}

	@PostMapping...

	Jetzt das ganze in Kotlin:

	@GetMapping("/user/u")
	fun getUserU():User {
		return User()
	}

	@GetMapping("/user/s")
	fun getUserS():String {
		val s = User()
		return s.toString()
	}
*/

}