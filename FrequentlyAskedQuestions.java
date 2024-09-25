1) How did you implement security in your application ?
2) What are features of Java 17 ? sealed class 
3) Can we override static methods in Java ? No. 
4) Why String is immutable ? 
  String is often used as database passwords and usernames etc. So it needs to be immutable to prevent modification .
  It saves lot of space in string pool of heap by avoiding duplicate creation
  It can be safely used in multithreaded environments.
