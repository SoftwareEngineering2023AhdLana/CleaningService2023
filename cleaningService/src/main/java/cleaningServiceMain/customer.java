package cleaningServiceMain;



import java.util.ArrayList;

public class customer {


//add time work  ( time startb ,time end )
		private String name;
		private String username;
		private String password;
		private String phoneNumber;
		private String address;
		private String email;
		private String avilableWorker;
		private Boolean logState=false;
		public static ArrayList<request> requests=new ArrayList<request>();
		public static ArrayList<request> requestsDone=new ArrayList<request>();
		public static ArrayList<request> requestsStill=new ArrayList<request>();

		public customer() 
		{
			
		}
		public customer(String s1,String s2,String s3,String s4,String s5,String s6)// user name,pass,name,address,phone
		{
			this.username=s1;
			this.password=s2;
			this.name=s3;
			this.address=s4;
			this.phoneNumber=s5;
			this.email = s6;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getUsername() 
		{
			return username;
		}
		public void setUsername(String username)
		{
			this.username = username;
		}
		public String getPassword() 
		{
			return password;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
		public Boolean getLogState() {
			return logState;
		}
		public void setLogState(Boolean logStat) {
			this.logState = logStat;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public ArrayList<request> getRequests() {
			return requests;
		}
		public void setRequests(ArrayList<request> Requests) {
			requests = Requests;
		}
	
		public void addToCustomerRequest(request r)
		{
			requests.add(r);
		}
		public void removeRequest(int i)
		{
			this.requests.remove(i);
		}
		public void addToCustomerRequestDone(request r)
		{
			requestsDone.add(r);
		}
		public static void resorRequestStill()
		{
			requestsDone.removeAll(requestsDone);
			requestsStill.removeAll(requestsStill);
			for(int i=0;i<requests.size();i++)
			{
				if(requests.get(i).getStatus()==1)
					requestsDone.add(requests.get(i));
				else
					requestsStill.add(requests.get(i));
			}
		}
		
		 @Override
		    public String toString() {
		        return "customer{" +
		                "username =" + username +
		                ", name ='" + name + '\'' +
		                ", phone Number ='" + phoneNumber + '\'' +
		                ", address ='" + address + '\'' +
		                '}';
		}
		public String getAvilableWorker() {
			return avilableWorker;
		}
		public void setAvilableWorker(String avilableWorker) {
			this.avilableWorker = avilableWorker;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		

}

