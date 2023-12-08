package com.ml.creational.abstractFactory.interfaces;

import com.ml.creational.abstractFactory.enums.Mode;
import com.ml.creational.abstractFactory.enums.Presence;

public interface AbstractFactory<T> {
   public T create(Mode mode, Presence presence);
}
