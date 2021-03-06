package com.dmens.pokeno.Card;

import com.dmens.pokeno.Ability.Ability;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class TrainerCard extends Card {

    private static final Logger LOG = LogManager.getLogger(TrainerCard.class);

	private String mCategory;
	private ArrayList<Ability> mAbilities;

	public TrainerCard(String name, String category, ArrayList<Ability> abilities)
	{
		super(name);
		this.mCategory = category;
		this.mAbilities = abilities;
	}

	public TrainerCard(String description){}

	public String toString()
	{
		return String.format("|TRAINER CARD|\n|%s|\n||%s||\n|%s|\n", this.getName(), this.mCategory, this.mAbilities);
	}
}
