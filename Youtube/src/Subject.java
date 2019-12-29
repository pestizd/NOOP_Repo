
public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);//Daje do znanja svima da je uploadan video//

	void notifySubscribers();

	void upload(String title);

}