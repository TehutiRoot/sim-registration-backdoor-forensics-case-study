package th.p047co.dtac.android.dtacone.model.upPass;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\bR\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010'J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u001fHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u001fHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J©\u0003\u0010n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010o\u001a\u00020\u001f2\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020rHÖ\u0001J\t\u0010s\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010+R\u0016\u0010!\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)¨\u0006t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/QueryResultData;", "", "readForm", "", "readFormStatus", "readNationality", "readDocumentType", "verificationDocType", "readDocumentNumber", "readNamePrefix", "readFullNameFirstName", "readFullNameLastName", "readDateOfBirth", "readDateOfBirthUppass", "readDateOfIssue", "readDateOfExpiry", "readAddressType", "readHomeAddressCountry", "readHomeAddressProvince", "readHomeAddressDistrict", "readHomeAddressSubdistrict", "readHomeAddressNumber", "readHomeAddressZipcode", "readGender", "readFullNameEnFirstName", "readFullNameEnLastName", "readHomeAddressFull", "readDocumentImage", "dopaStatus", "dopaFlag", "isDopaByPass", "", "verificationDopa", "isManualKeyIn", "readFaceCompareStatus", "readFaceCompareScore", "readFaceCompareImage", "verificationSlugId", "verificationForm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDopaFlag", "()Ljava/lang/String;", "getDopaStatus", "()Z", "getReadAddressType", "getReadDateOfBirth", "getReadDateOfBirthUppass", "getReadDateOfExpiry", "getReadDateOfIssue", "getReadDocumentImage", "getReadDocumentNumber", "getReadDocumentType", "getReadFaceCompareImage", "getReadFaceCompareScore", "getReadFaceCompareStatus", "getReadForm", "getReadFormStatus", "getReadFullNameEnFirstName", "getReadFullNameEnLastName", "getReadFullNameFirstName", "getReadFullNameLastName", "getReadGender", "getReadHomeAddressCountry", "getReadHomeAddressDistrict", "getReadHomeAddressFull", "getReadHomeAddressNumber", "getReadHomeAddressProvince", "getReadHomeAddressSubdistrict", "getReadHomeAddressZipcode", "getReadNamePrefix", "getReadNationality", "getVerificationDocType", "getVerificationDopa", "getVerificationForm", "getVerificationSlugId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.QueryResultData */
/* loaded from: classes8.dex */
public final class QueryResultData {
    public static final int $stable = 0;
    @SerializedName("dopaFlag")
    @Nullable
    private final String dopaFlag;
    @SerializedName("dopaStatus")
    @Nullable
    private final String dopaStatus;
    @SerializedName("isDopaByPass")
    private final boolean isDopaByPass;
    @SerializedName("isManualKeyIn")
    private final boolean isManualKeyIn;
    @SerializedName("readAddressType")
    @Nullable
    private final String readAddressType;
    @SerializedName("readDateOfBirth")
    @Nullable
    private final String readDateOfBirth;
    @SerializedName("readDateOfBirthUppass")
    @Nullable
    private final String readDateOfBirthUppass;
    @SerializedName("readDateOfExpiry")
    @Nullable
    private final String readDateOfExpiry;
    @SerializedName("readDateOfIssue")
    @Nullable
    private final String readDateOfIssue;
    @SerializedName("readDocumentImage")
    @Nullable
    private final String readDocumentImage;
    @SerializedName("readDocumentNumber")
    @Nullable
    private final String readDocumentNumber;
    @SerializedName("readDocumentType")
    @Nullable
    private final String readDocumentType;
    @SerializedName("readFaceCompareImage")
    @Nullable
    private final String readFaceCompareImage;
    @SerializedName("readFaceCompareScore")
    @Nullable
    private final String readFaceCompareScore;
    @SerializedName("readFaceCompareStatus")
    @Nullable
    private final String readFaceCompareStatus;
    @SerializedName("readForm")
    @Nullable
    private final String readForm;
    @SerializedName("readFormStatus")
    @Nullable
    private final String readFormStatus;
    @SerializedName("readFullNameEnFirstName")
    @Nullable
    private final String readFullNameEnFirstName;
    @SerializedName("readFullNameEnLastName")
    @Nullable
    private final String readFullNameEnLastName;
    @SerializedName("readFullNameFirstName")
    @Nullable
    private final String readFullNameFirstName;
    @SerializedName("readFullNameLastName")
    @Nullable
    private final String readFullNameLastName;
    @SerializedName("readGender")
    @Nullable
    private final String readGender;
    @SerializedName("readHomeAddressCountry")
    @Nullable
    private final String readHomeAddressCountry;
    @SerializedName("readHomeAddressDistrict")
    @Nullable
    private final String readHomeAddressDistrict;
    @SerializedName("readHomeAddressFull")
    @Nullable
    private final String readHomeAddressFull;
    @SerializedName("readHomeAddressNumber")
    @Nullable
    private final String readHomeAddressNumber;
    @SerializedName("readHomeAddressProvince")
    @Nullable
    private final String readHomeAddressProvince;
    @SerializedName("readHomeAddressSubdistrict")
    @Nullable
    private final String readHomeAddressSubdistrict;
    @SerializedName("readHomeAddressZipcode")
    @Nullable
    private final String readHomeAddressZipcode;
    @SerializedName("readNamePrefix")
    @Nullable
    private final String readNamePrefix;
    @SerializedName("readNationality")
    @Nullable
    private final String readNationality;
    @SerializedName("verificationDocType")
    @Nullable
    private final String verificationDocType;
    @SerializedName("verificationDopa")
    @Nullable
    private final String verificationDopa;
    @SerializedName("verificationForm")
    @Nullable
    private final String verificationForm;
    @SerializedName("verificationSlugId")
    @Nullable
    private final String verificationSlugId;

