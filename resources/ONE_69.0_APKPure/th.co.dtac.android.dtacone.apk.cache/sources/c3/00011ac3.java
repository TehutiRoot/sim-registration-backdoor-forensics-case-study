package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundProductItem;", "", "productNumber", "", "productType", "productTypeDisp", "productSubType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductNumber", "()Ljava/lang/String;", "setProductNumber", "(Ljava/lang/String;)V", "getProductSubType", "getProductType", "getProductTypeDisp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundProductItem */
/* loaded from: classes8.dex */
public final class OneNadOutboundProductItem {
    public static final int $stable = 8;
    @SerializedName("productNumber")
    @NotNull
    private String productNumber;
    @SerializedName("productSubType")
    @Nullable
    private final String productSubType;
    @SerializedName("productType")
    @NotNull
    private final String productType;
    @SerializedName("productTypeDisp")
    @NotNull
    private final String productTypeDisp;

    public OneNadOutboundProductItem(@NotNull String productNumber, @NotNull String productType, @NotNull String productTypeDisp, @Nullable String str) {
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productTypeDisp, "productTypeDisp");
        this.productNumber = productNumber;
        this.productType = productType;
        this.productTypeDisp = productTypeDisp;
        this.productSubType = str;
    }

    public static /* synthetic */ OneNadOutboundProductItem copy$default(OneNadOutboundProductItem oneNadOutboundProductItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNadOutboundProductItem.productNumber;
        }
        if ((i & 2) != 0) {
            str2 = oneNadOutboundProductItem.productType;
        }
        if ((i & 4) != 0) {
            str3 = oneNadOutboundProductItem.productTypeDisp;
        }
        if ((i & 8) != 0) {
            str4 = oneNadOutboundProductItem.productSubType;
        }
        return oneNadOutboundProductItem.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.productNumber;
    }

    @NotNull
    public final String component2() {
        return this.productType;
    }

    @NotNull
    public final String component3() {
        return this.productTypeDisp;
    }

    @Nullable
    public final String component4() {
        return this.productSubType;
    }

    @NotNull
    public final OneNadOutboundProductItem copy(@NotNull String productNumber, @NotNull String productType, @NotNull String productTypeDisp, @Nullable String str) {
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productTypeDisp, "productTypeDisp");
        return new OneNadOutboundProductItem(productNumber, productType, productTypeDisp, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundProductItem) {
            OneNadOutboundProductItem oneNadOutboundProductItem = (OneNadOutboundProductItem) obj;
            return Intrinsics.areEqual(this.productNumber, oneNadOutboundProductItem.productNumber) && Intrinsics.areEqual(this.productType, oneNadOutboundProductItem.productType) && Intrinsics.areEqual(this.productTypeDisp, oneNadOutboundProductItem.productTypeDisp) && Intrinsics.areEqual(this.productSubType, oneNadOutboundProductItem.productSubType);
        }
        return false;
    }

    @NotNull
    public final String getProductNumber() {
        return this.productNumber;
    }

    @Nullable
    public final String getProductSubType() {
        return this.productSubType;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final String getProductTypeDisp() {
        return this.productTypeDisp;
    }

    public int hashCode() {
        int hashCode = ((((this.productNumber.hashCode() * 31) + this.productType.hashCode()) * 31) + this.productTypeDisp.hashCode()) * 31;
        String str = this.productSubType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setProductNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.productNumber;
        String str2 = this.productType;
        String str3 = this.productTypeDisp;
        String str4 = this.productSubType;
        return "OneNadOutboundProductItem(productNumber=" + str + ", productType=" + str2 + ", productTypeDisp=" + str3 + ", productSubType=" + str4 + ")";
    }

    public /* synthetic */ OneNadOutboundProductItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}