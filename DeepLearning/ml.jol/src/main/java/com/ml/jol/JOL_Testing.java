package com.ml.jol;

import java.math.BigDecimal;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import static java.lang.System.out;

/**
 * https://www.baeldung.com/java-memory-layout
 * https://www.baeldung.com/jvm-boolean-memory-layout
 * */

public class JOL_Testing {
    int x=90;
    long y=900;
    boolean bool=true;
    boolean bool1=false;
    boolean [] b=new boolean[6];
    
    BigDecimal bd=new BigDecimal("25625689789458585447585555574477447444474447441474447441474444744147744");

    public static void main(String[] args) {
	JOL_Testing jt=new JOL_Testing();
	out.println(VM.current().details());
	out.println(ClassLayout.parseClass(JOL_Testing.class).toPrintable());
	
	out.println("**********************");
	
	out.println(ClassLayout.parseInstance(jt.b).toPrintable());
	out.println("The identity hash code is " + System.identityHashCode(jt.b));
	
    }

}
