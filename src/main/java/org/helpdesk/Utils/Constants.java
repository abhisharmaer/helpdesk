package org.helpdesk.Utils;

import java.util.Arrays;
import java.util.List;

public interface Constants
{

    String ENTRY = "ENTRY";
    String ERROR = "ERROR";
    String UN_PROCESSED = "UN_PROCESSED";
    String IN_PROGRESS = "IN_PROGRESS";
    String RETRYABLE = "RETRYABLE";
    String FINISHED = "SUCCESS";
    String ERROR_MSGS_DELIMITER = "|";
    String REQ_VALIDATION_FAILED = "REQ_VALIDATION_FAILED";
    
    int TRIMMED_STACK_TRACE_SIZE = 1024;

    String FAIL = "FAIL";
    String SUCCESS = "SUCCESS";
    String INVALID_TOKEN = "INVALID_TOKEN";
    //String USER_ACCESS_LEVEL_CODE="FORBIDDEN";
    String UNAUTHORIZED_USER="UNAUTHORIZED_USER";
    String INVALID_SERIAL_NUMBER = "INVALID_SERIAL_NUMBER";
    String ERROR_VALIDATING = "ERROR_VALIDATING";
    String REQUEST_NOT_FOUND = "REQUEST_NOT_FOUND";
    String NO_CONTRACT_DETAILS = "NO_CONTRACT_DETAILS";
    String SERVICE_INVOCATION_EXCEPTION = "SERVICE_INVOCATION_EXCEPTION";
    String ACCESS_LEVEL_NOT_FOUND = "ACCESS_LEVEL_NOT_FOUND";
    String EXCEPTION = "EXCEPTION";
    String ATA_INVOCATION_ERROR = "ATA_INVOCATION_ERROR";
    String DEVICE_ID_NULL = "NA";
    String NOHW_EOL_DAY_SPRT_AVAILABLE = "NOHW_EOL_DAY_SPRT_AVAILABLE";
    String SS_REQ_EMPTY = "SV_REQ_EMPTY";
    String SS_REQ_VAL_SEVERITY_MISSING = "SV_REQ_VAL_SEVERITY_MISSING";
    String SS_REQ_VAL_CUSTOMER_NAME_MISSING = "SV_REQ_VAL_CUSTOMER_NAME_MISSING";
    String SS_REQ_VAL_CUSTOMER_CONTRACT_MISSING = "SV_REQ_VAL_CUSTOMER_CONTRACT_MISSING";
    String SS_REQ_VAL_LOGGEDINUSER_MISSING = "SV_REQ_VAL_LOGGEDINUSER_MISSING";
    String SV_CONTRACT_LOCATION_INFO_MISSING="SV_CONTRACT_LOCATION_INFO_MISSING";
    String SS_REQ_VAL_SR_NUMBER_MISSING = "SV_REQ_VAL_SR_NUMBER_MISSING";
    String SS_REQ_VAL_SR_NOTE_TITLE_MISSING = "SV_REQ_VAL_SR_NOTE_TITLE_MISSING";
    String SS_REQ_VAL_SR_NOTE_DETAIL_MISSING = "SV_REQ_VAL_SR_NOTE_DETAIL_MISSING";
    String SV_ERROR_PARSING_JSON_RESPONSE = "SV_ERROR_PARSING_JSON_RESPONSE";
    String SV_REQ_EMPTY = "SV_REQ_EMPTY";
    String SV_CASENOTES_ADDED_RESP_HAS_INCORRECT_SRNUMBER = "SV_CASENOTES_ADDED_RESP_HAS_INCORRECT_SRNUMBER";
    String XXCTS_SRM_SASI_PERM_ERR = "XXCTS_SRM_SASI_PERM_ERR";
    String SV_UNABLE_FETCH_LOCATION = "SV_UNABLE_FETCH_LOCATION";
    String SV_NO_SR_DETAILS = "SV_NO_SR_DETAILS";
    String SV_NO_DEVICE_INV_DETAILS="SV_NO_DEVICE_INV_DETAILS";
    String SV_NO_CONTRACT_DETAILS = "SV_NO_CONTRACT_DETAILS";
    String SV_SERIAL_NUMBER_MISSING="SV_SERIAL_NUMBER_MISSING";
    String SV_PRODUCT_ID_MISSING="SV_PRODUCT_ID_MISSING";
    String SV_NO_DEV_DETAILS = "SV_NO_DEV_DETAILS";
    String SV_MISSING_CONTRACT_FOR_SERIALNUMBER = "SV_MISSING_CONTRACT_FOR_SERIALNUMBER";
    String SV_MISSING_CCOID_SR = "SV_MISSING_CCOID_SR";
    String SV_ERROR_FETCHING_SR = "SV_ERROR_FETCHING_SR";
    String SV_NOTIF_REQ_INVALID = "SV_NOTIF_REQ_INVALID";
    String SV_NOTIF_FAILED_REGISTER = "SV_NOTIF_FAILED_REGISTER";
    String SV_NOTIF_FAILED_REGISTER_DEVICETYPE_TOKEN_MISSING = "SV_NOTIF_FAILED_REGISTER_DEVICETYPE_TOKEN_MISSING";
    String SV_NOTIF_FAILED_REGISTER_CCOID_MISSING = "SV_NOTIF_FAILED_REGISTER_CCOID_MISSING";
    String SV_NOTIF_FAILED_2UNREGISTER="SV_NOTIF_FAILED_2UNREGISTER";
    String SV_NOTIF_SR_LIST_EMPTY = "SV_NOTIF_SR_LIST_EMPTY";
    String SV_NOTIF_FAILED_2DELETE_NOTIFICATIONS = "SV_NOTIF_FAILED_2DELETE_NOTIFICATIONS";
    String SV_NOTIF_MISSING_SUBSCRIPTIONS = "SV_NOTIF_MISSING_SUBSCRIPTIONS";
    String SV_NOTIF_UNKNOWN_SUBSCRIBER = "SV_NOTIF_UNKNOWN_SUBSCRIBER";
    String SV_NOTIF_PUSH_URAS_FAILED ="SV_NOTIF_PUSH_URAS_FAILED";
    String SV_NOTIF_FAILED_TO_SET_PENDING_STATUS = "SV_NOTIF_FAILED_TO_SET_PENDING_STATUS";
    String SV_NOTIF_NO_ACTIVE_SUBSCRIPTIONS = "SV_NOTIF_NO_ACTIVE_SUBSCRIPTIONS";
    String NO_RECORDS_FOUND = "NO_RECORDS_FOUND";
    String USER_NOT_ENTITLED="USER_NOT_ENTITLED";
    String NOT_A_SNTC_USER="NOT_A_SNTC_USER";
    
