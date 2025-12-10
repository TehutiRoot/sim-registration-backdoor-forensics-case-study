package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u009e\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u00101R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010\u0013R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u00101R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010*\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\bA\u0010\u0013R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010*\u001a\u0004\bC\u0010\u0013\"\u0004\bD\u00101R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010I¨\u0006J"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/PrepaidProfile;", "", "", "result", "statusDescription", "simCardNumber", "subscriberType", "subscriberId", "priceplan", "resultDesc", "idNumber", "msisdn", "statusCode", "idNumberShow", "", "reRegisterFlag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/PrepaidProfile;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getResult", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getStatusDescription", OperatorName.CURVE_TO, "getSimCardNumber", "setSimCardNumber", "(Ljava/lang/String;)V", "d", "getSubscriberType", "e", "getSubscriberId", OperatorName.FILL_NON_ZERO, "getPriceplan", OperatorName.NON_STROKING_GRAY, "getResultDesc", OperatorName.CLOSE_PATH, "getIdNumber", "setIdNumber", "i", "getMsisdn", "setMsisdn", OperatorName.SET_LINE_JOINSTYLE, "getStatusCode", OperatorName.NON_STROKING_CMYK, "getIdNumberShow", "setIdNumberShow", OperatorName.LINE_TO, "Z", "getReRegisterFlag", "setReRegisterFlag", "(Z)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.PrepaidProfile */
/* loaded from: classes7.dex */
public final class PrepaidProfile {
    public static final int $stable = 8;
    @SerializedName("result")
    @Nullable

    /* renamed from: a */
    private final String f82049a;
    @SerializedName("statusDescription")
    @Nullable

    /* renamed from: b */
    private final String f82050b;
    @SerializedName("simCardNumber")
    @Nullable

    /* renamed from: c */
    private String f82051c;
    @SerializedName("subscriberType")
    @Nullable

    /* renamed from: d */
    private final String f82052d;
    @SerializedName("subscriberId")
    @Nullable

    /* renamed from: e */
    private final String f82053e;
    @SerializedName("priceplan")
    @Nullable

    /* renamed from: f */
    private final String f82054f;
    @SerializedName("resultDesc")
    @Nullable

    /* renamed from: g */
    private final String f82055g;
    @SerializedName("idNumber")
    @Nullable

    /* renamed from: h */
    private String f82056h;
    @SerializedName("msisdn")
    @Nullable

    /* renamed from: i */
    private String f82057i;
    @SerializedName("statusCode")
    @Nullable

    /* renamed from: j */
    private final String f82058j;
    @SerializedName("idNumberShow")
    @Nullable

    /* renamed from: k */
    private String f82059k;
    @SerializedName("reRegisterFlag")

    /* renamed from: l */
    private boolean f82060l;

