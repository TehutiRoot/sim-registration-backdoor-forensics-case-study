package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bk\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010'J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u008a\u0003\u0010\u0080\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0015\u0010\u0082\u0001\u001a\u00020\n2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0084\u0001\u001a\u00030\u0085\u0001HÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010+\"\u0004\b-\u0010.R \u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010.R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010+\"\u0004\b2\u0010.R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010+\"\u0004\b4\u0010.R \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010.R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010+\"\u0004\b8\u0010.R\"\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010 \u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010+\"\u0004\bC\u0010.R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010+\"\u0004\bE\u0010.R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010+\"\u0004\bG\u0010.R\"\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\b\u001a\u0010:\"\u0004\bH\u0010<R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010+R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010+\"\u0004\bJ\u0010.R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010+\"\u0004\bL\u0010.R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010+\"\u0004\bP\u0010.R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010+R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010+\"\u0004\bT\u0010.R \u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010+\"\u0004\bV\u0010.R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010+R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\bZ\u0010:\"\u0004\b[\u0010<R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010+R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010+R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010+R \u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010+\"\u0004\b`\u0010.¨\u0006\u0087\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/MrtrPrepaidRegisterMultiSimRequest;", "", "rtrCode", "", "subscriber", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Subscriber;", "rtrTransactionId", "objectReferenceID", "customerNumber", "updateConsent", "", "nontelcoConsentType", "consentVersionLabel", Scopes.PROFILE, "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Profile;", "channel", "isSmartCardData", "userCode", "attachmentsName", "", "userLan", "rtrName", "subChannel", "userFormatType", "faceRecognition", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/FaceCompareResponseSubmit;", "isActivate", "featureCode", "familyPairNumber", "identityPhotoName", "profileImage", "customerPhotoName", "eSIMFlag", "consentType", "consentVersion", "dopaFlag", "dipChipStatus", "slugID", "verifyDocType", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Subscriber;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Profile;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/FaceCompareResponseSubmit;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttachmentsName", "()Ljava/util/List;", "getChannel", "()Ljava/lang/String;", "getConsentType", "setConsentType", "(Ljava/lang/String;)V", "getConsentVersion", "setConsentVersion", "getConsentVersionLabel", "setConsentVersionLabel", "getCustomerNumber", "setCustomerNumber", "getCustomerPhotoName", "setCustomerPhotoName", "getDipChipStatus", "setDipChipStatus", "getDopaFlag", "()Ljava/lang/Boolean;", "setDopaFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getESIMFlag", "setESIMFlag", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/FaceCompareResponseSubmit;", "getFamilyPairNumber", "setFamilyPairNumber", "getFeatureCode", "setFeatureCode", "getIdentityPhotoName", "setIdentityPhotoName", "setActivate", "getNontelcoConsentType", "setNontelcoConsentType", "getObjectReferenceID", "setObjectReferenceID", "getProfile", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Profile;", "getProfileImage", "setProfileImage", "getRtrCode", "getRtrName", "getRtrTransactionId", "setRtrTransactionId", "getSlugID", "setSlugID", "getSubChannel", "getSubscriber", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Subscriber;", "getUpdateConsent", "setUpdateConsent", "getUserCode", "getUserFormatType", "getUserLan", "getVerifyDocType", "setVerifyDocType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Subscriber;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/Profile;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/FaceCompareResponseSubmit;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/MrtrPrepaidRegisterMultiSimRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register.MrtrPrepaidRegisterMultiSimRequest */
/* loaded from: classes8.dex */
public final class MrtrPrepaidRegisterMultiSimRequest {
    public static final int $stable = 8;
    @SerializedName("attachmentNames")
    @Nullable
    private final List<String> attachmentsName;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("consentType")
    @Nullable
    private String consentType;
    @SerializedName("consentVersion")
    @Nullable
    private String consentVersion;
    @SerializedName("consentVersionLabel")
    @Nullable
    private String consentVersionLabel;
    @SerializedName("customerNumber")
    @Nullable
    private String customerNumber;
    @SerializedName("customerPhotoName")
    @Nullable
    private String customerPhotoName;
    @SerializedName("dipChipStatus")
    @Nullable
    private String dipChipStatus;
    @SerializedName("dopaFlag")
    @Nullable
    private Boolean dopaFlag;
    @SerializedName("eSIMFlag")
    @Nullable
    private Boolean eSIMFlag;
    @SerializedName("faceRecognition")
    @Nullable
    private final FaceCompareResponseSubmit faceRecognition;
    @SerializedName("familyPairNumber")
    @Nullable
    private String familyPairNumber;
    @SerializedName("featureCode")
    @Nullable
    private String featureCode;
    @SerializedName("identityPhotoName")
    @Nullable
    private String identityPhotoName;
    @SerializedName("isActivate")
    @Nullable
    private Boolean isActivate;
    @SerializedName("isSmartCardData")
    @Nullable
    private final String isSmartCardData;
    @SerializedName("nontelcoConsentType")
    @Nullable
    private String nontelcoConsentType;
    @SerializedName("objectReferenceID")
    @Nullable
    private String objectReferenceID;
    @SerializedName(Scopes.PROFILE)
    @Nullable
    private final Profile profile;
    @SerializedName("profileImage")
    @Nullable
    private String profileImage;
    @SerializedName("rtrCode")
    @Nullable
    private final String rtrCode;
    @SerializedName("rtrName")
    @Nullable
    private final String rtrName;
    @SerializedName("rtrTransactionId")
    @Nullable
    private String rtrTransactionId;
    @SerializedName("slugID")
    @Nullable
    private String slugID;
    @SerializedName("subChannel")
    @Nullable
    private final String subChannel;
    @SerializedName("subscriber")
    @Nullable
    private final Subscriber subscriber;
    @SerializedName("updateConsent")
    @Nullable
    private Boolean updateConsent;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;
    @SerializedName("verifyDocType")
    @Nullable
    private String verifyDocType;

    public MrtrPrepaidRegisterMultiSimRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    @Nullable
    public final String component1() {
        return this.rtrCode;
    }

    @Nullable
    public final String component10() {
        return this.channel;
    }

    @Nullable
    public final String component11() {
        return this.isSmartCardData;
    }

    @Nullable
    public final String component12() {
        return this.userCode;
    }

    @Nullable
    public final List<String> component13() {
        return this.attachmentsName;
    }

    @Nullable
    public final String component14() {
        return this.userLan;
    }

    @Nullable
    public final String component15() {
        return this.rtrName;
    }

    @Nullable
    public final String component16() {
        return this.subChannel;
    }

    @Nullable
    public final String component17() {
        return this.userFormatType;
    }

    @Nullable
    public final FaceCompareResponseSubmit component18() {
        return this.faceRecognition;
    }

    @Nullable
    public final Boolean component19() {
        return this.isActivate;
    }

    @Nullable
    public final Subscriber component2() {
        return this.subscriber;
    }

    @Nullable
    public final String component20() {
        return this.featureCode;
    }

    @Nullable
    public final String component21() {
        return this.familyPairNumber;
    }

    @Nullable
    public final String component22() {
        return this.identityPhotoName;
    }

    @Nullable
    public final String component23() {
        return this.profileImage;
    }

    @Nullable
    public final String component24() {
        return this.customerPhotoName;
    }

    @Nullable
    public final Boolean component25() {
        return this.eSIMFlag;
    }

    @Nullable
    public final String component26() {
        return this.consentType;
    }

    @Nullable
    public final String component27() {
        return this.consentVersion;
    }

    @Nullable
    public final Boolean component28() {
        return this.dopaFlag;
    }

    @Nullable
    public final String component29() {
        return this.dipChipStatus;
    }

    @Nullable
    public final String component3() {
        return this.rtrTransactionId;
    }

