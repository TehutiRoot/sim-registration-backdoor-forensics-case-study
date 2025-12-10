package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/request/OnePostPaidSaleGoodPrimaryOrderData;", "", "serialNo", "", "stockType", "shopType", "stockState", "resaleFlag", "requirePrintform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequirePrintform", "()Ljava/lang/String;", "getResaleFlag", "getSerialNo", "getShopType", "getStockState", "getStockType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.request.OnePostPaidSaleGoodPrimaryOrderData */
/* loaded from: classes8.dex */
public final class OnePostPaidSaleGoodPrimaryOrderData {
    public static final int $stable = 0;
    @SerializedName("requirePrintform")
    @Nullable
    private final String requirePrintform;
    @SerializedName("resaleFlag")
    @Nullable
    private final String resaleFlag;
    @SerializedName("serialNo")
    @Nullable
    private final String serialNo;
    @SerializedName("shopType")
    @Nullable
    private final String shopType;
    @SerializedName("stockState")
    @Nullable
    private final String stockState;
    @SerializedName("stockType")
    @Nullable
    private final String stockType;

    public OnePostPaidSaleGoodPrimaryOrderData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OnePostPaidSaleGoodPrimaryOrderData copy$default(OnePostPaidSaleGoodPrimaryOrderData onePostPaidSaleGoodPrimaryOrderData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostPaidSaleGoodPrimaryOrderData.serialNo;
        }
        if ((i & 2) != 0) {
            str2 = onePostPaidSaleGoodPrimaryOrderData.stockType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onePostPaidSaleGoodPrimaryOrderData.shopType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onePostPaidSaleGoodPrimaryOrderData.stockState;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onePostPaidSaleGoodPrimaryOrderData.resaleFlag;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onePostPaidSaleGoodPrimaryOrderData.requirePrintform;
        }
        return onePostPaidSaleGoodPrimaryOrderData.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.serialNo;
    }

    @Nullable
    public final String component2() {
        return this.stockType;
    }

    @Nullable
    public final String component3() {
        return this.shopType;
    }

    @Nullable
    public final String component4() {
        return this.stockState;
    }

    @Nullable
    public final String component5() {
        return this.resaleFlag;
    }

    @Nullable
    public final String component6() {
        return this.requirePrintform;
    }

    @NotNull
    public final OnePostPaidSaleGoodPrimaryOrderData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OnePostPaidSaleGoodPrimaryOrderData(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostPaidSaleGoodPrimaryOrderData) {
            OnePostPaidSaleGoodPrimaryOrderData onePostPaidSaleGoodPrimaryOrderData = (OnePostPaidSaleGoodPrimaryOrderData) obj;
            return Intrinsics.areEqual(this.serialNo, onePostPaidSaleGoodPrimaryOrderData.serialNo) && Intrinsics.areEqual(this.stockType, onePostPaidSaleGoodPrimaryOrderData.stockType) && Intrinsics.areEqual(this.shopType, onePostPaidSaleGoodPrimaryOrderData.shopType) && Intrinsics.areEqual(this.stockState, onePostPaidSaleGoodPrimaryOrderData.stockState) && Intrinsics.areEqual(this.resaleFlag, onePostPaidSaleGoodPrimaryOrderData.resaleFlag) && Intrinsics.areEqual(this.requirePrintform, onePostPaidSaleGoodPrimaryOrderData.requirePrintform);
        }
        return false;
    }

    @Nullable
    public final String getRequirePrintform() {
        return this.requirePrintform;
    }

    @Nullable
    public final String getResaleFlag() {
        return this.resaleFlag;
    }

    @Nullable
    public final String getSerialNo() {
        return this.serialNo;
    }

    @Nullable
    public final String getShopType() {
        return this.shopType;
    }

    @Nullable
    public final String getStockState() {
        return this.stockState;
    }

    @Nullable
    public final String getStockType() {
        return this.stockType;
    }

    public int hashCode() {
        String str = this.serialNo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stockType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shopType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stockState;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.resaleFlag;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.requirePrintform;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.serialNo;
        String str2 = this.stockType;
        String str3 = this.shopType;
        String str4 = this.stockState;
        String str5 = this.resaleFlag;
        String str6 = this.requirePrintform;
        return "OnePostPaidSaleGoodPrimaryOrderData(serialNo=" + str + ", stockType=" + str2 + ", shopType=" + str3 + ", stockState=" + str4 + ", resaleFlag=" + str5 + ", requirePrintform=" + str6 + ")";
    }

    public OnePostPaidSaleGoodPrimaryOrderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.serialNo = str;
        this.stockType = str2;
        this.shopType = str3;
        this.stockState = str4;
        this.resaleFlag = str5;
        this.requirePrintform = str6;
    }

    public /* synthetic */ OnePostPaidSaleGoodPrimaryOrderData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
