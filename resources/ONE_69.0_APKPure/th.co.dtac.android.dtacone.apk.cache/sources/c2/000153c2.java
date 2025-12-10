package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectThemeSection$2 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$SelectThemeSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Integer, Unit> $onSelectTheme;
    final /* synthetic */ int $themeIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$SelectThemeSection$2(int i, Function1<? super Integer, Unit> function1, int i2) {
        super(2);
        this.$themeIndex = i;
        this.$onSelectTheme = function1;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SelectOptionsScreenKt.m3405k(this.$themeIndex, this.$onSelectTheme, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}