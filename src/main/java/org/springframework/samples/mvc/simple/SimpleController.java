package org.springframework.samples.mvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller ��ͨ��<context:component-scan/>ɨ����Ӧ����� ����POJO
//�ͿɳƳ�Ϊ�ܴ���HTTP����Ŀ�����
@Controller
public class SimpleController {

	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return "Hello world!";
	}

}
