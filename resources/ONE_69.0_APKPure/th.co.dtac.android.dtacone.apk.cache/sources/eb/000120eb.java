package th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2GetStatusData;", "", "verifyStatus", "", "verifyResult", "verifyReason", "verifyBy", "verifyDateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVerifyBy", "()Ljava/lang/String;", "getVerifyDateTime", "getVerifyReason", "getVerifyResult", "getVerifyStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusData */
/* loaded from: classes8.dex */
public final class Kyc2GetStatusData {
    public static final int $stable = 0;
    @SerializedName("verifyBy")
    @Nullable
    private final String verifyBy;
    @SerializedName("verifyDatetime")
    @Nullable
    private final String verifyDateTime;
    @SerializedName("verifyReason")
    @Nullable
    private final String verifyReason;
    @SerializedName("verifyResult")
    @Nullable
    private final String verifyResult;
    @SerializedName("verifyStatus")
    @Nullable
    private final String verifyStatus;

    public Kyc2GetStatusData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Kyc2GetStatusData copy$default(Kyc2GetStatusData kyc2GetStatusData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kyc2GetStatusData.verifyStatus;
        }
        if ((i & 2) != 0) {
            str2 = kyc2GetStatusData.verifyResult;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = kyc2GetStatusData.verifyReason;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = kyc2GetStatusData.verifyBy;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = kyc2GetStatusData.verifyDateTime;
        }
        return kyc2GetStatusData.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.verifyStatus;
    }

    @Nullable
    public final String component2() {
        return this.verifyResult;
    }

    @Nullable
    public final String component3() {
        return this.verifyReason;
    }

    @Nullable
    public final String component4() {
        return this.verifyBy;
    }

    @Nullable
    public final String component5() {
        return this.verifyDateTime;
    }

    @NotNull
    public final Kyc2GetStatusData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new Kyc2GetStatusData(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Kyc2GetStatusData) {
            Kyc2GetStatusData kyc2GetStatusData = (Kyc2GetStatusData) obj;
            return Intrinsics.areEqual(this.verifyStatus, kyc2GetStatusData.verifyStatus) && Intrinsics.areEqual(this.verifyResult, kyc2GetStatusData.verifyResult) && Intrinsics.areEqual(this.verifyReason, kyc2GetStatusData.verifyReason) && Intrinsics.areEqual(this.verifyBy, kyc2GetStatusData.verifyBy) && Intrinsics.areEqual(this.verifyDateTime, kyc2GetStatusData.verifyDateTime);
        }
        return false;
    }

    @Nullable
    public final String getVerifyBy() {
        return this.verifyBy;
    }

    @Nullable
    public final String getVerifyDateTime() {
        return this.verifyDateTime;
    }

    @Nullable
    public final String getVerifyReason() {
        return this.verifyReason;
    }

    @Nullable
    public final String getVerifyResult() {
        return this.verifyResult;
    }

    @Nullable
    public final String getVerifyStatus() {
        return this.verifyStatus;
    }

    public int hashCode() {
        String str = this.verifyStatus;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.verifyResult;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verifyReason;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.verifyBy;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.verifyDateTime;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.verifyStatus;
        String str2 = this.verifyResult;
        String str3 = this.verifyReason;
        String str4 = this.verifyBy;
        String str5 = this.verifyDateTime;
        return "Kyc2GetStatusData(verifyStatus=" + str + ", verifyResult=" + str2 + ", verifyReason=" + str3 + ", verifyBy=" + str4 + ", verifyDateTime=" + str5 + ")";
    }

    public Kyc2GetStatusData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.verifyStatus = str;
        this.verifyResult = str2;
        this.verifyReason = str3;
        this.verifyBy = str4;
        this.verifyDateTime = str5;
    }

    public /* synthetic */ Kyc2GetStatusData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}