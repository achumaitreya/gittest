
public class Foo {
	public String getBar(String i)throws AlsCustomException
  {
    if (i.length()!=10)
    {
      // throw our custom exception
      throw new AlsCustomException("Anything but zero ...");
    }
    else
    {
      return "Thanks";
    }
  }

public static void main(String[] args)
  {
    // create a new foo
    Foo foo = new Foo();
    
    try
    {
      // intentionally throw our custom exception by
      // calling getBar with a zero
      String bar = foo.getBar("1234567890");
    }
    catch (AlsCustomException e)
    {
      // print the stack trace
      e.printStackTrace();
    }
}
}