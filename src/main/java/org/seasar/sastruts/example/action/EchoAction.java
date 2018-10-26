package org.seasar.sastruts.example.action;

import javax.annotation.Resource;

import org.seasar.sastruts.example.form.EchoForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class EchoAction {

	public String message;

	/** アクションフォーム */
	@Resource
	@ActionForm
	protected EchoForm echoForm;

	@Execute(validator=false)
	public String index() {
		this.message = "Hello, World!";
		return "input.jsp";
	}

	@Execute(validator=true, input="input.jsp")
	public String echo() {
		return "echo.jsp";
	}

}
