package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$NavIcon$2 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$NavIcon$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $foreColor;
    final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$NavIcon$2(long j, Function0<Unit> function0, int i) {
        super(2);
        this.$foreColor = j;
        this.$onBack = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        UpPassDemoTopBarKt.m75160NavIconIv8Zu3U(this.$foreColor, this.$onBack, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}