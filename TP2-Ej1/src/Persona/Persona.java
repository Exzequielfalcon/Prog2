package Persona;

import java.time.LocalDate;
import java.util.Date;


public class Persona {
		private String nombre="N";
		private String apellido="N";
		private int edad;
		private Date fecha; 
		private int dni;
		private char sexo='f';
		private double peso=1;
		private double altura=1;
		
		public Persona(String nombre, String apellido, int edad, Date fecha, int dni, char sexo, double peso,
				double altura) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.fecha = fecha;
			this.dni = dni;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}

		public Persona(String apellido, int edad, Date fecha, int dni, char sexo, double peso, double altura) {
			this.apellido = apellido;
			this.edad = edad;
			this.fecha = fecha;
			this.dni = dni;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}

		public Persona(int dni) {
			this.dni = dni;
		}

		public Persona(String nombre, int dni) {
			this.nombre = nombre;
			this.dni = dni;
		}

		public Persona(String nombre, String apellido, int dni) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
		}

		public Persona(String nombre, String apellido, int edad, int dni) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.dni = dni;
		}

		public Persona(String nombre, String apellido, int edad, Date fecha, int dni) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.fecha = fecha;
			this.dni = dni;
		}

		public Persona(String nombre, String apellido, int edad, Date fecha, int dni, char sexo) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.fecha = fecha;
			this.dni = dni;
			this.sexo = sexo;
		}

		public Persona(String nombre, String apellido, int edad, Date fecha, int dni, char sexo, double peso) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.fecha = fecha;
			this.dni = dni;
			this.sexo = sexo;
			this.peso = peso;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		@SuppressWarnings("deprecation")
		public int getEdad() {
			
			int diff = LocalDate.now().getYear()- this.fecha.getYear();
			if ((LocalDate.now().getDayOfMonth() < this.fecha.getMonth() )|| 
					((LocalDate.now().getDayOfMonth()== this.fecha.getMonth()) && (LocalDate.now().getDayOfMonth() > this.fecha.getDate()))) {
				    diff--;
				    }
			return diff;
		}
		public double CorporalMass() {
			double x=this.peso/Math.pow(this.altura, 2);
			return x;
		}
		
		
		public void OnShape() {
			if (this.CorporalMass()>10) {
				
			}
		}
		
		public void Cumple() {
			if ((this.fecha.getYear()==(LocalDate.now().getYear()))&&(this.fecha.getDate()==(LocalDate.now().getDayOfMonth()))&& (this.fecha.getMonth()==(LocalDate.now().getMonthValue()))) {
				System.out.println("Es tu cumpleaños!");
			}
		}
		
		public void EsMayor() {
			
		}
		
		

		
		
		
		
		
		
	}
