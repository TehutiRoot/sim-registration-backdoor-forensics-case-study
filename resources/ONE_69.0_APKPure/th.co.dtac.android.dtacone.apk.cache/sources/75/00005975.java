package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.Constraints;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ AnchorChangeHandler<SheetValue> $anchorChangeHandler;
    final /* synthetic */ Function0<Unit> $animateToDismiss;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $dragHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ Function1<Float, Unit> $settleToDismiss;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ float $tonalElevation;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,571:1\n36#2:572\n36#2:579\n36#2:586\n36#2:593\n1114#3,6:573\n1114#3,6:580\n1114#3,6:587\n1114#3,6:594\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1\n*L\n191#1:572\n192#1:579\n201#1:586\n213#1:593\n191#1:573,6\n192#1:580,6\n201#1:587,6\n213#1:594,6\n*E\n"})
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1 */
    /* loaded from: classes2.dex */
    public static final class C32991 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ AnchorChangeHandler<SheetValue> $anchorChangeHandler;
        final /* synthetic */ Function0<Unit> $animateToDismiss;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<Composer, Integer, Unit> $dragHandle;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ long $scrimColor;
        final /* synthetic */ Function1<Float, Unit> $settleToDismiss;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ SheetState $sheetState;
        final /* synthetic */ float $tonalElevation;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,571:1\n74#2,6:572\n80#2:604\n84#2:647\n75#3:578\n76#3,11:580\n75#3:611\n76#3,11:613\n89#3:641\n89#3:646\n76#4:579\n76#4:612\n460#5,13:591\n460#5,13:624\n473#5,3:638\n473#5,3:643\n67#6,6:605\n73#6:637\n77#6:642\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5\n*L\n222#1:572,6\n222#1:604\n222#1:647\n222#1:578\n222#1:580,11\n228#1:611\n228#1:613,11\n228#1:641\n222#1:646\n222#1:579\n228#1:612\n222#1:591,13\n228#1:624,13\n228#1:638,3\n222#1:643,3\n228#1:605,6\n228#1:637\n228#1:642\n*E\n"})
        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5 */
        /* loaded from: classes2.dex */
        public static final class C33005 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ Function0<Unit> $animateToDismiss;
            final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
            final /* synthetic */ Function2<Composer, Integer, Unit> $dragHandle;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ SheetState $sheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C33005(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i, SheetState sheetState, Function0<Unit> function0, CoroutineScope coroutineScope, int i2) {
                super(2);
                this.$dragHandle = function2;
                this.$content = function3;
                this.$$dirty1 = i;
                this.$sheetState = sheetState;
                this.$animateToDismiss = function0;
                this.$scope = coroutineScope;
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
                int i2;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1371274015, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:220)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Function2<Composer, Integer, Unit> function2 = this.$dragHandle;
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$content;
                int i3 = this.$$dirty1;
                SheetState sheetState = this.$sheetState;
                Function0<Unit> function0 = this.$animateToDismiss;
                CoroutineScope coroutineScope = this.$scope;
                int i4 = this.$$dirty;
                composer.startReplaceableGroup(-483455358);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
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
                Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
                Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl, density, companion3.getSetDensity());
                Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-11289811);
                if (function2 != null) {
                    Strings.Companion companion4 = Strings.Companion;
                    String m70803getStringNWtq28 = Strings_androidKt.m70803getStringNWtq28(companion4.m70744getBottomSheetPartialExpandDescriptionadMyvUU(), composer, 6);
                    i2 = 6;
                    Modifier semantics = SemanticsModifierKt.semantics(columnScopeInstance.align(companion, companion2.getCenterHorizontally()), true, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5$1$1(sheetState, Strings_androidKt.m70803getStringNWtq28(companion4.m70740getBottomSheetDismissDescriptionadMyvUU(), composer, 6), Strings_androidKt.m70803getStringNWtq28(companion4.m70742getBottomSheetExpandDescriptionadMyvUU(), composer, 6), m70803getStringNWtq28, function0, coroutineScope));
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(semantics);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    composer.disableReusing();
                    Composer m71577constructorimpl2 = Updater.m71577constructorimpl(composer);
                    Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m71584setimpl(m71577constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m71584setimpl(m71577constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    Updater.m71584setimpl(m71577constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                    composer.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composer, Integer.valueOf((i4 >> 24) & 14));
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                } else {
                    i2 = 6;
                }
                composer.endReplaceableGroup();
                function3.invoke(columnScopeInstance, composer, Integer.valueOf(i2 | ((i3 << 3) & 112)));
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
        public C32991(long j, Function0<Unit> function0, SheetState sheetState, int i, Modifier modifier, AnchorChangeHandler<SheetValue> anchorChangeHandler, Function1<? super Float, Unit> function1, Shape shape, long j2, long j3, float f, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, CoroutineScope coroutineScope) {
            super(3);
            this.$scrimColor = j;
            this.$animateToDismiss = function0;
            this.$sheetState = sheetState;
            this.$$dirty = i;
            this.$modifier = modifier;
            this.$anchorChangeHandler = anchorChangeHandler;
            this.$settleToDismiss = function1;
            this.$shape = shape;
            this.$containerColor = j2;
            this.$contentColor = j3;
            this.$tonalElevation = f;
            this.$dragHandle = function2;
            this.$content = function3;
            this.$$dirty1 = i2;
            this.$scope = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i) {
            int i2;
            Modifier m60563e;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 14) == 0) {
                i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(574030426, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:177)");
            }
            int m73809getMaxHeightimpl = Constraints.m73809getMaxHeightimpl(BoxWithConstraints.mo69677getConstraintsmsEJaDk());
            ModalBottomSheet_androidKt.m60565c(this.$scrimColor, this.$animateToDismiss, this.$sheetState.getTargetValue() != SheetValue.Hidden, composer, (this.$$dirty >> 21) & 14);
            String m70803getStringNWtq28 = Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70743getBottomSheetPaneTitleadMyvUU(), composer, 6);
            Modifier align = BoxWithConstraints.align(SizeKt.fillMaxWidth$default(SizeKt.m69755widthInVpY3zN4$default(this.$modifier, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, null), 0.0f, 1, null), Alignment.Companion.getTopCenter());
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(m70803getStringNWtq28);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1$1(m70803getStringNWtq28);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(align, false, (Function1) rememberedValue, 1, null);
            SheetState sheetState = this.$sheetState;
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(sheetState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2$1(sheetState);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Modifier offset = OffsetKt.offset(semantics$default, (Function1) rememberedValue2);
            SheetState sheetState2 = this.$sheetState;
            Function1<Float, Unit> function1 = this.$settleToDismiss;
            composer.startReplaceableGroup(1157296644);
            boolean changed3 = composer.changed(sheetState2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, Orientation.Vertical, function1);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(offset, (NestedScrollConnection) rememberedValue3, null, 2, null);
            SheetState sheetState3 = this.$sheetState;
            AnchorChangeHandler<SheetValue> anchorChangeHandler = this.$anchorChangeHandler;
            float f = m73809getMaxHeightimpl;
            Function1<Float, Unit> function12 = this.$settleToDismiss;
            composer.startReplaceableGroup(1157296644);
            boolean changed4 = composer.changed(function12);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1(function12);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            m60563e = ModalBottomSheet_androidKt.m60563e(nestedScroll$default, sheetState3, anchorChangeHandler, f, (Function2) rememberedValue4);
            Shape shape = this.$shape;
            long j = this.$containerColor;
            long j2 = this.$contentColor;
            float f2 = this.$tonalElevation;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1371274015, true, new C33005(this.$dragHandle, this.$content, this.$$dirty1, this.$sheetState, this.$animateToDismiss, this.$scope, this.$$dirty));
            int i3 = this.$$dirty;
            SurfaceKt.m70812SurfaceT9BRK9s(m60563e, shape, j, j2, f2, 0.0f, null, composableLambda, composer, ((i3 >> 6) & 112) | 12582912 | ((i3 >> 6) & 896) | ((i3 >> 6) & 7168) | ((i3 >> 6) & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2(long j, Function0<Unit> function0, SheetState sheetState, int i, Modifier modifier, AnchorChangeHandler<SheetValue> anchorChangeHandler, Function1<? super Float, Unit> function1, Shape shape, long j2, long j3, float f, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, CoroutineScope coroutineScope) {
        super(2);
        this.$scrimColor = j;
        this.$animateToDismiss = function0;
        this.$sheetState = sheetState;
        this.$$dirty = i;
        this.$modifier = modifier;
        this.$anchorChangeHandler = anchorChangeHandler;
        this.$settleToDismiss = function1;
        this.$shape = shape;
        this.$containerColor = j2;
        this.$contentColor = j3;
        this.$tonalElevation = f;
        this.$dragHandle = function2;
        this.$content = function3;
        this.$$dirty1 = i2;
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
            ComposerKt.traceEventStart(1424497392, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:176)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer, 574030426, true, new C32991(this.$scrimColor, this.$animateToDismiss, this.$sheetState, this.$$dirty, this.$modifier, this.$anchorChangeHandler, this.$settleToDismiss, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$dragHandle, this.$content, this.$$dirty1, this.$scope)), composer, 3078, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}