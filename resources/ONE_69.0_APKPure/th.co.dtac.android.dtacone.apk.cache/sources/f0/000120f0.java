package th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2ServiceTimeData;", "", "intervalInSeconds", "", "waitingTimeoutInSeconds", "extendTimes", "isServiceTime", "", "waitingInfoText", "", "(IIIZLjava/lang/String;)V", "getExtendTimes", "()I", "getIntervalInSeconds", "()Z", "getWaitingInfoText", "()Ljava/lang/String;", "getWaitingTimeoutInSeconds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2ServiceTimeData */
/* loaded from: classes8.dex */
public final class Kyc2ServiceTimeData {
    public static final int $stable = 0;
    @SerializedName("retryTime")
    private final int extendTimes;
    @SerializedName("intervalTime")
    private final int intervalInSeconds;
    @SerializedName("isAgentTime")
    private final boolean isServiceTime;
    @SerializedName("wordingTime")
    @NotNull
    private final String waitingInfoText;
    @SerializedName("waitingTime")
    private final int waitingTimeoutInSeconds;

    public Kyc2ServiceTimeData() {
        this(0, 0, 0, false, null, 31, null);
    }

    public static /* synthetic */ Kyc2ServiceTimeData copy$default(Kyc2ServiceTimeData kyc2ServiceTimeData, int i, int i2, int i3, boolean z, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kyc2ServiceTimeData.intervalInSeconds;
        }
        if ((i4 & 2) != 0) {
            i2 = kyc2ServiceTimeData.waitingTimeoutInSeconds;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = kyc2ServiceTimeData.extendTimes;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            z = kyc2ServiceTimeData.isServiceTime;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            str = kyc2ServiceTimeData.waitingInfoText;
        }
        return kyc2ServiceTimeData.copy(i, i5, i6, z2, str);
    }

    public final int component1() {
        return this.intervalInSeconds;
    }

    public final int component2() {
        return this.waitingTimeoutInSeconds;
    }

    public final int component3() {
        return this.extendTimes;
    }

    public final boolean component4() {
        return this.isServiceTime;
    }

    @NotNull
    public final String component5() {
        return this.waitingInfoText;
    }

    @NotNull
    public final Kyc2ServiceTimeData copy(int i, int i2, int i3, boolean z, @NotNull String waitingInfoText) {
        Intrinsics.checkNotNullParameter(waitingInfoText, "waitingInfoText");
        return new Kyc2ServiceTimeData(i, i2, i3, z, waitingInfoText);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Kyc2ServiceTimeData) {
            Kyc2ServiceTimeData kyc2ServiceTimeData = (Kyc2ServiceTimeData) obj;
            return this.intervalInSeconds == kyc2ServiceTimeData.intervalInSeconds && this.waitingTimeoutInSeconds == kyc2ServiceTimeData.waitingTimeoutInSeconds && this.extendTimes == kyc2ServiceTimeData.extendTimes && this.isServiceTime == kyc2ServiceTimeData.isServiceTime && Intrinsics.areEqual(this.waitingInfoText, kyc2ServiceTimeData.waitingInfoText);
        }
        return false;
    }

    public final int getExtendTimes() {
        return this.extendTimes;
    }

    public final int getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    @NotNull
    public final String getWaitingInfoText() {
        return this.waitingInfoText;
    }

    public final int getWaitingTimeoutInSeconds() {
        return this.waitingTimeoutInSeconds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((((this.intervalInSeconds * 31) + this.waitingTimeoutInSeconds) * 31) + this.extendTimes) * 31;
        boolean z = this.isServiceTime;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((i + i2) * 31) + this.waitingInfoText.hashCode();
    }

    public final boolean isServiceTime() {
        return this.isServiceTime;
    }

    @NotNull
    public String toString() {
        int i = this.intervalInSeconds;
        int i2 = this.waitingTimeoutInSeconds;
        int i3 = this.extendTimes;
        boolean z = this.isServiceTime;
        String str = this.waitingInfoText;
        return "Kyc2ServiceTimeData(intervalInSeconds=" + i + ", waitingTimeoutInSeconds=" + i2 + ", extendTimes=" + i3 + ", isServiceTime=" + z + ", waitingInfoText=" + str + ")";
    }

    public Kyc2ServiceTimeData(int i, int i2, int i3, boolean z, @NotNull String waitingInfoText) {
        Intrinsics.checkNotNullParameter(waitingInfoText, "waitingInfoText");
        this.intervalInSeconds = i;
        this.waitingTimeoutInSeconds = i2;
        this.extendTimes = i3;
        this.isServiceTime = z;
        this.waitingInfoText = waitingInfoText;
    }

    public /* synthetic */ Kyc2ServiceTimeData(int i, int i2, int i3, boolean z, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) == 0 ? z : false, (i4 & 16) != 0 ? "" : str);
    }
}