    String DELETED = "DELETED";
    
    String NOTIFICATION_STATUS_DB = "Registered in DB";    
    String NOTIFICATION_STATUS_BACKEND = "Registered with  Backend";
    String SUBSCRIBERS_BY_SR_QUERY = "SUBSCRIBERS_BY_SR_QUERY";
    String NEW = "New";
    String ROS = "Restoration of Service";
    List<String> SASI_SR_OPEN_STATUS_LIST = Arrays.asList(NEW,ROS);
    String CLOSED = "Closed";
    List<String> SASI_SR_CLOSE_STATUS_LIST = Arrays.asList(CLOSED);
    
    String ANDROID = "Android";
    String IOS = "IOS";
    List<String> DEVICE_TYPES = Arrays.asList(ANDROID,IOS);
    
    String ALL_STATUS_FLAG_TRUE = "T";
    String ALL_STATUS_FLAG_FALSE = "F";
    String SASI_SR_DATE_FORMAT = "dd-MMM-yyyy";
    
    
    String AAA_CONTRACT_NOT_FOUND= "AAA_CONTRACT_NOT_FOUND";
    String REST_IO_EXCEPTION = "REST_IO_EXCEPTION";
	String REST_WEB_SERVICE_INVOCATION_ERROR = "REST_WEB_SERVICE_INVOCATION_ERROR";
	String EXIT = "EXIT";
	
