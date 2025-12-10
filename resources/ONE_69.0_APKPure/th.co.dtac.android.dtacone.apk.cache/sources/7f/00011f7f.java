package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist;

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
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.UpPassStepState;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bs\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0019\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0003¢\u0006\u0002\u0010+J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\n0\u0019HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u001eHÆ\u0003J\u0010\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0019HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020(HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003Jè\u0002\u0010\u0096\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u0003HÆ\u0001J\u0015\u0010\u0097\u0001\u001a\u00020\u00032\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u001eHÖ\u0001J\n\u0010\u009a\u0001\u001a\u00020\nHÖ\u0001R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00101\"\u0004\bA\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00101\"\u0004\bC\u00103R\u001c\u0010&\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00101\"\u0004\bM\u00103R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010N\"\u0004\bO\u0010PR\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010N\"\u0004\bQ\u0010PR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010N\"\u0004\bR\u0010PR\u001a\u0010*\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010N\"\u0004\bS\u0010PR\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010N\"\u0004\bT\u0010PR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010N\"\u0004\bU\u0010PR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010N\"\u0004\bV\u0010PR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010 \u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00101\"\u0004\b\\\u00103R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u00101\"\u0004\b^\u00103R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00101\"\u0004\b`\u00103R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010N\"\u0004\bd\u0010PR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00101\"\u0004\bf\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u00101\"\u0004\bh\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00101\"\u0004\bj\u00103R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010E\"\u0004\bl\u0010GR\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u00101\"\u0004\bv\u00103¨\u0006\u009b\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/MrtrPrepaidReregist;", "", "requireFaceRecognition", "", "isNewOwner", "updateForm", "Lth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;", "consentNonTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "consentType", "", "consentVersion", "isShowConsent", "cameraBirthDate", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "companyCode", "customerNumber", "simcardNumber", "subscriberStatus", "cardInformationCollection", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "isSmartCard", "faceRecResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "referenceDocListFileName", "", "postcode", "postcodeSequence", "verifyType", "kycAttemp", "", "attachmentNames", "otpCode", "identityNumber", "isAllowManualKYC", "isRequireLiveness", "upPassResult", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "faceCompareResult", "upPassStepState", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;", "isBackFromSelfieOCRDipChip", "isOverruleXSim", "(ZZLth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;ZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;ZZ)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getCameraBirthDate", "()Ljava/lang/String;", "setCameraBirthDate", "(Ljava/lang/String;)V", "getCardInformationCollection", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformationCollection", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getCompanyCode", "setCompanyCode", "getConsentNonTelco", "()Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "setConsentNonTelco", "(Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;)V", "getConsentType", "setConsentType", "getConsentVersion", "setConsentVersion", "getCustomerNumber", "setCustomerNumber", "getFaceCompareResult", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "setFaceCompareResult", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;)V", "getFaceRecResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setFaceRecResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getIdentityNumber", "setIdentityNumber", "()Z", "setAllowManualKYC", "(Z)V", "setBackFromSelfieOCRDipChip", "setNewOwner", "setOverruleXSim", "setRequireLiveness", "setShowConsent", "setSmartCard", "getKycAttemp", "()I", "setKycAttemp", "(I)V", "getOtpCode", "setOtpCode", "getPostcode", "setPostcode", "getPostcodeSequence", "setPostcodeSequence", "getReferenceDocListFileName", "setReferenceDocListFileName", "getRequireFaceRecognition", "setRequireFaceRecognition", "getSimcardNumber", "setSimcardNumber", "getSubscriberNumber", "setSubscriberNumber", "getSubscriberStatus", "setSubscriberStatus", "getUpPassResult", "setUpPassResult", "getUpPassStepState", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;", "setUpPassStepState", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/UpPassStepState;)V", "getUpdateForm", "()Lth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;", "setUpdateForm", "(Lth/co/dtac/android/dtacone/model/prepaid/UpdateProfileFormCollection;)V", "getVerifyType", "setVerifyType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.MrtrPrepaidReregist */
/* loaded from: classes8.dex */
public final class MrtrPrepaidReregist {
    public static final int $stable = 8;
    @NotNull
    private List<String> attachmentNames;
    @Nullable
    private String cameraBirthDate;
    @Nullable
    private IdCardInformationCollection cardInformationCollection;
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
    @NotNull
    private String verifyType;

    public MrtrPrepaidReregist() {
        this(false, false, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, 0, null, null, null, false, false, null, null, null, false, false, Integer.MAX_VALUE, null);
    }

    public final boolean component1() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String component10() {
        return this.companyCode;
    }

    @Nullable
    public final String component11() {
        return this.customerNumber;
    }