    @Nullable
    public final String component30() {
        return this.slugID;
    }

    @Nullable
    public final String component31() {
        return this.verifyDocType;
    }

    @Nullable
    public final String component4() {
        return this.objectReferenceID;
    }

    @Nullable
    public final String component5() {
        return this.customerNumber;
    }

    @Nullable
    public final Boolean component6() {
        return this.updateConsent;
    }

    @Nullable
    public final String component7() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String component8() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final Profile component9() {
        return this.profile;
    }

    @NotNull
    public final MrtrPrepaidRegisterMultiSimRequest copy(@Nullable String str, @Nullable Subscriber subscriber, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable Profile profile, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable FaceCompareResponseSubmit faceCompareResponseSubmit, @Nullable Boolean bool2, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable Boolean bool3, @Nullable String str19, @Nullable String str20, @Nullable Boolean bool4, @Nullable String str21, @Nullable String str22, @Nullable String str23) {
        return new MrtrPrepaidRegisterMultiSimRequest(str, subscriber, str2, str3, str4, bool, str5, str6, profile, str7, str8, str9, list, str10, str11, str12, str13, faceCompareResponseSubmit, bool2, str14, str15, str16, str17, str18, bool3, str19, str20, bool4, str21, str22, str23);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPrepaidRegisterMultiSimRequest) {
            MrtrPrepaidRegisterMultiSimRequest mrtrPrepaidRegisterMultiSimRequest = (MrtrPrepaidRegisterMultiSimRequest) obj;
            return Intrinsics.areEqual(this.rtrCode, mrtrPrepaidRegisterMultiSimRequest.rtrCode) && Intrinsics.areEqual(this.subscriber, mrtrPrepaidRegisterMultiSimRequest.subscriber) && Intrinsics.areEqual(this.rtrTransactionId, mrtrPrepaidRegisterMultiSimRequest.rtrTransactionId) && Intrinsics.areEqual(this.objectReferenceID, mrtrPrepaidRegisterMultiSimRequest.objectReferenceID) && Intrinsics.areEqual(this.customerNumber, mrtrPrepaidRegisterMultiSimRequest.customerNumber) && Intrinsics.areEqual(this.updateConsent, mrtrPrepaidRegisterMultiSimRequest.updateConsent) && Intrinsics.areEqual(this.nontelcoConsentType, mrtrPrepaidRegisterMultiSimRequest.nontelcoConsentType) && Intrinsics.areEqual(this.consentVersionLabel, mrtrPrepaidRegisterMultiSimRequest.consentVersionLabel) && Intrinsics.areEqual(this.profile, mrtrPrepaidRegisterMultiSimRequest.profile) && Intrinsics.areEqual(this.channel, mrtrPrepaidRegisterMultiSimRequest.channel) && Intrinsics.areEqual(this.isSmartCardData, mrtrPrepaidRegisterMultiSimRequest.isSmartCardData) && Intrinsics.areEqual(this.userCode, mrtrPrepaidRegisterMultiSimRequest.userCode) && Intrinsics.areEqual(this.attachmentsName, mrtrPrepaidRegisterMultiSimRequest.attachmentsName) && Intrinsics.areEqual(this.userLan, mrtrPrepaidRegisterMultiSimRequest.userLan) && Intrinsics.areEqual(this.rtrName, mrtrPrepaidRegisterMultiSimRequest.rtrName) && Intrinsics.areEqual(this.subChannel, mrtrPrepaidRegisterMultiSimRequest.subChannel) && Intrinsics.areEqual(this.userFormatType, mrtrPrepaidRegisterMultiSimRequest.userFormatType) && Intrinsics.areEqual(this.faceRecognition, mrtrPrepaidRegisterMultiSimRequest.faceRecognition) && Intrinsics.areEqual(this.isActivate, mrtrPrepaidRegisterMultiSimRequest.isActivate) && Intrinsics.areEqual(this.featureCode, mrtrPrepaidRegisterMultiSimRequest.featureCode) && Intrinsics.areEqual(this.familyPairNumber, mrtrPrepaidRegisterMultiSimRequest.familyPairNumber) && Intrinsics.areEqual(this.identityPhotoName, mrtrPrepaidRegisterMultiSimRequest.identityPhotoName) && Intrinsics.areEqual(this.profileImage, mrtrPrepaidRegisterMultiSimRequest.profileImage) && Intrinsics.areEqual(this.customerPhotoName, mrtrPrepaidRegisterMultiSimRequest.customerPhotoName) && Intrinsics.areEqual(this.eSIMFlag, mrtrPrepaidRegisterMultiSimRequest.eSIMFlag) && Intrinsics.areEqual(this.consentType, mrtrPrepaidRegisterMultiSimRequest.consentType) && Intrinsics.areEqual(this.consentVersion, mrtrPrepaidRegisterMultiSimRequest.consentVersion) && Intrinsics.areEqual(this.dopaFlag, mrtrPrepaidRegisterMultiSimRequest.dopaFlag) && Intrinsics.areEqual(this.dipChipStatus, mrtrPrepaidRegisterMultiSimRequest.dipChipStatus) && Intrinsics.areEqual(this.slugID, mrtrPrepaidRegisterMultiSimRequest.slugID) && Intrinsics.areEqual(this.verifyDocType, mrtrPrepaidRegisterMultiSimRequest.verifyDocType);
        }
        return false;
    }

    @Nullable
    public final List<String> getAttachmentsName() {
        return this.attachmentsName;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getConsentType() {
        return this.consentType;
    }

    @Nullable
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getCustomerPhotoName() {
        return this.customerPhotoName;
    }

    @Nullable
    public final String getDipChipStatus() {
        return this.dipChipStatus;
    }

    @Nullable
    public final Boolean getDopaFlag() {
        return this.dopaFlag;
    }

    @Nullable
    public final Boolean getESIMFlag() {
        return this.eSIMFlag;
    }

    @Nullable
    public final FaceCompareResponseSubmit getFaceRecognition() {
        return this.faceRecognition;
    }

    @Nullable
    public final String getFamilyPairNumber() {
        return this.familyPairNumber;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final String getIdentityPhotoName() {
        return this.identityPhotoName;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String getObjectReferenceID() {
        return this.objectReferenceID;
    }

    @Nullable
    public final Profile getProfile() {
        return this.profile;
    }

    @Nullable
    public final String getProfileImage() {
        return this.profileImage;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @Nullable
    public final String getRtrName() {
        return this.rtrName;
    }

    @Nullable
    public final String getRtrTransactionId() {
        return this.rtrTransactionId;
    }

    @Nullable
    public final String getSlugID() {
        return this.slugID;
    }

    @Nullable
    public final String getSubChannel() {
        return this.subChannel;
    }

    @Nullable
    public final Subscriber getSubscriber() {
        return this.subscriber;
    }

    @Nullable
    public final Boolean getUpdateConsent() {
        return this.updateConsent;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    @Nullable
    public final String getVerifyDocType() {
        return this.verifyDocType;
    }

    public int hashCode() {
        String str = this.rtrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Subscriber subscriber = this.subscriber;
        int hashCode2 = (hashCode + (subscriber == null ? 0 : subscriber.hashCode())) * 31;
        String str2 = this.rtrTransactionId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.objectReferenceID;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerNumber;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.updateConsent;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.nontelcoConsentType;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.consentVersionLabel;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Profile profile = this.profile;
        int hashCode9 = (hashCode8 + (profile == null ? 0 : profile.hashCode())) * 31;
        String str7 = this.channel;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.isSmartCardData;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userCode;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.attachmentsName;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.userLan;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rtrName;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.subChannel;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.userFormatType;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        FaceCompareResponseSubmit faceCompareResponseSubmit = this.faceRecognition;
        int hashCode18 = (hashCode17 + (faceCompareResponseSubmit == null ? 0 : faceCompareResponseSubmit.hashCode())) * 31;
        Boolean bool2 = this.isActivate;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.featureCode;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.familyPairNumber;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.identityPhotoName;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.profileImage;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.customerPhotoName;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool3 = this.eSIMFlag;
        int hashCode25 = (hashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str19 = this.consentType;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.consentVersion;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool4 = this.dopaFlag;
        int hashCode28 = (hashCode27 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str21 = this.dipChipStatus;
        int hashCode29 = (hashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.slugID;
        int hashCode30 = (hashCode29 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.verifyDocType;
        return hashCode30 + (str23 != null ? str23.hashCode() : 0);
    }

    @Nullable
    public final Boolean isActivate() {
        return this.isActivate;
    }

    @Nullable
    public final String isSmartCardData() {
        return this.isSmartCardData;
    }

    public final void setActivate(@Nullable Boolean bool) {
        this.isActivate = bool;
    }

    public final void setConsentType(@Nullable String str) {
        this.consentType = str;
    }

    public final void setConsentVersion(@Nullable String str) {
        this.consentVersion = str;
    }

    public final void setConsentVersionLabel(@Nullable String str) {
        this.consentVersionLabel = str;
    }

    public final void setCustomerNumber(@Nullable String str) {
        this.customerNumber = str;
    }

    public final void setCustomerPhotoName(@Nullable String str) {
        this.customerPhotoName = str;
    }

    public final void setDipChipStatus(@Nullable String str) {
        this.dipChipStatus = str;
    }

    public final void setDopaFlag(@Nullable Boolean bool) {
        this.dopaFlag = bool;
    }

    public final void setESIMFlag(@Nullable Boolean bool) {
        this.eSIMFlag = bool;
    }

    public final void setFamilyPairNumber(@Nullable String str) {
        this.familyPairNumber = str;
    }

    public final void setFeatureCode(@Nullable String str) {
        this.featureCode = str;
    }

    public final void setIdentityPhotoName(@Nullable String str) {
        this.identityPhotoName = str;
    }

    public final void setNontelcoConsentType(@Nullable String str) {
        this.nontelcoConsentType = str;
    }

    public final void setObjectReferenceID(@Nullable String str) {
        this.objectReferenceID = str;
    }

    public final void setProfileImage(@Nullable String str) {
        this.profileImage = str;
    }

    public final void setRtrTransactionId(@Nullable String str) {
        this.rtrTransactionId = str;
    }

    public final void setSlugID(@Nullable String str) {
        this.slugID = str;
    }

    public final void setUpdateConsent(@Nullable Boolean bool) {
        this.updateConsent = bool;
    }

    public final void setVerifyDocType(@Nullable String str) {
        this.verifyDocType = str;
    }

    @NotNull
    public String toString() {
        String str = this.rtrCode;
        Subscriber subscriber = this.subscriber;
        String str2 = this.rtrTransactionId;
        String str3 = this.objectReferenceID;
        String str4 = this.customerNumber;
        Boolean bool = this.updateConsent;
        String str5 = this.nontelcoConsentType;
        String str6 = this.consentVersionLabel;
        Profile profile = this.profile;
        String str7 = this.channel;
        String str8 = this.isSmartCardData;
        String str9 = this.userCode;
        List<String> list = this.attachmentsName;
        String str10 = this.userLan;
        String str11 = this.rtrName;
        String str12 = this.subChannel;
        String str13 = this.userFormatType;
        FaceCompareResponseSubmit faceCompareResponseSubmit = this.faceRecognition;
        Boolean bool2 = this.isActivate;
        String str14 = this.featureCode;
        String str15 = this.familyPairNumber;
        String str16 = this.identityPhotoName;
        String str17 = this.profileImage;
        String str18 = this.customerPhotoName;
        Boolean bool3 = this.eSIMFlag;
        String str19 = this.consentType;
        String str20 = this.consentVersion;
        Boolean bool4 = this.dopaFlag;
        String str21 = this.dipChipStatus;
        String str22 = this.slugID;
        String str23 = this.verifyDocType;
        return "MrtrPrepaidRegisterMultiSimRequest(rtrCode=" + str + ", subscriber=" + subscriber + ", rtrTransactionId=" + str2 + ", objectReferenceID=" + str3 + ", customerNumber=" + str4 + ", updateConsent=" + bool + ", nontelcoConsentType=" + str5 + ", consentVersionLabel=" + str6 + ", profile=" + profile + ", channel=" + str7 + ", isSmartCardData=" + str8 + ", userCode=" + str9 + ", attachmentsName=" + list + ", userLan=" + str10 + ", rtrName=" + str11 + ", subChannel=" + str12 + ", userFormatType=" + str13 + ", faceRecognition=" + faceCompareResponseSubmit + ", isActivate=" + bool2 + ", featureCode=" + str14 + ", familyPairNumber=" + str15 + ", identityPhotoName=" + str16 + ", profileImage=" + str17 + ", customerPhotoName=" + str18 + ", eSIMFlag=" + bool3 + ", consentType=" + str19 + ", consentVersion=" + str20 + ", dopaFlag=" + bool4 + ", dipChipStatus=" + str21 + ", slugID=" + str22 + ", verifyDocType=" + str23 + ")";
    }

    public MrtrPrepaidRegisterMultiSimRequest(@Nullable String str, @Nullable Subscriber subscriber, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable Profile profile, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable FaceCompareResponseSubmit faceCompareResponseSubmit, @Nullable Boolean bool2, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable Boolean bool3, @Nullable String str19, @Nullable String str20, @Nullable Boolean bool4, @Nullable String str21, @Nullable String str22, @Nullable String str23) {
        this.rtrCode = str;
        this.subscriber = subscriber;
        this.rtrTransactionId = str2;
        this.objectReferenceID = str3;
        this.customerNumber = str4;
        this.updateConsent = bool;
        this.nontelcoConsentType = str5;
        this.consentVersionLabel = str6;
        this.profile = profile;
        this.channel = str7;
        this.isSmartCardData = str8;
        this.userCode = str9;
        this.attachmentsName = list;
        this.userLan = str10;
        this.rtrName = str11;
        this.subChannel = str12;
        this.userFormatType = str13;
        this.faceRecognition = faceCompareResponseSubmit;
        this.isActivate = bool2;
        this.featureCode = str14;
        this.familyPairNumber = str15;
        this.identityPhotoName = str16;
        this.profileImage = str17;
        this.customerPhotoName = str18;
        this.eSIMFlag = bool3;
        this.consentType = str19;
        this.consentVersion = str20;
        this.dopaFlag = bool4;
        this.dipChipStatus = str21;
        this.slugID = str22;
        this.verifyDocType = str23;
    }

    public /* synthetic */ MrtrPrepaidRegisterMultiSimRequest(String str, Subscriber subscriber, String str2, String str3, String str4, Boolean bool, String str5, String str6, Profile profile, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, FaceCompareResponseSubmit faceCompareResponseSubmit, Boolean bool2, String str14, String str15, String str16, String str17, String str18, Boolean bool3, String str19, String str20, Boolean bool4, String str21, String str22, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : subscriber, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : profile, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : str13, (i & 131072) != 0 ? null : faceCompareResponseSubmit, (i & 262144) != 0 ? null : bool2, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? null : str15, (i & 2097152) != 0 ? null : str16, (i & 4194304) != 0 ? null : str17, (i & 8388608) != 0 ? null : str18, (i & 16777216) != 0 ? Boolean.FALSE : bool3, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str19, (i & 67108864) != 0 ? null : str20, (i & 134217728) != 0 ? Boolean.FALSE : bool4, (i & 268435456) != 0 ? null : str21, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : str22, (i & 1073741824) != 0 ? null : str23);
    }
}