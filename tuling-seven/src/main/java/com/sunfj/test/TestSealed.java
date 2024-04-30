package com.sunfj.test;

public sealed class TestSealed permits  A,B{

}
non-sealed class A extends TestSealed {

}
final class B extends TestSealed{

}
class C extends A{

}