package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nUpPassDemoTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassDemoTopBar.kt\nth/co/dtac/android/dtacone/view/activity/upPass/compose/UpPassDemoTopBarKt$NavIcon$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,208:1\n154#2:209\n*S KotlinDebug\n*F\n+ 1 UpPassDemoTopBar.kt\nth/co/dtac/android/dtacone/view/activity/upPass/compose/UpPassDemoTopBarKt$NavIcon$1\n*L\n168#1:209\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$NavIcon$1 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$NavIcon$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $foreColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$NavIcon$1(long j, int i) {
        super(2);
        this.$foreColor = j;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(354861225, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.compose.NavIcon.<anonymous> (UpPassDemoTopBar.kt:165)");
        }
        IconKt.m70610Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_one_back, composer, 0), (String) null, PaddingKt.m69713padding3ABfNKs(Modifier.Companion, C3623Dp.m73842constructorimpl(16)), this.$foreColor, composer, ((this.$$dirty << 9) & 7168) | 440, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}