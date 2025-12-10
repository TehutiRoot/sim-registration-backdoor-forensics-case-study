package th.p047co.dtac.android.dtacone.view.activity.multi_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity$ComposeContent$6 */
/* loaded from: classes10.dex */
public final class MrtrPrepaidMultiSimActivity$ComposeContent$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPrepaidMultiSimActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimActivity$ComposeContent$6(MrtrPrepaidMultiSimActivity mrtrPrepaidMultiSimActivity) {
        super(0);
        this.this$0 = mrtrPrepaidMultiSimActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.get_showErrorDialogState().setValue(Boolean.FALSE);
        this.this$0.getOnError().invoke(this.this$0.getError());
        this.this$0.setError(new ErrorCollection());
    }
}