package com.senai.isabella.Prjgame.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.isabella.Prjgame.entities.Jogo;
import com.senai.isabella.Prjgame.servicies.JogoService;

@RestController
@RequestMapping("/jogos")
public class JogoController {
	private final JogoService jogoService;
	
	@GetMapping("/home")
	public String paginaInicial() {
		return "index"; //Nome do seu arquivo HTML (sem extensão)
	}

	@Autowired
	public JogoController (JogoService jogoservice) {
		this.jogoService = jogoservice;
	}
	
	@PostMapping
	public Jogo createJogo(@RequestBody Jogo jogo) {
		return jogoService.saveJogo(jogo);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Jogo> getJogo(@PathVariable Long id) {
		Jogo jogo = jogoService.getJogoById(id);
		if(jogo != null) {
			return ResponseEntity.ok(jogo);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping
	public List<Jogo> getAllJogo() {
		return jogoService.getAllJogos();
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long Id) {
		jogoService.deleteJogo(Id);
	}
}
