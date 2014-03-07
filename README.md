Android-Push-Notification
=========================

This is the document on how to implement Push notification on Android devices using Google Cloud Messaging(GCM).

Create an Project number and API key for an Android App on Google Developers Console
------------------------------------------------------------------------------------

1. Open URL  https://code.google.com/apis/console/  and login.
2. Click 'Create Project' button. Note that Project ID is unique. So be relevant on creating one.
3. The created project can be found under list of projects.
4. Click the created Project and note down the Project Number which will be used as SENDER_ID by the Mobile Client.
5. To enable Push notification for this particular project, click "APIs & auth" on the left pane. Enable "Google Cloud Message for Android".
6. Click on "Credentials" in the left pane and Click "CREATE NEW KEY".
7. Then select "Browser Key" and click "Create".
8. Once created, the API key will be created and note it down since its required in Server side to push the notification.


Inclusion of jar files 
-----------------------

1. Include gcm.jar into Android project.
2. Include gcm-server.jar into Server.


Configure Manifest file 
-----------------------

Refer Manifest.xml
    
    
Register device to GCM server  
-----------------------------

Refer MainActivity.java

Pushing notification from the server
------------------------------------

Refer ServerPush.java


Receive the message and delegating for view  
-------------------------------------------

Refer ReceiveMessage.java
