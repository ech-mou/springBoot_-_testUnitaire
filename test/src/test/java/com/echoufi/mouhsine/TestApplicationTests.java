package com.echoufi.mouhsine;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.echoufi.mouhsine.controller.ProduitController;
import com.echoufi.mouhsine.models.Produit;
import com.echoufi.mouhsine.repository.ProduitRepository;

@SpringBootTest
class TestApplicationTests {
	
	@Autowired
    private ProduitController controller;


	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	 @Autowired
	    ProduitRepository personneRepository;
	 
	 @Test
	 public void testCreate() {
		 Produit personne= new Produit("yassine1","moumen");
		 
//		 personne.setNom(" kadour");
//	     personne.setPrenom("maachi");
		 
//		 personneRepository.save(personne);
		 String result =controller.savePersonne(personne);
		 assertEquals(result, "kadour");
		 
		 
		 
		 
	 }
}
