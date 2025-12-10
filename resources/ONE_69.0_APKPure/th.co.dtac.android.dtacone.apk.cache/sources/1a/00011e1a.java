package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrRequest;", "", "userFormatType", "", "userCode", "userLan", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "isDeviceWithContract", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getSubscriberNumber", "()Ljava/lang/String;", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrRequest */
/* loaded from: classes8.dex */
public final class DeviceSaleVerifySubrRequest {
    public static final int $stable = 0;
    @SerializedName("isDeviceWithContract")
    private final boolean isDeviceWithContract;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public DeviceSaleVerifySubrRequest(@NotNull String userFormatType, @NotNull String userCode, @NotNull String userLan, @NotNull String subscriberNumber, boolean z) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.userFormatType = userFormatType;
        this.userCode = userCode;
        this.userLan = userLan;
        this.subscriberNumber = subscriberNumber;
        this.isDeviceWithContract = z;
    }

    public static /* synthetic */ DeviceSaleVerifySubrRequest copy$default(DeviceSaleVerifySubrRequest deviceSaleVerifySubrRequest, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSaleVerifySubrRequest.userFormatType;
        }
        if ((i & 2) != 0) {
            str2 = deviceSaleVerifySubrRequest.userCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = deviceSaleVerifySubrRequest.userLan;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = deviceSaleVerifySubrRequest.subscriberNumber;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = deviceSaleVerifySubrRequest.isDeviceWithContract;
        }
        return deviceSaleVerifySubrRequest.copy(str, str5, str6, str7, z);
    }

    @NotNull
    public final String component1() {
        return this.userFormatType;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.userLan;
    }

    @NotNull
    public final String component4() {
        return this.subscriberNumber;
    }

    public final boolean component5() {
        return this.isDeviceWithContract;
    }

    @NotNull
    public final DeviceSaleVerifySubrRequest copy(@NotNull String userFormatType, @NotNull String userCode, @NotNull String userLan, @NotNull String subscriberNumber, boolean z) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        return new DeviceSaleVerifySubrRequest(userFormatType, userCode, userLan, subscriberNumber, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSaleVerifySubrRequest) {
            DeviceSaleVerifySubrRequest deviceSaleVerifySubrRequest = (DeviceSaleVerifySubrRequest) obj;
            return Intrinsics.areEqual(this.userFormatType, deviceSaleVerifySubrRequest.userFormatType) && Intrinsics.areEqual(this.userCode, deviceSaleVerifySubrRequest.userCode) && Intrinsics.areEqual(this.userLan, deviceSaleVerifySubrRequest.userLan) && Intrinsics.areEqual(this.subscriberNumber, deviceSaleVerifySubrRequest.subscriberNumber) && this.isDeviceWithContract == deviceSaleVerifySubrRequest.isDeviceWithContract;
        }
        return false;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.userFormatType.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31;
        boolean z = this.isDeviceWithContract;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isDeviceWithContract() {
        return this.isDeviceWithContract;
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.userCode;
        String str3 = this.userLan;
        String str4 = this.subscriberNumber;
        boolean z = this.isDeviceWithContract;
        return "DeviceSaleVerifySubrRequest(userFormatType=" + str + ", userCode=" + str2 + ", userLan=" + str3 + ", subscriberNumber=" + str4 + ", isDeviceWithContract=" + z + ")";
    }
}