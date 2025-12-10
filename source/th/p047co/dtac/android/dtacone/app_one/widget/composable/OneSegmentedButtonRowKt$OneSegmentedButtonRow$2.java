package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRowKt$OneSegmentedButtonRow$2 */
/* loaded from: classes7.dex */
public final class OneSegmentedButtonRowKt$OneSegmentedButtonRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<String> $labels;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Integer, Unit> $onSelectedChange;
    final /* synthetic */ int $selectedIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSegmentedButtonRowKt$OneSegmentedButtonRow$2(List<String> list, int i, Function1<? super Integer, Unit> function1, Modifier modifier, int i2, int i3) {
        super(2);
        this.$labels = list;
        this.$selectedIndex = i;
        this.$onSelectedChange = function1;
        this.$modifier = modifier;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneSegmentedButtonRowKt.OneSegmentedButtonRow(this.$labels, this.$selectedIndex, this.$onSelectedChange, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
