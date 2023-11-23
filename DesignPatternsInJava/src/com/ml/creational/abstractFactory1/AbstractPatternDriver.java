package com.ml.creational.abstractFactory1;

public class AbstractPatternDriver {

    public static void main(String[] args) {

	Human<Female> human = CreateHuman.getHuman("Female");
	System.out.println(human+"\n");
	System.out.println("is human"+human+" an Instance of Human Class : "+Human.class.isInstance(human));
	System.out.println("is human"+human+" an Instance of Female Class : "+Female.class.isInstance(human));
	System.out.println("is human"+human+" an Instance of Object Class : "+Object.class.isInstance(human));
	System.out.println("is human"+human+" an Instance of Male Class : "+Male.class.isInstance(human));
	Female fc = human.create(4);
	System.out.println("\n__________FemaleChild Object Details________\n");
	System.out.println("is fc"+fc+" an Instance of Human Class : "+Human.class.isInstance(fc));
	System.out.println("is fc"+fc+" an Instance of Female Class : "+Female.class.isInstance(fc));
	System.out.println("is fc"+fc+" an Instance of FemaleChild Class : "+FemaleChild.class.isInstance(fc));
	System.out.println("is fc"+fc+" an Instance of Object Class : "+Object.class.isInstance(fc));
	System.out.println("is fc"+fc+" an Instance of Male Class : "+Male.class.isInstance(fc)+"\n");
	Female yg = human.create(12);
	Female gw = human.create(36);
	Female ow = human.create(59);

	System.out.println(fc);
	System.out.println(yg);
	System.out.println(gw);
	System.out.println(ow);

	System.out.println("\n_____________________________\n\n");
	Human<Male> human0 = CreateHuman.getHuman("Male");
	System.out.println(human0+"\n");
	System.out.println("Printing details of reference variable human0 : "+"\n");
	System.out.println("is human0"+human0+" an Instance of Human Class : "+Human.class.isInstance(human0));
	System.out.println("is human0"+human0+" an Instance of Female Class : "+Female.class.isInstance(human0));
	System.out.println("is human0"+human0+" an Instance of Object Class : "+Object.class.isInstance(human0));
	System.out.println("is human0"+human0+" an Instance of Male Class : "+Male.class.isInstance(human0)+"\n\n");
	Male mc = human0.create(5);
	Male yb = human0.create(10);
	Male gm = human0.create(23);
	Male om = human0.create(56);

	System.out.println(mc);
	System.out.println(yb);
	System.out.println(gm);
	System.out.println(om);

	System.out.println("\n___________________________________\n");

	FemaleChild fch = new FemaleChild();
	System.out.println(fch);
    }

}
