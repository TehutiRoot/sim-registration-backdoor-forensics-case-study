package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,221:1\n74#2,6:222\n80#2:254\n84#2:297\n75#3:228\n76#3,11:230\n75#3:261\n76#3,11:263\n89#3:291\n89#3:296\n76#4:229\n76#4:262\n460#5,13:241\n460#5,13:274\n473#5,3:288\n473#5,3:293\n67#6,6:255\n73#6:287\n77#6:292\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n*L\n58#1:222,6\n58#1:254\n58#1:297\n58#1:228\n58#1:230,11\n109#1:261\n109#1:263,11\n109#1:291\n58#1:296\n58#1:229\n109#1:262\n58#1:241,13\n109#1:274,13\n109#1:288,3\n58#1:293,3\n109#1:255,6\n109#1:287\n109#1:292\n*E\n"})
/* loaded from: classes2.dex */
public final class AlertDialogKt$AlertDialogContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $buttons;
    final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ long $titleContentColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogKt$AlertDialogContent$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, long j, int i, long j2, long j3, long j4, Function2<? super Composer, ? super Integer, Unit> function24) {
        super(2);
        this.$icon = function2;
        this.$title = function22;
        this.$text = function23;
        this.$iconContentColor = j;
        this.$$dirty = i;
        this.$titleContentColor = j2;
        this.$textContentColor = j3;
        this.$buttonContentColor = j4;
        this.$buttons = function24;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        PaddingValues paddingValues;
        int i2;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126308228, i, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:56)");
        }
        Modifier.Companion companion = Modifier.Companion;
        paddingValues = AlertDialogKt.f25528c;
        Modifier padding = PaddingKt.padding(companion, paddingValues);
        Function2<Composer, Integer, Unit> function2 = this.$icon;
        Function2<Composer, Integer, Unit> function22 = this.$title;
        Function2<Composer, Integer, Unit> function23 = this.$text;
        long j = this.$iconContentColor;
        int i3 = this.$$dirty;
        long j2 = this.$titleContentColor;
        long j3 = this.$textContentColor;
        long j4 = this.$buttonContentColor;
        Function2<Composer, Integer, Unit> function24 = this.$buttons;
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
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
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
        Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, density, companion3.getSetDensity());
        Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(76440732);
        if (function2 == null) {
            i2 = 1;
        } else {
            i2 = 1;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71725boximpl(j))}, ComposableLambdaKt.composableLambda(composer, 934657765, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(columnScopeInstance, function2, i3)), composer, 56);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(76441127);
        if (function22 != null) {
            ProvidedValue[] providedValueArr = new ProvidedValue[i2];
            providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m71725boximpl(j2));
            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer, 1845262876, i2, new AlertDialogKt$AlertDialogContent$1$1$2$1(columnScopeInstance, function2, function22, i3)), composer, 56);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(76442077);
        if (function23 != null) {
            ProvidedValue[] providedValueArr2 = new ProvidedValue[i2];
            providedValueArr2[0] = ContentColorKt.getLocalContentColor().provides(Color.m71725boximpl(j3));
            CompositionLocalKt.CompositionLocalProvider(providedValueArr2, ComposableLambdaKt.composableLambda(composer, 613970333, i2, new AlertDialogKt$AlertDialogContent$1$1$3$1(columnScopeInstance, function23, i3)), composer, 56);
        }
        composer.endReplaceableGroup();
        Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(align);
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
        Composer m71393constructorimpl2 = Updater.m71393constructorimpl(composer);
        Updater.m71400setimpl(m71393constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl2, density2, companion3.getSetDensity());
        Updater.m71400setimpl(m71393constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m71400setimpl(m71393constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71725boximpl(j4))}, ComposableLambdaKt.composableLambda(composer, -433542216, true, new AlertDialogKt$AlertDialogContent$1$1$4$1(function24, i3)), composer, 56);
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
