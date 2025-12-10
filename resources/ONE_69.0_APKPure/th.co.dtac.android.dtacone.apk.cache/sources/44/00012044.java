package th.p047co.dtac.android.dtacone.model.rtr_performance;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0019\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006-"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionReportDetail;", "", "typeName", "", "typeTitle", "total", "", "atDate", "buyTitle", "buyValue", "saleTitle", "saleValue", FirebaseAnalytics.Param.ITEMS, "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionReportDetailItem;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAtDate", "()Ljava/lang/String;", "getBuyTitle", "getBuyValue", "getItems", "()Ljava/util/ArrayList;", "getSaleTitle", "getSaleValue", "getTotal", "()D", "getTypeName", "getTypeTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.CommissionReportDetail */
/* loaded from: classes8.dex */
public final class CommissionReportDetail {
    public static final int $stable = 8;
    @NotNull
    private final String atDate;
    @NotNull
    private final String buyTitle;
    @NotNull
    private final String buyValue;
    @NotNull
    private final ArrayList<CommissionReportDetailItem> items;
    @NotNull
    private final String saleTitle;
    @NotNull
    private final String saleValue;
    private final double total;
    @NotNull
    private final String typeName;
    @NotNull
    private final String typeTitle;

    public CommissionReportDetail(@NotNull String typeName, @NotNull String typeTitle, double d, @NotNull String atDate, @NotNull String buyTitle, @NotNull String buyValue, @NotNull String saleTitle, @NotNull String saleValue, @NotNull ArrayList<CommissionReportDetailItem> items) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(typeTitle, "typeTitle");
        Intrinsics.checkNotNullParameter(atDate, "atDate");
        Intrinsics.checkNotNullParameter(buyTitle, "buyTitle");
        Intrinsics.checkNotNullParameter(buyValue, "buyValue");
        Intrinsics.checkNotNullParameter(saleTitle, "saleTitle");
        Intrinsics.checkNotNullParameter(saleValue, "saleValue");
        Intrinsics.checkNotNullParameter(items, "items");
        this.typeName = typeName;
        this.typeTitle = typeTitle;
        this.total = d;
        this.atDate = atDate;
        this.buyTitle = buyTitle;
        this.buyValue = buyValue;
        this.saleTitle = saleTitle;
        this.saleValue = saleValue;
        this.items = items;
    }

    @NotNull
    public final String component1() {
        return this.typeName;
    }

    @NotNull
    public final String component2() {
        return this.typeTitle;
    }

    public final double component3() {
        return this.total;
    }

    @NotNull
    public final String component4() {
        return this.atDate;
    }

    @NotNull
    public final String component5() {
        return this.buyTitle;
    }

    @NotNull
    public final String component6() {
        return this.buyValue;
    }

    @NotNull
    public final String component7() {
        return this.saleTitle;
    }

    @NotNull
    public final String component8() {
        return this.saleValue;
    }

    @NotNull
    public final ArrayList<CommissionReportDetailItem> component9() {
        return this.items;
    }

    @NotNull
    public final CommissionReportDetail copy(@NotNull String typeName, @NotNull String typeTitle, double d, @NotNull String atDate, @NotNull String buyTitle, @NotNull String buyValue, @NotNull String saleTitle, @NotNull String saleValue, @NotNull ArrayList<CommissionReportDetailItem> items) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(typeTitle, "typeTitle");
        Intrinsics.checkNotNullParameter(atDate, "atDate");
        Intrinsics.checkNotNullParameter(buyTitle, "buyTitle");
        Intrinsics.checkNotNullParameter(buyValue, "buyValue");
        Intrinsics.checkNotNullParameter(saleTitle, "saleTitle");
        Intrinsics.checkNotNullParameter(saleValue, "saleValue");
        Intrinsics.checkNotNullParameter(items, "items");
        return new CommissionReportDetail(typeName, typeTitle, d, atDate, buyTitle, buyValue, saleTitle, saleValue, items);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommissionReportDetail) {
            CommissionReportDetail commissionReportDetail = (CommissionReportDetail) obj;
            return Intrinsics.areEqual(this.typeName, commissionReportDetail.typeName) && Intrinsics.areEqual(this.typeTitle, commissionReportDetail.typeTitle) && Double.compare(this.total, commissionReportDetail.total) == 0 && Intrinsics.areEqual(this.atDate, commissionReportDetail.atDate) && Intrinsics.areEqual(this.buyTitle, commissionReportDetail.buyTitle) && Intrinsics.areEqual(this.buyValue, commissionReportDetail.buyValue) && Intrinsics.areEqual(this.saleTitle, commissionReportDetail.saleTitle) && Intrinsics.areEqual(this.saleValue, commissionReportDetail.saleValue) && Intrinsics.areEqual(this.items, commissionReportDetail.items);
        }
        return false;
    }

    @NotNull
    public final String getAtDate() {
        return this.atDate;
    }

    @NotNull
    public final String getBuyTitle() {
        return this.buyTitle;
    }

    @NotNull
    public final String getBuyValue() {
        return this.buyValue;
    }

    @NotNull
    public final ArrayList<CommissionReportDetailItem> getItems() {
        return this.items;
    }

    @NotNull
    public final String getSaleTitle() {
        return this.saleTitle;
    }

    @NotNull
    public final String getSaleValue() {
        return this.saleValue;
    }

    public final double getTotal() {
        return this.total;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    @NotNull
    public final String getTypeTitle() {
        return this.typeTitle;
    }

    public int hashCode() {
        return (((((((((((((((this.typeName.hashCode() * 31) + this.typeTitle.hashCode()) * 31) + Double.doubleToLongBits(this.total)) * 31) + this.atDate.hashCode()) * 31) + this.buyTitle.hashCode()) * 31) + this.buyValue.hashCode()) * 31) + this.saleTitle.hashCode()) * 31) + this.saleValue.hashCode()) * 31) + this.items.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.typeName;
        String str2 = this.typeTitle;
        double d = this.total;
        String str3 = this.atDate;
        String str4 = this.buyTitle;
        String str5 = this.buyValue;
        String str6 = this.saleTitle;
        String str7 = this.saleValue;
        ArrayList<CommissionReportDetailItem> arrayList = this.items;
        return "CommissionReportDetail(typeName=" + str + ", typeTitle=" + str2 + ", total=" + d + ", atDate=" + str3 + ", buyTitle=" + str4 + ", buyValue=" + str5 + ", saleTitle=" + str6 + ", saleValue=" + str7 + ", items=" + arrayList + ")";
    }

    public /* synthetic */ CommissionReportDetail(String str, String str2, double d, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, str3, str4, str5, str6, str7, (i & 256) != 0 ? new ArrayList() : arrayList);
    }
}