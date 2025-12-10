package th.p047co.dtac.android.dtacone.util;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: th.co.dtac.android.dtacone.util.Constant */
/* loaded from: classes8.dex */
public class Constant {
    public static final String ACCEPT_TERMS_COND = "accept_condition";
    public static final String BANK_ACCOUNT_NUMBER_FORMAT = "999-9-99999-9";
    public static final String BUNDLE_MOBILE_NUMBER = "bundleMobileNum";
    public static final String CAMPAIGN_REDEMPTION = "CAMPAIGN_REDEMPTION";
    public static final String CAMPAIGN_REDEMPTION_BACK_TO_HOME = "CAMPAIGN_REDEMPTION_BACK_TO_HOME";
    public static final String CREDIT_CARD_FORMAT = "#### #### #### ####";
    public static final String DEFAULT_BIRTH_DATE = "20090101";
    public static final String DEFAULT_EXPIRE_DATE = "99990101";
    public static final String DEFAULT_ISSUE_DATE = "25520101";
    public static final String DTAC_ONE_CONSENT = "DTAC_ONE_CONSENT";
    public static final String EMPTY = "";
    public static final String EVENT_ACTIVATE_DOL = "ACTIVATE_DOL";
    public static final String EVENT_FIRST_LOGIN = "first_login";
    public static final String EVENT_FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD";
    public static final String EVENT_FORGOT_PASSWORD = "forgot_password";
    public static final String EVENT_ONE_FORGOT_PASSWORD = "FORGOT_PASSWORD";
    public static final String EVENT_ONE_REGISTER = "REGISTER";
    public static final String EVENT_PAYMENT_DIRECT_ACCOUNT = "BUY_DOL_DIRECT_ACCOUNT";
    public static final String EVENT_PRE2POST = "PRE2POST";
    public static final String EVENT_REGISTER = "register";
    public static final String EVENT_REGISTER_DTAC_AT_HOME = "EVENT_REGISTER_DTAC_AT_HOME";
    public static final String EVENT_SALE_ORDER = "SALE_ORDER";
    public static final String EXTRA_EVENT = "EXTRA_EVENT";
    public static final String EXTRA_FRAGMENT_STATE = "fragmentSaveState";
    public static final String EXTRA_IS_FROM_SUMMARY = "EXTRA_IS_FROM_SUMMARY";
    public static final String EXTRA_PHOTO = "EXTRA_PHOTO_TYPE";
    public static final String EXTRA_PHOTO_TYPE = "EXTRA_PHOTO_TYPE";
    public static final String FACE_DETECTION_CUSTOMER_COUNTER = "face.detected.customer";
    public static final String FACE_DETECTION_ID_CARD_COUNTER = "face.detected.id.card";
    public static final String FLAVOR_PRODUCTION = "prod";
    public static final String KEEP_FLAVOR_KEY = "KEEP_FLAVOR_KEY";
    public static final String NATION_CARD_FORMAT = "9 9999 99999 99 9";

