package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

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
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.LegalAddress;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.model.postpaid.PackageSet;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u008f\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102¢\u0006\u0002\u00103J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0017HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\u0098\u0003\u0010»\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010.\u001a\u00020\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u000102HÆ\u0001¢\u0006\u0003\u0010¼\u0001J\u0015\u0010½\u0001\u001a\u00020\u00172\t\u0010¾\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¿\u0001\u001a\u00020\u0012HÖ\u0001J\n\u0010À\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010=\"\u0004\bY\u0010?R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010=\"\u0004\b_\u0010?R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010=\"\u0004\ba\u0010?R\u001a\u0010#\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010b\"\u0004\bc\u0010dR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010b\"\u0004\be\u0010dR\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010=\"\u0004\bg\u0010?R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010=\"\u0004\bm\u0010?R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010=\"\u0004\bs\u0010?R\u001a\u0010.\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010=\"\u0004\bu\u0010?R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010=\"\u0004\bw\u0010?R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010=\"\u0004\b}\u0010?R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010=\"\u0004\b\u007f\u0010?R#\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0084\u0001\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R \u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010=\"\u0005\b\u008e\u0001\u0010?R\u001c\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010=\"\u0005\b\u0090\u0001\u0010?R\u001e\u0010\u001b\u001a\u00020\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010=\"\u0005\b\u0096\u0001\u0010?¨\u0006Á\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/MrtrPre2PostModel;", "", "companyCode", "", "customerNumber", "hardwareNumber", "existingHardwareNumber", "existingBrand", "existingModel", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "packageGroupType", "idNumber", "idCardType", "idCardInformationCollection", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "postCodeFromSmartCard", "postcode", "postcodeSequence", "", "canBuyDeviceWithContract", "referenceDocListFileName", "", "isSmartCard", "", "faceRecResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "verifyType", "verifyAttemp", "newIMEIResponse", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "nontelcoConsentType", "consentVersionLabel", "mrtrConsentId", "consentType", "consentVersion", "isShowConsent", "simCardNumber", "addressMailingData", "Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "addressLegalData", "Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;", "legalAddressPostCode", "mPackage", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "packageSetRetailer", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "otpCode", "getPre2PostProfile", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileResponse;", "recommendedPackageResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Ljava/lang/String;ILth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;)V", "getAddressLegalData", "()Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;", "setAddressLegalData", "(Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;)V", "getAddressMailingData", "()Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "setAddressMailingData", "(Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;)V", "getCanBuyDeviceWithContract", "()Ljava/lang/String;", "setCanBuyDeviceWithContract", "(Ljava/lang/String;)V", "getCompanyCode", "setCompanyCode", "getConsentType", "setConsentType", "getConsentVersion", "setConsentVersion", "getConsentVersionLabel", "setConsentVersionLabel", "getCustomerNumber", "setCustomerNumber", "getExistingBrand", "setExistingBrand", "getExistingHardwareNumber", "setExistingHardwareNumber", "getExistingModel", "setExistingModel", "getFaceRecResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setFaceRecResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getGetPre2PostProfile", "()Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileResponse;", "setGetPre2PostProfile", "(Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileResponse;)V", "getHardwareNumber", "setHardwareNumber", "getIdCardInformationCollection", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setIdCardInformationCollection", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getIdCardType", "setIdCardType", "getIdNumber", "setIdNumber", "()Z", "setShowConsent", "(Z)V", "setSmartCard", "getLegalAddressPostCode", "setLegalAddressPostCode", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "getMrtrConsentId", "setMrtrConsentId", "getNewIMEIResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "setNewIMEIResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;)V", "getNontelcoConsentType", "setNontelcoConsentType", "getOtpCode", "setOtpCode", "getPackageGroupType", "setPackageGroupType", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "setPackageSetRetailer", "(Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;)V", "getPostCodeFromSmartCard", "setPostCodeFromSmartCard", "getPostcode", "setPostcode", "getPostcodeSequence", "()Ljava/lang/Integer;", "setPostcodeSequence", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRecommendedPackageResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "setRecommendedPackageResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;)V", "getReferenceDocListFileName", "()Ljava/util/List;", "setReferenceDocListFileName", "(Ljava/util/List;)V", "getSimCardNumber", "setSimCardNumber", "getSubscriberNumber", "setSubscriberNumber", "getVerifyAttemp", "()I", "setVerifyAttemp", "(I)V", "getVerifyType", "setVerifyType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Ljava/lang/String;ILth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;)Lth/co/dtac/android/dtacone/model/mrtr_pre2post/MrtrPre2PostModel;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.MrtrPre2PostModel */
/* loaded from: classes8.dex */
public final class MrtrPre2PostModel {
    public static final int $stable = 8;
    @Nullable
    private LegalAddress addressLegalData;
    @Nullable
    private AddressMailingData addressMailingData;
    @Nullable
    private String canBuyDeviceWithContract;
    @NotNull
    private String companyCode;
    @NotNull
    private String consentType;
    @NotNull
    private String consentVersion;
    @NotNull
    private String consentVersionLabel;
    @NotNull
    private String customerNumber;
    @NotNull
    private String existingBrand;
    @NotNull
    private String existingHardwareNumber;
    @NotNull
    private String existingModel;
    @Nullable
    private FaceRecResponse faceRecResponse;
    @Nullable
    private GetPre2PostMobileResponse getPre2PostProfile;
    @NotNull
    private String hardwareNumber;
    @Nullable
    private IdCardInformationCollection idCardInformationCollection;
    @NotNull
    private String idCardType;
    @NotNull
    private String idNumber;
    private boolean isShowConsent;
    private boolean isSmartCard;
    @NotNull
    private String legalAddressPostCode;
    @Nullable
    private Package mPackage;
    @NotNull
    private String mrtrConsentId;
    @Nullable
    private GetNewIMEIResponse newIMEIResponse;
    @NotNull
    private String nontelcoConsentType;
    @NotNull
    private String otpCode;
    @NotNull
    private String packageGroupType;
    @Nullable
    private PackageSet packageSetRetailer;
    @Nullable
    private String postCodeFromSmartCard;
    @Nullable
    private String postcode;
    @Nullable
    private Integer postcodeSequence;
    @Nullable
    private RecommendPackageResponse recommendedPackageResponse;
    @NotNull
    private List<String> referenceDocListFileName;
    @NotNull
    private String simCardNumber;
    @NotNull
    private String subscriberNumber;
    private int verifyAttemp;
    @NotNull
    private String verifyType;

