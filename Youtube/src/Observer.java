
public interface Observer {

	//Subscriber treba znati kad je video uploadan
	void update();

	void subscribeChannel(Channel ch);

}