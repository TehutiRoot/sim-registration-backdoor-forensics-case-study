package th.p047co.dtac.android.dtacone.model.mrtr_mnp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.check_sim_info.response.MnpCheckSimInfoResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.otp.MnpRequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.response.PackageSetListItem;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.submit.response.MrtrMnpSubmitResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.response.CheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0083\u0001\b\u0007\u0018\u00002\u00020\u0001B«\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000104\u0012\b\b\u0002\u00105\u001a\u000206\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010?\u001a\u00020@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0002\u0010DR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001c\u0010&\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010V\"\u0004\bn\u0010XR\u001a\u0010?\u001a\u00020@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010V\"\u0004\bt\u0010XR\u001c\u00100\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010^\"\u0004\bv\u0010`R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001d\u0010-\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010V\"\u0005\b\u0080\u0001\u0010XR \u0010C\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0082\u0001\"\u0006\b\u0086\u0001\u0010\u0084\u0001R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010V\"\u0005\b\u0088\u0001\u0010XR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010V\"\u0005\b\u008a\u0001\u0010XR$\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000104X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010J\"\u0005\b\u008c\u0001\u0010LR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010V\"\u0005\b\u008e\u0001\u0010XR\"\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0014\n\u0003\u0010\u0092\u0001\u001a\u0005\b\n\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001d\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0005\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0002\u0010\u0093\u0001\"\u0006\b\u0096\u0001\u0010\u0095\u0001R\"\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0014\n\u0003\u0010\u0092\u0001\u001a\u0005\b\t\u0010\u008f\u0001\"\u0006\b\u0097\u0001\u0010\u0091\u0001R\u001d\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0004\u0010\u0093\u0001\"\u0006\b\u0098\u0001\u0010\u0095\u0001R\u001e\u00105\u001a\u000206X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001e\u0010,\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010V\"\u0005\b\u009e\u0001\u0010XR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010V\"\u0005\b \u0001\u0010XR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010V\"\u0005\b¢\u0001\u0010XR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010V\"\u0005\b¤\u0001\u0010XR \u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u001e\u0010$\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010V\"\u0005\bª\u0001\u0010XR\u001e\u0010%\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010V\"\u0005\b¬\u0001\u0010XR\u001e\u0010'\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010V\"\u0005\b®\u0001\u0010XR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010V\"\u0005\b°\u0001\u0010XR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010V\"\u0005\b²\u0001\u0010XR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010V\"\u0005\b´\u0001\u0010XR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010V\"\u0005\b¶\u0001\u0010XR \u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u001e\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b»\u0001\u0010\u0093\u0001\"\u0006\b¼\u0001\u0010\u0095\u0001R \u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010V\"\u0005\bÂ\u0001\u0010XR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u0010V\"\u0005\bÄ\u0001\u0010X¨\u0006Å\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/MrtrMnp;", "", "isPrepaid", "", "isSmartCard", "isCheckSimStock", "invoiceAlertMethod", "", "requireFaceRecognition", "isRequireLiveness", "isAllowManualKYC", "checkSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "idNumber", "idType", "cardType", "postCode", "postcodeSequenceString", "provinceCode", "mailingPostCode", "mailingPostcodeSequenceString", "mailingProvinceCode", "serviceType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "cutSimPostcode", "pinCode", "requestOtpResponse", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpResponse;", "checkSimInfoResponse", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;", "checkSimStockError", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "selectedPackage", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;", "mrtrConsentId", "nontelcoConsentType", "consentVersionLabel", "otpCode", "attachmentNames", "", "addressMailingData", "Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "legalAddressPostCode", HintConstants.AUTOFILL_HINT_GENDER, "cutSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "cutSimStockError", "mnpSubmitResponse", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/response/MrtrMnpSubmitResponse;", "imageOptionalsName", "", "lastNamePhotoMultiple", "", "authorizeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "faceCompareResult", "Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;", "compareResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "compareResponseForSubmit", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "currentFormType", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "idDocumentResultForOcr", "Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;", "idDocumentResultForCompare", "(ZZZLjava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpResponse;Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/response/MrtrMnpSubmitResponse;Ljava/util/List;ILth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;)V", "getAddressMailingData", "()Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "setAddressMailingData", "(Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getAuthorizeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "setAuthorizeResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;)V", "getCardInformation", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getCardType", "()Ljava/lang/String;", "setCardType", "(Ljava/lang/String;)V", "getCheckSimInfoResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;", "setCheckSimInfoResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;)V", "getCheckSimStockError", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "setCheckSimStockError", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "getCheckSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "setCheckSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;)V", "getCompareResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setCompareResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getCompareResponseForSubmit", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "setCompareResponseForSubmit", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;)V", "getConsentVersionLabel", "setConsentVersionLabel", "getCurrentFormType", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "setCurrentFormType", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;)V", "getCutSimPostcode", "setCutSimPostcode", "getCutSimStockError", "setCutSimStockError", "getCutSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "setCutSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;)V", "getFaceCompareResult", "()Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;", "setFaceCompareResult", "(Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;)V", "getGender", "setGender", "getIdDocumentResultForCompare", "()Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;", "setIdDocumentResultForCompare", "(Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;)V", "getIdDocumentResultForOcr", "setIdDocumentResultForOcr", "getIdNumber", "setIdNumber", "getIdType", "setIdType", "getImageOptionalsName", "setImageOptionalsName", "getInvoiceAlertMethod", "setInvoiceAlertMethod", "()Ljava/lang/Boolean;", "setAllowManualKYC", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setCheckSimStock", "(Z)V", "setPrepaid", "setRequireLiveness", "setSmartCard", "getLastNamePhotoMultiple", "()I", "setLastNamePhotoMultiple", "(I)V", "getLegalAddressPostCode", "setLegalAddressPostCode", "getMailingPostCode", "setMailingPostCode", "getMailingPostcodeSequenceString", "setMailingPostcodeSequenceString", "getMailingProvinceCode", "setMailingProvinceCode", "getMnpSubmitResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/response/MrtrMnpSubmitResponse;", "setMnpSubmitResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/submit/response/MrtrMnpSubmitResponse;)V", "getMrtrConsentId", "setMrtrConsentId", "getNontelcoConsentType", "setNontelcoConsentType", "getOtpCode", "setOtpCode", "getPinCode", "setPinCode", "getPostCode", "setPostCode", "getPostcodeSequenceString", "setPostcodeSequenceString", "getProvinceCode", "setProvinceCode", "getRequestOtpResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpResponse;", "setRequestOtpResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpResponse;)V", "getRequireFaceRecognition", "setRequireFaceRecognition", "getSelectedPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;", "setSelectedPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;)V", "getServiceType", "setServiceType", "getSubscriberNumber", "setSubscriberNumber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.MrtrMnp */
/* loaded from: classes8.dex */
public final class MrtrMnp {
    public static final int $stable = 8;
    @Nullable
    private AddressMailingData addressMailingData;
    @NotNull
    private List<String> attachmentNames;
    @Nullable
    private MnpAuthorizationResponse authorizeResponse;
    @Nullable
    private IdCardInformationCollection cardInformation;
    @Nullable
    private String cardType;
    @Nullable
    private MnpCheckSimInfoResponse checkSimInfoResponse;
    @Nullable
    private ErrorCollection checkSimStockError;
    @Nullable
    private CheckSimStockResponse checkSimStockResponse;
    @Nullable
    private FaceRecResponse compareResponse;
    @Nullable
    private FaceCompareResponse compareResponseForSubmit;
    @Nullable
    private String consentVersionLabel;
    @NotNull
    private UpPassFormType currentFormType;
    @Nullable
    private String cutSimPostcode;
    @Nullable
    private ErrorCollection cutSimStockError;
    @Nullable
    private CutSimStockResponse cutSimStockResponse;
    @Nullable
    private FaceCompareResult faceCompareResult;
    @Nullable
    private String gender;
    @Nullable
    private IdDocumentResult idDocumentResultForCompare;
    @Nullable
    private IdDocumentResult idDocumentResultForOcr;
    @Nullable
    private String idNumber;
    @Nullable
    private String idType;
    @Nullable
    private transient List<String> imageOptionalsName;
    @Nullable
    private String invoiceAlertMethod;
    @Nullable
    private Boolean isAllowManualKYC;
    private boolean isCheckSimStock;
    private boolean isPrepaid;
    @Nullable
    private Boolean isRequireLiveness;
    private boolean isSmartCard;
    private int lastNamePhotoMultiple;
    @Nullable
    private String legalAddressPostCode;
    @Nullable
    private String mailingPostCode;
    @Nullable
    private String mailingPostcodeSequenceString;
    @Nullable
    private String mailingProvinceCode;
    @Nullable
    private MrtrMnpSubmitResponse mnpSubmitResponse;
    @Nullable
    private String mrtrConsentId;
    @Nullable
    private String nontelcoConsentType;
    @Nullable
    private String otpCode;
    @Nullable
    private String pinCode;
    @Nullable
    private String postCode;
    @Nullable
    private String postcodeSequenceString;
    @Nullable
    private String provinceCode;
    @Nullable
    private MnpRequestOtpResponse requestOtpResponse;
    private boolean requireFaceRecognition;
    @Nullable
    private PackageSetListItem selectedPackage;
    @Nullable
    private String serviceType;
    @Nullable
    private String subscriberNumber;

