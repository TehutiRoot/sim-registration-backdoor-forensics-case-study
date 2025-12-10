package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1664:1\n73#2,7:1665\n80#2:1698\n84#2:1703\n75#3:1672\n76#3,11:1674\n89#3:1702\n76#4:1673\n460#5,13:1685\n473#5,3:1699\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n*L\n1205#1:1665,7\n1205#1:1698\n1205#1:1703\n1205#1:1672\n1205#1:1674,11\n1205#1:1702\n1205#1:1673\n1205#1:1685,13\n1205#1:1699,3\n*E\n"})
/* loaded from: classes2.dex */
public final class AppBarKt$TwoRowsTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ Ref.FloatRef $maxHeightPx;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ Ref.FloatRef $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ Ref.IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TwoRowsTopAppBar$3(WindowInsets windowInsets, Ref.FloatRef floatRef, TopAppBarColors topAppBarColors, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, Ref.FloatRef floatRef2, TopAppBarScrollBehavior topAppBarScrollBehavior, Function2<? super Composer, ? super Integer, Unit> function24, TextStyle textStyle2, float f2, Ref.IntRef intRef, boolean z2) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$pinnedHeightPx = floatRef;
        this.$colors = topAppBarColors;
        this.$smallTitle = function2;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f;
        this.$hideTopRowSemantics = z;
        this.$navigationIcon = function22;
        this.$actionsRow = function23;
        this.$$dirty = i;
        this.$maxHeightPx = floatRef2;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = function24;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f2;
        this.$titleBottomPaddingPx = intRef;
        this.$hideBottomRowSemantics = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        TopAppBarState state;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985938853, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1203)");
        }
        WindowInsets windowInsets = this.$windowInsets;
        Ref.FloatRef floatRef = this.$pinnedHeightPx;
        TopAppBarColors topAppBarColors = this.$colors;
        Function2<Composer, Integer, Unit> function2 = this.$smallTitle;
        TextStyle textStyle = this.$smallTitleTextStyle;
        float f = this.$topTitleAlpha;
        boolean z = this.$hideTopRowSemantics;
        Function2<Composer, Integer, Unit> function22 = this.$navigationIcon;
        Function2<Composer, Integer, Unit> function23 = this.$actionsRow;
        int i2 = this.$$dirty;
        Ref.FloatRef floatRef2 = this.$maxHeightPx;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        Function2<Composer, Integer, Unit> function24 = this.$title;
        TextStyle textStyle2 = this.$titleTextStyle;
        float f2 = this.$bottomTitleAlpha;
        Ref.IntRef intRef = this.$titleBottomPaddingPx;
        boolean z2 = this.$hideBottomRowSemantics;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
        Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, density, companion2.getSetDensity());
        Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i3 = i2 << 3;
        AppBarKt.m60700c(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets)), floatRef.element, topAppBarColors.m70810getNavigationIconContentColor0d7_KjU$material3_release(), topAppBarColors.m70811getTitleContentColor0d7_KjU$material3_release(), topAppBarColors.m70809getActionIconContentColor0d7_KjU$material3_release(), function2, textStyle, f, arrangement.getCenter(), arrangement.getStart(), 0, z, function22, function23, composer, (i3 & 458752) | 905969664 | (i3 & 3670016), ((i2 >> 12) & 896) | 3078);
        Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, WindowInsetsKt.m69575onlybOOhFvg(windowInsets, WindowInsetsSides.Companion.m69590getHorizontalJoeWqyM())));
        float heightOffset = ((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset()) + (floatRef2.element - floatRef.element);
        long m70810getNavigationIconContentColor0d7_KjU$material3_release = topAppBarColors.m70810getNavigationIconContentColor0d7_KjU$material3_release();
        long m70811getTitleContentColor0d7_KjU$material3_release = topAppBarColors.m70811getTitleContentColor0d7_KjU$material3_release();
        long m70809getActionIconContentColor0d7_KjU$material3_release = topAppBarColors.m70809getActionIconContentColor0d7_KjU$material3_release();
        Arrangement.Vertical bottom = arrangement.getBottom();
        Arrangement.Horizontal start = arrangement.getStart();
        int i4 = intRef.element;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
        Function2<Composer, Integer, Unit> m70304getLambda11$material3_release = composableSingletons$AppBarKt.m70304getLambda11$material3_release();
        Function2<Composer, Integer, Unit> m70305getLambda12$material3_release = composableSingletons$AppBarKt.m70305getLambda12$material3_release();
        int i5 = i2 << 12;
        AppBarKt.m60700c(clipToBounds, heightOffset, m70810getNavigationIconContentColor0d7_KjU$material3_release, m70811getTitleContentColor0d7_KjU$material3_release, m70809getActionIconContentColor0d7_KjU$material3_release, function24, textStyle2, f2, bottom, start, i4, z2, m70304getLambda11$material3_release, m70305getLambda12$material3_release, composer, (i5 & 458752) | 905969664 | (i5 & 3670016), 3456);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
