
public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
        System.out.println("Oyun Eklendi :"+game.getName());		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi :"+game.getName());		
		
	}

	@Override
	public void guncelle(Game game) {
		System.out.println("Oyun G�ncellendi :"+game.getName());		
		
	}
	
	public void sales(Game game,Campaign campaign,Player player) {
	
		
		System.out.println(game.getName()+"Oyun "+player.getName()+" Adl� Oyuncuya Sat�ld� "+"'"+campaign.getName()+"'"+" Kampanys� Kullan�l�yor");
	}
	public void sales(Game game,Player player) {
		System.out.println(game.getName()+"Oyun "+player.getName()+" Adl� Oyuncuya Sat�ld� Kampanya Kullan�lmamd�");
	}
	
	
}
