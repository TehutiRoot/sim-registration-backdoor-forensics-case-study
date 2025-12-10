package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$ThemeButton$2 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$ThemeButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<Color> $colors;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ RowScope $this_ThemeButton;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectOptionsScreenKt$ThemeButton$2(RowScope rowScope, String str, List<Color> list, boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$this_ThemeButton = rowScope;
        this.$title = str;
        this.$colors = list;
        this.$selected = z;
        this.$onClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SelectOptionsScreenKt.m3401o(this.$this_ThemeButton, this.$title, this.$colors, this.$selected, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}