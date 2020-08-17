package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
@Before(order=1)
public void initialize() {
	
	System.out.println("from before hooks from order 1");
	
}

@Before(order=0)
public void setting_up() {
	
	System.out.println("from before hooks order 0");
	
}
@After
public void tear_down() {
	
	System.out.println("tearing down");
}

}
