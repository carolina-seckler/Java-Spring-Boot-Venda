package br.edu.infnet.venda.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.venda.model.negocio.Cartonagem;
import br.edu.infnet.venda.model.negocio.Hibrido;
import br.edu.infnet.venda.model.negocio.Produto;
import br.edu.infnet.venda.model.negocio.Tecido;
import br.edu.infnet.venda.model.repository.ICartonagemRepository;
import br.edu.infnet.venda.model.repository.IHibridoRepository;
import br.edu.infnet.venda.model.repository.IProdutoRepository;
import br.edu.infnet.venda.model.repository.ITecidoRepository;

@Service
public class ProdutoService {

	@Autowired
	IProdutoRepository repository;
	@Autowired
	ITecidoRepository tecidoRepository;
	@Autowired
	ICartonagemRepository cartonagemRepository;
	@Autowired
	IHibridoRepository hibridoRepository;
	
	public List<Produto> obterDisponiveis() {
		List<Produto> produtos = new ArrayList<Produto>();
		List<Tecido> tecidos = (List<Tecido>) tecidoRepository.findAvailable();
		List<Cartonagem> cartonagens = (List<Cartonagem>) cartonagemRepository.findAvailable();
		List<Hibrido> hibridos = (List<Hibrido>) hibridoRepository.findAvailable();
		produtos.addAll(tecidos);
		produtos.addAll(cartonagens);
		produtos.addAll(hibridos);
		return produtos;
	}
	
	public Optional<Produto> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void atualizar(Produto produto) {
		repository.save(produto);
	}
}
