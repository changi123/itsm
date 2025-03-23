package hong.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class HomeController {
	@GetMapping("/")
	public String wordAddPage(HttpSession session) {
		

        return "index"; 
	}

	
}
