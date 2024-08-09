package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	@RequestMapping("/Mateus")
	public @ResponseBody String greetingFulano() {
		return "Hello, Mateus!";
	}
	
	/********
	 * 
	 * Modificação original
	 * 
	 *******/
	
	/**@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
		.string(containsString("Hello, World")));
	}

**/
}