    public MrtrMnp() {
        this(false, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, -1, 16383, null);
    }

    @Nullable
    public final AddressMailingData getAddressMailingData() {
        return this.addressMailingData;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final MnpAuthorizationResponse getAuthorizeResponse() {
        return this.authorizeResponse;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformation() {
        return this.cardInformation;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final MnpCheckSimInfoResponse getCheckSimInfoResponse() {
        return this.checkSimInfoResponse;
    }

    @Nullable
    public final ErrorCollection getCheckSimStockError() {
        return this.checkSimStockError;
    }

    @Nullable
    public final CheckSimStockResponse getCheckSimStockResponse() {
        return this.checkSimStockResponse;
    }

    @Nullable
    public final FaceRecResponse getCompareResponse() {
        return this.compareResponse;
    }

    @Nullable
    public final FaceCompareResponse getCompareResponseForSubmit() {
        return this.compareResponseForSubmit;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @NotNull
    public final UpPassFormType getCurrentFormType() {
        return this.currentFormType;
    }

    @Nullable
    public final String getCutSimPostcode() {
        return this.cutSimPostcode;
    }

    @Nullable
    public final ErrorCollection getCutSimStockError() {
        return this.cutSimStockError;
    }

    @Nullable
    public final CutSimStockResponse getCutSimStockResponse() {
        return this.cutSimStockResponse;
    }

    @Nullable
    public final FaceCompareResult getFaceCompareResult() {
        return this.faceCompareResult;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final IdDocumentResult getIdDocumentResultForCompare() {
        return this.idDocumentResultForCompare;
    }

    @Nullable
    public final IdDocumentResult getIdDocumentResultForOcr() {
        return this.idDocumentResultForOcr;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final List<String> getImageOptionalsName() {
        return this.imageOptionalsName;
    }

    @Nullable
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    public final int getLastNamePhotoMultiple() {
        return this.lastNamePhotoMultiple;
    }

    @Nullable
    public final String getLegalAddressPostCode() {
        return this.legalAddressPostCode;
    }

    @Nullable
    public final String getMailingPostCode() {
        return this.mailingPostCode;
    }

    @Nullable
    public final String getMailingPostcodeSequenceString() {
        return this.mailingPostcodeSequenceString;
    }

    @Nullable
    public final String getMailingProvinceCode() {
        return this.mailingProvinceCode;
    }

    @Nullable
    public final MrtrMnpSubmitResponse getMnpSubmitResponse() {
        return this.mnpSubmitResponse;
    }

    @Nullable
    public final String getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String getOtpCode() {
        return this.otpCode;
    }

    @Nullable
    public final String getPinCode() {
        return this.pinCode;
    }

    @Nullable
    public final String getPostCode() {
        return this.postCode;
    }

    @Nullable
    public final String getPostcodeSequenceString() {
        return this.postcodeSequenceString;
    }

    @Nullable
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    @Nullable
    public final MnpRequestOtpResponse getRequestOtpResponse() {
        return this.requestOtpResponse;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final PackageSetListItem getSelectedPackage() {
        return this.selectedPackage;
    }

    @Nullable
    public final String getServiceType() {
        return this.serviceType;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final Boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    public final boolean isCheckSimStock() {
        return this.isCheckSimStock;
    }

    public final boolean isPrepaid() {
        return this.isPrepaid;
    }

    @Nullable
    public final Boolean isRequireLiveness() {
        return this.isRequireLiveness;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAddressMailingData(@Nullable AddressMailingData addressMailingData) {
        this.addressMailingData = addressMailingData;
    }

    public final void setAllowManualKYC(@Nullable Boolean bool) {
        this.isAllowManualKYC = bool;
    }

    public final void setAttachmentNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachmentNames = list;
    }

    public final void setAuthorizeResponse(@Nullable MnpAuthorizationResponse mnpAuthorizationResponse) {
        this.authorizeResponse = mnpAuthorizationResponse;
    }

    public final void setCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformation = idCardInformationCollection;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setCheckSimInfoResponse(@Nullable MnpCheckSimInfoResponse mnpCheckSimInfoResponse) {
        this.checkSimInfoResponse = mnpCheckSimInfoResponse;
    }

    public final void setCheckSimStock(boolean z) {
        this.isCheckSimStock = z;
    }

    public final void setCheckSimStockError(@Nullable ErrorCollection errorCollection) {
        this.checkSimStockError = errorCollection;
    }

    public final void setCheckSimStockResponse(@Nullable CheckSimStockResponse checkSimStockResponse) {
        this.checkSimStockResponse = checkSimStockResponse;
    }

    public final void setCompareResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.compareResponse = faceRecResponse;
    }

    public final void setCompareResponseForSubmit(@Nullable FaceCompareResponse faceCompareResponse) {
        this.compareResponseForSubmit = faceCompareResponse;
    }

    public final void setConsentVersionLabel(@Nullable String str) {
        this.consentVersionLabel = str;
    }

    public final void setCurrentFormType(@NotNull UpPassFormType upPassFormType) {
        Intrinsics.checkNotNullParameter(upPassFormType, "<set-?>");
        this.currentFormType = upPassFormType;
    }

    public final void setCutSimPostcode(@Nullable String str) {
        this.cutSimPostcode = str;
    }

    public final void setCutSimStockError(@Nullable ErrorCollection errorCollection) {
        this.cutSimStockError = errorCollection;
    }

    public final void setCutSimStockResponse(@Nullable CutSimStockResponse cutSimStockResponse) {
        this.cutSimStockResponse = cutSimStockResponse;
    }

    public final void setFaceCompareResult(@Nullable FaceCompareResult faceCompareResult) {
        this.faceCompareResult = faceCompareResult;
    }

    public final void setGender(@Nullable String str) {
        this.gender = str;
    }

    public final void setIdDocumentResultForCompare(@Nullable IdDocumentResult idDocumentResult) {
        this.idDocumentResultForCompare = idDocumentResult;
    }

    public final void setIdDocumentResultForOcr(@Nullable IdDocumentResult idDocumentResult) {
        this.idDocumentResultForOcr = idDocumentResult;
    }

    public final void setIdNumber(@Nullable String str) {
        this.idNumber = str;
    }

    public final void setIdType(@Nullable String str) {
        this.idType = str;
    }

    public final void setImageOptionalsName(@Nullable List<String> list) {
        this.imageOptionalsName = list;
    }

    public final void setInvoiceAlertMethod(@Nullable String str) {
        this.invoiceAlertMethod = str;
    }

    public final void setLastNamePhotoMultiple(int i) {
        this.lastNamePhotoMultiple = i;
    }

    public final void setLegalAddressPostCode(@Nullable String str) {
        this.legalAddressPostCode = str;
    }

    public final void setMailingPostCode(@Nullable String str) {
        this.mailingPostCode = str;
    }

    public final void setMailingPostcodeSequenceString(@Nullable String str) {
        this.mailingPostcodeSequenceString = str;
    }

    public final void setMailingProvinceCode(@Nullable String str) {
        this.mailingProvinceCode = str;
    }

    public final void setMnpSubmitResponse(@Nullable MrtrMnpSubmitResponse mrtrMnpSubmitResponse) {
        this.mnpSubmitResponse = mrtrMnpSubmitResponse;
    }

    public final void setMrtrConsentId(@Nullable String str) {
        this.mrtrConsentId = str;
    }

    public final void setNontelcoConsentType(@Nullable String str) {
        this.nontelcoConsentType = str;
    }

    public final void setOtpCode(@Nullable String str) {
        this.otpCode = str;
    }

    public final void setPinCode(@Nullable String str) {
        this.pinCode = str;
    }

    public final void setPostCode(@Nullable String str) {
        this.postCode = str;
    }

    public final void setPostcodeSequenceString(@Nullable String str) {
        this.postcodeSequenceString = str;
    }

    public final void setPrepaid(boolean z) {
        this.isPrepaid = z;
    }

    public final void setProvinceCode(@Nullable String str) {
        this.provinceCode = str;
    }

    public final void setRequestOtpResponse(@Nullable MnpRequestOtpResponse mnpRequestOtpResponse) {
        this.requestOtpResponse = mnpRequestOtpResponse;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    public final void setRequireLiveness(@Nullable Boolean bool) {
        this.isRequireLiveness = bool;
    }

    public final void setSelectedPackage(@Nullable PackageSetListItem packageSetListItem) {
        this.selectedPackage = packageSetListItem;
    }

    public final void setServiceType(@Nullable String str) {
        this.serviceType = str;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.subscriberNumber = str;
    }

    public MrtrMnp(boolean z, boolean z2, boolean z3, @Nullable String str, boolean z4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CheckSimStockResponse checkSimStockResponse, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable MnpRequestOtpResponse mnpRequestOtpResponse, @Nullable MnpCheckSimInfoResponse mnpCheckSimInfoResponse, @Nullable ErrorCollection errorCollection, @Nullable PackageSetListItem packageSetListItem, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @NotNull List<String> attachmentNames, @Nullable AddressMailingData addressMailingData, @Nullable String str19, @Nullable String str20, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable ErrorCollection errorCollection2, @Nullable MrtrMnpSubmitResponse mrtrMnpSubmitResponse, @Nullable List<String> list, int i, @Nullable MnpAuthorizationResponse mnpAuthorizationResponse, @Nullable FaceCompareResult faceCompareResult, @Nullable FaceRecResponse faceRecResponse, @Nullable FaceCompareResponse faceCompareResponse, @NotNull UpPassFormType currentFormType, @Nullable IdDocumentResult idDocumentResult, @Nullable IdDocumentResult idDocumentResult2) {
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        this.isPrepaid = z;
        this.isSmartCard = z2;
        this.isCheckSimStock = z3;
        this.invoiceAlertMethod = str;
        this.requireFaceRecognition = z4;
        this.isRequireLiveness = bool;
        this.isAllowManualKYC = bool2;
        this.checkSimStockResponse = checkSimStockResponse;
        this.cardInformation = idCardInformationCollection;
        this.idNumber = str2;
        this.idType = str3;
        this.cardType = str4;
        this.postCode = str5;
        this.postcodeSequenceString = str6;
        this.provinceCode = str7;
        this.mailingPostCode = str8;
        this.mailingPostcodeSequenceString = str9;
        this.mailingProvinceCode = str10;
        this.serviceType = str11;
        this.subscriberNumber = str12;
        this.cutSimPostcode = str13;
        this.pinCode = str14;
        this.requestOtpResponse = mnpRequestOtpResponse;
        this.checkSimInfoResponse = mnpCheckSimInfoResponse;
        this.checkSimStockError = errorCollection;
        this.selectedPackage = packageSetListItem;
        this.mrtrConsentId = str15;
        this.nontelcoConsentType = str16;
        this.consentVersionLabel = str17;
        this.otpCode = str18;
        this.attachmentNames = attachmentNames;
        this.addressMailingData = addressMailingData;
        this.legalAddressPostCode = str19;
        this.gender = str20;
        this.cutSimStockResponse = cutSimStockResponse;
        this.cutSimStockError = errorCollection2;
        this.mnpSubmitResponse = mrtrMnpSubmitResponse;
        this.imageOptionalsName = list;
        this.lastNamePhotoMultiple = i;
        this.authorizeResponse = mnpAuthorizationResponse;
        this.faceCompareResult = faceCompareResult;
        this.compareResponse = faceRecResponse;
        this.compareResponseForSubmit = faceCompareResponse;
        this.currentFormType = currentFormType;
        this.idDocumentResultForOcr = idDocumentResult;
        this.idDocumentResultForCompare = idDocumentResult2;
    }

    public /* synthetic */ MrtrMnp(boolean z, boolean z2, boolean z3, String str, boolean z4, Boolean bool, Boolean bool2, CheckSimStockResponse checkSimStockResponse, IdCardInformationCollection idCardInformationCollection, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, MnpRequestOtpResponse mnpRequestOtpResponse, MnpCheckSimInfoResponse mnpCheckSimInfoResponse, ErrorCollection errorCollection, PackageSetListItem packageSetListItem, String str15, String str16, String str17, String str18, List list, AddressMailingData addressMailingData, String str19, String str20, CutSimStockResponse cutSimStockResponse, ErrorCollection errorCollection2, MrtrMnpSubmitResponse mrtrMnpSubmitResponse, List list2, int i, MnpAuthorizationResponse mnpAuthorizationResponse, FaceCompareResult faceCompareResult, FaceRecResponse faceRecResponse, FaceCompareResponse faceCompareResponse, UpPassFormType upPassFormType, IdDocumentResult idDocumentResult, IdDocumentResult idDocumentResult2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : checkSimStockResponse, (i2 & 256) != 0 ? null : idCardInformationCollection, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : str5, (i2 & 8192) != 0 ? null : str6, (i2 & 16384) != 0 ? null : str7, (i2 & 32768) != 0 ? null : str8, (i2 & 65536) != 0 ? null : str9, (i2 & 131072) != 0 ? null : str10, (i2 & 262144) != 0 ? null : str11, (i2 & 524288) != 0 ? null : str12, (i2 & 1048576) != 0 ? null : str13, (i2 & 2097152) != 0 ? null : str14, (i2 & 4194304) != 0 ? null : mnpRequestOtpResponse, (i2 & 8388608) != 0 ? null : mnpCheckSimInfoResponse, (i2 & 16777216) != 0 ? null : errorCollection, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : packageSetListItem, (i2 & 67108864) != 0 ? null : str15, (i2 & 134217728) != 0 ? null : str16, (i2 & 268435456) != 0 ? null : str17, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? null : str18, (i2 & 1073741824) != 0 ? new ArrayList() : list, (i2 & Integer.MIN_VALUE) != 0 ? null : addressMailingData, (i3 & 1) != 0 ? null : str19, (i3 & 2) != 0 ? null : str20, (i3 & 4) != 0 ? null : cutSimStockResponse, (i3 & 8) != 0 ? null : errorCollection2, (i3 & 16) != 0 ? null : mrtrMnpSubmitResponse, (i3 & 32) != 0 ? null : list2, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? null : mnpAuthorizationResponse, (i3 & 256) != 0 ? null : faceCompareResult, (i3 & 512) != 0 ? null : faceRecResponse, (i3 & 1024) != 0 ? null : faceCompareResponse, (i3 & 2048) != 0 ? new UpPassFormType.Ocr(null, null, false, null, 15, null) : upPassFormType, (i3 & 4096) != 0 ? null : idDocumentResult, (i3 & 8192) != 0 ? null : idDocumentResult2);
    }
}