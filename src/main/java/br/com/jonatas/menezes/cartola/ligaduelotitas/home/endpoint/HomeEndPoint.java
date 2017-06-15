package br.com.jonatas.menezes.cartola.ligaduelotitas.home.endpoint;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/")
public class HomeEndPoint {

	public HomeEndPoint() {
	}

	@RequestMapping(value = "/aaa", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public String home() {

		return "";
		/*return "<html>"
				+ "<head></head>"
				+ "<body>"
				+ "<div><h2>LIGA DUELO DE TITÃS</h2></div>"
				+ "<img src=\"https://lh3.googleusercontent.com/Noe1covQ4elZioCXLECLjqbIZxJOrlodtCiAFU49mwJtDoNyoq5y7XRCUEIkhz04lMCWyWSk-jHGb3kSdLnjctDzE8x4AlzjzlwxYNPSLXqIZLnJzix1VUOFNE3fXUr2m8xESIuq9yha_KsXAtQI_tIrOwqVahSse3QhbUGon7QfmU4KXUixyYVLtUwVd-JLHvbodvFQ_mNp4KaF_J1dIa1qFUqaZlmaemL6ovcuOCkin8br9tc84xGRYIcDI3Dk8kghVwZtmbQiQ33_zJCn-EoDJYLi_o6VLR1pAiJ8CLPjawz8YlOhzZk1HgIIgd8nSarsgd2cf1XOAR9jjnQ3g8OguXNW7p-ePIQi2YxPAxbdNINvZkbP75KD3HKORtzk6HQ1ZzKYGpDiHGIsH5CmtLtrx6ctxhBO2pKXIxHVVp4CCGWA1uKq0Ci4o0uNaYaE6IzALu_ALjTzJ87T3CFEwJBW7xEkN6aNOl4eJBHobOlKT94s3ROCXt3K04fvGrgmPRh-DKtghF4bOJaXngMcGn3K51BSWmkXuK-e1sl8wCHxZY_zbK5hgg6kNpzxGR2HPm-5TldbfE6O4ESajYUyuw5WPo8akwb3mvA8bDdukZGEJwEGJRYq_A=w713-h546-no\" alt=\"GUSTAVO DA CU\" style=\"width:304px;height:228px;\">"
				+ ""
				+ "</body>"
				+ "</html>";*/
		// http://webdevacademy.com.br/tutoriais/bootstrap-3-como-comecar/
		
		// http://labs.bluesoft.com.br/spring-boot-e-angularjs/
		
		// Rapid prototyping with Spring Boot and AngularJS
		// https://github.com/g00glen00b/ng-spring-boot
	}

}
