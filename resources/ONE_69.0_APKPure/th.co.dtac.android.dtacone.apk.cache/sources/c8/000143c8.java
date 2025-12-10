package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.layout;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/layout/TopAppBarKt$TolTopAppBar$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,261:1\n154#2:262\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/layout/TopAppBarKt$TolTopAppBar$2\n*L\n111#1:262\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.TopAppBarKt$TolTopAppBar$2 */
/* loaded from: classes10.dex */
public final class TopAppBarKt$TolTopAppBar$2 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isProductTypeShow;
    final /* synthetic */ Function0<Unit> $onGisClose;
    final /* synthetic */ ProductType $productType;
    final /* synthetic */ boolean $showCloseButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$TolTopAppBar$2(boolean z, ProductType productType, int i, boolean z2, Function0<Unit> function0) {
        super(3);
        this.$isProductTypeShow = z;
        this.$productType = productType;
        this.$$dirty = i;
        this.$showCloseButton = z2;
        this.$onGisClose = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull RowScope CenterAlignedTopAppBar, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
        if ((i & 14) == 0) {
            i |= composer.changed(CenterAlignedTopAppBar) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-359866836, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.TolTopAppBar.<anonymous> (TopAppBar.kt:103)");
        }
        composer.startReplaceableGroup(-1670789924);
        if (this.$isProductTypeShow) {
            TopAppBarKt.m9474b(CenterAlignedTopAppBar, this.$productType, composer, (i & 14) | (this.$$dirty & 112));
        }
        composer.endReplaceableGroup();
        if (this.$showCloseButton) {
            IconButtonKt.IconButton(this.$onGisClose, PaddingKt.m69717paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, C3623Dp.m73842constructorimpl(4), 0.0f, 11, null), false, null, null, ComposableSingletons$TopAppBarKt.INSTANCE.m75226getLambda3$app_prodRelease(), composer, ((this.$$dirty >> 6) & 14) | 196656, 28);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}