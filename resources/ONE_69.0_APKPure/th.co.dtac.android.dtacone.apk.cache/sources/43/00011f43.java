package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileRequest;", "", "userCode", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "(Ljava/lang/String;Ljava/lang/String;)V", "getSubscriberNumber", "()Ljava/lang/String;", "getUserCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetPre2PostMobileRequest */
/* loaded from: classes8.dex */
public final class GetPre2PostMobileRequest {
    public static final int $stable = 0;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;

    public GetPre2PostMobileRequest(@NotNull String userCode, @NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.userCode = userCode;
        this.subscriberNumber = subscriberNumber;
    }

    public static /* synthetic */ GetPre2PostMobileRequest copy$default(GetPre2PostMobileRequest getPre2PostMobileRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPre2PostMobileRequest.userCode;
        }
        if ((i & 2) != 0) {
            str2 = getPre2PostMobileRequest.subscriberNumber;
        }
        return getPre2PostMobileRequest.copy(str, str2);
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
    public final GetPre2PostMobileRequest copy(@NotNull String userCode, @NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        return new GetPre2PostMobileRequest(userCode, subscriberNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPre2PostMobileRequest) {
            GetPre2PostMobileRequest getPre2PostMobileRequest = (GetPre2PostMobileRequest) obj;
            return Intrinsics.areEqual(this.userCode, getPre2PostMobileRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, getPre2PostMobileRequest.subscriberNumber);
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
        return (this.userCode.hashCode() * 31) + this.subscriberNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.subscriberNumber;
        return "GetPre2PostMobileRequest(userCode=" + str + ", subscriberNumber=" + str2 + ")";
    }
}