package br.com.jonatas.menezes.cartola.ligaduelotitas.definicoes.endpoint;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonatas.menezes.cartola.ligaduelotitas.definicoes.service.TesteService;

@RestController
@RequestMapping(value = "/api/liga")
public class TesteEndpoint {
  private final Logger log = Logger.getLogger(getClass());

  private TesteService testeService;
  
  @Autowired
  public TesteEndpoint(TesteService testeService) {
    this.testeService = testeService;
  }

  @RequestMapping(value = "/definicoes/valorInscricao", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Integer getValorIncricao() {

    Integer valorInscricaoLiga = testeService.getValorInscricaoLiga(); 
    
    log.info("flow=getValorIncricao; " + " valor: " + valorInscricaoLiga);
    
    return valorInscricaoLiga;
  }

  
}
