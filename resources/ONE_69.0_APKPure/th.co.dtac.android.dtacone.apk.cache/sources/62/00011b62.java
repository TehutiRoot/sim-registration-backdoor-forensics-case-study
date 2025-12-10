package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidSaleParent;", "", "name", "", "orderType", "productCategory", "productIdName", "productIdNumber", "productName", "productType", "refParentProductIdnumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getOrderType", "getProductCategory", "getProductIdName", "getProductIdNumber", "getProductName", "getProductType", "getRefParentProductIdnumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request.OnePostPaidSaleParent */
/* loaded from: classes8.dex */
public final class OnePostPaidSaleParent {
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
    @Nullable
    private final String productIdName;
    @SerializedName("productIdNumber")
    @NotNull
    private final String productIdNumber;
    @SerializedName("productName")
    @Nullable
    private final String productName;
    @SerializedName("productType")
    @Nullable
    private final String productType;
    @SerializedName("refParentProductIdnumber")
    @Nullable
    private final String refParentProductIdnumber;

    public OnePostPaidSaleParent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String productIdNumber, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(productIdNumber, "productIdNumber");
        this.name = str;
        this.orderType = str2;
        this.productCategory = str3;
        this.productIdName = str4;
        this.productIdNumber = productIdNumber;
        this.productName = str5;
        this.productType = str6;
        this.refParentProductIdnumber = str7;
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.orderType;
    }

    @Nullable
    public final String component3() {
        return this.productCategory;
    }

    @Nullable
    public final String component4() {
        return this.productIdName;
    }

    @NotNull
    public final String component5() {
        return this.productIdNumber;
    }

    @Nullable
    public final String component6() {
        return this.productName;
    }

    @Nullable
    public final String component7() {
        return this.productType;
    }

    @Nullable
    public final String component8() {
        return this.refParentProductIdnumber;
    }

    @NotNull
    public final OnePostPaidSaleParent copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String productIdNumber, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(productIdNumber, "productIdNumber");
        return new OnePostPaidSaleParent(str, str2, str3, str4, productIdNumber, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostPaidSaleParent) {
            OnePostPaidSaleParent onePostPaidSaleParent = (OnePostPaidSaleParent) obj;
            return Intrinsics.areEqual(this.name, onePostPaidSaleParent.name) && Intrinsics.areEqual(this.orderType, onePostPaidSaleParent.orderType) && Intrinsics.areEqual(this.productCategory, onePostPaidSaleParent.productCategory) && Intrinsics.areEqual(this.productIdName, onePostPaidSaleParent.productIdName) && Intrinsics.areEqual(this.productIdNumber, onePostPaidSaleParent.productIdNumber) && Intrinsics.areEqual(this.productName, onePostPaidSaleParent.productName) && Intrinsics.areEqual(this.productType, onePostPaidSaleParent.productType) && Intrinsics.areEqual(this.refParentProductIdnumber, onePostPaidSaleParent.refParentProductIdnumber);
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

    @Nullable
    public final String getProductIdName() {
        return this.productIdName;
    }

    @NotNull
    public final String getProductIdNumber() {
        return this.productIdNumber;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getRefParentProductIdnumber() {
        return this.refParentProductIdnumber;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productCategory;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productIdName;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.productIdNumber.hashCode()) * 31;
        String str5 = this.productName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productType;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.refParentProductIdnumber;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.orderType;
        String str3 = this.productCategory;
        String str4 = this.productIdName;
        String str5 = this.productIdNumber;
        String str6 = this.productName;
        String str7 = this.productType;
        String str8 = this.refParentProductIdnumber;
        return "OnePostPaidSaleParent(name=" + str + ", orderType=" + str2 + ", productCategory=" + str3 + ", productIdName=" + str4 + ", productIdNumber=" + str5 + ", productName=" + str6 + ", productType=" + str7 + ", refParentProductIdnumber=" + str8 + ")";
    }

    public /* synthetic */ OnePostPaidSaleParent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}