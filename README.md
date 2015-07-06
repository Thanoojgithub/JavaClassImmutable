# JavaClassImmutable
Java Class Immutable




Immutable Objects are those objects whose state can not be changed once they are created, for example the String class is an immutable class. Immutable objects can not be modified so they are also thread safe in concurrent execution.

Features of immutable classes:

  simple to construct
  automatically thread safe
  good candidate for Map keys and Set as their internal state would not change while processing
  don't need implementation of clone as they always represent same state
  Keys to write immutable class:

  make sure class can not be overridden
  make all member variable private & final
  do not give their setter methods
  object reference should not be leaked during construction phase
  
----------------------------------------------------------------------------------------
output:
 Mon Jul 06 17:25:09 IST 2015
 Mon Jul 06 17:25:09 IST 2015

Exception in thread "main" java.lang.UnsupportedOperationException
	at java.util.Collections$UnmodifiableMap.put(Collections.java:1342)
	at com.corejava.CorejavaOne.main(CorejavaOne.java:20)
