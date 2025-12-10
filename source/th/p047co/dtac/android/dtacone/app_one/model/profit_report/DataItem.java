package th.p047co.dtac.android.dtacone.app_one.model.profit_report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.rtr_performance.ProfitSummaryReport;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000eR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0014¨\u0006/"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/profit_report/DataItem;", "", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/Total;", "total", "", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/CommissionItem;", "commission", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Campaign;", "campaign", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/Profit;", "profit", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/profit_report/Total;Ljava/util/List;Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Campaign;Lth/co/dtac/android/dtacone/app_one/model/profit_report/Profit;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/profit_report/Total;", "component2", "()Ljava/util/List;", "component3", "()Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Campaign;", "component4", "()Lth/co/dtac/android/dtacone/app_one/model/profit_report/Profit;", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/profit_report/Total;Ljava/util/List;Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Campaign;Lth/co/dtac/android/dtacone/app_one/model/profit_report/Profit;)Lth/co/dtac/android/dtacone/app_one/model/profit_report/DataItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/profit_report/Total;", "getTotal", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getCommission", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Campaign;", "getCampaign", "setCampaign", "(Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Campaign;)V", "d", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/Profit;", "getProfit", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.profit_report.DataItem */
/* loaded from: classes7.dex */
public final class DataItem {
    public static final int $stable = 8;
    @SerializedName("total")
    @Nullable

    /* renamed from: a */
    private final Total f81997a;
    @SerializedName("commission")
    @Nullable

    /* renamed from: b */
    private final List<CommissionItem> f81998b;
    @SerializedName("campaign")
    @Nullable

    /* renamed from: c */
    private ProfitSummaryReport.Data.Campaign f81999c;
    @SerializedName("profit")
    @Nullable

    /* renamed from: d */
    private final Profit f82000d;

    public DataItem() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataItem copy$default(DataItem dataItem, Total total, List list, ProfitSummaryReport.Data.Campaign campaign, Profit profit, int i, Object obj) {
        if ((i & 1) != 0) {
            total = dataItem.f81997a;
        }
        if ((i & 2) != 0) {
            list = dataItem.f81998b;
        }
        if ((i & 4) != 0) {
            campaign = dataItem.f81999c;
        }
        if ((i & 8) != 0) {
            profit = dataItem.f82000d;
        }
        return dataItem.copy(total, list, campaign, profit);
    }

    @Nullable
    public final Total component1() {
        return this.f81997a;
    }

    @Nullable
    public final List<CommissionItem> component2() {
        return this.f81998b;
    }

    @Nullable
    public final ProfitSummaryReport.Data.Campaign component3() {
        return this.f81999c;
    }

    @Nullable
    public final Profit component4() {
        return this.f82000d;
    }

    @NotNull
    public final DataItem copy(@Nullable Total total, @Nullable List<CommissionItem> list, @Nullable ProfitSummaryReport.Data.Campaign campaign, @Nullable Profit profit) {
        return new DataItem(total, list, campaign, profit);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataItem) {
            DataItem dataItem = (DataItem) obj;
            return Intrinsics.areEqual(this.f81997a, dataItem.f81997a) && Intrinsics.areEqual(this.f81998b, dataItem.f81998b) && Intrinsics.areEqual(this.f81999c, dataItem.f81999c) && Intrinsics.areEqual(this.f82000d, dataItem.f82000d);
        }
        return false;
    }

    @Nullable
    public final ProfitSummaryReport.Data.Campaign getCampaign() {
        return this.f81999c;
    }

    @Nullable
    public final List<CommissionItem> getCommission() {
        return this.f81998b;
    }

    @Nullable
    public final Profit getProfit() {
        return this.f82000d;
    }

    @Nullable
    public final Total getTotal() {
        return this.f81997a;
    }

    public int hashCode() {
        Total total = this.f81997a;
        int hashCode = (total == null ? 0 : total.hashCode()) * 31;
        List<CommissionItem> list = this.f81998b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ProfitSummaryReport.Data.Campaign campaign = this.f81999c;
        int hashCode3 = (hashCode2 + (campaign == null ? 0 : campaign.hashCode())) * 31;
        Profit profit = this.f82000d;
        return hashCode3 + (profit != null ? profit.hashCode() : 0);
    }

    public final void setCampaign(@Nullable ProfitSummaryReport.Data.Campaign campaign) {
        this.f81999c = campaign;
    }

    @NotNull
    public String toString() {
        Total total = this.f81997a;
        List<CommissionItem> list = this.f81998b;
        ProfitSummaryReport.Data.Campaign campaign = this.f81999c;
        Profit profit = this.f82000d;
        return "DataItem(total=" + total + ", commission=" + list + ", campaign=" + campaign + ", profit=" + profit + ")";
    }

    public DataItem(@Nullable Total total, @Nullable List<CommissionItem> list, @Nullable ProfitSummaryReport.Data.Campaign campaign, @Nullable Profit profit) {
        this.f81997a = total;
        this.f81998b = list;
        this.f81999c = campaign;
        this.f82000d = profit;
    }

    public /* synthetic */ DataItem(Total total, List list, ProfitSummaryReport.Data.Campaign campaign, Profit profit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : total, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : campaign, (i & 8) != 0 ? null : profit);
    }
}