	String ADDRESS_DELIMITER = ",";
	String GEO_CODE_Q_STR_SPACE_REPL_CHAR = "+";
	String URL_SUB_PREFIX = "{";
	String P = URL_SUB_PREFIX;
	String URL_SUB_SUFIX = "}";
	String S = URL_SUB_SUFIX;
	String URL_SUB_VAR_LOGGED_IN ="LOGGED_ID";
	String URL_SUB_VAR_SR_NUMBER ="SR_NUMBER";
	String URL_SUB_VAR_NOTE_STATUS ="NOTE_STATUS";
	String URL_SUB_VAR_CONTRACT_NUMBER = "URL_SUB_VAR_CONTRACT_NUMBER";
	String URL_SUB_VAR_QP_ADDRESS = "ADDRESS";
	String IGNORE_CONTRACT_SITE_CUSTOMER_NAME = "IGNORE_CONTRACT_SITE_CUSTOMER_NAME";
	String LOCATIONS_QUERY_STRING = "LOCATIONS_QUERY_STRING";
	String CONTRACT_SITE_CITY = "CONTRACT_SITE_CITY";
    String CONTRACT_SITE_STATE_PROV = "CONTRACT_SITE_STATE_PROV";
    String CONTRACT_SITE_COUNTRY = "CONTRACT_SITE_COUNTRY";
    String CONT_SITE_ADDRESS1 = "CONT_SITE_ADDRESS1";
    String CONTRACT_NUMBER = "CONTRACT_NUMBER";
	    
    String JSON_REQUEST_CREATION_ERROR_UPDATE_SR = "JSON_REQUEST_CREATION_ERROR_UPDATE_SR";
    
    String STATUS="STATUS";
    String ERROR_CODE="ERROR_CODE";
    String SV_SRUPDATE_RESP_HAS_INCORRECT_SRNUMBER = "SV_SRUPDATE_RESP_HAS_INCORRECT_SRNUMBER";
    String REQUEST="REQUEST";
    
    String CONTRACT_NUMBER_MISSING = "CONTRACT_NUMBER_MISSING";
    String DEVICE_ID_MISSING = "DEVICE_ID_MISSING";
    String FAIL_TO_ADD_TO_NOTIFY="FAIL_TO_ADD_TO_NOTIFY";
    String USER_NOT_REGISTERED = "USER_NOT_REGISTERED";
    String CCOID_NOT_FOUND = "CCOID_NOT_FOUND";
    String FAIL_TO_UPDATE_SUBSCRIPTION_SASI="FAIL_TO_UPDATE_SUBSCRIPTION_SASI";
    String FAIL_TO_UPDATE_SUBSCRIPTION_DB="FAIL_TO_UPDATE_SUBSCRIPTION_DB";
    String SUBSCRIBED = "SUBSCRIBED";  
    String UNSUBSCRIBED = "UNSUBSCRIBED";  
    String NONE = "NONE";
    String MASHERY_ACCESS_TOKEN_ID = "MASHERY_ACCESS_TOKEN_ID";
    
