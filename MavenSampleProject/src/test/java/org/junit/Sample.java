package org.junit;

public class Sample {
	@BeforeClass
	public static void beforeClass() {
	System.out.println("before class");

}
	@AfterClass
	public static void afterClass() {
	System.out.println("After class");}
	
	@Before
	public void BeforeMethod() {
	
	System.out.println("before class");}
	
    @After
	public void afterMethod() {
	System.out.println("after method");}
	
	@Test
	public void test1() {
	System.out.println("test1");}

	@Test
	public void test2() {
	System.out.println("test2");}
}

