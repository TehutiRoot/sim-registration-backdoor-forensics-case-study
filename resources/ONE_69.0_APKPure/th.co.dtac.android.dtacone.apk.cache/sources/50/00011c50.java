package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/TelNumData;", "", "statusCd", "", "errorMessage", "telNumAvailable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getErrorMessage", "()Ljava/lang/String;", "getStatusCd", "getTelNumAvailable", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.TelNumData */
/* loaded from: classes8.dex */
public final class TelNumData {
    public static final int $stable = 8;
    @SerializedName("errorMessage")
    @NotNull
    private final String errorMessage;
    @SerializedName("statusCd")
    @NotNull
    private final String statusCd;
    @SerializedName("telNumAvailable")
    @NotNull
    private final List<String> telNumAvailable;

    public TelNumData(@NotNull String statusCd, @NotNull String errorMessage, @NotNull List<String> telNumAvailable) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(telNumAvailable, "telNumAvailable");
        this.statusCd = statusCd;
        this.errorMessage = errorMessage;
        this.telNumAvailable = telNumAvailable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TelNumData copy$default(TelNumData telNumData, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = telNumData.statusCd;
        }
        if ((i & 2) != 0) {
            str2 = telNumData.errorMessage;
        }
        if ((i & 4) != 0) {
            list = telNumData.telNumAvailable;
        }
        return telNumData.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.statusCd;
    }

    @NotNull
    public final String component2() {
        return this.errorMessage;
    }

    @NotNull
    public final List<String> component3() {
        return this.telNumAvailable;
    }

    @NotNull
    public final TelNumData copy(@NotNull String statusCd, @NotNull String errorMessage, @NotNull List<String> telNumAvailable) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(telNumAvailable, "telNumAvailable");
        return new TelNumData(statusCd, errorMessage, telNumAvailable);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TelNumData) {
            TelNumData telNumData = (TelNumData) obj;
            return Intrinsics.areEqual(this.statusCd, telNumData.statusCd) && Intrinsics.areEqual(this.errorMessage, telNumData.errorMessage) && Intrinsics.areEqual(this.telNumAvailable, telNumData.telNumAvailable);
        }
        return false;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getStatusCd() {
        return this.statusCd;
    }

    @NotNull
    public final List<String> getTelNumAvailable() {
        return this.telNumAvailable;
    }

    public int hashCode() {
        return (((this.statusCd.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + this.telNumAvailable.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.statusCd;
        String str2 = this.errorMessage;
        List<String> list = this.telNumAvailable;
        return "TelNumData(statusCd=" + str + ", errorMessage=" + str2 + ", telNumAvailable=" + list + ")";
    }
}