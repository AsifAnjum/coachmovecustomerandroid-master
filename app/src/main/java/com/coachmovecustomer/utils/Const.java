package com.coachmovecustomer.utils;

public class Const {
    //New URL live
//    public static final String SERVER_REMOTE_URL = "http://192.168.43.138:8008/";
//    public static final String SERVER_REMOTE_URL = "http://104.248.216.183:8008/";//live server
    public static final String SERVER_REMOTE_URL = "http://31.220.62.67:8080/";//live
    // server//update on 26/05/2020
//    public static final String SERVER_REMOTE_URL = "192.168.43.138:8008/";//local server

//    public static final String SERVER_IMAGE_URL = "http://104.248.216.183:8008/CoachMove/";
    public static final String SERVER_IMAGE_URL = "http://31.220.62.67:8080/CoachMove/";//update
    // on 26/05/2020
   /*//language live
    public static final String SERVER_REMOTE_URL = "http://192.168.2.85:8008/";
    public static final String SERVER_IMAGE_URL = "http://192.168.2.85:8008/CoachMove/";*/

    public static final String DISPLAY_MESSAGE_ACTION = "com.packagename.DISPLAY_MESSAGE";
    public static final int PLAY_SERVICES_RESOLUTION_REQUEST = 1234;
    /**
     * ******************************* App buy or Purchase Key *************************************
     */
    public static final int GALLERY_REQ = 1;
    public static final int CAMERA_REQ = 2;
    public static final int MULTI_IMAGES = 200;
    public static final String FIREBASE_TOKEN = "dev_token";
    public static final String FORGROUND = "forground_notification";
    public static final String USER_ID = "user_id";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String LANGUAGE = "language";
    public static final String LANG_CREATE_TIME = "lang_create_time";
    public static final String MODALITY = "selected_modality";
    public static final String FIRST_TIME_VISIT = "first_time_visit";

    /*---------------------- API CONSTANTS-----------------------------------------*/

    public static final String url = "CoachMove/api";
    public static final String LOGIN_API = url + "/customers/login";
    public static final String PROFILE_SIGN_UP = url + "/customers";
    public static final String FORGOT_API = url + "/forgotPassword";
    public static final String ADD_GET_CARD = url + "/customers/";
    public static final String GET_MODALITIES = url + "/modalities";
    public static final String DIET_API = url + "/customer/";
    public static final String FITNESS_API = ADD_GET_CARD + "fitnessLevel";
    public static final String NUTRITIONIST_PRICE_API = GET_MODALITIES + "/3";
    public static final String UPDATE_DIET_API = url + "/diets/";
    public static final String MESSAGE_USER = url + "/user/";
    public static final String MESSAGE_LIST_API = "/recent/messsages";
    public static final String BLOCK_USER = "/blockUser?";
    public static final String SEND_MESSAGE_API = url + "/messages";
    public static final String SCHEDULE_TERMS_API = url + "/customers/";
    public static final String LOGOUT_API = url + "/users/";
    public static final String URL_AboutUS = SERVER_REMOTE_URL + url + "/aboutus";
    public static final String URL_PrivacyPolicy = SERVER_IMAGE_URL + "privacy_policy.html";
    public static final String URL_TermAndCondition = SERVER_IMAGE_URL + "terms_and_conditions.html";
    public static final String USER_LIST_FOR_CHAT_API = url + "/admin/coachesById?id=";
    public static final String APPLY_PROMO_CODE = url + "/user/applyCoupon?";

    /*---------------------- NOTIFICATION CONSTANTS-----------------------------------------*/

    public static final String NOTIFICATION_TAG = "tag";
    public static final String SENDER_NAME = "senderName";
    public static String CHAT_NOTIFICATION = "Chat Message";
    //    public static String WORKOUT_NOTIFICATION = "Workout";
    public static String WORKOUT_NOTIFICATION = "Workout Canceled";
    public static String DIET_NOTIFICATION = "Diet";
    public static String WORKOUT_CANCELED = "Workout Canceled Due To Bad Weather";
}