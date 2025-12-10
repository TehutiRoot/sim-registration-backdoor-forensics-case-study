package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderReserveTimeInfo;", "", "reserveTimeDate", "", "reserveTimePeriod", "preferTimeDate", "preferTimePeriod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPreferTimeDate", "()Ljava/lang/String;", "getPreferTimePeriod", "getReserveTimeDate", "getReserveTimePeriod", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderReserveTimeInfo */
/* loaded from: classes8.dex */
public final class SaveOrderReserveTimeInfo {
    public static final int $stable = 0;
    @SerializedName("preferTimeDate")
    @NotNull
    private final String preferTimeDate;
    @SerializedName("preferTimePeriod")
    @NotNull
    private final String preferTimePeriod;
    @SerializedName("reserveTimeDate")
    @NotNull
    private final String reserveTimeDate;
    @SerializedName("reserveTimePeriod")
    @NotNull
    private final String reserveTimePeriod;

    public SaveOrderReserveTimeInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SaveOrderReserveTimeInfo copy$default(SaveOrderReserveTimeInfo saveOrderReserveTimeInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveOrderReserveTimeInfo.reserveTimeDate;
        }
        if ((i & 2) != 0) {
            str2 = saveOrderReserveTimeInfo.reserveTimePeriod;
        }
        if ((i & 4) != 0) {
            str3 = saveOrderReserveTimeInfo.preferTimeDate;
        }
        if ((i & 8) != 0) {
            str4 = saveOrderReserveTimeInfo.preferTimePeriod;
        }
        return saveOrderReserveTimeInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.reserveTimeDate;
    }

    @NotNull
    public final String component2() {
        return this.reserveTimePeriod;
    }

    @NotNull
    public final String component3() {
        return this.preferTimeDate;
    }

    @NotNull
    public final String component4() {
        return this.preferTimePeriod;
    }

    @NotNull
    public final SaveOrderReserveTimeInfo copy(@NotNull String reserveTimeDate, @NotNull String reserveTimePeriod, @NotNull String preferTimeDate, @NotNull String preferTimePeriod) {
        Intrinsics.checkNotNullParameter(reserveTimeDate, "reserveTimeDate");
        Intrinsics.checkNotNullParameter(reserveTimePeriod, "reserveTimePeriod");
        Intrinsics.checkNotNullParameter(preferTimeDate, "preferTimeDate");
        Intrinsics.checkNotNullParameter(preferTimePeriod, "preferTimePeriod");
        return new SaveOrderReserveTimeInfo(reserveTimeDate, reserveTimePeriod, preferTimeDate, preferTimePeriod);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderReserveTimeInfo) {
            SaveOrderReserveTimeInfo saveOrderReserveTimeInfo = (SaveOrderReserveTimeInfo) obj;
            return Intrinsics.areEqual(this.reserveTimeDate, saveOrderReserveTimeInfo.reserveTimeDate) && Intrinsics.areEqual(this.reserveTimePeriod, saveOrderReserveTimeInfo.reserveTimePeriod) && Intrinsics.areEqual(this.preferTimeDate, saveOrderReserveTimeInfo.preferTimeDate) && Intrinsics.areEqual(this.preferTimePeriod, saveOrderReserveTimeInfo.preferTimePeriod);
        }
        return false;
    }

    @NotNull
    public final String getPreferTimeDate() {
        return this.preferTimeDate;
    }

    @NotNull
    public final String getPreferTimePeriod() {
        return this.preferTimePeriod;
    }

    @NotNull
    public final String getReserveTimeDate() {
        return this.reserveTimeDate;
    }

    @NotNull
    public final String getReserveTimePeriod() {
        return this.reserveTimePeriod;
    }

    public int hashCode() {
        return (((((this.reserveTimeDate.hashCode() * 31) + this.reserveTimePeriod.hashCode()) * 31) + this.preferTimeDate.hashCode()) * 31) + this.preferTimePeriod.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.reserveTimeDate;
        String str2 = this.reserveTimePeriod;
        String str3 = this.preferTimeDate;
        String str4 = this.preferTimePeriod;
        return "SaveOrderReserveTimeInfo(reserveTimeDate=" + str + ", reserveTimePeriod=" + str2 + ", preferTimeDate=" + str3 + ", preferTimePeriod=" + str4 + ")";
    }

    public SaveOrderReserveTimeInfo(@NotNull String reserveTimeDate, @NotNull String reserveTimePeriod, @NotNull String preferTimeDate, @NotNull String preferTimePeriod) {
        Intrinsics.checkNotNullParameter(reserveTimeDate, "reserveTimeDate");
        Intrinsics.checkNotNullParameter(reserveTimePeriod, "reserveTimePeriod");
        Intrinsics.checkNotNullParameter(preferTimeDate, "preferTimeDate");
        Intrinsics.checkNotNullParameter(preferTimePeriod, "preferTimePeriod");
        this.reserveTimeDate = reserveTimeDate;
        this.reserveTimePeriod = reserveTimePeriod;
        this.preferTimeDate = preferTimeDate;
        this.preferTimePeriod = preferTimePeriod;
    }

    public /* synthetic */ SaveOrderReserveTimeInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
