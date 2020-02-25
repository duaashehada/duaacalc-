package calculatertojenkin1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class calculatetojenkin {

	@Test
	void testsum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		int a = 10 ; 
		int b = 20 ; 
		Calculater calc = new Calculater(); 
		
		int result = calc.add(a, b);
		
		  Assert.assertTrue(result > 0 ); 
	}

}