    @Nullable
    public final String component12() {
        return this.simcardNumber;
    }

    @Nullable
    public final String component13() {
        return this.subscriberStatus;
    }

    @Nullable
    public final IdCardInformationCollection component14() {
        return this.cardInformationCollection;
    }

    public final boolean component15() {
        return this.isSmartCard;
    }

    @Nullable
    public final FaceRecResponse component16() {
        return this.faceRecResponse;
    }

    @NotNull
    public final List<String> component17() {
        return this.referenceDocListFileName;
    }

    @Nullable
    public final String component18() {
        return this.postcode;
    }

    @Nullable
    public final String component19() {
        return this.postcodeSequence;
    }

    public final boolean component2() {
        return this.isNewOwner;
    }

    @NotNull
    public final String component20() {
        return this.verifyType;
    }

    public final int component21() {
        return this.kycAttemp;
    }

    @NotNull
    public final List<String> component22() {
        return this.attachmentNames;
    }

    @NotNull
    public final String component23() {
        return this.otpCode;
    }

    @NotNull
    public final String component24() {
        return this.identityNumber;
    }

    public final boolean component25() {
        return this.isAllowManualKYC;
    }

    public final boolean component26() {
        return this.isRequireLiveness;
    }

    @Nullable
    public final UpPassFormResult component27() {
        return this.upPassResult;
    }

    @Nullable
    public final UpPassFormResult component28() {
        return this.faceCompareResult;
    }

    @NotNull
    public final UpPassStepState component29() {
        return this.upPassStepState;
    }

    @Nullable
    public final UpdateProfileFormCollection component3() {
        return this.updateForm;
    }

    public final boolean component30() {
        return this.isBackFromSelfieOCRDipChip;
    }

    public final boolean component31() {
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
        return this.cameraBirthDate;
    }

    @Nullable
    public final String component9() {
        return this.subscriberNumber;
    }

