package com.waw.persons;

import java.util.List;

import com.waw.accessories.Accessory;
import com.waw.activities.Activity;

public abstract class Person {
	
	private String name; 
	private int lifepoints; 
	private Activity activity; 
	private List<Accessory> accessories; 
	private Accessory current_accessory; 
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param lifepoints
	 * @param activity
	 * @param accessories
	 */
	public Person(String name, int lifepoints, Activity activity, List<Accessory> accessories) {
		super();
		this.name = name;
		this.lifepoints = lifepoints;
		this.activity = activity;
		this.accessories = accessories;
	}

	//Getters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the lifepoints
	 */
	public int getLifepoints() {
		return lifepoints;
	}

	/**
	 * @return the activity
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * @return the accessories
	 */
	public List<Accessory> getAccessories() {
		return accessories;
	}

	/**
	 * @return the current_accessory
	 */
	public Accessory getCurrent_accessory() {
		return current_accessory;
	}
	
	//Setters
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param lifepoints the lifepoints to set
	 */
	public void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(Activity activity) {
		
		if (checkActivityValidity(activity)) {
			
			this.activity = activity;
		}
		if (this.activity == null) {
			
			accessories.clear();
			this.current_accessory = null; //Suppression de current_accesssory
			System.gc();
		}

	}

	/**
	 * @param accessories the accessories to set
	 */
	public void setAccessories(List<Accessory> accessories) {
		
		//this.accessories = accessories;
		this.addAccessory((Accessory) accessories);	
	}

	/**
	 * @param current_accessory the current_accessory to set
	 */
	public void setCurrent_accessory(Accessory current_accessory) {
		//!!!!!!    Setteur à modifier    !!!!!!
		this.current_accessory = current_accessory;
	}
	
	//Méthodes
	
	public boolean checkActivityValidity(Activity activity) {
		
		return true;
	}
	
	public boolean checkAccessoryValidity(Accessory accessory) {
		
		return true;
	}
	
	public void addAccessory(Accessory accessory) {
		
		if (checkAccessoryValidity(accessory) && activity != null) {
			
			accessories.add(accessory);
			System.out.println("Votre accessoire a bien été ajouté à la liste !!");
			
		} else if (activity == null) {
			
			System.out.println("Renseigner une activité pour ajouter un accessoire !!");
			
		}
	}
}
	



