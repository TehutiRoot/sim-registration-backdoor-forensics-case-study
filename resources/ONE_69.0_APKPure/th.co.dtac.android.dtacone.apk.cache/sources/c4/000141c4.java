package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.checkPort;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.checkPort.CheckPortScreenKt$CheckPortScreen$1$5 */
/* loaded from: classes10.dex */
public final class CheckPortScreenKt$CheckPortScreen$1$5 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneRegisterTrueOnlineActivity $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPortScreenKt$CheckPortScreen$1$5(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
        super(0);
        this.$context = oneRegisterTrueOnlineActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$context.finish();
    }
}