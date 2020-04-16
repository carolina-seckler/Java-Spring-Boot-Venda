package br.edu.infnet.venda.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.venda.model.negocio.Produto;
import br.edu.infnet.venda.model.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public List<Produto> obterDisponiveis() {
		return service.obterDisponiveis();
	}
	
	@PostMapping
	public void atualizar (@RequestBody Produto produto) {
		service.atualizar(produto);
	}
}
