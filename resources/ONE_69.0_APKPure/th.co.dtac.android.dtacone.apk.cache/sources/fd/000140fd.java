package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NotImplementedScreen$2 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$NotImplementedScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function0<Unit> $onNavigate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$NotImplementedScreen$2(Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$onNavigate = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneTolNavGraphKt.m9596c(this.$onNavigate, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}