package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$2 */
/* loaded from: classes7.dex */
public final class OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$2 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $uncheckedColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRoundedCornerCheckBoxKt$OneRoundedCornerCheckBox$1$1$2(long j, int i) {
        super(3);
        this.$uncheckedColor = j;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244026738, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneRoundedCornerCheckBox.<anonymous>.<anonymous>.<anonymous> (OneRoundedCornerCheckBox.kt:81)");
        }
        IconKt.m70427Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, this.$uncheckedColor, composer, ((this.$$dirty >> 15) & 7168) | 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
