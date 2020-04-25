package com.cg.product.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.product.entity.Product;

@Repository
@Transactional
public class ProductImpl implements ProductRepo {

	@PersistenceContext(unitName = "SpringJPA")
	private EntityManager em;

	public void saveProduct(Product product) {
		em.persist(product);
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAll() {
		return em.createQuery("from Product").getResultList();
	}

}
