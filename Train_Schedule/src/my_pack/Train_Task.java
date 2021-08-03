package my_pack;

public class Train_Task {
	private int trainno;
	private String traincode;
	private String station;
	private String arrival;
	private String departure;
	
	public Train_Task(int trainno, String traincode, String station, String arrival, String departure) {
		this.trainno = trainno;
		this.traincode = traincode;
		this.station = station;
		this.arrival = arrival;
		this.departure = departure;
	}
	public void printStatement() {
		
		System.out.printf("%d %1s %17s %8s %11s\n", trainno,traincode,station,arrival,departure);

	}
	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");
		System.out.println("-----------------------------------------------");
		System.out.println("# code    station           Arr.       Dep.");
		System.out.println("-----------------------------------------------");
		Train_Task[] t = {
				new Train_Task(1,"YPR","Yasvantpur Jn","11:00","23:40"),
				new Train_Task(2,"GTL","Guntakal Jn","03:45","03:50"),
				new Train_Task(3,"YPR","Sekandrabad Jn","08:55","9:00"),
				new Train_Task(4,"YPR","Balharshah Jn","13:30","13:35"),
				new Train_Task(5,"YPR","HabibGanj Jn","21:20","23:40"),
				new Train_Task(6,"YPR","Jhansi Jn","01:15","23:40")
				};
		for (Train_Task t1 : t) {
			t1.printStatement();
		}
	}
			
	}

