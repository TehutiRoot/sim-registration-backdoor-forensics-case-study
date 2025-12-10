package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$ModelRow$4 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$ModelRow$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $count;
    final /* synthetic */ boolean $countEnabled;
    final /* synthetic */ boolean $isMaxTotal;
    final /* synthetic */ int $maxCount;
    final /* synthetic */ String $modelName;
    final /* synthetic */ Function0<Unit> $onDec;
    final /* synthetic */ Function0<Unit> $onInc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSelectScreenKt$ModelRow$4(String str, boolean z, int i, int i2, boolean z2, Function0<Unit> function0, Function0<Unit> function02, int i3, int i4) {
        super(2);
        this.$modelName = str;
        this.$countEnabled = z;
        this.$count = i;
        this.$maxCount = i2;
        this.$isMaxTotal = z2;
        this.$onInc = function0;
        this.$onDec = function02;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DeviceSelectScreenKt.ModelRow(this.$modelName, this.$countEnabled, this.$count, this.$maxCount, this.$isMaxTotal, this.$onInc, this.$onDec, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}