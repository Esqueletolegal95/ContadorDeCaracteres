package controller;

import static org.junit.jupiter.api.Assertions.*;
import application.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerTest {
	
	Controller controller = new Controller();

	@BeforeEach
	void antes() {
		controller = new Controller();
	}
	@Test
	void testTeclaPressionada() {
		controller.botaopressionado();
	}

}
