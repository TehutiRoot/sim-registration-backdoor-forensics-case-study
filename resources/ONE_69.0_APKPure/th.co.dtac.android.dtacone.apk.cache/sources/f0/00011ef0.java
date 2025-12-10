package th.p047co.dtac.android.dtacone.model.mrtr_online_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/ValidateMobileRegisterRequest;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "(Ljava/lang/String;)V", "getSubscriberNumber", "()Ljava/lang/String;", "setSubscriberNumber", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.ValidateMobileRegisterRequest */
/* loaded from: classes8.dex */
public final class ValidateMobileRegisterRequest {
    public static final int $stable = 8;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;

    public ValidateMobileRegisterRequest(@NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.subscriberNumber = subscriberNumber;
    }

    public static /* synthetic */ ValidateMobileRegisterRequest copy$default(ValidateMobileRegisterRequest validateMobileRegisterRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateMobileRegisterRequest.subscriberNumber;
        }
        return validateMobileRegisterRequest.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.subscriberNumber;
    }

    @NotNull
    public final ValidateMobileRegisterRequest copy(@NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        return new ValidateMobileRegisterRequest(subscriberNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateMobileRegisterRequest) && Intrinsics.areEqual(this.subscriberNumber, ((ValidateMobileRegisterRequest) obj).subscriberNumber);
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        return this.subscriberNumber.hashCode();
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        return "ValidateMobileRegisterRequest(subscriberNumber=" + str + ")";
    }
}