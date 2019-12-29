
public class Yt {

	public static void main(String[] args) {
		//Kanali
		Channel stipeMovies = new Channel();
		
		//Pretplatnici
		Subscriber sub1 = new Subscriber("Jhonny");
		Subscriber sub2 = new Subscriber("Marko");
		Subscriber sub3 = new Subscriber("Pero");
		Subscriber sub4 = new Subscriber("Dwight");
		Subscriber sub5 = new Subscriber("Izzy");
		Subscriber sub6 = new Subscriber("Ana");
		Subscriber sub7 = new Subscriber("Luke");
		
		//Subscribamo korisnike
		stipeMovies.subscribe(sub1);
		stipeMovies.subscribe(sub2);
		stipeMovies.subscribe(sub3);
		stipeMovies.subscribe(sub4);
		stipeMovies.subscribe(sub5);
		stipeMovies.subscribe(sub6);
		stipeMovies.subscribe(sub7);
		
		//Unsubscribeamo (Nece primati notifikacije)
		stipeMovies.unSubscribe(sub6);
		stipeMovies.unSubscribe(sub2);
		
		
		
		
		//Ko je subscribean na kanal dobit ce notifikaciju
		sub1.subscribeChannel(stipeMovies);
		sub2.subscribeChannel(stipeMovies);
		sub3.subscribeChannel(stipeMovies);
		sub4.subscribeChannel(stipeMovies);
		sub5.subscribeChannel(stipeMovies);
		sub6.subscribeChannel(stipeMovies);
		sub7.subscribeChannel(stipeMovies);
		
		
		
		//Uploadamo videa
		stipeMovies.upload(" Top 10 Movies!");
		
		System.out.println("-----------------------------------------------------");
		
		//Izgubili smo jos jednog subscribera
		stipeMovies.unSubscribe(sub7);
		
		//Novi upload
		stipeMovies.upload(" Best places in the world!");
		
		
		
		
		
		
	}

}