    public QueryResultData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, -1, 7, null);
    }

    @Nullable
    public final String component1() {
        return this.readForm;
    }

    @Nullable
    public final String component10() {
        return this.readDateOfBirth;
    }

    @Nullable
    public final String component11() {
        return this.readDateOfBirthUppass;
    }

    @Nullable
    public final String component12() {
        return this.readDateOfIssue;
    }

    @Nullable
    public final String component13() {
        return this.readDateOfExpiry;
    }

    @Nullable
    public final String component14() {
        return this.readAddressType;
    }

    @Nullable
    public final String component15() {
        return this.readHomeAddressCountry;
    }

    @Nullable
    public final String component16() {
        return this.readHomeAddressProvince;
    }

    @Nullable
    public final String component17() {
        return this.readHomeAddressDistrict;
    }

    @Nullable
    public final String component18() {
        return this.readHomeAddressSubdistrict;
    }

    @Nullable
    public final String component19() {
        return this.readHomeAddressNumber;
    }

    @Nullable
    public final String component2() {
        return this.readFormStatus;
    }

    @Nullable
    public final String component20() {
        return this.readHomeAddressZipcode;
    }

    @Nullable
    public final String component21() {
        return this.readGender;
    }

    @Nullable
    public final String component22() {
        return this.readFullNameEnFirstName;
    }

    @Nullable
    public final String component23() {
        return this.readFullNameEnLastName;
    }

    @Nullable
    public final String component24() {
        return this.readHomeAddressFull;
    }

    @Nullable
    public final String component25() {
        return this.readDocumentImage;
    }

    @Nullable
    public final String component26() {
        return this.dopaStatus;
    }

    @Nullable
    public final String component27() {
        return this.dopaFlag;
    }

    public final boolean component28() {
        return this.isDopaByPass;
    }

    @Nullable
    public final String component29() {
        return this.verificationDopa;
    }

    @Nullable
    public final String component3() {
        return this.readNationality;
    }

    public final boolean component30() {
        return this.isManualKeyIn;
    }

    @Nullable
    public final String component31() {
        return this.readFaceCompareStatus;
    }

    @Nullable
    public final String component32() {
        return this.readFaceCompareScore;
    }

    @Nullable
    public final String component33() {
        return this.readFaceCompareImage;
    }

    @Nullable
    public final String component34() {
        return this.verificationSlugId;
    }

    @Nullable
    public final String component35() {
        return this.verificationForm;
    }

    @Nullable
    public final String component4() {
        return this.readDocumentType;
    }

    @Nullable
    public final String component5() {
        return this.verificationDocType;
    }

    @Nullable
    public final String component6() {
        return this.readDocumentNumber;
    }

    @Nullable
    public final String component7() {
        return this.readNamePrefix;
    }

    @Nullable
    public final String component8() {
        return this.readFullNameFirstName;
    }

    @Nullable
    public final String component9() {
        return this.readFullNameLastName;
    }

    @NotNull
    public final QueryResultData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, boolean z, @Nullable String str28, boolean z2, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33) {
        return new QueryResultData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, z, str28, z2, str29, str30, str31, str32, str33);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QueryResultData) {
            QueryResultData queryResultData = (QueryResultData) obj;
            return Intrinsics.areEqual(this.readForm, queryResultData.readForm) && Intrinsics.areEqual(this.readFormStatus, queryResultData.readFormStatus) && Intrinsics.areEqual(this.readNationality, queryResultData.readNationality) && Intrinsics.areEqual(this.readDocumentType, queryResultData.readDocumentType) && Intrinsics.areEqual(this.verificationDocType, queryResultData.verificationDocType) && Intrinsics.areEqual(this.readDocumentNumber, queryResultData.readDocumentNumber) && Intrinsics.areEqual(this.readNamePrefix, queryResultData.readNamePrefix) && Intrinsics.areEqual(this.readFullNameFirstName, queryResultData.readFullNameFirstName) && Intrinsics.areEqual(this.readFullNameLastName, queryResultData.readFullNameLastName) && Intrinsics.areEqual(this.readDateOfBirth, queryResultData.readDateOfBirth) && Intrinsics.areEqual(this.readDateOfBirthUppass, queryResultData.readDateOfBirthUppass) && Intrinsics.areEqual(this.readDateOfIssue, queryResultData.readDateOfIssue) && Intrinsics.areEqual(this.readDateOfExpiry, queryResultData.readDateOfExpiry) && Intrinsics.areEqual(this.readAddressType, queryResultData.readAddressType) && Intrinsics.areEqual(this.readHomeAddressCountry, queryResultData.readHomeAddressCountry) && Intrinsics.areEqual(this.readHomeAddressProvince, queryResultData.readHomeAddressProvince) && Intrinsics.areEqual(this.readHomeAddressDistrict, queryResultData.readHomeAddressDistrict) && Intrinsics.areEqual(this.readHomeAddressSubdistrict, queryResultData.readHomeAddressSubdistrict) && Intrinsics.areEqual(this.readHomeAddressNumber, queryResultData.readHomeAddressNumber) && Intrinsics.areEqual(this.readHomeAddressZipcode, queryResultData.readHomeAddressZipcode) && Intrinsics.areEqual(this.readGender, queryResultData.readGender) && Intrinsics.areEqual(this.readFullNameEnFirstName, queryResultData.readFullNameEnFirstName) && Intrinsics.areEqual(this.readFullNameEnLastName, queryResultData.readFullNameEnLastName) && Intrinsics.areEqual(this.readHomeAddressFull, queryResultData.readHomeAddressFull) && Intrinsics.areEqual(this.readDocumentImage, queryResultData.readDocumentImage) && Intrinsics.areEqual(this.dopaStatus, queryResultData.dopaStatus) && Intrinsics.areEqual(this.dopaFlag, queryResultData.dopaFlag) && this.isDopaByPass == queryResultData.isDopaByPass && Intrinsics.areEqual(this.verificationDopa, queryResultData.verificationDopa) && this.isManualKeyIn == queryResultData.isManualKeyIn && Intrinsics.areEqual(this.readFaceCompareStatus, queryResultData.readFaceCompareStatus) && Intrinsics.areEqual(this.readFaceCompareScore, queryResultData.readFaceCompareScore) && Intrinsics.areEqual(this.readFaceCompareImage, queryResultData.readFaceCompareImage) && Intrinsics.areEqual(this.verificationSlugId, queryResultData.verificationSlugId) && Intrinsics.areEqual(this.verificationForm, queryResultData.verificationForm);
        }
        return false;
    }

    @Nullable
    public final String getDopaFlag() {
        return this.dopaFlag;
    }

    @Nullable
    public final String getDopaStatus() {
        return this.dopaStatus;
    }

    @Nullable
    public final String getReadAddressType() {
        return this.readAddressType;
    }

    @Nullable
    public final String getReadDateOfBirth() {
        return this.readDateOfBirth;
    }

    @Nullable
    public final String getReadDateOfBirthUppass() {
        return this.readDateOfBirthUppass;
    }

    @Nullable
    public final String getReadDateOfExpiry() {
        return this.readDateOfExpiry;
    }

    @Nullable
    public final String getReadDateOfIssue() {
        return this.readDateOfIssue;
    }

    @Nullable
    public final String getReadDocumentImage() {
        return this.readDocumentImage;
    }

    @Nullable
    public final String getReadDocumentNumber() {
        return this.readDocumentNumber;
    }

    @Nullable
    public final String getReadDocumentType() {
        return this.readDocumentType;
    }

    @Nullable
    public final String getReadFaceCompareImage() {
        return this.readFaceCompareImage;
    }

    @Nullable
    public final String getReadFaceCompareScore() {
        return this.readFaceCompareScore;
    }

    @Nullable
    public final String getReadFaceCompareStatus() {
        return this.readFaceCompareStatus;
    }

    @Nullable
    public final String getReadForm() {
        return this.readForm;
    }

    @Nullable
    public final String getReadFormStatus() {
        return this.readFormStatus;
    }

    @Nullable
    public final String getReadFullNameEnFirstName() {
        return this.readFullNameEnFirstName;
    }

    @Nullable
    public final String getReadFullNameEnLastName() {
        return this.readFullNameEnLastName;
    }

    @Nullable
    public final String getReadFullNameFirstName() {
        return this.readFullNameFirstName;
    }

    @Nullable
    public final String getReadFullNameLastName() {
        return this.readFullNameLastName;
    }

    @Nullable
    public final String getReadGender() {
        return this.readGender;
    }

    @Nullable
    public final String getReadHomeAddressCountry() {
        return this.readHomeAddressCountry;
    }

    @Nullable
    public final String getReadHomeAddressDistrict() {
        return this.readHomeAddressDistrict;
    }

    @Nullable
    public final String getReadHomeAddressFull() {
        return this.readHomeAddressFull;
    }

    @Nullable
    public final String getReadHomeAddressNumber() {
        return this.readHomeAddressNumber;
    }

    @Nullable
    public final String getReadHomeAddressProvince() {
        return this.readHomeAddressProvince;
    }

    @Nullable
    public final String getReadHomeAddressSubdistrict() {
        return this.readHomeAddressSubdistrict;
    }

    @Nullable
    public final String getReadHomeAddressZipcode() {
        return this.readHomeAddressZipcode;
    }

    @Nullable
    public final String getReadNamePrefix() {
        return this.readNamePrefix;
    }

    @Nullable
    public final String getReadNationality() {
        return this.readNationality;
    }

    @Nullable
    public final String getVerificationDocType() {
        return this.verificationDocType;
    }

    @Nullable
    public final String getVerificationDopa() {
        return this.verificationDopa;
    }

    @Nullable
    public final String getVerificationForm() {
        return this.verificationForm;
    }

    @Nullable
    public final String getVerificationSlugId() {
        return this.verificationSlugId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.readForm;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.readFormStatus;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.readNationality;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.readDocumentType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.verificationDocType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.readDocumentNumber;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.readNamePrefix;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.readFullNameFirstName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.readFullNameLastName;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.readDateOfBirth;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.readDateOfBirthUppass;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.readDateOfIssue;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.readDateOfExpiry;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.readAddressType;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.readHomeAddressCountry;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.readHomeAddressProvince;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.readHomeAddressDistrict;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.readHomeAddressSubdistrict;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.readHomeAddressNumber;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.readHomeAddressZipcode;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.readGender;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.readFullNameEnFirstName;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.readFullNameEnLastName;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.readHomeAddressFull;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.readDocumentImage;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.dopaStatus;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.dopaFlag;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        boolean z = this.isDopaByPass;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode27 + i) * 31;
        String str28 = this.verificationDopa;
        int hashCode28 = (i2 + (str28 == null ? 0 : str28.hashCode())) * 31;
        boolean z2 = this.isManualKeyIn;
        int i3 = (hashCode28 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str29 = this.readFaceCompareStatus;
        int hashCode29 = (i3 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.readFaceCompareScore;
        int hashCode30 = (hashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.readFaceCompareImage;
        int hashCode31 = (hashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.verificationSlugId;
        int hashCode32 = (hashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.verificationForm;
        return hashCode32 + (str33 != null ? str33.hashCode() : 0);
    }

    public final boolean isDopaByPass() {
        return this.isDopaByPass;
    }

    public final boolean isManualKeyIn() {
        return this.isManualKeyIn;
    }

    @NotNull
    public String toString() {
        String str = this.readForm;
        String str2 = this.readFormStatus;
        String str3 = this.readNationality;
        String str4 = this.readDocumentType;
        String str5 = this.verificationDocType;
        String str6 = this.readDocumentNumber;
        String str7 = this.readNamePrefix;
        String str8 = this.readFullNameFirstName;
        String str9 = this.readFullNameLastName;
        String str10 = this.readDateOfBirth;
        String str11 = this.readDateOfBirthUppass;
        String str12 = this.readDateOfIssue;
        String str13 = this.readDateOfExpiry;
        String str14 = this.readAddressType;
        String str15 = this.readHomeAddressCountry;
        String str16 = this.readHomeAddressProvince;
        String str17 = this.readHomeAddressDistrict;
        String str18 = this.readHomeAddressSubdistrict;
        String str19 = this.readHomeAddressNumber;
        String str20 = this.readHomeAddressZipcode;
        String str21 = this.readGender;
        String str22 = this.readFullNameEnFirstName;
        String str23 = this.readFullNameEnLastName;
        String str24 = this.readHomeAddressFull;
        String str25 = this.readDocumentImage;
        String str26 = this.dopaStatus;
        String str27 = this.dopaFlag;
        boolean z = this.isDopaByPass;
        String str28 = this.verificationDopa;
        boolean z2 = this.isManualKeyIn;
        String str29 = this.readFaceCompareStatus;
        String str30 = this.readFaceCompareScore;
        String str31 = this.readFaceCompareImage;
        String str32 = this.verificationSlugId;
        String str33 = this.verificationForm;
        return "QueryResultData(readForm=" + str + ", readFormStatus=" + str2 + ", readNationality=" + str3 + ", readDocumentType=" + str4 + ", verificationDocType=" + str5 + ", readDocumentNumber=" + str6 + ", readNamePrefix=" + str7 + ", readFullNameFirstName=" + str8 + ", readFullNameLastName=" + str9 + ", readDateOfBirth=" + str10 + ", readDateOfBirthUppass=" + str11 + ", readDateOfIssue=" + str12 + ", readDateOfExpiry=" + str13 + ", readAddressType=" + str14 + ", readHomeAddressCountry=" + str15 + ", readHomeAddressProvince=" + str16 + ", readHomeAddressDistrict=" + str17 + ", readHomeAddressSubdistrict=" + str18 + ", readHomeAddressNumber=" + str19 + ", readHomeAddressZipcode=" + str20 + ", readGender=" + str21 + ", readFullNameEnFirstName=" + str22 + ", readFullNameEnLastName=" + str23 + ", readHomeAddressFull=" + str24 + ", readDocumentImage=" + str25 + ", dopaStatus=" + str26 + ", dopaFlag=" + str27 + ", isDopaByPass=" + z + ", verificationDopa=" + str28 + ", isManualKeyIn=" + z2 + ", readFaceCompareStatus=" + str29 + ", readFaceCompareScore=" + str30 + ", readFaceCompareImage=" + str31 + ", verificationSlugId=" + str32 + ", verificationForm=" + str33 + ")";
    }

    public QueryResultData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, boolean z, @Nullable String str28, boolean z2, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33) {
        this.readForm = str;
        this.readFormStatus = str2;
        this.readNationality = str3;
        this.readDocumentType = str4;
        this.verificationDocType = str5;
        this.readDocumentNumber = str6;
        this.readNamePrefix = str7;
        this.readFullNameFirstName = str8;
        this.readFullNameLastName = str9;
        this.readDateOfBirth = str10;
        this.readDateOfBirthUppass = str11;
        this.readDateOfIssue = str12;
        this.readDateOfExpiry = str13;
        this.readAddressType = str14;
        this.readHomeAddressCountry = str15;
        this.readHomeAddressProvince = str16;
        this.readHomeAddressDistrict = str17;
        this.readHomeAddressSubdistrict = str18;
        this.readHomeAddressNumber = str19;
        this.readHomeAddressZipcode = str20;
        this.readGender = str21;
        this.readFullNameEnFirstName = str22;
        this.readFullNameEnLastName = str23;
        this.readHomeAddressFull = str24;
        this.readDocumentImage = str25;
        this.dopaStatus = str26;
        this.dopaFlag = str27;
        this.isDopaByPass = z;
        this.verificationDopa = str28;
        this.isManualKeyIn = z2;
        this.readFaceCompareStatus = str29;
        this.readFaceCompareScore = str30;
        this.readFaceCompareImage = str31;
        this.verificationSlugId = str32;
        this.verificationForm = str33;
    }

    public /* synthetic */ QueryResultData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z, String str28, boolean z2, String str29, String str30, String str31, String str32, String str33, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? false : z, (i & 268435456) != 0 ? "" : str28, (i & PKIFailureInfo.duplicateCertReq) == 0 ? z2 : false, (i & 1073741824) != 0 ? "" : str29, (i & Integer.MIN_VALUE) != 0 ? "" : str30, (i2 & 1) != 0 ? "" : str31, (i2 & 2) != 0 ? "" : str32, (i2 & 4) != 0 ? "" : str33);
    }
}