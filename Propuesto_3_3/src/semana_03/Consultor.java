package semana_03;

public class Consultor {
	private int codigo,horas;
	private String nombre;
	private double tarifa;
	
	private static int cantidad;
	private static double sumaNeto;
	public static final double AFP;
	public static final double EPS;
	
	static {
		cantidad = 0;
		sumaNeto = 0;
		AFP = 0.10;
		EPS = 0.05;
	}

	public Consultor(int codigo, int horas, String nombre, double tarifa) {
		this.codigo = codigo;
		this.horas = horas;
		this.nombre = nombre;
		this.tarifa = tarifa;
		cantidad++;
		sumaNeto+=sueldoNeto();
	}
	public Consultor(int codigo, int horas, String nombre) {
		this(codigo,horas,nombre,65.0);
	}
	public Consultor() {
		this(333,30,"Juan");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Consultor.cantidad = cantidad;
	}

	public static double getSumaNeto() {
		return sumaNeto;
	}

	public static void setSumaNeto(double sumaNeto) {
		Consultor.sumaNeto = sumaNeto;
	}
	
	public double sueldoBruto() {
		return horas*tarifa;
	}
	public double descuentoAFP() {
		return sueldoBruto()*AFP;
	}
	public double descuentoEPS() {
		return sueldoBruto()*EPS;
	}
	public double sueldoNeto() {
		return sueldoBruto()-descuentoAFP()-descuentoEPS();
	}
	
}
