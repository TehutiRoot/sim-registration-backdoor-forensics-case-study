package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidSummaryFragment$initView$7 */
/* loaded from: classes10.dex */
public final class OnePrepaidSummaryFragment$initView$7 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePrepaidSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidSummaryFragment$initView$7(OnePrepaidSummaryFragment onePrepaidSummaryFragment) {
        super(0);
        this.this$0 = onePrepaidSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextView textView;
        textView = this.this$0.f95712N;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnRegisterWithActivate");
            textView = null;
        }
        textView.performClick();
    }
}