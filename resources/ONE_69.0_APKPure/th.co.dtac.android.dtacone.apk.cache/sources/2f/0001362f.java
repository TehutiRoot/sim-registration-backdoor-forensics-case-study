package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity$ComposeContent$6 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationActivity$ComposeContent$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostpaidRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationActivity$ComposeContent$6(OnePostpaidRegistrationActivity onePostpaidRegistrationActivity) {
        super(0);
        this.this$0 = onePostpaidRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getOnDismissDialog().invoke();
    }
}