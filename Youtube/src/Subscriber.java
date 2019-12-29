
public class Subscriber implements Observer {

	private String name;
	private Channel channel = new Channel();
	
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	//Subscriber treba znati kad je video uploadan
	/* (non-Javadoc)
	 * @see Observer#update()
	 */
	@Override
	public void update() {
		System.out.println(name +" new video uploaded:" + channel.title);
		
	}
	/* (non-Javadoc)
	 * @see Observer#subscribeChannel(Channel)
	 */
	@Override
	public void subscribeChannel(Channel ch) {
		
		channel = ch;
		
	}
}
