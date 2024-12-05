package com.balde.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.balde.produits.entities.Produit;
import com.balde.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	public ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("HP", 800.0, new Date());
		produitRepository.save(prod);
	}
	
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);
		System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduits() {
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNom() {
		List<Produit> prods = produitRepository.findByNomProduit("HP");
		
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNomContains() {
		List<Produit> prods = produitRepository.findByNomProduitContains("P");
		
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNomPrix() {
		List<Produit> prods = produitRepository.findByNomPrix("HP", 800.0);
		
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
}
