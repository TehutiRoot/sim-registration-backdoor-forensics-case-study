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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$SubHeaderRow$3 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$SubHeaderRow$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $editable;
    final /* synthetic */ int $icon;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ int $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSelectScreenKt$SubHeaderRow$3(int i, int i2, boolean z, Function0<Unit> function0, int i3, int i4) {
        super(2);
        this.$icon = i;
        this.$title = i2;
        this.$editable = z;
        this.$onClick = function0;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DeviceSelectScreenKt.SubHeaderRow(this.$icon, this.$title, this.$editable, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}