    public MrtrPre2PostModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -1, 15, null);
    }

    @NotNull
    public final String component1() {
        return this.companyCode;
    }

    @NotNull
    public final String component10() {
        return this.idCardType;
    }

    @Nullable
    public final IdCardInformationCollection component11() {
        return this.idCardInformationCollection;
    }

    @Nullable
    public final String component12() {
        return this.postCodeFromSmartCard;
    }

    @Nullable
    public final String component13() {
        return this.postcode;
    }

    @Nullable
    public final Integer component14() {
        return this.postcodeSequence;
    }

    @Nullable
    public final String component15() {
        return this.canBuyDeviceWithContract;
    }

    @NotNull
    public final List<String> component16() {
        return this.referenceDocListFileName;
    }

    public final boolean component17() {
        return this.isSmartCard;
    }

    @Nullable
    public final FaceRecResponse component18() {
        return this.faceRecResponse;
    }

    @NotNull
    public final String component19() {
        return this.verifyType;
    }

    @NotNull
    public final String component2() {
        return this.customerNumber;
    }

    public final int component20() {
        return this.verifyAttemp;
    }

    @Nullable
    public final GetNewIMEIResponse component21() {
        return this.newIMEIResponse;
    }

    @NotNull
    public final String component22() {
        return this.nontelcoConsentType;
    }

    @NotNull
    public final String component23() {
        return this.consentVersionLabel;
    }

    @NotNull
    public final String component24() {
        return this.mrtrConsentId;
    }

    @NotNull
    public final String component25() {
        return this.consentType;
    }

    @NotNull
    public final String component26() {
        return this.consentVersion;
    }

    public final boolean component27() {
        return this.isShowConsent;
    }

    @NotNull
    public final String component28() {
        return this.simCardNumber;
    }

    @Nullable
    public final AddressMailingData component29() {
        return this.addressMailingData;
    }

    @NotNull
    public final String component3() {
        return this.hardwareNumber;
    }

    @Nullable
    public final LegalAddress component30() {
        return this.addressLegalData;
    }

    @NotNull
    public final String component31() {
        return this.legalAddressPostCode;
    }

    @Nullable
    public final Package component32() {
        return this.mPackage;
    }

    @Nullable
    public final PackageSet component33() {
        return this.packageSetRetailer;
    }

    @NotNull
    public final String component34() {
        return this.otpCode;
    }

    @Nullable
    public final GetPre2PostMobileResponse component35() {
        return this.getPre2PostProfile;
    }

    @Nullable
    public final RecommendPackageResponse component36() {
        return this.recommendedPackageResponse;
    }

    @NotNull
    public final String component4() {
        return this.existingHardwareNumber;
    }

    @NotNull
    public final String component5() {
        return this.existingBrand;
    }

    @NotNull
    public final String component6() {
        return this.existingModel;
    }

    @NotNull
    public final String component7() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component8() {
        return this.packageGroupType;
    }

    @NotNull
    public final String component9() {
        return this.idNumber;
    }

    @NotNull
    public final MrtrPre2PostModel copy(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String existingHardwareNumber, @NotNull String existingBrand, @NotNull String existingModel, @NotNull String subscriberNumber, @NotNull String packageGroupType, @NotNull String idNumber, @NotNull String idCardType, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull List<String> referenceDocListFileName, boolean z, @Nullable FaceRecResponse faceRecResponse, @NotNull String verifyType, int i, @Nullable GetNewIMEIResponse getNewIMEIResponse, @NotNull String nontelcoConsentType, @NotNull String consentVersionLabel, @NotNull String mrtrConsentId, @NotNull String consentType, @NotNull String consentVersion, boolean z2, @NotNull String simCardNumber, @Nullable AddressMailingData addressMailingData, @Nullable LegalAddress legalAddress, @NotNull String legalAddressPostCode, @Nullable Package r71, @Nullable PackageSet packageSet, @NotNull String otpCode, @Nullable GetPre2PostMobileResponse getPre2PostMobileResponse, @Nullable RecommendPackageResponse recommendPackageResponse) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(existingHardwareNumber, "existingHardwareNumber");
        Intrinsics.checkNotNullParameter(existingBrand, "existingBrand");
        Intrinsics.checkNotNullParameter(existingModel, "existingModel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(nontelcoConsentType, "nontelcoConsentType");
        Intrinsics.checkNotNullParameter(consentVersionLabel, "consentVersionLabel");
        Intrinsics.checkNotNullParameter(mrtrConsentId, "mrtrConsentId");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(legalAddressPostCode, "legalAddressPostCode");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        return new MrtrPre2PostModel(companyCode, customerNumber, hardwareNumber, existingHardwareNumber, existingBrand, existingModel, subscriberNumber, packageGroupType, idNumber, idCardType, idCardInformationCollection, str, str2, num, str3, referenceDocListFileName, z, faceRecResponse, verifyType, i, getNewIMEIResponse, nontelcoConsentType, consentVersionLabel, mrtrConsentId, consentType, consentVersion, z2, simCardNumber, addressMailingData, legalAddress, legalAddressPostCode, r71, packageSet, otpCode, getPre2PostMobileResponse, recommendPackageResponse);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPre2PostModel) {
            MrtrPre2PostModel mrtrPre2PostModel = (MrtrPre2PostModel) obj;
            return Intrinsics.areEqual(this.companyCode, mrtrPre2PostModel.companyCode) && Intrinsics.areEqual(this.customerNumber, mrtrPre2PostModel.customerNumber) && Intrinsics.areEqual(this.hardwareNumber, mrtrPre2PostModel.hardwareNumber) && Intrinsics.areEqual(this.existingHardwareNumber, mrtrPre2PostModel.existingHardwareNumber) && Intrinsics.areEqual(this.existingBrand, mrtrPre2PostModel.existingBrand) && Intrinsics.areEqual(this.existingModel, mrtrPre2PostModel.existingModel) && Intrinsics.areEqual(this.subscriberNumber, mrtrPre2PostModel.subscriberNumber) && Intrinsics.areEqual(this.packageGroupType, mrtrPre2PostModel.packageGroupType) && Intrinsics.areEqual(this.idNumber, mrtrPre2PostModel.idNumber) && Intrinsics.areEqual(this.idCardType, mrtrPre2PostModel.idCardType) && Intrinsics.areEqual(this.idCardInformationCollection, mrtrPre2PostModel.idCardInformationCollection) && Intrinsics.areEqual(this.postCodeFromSmartCard, mrtrPre2PostModel.postCodeFromSmartCard) && Intrinsics.areEqual(this.postcode, mrtrPre2PostModel.postcode) && Intrinsics.areEqual(this.postcodeSequence, mrtrPre2PostModel.postcodeSequence) && Intrinsics.areEqual(this.canBuyDeviceWithContract, mrtrPre2PostModel.canBuyDeviceWithContract) && Intrinsics.areEqual(this.referenceDocListFileName, mrtrPre2PostModel.referenceDocListFileName) && this.isSmartCard == mrtrPre2PostModel.isSmartCard && Intrinsics.areEqual(this.faceRecResponse, mrtrPre2PostModel.faceRecResponse) && Intrinsics.areEqual(this.verifyType, mrtrPre2PostModel.verifyType) && this.verifyAttemp == mrtrPre2PostModel.verifyAttemp && Intrinsics.areEqual(this.newIMEIResponse, mrtrPre2PostModel.newIMEIResponse) && Intrinsics.areEqual(this.nontelcoConsentType, mrtrPre2PostModel.nontelcoConsentType) && Intrinsics.areEqual(this.consentVersionLabel, mrtrPre2PostModel.consentVersionLabel) && Intrinsics.areEqual(this.mrtrConsentId, mrtrPre2PostModel.mrtrConsentId) && Intrinsics.areEqual(this.consentType, mrtrPre2PostModel.consentType) && Intrinsics.areEqual(this.consentVersion, mrtrPre2PostModel.consentVersion) && this.isShowConsent == mrtrPre2PostModel.isShowConsent && Intrinsics.areEqual(this.simCardNumber, mrtrPre2PostModel.simCardNumber) && Intrinsics.areEqual(this.addressMailingData, mrtrPre2PostModel.addressMailingData) && Intrinsics.areEqual(this.addressLegalData, mrtrPre2PostModel.addressLegalData) && Intrinsics.areEqual(this.legalAddressPostCode, mrtrPre2PostModel.legalAddressPostCode) && Intrinsics.areEqual(this.mPackage, mrtrPre2PostModel.mPackage) && Intrinsics.areEqual(this.packageSetRetailer, mrtrPre2PostModel.packageSetRetailer) && Intrinsics.areEqual(this.otpCode, mrtrPre2PostModel.otpCode) && Intrinsics.areEqual(this.getPre2PostProfile, mrtrPre2PostModel.getPre2PostProfile) && Intrinsics.areEqual(this.recommendedPackageResponse, mrtrPre2PostModel.recommendedPackageResponse);
        }
        return false;
    }

    @Nullable
    public final LegalAddress getAddressLegalData() {
        return this.addressLegalData;
    }

    @Nullable
    public final AddressMailingData getAddressMailingData() {
        return this.addressMailingData;
    }

    @Nullable
    public final String getCanBuyDeviceWithContract() {
        return this.canBuyDeviceWithContract;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getConsentType() {
        return this.consentType;
    }

    @NotNull
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    @NotNull
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getExistingBrand() {
        return this.existingBrand;
    }

    @NotNull
    public final String getExistingHardwareNumber() {
        return this.existingHardwareNumber;
    }

    @NotNull
    public final String getExistingModel() {
        return this.existingModel;
    }

    @Nullable
    public final FaceRecResponse getFaceRecResponse() {
        return this.faceRecResponse;
    }

    @Nullable
    public final GetPre2PostMobileResponse getGetPre2PostProfile() {
        return this.getPre2PostProfile;
    }

    @NotNull
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @Nullable
    public final IdCardInformationCollection getIdCardInformationCollection() {
        return this.idCardInformationCollection;
    }

    @NotNull
    public final String getIdCardType() {
        return this.idCardType;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getLegalAddressPostCode() {
        return this.legalAddressPostCode;
    }

    @Nullable
    public final Package getMPackage() {
        return this.mPackage;
    }

    @NotNull
    public final String getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final GetNewIMEIResponse getNewIMEIResponse() {
        return this.newIMEIResponse;
    }

    @NotNull
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @NotNull
    public final String getOtpCode() {
        return this.otpCode;
    }

    @NotNull
    public final String getPackageGroupType() {
        return this.packageGroupType;
    }

    @Nullable
    public final PackageSet getPackageSetRetailer() {
        return this.packageSetRetailer;
    }

    @Nullable
    public final String getPostCodeFromSmartCard() {
        return this.postCodeFromSmartCard;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final Integer getPostcodeSequence() {
        return this.postcodeSequence;
    }

    @Nullable
    public final RecommendPackageResponse getRecommendedPackageResponse() {
        return this.recommendedPackageResponse;
    }

    @NotNull
    public final List<String> getReferenceDocListFileName() {
        return this.referenceDocListFileName;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public final int getVerifyAttemp() {
        return this.verifyAttemp;
    }

    @NotNull
    public final String getVerifyType() {
        return this.verifyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((this.companyCode.hashCode() * 31) + this.customerNumber.hashCode()) * 31) + this.hardwareNumber.hashCode()) * 31) + this.existingHardwareNumber.hashCode()) * 31) + this.existingBrand.hashCode()) * 31) + this.existingModel.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.packageGroupType.hashCode()) * 31) + this.idNumber.hashCode()) * 31) + this.idCardType.hashCode()) * 31;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformationCollection;
        int hashCode2 = (hashCode + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        String str = this.postCodeFromSmartCard;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postcode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.postcodeSequence;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.canBuyDeviceWithContract;
        int hashCode6 = (((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.referenceDocListFileName.hashCode()) * 31;
        boolean z = this.isSmartCard;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        int hashCode7 = (((((i2 + (faceRecResponse == null ? 0 : faceRecResponse.hashCode())) * 31) + this.verifyType.hashCode()) * 31) + this.verifyAttemp) * 31;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        int hashCode8 = (((((((((((hashCode7 + (getNewIMEIResponse == null ? 0 : getNewIMEIResponse.hashCode())) * 31) + this.nontelcoConsentType.hashCode()) * 31) + this.consentVersionLabel.hashCode()) * 31) + this.mrtrConsentId.hashCode()) * 31) + this.consentType.hashCode()) * 31) + this.consentVersion.hashCode()) * 31;
        boolean z2 = this.isShowConsent;
        int hashCode9 = (((hashCode8 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.simCardNumber.hashCode()) * 31;
        AddressMailingData addressMailingData = this.addressMailingData;
        int hashCode10 = (hashCode9 + (addressMailingData == null ? 0 : addressMailingData.hashCode())) * 31;
        LegalAddress legalAddress = this.addressLegalData;
        int hashCode11 = (((hashCode10 + (legalAddress == null ? 0 : legalAddress.hashCode())) * 31) + this.legalAddressPostCode.hashCode()) * 31;
        Package r1 = this.mPackage;
        int hashCode12 = (hashCode11 + (r1 == null ? 0 : r1.hashCode())) * 31;
        PackageSet packageSet = this.packageSetRetailer;
        int hashCode13 = (((hashCode12 + (packageSet == null ? 0 : packageSet.hashCode())) * 31) + this.otpCode.hashCode()) * 31;
        GetPre2PostMobileResponse getPre2PostMobileResponse = this.getPre2PostProfile;
        int hashCode14 = (hashCode13 + (getPre2PostMobileResponse == null ? 0 : getPre2PostMobileResponse.hashCode())) * 31;
        RecommendPackageResponse recommendPackageResponse = this.recommendedPackageResponse;
        return hashCode14 + (recommendPackageResponse != null ? recommendPackageResponse.hashCode() : 0);
    }

    public final boolean isShowConsent() {
        return this.isShowConsent;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAddressLegalData(@Nullable LegalAddress legalAddress) {
        this.addressLegalData = legalAddress;
    }

    public final void setAddressMailingData(@Nullable AddressMailingData addressMailingData) {
        this.addressMailingData = addressMailingData;
    }

    public final void setCanBuyDeviceWithContract(@Nullable String str) {
        this.canBuyDeviceWithContract = str;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setConsentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentType = str;
    }

    public final void setConsentVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentVersion = str;
    }

    public final void setConsentVersionLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentVersionLabel = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setExistingBrand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingBrand = str;
    }

    public final void setExistingHardwareNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingHardwareNumber = str;
    }

    public final void setExistingModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingModel = str;
    }

    public final void setFaceRecResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.faceRecResponse = faceRecResponse;
    }

    public final void setGetPre2PostProfile(@Nullable GetPre2PostMobileResponse getPre2PostMobileResponse) {
        this.getPre2PostProfile = getPre2PostMobileResponse;
    }

    public final void setHardwareNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareNumber = str;
    }

    public final void setIdCardInformationCollection(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.idCardInformationCollection = idCardInformationCollection;
    }

    public final void setIdCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idCardType = str;
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setLegalAddressPostCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.legalAddressPostCode = str;
    }

    public final void setMPackage(@Nullable Package r1) {
        this.mPackage = r1;
    }

    public final void setMrtrConsentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mrtrConsentId = str;
    }

    public final void setNewIMEIResponse(@Nullable GetNewIMEIResponse getNewIMEIResponse) {
        this.newIMEIResponse = getNewIMEIResponse;
    }

    public final void setNontelcoConsentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nontelcoConsentType = str;
    }

    public final void setOtpCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpCode = str;
    }

    public final void setPackageGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupType = str;
    }

    public final void setPackageSetRetailer(@Nullable PackageSet packageSet) {
        this.packageSetRetailer = packageSet;
    }

    public final void setPostCodeFromSmartCard(@Nullable String str) {
        this.postCodeFromSmartCard = str;
    }

    public final void setPostcode(@Nullable String str) {
        this.postcode = str;
    }

    public final void setPostcodeSequence(@Nullable Integer num) {
        this.postcodeSequence = num;
    }

    public final void setRecommendedPackageResponse(@Nullable RecommendPackageResponse recommendPackageResponse) {
        this.recommendedPackageResponse = recommendPackageResponse;
    }

    public final void setReferenceDocListFileName(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.referenceDocListFileName = list;
    }

    public final void setShowConsent(boolean z) {
        this.isShowConsent = z;
    }

    public final void setSimCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simCardNumber = str;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setVerifyAttemp(int i) {
        this.verifyAttemp = i;
    }

    public final void setVerifyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyType = str;
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.customerNumber;
        String str3 = this.hardwareNumber;
        String str4 = this.existingHardwareNumber;
        String str5 = this.existingBrand;
        String str6 = this.existingModel;
        String str7 = this.subscriberNumber;
        String str8 = this.packageGroupType;
        String str9 = this.idNumber;
        String str10 = this.idCardType;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformationCollection;
        String str11 = this.postCodeFromSmartCard;
        String str12 = this.postcode;
        Integer num = this.postcodeSequence;
        String str13 = this.canBuyDeviceWithContract;
        List<String> list = this.referenceDocListFileName;
        boolean z = this.isSmartCard;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        String str14 = this.verifyType;
        int i = this.verifyAttemp;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        String str15 = this.nontelcoConsentType;
        String str16 = this.consentVersionLabel;
        String str17 = this.mrtrConsentId;
        String str18 = this.consentType;
        String str19 = this.consentVersion;
        boolean z2 = this.isShowConsent;
        String str20 = this.simCardNumber;
        AddressMailingData addressMailingData = this.addressMailingData;
        LegalAddress legalAddress = this.addressLegalData;
        String str21 = this.legalAddressPostCode;
        Package r15 = this.mPackage;
        PackageSet packageSet = this.packageSetRetailer;
        String str22 = this.otpCode;
        GetPre2PostMobileResponse getPre2PostMobileResponse = this.getPre2PostProfile;
        RecommendPackageResponse recommendPackageResponse = this.recommendedPackageResponse;
        return "MrtrPre2PostModel(companyCode=" + str + ", customerNumber=" + str2 + ", hardwareNumber=" + str3 + ", existingHardwareNumber=" + str4 + ", existingBrand=" + str5 + ", existingModel=" + str6 + ", subscriberNumber=" + str7 + ", packageGroupType=" + str8 + ", idNumber=" + str9 + ", idCardType=" + str10 + ", idCardInformationCollection=" + idCardInformationCollection + ", postCodeFromSmartCard=" + str11 + ", postcode=" + str12 + ", postcodeSequence=" + num + ", canBuyDeviceWithContract=" + str13 + ", referenceDocListFileName=" + list + ", isSmartCard=" + z + ", faceRecResponse=" + faceRecResponse + ", verifyType=" + str14 + ", verifyAttemp=" + i + ", newIMEIResponse=" + getNewIMEIResponse + ", nontelcoConsentType=" + str15 + ", consentVersionLabel=" + str16 + ", mrtrConsentId=" + str17 + ", consentType=" + str18 + ", consentVersion=" + str19 + ", isShowConsent=" + z2 + ", simCardNumber=" + str20 + ", addressMailingData=" + addressMailingData + ", addressLegalData=" + legalAddress + ", legalAddressPostCode=" + str21 + ", mPackage=" + r15 + ", packageSetRetailer=" + packageSet + ", otpCode=" + str22 + ", getPre2PostProfile=" + getPre2PostMobileResponse + ", recommendedPackageResponse=" + recommendPackageResponse + ")";
    }

    public MrtrPre2PostModel(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String existingHardwareNumber, @NotNull String existingBrand, @NotNull String existingModel, @NotNull String subscriberNumber, @NotNull String packageGroupType, @NotNull String idNumber, @NotNull String idCardType, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull List<String> referenceDocListFileName, boolean z, @Nullable FaceRecResponse faceRecResponse, @NotNull String verifyType, int i, @Nullable GetNewIMEIResponse getNewIMEIResponse, @NotNull String nontelcoConsentType, @NotNull String consentVersionLabel, @NotNull String mrtrConsentId, @NotNull String consentType, @NotNull String consentVersion, boolean z2, @NotNull String simCardNumber, @Nullable AddressMailingData addressMailingData, @Nullable LegalAddress legalAddress, @NotNull String legalAddressPostCode, @Nullable Package r48, @Nullable PackageSet packageSet, @NotNull String otpCode, @Nullable GetPre2PostMobileResponse getPre2PostMobileResponse, @Nullable RecommendPackageResponse recommendPackageResponse) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(existingHardwareNumber, "existingHardwareNumber");
        Intrinsics.checkNotNullParameter(existingBrand, "existingBrand");
        Intrinsics.checkNotNullParameter(existingModel, "existingModel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(nontelcoConsentType, "nontelcoConsentType");
        Intrinsics.checkNotNullParameter(consentVersionLabel, "consentVersionLabel");
        Intrinsics.checkNotNullParameter(mrtrConsentId, "mrtrConsentId");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(legalAddressPostCode, "legalAddressPostCode");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.hardwareNumber = hardwareNumber;
        this.existingHardwareNumber = existingHardwareNumber;
        this.existingBrand = existingBrand;
        this.existingModel = existingModel;
        this.subscriberNumber = subscriberNumber;
        this.packageGroupType = packageGroupType;
        this.idNumber = idNumber;
        this.idCardType = idCardType;
        this.idCardInformationCollection = idCardInformationCollection;
        this.postCodeFromSmartCard = str;
        this.postcode = str2;
        this.postcodeSequence = num;
        this.canBuyDeviceWithContract = str3;
        this.referenceDocListFileName = referenceDocListFileName;
        this.isSmartCard = z;
        this.faceRecResponse = faceRecResponse;
        this.verifyType = verifyType;
        this.verifyAttemp = i;
        this.newIMEIResponse = getNewIMEIResponse;
        this.nontelcoConsentType = nontelcoConsentType;
        this.consentVersionLabel = consentVersionLabel;
        this.mrtrConsentId = mrtrConsentId;
        this.consentType = consentType;
        this.consentVersion = consentVersion;
        this.isShowConsent = z2;
        this.simCardNumber = simCardNumber;
        this.addressMailingData = addressMailingData;
        this.addressLegalData = legalAddress;
        this.legalAddressPostCode = legalAddressPostCode;
        this.mPackage = r48;
        this.packageSetRetailer = packageSet;
        this.otpCode = otpCode;
        this.getPre2PostProfile = getPre2PostMobileResponse;
        this.recommendedPackageResponse = recommendPackageResponse;
    }

    public /* synthetic */ MrtrPre2PostModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, IdCardInformationCollection idCardInformationCollection, String str11, String str12, Integer num, String str13, List list, boolean z, FaceRecResponse faceRecResponse, String str14, int i, GetNewIMEIResponse getNewIMEIResponse, String str15, String str16, String str17, String str18, String str19, boolean z2, String str20, AddressMailingData addressMailingData, LegalAddress legalAddress, String str21, Package r68, PackageSet packageSet, String str22, GetPre2PostMobileResponse getPre2PostMobileResponse, RecommendPackageResponse recommendPackageResponse, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "01" : str10, (i2 & 1024) != 0 ? null : idCardInformationCollection, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : str12, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? null : str13, (i2 & 32768) != 0 ? new ArrayList() : list, (i2 & 65536) != 0 ? false : z, (i2 & 131072) != 0 ? null : faceRecResponse, (i2 & 262144) != 0 ? "" : str14, (i2 & 524288) != 0 ? 0 : i, (i2 & 1048576) != 0 ? null : getNewIMEIResponse, (i2 & 2097152) != 0 ? "" : str15, (i2 & 4194304) != 0 ? "" : str16, (i2 & 8388608) != 0 ? "" : str17, (i2 & 16777216) != 0 ? "" : str18, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str19, (i2 & 67108864) == 0 ? z2 : false, (i2 & 134217728) != 0 ? "" : str20, (i2 & 268435456) != 0 ? null : addressMailingData, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? null : legalAddress, (i2 & 1073741824) != 0 ? "" : str21, (i2 & Integer.MIN_VALUE) != 0 ? null : r68, (i3 & 1) != 0 ? null : packageSet, (i3 & 2) != 0 ? "" : str22, (i3 & 4) != 0 ? null : getPre2PostMobileResponse, (i3 & 8) != 0 ? null : recommendPackageResponse);
    }
}