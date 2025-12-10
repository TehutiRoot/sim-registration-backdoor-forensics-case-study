package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
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
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneButtonKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSelectOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOptionsScreen$9\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,620:1\n154#2:621\n154#2:653\n76#3,2:622\n78#3:652\n73#3,5:654\n78#3:687\n82#3:699\n82#3:704\n78#4,11:624\n78#4,11:659\n91#4:698\n91#4:703\n456#5,8:635\n464#5,3:649\n456#5,8:670\n464#5,3:684\n36#5:688\n467#5,3:695\n467#5,3:700\n4144#6,6:643\n4144#6,6:678\n1097#7,6:689\n*S KotlinDebug\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOptionsScreen$9\n*L\n87#1:621\n93#1:653\n86#1:622,2\n86#1:652\n92#1:654,5\n92#1:687\n92#1:699\n86#1:704\n86#1:624,11\n92#1:659,11\n92#1:698\n86#1:703\n86#1:635,8\n86#1:649,3\n92#1:670,8\n92#1:684,3\n99#1:688\n92#1:695,3\n86#1:700,3\n86#1:643,6\n92#1:678,6\n99#1:689,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectOptionsScreen$9 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$SelectOptionsScreen$9 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ List<String> $allowDocumentType;
    final /* synthetic */ boolean $allowManualKYC;
    final /* synthetic */ boolean $allowManualKYC2ndLine;
    final /* synthetic */ int $faceCompareSelectedIndex;
    final /* synthetic */ int $maxAttempt;
    final /* synthetic */ int $ocrSelectedIndex;
    final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYC2ndLineChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYCChange;
    final /* synthetic */ Function1<Integer, Unit> $onFaceCompareTypeChange;
    final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;
    final /* synthetic */ Function0<Unit> $onNextAction;
    final /* synthetic */ Function1<Integer, Unit> $onOcrTypeChange;
    final /* synthetic */ Function1<Integer, Unit> $onThemeChange;
    final /* synthetic */ int $themeSelectedIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$SelectOptionsScreen$9(Function0<Unit> function0, int i, int i2, Function1<? super Integer, Unit> function1, int i3, int i4, List<String> list, Function1<? super Integer, Unit> function12, Function1<? super List<String>, Unit> function13, int i5, Function1<? super Integer, Unit> function14, boolean z, int i6, boolean z2, Function1<? super Boolean, Unit> function15, Function1<? super Integer, Unit> function16, Function1<? super Boolean, Unit> function17) {
        super(2);
        this.$onNextAction = function0;
        this.$$dirty1 = i;
        this.$themeSelectedIndex = i2;
        this.$onThemeChange = function1;
        this.$$dirty = i3;
        this.$ocrSelectedIndex = i4;
        this.$allowDocumentType = list;
        this.$onOcrTypeChange = function12;
        this.$onAllowDocumentTypeChange = function13;
        this.$faceCompareSelectedIndex = i5;
        this.$onFaceCompareTypeChange = function14;
        this.$allowManualKYC = z;
        this.$maxAttempt = i6;
        this.$allowManualKYC2ndLine = z2;
        this.$onAllowManualKYCChange = function15;
        this.$onMaxAttemptChange = function16;
        this.$onAllowManualKYC2ndLineChange = function17;
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
            ComposerKt.traceEventStart(-1250884975, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreen.<anonymous> (SelectOptionsScreen.kt:84)");
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        float f = 16;
        Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(f));
        Alignment.Companion companion = Alignment.Companion;
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        Function0<Unit> function0 = this.$onNextAction;
        int i2 = this.$$dirty1;
        int i3 = this.$themeSelectedIndex;
        Function1<Integer, Unit> function1 = this.$onThemeChange;
        int i4 = this.$$dirty;
        int i5 = this.$ocrSelectedIndex;
        List<String> list = this.$allowDocumentType;
        Function1<Integer, Unit> function12 = this.$onOcrTypeChange;
        Function1<List<String>, Unit> function13 = this.$onAllowDocumentTypeChange;
        int i6 = this.$faceCompareSelectedIndex;
        Function1<Integer, Unit> function14 = this.$onFaceCompareTypeChange;
        boolean z = this.$allowManualKYC;
        int i7 = this.$maxAttempt;
        boolean z2 = this.$allowManualKYC2ndLine;
        Function1<Boolean, Unit> function15 = this.$onAllowManualKYCChange;
        Function1<Integer, Unit> function16 = this.$onMaxAttemptChange;
        Function1<Boolean, Unit> function17 = this.$onAllowManualKYC2ndLineChange;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_4, centerHorizontally, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Arrangement.HorizontalOrVertical m69662spacedBy0680j_42 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(f));
        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(AbstractC1256Rt.m66581a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_42, companion.getStart(), composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
        Updater.m71584setimpl(m71577constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SelectOptionsScreenKt$SelectOptionsScreen$9$1$1$1$1(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SelectOptionsScreenKt.m3405k(i3, (Function1) rememberedValue, composer, i4 & 14);
        int i8 = i4 >> 18;
        SelectOptionsScreenKt.m3409g(i5, list, function12, function13, composer, ((i4 >> 3) & 14) | 64 | (i8 & 896) | (i8 & 7168), 0);
        SelectOptionsScreenKt.m3410f(i6, function14, composer, ((i4 >> 9) & 14) | ((i2 << 3) & 112));
        int i9 = i2 << 6;
        SelectOptionsScreenKt.m3415a(z, i7, z2, function15, function16, function17, composer, ((i4 >> 12) & 1022) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        OneButtonKt.OneButton(function0, StringResources_androidKt.stringResource(R.string.next, composer, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composer, ((i2 >> 12) & 14) | 384, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}