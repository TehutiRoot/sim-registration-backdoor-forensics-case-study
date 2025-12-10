package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimChooseServiceTypeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimCommonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressAfterSubmitFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimPrepaidSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimPrepaidSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimPrepaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimScanSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimSelectNumberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimSelectTypeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.camera.ESimCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.camera.ESimIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.camera.ESimPreviewCustomerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.camera.ESimPreviewIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.camera.ESimPreviewOptionalImageForSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.camera.ESimPreviewOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.consent.ESimPrepaidNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.consent.ESimPrepaidTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.consentXSim.ESimConsentXSIMFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.consentXSim.ESimPostpaidConsentXSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.facerecog.ESimFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.form.ESimIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.form.ESimOtherCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.form.ESimPrepaidFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimAddressReceiptFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimInputAddressIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimInputAddressPassportFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimInputAddressPersonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimPaymentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimPostpaidPaymentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.ESimPostpaidChooseWithContractFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.ESimPostpaidChooseWithDeviceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.ESimPostpaidNiceNumberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.blacklist.ESimBlacklistSharingConsentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.blacklist.ESimExtraAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco.ESimPostpaidConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.consent_non_telco.ESimPostpaidConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.customer_info.ESimPostpaidMailingFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.from.ESimPostpaidFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.from.ESimPostpaidIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.from.ESimPostpaidOtherCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.imei.ESimPostpaidInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.imei.ESimPostpaidScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidDxAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidDxDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidPackageListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.multiple_photo.ESimOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.sim.ESimPostpaidInputSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.sim.ESimPostpaidScanSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.smart_card.ESimSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.success.ESimPostpaidRegisSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.summary.ESimPostpaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.qrCode.ESimShowQrCodeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020#H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020%H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020'H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020)H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020*H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020+H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020,H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020-H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020.H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020/H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000200H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000201H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000202H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000203H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000204H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000205H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000206H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000207H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000208H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000209H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020:H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020;H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020<H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020=H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020>H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020?H&¨\u0006@"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/ESimComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/eSIM/ESimActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimChooseServiceTypeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimCommonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimInProgressAfterSubmitFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimPrepaidSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimPrepaidSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimPrepaidSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimScanSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimSelectNumberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimSelectTypeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/camera/ESimCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/camera/ESimIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/camera/ESimPreviewCustomerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/camera/ESimPreviewIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/camera/ESimPreviewOptionalImageForSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/camera/ESimPreviewOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/consent/ESimPrepaidNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/consent/ESimPrepaidTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/consentXSim/ESimConsentXSIMFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/consentXSim/ESimPostpaidConsentXSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/facerecog/ESimFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/form/ESimIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/form/ESimOtherCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/form/ESimPrepaidFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/payment/ESimAddressReceiptFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/payment/ESimInputAddressIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/payment/ESimInputAddressPassportFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/payment/ESimInputAddressPersonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/payment/ESimPaymentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/payment/ESimPostpaidPaymentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/ESimPostpaidChooseWithContractFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/ESimPostpaidChooseWithDeviceFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/ESimPostpaidNiceNumberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/blacklist/ESimBlacklistSharingConsentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/blacklist/ESimExtraAdvanceFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/consent_non_telco/ESimPostpaidConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/consent_non_telco/ESimPostpaidConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/customer_info/ESimPostpaidMailingFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/from/ESimPostpaidFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/from/ESimPostpaidIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/from/ESimPostpaidOtherCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/imei/ESimPostpaidInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/imei/ESimPostpaidScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/listPack/ESimPostpaidAllPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/listPack/ESimPostpaidDefaultPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/listPack/ESimPostpaidDxAllPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/listPack/ESimPostpaidDxDefaultPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/listPack/ESimPostpaidPackageListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/multiple_photo/ESimOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/sim/ESimPostpaidInputSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/sim/ESimPostpaidScanSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/smart_card/ESimSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/success/ESimPostpaidRegisSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/postpaid/summary/ESimPostpaidSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/qrCode/ESimShowQrCodeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.ESimComponent */
/* loaded from: classes7.dex */
public interface ESimComponent extends AbstractActivityComponent<ESimActivity> {
    void inject(@NotNull ESimChooseServiceTypeFragment eSimChooseServiceTypeFragment);

    void inject(@NotNull ESimCommonFragment eSimCommonFragment);

    void inject(@NotNull ESimInProgressAfterSubmitFragment eSimInProgressAfterSubmitFragment);

    void inject(@NotNull ESimPrepaidSmartCardFragment eSimPrepaidSmartCardFragment);

    void inject(@NotNull ESimPrepaidSuccessFragment eSimPrepaidSuccessFragment);

    void inject(@NotNull ESimPrepaidSummaryFragment eSimPrepaidSummaryFragment);

    void inject(@NotNull ESimScanSimFragment eSimScanSimFragment);

    void inject(@NotNull ESimSelectNumberFragment eSimSelectNumberFragment);

