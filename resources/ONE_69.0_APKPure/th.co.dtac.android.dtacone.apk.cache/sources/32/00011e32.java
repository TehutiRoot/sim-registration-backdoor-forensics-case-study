package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003Jo\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetProductSaleOrderResponse;", "", "bundleItem", "", "Lth/co/dtac/android/dtacone/model/device_sale/BundleItem;", "discountAmount", "", "discountItem", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", "lineAmount", "orderID", "productCode", "", "productName", "productPrice", "productQty", "(Ljava/util/List;ILjava/util/List;IILjava/lang/String;Ljava/lang/String;II)V", "getBundleItem", "()Ljava/util/List;", "getDiscountAmount", "()I", "getDiscountItem", "getLineAmount", "getOrderID", "getProductCode", "()Ljava/lang/String;", "getProductName", "getProductPrice", "getProductQty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetProductSaleOrderResponse */
/* loaded from: classes8.dex */
public final class GetProductSaleOrderResponse {
    public static final int $stable = 8;
    @SerializedName("bundleItem")
    @NotNull
    private final List<BundleItem> bundleItem;
    @SerializedName("discountAmount")
    private final int discountAmount;
    @SerializedName("discountItem")
    @NotNull
    private final List<MrtrDiscountItem> discountItem;
    @SerializedName("lineAmount")
    private final int lineAmount;
    @SerializedName("orderID")
    private final int orderID;
    @SerializedName("productCode")
    @NotNull
    private final String productCode;
    @SerializedName("productName")
    @NotNull
    private final String productName;
    @SerializedName("productPrice")
    private final int productPrice;
    @SerializedName("productQty")
    private final int productQty;

    public GetProductSaleOrderResponse(@NotNull List<BundleItem> bundleItem, int i, @NotNull List<MrtrDiscountItem> discountItem, int i2, int i3, @NotNull String productCode, @NotNull String productName, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bundleItem, "bundleItem");
        Intrinsics.checkNotNullParameter(discountItem, "discountItem");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.bundleItem = bundleItem;
        this.discountAmount = i;
        this.discountItem = discountItem;
        this.lineAmount = i2;
        this.orderID = i3;
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = i4;
        this.productQty = i5;
    }

    @NotNull
    public final List<BundleItem> component1() {
        return this.bundleItem;
    }

    public final int component2() {
        return this.discountAmount;
    }

    @NotNull
    public final List<MrtrDiscountItem> component3() {
        return this.discountItem;
    }

    public final int component4() {
        return this.lineAmount;
    }

    public final int component5() {
        return this.orderID;
    }

    @NotNull
    public final String component6() {
        return this.productCode;
    }

    @NotNull
    public final String component7() {
        return this.productName;
    }

    public final int component8() {
        return this.productPrice;
    }

    public final int component9() {
        return this.productQty;
    }

    @NotNull
    public final GetProductSaleOrderResponse copy(@NotNull List<BundleItem> bundleItem, int i, @NotNull List<MrtrDiscountItem> discountItem, int i2, int i3, @NotNull String productCode, @NotNull String productName, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bundleItem, "bundleItem");
        Intrinsics.checkNotNullParameter(discountItem, "discountItem");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        Intrinsics.checkNotNullParameter(productName, "productName");
        return new GetProductSaleOrderResponse(bundleItem, i, discountItem, i2, i3, productCode, productName, i4, i5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetProductSaleOrderResponse) {
            GetProductSaleOrderResponse getProductSaleOrderResponse = (GetProductSaleOrderResponse) obj;
            return Intrinsics.areEqual(this.bundleItem, getProductSaleOrderResponse.bundleItem) && this.discountAmount == getProductSaleOrderResponse.discountAmount && Intrinsics.areEqual(this.discountItem, getProductSaleOrderResponse.discountItem) && this.lineAmount == getProductSaleOrderResponse.lineAmount && this.orderID == getProductSaleOrderResponse.orderID && Intrinsics.areEqual(this.productCode, getProductSaleOrderResponse.productCode) && Intrinsics.areEqual(this.productName, getProductSaleOrderResponse.productName) && this.productPrice == getProductSaleOrderResponse.productPrice && this.productQty == getProductSaleOrderResponse.productQty;
        }
        return false;
    }

    @NotNull
    public final List<BundleItem> getBundleItem() {
        return this.bundleItem;
    }

    public final int getDiscountAmount() {
        return this.discountAmount;
    }

    @NotNull
    public final List<MrtrDiscountItem> getDiscountItem() {
        return this.discountItem;
    }

    public final int getLineAmount() {
        return this.lineAmount;
    }

    public final int getOrderID() {
        return this.orderID;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    public final String getProductName() {
        return this.productName;
    }

    public final int getProductPrice() {
        return this.productPrice;
    }

    public final int getProductQty() {
        return this.productQty;
    }

    public int hashCode() {
        return (((((((((((((((this.bundleItem.hashCode() * 31) + this.discountAmount) * 31) + this.discountItem.hashCode()) * 31) + this.lineAmount) * 31) + this.orderID) * 31) + this.productCode.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.productPrice) * 31) + this.productQty;
    }

    @NotNull
    public String toString() {
        List<BundleItem> list = this.bundleItem;
        int i = this.discountAmount;
        List<MrtrDiscountItem> list2 = this.discountItem;
        int i2 = this.lineAmount;
        int i3 = this.orderID;
        String str = this.productCode;
        String str2 = this.productName;
        int i4 = this.productPrice;
        int i5 = this.productQty;
        return "GetProductSaleOrderResponse(bundleItem=" + list + ", discountAmount=" + i + ", discountItem=" + list2 + ", lineAmount=" + i2 + ", orderID=" + i3 + ", productCode=" + str + ", productName=" + str2 + ", productPrice=" + i4 + ", productQty=" + i5 + ")";
    }
}