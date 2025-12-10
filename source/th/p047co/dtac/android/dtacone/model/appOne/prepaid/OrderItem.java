package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/OrderItem;", "", "orderCharacteristic", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OrderCharacteristic;", "type", "", "dealerCode", "simType", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/OrderCharacteristic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDealerCode", "()Ljava/lang/String;", "getOrderCharacteristic", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/OrderCharacteristic;", "getSimType", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.OrderItem */
/* loaded from: classes8.dex */
public final class OrderItem {
    public static final int $stable = 0;
    @SerializedName("dealerCode")
    @Nullable
    private final String dealerCode;
    @SerializedName("orderCharacteristic")
    @Nullable
    private final OrderCharacteristic orderCharacteristic;
    @SerializedName("simType")
    @Nullable
    private final String simType;
    @SerializedName("type")
    @Nullable
    private final String type;

    public OrderItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OrderItem copy$default(OrderItem orderItem, OrderCharacteristic orderCharacteristic, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            orderCharacteristic = orderItem.orderCharacteristic;
        }
        if ((i & 2) != 0) {
            str = orderItem.type;
        }
        if ((i & 4) != 0) {
            str2 = orderItem.dealerCode;
        }
        if ((i & 8) != 0) {
            str3 = orderItem.simType;
        }
        return orderItem.copy(orderCharacteristic, str, str2, str3);
    }

    @Nullable
    public final OrderCharacteristic component1() {
        return this.orderCharacteristic;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.dealerCode;
    }

    @Nullable
    public final String component4() {
        return this.simType;
    }

    @NotNull
    public final OrderItem copy(@Nullable OrderCharacteristic orderCharacteristic, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new OrderItem(orderCharacteristic, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderItem) {
            OrderItem orderItem = (OrderItem) obj;
            return Intrinsics.areEqual(this.orderCharacteristic, orderItem.orderCharacteristic) && Intrinsics.areEqual(this.type, orderItem.type) && Intrinsics.areEqual(this.dealerCode, orderItem.dealerCode) && Intrinsics.areEqual(this.simType, orderItem.simType);
        }
        return false;
    }

    @Nullable
    public final String getDealerCode() {
        return this.dealerCode;
    }

    @Nullable
    public final OrderCharacteristic getOrderCharacteristic() {
        return this.orderCharacteristic;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        OrderCharacteristic orderCharacteristic = this.orderCharacteristic;
        int hashCode = (orderCharacteristic == null ? 0 : orderCharacteristic.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dealerCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.simType;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OrderCharacteristic orderCharacteristic = this.orderCharacteristic;
        String str = this.type;
        String str2 = this.dealerCode;
        String str3 = this.simType;
        return "OrderItem(orderCharacteristic=" + orderCharacteristic + ", type=" + str + ", dealerCode=" + str2 + ", simType=" + str3 + ")";
    }

    public OrderItem(@Nullable OrderCharacteristic orderCharacteristic, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.orderCharacteristic = orderCharacteristic;
        this.type = str;
        this.dealerCode = str2;
        this.simType = str3;
    }

    public /* synthetic */ OrderItem(OrderCharacteristic orderCharacteristic, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderCharacteristic, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
