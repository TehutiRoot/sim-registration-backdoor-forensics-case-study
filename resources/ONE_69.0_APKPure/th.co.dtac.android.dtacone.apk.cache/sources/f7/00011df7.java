package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/SuspendInfo;", "", "suspendBy", "", "suspendCode", "suspendDatetime", "suspendDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuspendBy", "()Ljava/lang/String;", "getSuspendCode", "getSuspendDatetime", "getSuspendDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.SuspendInfo */
/* loaded from: classes8.dex */
public final class SuspendInfo {
    public static final int $stable = 0;
    @SerializedName("suspendBy")
    @NotNull
    private final String suspendBy;
    @SerializedName("suspendCode")
    @NotNull
    private final String suspendCode;
    @SerializedName("suspendDatetime")
    @NotNull
    private final String suspendDatetime;
    @SerializedName("suspendDescription")
    @NotNull
    private final String suspendDescription;

    public SuspendInfo(@NotNull String suspendBy, @NotNull String suspendCode, @NotNull String suspendDatetime, @NotNull String suspendDescription) {
        Intrinsics.checkNotNullParameter(suspendBy, "suspendBy");
        Intrinsics.checkNotNullParameter(suspendCode, "suspendCode");
        Intrinsics.checkNotNullParameter(suspendDatetime, "suspendDatetime");
        Intrinsics.checkNotNullParameter(suspendDescription, "suspendDescription");
        this.suspendBy = suspendBy;
        this.suspendCode = suspendCode;
        this.suspendDatetime = suspendDatetime;
        this.suspendDescription = suspendDescription;
    }

    public static /* synthetic */ SuspendInfo copy$default(SuspendInfo suspendInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suspendInfo.suspendBy;
        }
        if ((i & 2) != 0) {
            str2 = suspendInfo.suspendCode;
        }
        if ((i & 4) != 0) {
            str3 = suspendInfo.suspendDatetime;
        }
        if ((i & 8) != 0) {
            str4 = suspendInfo.suspendDescription;
        }
        return suspendInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.suspendBy;
    }

    @NotNull
    public final String component2() {
        return this.suspendCode;
    }

    @NotNull
    public final String component3() {
        return this.suspendDatetime;
    }

    @NotNull
    public final String component4() {
        return this.suspendDescription;
    }

    @NotNull
    public final SuspendInfo copy(@NotNull String suspendBy, @NotNull String suspendCode, @NotNull String suspendDatetime, @NotNull String suspendDescription) {
        Intrinsics.checkNotNullParameter(suspendBy, "suspendBy");
        Intrinsics.checkNotNullParameter(suspendCode, "suspendCode");
        Intrinsics.checkNotNullParameter(suspendDatetime, "suspendDatetime");
        Intrinsics.checkNotNullParameter(suspendDescription, "suspendDescription");
        return new SuspendInfo(suspendBy, suspendCode, suspendDatetime, suspendDescription);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuspendInfo) {
            SuspendInfo suspendInfo = (SuspendInfo) obj;
            return Intrinsics.areEqual(this.suspendBy, suspendInfo.suspendBy) && Intrinsics.areEqual(this.suspendCode, suspendInfo.suspendCode) && Intrinsics.areEqual(this.suspendDatetime, suspendInfo.suspendDatetime) && Intrinsics.areEqual(this.suspendDescription, suspendInfo.suspendDescription);
        }
        return false;
    }

    @NotNull
    public final String getSuspendBy() {
        return this.suspendBy;
    }

    @NotNull
    public final String getSuspendCode() {
        return this.suspendCode;
    }

    @NotNull
    public final String getSuspendDatetime() {
        return this.suspendDatetime;
    }

    @NotNull
    public final String getSuspendDescription() {
        return this.suspendDescription;
    }

    public int hashCode() {
        return (((((this.suspendBy.hashCode() * 31) + this.suspendCode.hashCode()) * 31) + this.suspendDatetime.hashCode()) * 31) + this.suspendDescription.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.suspendBy;
        String str2 = this.suspendCode;
        String str3 = this.suspendDatetime;
        String str4 = this.suspendDescription;
        return "SuspendInfo(suspendBy=" + str + ", suspendCode=" + str2 + ", suspendDatetime=" + str3 + ", suspendDescription=" + str4 + ")";
    }
}