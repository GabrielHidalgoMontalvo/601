package  {
	
	import flash.display.MovieClip;
	import flash.sampler.NewObjectSample;
	import flash.events.Event;
	
	public class setup extends MovieClip { //Contrato o firma
		
		//VARIABLES DE CLASE. Instancia de objetos.
		private var fondo_new: fondo = new fondo();
		private var piso_new: piso = new piso();
		static var protagonista_new: protagonista = new protagonista();
		private var antagonista_new: antagonista = new antagonista();
		
		static var puntos:Number=0;
		static var puntos_box_new: puntos_box = new puntos_box();
		
		public function setup() {
			// constructor code  
			addChild( fondo_new );
			addChild( piso_new);
			addChild( protagonista_new);
			addChild( antagonista_new);
			addChild( puntos_box_new);
			
			fondo_new.y=195;
			fondo_new.x=275;
			
			piso_new.y=385;
			piso_new.x=275;
			
			protagonista_new.y=312;
			protagonista_new.x=275;
			
			antagonista_new.y=50;
			antagonista_new.x=275;
			
			puntos_box_new.y=17;
			puntos_box_new.x=130;
			puntos_box_new.puntostxt.text= String(puntos);
			
			
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
				
		}
		
		public function actualiza_puntos(e:Event){
			puntos_box_new.puntostxt.text = String(puntos);
		}
	}
	
}
