package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileResponse;", "", "brand", "", "companyCode", "customerNumber", "dealerNumber", "groupCode", "hardwareNumber", "model", "simCardNumber", "subscriberLastChangeDateTime", "subscriberStatus", "subscriberType", "switchOffReasonCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getCompanyCode", "getCustomerNumber", "getDealerNumber", "getGroupCode", "getHardwareNumber", "getModel", "getSimCardNumber", "getSubscriberLastChangeDateTime", "getSubscriberStatus", "getSubscriberType", "getSwitchOffReasonCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetPre2PostMobileResponse */
/* loaded from: classes8.dex */
public final class GetPre2PostMobileResponse {
    public static final int $stable = 0;
    @SerializedName("brand")
    @NotNull
    private final String brand;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("dealerNumber")
    @NotNull
    private final String dealerNumber;
    @SerializedName("groupCode")
    @NotNull
    private final String groupCode;
    @SerializedName("hardwareNumber")
    @NotNull
    private final String hardwareNumber;
    @SerializedName("model")
    @NotNull
    private final String model;
    @SerializedName("simCardNumber")
    @NotNull
    private final String simCardNumber;
    @SerializedName("subscriberLastChangeDateTime")
    @NotNull
    private final String subscriberLastChangeDateTime;
    @SerializedName("subscriberStatus")
    @NotNull
    private final String subscriberStatus;
    @SerializedName("subscriberType")
    @NotNull
    private final String subscriberType;
    @SerializedName("switchOffReasonCode")
    @NotNull
    private final String switchOffReasonCode;

    public GetPre2PostMobileResponse(@NotNull String brand, @NotNull String companyCode, @NotNull String customerNumber, @NotNull String dealerNumber, @NotNull String groupCode, @NotNull String hardwareNumber, @NotNull String model, @NotNull String simCardNumber, @NotNull String subscriberLastChangeDateTime, @NotNull String subscriberStatus, @NotNull String subscriberType, @NotNull String switchOffReasonCode) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(dealerNumber, "dealerNumber");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(subscriberLastChangeDateTime, "subscriberLastChangeDateTime");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(switchOffReasonCode, "switchOffReasonCode");
        this.brand = brand;
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.dealerNumber = dealerNumber;
        this.groupCode = groupCode;
        this.hardwareNumber = hardwareNumber;
        this.model = model;
        this.simCardNumber = simCardNumber;
        this.subscriberLastChangeDateTime = subscriberLastChangeDateTime;
        this.subscriberStatus = subscriberStatus;
        this.subscriberType = subscriberType;
        this.switchOffReasonCode = switchOffReasonCode;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getDealerNumber() {
        return this.dealerNumber;
    }

    @NotNull
    public final String getGroupCode() {
        return this.groupCode;
    }

    @NotNull
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSubscriberLastChangeDateTime() {
        return this.subscriberLastChangeDateTime;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getSwitchOffReasonCode() {
        return this.switchOffReasonCode;
    }
}