    public PrepaidProfile() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, 4095, null);
    }

    @Nullable
    public final String component1() {
        return this.f82049a;
    }

    @Nullable
    public final String component10() {
        return this.f82058j;
    }

    @Nullable
    public final String component11() {
        return this.f82059k;
    }

    public final boolean component12() {
        return this.f82060l;
    }

    @Nullable
    public final String component2() {
        return this.f82050b;
    }

    @Nullable
    public final String component3() {
        return this.f82051c;
    }

    @Nullable
    public final String component4() {
        return this.f82052d;
    }

    @Nullable
    public final String component5() {
        return this.f82053e;
    }

    @Nullable
    public final String component6() {
        return this.f82054f;
    }

    @Nullable
    public final String component7() {
        return this.f82055g;
    }

    @Nullable
    public final String component8() {
        return this.f82056h;
    }

    @Nullable
    public final String component9() {
        return this.f82057i;
    }

    @NotNull
    public final PrepaidProfile copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z) {
        return new PrepaidProfile(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrepaidProfile) {
            PrepaidProfile prepaidProfile = (PrepaidProfile) obj;
            return Intrinsics.areEqual(this.f82049a, prepaidProfile.f82049a) && Intrinsics.areEqual(this.f82050b, prepaidProfile.f82050b) && Intrinsics.areEqual(this.f82051c, prepaidProfile.f82051c) && Intrinsics.areEqual(this.f82052d, prepaidProfile.f82052d) && Intrinsics.areEqual(this.f82053e, prepaidProfile.f82053e) && Intrinsics.areEqual(this.f82054f, prepaidProfile.f82054f) && Intrinsics.areEqual(this.f82055g, prepaidProfile.f82055g) && Intrinsics.areEqual(this.f82056h, prepaidProfile.f82056h) && Intrinsics.areEqual(this.f82057i, prepaidProfile.f82057i) && Intrinsics.areEqual(this.f82058j, prepaidProfile.f82058j) && Intrinsics.areEqual(this.f82059k, prepaidProfile.f82059k) && this.f82060l == prepaidProfile.f82060l;
        }
        return false;
    }

    @Nullable
    public final String getIdNumber() {
        return this.f82056h;
    }

    @Nullable
    public final String getIdNumberShow() {
        return this.f82059k;
    }

    @Nullable
    public final String getMsisdn() {
        return this.f82057i;
    }

    @Nullable
    public final String getPriceplan() {
        return this.f82054f;
    }

    public final boolean getReRegisterFlag() {
        return this.f82060l;
    }

    @Nullable
    public final String getResult() {
        return this.f82049a;
    }

    @Nullable
    public final String getResultDesc() {
        return this.f82055g;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.f82051c;
    }

    @Nullable
    public final String getStatusCode() {
        return this.f82058j;
    }

    @Nullable
    public final String getStatusDescription() {
        return this.f82050b;
    }

    @Nullable
    public final String getSubscriberId() {
        return this.f82053e;
    }

    @Nullable
    public final String getSubscriberType() {
        return this.f82052d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f82049a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82050b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82051c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82052d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82053e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82054f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f82055g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f82056h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f82057i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f82058j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f82059k;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z = this.f82060l;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode11 + i;
    }

    public final void setIdNumber(@Nullable String str) {
        this.f82056h = str;
    }

    public final void setIdNumberShow(@Nullable String str) {
        this.f82059k = str;
    }

    public final void setMsisdn(@Nullable String str) {
        this.f82057i = str;
    }

    public final void setReRegisterFlag(boolean z) {
        this.f82060l = z;
    }

    public final void setSimCardNumber(@Nullable String str) {
        this.f82051c = str;
    }

    @NotNull
    public String toString() {
        String str = this.f82049a;
        String str2 = this.f82050b;
        String str3 = this.f82051c;
        String str4 = this.f82052d;
        String str5 = this.f82053e;
        String str6 = this.f82054f;
        String str7 = this.f82055g;
        String str8 = this.f82056h;
        String str9 = this.f82057i;
        String str10 = this.f82058j;
        String str11 = this.f82059k;
        boolean z = this.f82060l;
        return "PrepaidProfile(result=" + str + ", statusDescription=" + str2 + ", simCardNumber=" + str3 + ", subscriberType=" + str4 + ", subscriberId=" + str5 + ", priceplan=" + str6 + ", resultDesc=" + str7 + ", idNumber=" + str8 + ", msisdn=" + str9 + ", statusCode=" + str10 + ", idNumberShow=" + str11 + ", reRegisterFlag=" + z + ")";
    }

    public PrepaidProfile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z) {
        this.f82049a = str;
        this.f82050b = str2;
        this.f82051c = str3;
        this.f82052d = str4;
        this.f82053e = str5;
        this.f82054f = str6;
        this.f82055g = str7;
        this.f82056h = str8;
        this.f82057i = str9;
        this.f82058j = str10;
        this.f82059k = str11;
        this.f82060l = z;
    }

    public /* synthetic */ PrepaidProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null, (i & 2048) != 0 ? false : z);
    }
}