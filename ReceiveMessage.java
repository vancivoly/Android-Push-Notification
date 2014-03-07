public class ReceiveMessage extends GCMBaseIntentService{
	private static int count = 0;
	public GCMIntentService() {
		super(SENDER_ID);
	}

	@Override
	protected void onRegistered(Context arg0, String registrationId) {
		System.out.println("registered = "+registrationId);
	}

	@Override
	protected void onUnregistered(Context arg0, String arg1) {
		System.out.println("unregistered = "+arg1);
	}

	@Override
	protected void onMessage(Context context, Intent intent) {
        // Please customize!

		// This is how to get values from the push message (data)
        String message = intent.getStringExtra("message");
        //long timestamp = intent.getLongExtra("timestamp", -1);
        String msgType = intent.getStringExtra("msgType");

	    NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
	    Notification notification = new Notification(R.drawable.ic_launcher, "Push", System.currentTimeMillis());
	   
	    RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.notification);
	    contentView.setImageViewResource(R.id.imageView1, R.drawable.ic_launcher);
        contentView.setTextViewText(R.id.notification_title, "Push");
        contentView.setTextViewText(R.id.notification_text, message);
        String currentTime = DateFormat.getTimeInstance().format(Calendar.getInstance().getTime());
        contentView.setTextViewText(R.id.notification_time, currentTime);
        notification.contentView = contentView;
        
	    Intent notificationIntent = new Intent(context, MainActivity.class);

	    notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
	           Intent.FLAG_ACTIVITY_SINGLE_TOP);
	    PendingIntent pendingIntent = PendingIntent.getActivity(context, count, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
	    notification.contentIntent = pendingIntent;
	    notification.setLatestEventInfo(context, "Push", message, pendingIntent);
	    notification.number = count++;
	    notification.defaults |= Notification.DEFAULT_SOUND;
	    notification.defaults |= Notification.DEFAULT_VIBRATE;
	    notification.defaults |= Notification.DEFAULT_LIGHTS;
	    notification.flags |= Notification.FLAG_AUTO_CANCEL;
	    notificationManager.notify(count, notification);
			
	}

	@Override
	protected void onError(Context arg0, String errorId) {
		System.out.println("Received error: " + errorId);
	}

	@Override
	protected boolean onRecoverableError(Context context, String errorId) {
		return super.onRecoverableError(context, errorId);
	}

}
