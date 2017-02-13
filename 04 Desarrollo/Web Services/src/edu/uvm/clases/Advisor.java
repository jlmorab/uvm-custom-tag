package edu.uvm.clases;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Advisor extends SimpleTagSupport {
	
	private String user;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("Hola " + user + "<br/>");
		getJspContext().getOut().write("La recomendacion de la pelicula es: " + getAdvice());
	}
	
	protected String getAdvice() {
		String[] adviceString = {"Grand Hotel Budapest","La Gran Muralla","La La Land"};
		int random = (int) (Math.random() * adviceString.length);
		return adviceString[random];
	}
	
}
