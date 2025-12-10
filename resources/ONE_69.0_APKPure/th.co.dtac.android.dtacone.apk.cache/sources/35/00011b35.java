package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/ProductItem;", "", "orderType", "", "campaign", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/Campaign;", "productIdNumber", "productCategory", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/Campaign;Ljava/lang/String;Ljava/lang/String;)V", "getCampaign", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/Campaign;", "getOrderType", "()Ljava/lang/String;", "getProductCategory", "getProductIdNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.ProductItem */
/* loaded from: classes8.dex */
public final class ProductItem {
    public static final int $stable = 0;
    @SerializedName("campaign")
    @Nullable
    private final Campaign campaign;
    @SerializedName("orderType")
    @Nullable
    private final String orderType;
    @SerializedName("productCategory")
    @Nullable
    private final String productCategory;
    @SerializedName("productIdNumber")
    @Nullable
    private final String productIdNumber;

    public ProductItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ProductItem copy$default(ProductItem productItem, String str, Campaign campaign, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productItem.orderType;
        }
        if ((i & 2) != 0) {
            campaign = productItem.campaign;
        }
        if ((i & 4) != 0) {
            str2 = productItem.productIdNumber;
        }
        if ((i & 8) != 0) {
            str3 = productItem.productCategory;
        }
        return productItem.copy(str, campaign, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.orderType;
    }

    @Nullable
    public final Campaign component2() {
        return this.campaign;
    }

    @Nullable
    public final String component3() {
        return this.productIdNumber;
    }

    @Nullable
    public final String component4() {
        return this.productCategory;
    }

    @NotNull
    public final ProductItem copy(@Nullable String str, @Nullable Campaign campaign, @Nullable String str2, @Nullable String str3) {
        return new ProductItem(str, campaign, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductItem) {
            ProductItem productItem = (ProductItem) obj;
            return Intrinsics.areEqual(this.orderType, productItem.orderType) && Intrinsics.areEqual(this.campaign, productItem.campaign) && Intrinsics.areEqual(this.productIdNumber, productItem.productIdNumber) && Intrinsics.areEqual(this.productCategory, productItem.productCategory);
        }
        return false;
    }

    @Nullable
    public final Campaign getCampaign() {
        return this.campaign;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    public final String getProductIdNumber() {
        return this.productIdNumber;
    }

    public int hashCode() {
        String str = this.orderType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Campaign campaign = this.campaign;
        int hashCode2 = (hashCode + (campaign == null ? 0 : campaign.hashCode())) * 31;
        String str2 = this.productIdNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productCategory;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderType;
        Campaign campaign = this.campaign;
        String str2 = this.productIdNumber;
        String str3 = this.productCategory;
        return "ProductItem(orderType=" + str + ", campaign=" + campaign + ", productIdNumber=" + str2 + ", productCategory=" + str3 + ")";
    }

    public ProductItem(@Nullable String str, @Nullable Campaign campaign, @Nullable String str2, @Nullable String str3) {
        this.orderType = str;
        this.campaign = campaign;
        this.productIdNumber = str2;
        this.productCategory = str3;
    }

    public /* synthetic */ ProductItem(String str, Campaign campaign, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : campaign, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}