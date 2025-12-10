package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDateItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallAppointmentTimeRange;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$InstallTimeButton$2$1 */
/* loaded from: classes10.dex */
public final class InstallAppointmentScreenKt$InstallTimeButton$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AppointmentDateItem $date;
    final /* synthetic */ boolean $isAvailable;
    final /* synthetic */ Function3<String, InstallAppointmentTimeRange, Boolean, Unit> $onAppointmentSelected;
    final /* synthetic */ InstallAppointmentTimeRange $timeRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallAppointmentScreenKt$InstallTimeButton$2$1(Function3<? super String, ? super InstallAppointmentTimeRange, ? super Boolean, Unit> function3, AppointmentDateItem appointmentDateItem, InstallAppointmentTimeRange installAppointmentTimeRange, boolean z) {
        super(0);
        this.$onAppointmentSelected = function3;
        this.$date = appointmentDateItem;
        this.$timeRange = installAppointmentTimeRange;
        this.$isAvailable = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAppointmentSelected.invoke(this.$date.getDate(), this.$timeRange, Boolean.valueOf(this.$isAvailable));
    }
}