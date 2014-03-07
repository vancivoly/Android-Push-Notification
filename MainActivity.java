/*This is the Main Activity of your Android Project which registers the device to GCM server*/

public class MainActivity extends Activity  {

  @Override
	protected void onCreate(Bundle savedInstanceState) {
	
	  ....
	  
	  GCMRegistrar.checkDevice(this);
    GCMRegistrar.checkManifest(this);
	  
	  GCMRegistrar.register(this, SENDER_ID);//SENDER_ID is the Project Number which you'd created from https://code.google.com/apis/console/ 
	  ....
	}

}