    /* renamed from: NO */
    public static final String f87015NO = "No";
    public static final String NON_TELCO_SCREEN = "non_telco_screen";
    public static final String NOTI_MESSAGE = "notiMessage";
    public static final String OFFER_DATA_BUNDLE = "offerListData";
    public static final String PHONE_FORMAT = "999-999-9999";
    public static final String PREF_BARCODE_IMAGE = "PREF_BARCODE_IMAGE";
    public static final String PREF_DATABASE_CONFIG_VERSION = "sqlite.current.version";
    public static final String PREF_ID_CARD_IMAGE = "PREF_ID_CARD_IMAGE";
    public static final String PREF_IS_FIRST_LOGIN = "PREF_IS_FIRST_LOGIN";
    public static final String PREF_LANGUAGE = "PREF_LANGUAGE_CODE";
    public static final String PREF_MAXIMUM_FACE = "prepaid.registration.camera.face.detected.maximum";
    public static final String PREF_MINIMUM_FACE = "prepaid.registration.camera.face.detected.minimum";
    public static final String PREF_NEW_CAMPAIGN_COUNT = "PREF_NEW_CAMPAIGN_COUNT";
    public static final String PREF_NEW_MISSION_COUNT = "PREF_NEW_MISSION_COUNT";
    public static final String PREF_SLOW_FACE_DETECT = "PREF_SLOW_FACE_DETECT";
    public static final String PREF_TOTAL_NEW = "PREF_TOTAL_NEW";
    public static final String PREF_WHAT_NEW_LATER = "WHAT_NEW_LATER";
    public static final String PROFILE_IMAGE_URL = "profile_image_url";
    public static final String REGISTER_LEVEL_OWNER = "owner";
    public static final String REGISTER_LEVEL_PROMOTER = "promoter";
    public static final String REGISTER_LEVEL_STAFF = "staff";
    public static final String REQUIRE_CALL_CAMPAIGN_COUNT = "REQUIRE_CALL_CAMPAIGN_COUNT";
    public static final String REQUIRE_CALL_CAMPAIGN_REDEMPTION = "REQUIRE_CALL_CAMPAIGN_REDEMPTION";
    public static final String SERVER_ERROR_CODE = "500";
    public static final String SHARE_REMEMBER_USERNAME = "usernameRemembered";
    public static final String SHARE_REMEMNER_IS = "isRememberUsername";
    public static final String SHARE_TOPIC_FIREBASE = "TOPIC_FIREBASE";
    public static final String SMART_CARD_EXPIRE_DATE = "99999999";
    public static final String SUCCESS_SCREEN = "success_screen";
    public static final String TEXT_BUTTON = "textButton";
    public static final String USB_SUPPORT = "USB_SUPPORT";
    public static final String VERIFY_TYPE_KYC = "KYC";
    public static final String VERIFY_TYPE_NBTC = "NBTC";
    public static final String VIEW_CENTER = "center";
    public static final String X_COMPANY = "X_COMPANY";
    public static final String YES = "Yes";
    public static final String pinDummy = "1234";
    public static final String retailerNumberDummy = "66813333333";
    public static final String subscriberNumberDummy = "66951029293";
    public static final String FLAVOR_UATPRODUCTION = "uat";
    public static final String FLAVOR_DEVELOPMENT = "dev";
    public static final String FLAVOR_PREPRODUCTION = "pre";
    public static final String FLAVOR_SITPRODUCTION = "sit";
    public static final ArrayList<String> environmentLists = new ArrayList<>(Arrays.asList(FLAVOR_UATPRODUCTION, FLAVOR_DEVELOPMENT, FLAVOR_PREPRODUCTION, FLAVOR_SITPRODUCTION));

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$BenefitName */
    /* loaded from: classes8.dex */
    public static class BenefitName {
        public static final String Data = "Data";
        public static final String IDD = "IDD";
        public static final String Net = "Net";
        public static final String SMS = "SMS";
        public static final String Validity = "Validity";
        public static final String Voice = "Voice";
        public static final String Wifi = "Wifi";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$CampaignType */
    /* loaded from: classes8.dex */
    public class CampaignType {
        public static final String ALREADY_OPTIN = "1";
        public static final String HAPPY_POINT_NORMAL = "1";
        public static final String HAPPY_POINT_SILVER = "2";
        public static final String HISTORY_TYPE_ADJUST = "ADJUST";
        public static final String HISTORY_TYPE_POINT = "POINT";
        public static final String HISTORY_TYPE_REDEEM = "REDEEM";
        public static final String NEW_OPTIN = "2";
        public static final String NOT_REGISTER = "NOT_REGISTER";
        public static final String OPTIN_NON_TARGET = "2";
        public static final String OPTIN_NORMAL = "0";
        public static final String OPTIN_TARGET = "1";
        public static final String TYPE_NUMBER = "NUMBER";
        public static final String TYPE_TEXT = "TEXT";

