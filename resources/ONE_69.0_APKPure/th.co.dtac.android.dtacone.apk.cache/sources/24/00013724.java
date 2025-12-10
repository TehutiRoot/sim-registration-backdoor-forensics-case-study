package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidSummaryFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidSummaryFragment$initView$1 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OnePostpaidSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidSummaryFragment$initView$1(OnePostpaidSummaryFragment onePostpaidSummaryFragment) {
        super(1);
        this.this$0 = onePostpaidSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.m12420C(it);
    }
}