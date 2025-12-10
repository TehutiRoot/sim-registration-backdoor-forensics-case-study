package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.checkPort;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.SubmitOrderState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.checkPort.CheckPortScreenKt$CheckPortScreen$2 */
/* loaded from: classes10.dex */
public final class CheckPortScreenKt$CheckPortScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<SaveOrderResponse, Unit> $onAppointmentPrimary;
    final /* synthetic */ Function1<SaveOrderResponse, Unit> $onAppointmentSecondary;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ SubmitOrderState $submitOrderState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckPortScreenKt$CheckPortScreen$2(SubmitOrderState submitOrderState, Function1<? super SaveOrderResponse, Unit> function1, Function1<? super SaveOrderResponse, Unit> function12, Function0<Unit> function0, int i) {
        super(2);
        this.$submitOrderState = submitOrderState;
        this.$onAppointmentPrimary = function1;
        this.$onAppointmentSecondary = function12;
        this.$onSuccess = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        CheckPortScreenKt.CheckPortScreen(this.$submitOrderState, this.$onAppointmentPrimary, this.$onAppointmentSecondary, this.$onSuccess, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}