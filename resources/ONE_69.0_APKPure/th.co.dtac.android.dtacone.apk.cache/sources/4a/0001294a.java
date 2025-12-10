package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$TopBarTitle$1 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$TopBarTitle$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ int $face;
    final /* synthetic */ String $route;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$TopBarTitle$1(String str, long j, int i, int i2) {
        super(2);
        this.$route = str;
        this.$color = j;
        this.$face = i;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        UpPassDemoTopBarKt.m16168b(this.$route, this.$color, this.$face, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}