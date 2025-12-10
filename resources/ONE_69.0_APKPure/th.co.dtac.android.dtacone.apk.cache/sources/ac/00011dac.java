package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSIMInfoRequest;", "", "userCode", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", ConstsKt.TELEPHONE_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "setCustomerNumber", "(Ljava/lang/String;)V", "getSubscriberNumber", "setSubscriberNumber", "getTelephoneType", "setTelephoneType", "getUserCode", "setUserCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DeviceSIMInfoRequest */
/* loaded from: classes8.dex */
public final class DeviceSIMInfoRequest {
    public static final int $stable = 8;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private String telephoneType;
    @SerializedName("userCode")
    @NotNull
    private String userCode;

    public DeviceSIMInfoRequest(@NotNull String userCode, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        this.userCode = userCode;
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
        this.telephoneType = telephoneType;
    }

    public static /* synthetic */ DeviceSIMInfoRequest copy$default(DeviceSIMInfoRequest deviceSIMInfoRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSIMInfoRequest.userCode;
        }
        if ((i & 2) != 0) {
            str2 = deviceSIMInfoRequest.subscriberNumber;
        }
        if ((i & 4) != 0) {
            str3 = deviceSIMInfoRequest.customerNumber;
        }
        if ((i & 8) != 0) {
            str4 = deviceSIMInfoRequest.telephoneType;
        }
        return deviceSIMInfoRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.userCode;
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
        return this.telephoneType;
    }

    @NotNull
    public final DeviceSIMInfoRequest copy(@NotNull String userCode, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        return new DeviceSIMInfoRequest(userCode, subscriberNumber, customerNumber, telephoneType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSIMInfoRequest) {
            DeviceSIMInfoRequest deviceSIMInfoRequest = (DeviceSIMInfoRequest) obj;
            return Intrinsics.areEqual(this.userCode, deviceSIMInfoRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, deviceSIMInfoRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, deviceSIMInfoRequest.customerNumber) && Intrinsics.areEqual(this.telephoneType, deviceSIMInfoRequest.telephoneType);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        return (((((this.userCode.hashCode() * 31) + this.subscriberNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.telephoneType.hashCode();
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.subscriberNumber;
        String str3 = this.customerNumber;
        String str4 = this.telephoneType;
        return "DeviceSIMInfoRequest(userCode=" + str + ", subscriberNumber=" + str2 + ", customerNumber=" + str3 + ", telephoneType=" + str4 + ")";
    }
}