        public CampaignType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$Connection */
    /* loaded from: classes8.dex */
    public class Connection {
        public static final String BASE_TRUE_CAMPAIGN_URL_PROD = "https://tcm.truecorp.co.th";
        public static final String BASE_TRUE_CAMPAIGN_URL_TEST = "https://tcm-admin-uat.truecorp.co.th";
        public static final String BASE_URL_DEV = "https://dev-mrtr.dtac.co.th/";
        public static final String BASE_URL_PRE = "https://pre-mrtr.dtac.co.th/";
        public static final String BASE_URL_PROD = "https://mrtr.dtac.co.th/";
        public static final String BASE_URL_SIT = "https://sit-mrtr.dtac.co.th/";
        public static final String BASE_URL_TEST = "https://test-mrtr.dtac.co.th/";
        public static final int CONNECT_TIMEOUT_SEC = 60;
        public static final String HOST_URL_DEV = "dev-mrtr.dtac.co.th";
        public static final String HOST_URL_PRE = "pre-mrtr.dtac.co.th";
        public static final String HOST_URL_PROD = "mrtr.dtac.co.th";
        public static final String HOST_URL_SIT = "sit-mrtr.dtac.co.th";
        public static final String HOST_URL_TEST = "test-mrtr.dtac.co.th";
        public static final int READ_TIMEOUT_SEC = 60;
        public static final String URL_CLI_DEV = "http://dev-mrtr.dtac.co.th/cli";
        public static final String URL_CLI_DEV_LOCAL = "http://dev-mrtr.tac.co.th:7000/cli";
        public static final String URL_CLI_PRE = "http://pre.mrtr.dtac.co.th/cli";
        public static final String URL_CLI_PROD = "http://mrtr.dtac.co.th/cli";
        public static final String URL_CLI_SIT = "http://sit-mrtr.dtac.co.th/cli";
        public static final String URL_CLI_TEST = "http://test-mrtr.dtac.co.th/cli";
        public static final String URL_PATH_FOR_CMS_CATALOG_IMAGE = "cms/campaign/image/v2/";
        public static final String URL_PATH_FOR_ONE_CMS_CATALOG_IMAGE = "oneCampaign/campaign/image/v2/";
        public static final String URL_TOL_SGIS_DEV = "https://sgis-new-test.truecorp.co.th";
        public static final String URL_TOL_SGIS_PRE = "https://sgis-new-test.truecorp.co.th";
        public static final String URL_TOL_SGIS_PROD = "https://sgis-new-test.truecorp.co.th";
        public static final String URL_TOL_SGIS_SIT = "https://sgis-new-test.truecorp.co.th";
        public static final String URL_TOL_SGIS_TEST = "https://sgis-new-test.truecorp.co.th";
        public static final int WRITE_TIMEOUT_SEC = 60;

        public Connection() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$ConsentDomain */
    /* loaded from: classes8.dex */
    public class ConsentDomain {
        public static final String BLACKLIST = "BLACKLIST_3OPER";
        public static final String BUY_DOL = "BUY_DOL";
        public static final String CHANGE_SIM = "CHANGE_SIM";
        public static final String ESIGN = "ESIGN";
        public static final String MNP = "PORTIN";
        public static final String NONTELCO = "NONTELCO";
        public static final String ONLINE_REGISTRATION_INDI = "ONLINE_REGISTRATION_INDI";
        public static final String PDPA = "PDPA";
        public static final String PORTIN = "PORTIN";
        public static final String POSTPAID_REGISTRATION = "POSTPAID_REGISTRATION";
        public static final String PRE2POST = "PRE2POST";
        public static final String PREPAID_REGISTRATION = "PREPAID_REGISTRATION";
        public static final String RTR_PROFILE = "RTR_PROFILE";
        public static final String TMN = "TMN";

        public ConsentDomain() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$DolActivateStatus */
    /* loaded from: classes8.dex */
    public class DolActivateStatus {
        public static final String ACTIVE = "ACTIVE";
        public static final String INACTIVE = "INACTIVE";
        public static final String NO_SIMR = "NO_SIMR";

