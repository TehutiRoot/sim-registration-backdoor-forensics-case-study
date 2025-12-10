package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import th.p047co.dtac.android.dtacone.MobileRTRApplication;
import th.p047co.dtac.android.dtacone.configuration.activity.ActivatedDOLComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ActivityModule;
import th.p047co.dtac.android.dtacone.configuration.activity.AddStaffComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.BuyDol3DsComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.BuyDolComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.BuyDolScbComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.CampaignComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.CampaignWebViewComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ChangeMainPackComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ChangePackComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ChangeProfilePictureComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ChangeSimComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.CustomerEnquiryComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.DeviceSaleComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.DtacAtHomeComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.DummyEntryComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.EPinComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ESimComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ESimPostpaidSearchPackageComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.FaceCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.FaceCounterCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.ForceChangePasswordComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.IdCardCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.IdCardCounterCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.InactiveUserComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MainComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrChangeSimComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrMnpComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPostpaidRegistrationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPostpaidSearchPackageComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPre2PostComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPre2PostSearchPackageComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPrepaidMultiSimComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPrepaidReRegistComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPrepaidRegistrationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrPureSmartCardComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.NewsFeedMoreContentDetailComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.NewsFeedMoreImageDetailComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.NewsNotificationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneAboutComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneActivateSimComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneAddNewStaffComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneBuyDol3DsComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneBuyDolComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneBuyDolScbComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneCampaignComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneChangeOwnerComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneChangePasswordComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneChangeProHappyComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneConsentEsignComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneDeviceSaleComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneDeviceSalesComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneFaceCounterCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneFaceCounterCameraWithNewFaceDetectComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneForgotPasswordComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneHomeComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneIdCardCounterCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneIdCardCounterCameraWithNewFaceDetectComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneMnpComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneNewsFeedMoreContentDetailComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneNewsNotificationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneOnlineActivationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneOnlineRegisterComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneOtherShopListComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneOwnerManagementComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePostpaidRegistrationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePostpaidSearchPackageComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePre2PostComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePrepaidRegistrationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneProfitReportDetailComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePureCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePureSmartCardComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneRectifyComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneRegisterTrueOnlineComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneRegistrationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneRetailerProfileCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneRetailerProfileUpdateComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneRtrCommissionReportComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneSTVProSermOnlineComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneShopListComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneStaffPermissionComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OneTopupComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OptionalImageCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OtpV3Component;
import th.p047co.dtac.android.dtacone.configuration.activity.PreviewImageComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.PureCameraComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.PureSmartCardComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.RectifyComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.RegisterComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.RtrCommissionReportComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.RtrProfileComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.RtrProfitReportDetailComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.SellerIDComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.SigninComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.SimActivationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.SplashScreenComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.StaffRenameComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.StvComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.SubOtherMenuComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.TakePhotoComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.TopUpComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.UpPassDemoComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.WithDeviceComponent;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;

/* renamed from: th.co.dtac.android.dtacone.configuration.MobileRTRComponent */
/* loaded from: classes7.dex */
public interface MobileRTRComponent {
    Application application();

    CardReaderService getBluetoothService();

    void inject(MobileRTRApplication mobileRTRApplication);

    ActivatedDOLComponent plusActivatedDolComponent(ActivityModule activityModule);

    AddStaffComponent plusAddStaffComponent(ActivityModule activityModule);

    BuyDolComponent plusBuyDOlComponent(ActivityModule activityModule);

    BuyDol3DsComponent plusBuyDol3DsComponent(ActivityModule activityModule);

    BuyDolScbComponent plusBuyDolScbComponent(ActivityModule activityModule);

    CampaignComponent plusCampaignComponent(ActivityModule activityModule);

    CampaignWebViewComponent plusCampaignWebViewComponent(ActivityModule activityModule);

    ChangeMainPackComponent plusChangeMainPackComponent(ActivityModule activityModule);

    ChangePackComponent plusChangePack(ActivityModule activityModule);

    ChangeProfilePictureComponent plusChangeProfilePictureComponent(ActivityModule activityModule);

    ChangeSimComponent plusChangeSimComponent(ActivityModule activityModule);

