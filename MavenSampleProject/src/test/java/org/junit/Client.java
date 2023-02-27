package org.junit;

import org.testing.annotations.Ignore;
import org.testing.annotations.Test;



public class Client {
        @Ignore
		@Test
		public void  test1() {

	    }
		@Test
		public void test2() {
			
		}
		@Test(invocationCount=5)
		public void test3() {
			
		}
	}






