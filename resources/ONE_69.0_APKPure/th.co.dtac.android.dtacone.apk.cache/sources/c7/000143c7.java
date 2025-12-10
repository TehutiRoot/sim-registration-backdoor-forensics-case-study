package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.layout;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/layout/TopAppBarKt$TolTopAppBar$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,261:1\n154#2:262\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/layout/TopAppBarKt$TolTopAppBar$1\n*L\n93#1:262\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.TopAppBarKt$TolTopAppBar$1 */
/* loaded from: classes10.dex */
public final class TopAppBarKt$TolTopAppBar$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $canBack;
    final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$TolTopAppBar$1(boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$canBack = z;
        this.$onBack = function0;
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
            ComposerKt.traceEventStart(-1755689277, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.TolTopAppBar.<anonymous> (TopAppBar.kt:88)");
        }
        if (this.$canBack) {
            IconButtonKt.IconButton(this.$onBack, PaddingKt.m69717paddingqDBjuR0$default(Modifier.Companion, C3623Dp.m73842constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, ComposableSingletons$TopAppBarKt.INSTANCE.m75225getLambda2$app_prodRelease(), composer, ((this.$$dirty >> 9) & 14) | 196656, 28);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}