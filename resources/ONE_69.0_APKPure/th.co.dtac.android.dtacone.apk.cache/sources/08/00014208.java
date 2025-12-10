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
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceMeshItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$MeshWifiSection$2 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$MeshWifiSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $canEdit;
    final /* synthetic */ boolean $isNotAvailable;
    final /* synthetic */ int $maxTotal;
    final /* synthetic */ DeviceMeshItem $mesh;
    final /* synthetic */ Function1<String, Unit> $onDec;
    final /* synthetic */ Function0<Unit> $onEdit;
    final /* synthetic */ Function1<String, Unit> $onInc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSelectScreenKt$MeshWifiSection$2(DeviceMeshItem deviceMeshItem, boolean z, boolean z2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function0<Unit> function0, int i, int i2, int i3) {
        super(2);
        this.$mesh = deviceMeshItem;
        this.$isNotAvailable = z;
        this.$canEdit = z2;
        this.$onInc = function1;
        this.$onDec = function12;
        this.$onEdit = function0;
        this.$maxTotal = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DeviceSelectScreenKt.m9577k(this.$mesh, this.$isNotAvailable, this.$canEdit, this.$onInc, this.$onDec, this.$onEdit, this.$maxTotal, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}