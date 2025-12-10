package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidSalePrivilege;", "", "productCategory", "", "name", "orderType", "productName", "productIdName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getOrderType", "getProductCategory", "getProductIdName", "getProductName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request.OnePostPaidSalePrivilege */
/* loaded from: classes8.dex */
public final class OnePostPaidSalePrivilege {
    public static final int $stable = 0;
    @SerializedName("name")
    @Nullable
    private final String name;
    @SerializedName("orderType")
    @Nullable
    private final String orderType;
    @SerializedName("productCategory")
    @Nullable
    private final String productCategory;
    @SerializedName("productIdName")
    @NotNull
    private final String productIdName;
    @SerializedName("productName")
    @Nullable
    private final String productName;

    public OnePostPaidSalePrivilege(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String productIdName) {
        Intrinsics.checkNotNullParameter(productIdName, "productIdName");
        this.productCategory = str;
        this.name = str2;
        this.orderType = str3;
        this.productName = str4;
        this.productIdName = productIdName;
    }

    public static /* synthetic */ OnePostPaidSalePrivilege copy$default(OnePostPaidSalePrivilege onePostPaidSalePrivilege, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostPaidSalePrivilege.productCategory;
        }
        if ((i & 2) != 0) {
            str2 = onePostPaidSalePrivilege.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePostPaidSalePrivilege.orderType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePostPaidSalePrivilege.productName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = onePostPaidSalePrivilege.productIdName;
        }
        return onePostPaidSalePrivilege.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.productCategory;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.orderType;
    }

    @Nullable
    public final String component4() {
        return this.productName;
    }

    @NotNull
    public final String component5() {
        return this.productIdName;
    }

    @NotNull
    public final OnePostPaidSalePrivilege copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String productIdName) {
        Intrinsics.checkNotNullParameter(productIdName, "productIdName");
        return new OnePostPaidSalePrivilege(str, str2, str3, str4, productIdName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostPaidSalePrivilege) {
            OnePostPaidSalePrivilege onePostPaidSalePrivilege = (OnePostPaidSalePrivilege) obj;
            return Intrinsics.areEqual(this.productCategory, onePostPaidSalePrivilege.productCategory) && Intrinsics.areEqual(this.name, onePostPaidSalePrivilege.name) && Intrinsics.areEqual(this.orderType, onePostPaidSalePrivilege.orderType) && Intrinsics.areEqual(this.productName, onePostPaidSalePrivilege.productName) && Intrinsics.areEqual(this.productIdName, onePostPaidSalePrivilege.productIdName);
        }
        return false;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getProductCategory() {
        return this.productCategory;
    }

    @NotNull
    public final String getProductIdName() {
        return this.productIdName;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public int hashCode() {
        String str = this.productCategory;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productName;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.productIdName.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.productCategory;
        String str2 = this.name;
        String str3 = this.orderType;
        String str4 = this.productName;
        String str5 = this.productIdName;
        return "OnePostPaidSalePrivilege(productCategory=" + str + ", name=" + str2 + ", orderType=" + str3 + ", productName=" + str4 + ", productIdName=" + str5 + ")";
    }

    public /* synthetic */ OnePostPaidSalePrivilege(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5);
    }
}