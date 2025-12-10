package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneButton.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/ComposableSingletons$OneButtonKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,159:1\n154#2:160\n154#2:161\n73#3,5:162\n78#3:195\n82#3:200\n78#4,11:167\n91#4:199\n456#5,8:178\n464#5,3:192\n467#5,3:196\n4144#6,6:186\n*S KotlinDebug\n*F\n+ 1 OneButton.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/ComposableSingletons$OneButtonKt$lambda-1$1\n*L\n139#1:160\n142#1:161\n138#1:162,5\n138#1:195\n138#1:200\n138#1:167,11\n138#1:199\n138#1:178,8\n138#1:192,3\n138#1:196,3\n138#1:186,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneButtonKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$OneButtonKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OneButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$OneButtonKt$lambda1$1();

    public ComposableSingletons$OneButtonKt$lambda1$1() {
        super(2);
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
            ComposerKt.traceEventStart(1392473636, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneButtonKt.lambda-1.<anonymous> (OneButton.kt:135)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        float f = 16;
        Arrangement.HorizontalOrVertical m69478spacedBy0680j_4 = Arrangement.INSTANCE.m69478spacedBy0680j_4(C3641Dp.m73658constructorimpl(f));
        Modifier m69529padding3ABfNKs = PaddingKt.m69529padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), C3641Dp.m73658constructorimpl(f));
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69478spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69529padding3ABfNKs);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
        Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OneButtonKt.OneButton(ComposableSingletons$OneButtonKt$lambda1$1$1$1.INSTANCE, "Primary Button", fillMaxWidth$default, true, composer, 3510, 0);
        OneButtonKt.OneButtonGray(ComposableSingletons$OneButtonKt$lambda1$1$1$2.INSTANCE, "Gray Button", fillMaxWidth$default, composer, 438, 0);
        OneButtonKt.OneButtonOutline(ComposableSingletons$OneButtonKt$lambda1$1$1$3.INSTANCE, "Outline Button", fillMaxWidth$default, true, composer, 3510, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
