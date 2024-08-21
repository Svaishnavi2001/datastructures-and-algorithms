package com.practice;


public class Tablet {
	
	private int tabletId;
	private String name;
	private boolean isAvailable;
	private float price;
	private  String manufacturer;
	private  long mgContent;
	
	public Tablet() {}
	
	public Tablet(int tabletId, String name, boolean isAvailable, float price, String manufacturer, long mgContent) {
		super();
		this.tabletId = tabletId;
		this.name = name;
		this.isAvailable = isAvailable;
		this.price = price;
		this.manufacturer = manufacturer;
		this.mgContent = mgContent;
	}
	
	public int getTabletId() {
		return tabletId;
	}
	public String getName() {
		return name;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public float getPrice() {
		return price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public long getMgContent() {
		return mgContent;
	}
	public void setTabletId(int tabletId) {
		this.tabletId = tabletId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setMgContent(long mgContent) {
		this.mgContent = mgContent;
	}

	@Override
	public String toString() {
		return "Tablet [tabletId=" + tabletId + ", name=" + name + ", isAvailable=" + isAvailable + ", price=" + price
				+ ", manufacturer=" + manufacturer + ", mgContent=" + mgContent + "]";
	


	}
}
