package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleParentData;", "", "productCategory", "", "name", "orderType", "productName", "productIdName", "productIdNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getOrderType", "getProductCategory", "getProductIdName", "getProductIdNumber", "getProductName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.SaleParentData */
/* loaded from: classes8.dex */
public final class SaleParentData {
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
    @Nullable
    private final String productIdNumber;
    @SerializedName("productName")
    @Nullable
    private final String productName;

    public SaleParentData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SaleParentData copy$default(SaleParentData saleParentData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saleParentData.productCategory;
        }
        if ((i & 2) != 0) {
            str2 = saleParentData.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = saleParentData.orderType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = saleParentData.productName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = saleParentData.productIdName;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = saleParentData.productIdNumber;
        }
        return saleParentData.copy(str, str7, str8, str9, str10, str6);
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

    @Nullable
    public final String component5() {
        return this.productIdName;
    }

    @Nullable
    public final String component6() {
        return this.productIdNumber;
    }

    @NotNull
    public final SaleParentData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new SaleParentData(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaleParentData) {
            SaleParentData saleParentData = (SaleParentData) obj;
            return Intrinsics.areEqual(this.productCategory, saleParentData.productCategory) && Intrinsics.areEqual(this.name, saleParentData.name) && Intrinsics.areEqual(this.orderType, saleParentData.orderType) && Intrinsics.areEqual(this.productName, saleParentData.productName) && Intrinsics.areEqual(this.productIdName, saleParentData.productIdName) && Intrinsics.areEqual(this.productIdNumber, saleParentData.productIdNumber);
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

    @Nullable
    public final String getProductIdNumber() {
        return this.productIdNumber;
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
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productIdName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productIdNumber;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.productCategory;
        String str2 = this.name;
        String str3 = this.orderType;
        String str4 = this.productName;
        String str5 = this.productIdName;
        String str6 = this.productIdNumber;
        return "SaleParentData(productCategory=" + str + ", name=" + str2 + ", orderType=" + str3 + ", productName=" + str4 + ", productIdName=" + str5 + ", productIdNumber=" + str6 + ")";
    }

    public SaleParentData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.productCategory = str;
        this.name = str2;
        this.orderType = str3;
        this.productName = str4;
        this.productIdName = str5;
        this.productIdNumber = str6;
    }

    public /* synthetic */ SaleParentData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}