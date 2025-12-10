package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetSubscriberSegmentRequest;", "", "userLan", "", "userCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "setCustomerNumber", "(Ljava/lang/String;)V", "getSubscriberNumber", "setSubscriberNumber", "getUserCode", "setUserCode", "getUserLan", "setUserLan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetSubscriberSegmentRequest */
/* loaded from: classes8.dex */
public final class GetSubscriberSegmentRequest {
    public static final int $stable = 8;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public GetSubscriberSegmentRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GetSubscriberSegmentRequest copy$default(GetSubscriberSegmentRequest getSubscriberSegmentRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSubscriberSegmentRequest.userLan;
        }
        if ((i & 2) != 0) {
            str2 = getSubscriberSegmentRequest.userCode;
        }
        if ((i & 4) != 0) {
            str3 = getSubscriberSegmentRequest.subscriberNumber;
        }
        if ((i & 8) != 0) {
            str4 = getSubscriberSegmentRequest.customerNumber;
        }
        return getSubscriberSegmentRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.customerNumber;
    }

    @NotNull
    public final GetSubscriberSegmentRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String subscriberNumber, @NotNull String customerNumber) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        return new GetSubscriberSegmentRequest(userLan, userCode, subscriberNumber, customerNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSubscriberSegmentRequest) {
            GetSubscriberSegmentRequest getSubscriberSegmentRequest = (GetSubscriberSegmentRequest) obj;
            return Intrinsics.areEqual(this.userLan, getSubscriberSegmentRequest.userLan) && Intrinsics.areEqual(this.userCode, getSubscriberSegmentRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, getSubscriberSegmentRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, getSubscriberSegmentRequest.customerNumber);
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
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.customerNumber.hashCode();
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.subscriberNumber;
        String str4 = this.customerNumber;
        return "GetSubscriberSegmentRequest(userLan=" + str + ", userCode=" + str2 + ", subscriberNumber=" + str3 + ", customerNumber=" + str4 + ")";
    }

    public GetSubscriberSegmentRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String subscriberNumber, @NotNull String customerNumber) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        this.userLan = userLan;
        this.userCode = userCode;
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
    }

    public /* synthetic */ GetSubscriberSegmentRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}