        public DolActivateStatus() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$EInvoice */
    /* loaded from: classes8.dex */
    public static class EInvoice {
        public static final String SMS_ONLY = "SMS_ONLY";
        public static final String SMS_WITH_EMAIL = "SMS_WITH_EMAIL";
        public static final String SMS_WITH_PAPER = "SMS_WITH_PAPER";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$ErrorCodeType */
    /* loaded from: classes8.dex */
    public static class ErrorCodeType {
        public static final String businessError = "B";
        public static final String technicalError = "T";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$IntentConstant */
    /* loaded from: classes8.dex */
    public class IntentConstant {
        public static final String GO_BACK_TO_HOME = "goBackToHome";
        public static final String GO_BACK_TO_LOGIN = "goBackToLogin";
        public static final String HOME_FROM_LOGIN = "homeFromLogin";
        public static final String RETAILER_PHONE_NUMBER = "retailerNumberDummy";
        public static final String SUBSCRIBER_PHONE_NUMBER = "subscriberNumberDummy";

        public IntentConstant() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$LoginStatus */
    /* loaded from: classes8.dex */
    public class LoginStatus {
        public static final String ACTIVE = "ACTIVE";
        public static final String INACTIVE = "INACTIVE";
        public static final String PREACTIVE = "PREACTIVE";

        public LoginStatus() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$MissionOptinStatus */
    /* loaded from: classes8.dex */
    public class MissionOptinStatus {
        public static final String All = "All";

        /* renamed from: N */
        public static final String f87022N = "N";

        /* renamed from: Y */
        public static final String f87023Y = "Y";

        public MissionOptinStatus() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$MissionOption */
    /* loaded from: classes8.dex */
    public class MissionOption {
        public static final String login = "login";
        public static final String trophy = "trophy";

        public MissionOption() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$MnpType */
    /* loaded from: classes8.dex */
    public class MnpType {
        public static final String EXTERNAL_PORT = "EXTERNAL";
        public static final String GENDER_FEMALE = "F";
        public static final String GENDER_MALE = "M";
        public static final String INTERNAL_PORT = "INTERNAL";
        public static final String OTHER = "OTHER";
        public static final String PASSPORT = "PASSPORT";
        public static final String REGISTER_POSTPAID = "POSTPAID";
        public static final String REGISTER_PREPAID = "PREPAID";
        public static final String THAI_ID_CARD = "THAI_ID_CARD";

        public MnpType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$MrtrMnpServiceType */
    /* loaded from: classes8.dex */
    public class MrtrMnpServiceType {
        public static final String Postpaid = "Postpaid";
        public static final String Prepaid = "Prepaid";

        public MrtrMnpServiceType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$MrtrMnpSimInputMode */
    /* loaded from: classes8.dex */
    public class MrtrMnpSimInputMode {
        public static final String CARD_READER = "CARD_READER";
        public static final String SCAN = "SCAN";

        public MrtrMnpSimInputMode() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$MrtrPriceLevel */
    /* loaded from: classes8.dex */
    public class MrtrPriceLevel {
        public static final String POS_FREE = "POS_FREE";
        public static final String POS_GUEST = "POS_GUEST";

        public MrtrPriceLevel() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$NBTC */
    /* loaded from: classes8.dex */
    public static class NBTC {
        public static final String url = "https://www.dtac.co.th/serv/nbtc-dtacone/index.html";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$NonTelcoConsentType */
    /* loaded from: classes8.dex */
    public class NonTelcoConsentType {

        /* renamed from: N */
        public static final String f87030N = "N";

        /* renamed from: Y */
        public static final String f87031Y = "Y";

        public NonTelcoConsentType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$OfferType */
    /* loaded from: classes8.dex */
    public class OfferType {
        public static final String BANNER = "RTR_BANNER";
        public static final String NOT_INTEREST_OFFER = "NOT_INTEREST_OFFER";
        public static final String PAD = "RTR_PAD";
        public static final String STV = "STV";
        public static final String TOPUP = "TOPUP";

