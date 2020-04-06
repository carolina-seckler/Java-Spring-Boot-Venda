package br.edu.infnet.venda.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.venda.model.negocio.Cartonagem;
import br.edu.infnet.venda.model.service.CartonagemService;

@RestController
@RequestMapping("/api/cartonagem")
public class CartonagemController {

	@Autowired
	private CartonagemService service;
	
	@GetMapping
	public List<Cartonagem> obterLista() {
		return service.obterLista();
	}

	@RequestMapping("{id}")
	public Optional<Cartonagem> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir (@RequestBody Cartonagem cartonagem) {
		service.incluir(cartonagem);
	}
	
	@DeleteMapping("{id}")
	public void excluir (@PathVariable Integer id) {
		service.excluir(id);
	}
}
