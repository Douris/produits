package com.balde.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balde.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
