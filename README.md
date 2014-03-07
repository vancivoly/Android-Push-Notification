Android-Push-Notification
=========================

This is the document on how to implement Push notification on Android devices using Google Cloud Messaging(GCM).

Configure Manifest file 
-----------------------

Include the following permissions in the Manifest file

<!-- Permission to receive GCM messages -->
    <permission
        android:name="com.vancivoly.pushnotif.permission.C2D_MESSAGE"
        android:protectionLevel="signature" />

    <uses-permission android:name="com.vancivoly.pushnotif.permission.C2D_MESSAGE" />
<!-- App receives GCM messages -->
    <uses-permission android:name="com.google.android.c2dm.permission.RECEIVE" />
    
    
