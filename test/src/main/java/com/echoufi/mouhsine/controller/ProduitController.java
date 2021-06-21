package com.echoufi.mouhsine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.echoufi.mouhsine.models.Produit;
import com.echoufi.mouhsine.repository.ProduitRepository;

@RestController
public class ProduitController {
	
	@Autowired
	ProduitRepository produitRepository;
	
	@GetMapping("/produit")
	public List<Produit> findAll(){
		return this.produitRepository.findAll();
		
	}
	
	@GetMapping("/produit/{id}")
	public Produit findById(@PathVariable Long id) throws Exception {
		return this.produitRepository.findById(id).orElseThrow(()->new Exception("Personne n'existe pas"));
	}
	
	@PostMapping("/produit")
	public String savePersonne(@RequestBody Produit produit) {
		 this.produitRepository.save(produit);
		 return "kadour";
	}
	
	@PutMapping("/produit/{id}")
	Produit updateOrSavePersonne(@RequestBody Produit produit,@PathVariable Long id) {
		return this.produitRepository.findById(id).map(x->{
			x.setNom(produit.getNom());
			x.setCategoris(produit.getCategoris());
			return produitRepository.save(x);
		}). 	orElseGet(()->{
			produit.setId(id);
			return produitRepository.save(produit);
		});
	}
	
	@DeleteMapping("/produit/{id}")
	void deletePersonne(@PathVariable Long id) {
		this.produitRepository.deleteById(id);
	}

}
