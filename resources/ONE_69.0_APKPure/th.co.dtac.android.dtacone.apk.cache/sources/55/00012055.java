package th.p047co.dtac.android.dtacone.model.rtr_performance;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitReport;", "", "profit", "", ErrorBundle.SUMMARY_ENTRY, "monthDisplay", "", "(DDLjava/lang/String;)V", "getMonthDisplay", "()Ljava/lang/String;", "getProfit", "()D", "getSummary", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.ProfitReport */
/* loaded from: classes8.dex */
public final class ProfitReport {
    public static final int $stable = 0;
    @NotNull
    private final String monthDisplay;
    private final double profit;
    private final double summary;

    public ProfitReport(double d, double d2, @NotNull String monthDisplay) {
        Intrinsics.checkNotNullParameter(monthDisplay, "monthDisplay");
        this.profit = d;
        this.summary = d2;
        this.monthDisplay = monthDisplay;
    }

    public static /* synthetic */ ProfitReport copy$default(ProfitReport profitReport, double d, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = profitReport.profit;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = profitReport.summary;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            str = profitReport.monthDisplay;
        }
        return profitReport.copy(d3, d4, str);
    }

    public final double component1() {
        return this.profit;
    }

    public final double component2() {
        return this.summary;
    }

    @NotNull
    public final String component3() {
        return this.monthDisplay;
    }

    @NotNull
    public final ProfitReport copy(double d, double d2, @NotNull String monthDisplay) {
        Intrinsics.checkNotNullParameter(monthDisplay, "monthDisplay");
        return new ProfitReport(d, d2, monthDisplay);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfitReport) {
            ProfitReport profitReport = (ProfitReport) obj;
            return Double.compare(this.profit, profitReport.profit) == 0 && Double.compare(this.summary, profitReport.summary) == 0 && Intrinsics.areEqual(this.monthDisplay, profitReport.monthDisplay);
        }
        return false;
    }

    @NotNull
    public final String getMonthDisplay() {
        return this.monthDisplay;
    }

    public final double getProfit() {
        return this.profit;
    }

    public final double getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.profit) * 31) + Double.doubleToLongBits(this.summary)) * 31) + this.monthDisplay.hashCode();
    }

    @NotNull
    public String toString() {
        double d = this.profit;
        double d2 = this.summary;
        String str = this.monthDisplay;
        return "ProfitReport(profit=" + d + ", summary=" + d2 + ", monthDisplay=" + str + ")";
    }
}