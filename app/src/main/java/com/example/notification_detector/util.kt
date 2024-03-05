package com.example.notification_detector

object ApplicationPackageNames {
    const val WHATSAPP_PACK_NAME = "com.whatsapp"
    const val INSTAGRAM_PACK_NAME = "com.instagram.android"
}

/*
    These are the return codes we use in the method which intercepts
    the notifications, to decide whether we should do something or not
 */
object InterceptedNotificationCode {
    const val WHATSAPP_CODE = 2
    const val INSTAGRAM_CODE = 3
    const val OTHER_NOTIFICATIONS_CODE = 4 // We ignore all notification with code == 4
}