package com.ml.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonDriver {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
	IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException,
	ClassNotFoundException, CloneNotSupportedException, NoSuchFieldException {
		BreakSingleton instance1 = BreakSingleton.getInstance();
		BreakSingleton instance2 = null;
		Constructor<?>[] constructor = BreakSingleton.class.getDeclaredConstructors();
		for(Constructor<?> c:constructor) {
			c.setAccessible(true); 	//allowing private constructor accessible outside the class by changing it's visibility.
			instance2 = (BreakSingleton) c.newInstance();
		}
		System.out.println(instance1.hashCode()+" : instance1.hashcode()");
		System.out.println(instance2.hashCode()+" : instance2.hashcode()");
		
		//Breaking singleton pattern using Serialization
		
		BreakSingletonUsingSerializableInterface ins1 = BreakSingletonUsingSerializableInterface.getInstance();
		BreakSingletonUsingSerializableInterface ins2 = null;
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("file.txt"));
		os.writeObject(ins1);
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("file.txt"));
		ins2 = (BreakSingletonUsingSerializableInterface) is.readObject();
		System.out.println(ins1.hashCode()+" : ins1.hashcode()");
		System.out.println(ins2.hashCode()+" : ins2.hashcode()");
		
		
		//Breaking Singleton Pattern Using Clonable
		
		BreakingSingletonImplementingClonableInterface inst1 = BreakingSingletonImplementingClonableInterface.getInstance();
		BreakingSingletonImplementingClonableInterface inst2 = (BreakingSingletonImplementingClonableInterface) inst1.clone();
		System.out.println(inst1.hashCode()+": inst1.hashcode()");
		System.out.println(inst2.hashCode()+" : inst2.hashcode()");
		System.err.println("-----------------------------------------------------------------");
		//Non-Breakable Enum Singleton
		System.out.println("Safest Way Of Designing Singleton Pattern");
		NonBreakableEnumSingleton instance_one = NonBreakableEnumSingleton.getInstance();
		NonBreakableEnumSingleton instance_two = null;
		//Using Serialization
		ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("file1.txt"));
		os1.writeObject(instance_one);
		ObjectInputStream is1 = new ObjectInputStream(new FileInputStream("file1.txt"));
		instance_two = (NonBreakableEnumSingleton) is1.readObject();
		System.out.println(instance_one.hashCode()+" : instance_one.hashcode()");
		System.out.println(instance_two.hashCode()+" : instance_two.hashcode()");
		//Using Reflection
		Field field = NonBreakableEnumSingleton.class.getDeclaredField("INSTANCE");
		field.setAccessible(true);
		instance_two = (NonBreakableEnumSingleton) field.get(null);
		System.out.println(instance_one.hashCode()+" : instance_one.hashcode()");
		System.out.println(instance_two.hashCode()+" : instance_two.hashcode()");
		
	}

}
