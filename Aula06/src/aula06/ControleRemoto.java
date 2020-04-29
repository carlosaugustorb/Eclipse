package aula06;



public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligando;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligando = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigando() {
		return ligando;
	}

	private void setLigando(boolean ligando) {
		this.ligando = ligando;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	
	//Metódos abstratos
	
	@Override
	public void ligar() {
		this.setLigando(true);
		
	}

	@Override
	public void desligar() {
		this.setLigando(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("-----------MENU----------");
		System.out.println("Está ligado? " + getLigando());
		System.out.println("Está tocando? " + getVolume());
		System.out.print("Volume....: ");
		
		for (int i = 0; i < this.getVolume(); i+= 10) {
			System.out.print("|");
		}
		
		System.out.println();
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando.....");
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigando() == true) {
			this.setVolume(this.getVolume() + 5);
		} 
		
	}

	@Override
	public void menosVolume() {
		if (this.getLigando()) {
			this.setVolume(this.getVolume() - 5);
		} 
		
	}

	@Override
	public void ligarMudo() {
		if (this.getLigando() == true && this.getVolume() > 0) {
			this.setVolume(0);
		} 
		
	}

	@Override
	public void desligarMudo() {
		if (this.getVolume() == 0 && this.getLigando()) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if (!(this.getTocando()) && this.getLigando()) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (this.getLigando() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	
	
}
