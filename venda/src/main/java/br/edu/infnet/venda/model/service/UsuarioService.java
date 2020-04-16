package br.edu.infnet.venda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.venda.model.negocio.Usuario;
import br.edu.infnet.venda.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository repository;
	
	public List<Usuario> obterLista() {
		return (List<Usuario>) repository.findAll();
	}
	
	public Optional<Usuario> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Usuario usuario) {
		repository.save(usuario);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
