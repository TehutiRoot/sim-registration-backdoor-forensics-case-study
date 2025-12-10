package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.widget.compose.signature.viewModel.PathState;
import th.p047co.dtac.android.dtacone.widget.compose.signature.viewModel.SignaturePadViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nComposeSignatureCustom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeSignatureCustom.kt\nth/co/dtac/android/dtacone/widget/compose/signature/ComposeSignatureCustomKt$ComposeSignatureCustom$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,284:1\n71#2,7:285\n78#2:320\n82#2:378\n78#3,11:292\n78#3,11:323\n91#3:372\n91#3:377\n456#4,8:303\n464#4,3:317\n456#4,8:334\n464#4,3:348\n50#4:352\n49#4:353\n83#4,3:360\n467#4,3:369\n467#4,3:374\n4144#5,6:311\n4144#5,6:342\n77#6,2:321\n79#6:351\n83#6:373\n1097#7,6:354\n1097#7,6:363\n*S KotlinDebug\n*F\n+ 1 ComposeSignatureCustom.kt\nth/co/dtac/android/dtacone/widget/compose/signature/ComposeSignatureCustomKt$ComposeSignatureCustom$2\n*L\n96#1:285,7\n96#1:320\n96#1:378\n96#1:292,11\n121#1:323,11\n121#1:372\n96#1:377\n96#1:303,8\n96#1:317,3\n121#1:334,8\n121#1:348,3\n127#1:352\n127#1:353\n131#1:360,3\n121#1:369,3\n96#1:374,3\n96#1:311,6\n121#1:342,6\n121#1:321,2\n121#1:351\n121#1:373\n127#1:354,6\n131#1:363,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$ComposeSignatureCustom$2 */
/* loaded from: classes9.dex */
public final class ComposeSignatureCustomKt$ComposeSignatureCustom$2 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> $clearComponent;
    final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> $completeComponent;
    final /* synthetic */ MutableState<Float> $drawBrush;
    final /* synthetic */ MutableState<Color> $drawColor;
    final /* synthetic */ boolean $hasAlpha;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClear;
    final /* synthetic */ Function1<Bitmap, Unit> $onComplete;
    final /* synthetic */ State<List<PathState>> $path;
    final /* synthetic */ long $signaturePadColor;
    final /* synthetic */ float $signaturePadHeight;
    final /* synthetic */ SignaturePadViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposeSignatureCustomKt$ComposeSignatureCustom$2(SignaturePadViewModel signaturePadViewModel, MutableState<Color> mutableState, MutableState<Float> mutableState2, Modifier modifier, State<? extends List<PathState>> state, float f, long j, int i, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, int i2, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function32, Function1<? super Bitmap, Unit> function1, boolean z) {
        super(3);
        this.$viewModel = signaturePadViewModel;
        this.$drawColor = mutableState;
        this.$drawBrush = mutableState2;
        this.$modifier = modifier;
        this.$path = state;
        this.$signaturePadHeight = f;
        this.$signaturePadColor = j;
        this.$$dirty = i;
        this.$clearComponent = function3;
        this.$onClear = function0;
        this.$$dirty1 = i2;
        this.$completeComponent = function32;
        this.$onComplete = function1;
        this.$hasAlpha = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(519722061, i, -1, "th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustom.<anonymous> (ComposeSignatureCustom.kt:94)");
        }
        SignaturePadViewModel signaturePadViewModel = this.$viewModel;
        MutableState<Color> mutableState = this.$drawColor;
        MutableState<Float> mutableState2 = this.$drawBrush;
        Modifier modifier = this.$modifier;
        State<List<PathState>> state = this.$path;
        float f = this.$signaturePadHeight;
        long j = this.$signaturePadColor;
        int i2 = this.$$dirty;
        Function3<Function0<Unit>, Composer, Integer, Unit> function3 = this.$clearComponent;
        Function0<Unit> function0 = this.$onClear;
        Function3<Function0<Unit>, Composer, Integer, Unit> function32 = this.$completeComponent;
        Function1<Bitmap, Unit> function1 = this.$onComplete;
        boolean z = this.$hasAlpha;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        signaturePadViewModel.setPathState(new PathState(AndroidPath_androidKt.Path(), mutableState.getValue().m71929unboximpl(), mutableState2.getValue().floatValue(), null));
        Function0<Bitmap> captureBitmap = ComposeSignatureCustomKt.captureBitmap(ComposableLambdaKt.composableLambda(composer, -961015911, true, new C16763xc5487b26(mutableState, mutableState2, state, modifier, f, j, signaturePadViewModel, i2)), composer, 6);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl2 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(function0) | composer.changed(signaturePadViewModel);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ComposeSignatureCustomKt$ComposeSignatureCustom$2$1$1$1$1(function0, signaturePadViewModel);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        function3.invoke(rememberedValue, composer, Integer.valueOf((i2 >> 21) & 112));
        Object[] objArr = {signaturePadViewModel, function1, captureBitmap, Boolean.valueOf(z)};
        composer.startReplaceableGroup(-568225417);
        boolean z2 = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z2 |= composer.changed(objArr[i3]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ComposeSignatureCustomKt$ComposeSignatureCustom$2$1$1$2$1(signaturePadViewModel, function1, captureBitmap, z);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        function32.invoke(rememberedValue2, composer, Integer.valueOf((i2 >> 18) & 112));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}