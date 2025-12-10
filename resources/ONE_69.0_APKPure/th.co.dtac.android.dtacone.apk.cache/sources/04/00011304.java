package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog$initView$4 */
/* loaded from: classes7.dex */
public final class OneRtrPhoneDialog$initView$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneRtrPhoneDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRtrPhoneDialog$initView$4(OneRtrPhoneDialog oneRtrPhoneDialog) {
        super(0);
        this.this$0 = oneRtrPhoneDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SimData simData;
        this.this$0.dismiss();
        Function1<SimData, Unit> onButtonClick = this.this$0.getOnButtonClick();
        if (onButtonClick != null) {
            simData = this.this$0.f83095f;
            onButtonClick.invoke(simData);
        }
    }
}