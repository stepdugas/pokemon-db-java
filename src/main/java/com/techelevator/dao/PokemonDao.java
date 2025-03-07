package com.techelevator.dao;

import com.techelevator.models.PokemonDetail;

import java.util.List;

public interface PokemonDao {

    // abstract methods -> no bodies

    PokemonDetail saveFavorites(PokemonDetail detail, int userId);

    List<PokemonDetail> getAllFavorites(int userId);

}
