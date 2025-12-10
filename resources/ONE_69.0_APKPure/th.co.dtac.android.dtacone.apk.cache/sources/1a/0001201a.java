package th.p047co.dtac.android.dtacone.model.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/prepaid/PrepaidNumber;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "simCardNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getSimCardNumber", "()Ljava/lang/String;", "getSubscriberNumber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.prepaid.PrepaidNumber */
/* loaded from: classes8.dex */
public final class PrepaidNumber {
    public static final int $stable = 0;
    @NotNull
    private final String simCardNumber;
    @NotNull
    private final String subscriberNumber;

    public PrepaidNumber(@NotNull String subscriberNumber, @NotNull String simCardNumber) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        this.subscriberNumber = subscriberNumber;
        this.simCardNumber = simCardNumber;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }
}