package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetSuspendInfoRequest;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "userCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubscriberNumber", "()Ljava/lang/String;", "getUserCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetSuspendInfoRequest */
/* loaded from: classes8.dex */
public final class GetSuspendInfoRequest {
    public static final int $stable = 0;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;

    public GetSuspendInfoRequest(@NotNull String subscriberNumber, @NotNull String userCode) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        this.subscriberNumber = subscriberNumber;
        this.userCode = userCode;
    }

    public static /* synthetic */ GetSuspendInfoRequest copy$default(GetSuspendInfoRequest getSuspendInfoRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSuspendInfoRequest.subscriberNumber;
        }
        if ((i & 2) != 0) {
            str2 = getSuspendInfoRequest.userCode;
        }
        return getSuspendInfoRequest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final GetSuspendInfoRequest copy(@NotNull String subscriberNumber, @NotNull String userCode) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return new GetSuspendInfoRequest(subscriberNumber, userCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSuspendInfoRequest) {
            GetSuspendInfoRequest getSuspendInfoRequest = (GetSuspendInfoRequest) obj;
            return Intrinsics.areEqual(this.subscriberNumber, getSuspendInfoRequest.subscriberNumber) && Intrinsics.areEqual(this.userCode, getSuspendInfoRequest.userCode);
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

    public int hashCode() {
        return (this.subscriberNumber.hashCode() * 31) + this.userCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        String str2 = this.userCode;
        return "GetSuspendInfoRequest(subscriberNumber=" + str + ", userCode=" + str2 + ")";
    }
}
