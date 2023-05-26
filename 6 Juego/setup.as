package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip { //Contrato o firma
		
		//VARIABLES DE CLASE
		private var fondo_new: fondo = new fondo();
		private var piso_new: piso = new piso();
		private var protagonista_new: protagonista = new protagonista();
		private var bala_new: bala = new bala();
		private var antagonista_new: antagonista = new antagonista();
		
		public function setup() {
			// constructor code  
			addChild( fondo_new );
			addChild( piso_new);
			addChild( protagonista_new);
			addChild( bala_new);
			addChild( antagonista_new);
			
			fondo_new.y=195;
			fondo_new.x=275;
			
			piso_new.y=385;
			piso_new.x=275;
			
			protagonista_new.y=312;
			protagonista_new.x=275;
			
			antagonista_new.y=50;
			antagonista_new.x=275;
				
		}
	}
	
}
