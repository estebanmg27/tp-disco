package basica2.tp1;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	
	public Disco (Double radioInterior, Double radioExterior)
	{
		this.setRadioInterior(radioInterior);
		this.setRadioExterior(radioExterior);
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	
	public Double getRadioExterior() {
		return radioExterior;
	}

	
	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	public Double obtenerPerimetroInterior(){
		Double perimetroInterior;
		perimetroInterior = 2 * 3.141592 * getRadioInterior();
		return perimetroInterior;
	}
	
	public Double obtenerPerimetroExterior(){
		Double perimetroExterior;
		perimetroExterior = 2 * 3.141592 * getRadioExterior();
		return perimetroExterior;
	}
	
	public Double obtenerSuperficie() {
		Double superficie;
		Double superficieInterior;
		Double superficieExterior;
		superficieInterior = Math.PI * Math.pow(getRadioInterior(), 2);
		superficieExterior = Math.PI * Math.pow(getRadioExterior(), 2);
		superficie = superficieInterior + superficieExterior;
		return superficie;
	}

}