    NewsFeedMoreContentDetailComponent plusContentDetailComponent(ActivityModule activityModule);

    CustomerEnquiryComponent plusCustomerEnquiry(ActivityModule activityModule);

    DeviceSaleComponent plusDeviceSaleComponent(ActivityModule activityModule);

    DtacAtHomeComponent plusDtacAtHomeComponent(ActivityModule activityModule);

    DummyEntryComponent plusDummyEntryComponent(ActivityModule activityModule);

    EPinComponent plusEPinComponent(ActivityModule activityModule);

    ESimComponent plusESim(ActivityModule activityModule);

    ESimPostpaidSearchPackageComponent plusESimPostpaidSearchPackage(ActivityModule activityModule);

    FaceCameraComponent plusFaceCamera(ActivityModule activityModule);

    FaceCounterCameraComponent plusFaceCounterCamera(ActivityModule activityModule);

    ForceChangePasswordComponent plusForceChangePasswordComponent(ActivityModule activityModule);

    IdCardCameraComponent plusIdCardCamera(ActivityModule activityModule);

    IdCardCounterCameraComponent plusIdCardCounterCamera(ActivityModule activityModule);

    InactiveUserComponent plusInactiveUserComponent(ActivityModule activityModule);

    NewsFeedMoreImageDetailComponent plusMoreImageDetail(ActivityModule activityModule);

    MrtrChangeSimComponent plusMrtrChangeSimComponent(ActivityModule activityModule);

    MrtrMnpComponent plusMrtrMnp(ActivityModule activityModule);

    MrtrPostpaidRegistrationComponent plusMrtrPostpaidRegistration(ActivityModule activityModule);

    MrtrPostpaidSearchPackageComponent plusMrtrPostpaidSearchPackage(ActivityModule activityModule);

    MrtrPre2PostSearchPackageComponent plusMrtrPre2PostSearchPackage(ActivityModule activityModule);

    MrtrPre2PostComponent plusMrtrPree2Post(ActivityModule activityModule);

    MrtrPrepaidMultiSimComponent plusMrtrPrepaidMultiSim(ActivityModule activityModule);

    MrtrPrepaidReRegistComponent plusMrtrPrepaidReRegist(ActivityModule activityModule);

    MrtrPrepaidRegistrationComponent plusMrtrPrepaidRegistration(ActivityModule activityModule);

    MrtrPureSmartCardComponent plusMrtrPureSmartCard(ActivityModule activityModule);

    NewsNotificationComponent plusNewsNotification(ActivityModule activityModule);

    OneAboutComponent plusOneAboutComponent(ActivityModule activityModule);

    OneAddNewStaffComponent plusOneAddNewStaff(ActivityModule activityModule);

    OneBuyDolComponent plusOneBuyDOlComponent(ActivityModule activityModule);

    OneBuyDol3DsComponent plusOneBuyDol3DsComponent(ActivityModule activityModule);

    OneBuyDolScbComponent plusOneBuyDolScbComponent(ActivityModule activityModule);

    OneCampaignComponent plusOneCampaignComponent(ActivityModule activityModule);

    OneChangeOwnerComponent plusOneChangeOwner(ActivityModule activityModule);

    OneChangePasswordComponent plusOneChangePassword(ActivityModule activityModule);

    OneChangeProHappyComponent plusOneChangeProHappy(ActivityModule activityModule);

    OneConsentEsignComponent plusOneConsentEsignComponent(ActivityModule activityModule);

    OneNewsFeedMoreContentDetailComponent plusOneContentDetailComponent(ActivityModule activityModule);

    OneDeviceSaleComponent plusOneDeviceSaleComponent(ActivityModule activityModule);

    OneDeviceSalesComponent plusOneDeviceSalesComponent(ActivityModule activityModule);

    OneFaceCounterCameraComponent plusOneFaceCounterCamera(ActivityModule activityModule);

    OneFaceCounterCameraWithNewFaceDetectComponent plusOneFaceCounterCameraWithNewFaceDetect(ActivityModule activityModule);

    OneForgotPasswordComponent plusOneForgotPassword(ActivityModule activityModule);

    OneHomeComponent plusOneHomeComponent(ActivityModule activityModule);

    OneIdCardCounterCameraComponent plusOneIdCardCounterCamera(ActivityModule activityModule);

