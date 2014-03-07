public class AndroidPushNotification{

  /*regId is the one which received in OnRegistered() in Android Project. We need to pass regId to the server and 
  save it in DB. So that we can retrieve the regID here based on the user*/
	public void androidPushNotification(String regId) throws IOException {
		Sender sender = new Sender(API_KEY);
		Message message = new Message.Builder()
		.addData("message", "Test Push")
		.build();
		Result result = sender.send(message, regId, 5);
		System.out.println("message : "+message);
		System.out.println("result : "+result.toString());
	}
	
}
