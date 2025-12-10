package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetProductSaleOrderRequest;", "", "imei", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "packageCode", "userLan", "locationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getImei", "getLocationCode", "getPackageCode", "getSubscriberNumber", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetProductSaleOrderRequest */
/* loaded from: classes8.dex */
public final class GetProductSaleOrderRequest {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("imei")
    @NotNull
    private final String imei;
    @SerializedName("locationCode")
    @NotNull
    private final String locationCode;
    @SerializedName("packageCode")
    @NotNull
    private final String packageCode;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetProductSaleOrderRequest(@NotNull String imei, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String packageCode, @NotNull String userLan, @NotNull String locationCode) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        this.imei = imei;
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
        this.packageCode = packageCode;
        this.userLan = userLan;
        this.locationCode = locationCode;
    }

    public static /* synthetic */ GetProductSaleOrderRequest copy$default(GetProductSaleOrderRequest getProductSaleOrderRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getProductSaleOrderRequest.imei;
        }
        if ((i & 2) != 0) {
            str2 = getProductSaleOrderRequest.subscriberNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getProductSaleOrderRequest.customerNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getProductSaleOrderRequest.packageCode;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getProductSaleOrderRequest.userLan;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getProductSaleOrderRequest.locationCode;
        }
        return getProductSaleOrderRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.imei;
    }

    @NotNull
    public final String component2() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component3() {
        return this.customerNumber;
    }

    @NotNull
    public final String component4() {
        return this.packageCode;
    }

    @NotNull
    public final String component5() {
        return this.userLan;
    }

    @NotNull
    public final String component6() {
        return this.locationCode;
    }

    @NotNull
    public final GetProductSaleOrderRequest copy(@NotNull String imei, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String packageCode, @NotNull String userLan, @NotNull String locationCode) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        return new GetProductSaleOrderRequest(imei, subscriberNumber, customerNumber, packageCode, userLan, locationCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetProductSaleOrderRequest) {
            GetProductSaleOrderRequest getProductSaleOrderRequest = (GetProductSaleOrderRequest) obj;
            return Intrinsics.areEqual(this.imei, getProductSaleOrderRequest.imei) && Intrinsics.areEqual(this.subscriberNumber, getProductSaleOrderRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, getProductSaleOrderRequest.customerNumber) && Intrinsics.areEqual(this.packageCode, getProductSaleOrderRequest.packageCode) && Intrinsics.areEqual(this.userLan, getProductSaleOrderRequest.userLan) && Intrinsics.areEqual(this.locationCode, getProductSaleOrderRequest.locationCode);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    public final String getLocationCode() {
        return this.locationCode;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((((this.imei.hashCode() * 31) + this.subscriberNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.packageCode.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.locationCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.imei;
        String str2 = this.subscriberNumber;
        String str3 = this.customerNumber;
        String str4 = this.packageCode;
        String str5 = this.userLan;
        String str6 = this.locationCode;
        return "GetProductSaleOrderRequest(imei=" + str + ", subscriberNumber=" + str2 + ", customerNumber=" + str3 + ", packageCode=" + str4 + ", userLan=" + str5 + ", locationCode=" + str6 + ")";
    }
}