    void inject(@NotNull ESimSelectTypeFragment eSimSelectTypeFragment);

    void inject(@NotNull ESimCustomerCameraFragment eSimCustomerCameraFragment);

    void inject(@NotNull ESimIdCardCameraFragment eSimIdCardCameraFragment);

    void inject(@NotNull ESimPreviewCustomerFragment eSimPreviewCustomerFragment);

    void inject(@NotNull ESimPreviewIdCardFragment eSimPreviewIdCardFragment);

    void inject(@NotNull ESimPreviewOptionalImageForSummaryFragment eSimPreviewOptionalImageForSummaryFragment);

    void inject(@NotNull ESimPreviewOptionalImageFragment eSimPreviewOptionalImageFragment);

    void inject(@NotNull ESimPrepaidNonTelcoFragment eSimPrepaidNonTelcoFragment);

    void inject(@NotNull ESimPrepaidTelcoFragment eSimPrepaidTelcoFragment);

    void inject(@NotNull ESimConsentXSIMFragment eSimConsentXSIMFragment);

    void inject(@NotNull ESimPostpaidConsentXSimFragment eSimPostpaidConsentXSimFragment);

    void inject(@NotNull ESimFaceRecognitionFragment eSimFaceRecognitionFragment);

    void inject(@NotNull ESimIdCardFormFragment eSimIdCardFormFragment);

    void inject(@NotNull ESimOtherCardFormFragment eSimOtherCardFormFragment);

    void inject(@NotNull ESimPrepaidFormFragment eSimPrepaidFormFragment);

    void inject(@NotNull ESimAddressReceiptFragment eSimAddressReceiptFragment);

    void inject(@NotNull ESimInputAddressIdCardFragment eSimInputAddressIdCardFragment);

    void inject(@NotNull ESimInputAddressPassportFragment eSimInputAddressPassportFragment);

    void inject(@NotNull ESimInputAddressPersonFragment eSimInputAddressPersonFragment);

    void inject(@NotNull ESimPaymentFragment eSimPaymentFragment);

    void inject(@NotNull ESimPostpaidPaymentFragment eSimPostpaidPaymentFragment);

    void inject(@NotNull ESimPostpaidChooseWithContractFragment eSimPostpaidChooseWithContractFragment);

    void inject(@NotNull ESimPostpaidChooseWithDeviceFragment eSimPostpaidChooseWithDeviceFragment);

    void inject(@NotNull ESimPostpaidNiceNumberFragment eSimPostpaidNiceNumberFragment);

    void inject(@NotNull ESimBlacklistSharingConsentFragment eSimBlacklistSharingConsentFragment);

    void inject(@NotNull ESimExtraAdvanceFragment eSimExtraAdvanceFragment);

    void inject(@NotNull ESimPostpaidConsentNonTelcoFragment eSimPostpaidConsentNonTelcoFragment);

    void inject(@NotNull ESimPostpaidConsentTelcoFragment eSimPostpaidConsentTelcoFragment);

    void inject(@NotNull ESimPostpaidMailingFragment eSimPostpaidMailingFragment);

    void inject(@NotNull ESimPostpaidFormFragment eSimPostpaidFormFragment);

    void inject(@NotNull ESimPostpaidIdCardFormFragment eSimPostpaidIdCardFormFragment);

    void inject(@NotNull ESimPostpaidOtherCardFormFragment eSimPostpaidOtherCardFormFragment);

    void inject(@NotNull ESimPostpaidInputIMEIFragment eSimPostpaidInputIMEIFragment);

    void inject(@NotNull ESimPostpaidScanIMEIFragment eSimPostpaidScanIMEIFragment);

    void inject(@NotNull ESimPostpaidAllPackageFragment eSimPostpaidAllPackageFragment);

    void inject(@NotNull ESimPostpaidDefaultPackageFragment eSimPostpaidDefaultPackageFragment);

    void inject(@NotNull ESimPostpaidDxAllPackageFragment eSimPostpaidDxAllPackageFragment);

    void inject(@NotNull ESimPostpaidDxDefaultPackageFragment eSimPostpaidDxDefaultPackageFragment);

    void inject(@NotNull ESimPostpaidPackageListFragment eSimPostpaidPackageListFragment);

    void inject(@NotNull ESimOptionalImageFragment eSimOptionalImageFragment);

    void inject(@NotNull ESimPostpaidInputSimFragment eSimPostpaidInputSimFragment);

    void inject(@NotNull ESimPostpaidScanSimFragment eSimPostpaidScanSimFragment);

    void inject(@NotNull ESimSmartCardFragment eSimSmartCardFragment);

    void inject(@NotNull ESimPostpaidRegisSuccessFragment eSimPostpaidRegisSuccessFragment);

    void inject(@NotNull ESimPostpaidSummaryFragment eSimPostpaidSummaryFragment);

    void inject(@NotNull ESimShowQrCodeFragment eSimShowQrCodeFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
