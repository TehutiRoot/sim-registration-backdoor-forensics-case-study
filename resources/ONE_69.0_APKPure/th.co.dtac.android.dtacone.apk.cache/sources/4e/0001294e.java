package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$UpPassDemoTopBar$4 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$UpPassDemoTopBar$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $faceCompareSelectedIndex;
    final /* synthetic */ long $foreColor;
    final /* synthetic */ String $route;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$UpPassDemoTopBar$4(String str, long j, int i, int i2) {
        super(2);
        this.$route = str;
        this.$foreColor = j;
        this.$faceCompareSelectedIndex = i;
        this.$$dirty = i2;
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
            ComposerKt.traceEventStart(-2112591600, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBar.<anonymous> (UpPassDemoTopBar.kt:85)");
        }
        String str = this.$route;
        long j = this.$foreColor;
        int i2 = this.$faceCompareSelectedIndex;
        int i3 = this.$$dirty;
        UpPassDemoTopBarKt.m16168b(str, j, i2, composer, (i3 & 14) | ((i3 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}