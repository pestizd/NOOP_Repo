import java.util.ArrayList;

public class Channel implements Subject {
	//Kanal treba znati koliko subscribera ima
	ArrayList <Subscriber> subs = new ArrayList<>();
	//Svaki video mora imati naslov
	String title;
	
	/* (non-Javadoc)
	 * @see Subject#subscribe(Subscriber)
	 */
	@Override
	public void subscribe(Subscriber sub) {
		
		subs.add(sub);
		
	}
	/* (non-Javadoc)
	 * @see Subject#unSubscribe(Observer)
	 */
	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
		
	}//Daje do znanja svima da je uploadan video
	/* (non-Javadoc)
	 * @see Subject#notifySubscribers()
	 */
	@Override
	public void notifySubscribers() {
		
		for(Observer sub : subs) {
			
			sub.update();
			
		}
		
	}
	/* (non-Javadoc)
	 * @see Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title) {
		
		this.title = title;
		notifySubscribers();
		
	}
}
