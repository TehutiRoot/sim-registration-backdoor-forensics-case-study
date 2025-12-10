package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11663a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,522:1\n486#2,4:523\n490#2,2:531\n494#2:537\n25#3:527\n1097#4,3:528\n1100#4,3:534\n486#5:533\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n*L\n298#1:523,4\n298#1:531,2\n298#1:537\n298#1:527\n298#1:528,3\n298#1:534,3\n298#1:533\n*E\n"})
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function2<Composer, Integer, Unit> $backLayer;
    final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ float $headerHeightPx;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "backLayerHeight", "", "invoke-jYbf7pk", "(JFLandroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,522:1\n36#2:523\n456#2,8:547\n464#2,3:561\n467#2,3:565\n1097#3,6:524\n154#4:530\n67#5,5:531\n72#5:564\n76#5:569\n78#6,11:536\n91#6:568\n4144#7,6:555\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1\n*L\n345#1:523\n367#1:547,8\n367#1:561,3\n367#1:565,3\n345#1:524,6\n372#1:530\n367#1:531,5\n367#1:564\n367#1:569\n367#1:536,11\n367#1:568\n367#1:555,6\n*E\n"})
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1 */
    /* loaded from: classes.dex */
    public static final class C30451 extends Lambda implements Function4<Constraints, Float, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ long $frontLayerBackgroundColor;
        final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
        final /* synthetic */ long $frontLayerContentColor;
        final /* synthetic */ float $frontLayerElevation;
        final /* synthetic */ long $frontLayerScrimColor;
        final /* synthetic */ Shape $frontLayerShape;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ float $headerHeight;
        final /* synthetic */ float $headerHeightPx;
        final /* synthetic */ float $peekHeight;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
        final /* synthetic */ boolean $stickyFrontLayer;

        @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,522:1\n66#2,6:523\n72#2:557\n76#2:562\n78#3,11:529\n91#3:561\n456#4,8:540\n464#4,3:554\n467#4,3:558\n4144#5,6:548\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1$2\n*L\n352#1:523,6\n352#1:557\n352#1:562\n352#1:529,11\n352#1:561\n352#1:540,8\n352#1:554,3\n352#1:558,3\n352#1:548,6\n*E\n"})
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2 */
        /* loaded from: classes.dex */
        public static final class C30462 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
            final /* synthetic */ long $frontLayerScrimColor;
            final /* synthetic */ boolean $gesturesEnabled;
            final /* synthetic */ float $peekHeight;
            final /* synthetic */ BackdropScaffoldState $scaffoldState;
            final /* synthetic */ CoroutineScope $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C30462(float f, Function2<? super Composer, ? super Integer, Unit> function2, int i, long j, BackdropScaffoldState backdropScaffoldState, int i2, boolean z, CoroutineScope coroutineScope) {
                super(2);
                this.$peekHeight = f;
                this.$frontLayerContent = function2;
                this.$$dirty = i;
                this.$frontLayerScrimColor = j;
                this.$scaffoldState = backdropScaffoldState;
                this.$$dirty1 = i2;
                this.$gesturesEnabled = z;
                this.$scope = coroutineScope;
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
                    ComposerKt.traceEventStart(-1065299503, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:350)");
                }
                Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, this.$peekHeight, 7, null);
                Function2<Composer, Integer, Unit> function2 = this.$frontLayerContent;
                int i2 = this.$$dirty;
                long j = this.$frontLayerScrimColor;
                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                int i3 = this.$$dirty1;
                boolean z = this.$gesturesEnabled;
                CoroutineScope coroutineScope = this.$scope;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69717paddingqDBjuR0$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
                Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
                BackdropScaffoldKt.m60900d(j, new BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(z, backdropScaffoldState, coroutineScope), backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer, (i3 >> 18) & 14);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30451(float f, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f2, int i, Shape shape, long j, long j2, float f3, int i2, float f4, CoroutineScope coroutineScope, float f5, Function2<? super Composer, ? super Integer, Unit> function2, long j3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.$headerHeightPx = f;
            this.$stickyFrontLayer = z;
            this.$gesturesEnabled = z2;
            this.$scaffoldState = backdropScaffoldState;
            this.$peekHeightPx = f2;
            this.$$dirty = i;
            this.$frontLayerShape = shape;
            this.$frontLayerBackgroundColor = j;
            this.$frontLayerContentColor = j2;
            this.$frontLayerElevation = f3;
            this.$$dirty1 = i2;
            this.$headerHeight = f4;
            this.$scope = coroutineScope;
            this.$peekHeight = f5;
            this.$frontLayerContent = function2;
            this.$frontLayerScrimColor = j3;
            this.$snackbarHost = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f, Composer composer, Integer num) {
            m70101invokejYbf7pk(constraints.m73816unboximpl(), f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        /* renamed from: invoke-jYbf7pk  reason: not valid java name */
        public final void m70101invokejYbf7pk(long j, float f, @Nullable Composer composer, int i) {
            int i2;
            Modifier modifier;
            float m73842constructorimpl;
            int i3;
            int i4;
            if ((i & 14) == 0) {
                if (composer.changed(j)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i2 = i4 | i;
            } else {
                i2 = i;
            }
            if ((i & 112) == 0) {
                if (composer.changed(f)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
                i2 |= i3;
            }
            if ((i2 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800047509, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:302)");
            }
            float m73809getMaxHeightimpl = Constraints.m73809getMaxHeightimpl(j);
            float f2 = m73809getMaxHeightimpl - this.$headerHeightPx;
            if (this.$stickyFrontLayer) {
                f2 = Math.min(f2, f);
            }
            float f3 = f2;
            if (this.$gesturesEnabled) {
                modifier = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.$scaffoldState.getNestedScrollConnection$material_release(), null, 2, null);
            } else {
                modifier = Modifier.Companion;
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SwipeableKt.m70297swipeablepPrIpRY$default(companion.then(modifier), this.$scaffoldState, AbstractC11663a.mapOf(TuplesKt.m29136to(Float.valueOf(this.$peekHeightPx), BackdropValue.Concealed), TuplesKt.m29136to(Float.valueOf(f3), BackdropValue.Revealed)), Orientation.Vertical, this.$gesturesEnabled, false, null, null, null, 0.0f, 496, null), false, new BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1(this.$scaffoldState, this.$scope), 1, null);
            BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(backdropScaffoldState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BackdropScaffoldKt$BackdropScaffold$1$1$1$1(backdropScaffoldState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier then = OffsetKt.offset(companion, (Function1) rememberedValue).then(semantics$default);
            Shape shape = this.$frontLayerShape;
            long j2 = this.$frontLayerBackgroundColor;
            long j3 = this.$frontLayerContentColor;
            float f4 = this.$frontLayerElevation;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1065299503, true, new C30462(this.$peekHeight, this.$frontLayerContent, this.$$dirty, this.$frontLayerScrimColor, this.$scaffoldState, this.$$dirty1, this.$gesturesEnabled, this.$scope));
            int i5 = this.$$dirty1;
            SurfaceKt.m70288SurfaceFjzlyU(then, shape, j2, j3, null, f4, composableLambda, composer, ((i5 >> 3) & 112) | 1572864 | ((i5 >> 6) & 896) | ((i5 >> 6) & 7168) | ((i5 << 6) & 458752), 16);
            if (this.$scaffoldState.isRevealed() && f3 == m73809getMaxHeightimpl - this.$headerHeightPx) {
                m73842constructorimpl = this.$headerHeight;
            } else {
                m73842constructorimpl = C3623Dp.m73842constructorimpl(0);
            }
            Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, m73842constructorimpl, 7, null);
            Alignment bottomCenter = Alignment.Companion.getBottomCenter();
            Function3<SnackbarHostState, Composer, Integer, Unit> function3 = this.$snackbarHost;
            BackdropScaffoldState backdropScaffoldState2 = this.$scaffoldState;
            int i6 = this.$$dirty1;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69717paddingqDBjuR0$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
            Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function3.invoke(backdropScaffoldState2.getSnackbarHostState(), composer, Integer.valueOf((i6 >> 18) & 112));
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropScaffold$1(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Constraints, Constraints> function1, float f, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f2, int i, Shape shape, long j, long j2, float f3, int i2, float f4, float f5, Function2<? super Composer, ? super Integer, Unit> function22, long j3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = function2;
        this.$calculateBackLayerConstraints = function1;
        this.$headerHeightPx = f;
        this.$stickyFrontLayer = z;
        this.$gesturesEnabled = z2;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f2;
        this.$$dirty = i;
        this.$frontLayerShape = shape;
        this.$frontLayerBackgroundColor = j;
        this.$frontLayerContentColor = j2;
        this.$frontLayerElevation = f3;
        this.$$dirty1 = i2;
        this.$headerHeight = f4;
        this.$peekHeight = f5;
        this.$frontLayerContent = function22;
        this.$frontLayerScrimColor = j3;
        this.$snackbarHost = function3;
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
            ComposerKt.traceEventStart(-1049909631, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:296)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        BackdropScaffoldKt.m60901c(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$backLayer, this.$calculateBackLayerConstraints, ComposableLambdaKt.composableLambda(composer, 1800047509, true, new C30451(this.$headerHeightPx, this.$stickyFrontLayer, this.$gesturesEnabled, this.$scaffoldState, this.$peekHeightPx, this.$$dirty, this.$frontLayerShape, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerElevation, this.$$dirty1, this.$headerHeight, coroutineScope, this.$peekHeight, this.$frontLayerContent, this.$frontLayerScrimColor, this.$snackbarHost)), composer, 3120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}