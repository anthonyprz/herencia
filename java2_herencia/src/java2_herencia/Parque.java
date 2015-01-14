	
	public class Parque extends EspacioPublico {
	
		private int codigoParque;
		
		public Parque(int i, String n, String t, String d, String p, int m) {
			super(i, n, t, d, p, m);
			// TODO Auto-generated constructor stub
			
		}
		public Parque() {
			super();
		}
		public int getCodigoParque (){
			return this.codigoParque;
		}
		public void setCodigoParque (int codigoParque){
			this.codigoParque = codigoParque;
		}
}
