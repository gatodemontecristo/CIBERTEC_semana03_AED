package semana_03;

public class Balon {
	private String marca;
	private double peso_gram,pre_libra;
	private double diamentro,precio;
	
	private static int cantidad;
	private static double suma_importe;
	public static final double PI;
	public static final double DESC;
	
	static {
		PI= 3.1416;
		DESC = 0.05;
		cantidad = 0;
		suma_importe = 0;	
	}

	public Balon(String marca, double peso_gram, double pre_libra, double diamentro, double precio) {
		this.marca = marca;
		this.peso_gram = peso_gram;
		this.pre_libra = pre_libra;
		this.diamentro = diamentro;
		this.precio = precio;
		cantidad++;
		suma_importe+=importePagar();
	}
	public Balon(String marca, double peso_gram, double pre_libra) {
		this(marca,peso_gram,pre_libra,18.5,100.0);
	}
	public Balon() {
		this("Adidas",1.5,4.8);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso_gram() {
		return peso_gram;
	}

	public void setPeso_gram(double peso_gram) {
		this.peso_gram = peso_gram;
	}

	public double getPre_libra() {
		return pre_libra;
	}

	public void setPre_libra(double pre_libra) {
		this.pre_libra = pre_libra;
	}

	public double getDiamentro() {
		return diamentro;
	}

	public void setDiamentro(double diamentro) {
		this.diamentro = diamentro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Balon.cantidad = cantidad;
	}

	public static double getSuma_importe() {
		return suma_importe;
	}

	public static void setSuma_importe(double suma_importe) {
		Balon.suma_importe = suma_importe;
	}
	public double radio(){
		return diamentro/2;
		}
	public double volumen(){
		return 4*PI*radio()*radio()*radio()/3;
		}
	public double descuento() {
		return precio*DESC;
	}
	public double importePagar() {
		return precio-descuento();
	}
	
	
}
