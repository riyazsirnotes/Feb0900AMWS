package apr7th;

public class Clock {
	
	private int hr,min,sec;
	
	//setter
	public void setClock(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
	}
	
	//getter 
	
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		
		System.out.format("%02d:%02d:%02d",hr,min,sec);
	}
	
	

}
