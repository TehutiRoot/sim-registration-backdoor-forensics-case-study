package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/activity/OnePrepaidRegistrationActivity;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidNonTelcoFragment$activity$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidNonTelcoFragment$activity$2 extends Lambda implements Function0<OnePrepaidRegistrationActivity> {
    final /* synthetic */ OnePrepaidNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidNonTelcoFragment$activity$2(OnePrepaidNonTelcoFragment onePrepaidNonTelcoFragment) {
        super(0);
        this.this$0 = onePrepaidNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final OnePrepaidRegistrationActivity invoke() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity");
        return (OnePrepaidRegistrationActivity) requireActivity;
    }
}