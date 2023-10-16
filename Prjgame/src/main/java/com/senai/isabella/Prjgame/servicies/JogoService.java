package com.senai.isabella.Prjgame.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.isabella.Prjgame.entities.Jogo;
import com.senai.isabella.Prjgame.repositories.JogoRepository;

@Service
public class JogoService {
	private final JogoRepository jogorepository;
	
	@Autowired
	public JogoService(JogoRepository jogorepository) {
		this.jogorepository = jogorepository;
	}
	
	public Jogo saveJogo(Jogo jogo) {
		return jogorepository.save(jogo);
	}
	
	public Jogo getJogoById(Long Id) {
		return jogorepository.findById(Id).orElse(null);
	}
	
	public Jogo getProdutoById(long Id) {
		return jogorepository.findById(Id).orElse(null);
	}
	
	public List<Jogo>getAllJogos(){
		return jogorepository.findAll();
	}
	public void deleteJogo(Long id) {
		jogorepository.deleteById(id);
	}
}

