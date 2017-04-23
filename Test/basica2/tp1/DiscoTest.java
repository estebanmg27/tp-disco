package basica2.tp1;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {
	
	@Test
	public void testParaSaberRadioInterior() {
		Disco miDisco = new Disco(5.0, 10.0);
		miDisco.setRadioInterior(5.0); 
		
		Double radioEsperado = 5.0;
		Assert.assertEquals(radioEsperado, miDisco.getRadioInterior(), 0.01);
	}
	
	@Test
	public void testParaSaberRadioExterior() {
		Disco miDisco = new Disco(10.0, 20.0);
		miDisco.setRadioExterior(20.0); 
		
		Double radioEsperado = 20.0;
		Assert.assertEquals(radioEsperado, miDisco.getRadioExterior(), 0.01);
	}
	
	 @Test
	 	public void testParaSaberElPerimetroInterior(){
		 Disco miDisco = new Disco(5.0, 10.0);
		 miDisco.setRadioInterior(5.0);
		 Double perimetroEsperado= 31.41;
		 Assert.assertEquals(perimetroEsperado, miDisco.obtenerPerimetroInterior(),0.1);
	 }
	 
	 @Test
	 	public void testParaSaberElPerimetroExterior(){
		 Disco miDisco = new Disco(10.0, 20.0);
		 miDisco.setRadioExterior(20.0);
		 Double perimetroEsperado= 125.66;
		 Assert.assertEquals(perimetroEsperado, miDisco.obtenerPerimetroInterior(),0.1);
	 }

	 @Test
	 
	 public void testParaSaberLaSuperficie(){
		 Disco miDisco= new Disco(5.0, 10.0);
		 miDisco.setRadioInterior(5.00);
		 miDisco.setRadioExterior(10.00);
		 Double superficieEsperada = 235.6;
		 Assert.assertEquals(superficieEsperada, miDisco.obtenerSuperficie(),0.1);
	 }	
}