    OneIdCardCounterCameraWithNewFaceDetectComponent plusOneIdCardCounterCameraWithNewFaceDetect(ActivityModule activityModule);

    OneMnpComponent plusOneMnpComponent(ActivityModule activityModule);

    OneNewsNotificationComponent plusOneNewsNotification(ActivityModule activityModule);

    OneOnlineActivationComponent plusOneOnlineActivationComponent(ActivityModule activityModule);

    OneOnlineRegisterComponent plusOneOnlineRegisterComponent(ActivityModule activityModule);

    OneOtherShopListComponent plusOneOtherShopListComponent(ActivityModule activityModule);

    OneOwnerManagementComponent plusOneOwnerManagementComponent(ActivityModule activityModule);

    OneActivateSimComponent plusOneOwnerOneActivateSimComponent(ActivityModule activityModule);

    OnePostpaidRegistrationComponent plusOnePostpaidRegistration(ActivityModule activityModule);

    OnePostpaidSearchPackageComponent plusOnePostpaidSearchPackage(ActivityModule activityModule);

    OnePre2PostComponent plusOnePre2PostComponent(ActivityModule activityModule);

    OnePrepaidRegistrationComponent plusOnePrepaidRegistration(ActivityModule activityModule);

    OneProfitReportDetailComponent plusOneProfitReportDetailComponent(ActivityModule activityModule);

    OnePureCameraComponent plusOnePureCamera(ActivityModule activityModule);

    OnePureSmartCardComponent plusOnePureSmartCard(ActivityModule activityModule);

    OneRectifyComponent plusOneRectifyComponent(ActivityModule activityModule);

    OneRegisterTrueOnlineComponent plusOneRegisterTrueOnlineComponent(ActivityModule activityModule);

    OneRegistrationComponent plusOneRegistration(ActivityModule activityModule);

    OneRetailerProfileCameraComponent plusOneRetailerProfileCameraComponent(ActivityModule activityModule);

    OneRetailerProfileUpdateComponent plusOneRetailerProfileUpdateComponent(ActivityModule activityModule);

    OneRtrCommissionReportComponent plusOneRtrCommissionReportComponent(ActivityModule activityModule);

    OneSTVProSermOnlineComponent plusOneSTVProSermOnlineComponent(ActivityModule activityModule);

    OneShopListComponent plusOneShopListComponent(ActivityModule activityModule);

    OneStaffPermissionComponent plusOneStaffPermission(ActivityModule activityModule);

    OneTopupComponent plusOneTopUpComponent(ActivityModule activityModule);

    OptionalImageCameraComponent plusOptionalImageCamera(ActivityModule activityModule);

    OtpV3Component plusOtpV3(ActivityModule activityModule);

    PreviewImageComponent plusPreviewImage(ActivityModule activityModule);

    PureCameraComponent plusPureCamera(ActivityModule activityModule);

    PureSmartCardComponent plusPureSmartCard(ActivityModule activityModule);

    RectifyComponent plusRectifyComponent(ActivityModule activityModule);

    RegisterComponent plusRegisterComponent(ActivityModule activityModule);

    RtrCommissionReportComponent plusRtrCommissionReport(ActivityModule activityModule);

    RtrProfileComponent plusRtrProfile(ActivityModule activityModule);

    RtrProfitReportDetailComponent plusRtrProfitReportDetail(ActivityModule activityModule);

    SellerIDComponent plusSellerIDComponent(ActivityModule activityModule);

    MainComponent plusServiceComponent(ActivityModule activityModule);

    SigninComponent plusSigninComponent(ActivityModule activityModule);

    SimActivationComponent plusSimActivitionComponent(ActivityModule activityModule);

    SplashScreenComponent plusSplashScreenComponent(ActivityModule activityModule);

    StaffRenameComponent plusStaffRenameComponent(ActivityModule activityModule);

    StvComponent plusStvComponent(ActivityModule activityModule);

    SubOtherMenuComponent plusSubOtherMenu(ActivityModule activityModule);

    TakePhotoComponent plusTakePhoto(ActivityModule activityModule);

    TopUpComponent plusTopUpComponent(ActivityModule activityModule);

    UpPassDemoComponent plusUpPassDemoComponent(ActivityModule activityModule);

    WithDeviceComponent plusWithDeviceComponent(ActivityModule activityModule);

    RxBus<Object> rxBus();
}
