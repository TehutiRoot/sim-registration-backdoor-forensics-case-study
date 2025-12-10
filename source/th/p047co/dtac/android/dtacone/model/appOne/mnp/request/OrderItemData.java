package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OrderItemData;", "", "saleParent", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleParentData;", "saleActivate", "Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleActivate;", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleParentData;Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleActivate;)V", "getSaleActivate", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleActivate;", "getSaleParent", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleParentData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OrderItemData */
/* loaded from: classes8.dex */
public final class OrderItemData {
    public static final int $stable = 0;
    @SerializedName("saleActivate")
    @Nullable
    private final SaleActivate saleActivate;
    @SerializedName("saleParent")
    @Nullable
    private final SaleParentData saleParent;

    public OrderItemData() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OrderItemData copy$default(OrderItemData orderItemData, SaleParentData saleParentData, SaleActivate saleActivate, int i, Object obj) {
        if ((i & 1) != 0) {
            saleParentData = orderItemData.saleParent;
        }
        if ((i & 2) != 0) {
            saleActivate = orderItemData.saleActivate;
        }
        return orderItemData.copy(saleParentData, saleActivate);
    }

    @Nullable
    public final SaleParentData component1() {
        return this.saleParent;
    }

    @Nullable
    public final SaleActivate component2() {
        return this.saleActivate;
    }

    @NotNull
    public final OrderItemData copy(@Nullable SaleParentData saleParentData, @Nullable SaleActivate saleActivate) {
        return new OrderItemData(saleParentData, saleActivate);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderItemData) {
            OrderItemData orderItemData = (OrderItemData) obj;
            return Intrinsics.areEqual(this.saleParent, orderItemData.saleParent) && Intrinsics.areEqual(this.saleActivate, orderItemData.saleActivate);
        }
        return false;
    }

    @Nullable
    public final SaleActivate getSaleActivate() {
        return this.saleActivate;
    }

    @Nullable
    public final SaleParentData getSaleParent() {
        return this.saleParent;
    }

    public int hashCode() {
        SaleParentData saleParentData = this.saleParent;
        int hashCode = (saleParentData == null ? 0 : saleParentData.hashCode()) * 31;
        SaleActivate saleActivate = this.saleActivate;
        return hashCode + (saleActivate != null ? saleActivate.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SaleParentData saleParentData = this.saleParent;
        SaleActivate saleActivate = this.saleActivate;
        return "OrderItemData(saleParent=" + saleParentData + ", saleActivate=" + saleActivate + ")";
    }

    public OrderItemData(@Nullable SaleParentData saleParentData, @Nullable SaleActivate saleActivate) {
        this.saleParent = saleParentData;
        this.saleActivate = saleActivate;
    }

    public /* synthetic */ OrderItemData(SaleParentData saleParentData, SaleActivate saleActivate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : saleParentData, (i & 2) != 0 ? null : saleActivate);
    }
}
