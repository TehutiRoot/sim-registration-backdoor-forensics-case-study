package th.p047co.dtac.android.dtacone.model.appOne.change_owner;

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
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.classify.OneClassifyCardTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_sim.PrepaidProfileItem;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0080\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020-\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0003¢\u0006\u0002\u00100J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u001aHÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u001fHÆ\u0003J\u0010\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u001aHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\nHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020-HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010£\u0001\u001a\u00020\nHÆ\u0003J\n\u0010¤\u0001\u001a\u00020\nHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u008c\u0003\u0010¨\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u0003HÆ\u0001J\u0015\u0010©\u0001\u001a\u00020\u00032\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010«\u0001\u001a\u00020\u001fHÖ\u0001J\n\u0010¬\u0001\u001a\u00020\nHÖ\u0001R \u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00106\"\u0004\bB\u00108R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00106\"\u0004\bH\u00108R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00106\"\u0004\bL\u00108R\u001c\u0010+\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010\"\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00106\"\u0004\bV\u00108R\u001a\u0010'\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010W\"\u0004\bX\u0010YR\u001a\u0010.\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010W\"\u0004\bZ\u0010YR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010W\"\u0004\b[\u0010YR\u001a\u0010/\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010W\"\u0004\b\\\u0010YR\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010W\"\u0004\b]\u0010YR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010W\"\u0004\b^\u0010YR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010W\"\u0004\b_\u0010YR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00106\"\u0004\be\u00108R\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00106\"\u0004\bg\u00108R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00106\"\u0004\bi\u00108R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00106\"\u0004\bk\u00108R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00102\"\u0004\bm\u00104R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010W\"\u0004\bo\u0010YR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u00106\"\u0004\bq\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u00106\"\u0004\bs\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u00106\"\u0004\bu\u00108R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010N\"\u0004\bw\u0010PR\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR \u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u001d\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u00106\"\u0005\b\u0085\u0001\u00108¨\u0006\u00ad\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneChangeOwnerModel;", "", "requireFaceRecognition", "", "isNewOwner", "updateForm", "Lth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;", "consentNonTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "consentType", "", "consentVersion", "isShowConsent", "ocrIdCardNumber", "cameraBirthDate", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "companyCode", "customerNumber", "simcardNumber", "subscriberStatus", "cardInformationCollection", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "isSmartCard", "faceRecResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "referenceDocListFileName", "", "postcode", "postcodeSequence", "verifyType", "kycAttemp", "", "attachmentNames", "otpCode", "identityNumber", "validateSimResponse", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_sim/PrepaidProfileItem;", "classifyCardType", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/classify/OneClassifyCardTypeResponse;", "isAllowManualKYC", "isRequireLiveness", "upPassResult", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "faceCompareResult", "upPassStepState", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;", "isBackFromSelfieOCRDipChip", "isOverruleXSim", "(ZZLth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;ZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_sim/PrepaidProfileItem;Lth/co/dtac/android/dtacone/model/appOne/change_owner/classify/OneClassifyCardTypeResponse;ZZLth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;ZZ)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getCameraBirthDate", "()Ljava/lang/String;", "setCameraBirthDate", "(Ljava/lang/String;)V", "getCardInformationCollection", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformationCollection", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getClassifyCardType", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/classify/OneClassifyCardTypeResponse;", "setClassifyCardType", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/classify/OneClassifyCardTypeResponse;)V", "getCompanyCode", "setCompanyCode", "getConsentNonTelco", "()Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "setConsentNonTelco", "(Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;)V", "getConsentType", "setConsentType", "getConsentVersion", "setConsentVersion", "getCustomerNumber", "setCustomerNumber", "getFaceCompareResult", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "setFaceCompareResult", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;)V", "getFaceRecResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setFaceRecResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getIdentityNumber", "setIdentityNumber", "()Z", "setAllowManualKYC", "(Z)V", "setBackFromSelfieOCRDipChip", "setNewOwner", "setOverruleXSim", "setRequireLiveness", "setShowConsent", "setSmartCard", "getKycAttemp", "()I", "setKycAttemp", "(I)V", "getOcrIdCardNumber", "setOcrIdCardNumber", "getOtpCode", "setOtpCode", "getPostcode", "setPostcode", "getPostcodeSequence", "setPostcodeSequence", "getReferenceDocListFileName", "setReferenceDocListFileName", "getRequireFaceRecognition", "setRequireFaceRecognition", "getSimcardNumber", "setSimcardNumber", "getSubscriberNumber", "setSubscriberNumber", "getSubscriberStatus", "setSubscriberStatus", "getUpPassResult", "setUpPassResult", "getUpPassStepState", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;", "setUpPassStepState", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;)V", "getUpdateForm", "()Lth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;", "setUpdateForm", "(Lth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;)V", "getValidateSimResponse", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_sim/PrepaidProfileItem;", "setValidateSimResponse", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_sim/PrepaidProfileItem;)V", "getVerifyType", "setVerifyType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.change_owner.OneChangeOwnerModel */
/* loaded from: classes8.dex */
public final class OneChangeOwnerModel {
    public static final int $stable = 8;
    @NotNull
    private List<String> attachmentNames;
    @Nullable
    private String cameraBirthDate;
    @Nullable
    private IdCardInformationCollection cardInformationCollection;
    @Nullable
    private OneClassifyCardTypeResponse classifyCardType;
    @Nullable
    private String companyCode;
    @Nullable
    private ConsentNonTelco consentNonTelco;
    @NotNull
    private String consentType;
    @NotNull
    private String consentVersion;
    @Nullable
    private String customerNumber;
    @Nullable
    private UpPassFormResult faceCompareResult;
    @Nullable
    private FaceRecResponse faceRecResponse;
    @NotNull
    private String identityNumber;
    private boolean isAllowManualKYC;
    private boolean isBackFromSelfieOCRDipChip;
    private boolean isNewOwner;
    private boolean isOverruleXSim;
    private boolean isRequireLiveness;
    private boolean isShowConsent;
    private boolean isSmartCard;
    private int kycAttemp;
    @Nullable
    private String ocrIdCardNumber;
    @NotNull
    private String otpCode;
    @Nullable
    private String postcode;
    @Nullable
    private String postcodeSequence;
    @NotNull
    private List<String> referenceDocListFileName;
    private boolean requireFaceRecognition;
    @Nullable
    private String simcardNumber;
    @Nullable
    private String subscriberNumber;
    @Nullable
    private String subscriberStatus;
    @Nullable
    private UpPassFormResult upPassResult;
    @NotNull
    private UpPassStepState upPassStepState;
    @Nullable
    private UpdateProfileFormCollection updateForm;
    @Nullable
    private PrepaidProfileItem validateSimResponse;
    @NotNull
    private String verifyType;

