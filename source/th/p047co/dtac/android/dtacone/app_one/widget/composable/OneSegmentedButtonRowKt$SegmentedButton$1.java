package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRowKt$SegmentedButton$1 */
/* loaded from: classes7.dex */
public final class OneSegmentedButtonRowKt$SegmentedButton$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSegmentedButtonRowKt$SegmentedButton$1(boolean z, int i) {
        super(2);
        this.$selected = z;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1800204655, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButton.<anonymous> (OneSegmentedButtonRow.kt:170)");
        }
        SegmentedButtonDefaults.INSTANCE.Icon(this.$selected, null, composer, ((this.$$dirty >> 3) & 14) | 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
