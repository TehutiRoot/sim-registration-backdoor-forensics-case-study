package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$ComposeContent$7 */
/* loaded from: classes10.dex */
public final class OnePrepaidRegistrationActivity$ComposeContent$7 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePrepaidRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidRegistrationActivity$ComposeContent$7(OnePrepaidRegistrationActivity onePrepaidRegistrationActivity) {
        super(0);
        this.this$0 = onePrepaidRegistrationActivity;
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