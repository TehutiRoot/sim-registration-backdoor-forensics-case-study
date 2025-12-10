package th.p047co.dtac.android.dtacone.model.appOne.tol.device;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u009d\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00062"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRequest;", "", "media", "", "productSpecCode", "customerType", "accountSubType", "orderAction", "shopCode", "saleCode", "salesGroup", "salesRole", "", "allowDlSpeed", "allowDlSpeedUnit", "bundleCampaign", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountSubType", "()Ljava/lang/String;", "getAllowDlSpeed", "getAllowDlSpeedUnit", "getBundleCampaign", "getCustomerType", "getMedia", "getOrderAction", "getProductSpecCode", "getSaleCode", "getSalesGroup", "getSalesRole", "()Ljava/util/List;", "getShopCode", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.device.DeviceRequest */
/* loaded from: classes8.dex */
public final class DeviceRequest {
    public static final int $stable = 8;
    @SerializedName("accountSubType")
    @Nullable
    private final String accountSubType;
    @SerializedName("allowDlSpeed")
    @Nullable
    private final String allowDlSpeed;
    @SerializedName("allowDlSpeedUnit")
    @Nullable
    private final String allowDlSpeedUnit;
    @SerializedName("bundleCampaign")
    @Nullable
    private final String bundleCampaign;
    @SerializedName("customerType")
    @Nullable
    private final String customerType;
    @SerializedName("media")
    @Nullable
    private final String media;
    @SerializedName("orderAction")
    @Nullable
    private final String orderAction;
    @SerializedName("productSpecCode")
    @Nullable
    private final String productSpecCode;
    @SerializedName("saleCode")
    @Nullable
    private final String saleCode;
    @SerializedName("salesGroup")
    @Nullable
    private final String salesGroup;
    @SerializedName("salesRole")
    @NotNull
    private final List<String> salesRole;
    @SerializedName("shopCode")
    @Nullable
    private final String shopCode;

    public DeviceRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Nullable
    public final String component1() {
        return this.media;
    }

    @Nullable
    public final String component10() {
        return this.allowDlSpeed;
    }

    @Nullable
    public final String component11() {
        return this.allowDlSpeedUnit;
    }

    @Nullable
    public final String component12() {
        return this.bundleCampaign;
    }

    @Nullable
    public final String component2() {
        return this.productSpecCode;
    }

    @Nullable
    public final String component3() {
        return this.customerType;
    }

    @Nullable
    public final String component4() {
        return this.accountSubType;
    }

    @Nullable
    public final String component5() {
        return this.orderAction;
    }

    @Nullable
    public final String component6() {
        return this.shopCode;
    }

    @Nullable
    public final String component7() {
        return this.saleCode;
    }

    @Nullable
    public final String component8() {
        return this.salesGroup;
    }

    @NotNull
    public final List<String> component9() {
        return this.salesRole;
    }

    @NotNull
    public final DeviceRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull List<String> salesRole, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        Intrinsics.checkNotNullParameter(salesRole, "salesRole");
        return new DeviceRequest(str, str2, str3, str4, str5, str6, str7, str8, salesRole, str9, str10, str11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceRequest) {
            DeviceRequest deviceRequest = (DeviceRequest) obj;
            return Intrinsics.areEqual(this.media, deviceRequest.media) && Intrinsics.areEqual(this.productSpecCode, deviceRequest.productSpecCode) && Intrinsics.areEqual(this.customerType, deviceRequest.customerType) && Intrinsics.areEqual(this.accountSubType, deviceRequest.accountSubType) && Intrinsics.areEqual(this.orderAction, deviceRequest.orderAction) && Intrinsics.areEqual(this.shopCode, deviceRequest.shopCode) && Intrinsics.areEqual(this.saleCode, deviceRequest.saleCode) && Intrinsics.areEqual(this.salesGroup, deviceRequest.salesGroup) && Intrinsics.areEqual(this.salesRole, deviceRequest.salesRole) && Intrinsics.areEqual(this.allowDlSpeed, deviceRequest.allowDlSpeed) && Intrinsics.areEqual(this.allowDlSpeedUnit, deviceRequest.allowDlSpeedUnit) && Intrinsics.areEqual(this.bundleCampaign, deviceRequest.bundleCampaign);
        }
        return false;
    }

    @Nullable
    public final String getAccountSubType() {
        return this.accountSubType;
    }

    @Nullable
    public final String getAllowDlSpeed() {
        return this.allowDlSpeed;
    }

    @Nullable
    public final String getAllowDlSpeedUnit() {
        return this.allowDlSpeedUnit;
    }

    @Nullable
    public final String getBundleCampaign() {
        return this.bundleCampaign;
    }

    @Nullable
    public final String getCustomerType() {
        return this.customerType;
    }

    @Nullable
    public final String getMedia() {
        return this.media;
    }

    @Nullable
    public final String getOrderAction() {
        return this.orderAction;
    }

    @Nullable
    public final String getProductSpecCode() {
        return this.productSpecCode;
    }

    @Nullable
    public final String getSaleCode() {
        return this.saleCode;
    }

    @Nullable
    public final String getSalesGroup() {
        return this.salesGroup;
    }

    @NotNull
    public final List<String> getSalesRole() {
        return this.salesRole;
    }

    @Nullable
    public final String getShopCode() {
        return this.shopCode;
    }

    public int hashCode() {
        String str = this.media;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productSpecCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountSubType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderAction;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shopCode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.saleCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.salesGroup;
        int hashCode8 = (((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.salesRole.hashCode()) * 31;
        String str9 = this.allowDlSpeed;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.allowDlSpeedUnit;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.bundleCampaign;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.media;
        String str2 = this.productSpecCode;
        String str3 = this.customerType;
        String str4 = this.accountSubType;
        String str5 = this.orderAction;
        String str6 = this.shopCode;
        String str7 = this.saleCode;
        String str8 = this.salesGroup;
        List<String> list = this.salesRole;
        String str9 = this.allowDlSpeed;
        String str10 = this.allowDlSpeedUnit;
        String str11 = this.bundleCampaign;
        return "DeviceRequest(media=" + str + ", productSpecCode=" + str2 + ", customerType=" + str3 + ", accountSubType=" + str4 + ", orderAction=" + str5 + ", shopCode=" + str6 + ", saleCode=" + str7 + ", salesGroup=" + str8 + ", salesRole=" + list + ", allowDlSpeed=" + str9 + ", allowDlSpeedUnit=" + str10 + ", bundleCampaign=" + str11 + ")";
    }

    public DeviceRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull List<String> salesRole, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        Intrinsics.checkNotNullParameter(salesRole, "salesRole");
        this.media = str;
        this.productSpecCode = str2;
        this.customerType = str3;
        this.accountSubType = str4;
        this.orderAction = str5;
        this.shopCode = str6;
        this.saleCode = str7;
        this.salesGroup = str8;
        this.salesRole = salesRole;
        this.allowDlSpeed = str9;
        this.allowDlSpeedUnit = str10;
        this.bundleCampaign = str11;
    }

    public /* synthetic */ DeviceRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? str11 : null);
    }
}
