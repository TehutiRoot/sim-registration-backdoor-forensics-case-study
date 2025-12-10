package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.DeviceListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$DeviceSelectScreen$8 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$DeviceSelectScreen$8 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DeviceListState $deviceListState;
    final /* synthetic */ Function1<String, Unit> $onDec;
    final /* synthetic */ Function1<String, Unit> $onDeviceSelect;
    final /* synthetic */ Function1<String, Unit> $onInc;
    final /* synthetic */ Function1<String, Unit> $onMeshSelect;
    final /* synthetic */ Function0<Unit> $onNext;
    final /* synthetic */ DeviceRouterItem $router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSelectScreenKt$DeviceSelectScreen$8(DeviceListState deviceListState, DeviceRouterItem deviceRouterItem, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, Function1<? super String, Unit> function14, Function0<Unit> function0, int i) {
        super(2);
        this.$deviceListState = deviceListState;
        this.$router = deviceRouterItem;
        this.$onDeviceSelect = function1;
        this.$onMeshSelect = function12;
        this.$onInc = function13;
        this.$onDec = function14;
        this.$onNext = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DeviceSelectScreenKt.DeviceSelectScreen(this.$deviceListState, this.$router, this.$onDeviceSelect, this.$onMeshSelect, this.$onInc, this.$onDec, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}