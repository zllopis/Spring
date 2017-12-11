package com.ipiecoles.formation.tpspring;

import com.ipiecoles.formation.tpspring.model.Film;
import com.ipiecoles.formation.tpspring.repository.FilmRepository;
import com.ipiecoles.formation.tpspring.repository.UserRepository;
import com.ipiecoles.formation.tpspring.service.FilmService;
import com.ipiecoles.formation.tpspring.service.RecommandationService;

public class SansSpring {
	public static void main(String... args) {
		
		RecommandationService recommandationService = new RecommandationService();//to complete
		FilmService filmService = new FilmService();
		UserRepository user = new  UserRepository();
		FilmRepository filmRepository = new FilmRepository();
		
		recommandationService.setUserRepository(user);
		recommandationService.setFilmService(filmService);
		filmService.setFilmRepository(filmRepository);
		Film recommandation = recommandationService.getRecommandation(1L);
		
		
		
		System.out.println(recommandation);
	}
}
