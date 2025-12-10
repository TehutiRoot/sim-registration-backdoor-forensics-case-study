package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyProduct;", "", "productCategory", "", "orderType", "productIdNumber", "promotionCode", "entryFeeWaive", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEntryFeeWaive", "()Ljava/lang/String;", "getOrderType", "getProductCategory", "getProductIdNumber", "getPromotionCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.CallVerifyProduct */
/* loaded from: classes8.dex */
public final class CallVerifyProduct {
    public static final int $stable = 0;
    @SerializedName("entryFeeWaive")
    @Nullable
    private final String entryFeeWaive;
    @SerializedName("orderType")
    @NotNull
    private final String orderType;
    @SerializedName("productCategory")
    @NotNull
    private final String productCategory;
    @SerializedName("productIdNumber")
    @NotNull
    private final String productIdNumber;
    @SerializedName("promotionCode")
    @Nullable
    private final String promotionCode;

    public CallVerifyProduct(@NotNull String productCategory, @NotNull String orderType, @NotNull String productIdNumber, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(productCategory, "productCategory");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(productIdNumber, "productIdNumber");
        this.productCategory = productCategory;
        this.orderType = orderType;
        this.productIdNumber = productIdNumber;
        this.promotionCode = str;
        this.entryFeeWaive = str2;
    }

    public static /* synthetic */ CallVerifyProduct copy$default(CallVerifyProduct callVerifyProduct, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callVerifyProduct.productCategory;
        }
        if ((i & 2) != 0) {
            str2 = callVerifyProduct.orderType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = callVerifyProduct.productIdNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = callVerifyProduct.promotionCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = callVerifyProduct.entryFeeWaive;
        }
        return callVerifyProduct.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.productCategory;
    }

    @NotNull
    public final String component2() {
        return this.orderType;
    }

    @NotNull
    public final String component3() {
        return this.productIdNumber;
    }

    @Nullable
    public final String component4() {
        return this.promotionCode;
    }

    @Nullable
    public final String component5() {
        return this.entryFeeWaive;
    }

    @NotNull
    public final CallVerifyProduct copy(@NotNull String productCategory, @NotNull String orderType, @NotNull String productIdNumber, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(productCategory, "productCategory");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(productIdNumber, "productIdNumber");
        return new CallVerifyProduct(productCategory, orderType, productIdNumber, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallVerifyProduct) {
            CallVerifyProduct callVerifyProduct = (CallVerifyProduct) obj;
            return Intrinsics.areEqual(this.productCategory, callVerifyProduct.productCategory) && Intrinsics.areEqual(this.orderType, callVerifyProduct.orderType) && Intrinsics.areEqual(this.productIdNumber, callVerifyProduct.productIdNumber) && Intrinsics.areEqual(this.promotionCode, callVerifyProduct.promotionCode) && Intrinsics.areEqual(this.entryFeeWaive, callVerifyProduct.entryFeeWaive);
        }
        return false;
    }

    @Nullable
    public final String getEntryFeeWaive() {
        return this.entryFeeWaive;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getProductCategory() {
        return this.productCategory;
    }

    @NotNull
    public final String getProductIdNumber() {
        return this.productIdNumber;
    }

    @Nullable
    public final String getPromotionCode() {
        return this.promotionCode;
    }

    public int hashCode() {
        int hashCode = ((((this.productCategory.hashCode() * 31) + this.orderType.hashCode()) * 31) + this.productIdNumber.hashCode()) * 31;
        String str = this.promotionCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entryFeeWaive;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.productCategory;
        String str2 = this.orderType;
        String str3 = this.productIdNumber;
        String str4 = this.promotionCode;
        String str5 = this.entryFeeWaive;
        return "CallVerifyProduct(productCategory=" + str + ", orderType=" + str2 + ", productIdNumber=" + str3 + ", promotionCode=" + str4 + ", entryFeeWaive=" + str5 + ")";
    }

    public /* synthetic */ CallVerifyProduct(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "NEW" : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}