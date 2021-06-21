package com.echoufi.mouhsine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.echoufi.mouhsine.models.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
