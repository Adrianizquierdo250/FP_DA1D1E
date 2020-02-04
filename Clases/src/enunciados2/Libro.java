package enunciados2;

public class Libro {
		String titulo;
		String autor;
		int numEjemplares;
		int numEjemplaresPrestados;
		
		public Libro() {}
		
		public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.numEjemplares = numEjemplares;
			this.numEjemplaresPrestados = numEjemplaresPrestados;
		}

		
		public void setTitulo(String titulo) {
		this.titulo=titulo;
		}
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setAutor(String autor) {
			this.autor=autor;
		}
		
		public String getAutor() {
			return autor;
		}
		
		public void setNumEjemplares(int numEjemplares) {
			this.numEjemplares=numEjemplares;
		}
		
		public int getNumEjemplares() {
			return numEjemplares;
		}
		
		public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
			this.numEjemplaresPrestados=numEjemplaresPrestados;
		}
		
		public int getNumEjemplaresPrestados() {
			return numEjemplaresPrestados;
		}
		
		public  boolean prestamo() {
			if (numEjemplares>numEjemplaresPrestados) {
				numEjemplaresPrestados++;
				return true;
				
			}else {
				return false;
			}
		}
		
		public boolean devolucion() {
			if (numEjemplaresPrestados>0) {
				numEjemplaresPrestados--;
				return true;
				
			}return false;
		}
		
		
		@Override
		public String toString() {
			return " El libro " +titulo+" es del autor "+autor+" tiene "+numEjemplares+ " ejemplares "+" y de ellos  "+numEjemplaresPrestados+ " han sido prestados";
		}
		
		
		
		

}
