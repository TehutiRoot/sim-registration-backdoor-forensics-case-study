package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDateItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallAppointmentTimeRange;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$InstallTimeButton$4 */
/* loaded from: classes10.dex */
public final class InstallAppointmentScreenKt$InstallTimeButton$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppointmentDateItem $date;
    final /* synthetic */ boolean $isSecondary;
    final /* synthetic */ Function3<String, InstallAppointmentTimeRange, Boolean, Unit> $onAppointmentSelected;
    final /* synthetic */ InstallAppointmentTimeRange $timeRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallAppointmentScreenKt$InstallTimeButton$4(boolean z, AppointmentDateItem appointmentDateItem, InstallAppointmentTimeRange installAppointmentTimeRange, Function3<? super String, ? super InstallAppointmentTimeRange, ? super Boolean, Unit> function3, int i) {
        super(2);
        this.$isSecondary = z;
        this.$date = appointmentDateItem;
        this.$timeRange = installAppointmentTimeRange;
        this.$onAppointmentSelected = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InstallAppointmentScreenKt.m9488g(this.$isSecondary, this.$date, this.$timeRange, this.$onAppointmentSelected, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}