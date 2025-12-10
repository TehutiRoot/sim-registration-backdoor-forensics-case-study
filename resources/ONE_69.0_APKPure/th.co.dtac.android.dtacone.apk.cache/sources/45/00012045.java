package th.p047co.dtac.android.dtacone.model.rtr_performance;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionReportDetailItem;", "", "typeName", "", "buy", "sale", "profit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuy", "()Ljava/lang/String;", "getProfit", "getSale", "getTypeName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.CommissionReportDetailItem */
/* loaded from: classes8.dex */
public final class CommissionReportDetailItem {
    public static final int $stable = 0;
    @NotNull
    private final String buy;
    @NotNull
    private final String profit;
    @NotNull
    private final String sale;
    @NotNull
    private final String typeName;

    public CommissionReportDetailItem(@NotNull String typeName, @NotNull String buy, @NotNull String sale, @NotNull String profit) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sale, "sale");
        Intrinsics.checkNotNullParameter(profit, "profit");
        this.typeName = typeName;
        this.buy = buy;
        this.sale = sale;
        this.profit = profit;
    }

    public static /* synthetic */ CommissionReportDetailItem copy$default(CommissionReportDetailItem commissionReportDetailItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commissionReportDetailItem.typeName;
        }
        if ((i & 2) != 0) {
            str2 = commissionReportDetailItem.buy;
        }
        if ((i & 4) != 0) {
            str3 = commissionReportDetailItem.sale;
        }
        if ((i & 8) != 0) {
            str4 = commissionReportDetailItem.profit;
        }
        return commissionReportDetailItem.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.typeName;
    }

    @NotNull
    public final String component2() {
        return this.buy;
    }

    @NotNull
    public final String component3() {
        return this.sale;
    }

    @NotNull
    public final String component4() {
        return this.profit;
    }

    @NotNull
    public final CommissionReportDetailItem copy(@NotNull String typeName, @NotNull String buy, @NotNull String sale, @NotNull String profit) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sale, "sale");
        Intrinsics.checkNotNullParameter(profit, "profit");
        return new CommissionReportDetailItem(typeName, buy, sale, profit);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommissionReportDetailItem) {
            CommissionReportDetailItem commissionReportDetailItem = (CommissionReportDetailItem) obj;
            return Intrinsics.areEqual(this.typeName, commissionReportDetailItem.typeName) && Intrinsics.areEqual(this.buy, commissionReportDetailItem.buy) && Intrinsics.areEqual(this.sale, commissionReportDetailItem.sale) && Intrinsics.areEqual(this.profit, commissionReportDetailItem.profit);
        }
        return false;
    }

    @NotNull
    public final String getBuy() {
        return this.buy;
    }

    @NotNull
    public final String getProfit() {
        return this.profit;
    }

    @NotNull
    public final String getSale() {
        return this.sale;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return (((((this.typeName.hashCode() * 31) + this.buy.hashCode()) * 31) + this.sale.hashCode()) * 31) + this.profit.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.typeName;
        String str2 = this.buy;
        String str3 = this.sale;
        String str4 = this.profit;
        return "CommissionReportDetailItem(typeName=" + str + ", buy=" + str2 + ", sale=" + str3 + ", profit=" + str4 + ")";
    }
}