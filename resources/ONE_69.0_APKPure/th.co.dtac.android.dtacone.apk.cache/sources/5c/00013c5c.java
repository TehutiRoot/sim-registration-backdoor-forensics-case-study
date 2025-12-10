package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment;

import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidSummaryFragment$removeItemViewPager$1$1 */
/* loaded from: classes10.dex */
public final class OnePrepaidSummaryFragment$removeItemViewPager$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $imageName;
    final /* synthetic */ OnePrepaidSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidSummaryFragment$removeItemViewPager$1$1(OnePrepaidSummaryFragment onePrepaidSummaryFragment, String str) {
        super(0);
        this.this$0 = onePrepaidSummaryFragment;
        this.$imageName = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ArrayList m10683x;
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity");
        ((OnePrepaidRegistrationActivity) requireActivity).removeMultiplePhoto(this.$imageName);
        m10683x = this.this$0.m10683x();
        m10683x.remove(this.$imageName);
        this.this$0.m10701K();
    }
}