package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$DeviceSelectScreen$3$1 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$DeviceSelectScreen$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $showRouterSheet$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSelectScreenKt$DeviceSelectScreen$3$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$showRouterSheet$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DeviceSelectScreenKt.m9580h(this.$showRouterSheet$delegate, false);
    }
}