package org.digam.comments.entity;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class SeedData {

	@PersistenceContext
	private EntityManager em;

	@PostConstruct
	public void init() {
		// Dummy data to begin with
		Comment comment1 = new Comment(1L, "commt1 test ", 1L, 1L);
		em.persist(comment1);

		Comment comment2 = new Comment(2L, "commt2 test ", 2L, 1L);
		em.persist(comment2);

		Comment comment3 = new Comment(3L, "commt3 test ", 1L, 1L);
		em.persist(comment3);

	}
}