    public OneChangeOwnerModel() {
        this(false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, false, false, -1, 3, null);
    }

    public final boolean component1() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String component10() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component11() {
        return this.companyCode;
    }

    @Nullable
    public final String component12() {
        return this.customerNumber;
    }

    @Nullable
    public final String component13() {
        return this.simcardNumber;
    }

    @Nullable
    public final String component14() {
        return this.subscriberStatus;
    }

    @Nullable
    public final IdCardInformationCollection component15() {
        return this.cardInformationCollection;
    }

    public final boolean component16() {
        return this.isSmartCard;
    }

    @Nullable
    public final FaceRecResponse component17() {
        return this.faceRecResponse;
    }

    @NotNull
    public final List<String> component18() {
        return this.referenceDocListFileName;
    }

    @Nullable
    public final String component19() {
        return this.postcode;
    }

    public final boolean component2() {
        return this.isNewOwner;
    }

    @Nullable
    public final String component20() {
        return this.postcodeSequence;
    }

    @NotNull
    public final String component21() {
        return this.verifyType;
    }

    public final int component22() {
        return this.kycAttemp;
    }

    @NotNull
    public final List<String> component23() {
        return this.attachmentNames;
    }

    @NotNull
    public final String component24() {
        return this.otpCode;
    }

    @NotNull
    public final String component25() {
        return this.identityNumber;
    }

    @Nullable
    public final PrepaidProfileItem component26() {
        return this.validateSimResponse;
    }

    @Nullable
    public final OneClassifyCardTypeResponse component27() {
        return this.classifyCardType;
    }

    public final boolean component28() {
        return this.isAllowManualKYC;
    }

    public final boolean component29() {
        return this.isRequireLiveness;
    }

    @Nullable
    public final UpdateProfileFormCollection component3() {
        return this.updateForm;
    }

