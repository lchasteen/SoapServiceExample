package com.partnersoft.v5.soap.service.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partnersoft.v5.soap.service.example.endpoint.SoapServiceEndpoint;

/**
 * {@link RestController} for rest endpoints.
 * <br><br>
 * @author Lane Chasteen
 */
@RestController
public class IndexController {
	//-- logging --//
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);

	//-- properties --//
	private static final String TITLE = "Fake Accounting System";
	private static final String SUB_TITLE = "Supported Methods";
	//-- constructors --//

	@GetMapping("/")
	public String greeting() {
		log.info("Building get methods paged...");
		StringBuilder b = new StringBuilder();
		b.append("<html>")
			.append("<head></head>")
			.append("<body>")
			.append("<h1>")
			.append(TITLE)
			.append("</h1>")
			.append("<h4>")
			.append(SUB_TITLE)
			.append("</h4>")
			.append("<ul>");
			for (String s : SoapServiceEndpoint.getSupportedMethodsList()) {
				b.append("<li>")
				.append(s)
				.append("</li>");
			}
			b.append("</ul>")
			.append("</body>")
			.append("</html>");
		
		return b.toString();
	}

	// TODO Add code for HTML report.

}