        public OfferType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$OnePostpaidCardType */
    /* loaded from: classes8.dex */
    public static class OnePostpaidCardType {
        public static final String IDCard = "I";
        public static final String Other = "H";
        public static final String PASSPORT = "P";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$OnePostpaidType */
    /* loaded from: classes8.dex */
    public static class OnePostpaidType {
        public static final String CAMPAIGN = "CAMPAIGN";
        public static final String DEVICESALE = "DEVICESALE";
        public static final String PRE2POST = "PRE2POST";
        public static final String PRIVILEGE = "PRIVILEGE";
        public static final String SIMONLY = "SIMONLY";
        public static final String WITHDEVICE = "WITHDEVICE";
        public static final String WITHDEVICEP2P = "WITHDEVICEP2P";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$OnePostpaidVerifyKey */
    /* loaded from: classes8.dex */
    public static class OnePostpaidVerifyKey {
        public static final String BirthDate = "BirthDate";
        public static final String Default = "Default";
        public static final String MSISDN = "MSISDN";
        public static final String ThaiId = "ThaiId";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$OnePostpaidVerifyKeyItemViewType */
    /* loaded from: classes8.dex */
    public static class OnePostpaidVerifyKeyItemViewType {
        public static final int BirthDate = 3;
        public static final int Default = 0;
        public static final int MSISDN = 2;
        public static final int MSISDN_SELECT = 4;
        public static final int ThaiId = 1;
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$OnlineRegistration */
    /* loaded from: classes8.dex */
    public static class OnlineRegistration {
        public static final String MANUAL_KYC = "MANUAL_KYC";
        public static final String PARTNER = "PARTNER";
        public static final String SALE = "SALE";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$PackageName */
    /* loaded from: classes8.dex */
    public class PackageName {
        public static final String DTAC_ONE = "th.co.dtac.android.dtacone";
        public static final String GOOGLE_PLAY_SERVICE = "com.google.android.gms";

        public PackageName() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$PostpaidRegisterCardType */
    /* loaded from: classes8.dex */
    public class PostpaidRegisterCardType {
        public static final String OTHER = "OTHER";
        public static final String OTHER_CARD = "15";
        public static final String PASSPORT = "PASSPORT";
        public static final String THAI_ID_CARD = "THAI_ID_CARD";
        public static final String THAI_NATIONAL_ID_CARD = "01";

        public PostpaidRegisterCardType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$Pre2PostRegisterCardType */
    /* loaded from: classes8.dex */
    public class Pre2PostRegisterCardType {
        public static final String OTHER_CARD = "15";
        public static final String THAI_NATIONAL_ID_CARD = "01";

        public Pre2PostRegisterCardType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$PrepaidRegisterCardType */
    /* loaded from: classes8.dex */
    public class PrepaidRegisterCardType {
        public static final String CI_PASSPORT = "CI_PASSPORT";
        public static final String JURISTIC_THAI_NATIONAL_ID_CARD = "03";
        public static final String OTHER = "OTHER";
        public static final String OTHER_CARD = "15";
        public static final String OTHER_DOCUMENT = "OTHER_DOCUMENT";
        public static final String PASSPORT = "PASSPORT";
        public static final String THAI_ALIEN_CARD = "THAI_ALIEN_CARD";
        public static final String THAI_ID_CARD = "THAI_ID_CARD";
        public static final String THAI_NATIONAL_ID_CARD = "01";
        public static final String TRAVEL_DOCUMENT = "TRAVEL_DOCUMENT";
        public static final String WORK_PERMIT = "WORK_PERMIT";

        public PrepaidRegisterCardType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$QueryTransactionStatus */
    /* loaded from: classes8.dex */
    public static class QueryTransactionStatus {
        public static final String CANCELLED = "CANCELLED";
        public static final String COMPLETED = "COMPLETED";
        public static final String FAILED = "FAILED";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$RectifyType */
    /* loaded from: classes8.dex */
    public static class RectifyType {
        public static final String E_PIN = "E-PIN";
        public static final String STV = "STV";
        public static final String TOPUP = "TOPUP";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$RegisterTrueOnlineCardType */
    /* loaded from: classes8.dex */
    public class RegisterTrueOnlineCardType {
        public static final String OTHER = "OTHER";
        public static final String OTHER_CARD = "15";
        public static final String PASSPORT = "PASSPORT";
        public static final String THAI_ID_CARD = "THAI_ID_CARD";
        public static final String THAI_NATIONAL_ID_CARD = "01";