    String GEO_CODE_STC_OK = "OK";
    String GEO_CODE_STC_ZR="ZERO_RESULTS";
    String GEO_CODE_STC_OQL="OVER_QUERY_LIMIT";
    String GEO_CODE_STC_RD="REQUEST_DENIED";
    String GEO_CODE_STC_IR="INVALID_REQUEST";
    String GEO_CODE_STC_UNKNOWN = "GEO_CODE_STC_UNKNOWN";
    String ERROR_SIGNING_URL = "ERROR_SIGNING_URL";
    String URL_SUB_VAR_GOOGLE_CLIENT_ID = "URL_SUB_VAR_GOOGLE_CLIENT_ID";
    String PREV_VALUE_PREFIX = "prev_";
    String CUR_VALUE_PREFIX = "cur_";
    String SR_NUMBER_KEY = "srNumber";
    String HEADER = "header";
    String FOOTER = "footer";
    String NO_VALUE = "_NULL_";
    String LST_UPD_TIME = "lastUpdateDateTime";
    String LINE_SEPERATOR = "LS";
    String SR_SEVERITY_KEY = "severity";
    String SR_STATUS_KEY = "srStatus";
    String SR_CASENOTESCOUNT_KEY = "caseNotesCount";
    String CXF_REQUEST_HEADER_URI="org.apache.cxf.request.uri";
    String MASHERY_HANDSHAKE_HEADER = "X-Mashery-Handshake";
    String GCM_VALIDATION_ERROR = "GCM_VALIDATION_ERROR";
    String GCM_VALIDATION_ERROR_INSUFFICIENT_INPUT = "GCM_VALIDATION_ERROR_INSUFFICIENT_INPUT";
    String GCM_JSON_REQUEST_INVALID = "GCM_JSON_REQUEST_INVALID";
    String GCM_AUTHENTICATION_ERROR = "GCM_AUTHENTICATION_ERROR";
    String GCM_INTERNAL_SERVER_ERROR = "GCM_INTERNAL_SERVER_ERROR";
    String AAA_CONTENT_TYPE = "ContentType";
    String AAA_CONTENT_VALUE = "application/xml";
    String UNKNOWN = "UNKNOWN";
    String SR_DETAILS_NO_DBLOOKUP_FOR_SN = "SR_DETAILS_NO_DBLOOKUP_FOR_SN";
    String SV_ACCESS_TOKEN_MISSING = "SV_ACCESS_TOKEN_MISSING";
    String SV_FAIL_TO_SEND_EMAIL="SV_FAIL_TO_SEND_EMAIL";
    String SV_EMAIL_SUCCESS="SV_EMAIL_SUCCESS";
    String SV_EMAIL_ERROR_DATABASE_CONNECTION_FAILURE="SV_EMAIL_ERROR_DATABASE_CONNECTION_FAILURE";
    String SV_EMAIL_ERROR_DATABASE_UPDATION_FAILURE="SV_EMAIL_ERROR_DATABASE_UPDATION_FAILURE";
    String ATTACHMENT_DIRECTORY_PATH="ATTACHMENT_DIRECTORY_PATH";
    String SV_EMAIl_UNKNOWN_REASON="SV_EMAIl_UNKNOWN_REASON";
    String SV_EMAIL_REQUEST_NOT_PRESENT="SV_EMAIL_REQUEST_NOT_PRESENT";
    String SV_EMAIL_REQUEST_TO_INFO_MISSING="SV_EMAIL_REQUEST_TO_INFO_MISSING";
    String SV_EMAIL_REQUEST_BODY_INFO_MISSING="SV_EMAIL_REQUEST_BODY_INFO_MISSING";
    String SV_EMAIL_ATTACHMENTS_MISSING="SV_EMAIL_ATTACHMENTS_MISSING";
    String SV_EMAIL_REQUEST_SUBJECT_INFO_MISSING="SV_EMAIL_REQUEST_SUBJECT_INFO_MISSING";
    String SV_SINGLE_PID = "SV_SINGLE_PID";
    String SV_MULTIPLE_PIDS = "SV_MULTIPLE_PIDS";
    String SV_CONTRACT_REQ_ID_MISSING="SV_CONTRACT_REQ_ID_MISSING";
    String SV_NO_CONTRACT_DETAILS_IN_DB="SV_NO_CONTRACT_DETAILS_IN_DB";
    String TAB = "TAB";
    String SV_EMAIL_REQUEST_MANDATORY_ATTRIBUTES_MISSING="SV_EMAIL_REQUEST_MANDATORY_ATTRIBUTES_MISSING";
    String SV_EMAIL_REQUEST_INVALID="SV_EMAIL_REQUEST_INVALID";
    String SV_EMAIL_REQUEST_ACTION_INVALID="SV_EMAIL_REQUEST_ACTION_INVALID";
    String SV_EMAIL_REQUEST_ACTION_UNEXPECTED="SV_EMAIL_REQUEST_ACTION_UNEXPECTED";
    String SNTC_USER_EMAILID_MISSING="SNTC_USER_EMAILID_MISSING";
    String SNTC_ADMIN_EMAILID_MISSING="SNTC_ADMIN_EMAILID_MISSING";
    String SNTC_LOC_EMAILID_MISSING="SNTC_LOC_EMAILID_MISSING";
    int PID_VALUE=1;
    int CONRACT_VALUE=1;
    String VALIDATION_ERROR="VALIDATION_ERROR";
    String SV_FAIL_TO_FILL_LOCATION_DETAILS = "SV_FAIL_TO_FILL_LOCATION_DETAILS";
    String SV_LOCATION_REQUEST_INVALD = "SV_LOCATION_REQUEST_INVALD";
    
    String NOT_AVAILAIBLE="NA";
    String PRIVILEGE_LEVEL_1="P1||P2";
    String PRIVILEGE_LEVEL_2="P3||P4";
    String PRIVILEGE_LEVEL_3="P1||P2||P3||P4";
    
    String ZERO="0";
    String ONE="1";
    String TWO="2";
    String THREE="3";
    String Yes="Y";
}