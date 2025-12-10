package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$RouterSelectSheet$3 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$RouterSelectSheet$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $deviceCode;
    final /* synthetic */ List<DeviceRouterItem> $deviceList;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSelectScreenKt$RouterSelectSheet$3(List<DeviceRouterItem> list, String str, Function1<? super String, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$deviceList = list;
        this.$deviceCode = str;
        this.$onSelect = function1;
        this.$onDismiss = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DeviceSelectScreenKt.RouterSelectSheet(this.$deviceList, this.$deviceCode, this.$onSelect, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}