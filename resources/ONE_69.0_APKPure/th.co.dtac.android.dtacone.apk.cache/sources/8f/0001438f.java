package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallAppointmentTimeRange;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$InstallDateSection$2 */
/* loaded from: classes10.dex */
public final class InstallAppointmentScreenKt$InstallDateSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InstallDateState $installDateState;
    final /* synthetic */ boolean $isSecondary;
    final /* synthetic */ Function3<String, InstallAppointmentTimeRange, Boolean, Unit> $onAppointmentSelected;
    final /* synthetic */ ColumnScope $this_InstallDateSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallAppointmentScreenKt$InstallDateSection$2(ColumnScope columnScope, boolean z, InstallDateState installDateState, Function3<? super String, ? super InstallAppointmentTimeRange, ? super Boolean, Unit> function3, int i) {
        super(2);
        this.$this_InstallDateSection = columnScope;
        this.$isSecondary = z;
        this.$installDateState = installDateState;
        this.$onAppointmentSelected = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InstallAppointmentScreenKt.m9489f(this.$this_InstallDateSection, this.$isSecondary, this.$installDateState, this.$onAppointmentSelected, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}