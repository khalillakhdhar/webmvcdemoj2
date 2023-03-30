package com.jpa.democontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@GetMapping("/")
	public String Hello()
{
	return "hello spring <a href='doc'> voir documentation</a>";
}
@GetMapping("doc")
public String documentation()
{
return "<ul><li>Controllers</li><li>REST controllers</li></ul><br> <a href='../'>retour</a>";
}


}
