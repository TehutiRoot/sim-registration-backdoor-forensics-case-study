package th.p047co.dtac.android.dtacone.model.rtr_performance;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummary;", "", "commission", "", "commissionDisplay", "", "(DLjava/lang/String;)V", "getCommission", "()D", "getCommissionDisplay", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.CommissionSummary */
/* loaded from: classes8.dex */
public final class CommissionSummary {
    public static final int $stable = 0;
    private final double commission;
    @NotNull
    private final String commissionDisplay;

    public CommissionSummary(double d, @NotNull String commissionDisplay) {
        Intrinsics.checkNotNullParameter(commissionDisplay, "commissionDisplay");
        this.commission = d;
        this.commissionDisplay = commissionDisplay;
    }

    public static /* synthetic */ CommissionSummary copy$default(CommissionSummary commissionSummary, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = commissionSummary.commission;
        }
        if ((i & 2) != 0) {
            str = commissionSummary.commissionDisplay;
        }
        return commissionSummary.copy(d, str);
    }

    public final double component1() {
        return this.commission;
    }

    @NotNull
    public final String component2() {
        return this.commissionDisplay;
    }

    @NotNull
    public final CommissionSummary copy(double d, @NotNull String commissionDisplay) {
        Intrinsics.checkNotNullParameter(commissionDisplay, "commissionDisplay");
        return new CommissionSummary(d, commissionDisplay);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommissionSummary) {
            CommissionSummary commissionSummary = (CommissionSummary) obj;
            return Double.compare(this.commission, commissionSummary.commission) == 0 && Intrinsics.areEqual(this.commissionDisplay, commissionSummary.commissionDisplay);
        }
        return false;
    }

    public final double getCommission() {
        return this.commission;
    }

    @NotNull
    public final String getCommissionDisplay() {
        return this.commissionDisplay;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.commission) * 31) + this.commissionDisplay.hashCode();
    }

    @NotNull
    public String toString() {
        double d = this.commission;
        String str = this.commissionDisplay;
        return "CommissionSummary(commission=" + d + ", commissionDisplay=" + str + ")";
    }
}