package com.practice;

import java.util.ArrayList;
import java.util.List;

public class TabletProblems {


	public static void main(String[] args) {

		//Method call getAllTablets
		//System.out.println(getAllTablets());
		

		//Method call getTabletByID
		
		Tablet res = getTabletByID(2222);
		System.out.println(res);

		//Find tablets my name
		Tablet res1=getTabletByName("vicks");
		System.out.println(res1);

		//Find tablets above 50mg
		Tablet res2 = getTabletBymgContent(50);
		System.out.println(res2);

		Tablet res3=getTabletByAvailability(false);
		System.out.println(res3);

	}
    
	private static Tablet getTabletByAvailability(boolean b) {

		List<Tablet> tablets=getAllTablets();

		//Tablet tablet=new Tablet();

		for(Tablet t: tablets) {
			if(t.isAvailable()==b) {
				
				return t;
			}
		}
		return null;
	}


	private static Tablet getTabletBymgContent(int mgContent) {

		List<Tablet> tablets2=getAllTablets();

		//Tablet tablet=new Tablet();

		for(Tablet t: tablets2) {
			if(t.getMgContent()>= mgContent) {

				return t;
			}
		}
		return null; 
	}


	private static Tablet getTabletByName(String name) {

		List<Tablet> tablets1= getAllTablets();

		//Tablet tablet=new Tablet();

		for(Tablet t: tablets1) {
			if(t.getName()== name)

				return t;
		}

		return null;


	}
	private static Tablet getTabletByID(int id) {

		List<Tablet> tablets = getAllTablets();

		//Tablet tablet = new Tablet();

		for(Tablet t: tablets) {
			if( t.getTabletId()== id) {

				return  t;
			}
		}

		return null;

	}

	public static List<Tablet> getAllTablets(){

		Tablet tablet1 = new Tablet();
		tablet1.setTabletId(1111);
		tablet1.setName("Dolo");
		tablet1.setAvailable(false);
		tablet1.setPrice(500.0f);
		tablet1.setManufacturer("Dr Reddy");
		tablet1.setMgContent(50);

		Tablet tablet2=new Tablet();
		tablet2.setTabletId(2222);
		tablet2.setName("paracetamal");
		tablet2.setAvailable(true);
		tablet2.setPrice(5000.0f);
		tablet2.setManufacturer("Johnson");
		tablet2.setMgContent(100);
		

		Tablet tablet3 = new Tablet();
		tablet3.setTabletId(3333);
		tablet3.setName("vicks");
		tablet3.setAvailable(false);
		tablet3.setPrice(1000.0f);
		tablet3.setManufacturer("appllo");
		tablet3.setMgContent(200);

		List<Tablet> tabletList=new ArrayList<>();
		tabletList.add(tablet1);
		tabletList.add(tablet2);
		tabletList.add(tablet3);


		return tabletList;

	}






}
