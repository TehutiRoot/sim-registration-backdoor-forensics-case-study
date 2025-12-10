package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallAppointment;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$HeaderSection$2 */
/* loaded from: classes10.dex */
public final class InstallAppointmentScreenKt$HeaderSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InstallAppointment $appointment;
    final /* synthetic */ boolean $isSecondary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallAppointmentScreenKt$HeaderSection$2(boolean z, InstallAppointment installAppointment, int i) {
        super(2);
        this.$isSecondary = z;
        this.$appointment = installAppointment;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InstallAppointmentScreenKt.m9492c(this.$isSecondary, this.$appointment, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}