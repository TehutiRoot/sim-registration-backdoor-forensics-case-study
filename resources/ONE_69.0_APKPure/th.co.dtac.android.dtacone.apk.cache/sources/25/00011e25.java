package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetBundledItemsStockRequest;", "", "userLan", "", "locationCode", "imei", "productCode", "orderID", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getImei", "()Ljava/lang/String;", "getLocationCode", "getOrderID", "()I", "getProductCode", "getUserLan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetBundledItemsStockRequest */
/* loaded from: classes8.dex */
public final class GetBundledItemsStockRequest {
    public static final int $stable = 0;
    @SerializedName("imei")
    @NotNull
    private final String imei;
    @SerializedName("locationCode")
    @NotNull
    private final String locationCode;
    @SerializedName("orderID")
    private final int orderID;
    @SerializedName("productCode")
    @NotNull
    private final String productCode;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetBundledItemsStockRequest(@NotNull String userLan, @NotNull String locationCode, @NotNull String imei, @NotNull String productCode, int i) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        this.userLan = userLan;
        this.locationCode = locationCode;
        this.imei = imei;
        this.productCode = productCode;
        this.orderID = i;
    }

    public static /* synthetic */ GetBundledItemsStockRequest copy$default(GetBundledItemsStockRequest getBundledItemsStockRequest, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getBundledItemsStockRequest.userLan;
        }
        if ((i2 & 2) != 0) {
            str2 = getBundledItemsStockRequest.locationCode;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = getBundledItemsStockRequest.imei;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = getBundledItemsStockRequest.productCode;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = getBundledItemsStockRequest.orderID;
        }
        return getBundledItemsStockRequest.copy(str, str5, str6, str7, i);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component2() {
        return this.locationCode;
    }

    @NotNull
    public final String component3() {
        return this.imei;
    }

    @NotNull
    public final String component4() {
        return this.productCode;
    }

    public final int component5() {
        return this.orderID;
    }

    @NotNull
    public final GetBundledItemsStockRequest copy(@NotNull String userLan, @NotNull String locationCode, @NotNull String imei, @NotNull String productCode, int i) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        return new GetBundledItemsStockRequest(userLan, locationCode, imei, productCode, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetBundledItemsStockRequest) {
            GetBundledItemsStockRequest getBundledItemsStockRequest = (GetBundledItemsStockRequest) obj;
            return Intrinsics.areEqual(this.userLan, getBundledItemsStockRequest.userLan) && Intrinsics.areEqual(this.locationCode, getBundledItemsStockRequest.locationCode) && Intrinsics.areEqual(this.imei, getBundledItemsStockRequest.imei) && Intrinsics.areEqual(this.productCode, getBundledItemsStockRequest.productCode) && this.orderID == getBundledItemsStockRequest.orderID;
        }
        return false;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    public final String getLocationCode() {
        return this.locationCode;
    }

    public final int getOrderID() {
        return this.orderID;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((this.userLan.hashCode() * 31) + this.locationCode.hashCode()) * 31) + this.imei.hashCode()) * 31) + this.productCode.hashCode()) * 31) + this.orderID;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.locationCode;
        String str3 = this.imei;
        String str4 = this.productCode;
        int i = this.orderID;
        return "GetBundledItemsStockRequest(userLan=" + str + ", locationCode=" + str2 + ", imei=" + str3 + ", productCode=" + str4 + ", orderID=" + i + ")";
    }
}