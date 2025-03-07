package com.techelevator.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonDetail {
    private int id;
    private int apiId;
    private String name;
    @JsonProperty("base_experience")
    private int baseExperience;
    private int height;
    private int weight;
    @JsonProperty("sprites")
    private Sprite sprite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    @Override
    public String toString() {
        return "PokemonDetail{" +
                "id=" + id +
                ", apiId=" + apiId +
                ", name='" + name + '\'' +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", weight=" + weight +
                ", sprite=" + sprite +
                '}';
    }
}
