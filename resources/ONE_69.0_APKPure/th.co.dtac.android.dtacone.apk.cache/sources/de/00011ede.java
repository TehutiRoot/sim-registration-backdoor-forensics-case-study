package th.p047co.dtac.android.dtacone.model.mrtr_mnp.otp;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpResponse;", "", "operatorCode", "", "operatorName", "originOperatorCode", "originOperatorName", "simPrefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOperatorCode", "()Ljava/lang/String;", "getOperatorName", "getOriginOperatorCode", "getOriginOperatorName", "getSimPrefix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.otp.MnpRequestOtpResponse */
/* loaded from: classes8.dex */
public final class MnpRequestOtpResponse {
    public static final int $stable = 0;
    @SerializedName("operatorCode")
    @Nullable
    private final String operatorCode;
    @SerializedName("operatorName")
    @Nullable
    private final String operatorName;
    @SerializedName("originOperatorCode")
    @Nullable
    private final String originOperatorCode;
    @SerializedName("originOperatorName")
    @Nullable
    private final String originOperatorName;
    @SerializedName("simPrefix")
    @Nullable
    private final String simPrefix;

    public MnpRequestOtpResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MnpRequestOtpResponse copy$default(MnpRequestOtpResponse mnpRequestOtpResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mnpRequestOtpResponse.operatorCode;
        }
        if ((i & 2) != 0) {
            str2 = mnpRequestOtpResponse.operatorName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = mnpRequestOtpResponse.originOperatorCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = mnpRequestOtpResponse.originOperatorName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = mnpRequestOtpResponse.simPrefix;
        }
        return mnpRequestOtpResponse.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.operatorCode;
    }

    @Nullable
    public final String component2() {
        return this.operatorName;
    }

    @Nullable
    public final String component3() {
        return this.originOperatorCode;
    }

    @Nullable
    public final String component4() {
        return this.originOperatorName;
    }

    @Nullable
    public final String component5() {
        return this.simPrefix;
    }

    @NotNull
    public final MnpRequestOtpResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new MnpRequestOtpResponse(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MnpRequestOtpResponse) {
            MnpRequestOtpResponse mnpRequestOtpResponse = (MnpRequestOtpResponse) obj;
            return Intrinsics.areEqual(this.operatorCode, mnpRequestOtpResponse.operatorCode) && Intrinsics.areEqual(this.operatorName, mnpRequestOtpResponse.operatorName) && Intrinsics.areEqual(this.originOperatorCode, mnpRequestOtpResponse.originOperatorCode) && Intrinsics.areEqual(this.originOperatorName, mnpRequestOtpResponse.originOperatorName) && Intrinsics.areEqual(this.simPrefix, mnpRequestOtpResponse.simPrefix);
        }
        return false;
    }

    @Nullable
    public final String getOperatorCode() {
        return this.operatorCode;
    }

    @Nullable
    public final String getOperatorName() {
        return this.operatorName;
    }

    @Nullable
    public final String getOriginOperatorCode() {
        return this.originOperatorCode;
    }

    @Nullable
    public final String getOriginOperatorName() {
        return this.originOperatorName;
    }

    @Nullable
    public final String getSimPrefix() {
        return this.simPrefix;
    }

    public int hashCode() {
        String str = this.operatorCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.operatorName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originOperatorCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originOperatorName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.simPrefix;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.operatorCode;
        String str2 = this.operatorName;
        String str3 = this.originOperatorCode;
        String str4 = this.originOperatorName;
        String str5 = this.simPrefix;
        return "MnpRequestOtpResponse(operatorCode=" + str + ", operatorName=" + str2 + ", originOperatorCode=" + str3 + ", originOperatorName=" + str4 + ", simPrefix=" + str5 + ")";
    }

    public MnpRequestOtpResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.operatorCode = str;
        this.operatorName = str2;
        this.originOperatorCode = str3;
        this.originOperatorName = str4;
        this.simPrefix = str5;
    }

    public /* synthetic */ MnpRequestOtpResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}