    @NotNull
    public final MrtrPrepaidReregist copy(boolean z, boolean z2, @Nullable UpdateProfileFormCollection updateProfileFormCollection, @Nullable ConsentNonTelco consentNonTelco, @NotNull String consentType, @NotNull String consentVersion, boolean z3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable IdCardInformationCollection idCardInformationCollection, boolean z4, @Nullable FaceRecResponse faceRecResponse, @NotNull List<String> referenceDocListFileName, @Nullable String str7, @Nullable String str8, @NotNull String verifyType, int i, @NotNull List<String> attachmentNames, @NotNull String otpCode, @NotNull String identityNumber, boolean z5, boolean z6, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @NotNull UpPassStepState upPassStepState, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(identityNumber, "identityNumber");
        Intrinsics.checkNotNullParameter(upPassStepState, "upPassStepState");
        return new MrtrPrepaidReregist(z, z2, updateProfileFormCollection, consentNonTelco, consentType, consentVersion, z3, str, str2, str3, str4, str5, str6, idCardInformationCollection, z4, faceRecResponse, referenceDocListFileName, str7, str8, verifyType, i, attachmentNames, otpCode, identityNumber, z5, z6, upPassFormResult, upPassFormResult2, upPassStepState, z7, z8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPrepaidReregist) {
            MrtrPrepaidReregist mrtrPrepaidReregist = (MrtrPrepaidReregist) obj;
            return this.requireFaceRecognition == mrtrPrepaidReregist.requireFaceRecognition && this.isNewOwner == mrtrPrepaidReregist.isNewOwner && Intrinsics.areEqual(this.updateForm, mrtrPrepaidReregist.updateForm) && Intrinsics.areEqual(this.consentNonTelco, mrtrPrepaidReregist.consentNonTelco) && Intrinsics.areEqual(this.consentType, mrtrPrepaidReregist.consentType) && Intrinsics.areEqual(this.consentVersion, mrtrPrepaidReregist.consentVersion) && this.isShowConsent == mrtrPrepaidReregist.isShowConsent && Intrinsics.areEqual(this.cameraBirthDate, mrtrPrepaidReregist.cameraBirthDate) && Intrinsics.areEqual(this.subscriberNumber, mrtrPrepaidReregist.subscriberNumber) && Intrinsics.areEqual(this.companyCode, mrtrPrepaidReregist.companyCode) && Intrinsics.areEqual(this.customerNumber, mrtrPrepaidReregist.customerNumber) && Intrinsics.areEqual(this.simcardNumber, mrtrPrepaidReregist.simcardNumber) && Intrinsics.areEqual(this.subscriberStatus, mrtrPrepaidReregist.subscriberStatus) && Intrinsics.areEqual(this.cardInformationCollection, mrtrPrepaidReregist.cardInformationCollection) && this.isSmartCard == mrtrPrepaidReregist.isSmartCard && Intrinsics.areEqual(this.faceRecResponse, mrtrPrepaidReregist.faceRecResponse) && Intrinsics.areEqual(this.referenceDocListFileName, mrtrPrepaidReregist.referenceDocListFileName) && Intrinsics.areEqual(this.postcode, mrtrPrepaidReregist.postcode) && Intrinsics.areEqual(this.postcodeSequence, mrtrPrepaidReregist.postcodeSequence) && Intrinsics.areEqual(this.verifyType, mrtrPrepaidReregist.verifyType) && this.kycAttemp == mrtrPrepaidReregist.kycAttemp && Intrinsics.areEqual(this.attachmentNames, mrtrPrepaidReregist.attachmentNames) && Intrinsics.areEqual(this.otpCode, mrtrPrepaidReregist.otpCode) && Intrinsics.areEqual(this.identityNumber, mrtrPrepaidReregist.identityNumber) && this.isAllowManualKYC == mrtrPrepaidReregist.isAllowManualKYC && this.isRequireLiveness == mrtrPrepaidReregist.isRequireLiveness && Intrinsics.areEqual(this.upPassResult, mrtrPrepaidReregist.upPassResult) && Intrinsics.areEqual(this.faceCompareResult, mrtrPrepaidReregist.faceCompareResult) && this.upPassStepState == mrtrPrepaidReregist.upPassStepState && this.isBackFromSelfieOCRDipChip == mrtrPrepaidReregist.isBackFromSelfieOCRDipChip && this.isOverruleXSim == mrtrPrepaidReregist.isOverruleXSim;
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

    @NotNull
    public final String getVerifyType() {
        return this.verifyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v67, types: [boolean] */
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
        String str = this.cameraBirthDate;
        int hashCode3 = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscriberNumber;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.companyCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerNumber;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.simcardNumber;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subscriberStatus;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.cardInformationCollection;
        int hashCode9 = (hashCode8 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        ?? r23 = this.isSmartCard;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode9 + i6) * 31;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        int hashCode10 = (((i7 + (faceRecResponse == null ? 0 : faceRecResponse.hashCode())) * 31) + this.referenceDocListFileName.hashCode()) * 31;
        String str7 = this.postcode;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.postcodeSequence;
        int hashCode12 = (((((((((((hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.verifyType.hashCode()) * 31) + this.kycAttemp) * 31) + this.attachmentNames.hashCode()) * 31) + this.otpCode.hashCode()) * 31) + this.identityNumber.hashCode()) * 31;
        ?? r24 = this.isAllowManualKYC;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode12 + i8) * 31;
        ?? r25 = this.isRequireLiveness;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        UpPassFormResult upPassFormResult = this.upPassResult;
        int hashCode13 = (i11 + (upPassFormResult == null ? 0 : upPassFormResult.hashCode())) * 31;
        UpPassFormResult upPassFormResult2 = this.faceCompareResult;
        int hashCode14 = (((hashCode13 + (upPassFormResult2 != null ? upPassFormResult2.hashCode() : 0)) * 31) + this.upPassStepState.hashCode()) * 31;
        ?? r26 = this.isBackFromSelfieOCRDipChip;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode14 + i12) * 31;
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
        String str3 = this.cameraBirthDate;
        String str4 = this.subscriberNumber;
        String str5 = this.companyCode;
        String str6 = this.customerNumber;
        String str7 = this.simcardNumber;
        String str8 = this.subscriberStatus;
        IdCardInformationCollection idCardInformationCollection = this.cardInformationCollection;
        boolean z4 = this.isSmartCard;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        List<String> list = this.referenceDocListFileName;
        String str9 = this.postcode;
        String str10 = this.postcodeSequence;
        String str11 = this.verifyType;
        int i = this.kycAttemp;
        List<String> list2 = this.attachmentNames;
        String str12 = this.otpCode;
        String str13 = this.identityNumber;
        boolean z5 = this.isAllowManualKYC;
        boolean z6 = this.isRequireLiveness;
        UpPassFormResult upPassFormResult = this.upPassResult;
        UpPassFormResult upPassFormResult2 = this.faceCompareResult;
        UpPassStepState upPassStepState = this.upPassStepState;
        boolean z7 = this.isBackFromSelfieOCRDipChip;
        boolean z8 = this.isOverruleXSim;
        return "MrtrPrepaidReregist(requireFaceRecognition=" + z + ", isNewOwner=" + z2 + ", updateForm=" + updateProfileFormCollection + ", consentNonTelco=" + consentNonTelco + ", consentType=" + str + ", consentVersion=" + str2 + ", isShowConsent=" + z3 + ", cameraBirthDate=" + str3 + ", subscriberNumber=" + str4 + ", companyCode=" + str5 + ", customerNumber=" + str6 + ", simcardNumber=" + str7 + ", subscriberStatus=" + str8 + ", cardInformationCollection=" + idCardInformationCollection + ", isSmartCard=" + z4 + ", faceRecResponse=" + faceRecResponse + ", referenceDocListFileName=" + list + ", postcode=" + str9 + ", postcodeSequence=" + str10 + ", verifyType=" + str11 + ", kycAttemp=" + i + ", attachmentNames=" + list2 + ", otpCode=" + str12 + ", identityNumber=" + str13 + ", isAllowManualKYC=" + z5 + ", isRequireLiveness=" + z6 + ", upPassResult=" + upPassFormResult + ", faceCompareResult=" + upPassFormResult2 + ", upPassStepState=" + upPassStepState + ", isBackFromSelfieOCRDipChip=" + z7 + ", isOverruleXSim=" + z8 + ")";
    }

    public MrtrPrepaidReregist(boolean z, boolean z2, @Nullable UpdateProfileFormCollection updateProfileFormCollection, @Nullable ConsentNonTelco consentNonTelco, @NotNull String consentType, @NotNull String consentVersion, boolean z3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable IdCardInformationCollection idCardInformationCollection, boolean z4, @Nullable FaceRecResponse faceRecResponse, @NotNull List<String> referenceDocListFileName, @Nullable String str7, @Nullable String str8, @NotNull String verifyType, int i, @NotNull List<String> attachmentNames, @NotNull String otpCode, @NotNull String identityNumber, boolean z5, boolean z6, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @NotNull UpPassStepState upPassStepState, boolean z7, boolean z8) {
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
        this.cameraBirthDate = str;
        this.subscriberNumber = str2;
        this.companyCode = str3;
        this.customerNumber = str4;
        this.simcardNumber = str5;
        this.subscriberStatus = str6;
        this.cardInformationCollection = idCardInformationCollection;
        this.isSmartCard = z4;
        this.faceRecResponse = faceRecResponse;
        this.referenceDocListFileName = referenceDocListFileName;
        this.postcode = str7;
        this.postcodeSequence = str8;
        this.verifyType = verifyType;
        this.kycAttemp = i;
        this.attachmentNames = attachmentNames;
        this.otpCode = otpCode;
        this.identityNumber = identityNumber;
        this.isAllowManualKYC = z5;
        this.isRequireLiveness = z6;
        this.upPassResult = upPassFormResult;
        this.faceCompareResult = upPassFormResult2;
        this.upPassStepState = upPassStepState;
        this.isBackFromSelfieOCRDipChip = z7;
        this.isOverruleXSim = z8;
    }

    public /* synthetic */ MrtrPrepaidReregist(boolean z, boolean z2, UpdateProfileFormCollection updateProfileFormCollection, ConsentNonTelco consentNonTelco, String str, String str2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8, IdCardInformationCollection idCardInformationCollection, boolean z4, FaceRecResponse faceRecResponse, List list, String str9, String str10, String str11, int i, List list2, String str12, String str13, boolean z5, boolean z6, UpPassFormResult upPassFormResult, UpPassFormResult upPassFormResult2, UpPassStepState upPassStepState, boolean z7, boolean z8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) == 0 ? z2 : true, (i2 & 4) != 0 ? null : updateProfileFormCollection, (i2 & 8) != 0 ? null : consentNonTelco, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) != 0 ? null : str8, (i2 & 8192) != 0 ? null : idCardInformationCollection, (i2 & 16384) != 0 ? false : z4, (i2 & 32768) != 0 ? null : faceRecResponse, (i2 & 65536) != 0 ? new ArrayList() : list, (i2 & 131072) != 0 ? null : str9, (i2 & 262144) != 0 ? null : str10, (i2 & 524288) != 0 ? "" : str11, (i2 & 1048576) != 0 ? 0 : i, (i2 & 2097152) != 0 ? new ArrayList() : list2, (i2 & 4194304) != 0 ? "" : str12, (i2 & 8388608) != 0 ? "" : str13, (i2 & 16777216) != 0 ? false : z5, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z6, (i2 & 67108864) != 0 ? null : upPassFormResult, (i2 & 134217728) != 0 ? null : upPassFormResult2, (i2 & 268435456) != 0 ? UpPassStepState.NONE : upPassStepState, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z7, (i2 & 1073741824) != 0 ? false : z8);
    }
}