    @Nullable
    public final UpPassFormResult component30() {
        return this.upPassResult;
    }

    @Nullable
    public final UpPassFormResult component31() {
        return this.faceCompareResult;
    }

    @NotNull
    public final UpPassStepState component32() {
        return this.upPassStepState;
    }

    public final boolean component33() {
        return this.isBackFromSelfieOCRDipChip;
    }

    public final boolean component34() {
        return this.isOverruleXSim;
    }

    @Nullable
    public final ConsentNonTelco component4() {
        return this.consentNonTelco;
    }

    @NotNull
    public final String component5() {
        return this.consentType;
    }

    @NotNull
    public final String component6() {
        return this.consentVersion;
    }

    public final boolean component7() {
        return this.isShowConsent;
    }

    @Nullable
    public final String component8() {
        return this.ocrIdCardNumber;
    }

    @Nullable
    public final String component9() {
        return this.cameraBirthDate;
    }

    @NotNull
    public final OneChangeOwnerModel copy(boolean z, boolean z2, @Nullable UpdateProfileFormCollection updateProfileFormCollection, @Nullable ConsentNonTelco consentNonTelco, @NotNull String consentType, @NotNull String consentVersion, boolean z3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable IdCardInformationCollection idCardInformationCollection, boolean z4, @Nullable FaceRecResponse faceRecResponse, @NotNull List<String> referenceDocListFileName, @Nullable String str8, @Nullable String str9, @NotNull String verifyType, int i, @NotNull List<String> attachmentNames, @NotNull String otpCode, @NotNull String identityNumber, @Nullable PrepaidProfileItem prepaidProfileItem, @Nullable OneClassifyCardTypeResponse oneClassifyCardTypeResponse, boolean z5, boolean z6, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @NotNull UpPassStepState upPassStepState, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(identityNumber, "identityNumber");
        Intrinsics.checkNotNullParameter(upPassStepState, "upPassStepState");
        return new OneChangeOwnerModel(z, z2, updateProfileFormCollection, consentNonTelco, consentType, consentVersion, z3, str, str2, str3, str4, str5, str6, str7, idCardInformationCollection, z4, faceRecResponse, referenceDocListFileName, str8, str9, verifyType, i, attachmentNames, otpCode, identityNumber, prepaidProfileItem, oneClassifyCardTypeResponse, z5, z6, upPassFormResult, upPassFormResult2, upPassStepState, z7, z8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneChangeOwnerModel) {
            OneChangeOwnerModel oneChangeOwnerModel = (OneChangeOwnerModel) obj;
            return this.requireFaceRecognition == oneChangeOwnerModel.requireFaceRecognition && this.isNewOwner == oneChangeOwnerModel.isNewOwner && Intrinsics.areEqual(this.updateForm, oneChangeOwnerModel.updateForm) && Intrinsics.areEqual(this.consentNonTelco, oneChangeOwnerModel.consentNonTelco) && Intrinsics.areEqual(this.consentType, oneChangeOwnerModel.consentType) && Intrinsics.areEqual(this.consentVersion, oneChangeOwnerModel.consentVersion) && this.isShowConsent == oneChangeOwnerModel.isShowConsent && Intrinsics.areEqual(this.ocrIdCardNumber, oneChangeOwnerModel.ocrIdCardNumber) && Intrinsics.areEqual(this.cameraBirthDate, oneChangeOwnerModel.cameraBirthDate) && Intrinsics.areEqual(this.subscriberNumber, oneChangeOwnerModel.subscriberNumber) && Intrinsics.areEqual(this.companyCode, oneChangeOwnerModel.companyCode) && Intrinsics.areEqual(this.customerNumber, oneChangeOwnerModel.customerNumber) && Intrinsics.areEqual(this.simcardNumber, oneChangeOwnerModel.simcardNumber) && Intrinsics.areEqual(this.subscriberStatus, oneChangeOwnerModel.subscriberStatus) && Intrinsics.areEqual(this.cardInformationCollection, oneChangeOwnerModel.cardInformationCollection) && this.isSmartCard == oneChangeOwnerModel.isSmartCard && Intrinsics.areEqual(this.faceRecResponse, oneChangeOwnerModel.faceRecResponse) && Intrinsics.areEqual(this.referenceDocListFileName, oneChangeOwnerModel.referenceDocListFileName) && Intrinsics.areEqual(this.postcode, oneChangeOwnerModel.postcode) && Intrinsics.areEqual(this.postcodeSequence, oneChangeOwnerModel.postcodeSequence) && Intrinsics.areEqual(this.verifyType, oneChangeOwnerModel.verifyType) && this.kycAttemp == oneChangeOwnerModel.kycAttemp && Intrinsics.areEqual(this.attachmentNames, oneChangeOwnerModel.attachmentNames) && Intrinsics.areEqual(this.otpCode, oneChangeOwnerModel.otpCode) && Intrinsics.areEqual(this.identityNumber, oneChangeOwnerModel.identityNumber) && Intrinsics.areEqual(this.validateSimResponse, oneChangeOwnerModel.validateSimResponse) && Intrinsics.areEqual(this.classifyCardType, oneChangeOwnerModel.classifyCardType) && this.isAllowManualKYC == oneChangeOwnerModel.isAllowManualKYC && this.isRequireLiveness == oneChangeOwnerModel.isRequireLiveness && Intrinsics.areEqual(this.upPassResult, oneChangeOwnerModel.upPassResult) && Intrinsics.areEqual(this.faceCompareResult, oneChangeOwnerModel.faceCompareResult) && this.upPassStepState == oneChangeOwnerModel.upPassStepState && this.isBackFromSelfieOCRDipChip == oneChangeOwnerModel.isBackFromSelfieOCRDipChip && this.isOverruleXSim == oneChangeOwnerModel.isOverruleXSim;
        }
        return false;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final String getCameraBirthDate() {
        return this.cameraBirthDate;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformationCollection() {
        return this.cardInformationCollection;
    }

    @Nullable
    public final OneClassifyCardTypeResponse getClassifyCardType() {
        return this.classifyCardType;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final ConsentNonTelco getConsentNonTelco() {
        return this.consentNonTelco;
    }

    @NotNull
    public final String getConsentType() {
        return this.consentType;
    }

    @NotNull
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final UpPassFormResult getFaceCompareResult() {
        return this.faceCompareResult;
    }

    @Nullable
    public final FaceRecResponse getFaceRecResponse() {
        return this.faceRecResponse;
    }

    @NotNull
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final int getKycAttemp() {
        return this.kycAttemp;
    }

    @Nullable
    public final String getOcrIdCardNumber() {
        return this.ocrIdCardNumber;
    }

    @NotNull
    public final String getOtpCode() {
        return this.otpCode;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final String getPostcodeSequence() {
        return this.postcodeSequence;
    }

    @NotNull
    public final List<String> getReferenceDocListFileName() {
        return this.referenceDocListFileName;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String getSimcardNumber() {
        return this.simcardNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    @Nullable
    public final UpPassFormResult getUpPassResult() {
        return this.upPassResult;
    }

    @NotNull
    public final UpPassStepState getUpPassStepState() {
        return this.upPassStepState;
    }

    @Nullable
    public final UpdateProfileFormCollection getUpdateForm() {
        return this.updateForm;
    }

    @Nullable
    public final PrepaidProfileItem getValidateSimResponse() {
        return this.validateSimResponse;
    }

    @NotNull
    public final String getVerifyType() {
        return this.verifyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v76, types: [boolean] */
    public int hashCode() {
        boolean z = this.requireFaceRecognition;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.isNewOwner;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        UpdateProfileFormCollection updateProfileFormCollection = this.updateForm;
        int hashCode = (i3 + (updateProfileFormCollection == null ? 0 : updateProfileFormCollection.hashCode())) * 31;
        ConsentNonTelco consentNonTelco = this.consentNonTelco;
        int hashCode2 = (((((hashCode + (consentNonTelco == null ? 0 : consentNonTelco.hashCode())) * 31) + this.consentType.hashCode()) * 31) + this.consentVersion.hashCode()) * 31;
        ?? r22 = this.isShowConsent;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        String str = this.ocrIdCardNumber;
        int hashCode3 = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cameraBirthDate;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscriberNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.companyCode;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerNumber;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.simcardNumber;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subscriberStatus;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.cardInformationCollection;
        int hashCode10 = (hashCode9 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        ?? r23 = this.isSmartCard;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode10 + i6) * 31;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        int hashCode11 = (((i7 + (faceRecResponse == null ? 0 : faceRecResponse.hashCode())) * 31) + this.referenceDocListFileName.hashCode()) * 31;
        String str8 = this.postcode;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postcodeSequence;
        int hashCode13 = (((((((((((hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.verifyType.hashCode()) * 31) + this.kycAttemp) * 31) + this.attachmentNames.hashCode()) * 31) + this.otpCode.hashCode()) * 31) + this.identityNumber.hashCode()) * 31;
        PrepaidProfileItem prepaidProfileItem = this.validateSimResponse;
        int hashCode14 = (hashCode13 + (prepaidProfileItem == null ? 0 : prepaidProfileItem.hashCode())) * 31;
        OneClassifyCardTypeResponse oneClassifyCardTypeResponse = this.classifyCardType;
        int hashCode15 = (hashCode14 + (oneClassifyCardTypeResponse == null ? 0 : oneClassifyCardTypeResponse.hashCode())) * 31;
        ?? r24 = this.isAllowManualKYC;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode15 + i8) * 31;
        ?? r25 = this.isRequireLiveness;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        UpPassFormResult upPassFormResult = this.upPassResult;
        int hashCode16 = (i11 + (upPassFormResult == null ? 0 : upPassFormResult.hashCode())) * 31;
        UpPassFormResult upPassFormResult2 = this.faceCompareResult;
        int hashCode17 = (((hashCode16 + (upPassFormResult2 != null ? upPassFormResult2.hashCode() : 0)) * 31) + this.upPassStepState.hashCode()) * 31;
        ?? r26 = this.isBackFromSelfieOCRDipChip;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode17 + i12) * 31;
        boolean z2 = this.isOverruleXSim;
        return i13 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    public final boolean isBackFromSelfieOCRDipChip() {
        return this.isBackFromSelfieOCRDipChip;
    }

    public final boolean isNewOwner() {
        return this.isNewOwner;
    }

    public final boolean isOverruleXSim() {
        return this.isOverruleXSim;
    }

    public final boolean isRequireLiveness() {
        return this.isRequireLiveness;
    }

    public final boolean isShowConsent() {
        return this.isShowConsent;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAllowManualKYC(boolean z) {
        this.isAllowManualKYC = z;
    }

    public final void setAttachmentNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachmentNames = list;
    }

    public final void setBackFromSelfieOCRDipChip(boolean z) {
        this.isBackFromSelfieOCRDipChip = z;
    }

    public final void setCameraBirthDate(@Nullable String str) {
        this.cameraBirthDate = str;
    }

    public final void setCardInformationCollection(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformationCollection = idCardInformationCollection;
    }

    public final void setClassifyCardType(@Nullable OneClassifyCardTypeResponse oneClassifyCardTypeResponse) {
        this.classifyCardType = oneClassifyCardTypeResponse;
    }

    public final void setCompanyCode(@Nullable String str) {
        this.companyCode = str;
    }

    public final void setConsentNonTelco(@Nullable ConsentNonTelco consentNonTelco) {
        this.consentNonTelco = consentNonTelco;
    }

    public final void setConsentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentType = str;
    }

    public final void setConsentVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentVersion = str;
    }

    public final void setCustomerNumber(@Nullable String str) {
        this.customerNumber = str;
    }

    public final void setFaceCompareResult(@Nullable UpPassFormResult upPassFormResult) {
        this.faceCompareResult = upPassFormResult;
    }

    public final void setFaceRecResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.faceRecResponse = faceRecResponse;
    }

    public final void setIdentityNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identityNumber = str;
    }

    public final void setKycAttemp(int i) {
        this.kycAttemp = i;
    }

    public final void setNewOwner(boolean z) {
        this.isNewOwner = z;
    }

    public final void setOcrIdCardNumber(@Nullable String str) {
        this.ocrIdCardNumber = str;
    }

    public final void setOtpCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpCode = str;
    }

    public final void setOverruleXSim(boolean z) {
        this.isOverruleXSim = z;
    }

    public final void setPostcode(@Nullable String str) {
        this.postcode = str;
    }

    public final void setPostcodeSequence(@Nullable String str) {
        this.postcodeSequence = str;
    }

    public final void setReferenceDocListFileName(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.referenceDocListFileName = list;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    public final void setRequireLiveness(boolean z) {
        this.isRequireLiveness = z;
    }

    public final void setShowConsent(boolean z) {
        this.isShowConsent = z;
    }

    public final void setSimcardNumber(@Nullable String str) {
        this.simcardNumber = str;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.subscriberNumber = str;
    }

    public final void setSubscriberStatus(@Nullable String str) {
        this.subscriberStatus = str;
    }

    public final void setUpPassResult(@Nullable UpPassFormResult upPassFormResult) {
        this.upPassResult = upPassFormResult;
    }

    public final void setUpPassStepState(@NotNull UpPassStepState upPassStepState) {
        Intrinsics.checkNotNullParameter(upPassStepState, "<set-?>");
        this.upPassStepState = upPassStepState;
    }

    public final void setUpdateForm(@Nullable UpdateProfileFormCollection updateProfileFormCollection) {
        this.updateForm = updateProfileFormCollection;
    }

    public final void setValidateSimResponse(@Nullable PrepaidProfileItem prepaidProfileItem) {
        this.validateSimResponse = prepaidProfileItem;
    }

    public final void setVerifyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyType = str;
    }

    @NotNull
    public String toString() {
        boolean z = this.requireFaceRecognition;
        boolean z2 = this.isNewOwner;
        UpdateProfileFormCollection updateProfileFormCollection = this.updateForm;
        ConsentNonTelco consentNonTelco = this.consentNonTelco;
        String str = this.consentType;
        String str2 = this.consentVersion;
        boolean z3 = this.isShowConsent;
        String str3 = this.ocrIdCardNumber;
        String str4 = this.cameraBirthDate;
        String str5 = this.subscriberNumber;
        String str6 = this.companyCode;
        String str7 = this.customerNumber;
        String str8 = this.simcardNumber;
        String str9 = this.subscriberStatus;
        IdCardInformationCollection idCardInformationCollection = this.cardInformationCollection;
        boolean z4 = this.isSmartCard;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        List<String> list = this.referenceDocListFileName;
        String str10 = this.postcode;
        String str11 = this.postcodeSequence;
        String str12 = this.verifyType;
        int i = this.kycAttemp;
        List<String> list2 = this.attachmentNames;
        String str13 = this.otpCode;
        String str14 = this.identityNumber;
        PrepaidProfileItem prepaidProfileItem = this.validateSimResponse;
        OneClassifyCardTypeResponse oneClassifyCardTypeResponse = this.classifyCardType;
        boolean z5 = this.isAllowManualKYC;
        boolean z6 = this.isRequireLiveness;
        UpPassFormResult upPassFormResult = this.upPassResult;
        UpPassFormResult upPassFormResult2 = this.faceCompareResult;
        UpPassStepState upPassStepState = this.upPassStepState;
        boolean z7 = this.isBackFromSelfieOCRDipChip;
        boolean z8 = this.isOverruleXSim;
        return "OneChangeOwnerModel(requireFaceRecognition=" + z + ", isNewOwner=" + z2 + ", updateForm=" + updateProfileFormCollection + ", consentNonTelco=" + consentNonTelco + ", consentType=" + str + ", consentVersion=" + str2 + ", isShowConsent=" + z3 + ", ocrIdCardNumber=" + str3 + ", cameraBirthDate=" + str4 + ", subscriberNumber=" + str5 + ", companyCode=" + str6 + ", customerNumber=" + str7 + ", simcardNumber=" + str8 + ", subscriberStatus=" + str9 + ", cardInformationCollection=" + idCardInformationCollection + ", isSmartCard=" + z4 + ", faceRecResponse=" + faceRecResponse + ", referenceDocListFileName=" + list + ", postcode=" + str10 + ", postcodeSequence=" + str11 + ", verifyType=" + str12 + ", kycAttemp=" + i + ", attachmentNames=" + list2 + ", otpCode=" + str13 + ", identityNumber=" + str14 + ", validateSimResponse=" + prepaidProfileItem + ", classifyCardType=" + oneClassifyCardTypeResponse + ", isAllowManualKYC=" + z5 + ", isRequireLiveness=" + z6 + ", upPassResult=" + upPassFormResult + ", faceCompareResult=" + upPassFormResult2 + ", upPassStepState=" + upPassStepState + ", isBackFromSelfieOCRDipChip=" + z7 + ", isOverruleXSim=" + z8 + ")";
    }

    public OneChangeOwnerModel(boolean z, boolean z2, @Nullable UpdateProfileFormCollection updateProfileFormCollection, @Nullable ConsentNonTelco consentNonTelco, @NotNull String consentType, @NotNull String consentVersion, boolean z3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable IdCardInformationCollection idCardInformationCollection, boolean z4, @Nullable FaceRecResponse faceRecResponse, @NotNull List<String> referenceDocListFileName, @Nullable String str8, @Nullable String str9, @NotNull String verifyType, int i, @NotNull List<String> attachmentNames, @NotNull String otpCode, @NotNull String identityNumber, @Nullable PrepaidProfileItem prepaidProfileItem, @Nullable OneClassifyCardTypeResponse oneClassifyCardTypeResponse, boolean z5, boolean z6, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @NotNull UpPassStepState upPassStepState, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(identityNumber, "identityNumber");
        Intrinsics.checkNotNullParameter(upPassStepState, "upPassStepState");
        this.requireFaceRecognition = z;
        this.isNewOwner = z2;
        this.updateForm = updateProfileFormCollection;
        this.consentNonTelco = consentNonTelco;
        this.consentType = consentType;
        this.consentVersion = consentVersion;
        this.isShowConsent = z3;
        this.ocrIdCardNumber = str;
        this.cameraBirthDate = str2;
        this.subscriberNumber = str3;
        this.companyCode = str4;
        this.customerNumber = str5;
        this.simcardNumber = str6;
        this.subscriberStatus = str7;
        this.cardInformationCollection = idCardInformationCollection;
        this.isSmartCard = z4;
        this.faceRecResponse = faceRecResponse;
        this.referenceDocListFileName = referenceDocListFileName;
        this.postcode = str8;
        this.postcodeSequence = str9;
        this.verifyType = verifyType;
        this.kycAttemp = i;
        this.attachmentNames = attachmentNames;
        this.otpCode = otpCode;
        this.identityNumber = identityNumber;
        this.validateSimResponse = prepaidProfileItem;
        this.classifyCardType = oneClassifyCardTypeResponse;
        this.isAllowManualKYC = z5;
        this.isRequireLiveness = z6;
        this.upPassResult = upPassFormResult;
        this.faceCompareResult = upPassFormResult2;
        this.upPassStepState = upPassStepState;
        this.isBackFromSelfieOCRDipChip = z7;
        this.isOverruleXSim = z8;
    }

    public /* synthetic */ OneChangeOwnerModel(boolean z, boolean z2, UpdateProfileFormCollection updateProfileFormCollection, ConsentNonTelco consentNonTelco, String str, String str2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, IdCardInformationCollection idCardInformationCollection, boolean z4, FaceRecResponse faceRecResponse, List list, String str10, String str11, String str12, int i, List list2, String str13, String str14, PrepaidProfileItem prepaidProfileItem, OneClassifyCardTypeResponse oneClassifyCardTypeResponse, boolean z5, boolean z6, UpPassFormResult upPassFormResult, UpPassFormResult upPassFormResult2, UpPassStepState upPassStepState, boolean z7, boolean z8, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) == 0 ? z2 : true, (i2 & 4) != 0 ? null : updateProfileFormCollection, (i2 & 8) != 0 ? null : consentNonTelco, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? "" : str8, (i2 & 8192) != 0 ? null : str9, (i2 & 16384) != 0 ? null : idCardInformationCollection, (i2 & 32768) != 0 ? false : z4, (i2 & 65536) != 0 ? null : faceRecResponse, (i2 & 131072) != 0 ? new ArrayList() : list, (i2 & 262144) != 0 ? null : str10, (i2 & 524288) != 0 ? null : str11, (i2 & 1048576) != 0 ? "" : str12, (i2 & 2097152) != 0 ? 0 : i, (i2 & 4194304) != 0 ? new ArrayList() : list2, (i2 & 8388608) != 0 ? "" : str13, (i2 & 16777216) != 0 ? "" : str14, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : prepaidProfileItem, (i2 & 67108864) != 0 ? null : oneClassifyCardTypeResponse, (i2 & 134217728) != 0 ? false : z5, (i2 & 268435456) != 0 ? false : z6, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? null : upPassFormResult, (i2 & 1073741824) != 0 ? null : upPassFormResult2, (i2 & Integer.MIN_VALUE) != 0 ? UpPassStepState.NONE : upPassStepState, (i3 & 1) != 0 ? false : z7, (i3 & 2) != 0 ? false : z8);
    }
}
