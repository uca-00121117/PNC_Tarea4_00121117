	package com.uca.capas.domain;
	import javax.validation.constraints.Digits;
	import javax.validation.constraints.Min;
	import javax.validation.constraints.NotEmpty;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Pattern;
	import javax.validation.constraints.Size;

	 enum mss{
			mensaje ("");
		
			 private String mss;
			mss(String mss) {this.mss=mss;}
			public String getMss() {return mss;}
		}
	
	public class Producto {
		String Debe="";
		@Size(min=12, max=12, message = "El código debe contener 12 dígitos.")
		@NotEmpty(message = "Ingrese un código.")
		private String codigo;
		@Size(max=100, message = "El nombre debe contener menos de 100 caracteres.")
		@NotEmpty(message = "Ingrese un nombre.")
		private String nombre;
		@Size(max=100, message = "La marca debe contener menos de 100 caracteres.")
		@NotEmpty(message = "Ingrese una marca.")
		private String marca;
		@Size(max=100, message = "La descripción debe contener menos de 500 caracteres.")
		@NotEmpty(message = "Ingrese descripción.")
		private String descripcion;
		@Digits(fraction=0, integer = 10, message
				= "Solo puede ingresar numeros enteros en las existencias.")
		@Min(value=0, message = "Debe de haber por lo menos 0 existencias.")
		@NotEmpty(message="Debe llenar el campo de existencias.")
		private String existencias;
		@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$", message = "La fecha debe estar en formato dd/mm/aaaa")
		@NotEmpty(message = "Especifique una fecha de ingreso.")
		private String fechaIngreso;
		
		public Producto() {
			
		}
		
		public Producto(
				String codigo, 
				String nombre, 
				String marca, 
				String descripcion, 
				String existencias,
				String fechaIngreso) 
		{
			this.codigo = codigo;
			this.nombre = nombre;
			this.marca = marca;
			this.descripcion = descripcion;
			this.existencias = existencias;
			this.fechaIngreso = fechaIngreso;
		}
		
		public String getCodigo() {return codigo;}
		public void   setCodigo(String codigo) {this.codigo = codigo;}
		public String getNombre() {	return nombre;}
		public void   setNombre(String nombre) {this.nombre = nombre;}
		public String getMarca() {return marca;	}
		public void   setMarca(String marca) {this.marca = marca;}
		public String getDescripcion() {return descripcion;	}
		public void   setDescripcion(String descripcion) {this.descripcion = descripcion;	}
		public String getExistencias() {return existencias;	}
		public void   setExistencias(String existencias) {this.existencias = existencias;	}
		public String getFechaIngreso() {return fechaIngreso;}
		public void  setFechaIngreso(String fechaIngreso) {this.fechaIngreso = fechaIngreso;}

	}