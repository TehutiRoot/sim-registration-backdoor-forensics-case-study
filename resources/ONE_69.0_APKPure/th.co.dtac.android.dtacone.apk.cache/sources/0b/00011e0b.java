package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceRequest;", "", "userFormatType", "", "userCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "idNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "getSubscriberNumber", "getUserCode", "getUserFormatType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceRequest */
/* loaded from: classes8.dex */
public final class Check1IDXDeviceRequest {
    public static final int $stable = 0;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;

    public Check1IDXDeviceRequest(@NotNull String userFormatType, @NotNull String userCode, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        this.userFormatType = userFormatType;
        this.userCode = userCode;
        this.subscriberNumber = str;
        this.idNumber = str2;
    }

    public static /* synthetic */ Check1IDXDeviceRequest copy$default(Check1IDXDeviceRequest check1IDXDeviceRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = check1IDXDeviceRequest.userFormatType;
        }
        if ((i & 2) != 0) {
            str2 = check1IDXDeviceRequest.userCode;
        }
        if ((i & 4) != 0) {
            str3 = check1IDXDeviceRequest.subscriberNumber;
        }
        if ((i & 8) != 0) {
            str4 = check1IDXDeviceRequest.idNumber;
        }
        return check1IDXDeviceRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.userFormatType;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component4() {
        return this.idNumber;
    }

    @NotNull
    public final Check1IDXDeviceRequest copy(@NotNull String userFormatType, @NotNull String userCode, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return new Check1IDXDeviceRequest(userFormatType, userCode, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Check1IDXDeviceRequest) {
            Check1IDXDeviceRequest check1IDXDeviceRequest = (Check1IDXDeviceRequest) obj;
            return Intrinsics.areEqual(this.userFormatType, check1IDXDeviceRequest.userFormatType) && Intrinsics.areEqual(this.userCode, check1IDXDeviceRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, check1IDXDeviceRequest.subscriberNumber) && Intrinsics.areEqual(this.idNumber, check1IDXDeviceRequest.idNumber);
        }
        return false;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
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

    public int hashCode() {
        int hashCode = ((this.userFormatType.hashCode() * 31) + this.userCode.hashCode()) * 31;
        String str = this.subscriberNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.idNumber;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.userCode;
        String str3 = this.subscriberNumber;
        String str4 = this.idNumber;
        return "Check1IDXDeviceRequest(userFormatType=" + str + ", userCode=" + str2 + ", subscriberNumber=" + str3 + ", idNumber=" + str4 + ")";
    }

    public /* synthetic */ Check1IDXDeviceRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}