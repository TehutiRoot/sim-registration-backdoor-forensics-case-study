package th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusData;", "", "verifyStatus", "", "verifyResult", "verifyReason", "verifyBy", "verifyDateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVerifyBy", "()Ljava/lang/String;", "getVerifyDateTime", "getVerifyReason", "getVerifyResult", "getVerifyStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2QueryStatusData */
/* loaded from: classes8.dex */
public final class Kyc2QueryStatusData {
    public static final int $stable = 0;
    @SerializedName("verifyBy")
    @NotNull
    private final String verifyBy;
    @SerializedName("verifyDatetime")
    @NotNull
    private final String verifyDateTime;
    @SerializedName("verifyReason")
    @NotNull
    private final String verifyReason;
    @SerializedName("verifyResult")
    @NotNull
    private final String verifyResult;
    @SerializedName("verifyStatus")
    @NotNull
    private final String verifyStatus;

    public Kyc2QueryStatusData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Kyc2QueryStatusData copy$default(Kyc2QueryStatusData kyc2QueryStatusData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kyc2QueryStatusData.verifyStatus;
        }
        if ((i & 2) != 0) {
            str2 = kyc2QueryStatusData.verifyResult;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = kyc2QueryStatusData.verifyReason;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = kyc2QueryStatusData.verifyBy;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = kyc2QueryStatusData.verifyDateTime;
        }
        return kyc2QueryStatusData.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.verifyStatus;
    }

    @NotNull
    public final String component2() {
        return this.verifyResult;
    }

    @NotNull
    public final String component3() {
        return this.verifyReason;
    }

    @NotNull
    public final String component4() {
        return this.verifyBy;
    }

    @NotNull
    public final String component5() {
        return this.verifyDateTime;
    }

    @NotNull
    public final Kyc2QueryStatusData copy(@NotNull String verifyStatus, @NotNull String verifyResult, @NotNull String verifyReason, @NotNull String verifyBy, @NotNull String verifyDateTime) {
        Intrinsics.checkNotNullParameter(verifyStatus, "verifyStatus");
        Intrinsics.checkNotNullParameter(verifyResult, "verifyResult");
        Intrinsics.checkNotNullParameter(verifyReason, "verifyReason");
        Intrinsics.checkNotNullParameter(verifyBy, "verifyBy");
        Intrinsics.checkNotNullParameter(verifyDateTime, "verifyDateTime");
        return new Kyc2QueryStatusData(verifyStatus, verifyResult, verifyReason, verifyBy, verifyDateTime);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Kyc2QueryStatusData) {
            Kyc2QueryStatusData kyc2QueryStatusData = (Kyc2QueryStatusData) obj;
            return Intrinsics.areEqual(this.verifyStatus, kyc2QueryStatusData.verifyStatus) && Intrinsics.areEqual(this.verifyResult, kyc2QueryStatusData.verifyResult) && Intrinsics.areEqual(this.verifyReason, kyc2QueryStatusData.verifyReason) && Intrinsics.areEqual(this.verifyBy, kyc2QueryStatusData.verifyBy) && Intrinsics.areEqual(this.verifyDateTime, kyc2QueryStatusData.verifyDateTime);
        }
        return false;
    }

    @NotNull
    public final String getVerifyBy() {
        return this.verifyBy;
    }

    @NotNull
    public final String getVerifyDateTime() {
        return this.verifyDateTime;
    }

    @NotNull
    public final String getVerifyReason() {
        return this.verifyReason;
    }

    @NotNull
    public final String getVerifyResult() {
        return this.verifyResult;
    }

    @NotNull
    public final String getVerifyStatus() {
        return this.verifyStatus;
    }

    public int hashCode() {
        return (((((((this.verifyStatus.hashCode() * 31) + this.verifyResult.hashCode()) * 31) + this.verifyReason.hashCode()) * 31) + this.verifyBy.hashCode()) * 31) + this.verifyDateTime.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.verifyStatus;
        String str2 = this.verifyResult;
        String str3 = this.verifyReason;
        String str4 = this.verifyBy;
        String str5 = this.verifyDateTime;
        return "Kyc2QueryStatusData(verifyStatus=" + str + ", verifyResult=" + str2 + ", verifyReason=" + str3 + ", verifyBy=" + str4 + ", verifyDateTime=" + str5 + ")";
    }

    public Kyc2QueryStatusData(@NotNull String verifyStatus, @NotNull String verifyResult, @NotNull String verifyReason, @NotNull String verifyBy, @NotNull String verifyDateTime) {
        Intrinsics.checkNotNullParameter(verifyStatus, "verifyStatus");
        Intrinsics.checkNotNullParameter(verifyResult, "verifyResult");
        Intrinsics.checkNotNullParameter(verifyReason, "verifyReason");
        Intrinsics.checkNotNullParameter(verifyBy, "verifyBy");
        Intrinsics.checkNotNullParameter(verifyDateTime, "verifyDateTime");
        this.verifyStatus = verifyStatus;
        this.verifyResult = verifyResult;
        this.verifyReason = verifyReason;
        this.verifyBy = verifyBy;
        this.verifyDateTime = verifyDateTime;
    }

    public /* synthetic */ Kyc2QueryStatusData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}