        public RegisterTrueOnlineCardType() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$SendQRType */
    /* loaded from: classes8.dex */
    public static class SendQRType {
        public static final String email = "email";
        public static final String mms = "mms";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$ServiceAPIName */
    /* loaded from: classes8.dex */
    public class ServiceAPIName {
        public static final String AutoTransfer = "AutoTransfer";
        public static final String AutoTransferEDMS = "AutoTransferEDMS";
        public static final String CheckSimStock = "CheckSimStock";
        public static final String Validate = "Validate";
        public static final String onComplete = "onComplete";
        public static final String onError = "onError";
        public static final String onNext = "onNext";
        public static final String onStart = "onStart";

        public ServiceAPIName() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$ServiceSubscribeBy */
    /* loaded from: classes8.dex */
    public class ServiceSubscribeBy {
        public static final String onComplete = "onComplete";
        public static final String onError = "onError";
        public static final String onNext = "onNext";

        public ServiceSubscribeBy() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$ToolbarTitle */
    /* loaded from: classes8.dex */
    public class ToolbarTitle {
        public static final String ABOUT_DTAC = "เกี่ยวกับ dtac One";
        public static final String CHANGE_PASS = "เปลี่ยนรหัสผ่าน";
        public static final String NEWS_FEED = "ข่าวสาร";
        public static final String ONLINE_STORE = "ร้านค้า";
        public static final String OTHER = "อื่นๆ";
        public static final String OWNER_MANAGEMENT = "จัดการผู้ใช้งาน";
        public static final String REPORTS = "รายงาน";
        public static final String RETAILER_PROFILE = "ข้อมูลร้านค้า";
        public static final String SELECT_ITEM_TYPE = "เลือกประเภทรายการ";
        public static final String STAFF_ADD = "เพิ่มพนักงานขาย";
        public static final String STAFF_LIST = "รายชื่อพนักงานขายทั้งหมด";
        public static final String STV = "โปรเสริมออนไลน์";
        public static final String TOPUP = "เติมเงิน";
        public static final String WELCOME = "บริการ";

        public ToolbarTitle() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$Unify */
    /* loaded from: classes8.dex */
    public static class Unify {
        public static final String ATTORNEY = "ผู้รับมอบ";
        public static final String OWNER = "เจ้าของ";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$UpdatePrepaid */
    /* loaded from: classes8.dex */
    public class UpdatePrepaid {
        public static final String EXTRA_UPDATE_PREPAID_CONFIG = "EXTRA_UPDATE_PREPAID_CONFIG";

        public UpdatePrepaid() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$checkESimStatus */
    /* loaded from: classes8.dex */
    public static class checkESimStatus {
        public static final String Failed = "Failed";
        public static final String Inprogress = "Inprogress";
        public static final String Resendable = "Resendable";
        public static final String Success = "Success";
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$slowFaceDetection */
    /* loaded from: classes8.dex */
    public class slowFaceDetection {
        public static final int RESIZE_RATIO = 4;
        public static final int SLOW_TIME = 15;

        public slowFaceDetection() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$withDevicePathFlow */
    /* loaded from: classes8.dex */
    public class withDevicePathFlow {
        public static final String BLACKLIST_WITH_DEVICE_POSTPAID = "postpaid-blacklist";
        public static final String WITH_DEVICE_DTAC_AT_HOME = "dtacathome-with-devic";
        public static final String WITH_DEVICE_POSTPAID = "postpaid-with-device";
        public static final String WITH_DEVICE_PRE2POST = "pre2post-with-devic";
        public static final String WITH_DEVICE_SALE_ORDER = "saleorder-with-devic";

        public withDevicePathFlow() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.util.Constant$withDeviceType */
    /* loaded from: classes8.dex */
    public class withDeviceType {
        public static final String WITH_DEVICE_DTAC_DEVICE = "DTAC";
        public static final String WITH_DEVICE_OPEN_MARKET = "OPENMARKET";

        public withDeviceType() {
        }
    }

