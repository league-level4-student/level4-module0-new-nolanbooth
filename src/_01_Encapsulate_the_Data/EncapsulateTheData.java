package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;
	

	public void setItemsReceived(int itemsReceived) {
		if(itemsReceived < 0) {
			System.out.println("ya can't give negative items, idiot");
			this.itemsReceived = 0;
		}else {
		
		
		this.itemsReceived = itemsReceived;
		}
	}
	public void setDegreesTurned(double degreesTurned) {
		if(degreesTurned <0.0) {
			this.degreesTurned = 0;
		}if(degreesTurned > 360.0) {
			this.degreesTurned = 360.0;
		}else {
			this.degreesTurned = degreesTurned;
		}
	}
	
	public void setNomenclature(String nomenclature) {
		if(nomenclature.contentEquals("")) {
			this.nomenclature = " ";
		}else {
			this.nomenclature = nomenclature;
		}
	}public void setMemberObj(Object memberObj) {
		if(memberObj instanceof String) {
			this.memberObj = new Object();
		}else {
			this.memberObj = memberObj;
		}
	}
	
	//GETTERS//
	
	
	 int getItemsReceived() {
		return itemsReceived;
	}
	 double getDegreesTurned() {
		 return degreesTurned;
	 }
	 String getNomenclature() {
		 return nomenclature;
	 }
	 Object getMemberObj() {
		 return memberObj;
	 }
	
	
	
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;

}
