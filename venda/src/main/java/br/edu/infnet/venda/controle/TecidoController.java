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

import br.edu.infnet.venda.model.negocio.Tecido;
import br.edu.infnet.venda.model.service.TecidoService;

@RestController
@RequestMapping("/api/tecido")
public class TecidoController {

	@Autowired
	private TecidoService service;
	
	@GetMapping
	public List<Tecido> obterLista() {
		return service.obterLista();
	}

	@RequestMapping("{id}")
	public Optional<Tecido> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir (@RequestBody Tecido tecido) {
		service.incluir(tecido);
	}
	
	@DeleteMapping("{id}")
	public void excluir (@PathVariable Integer id) {
		service.excluir(id);
	}
}
