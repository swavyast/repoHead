package com.ml.creational.abstractFactory1;

public class AbstractPatternDriver {

    public static void main(String[] args) {
	
	Human<Female> human=CreateHuman.getHuman("Female");
	System.out.println(human);
	FemaleChild fc=(FemaleChild) human.create(4);
	YoungGirl yg=(YoungGirl) human.create(12);
	GrownWoman gw=(GrownWoman) human.create(36);
	OldWoman ow=(OldWoman) human.create(59);
	
	System.out.println(fc);
	System.out.println(yg);
	System.out.println(gw);
	System.out.println(ow);
	
	System.out.println("\n_____________________________\n\n");
	Human<Male> human0=CreateHuman.getHuman("Male");
	System.out.println(human0);
	MaleChild mc=(MaleChild) human0.create(5);
	YoungGuy yb=(YoungGuy) human0.create(10);
	GrownMan gm=(GrownMan) human0.create(23);
	OldMan om=(OldMan) human0.create(56);
	
	System.out.println(mc);
	System.out.println(yb);
	System.out.println(gm);
	System.out.println(om);
	
	System.out.println("\n___________________________________\n");
	
	FemaleChild fch=new FemaleChild();
	System.out.println(fch);
    }

}
