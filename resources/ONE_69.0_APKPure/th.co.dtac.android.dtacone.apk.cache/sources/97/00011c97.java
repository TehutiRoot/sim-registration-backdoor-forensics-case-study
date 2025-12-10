package th.p047co.dtac.android.dtacone.model.appOne.topup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberRequest;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "(Ljava/lang/String;)V", "getSubscriberNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberRequest */
/* loaded from: classes8.dex */
public final class OneTopUpCheckSubscriberRequest {
    public static final int $stable = 0;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;

    public OneTopUpCheckSubscriberRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneTopUpCheckSubscriberRequest copy$default(OneTopUpCheckSubscriberRequest oneTopUpCheckSubscriberRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTopUpCheckSubscriberRequest.subscriberNumber;
        }
        return oneTopUpCheckSubscriberRequest.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.subscriberNumber;
    }

    @NotNull
    public final OneTopUpCheckSubscriberRequest copy(@Nullable String str) {
        return new OneTopUpCheckSubscriberRequest(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneTopUpCheckSubscriberRequest) && Intrinsics.areEqual(this.subscriberNumber, ((OneTopUpCheckSubscriberRequest) obj).subscriberNumber);
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        String str = this.subscriberNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        return "OneTopUpCheckSubscriberRequest(subscriberNumber=" + str + ")";
    }

    public OneTopUpCheckSubscriberRequest(@Nullable String str) {
        this.subscriberNumber = str;
    }

    public /* synthetic */ OneTopUpCheckSubscriberRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}