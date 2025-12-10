package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/ReserveNumberData;", "", "reserveNumber", "", "(Ljava/lang/String;)V", "getReserveNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.ReserveNumberData */
/* loaded from: classes8.dex */
public final class ReserveNumberData {
    public static final int $stable = 0;
    @SerializedName("reserveNumber")
    @NotNull
    private final String reserveNumber;

    public ReserveNumberData(@NotNull String reserveNumber) {
        Intrinsics.checkNotNullParameter(reserveNumber, "reserveNumber");
        this.reserveNumber = reserveNumber;
    }

    public static /* synthetic */ ReserveNumberData copy$default(ReserveNumberData reserveNumberData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reserveNumberData.reserveNumber;
        }
        return reserveNumberData.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.reserveNumber;
    }

    @NotNull
    public final ReserveNumberData copy(@NotNull String reserveNumber) {
        Intrinsics.checkNotNullParameter(reserveNumber, "reserveNumber");
        return new ReserveNumberData(reserveNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReserveNumberData) && Intrinsics.areEqual(this.reserveNumber, ((ReserveNumberData) obj).reserveNumber);
    }

    @NotNull
    public final String getReserveNumber() {
        return this.reserveNumber;
    }

    public int hashCode() {
        return this.reserveNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.reserveNumber;
        return "ReserveNumberData(reserveNumber=" + str + ")";
    }
}