    public static String getBaseURL() {
        return getBaseURL("prod");
    }

    public static int getEnvironmentPosition(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 99349:
                if (str.equals(FLAVOR_DEVELOPMENT)) {
                    c = 0;
                    break;
                }
                break;
            case 111267:
                if (str.equals(FLAVOR_PREPRODUCTION)) {
                    c = 1;
                    break;
                }
                break;
            case 113886:
                if (str.equals(FLAVOR_SITPRODUCTION)) {
                    c = 2;
                    break;
                }
                break;
            case 3449687:
                if (str.equals("prod")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public static String getHostURL(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 111267:
                if (str.equals(FLAVOR_PREPRODUCTION)) {
                    c = 0;
                    break;
                }
                break;
            case 113886:
                if (str.equals(FLAVOR_SITPRODUCTION)) {
                    c = 1;
                    break;
                }
                break;
            case 115560:
                if (str.equals(FLAVOR_UATPRODUCTION)) {
                    c = 2;
                    break;
                }
                break;
            case 3449687:
                if (str.equals("prod")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Connection.HOST_URL_PRE;
            case 1:
                return Connection.HOST_URL_SIT;
            case 2:
                return Connection.HOST_URL_TEST;
            case 3:
                return Connection.HOST_URL_PROD;
            default:
                return Connection.HOST_URL_DEV;
        }
    }

    public static String getMixpanelToken() {
        return "f93b9876fcda687be3e6994d96e5e810";
    }

    public static String getSGISBaseUrl(String str) {
        str.hashCode();
        return "https://sgis-new-test.truecorp.co.th";
    }

    public static String getSGISUrl(String str) {
        return getSGISBaseUrl("prod") + "/login?one=" + str;
    }

    public static String getTrueBaseCampaignURL(String str) {
        str.hashCode();
        if (str.equals(FLAVOR_PREPRODUCTION) || str.equals("prod")) {
            return Connection.BASE_TRUE_CAMPAIGN_URL_PROD;
        }
        return Connection.BASE_TRUE_CAMPAIGN_URL_TEST;
    }

    public static String getUrlForCLI() {
        return getUrlForCLI("prod");
    }

    public static boolean isMockHost(String str) {
        if (!str.equals(Connection.HOST_URL_TEST) && !str.equals(Connection.HOST_URL_PRE) && !str.equals(Connection.HOST_URL_PROD) && !str.equals(Connection.HOST_URL_SIT) && !str.equals(Connection.HOST_URL_DEV)) {
            return true;
        }
        return false;
    }

    public static String getBaseURL(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 111267:
                if (str.equals(FLAVOR_PREPRODUCTION)) {
                    c = 0;
                    break;
                }
                break;
            case 113886:
                if (str.equals(FLAVOR_SITPRODUCTION)) {
                    c = 1;
                    break;
                }
                break;
            case 115560:
                if (str.equals(FLAVOR_UATPRODUCTION)) {
                    c = 2;
                    break;
                }
                break;
            case 3449687:
                if (str.equals("prod")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Connection.BASE_URL_PRE;
            case 1:
                return Connection.BASE_URL_SIT;
            case 2:
                return Connection.BASE_URL_TEST;
            case 3:
                return Connection.BASE_URL_PROD;
            default:
                return Connection.BASE_URL_DEV;
        }
    }

    public static String getUrlForCLI(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 111267:
                if (str.equals(FLAVOR_PREPRODUCTION)) {
                    c = 0;
                    break;
                }
                break;
            case 113886:
                if (str.equals(FLAVOR_SITPRODUCTION)) {
                    c = 1;
                    break;
                }
                break;
            case 115560:
                if (str.equals(FLAVOR_UATPRODUCTION)) {
                    c = 2;
                    break;
                }
                break;
            case 3449687:
                if (str.equals("prod")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Connection.URL_CLI_PRE;
            case 1:
                return Connection.URL_CLI_SIT;
            case 2:
                return Connection.URL_CLI_TEST;
            case 3:
                return Connection.URL_CLI_PROD;
            default:
                return Connection.URL_CLI_DEV;
        }
    }
}