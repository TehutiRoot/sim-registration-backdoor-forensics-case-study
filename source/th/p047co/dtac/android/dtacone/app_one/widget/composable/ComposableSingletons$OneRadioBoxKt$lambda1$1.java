package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
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
import androidx.compose.runtime.Updater;
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

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneRadioBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRadioBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/ComposableSingletons$OneRadioBoxKt$lambda-1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,98:1\n71#2,7:99\n78#2:134\n82#2:160\n78#3,11:106\n91#3:159\n456#4,8:117\n464#4,3:131\n25#4:135\n36#4:142\n36#4:149\n467#4,3:156\n4144#5,6:125\n1097#6,6:136\n1097#6,6:143\n1097#6,6:150\n81#7:161\n107#7,2:162\n*S KotlinDebug\n*F\n+ 1 OneRadioBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/ComposableSingletons$OneRadioBoxKt$lambda-1$1\n*L\n91#1:99,7\n91#1:134\n91#1:160\n91#1:106,11\n91#1:159\n91#1:117,8\n91#1:131,3\n92#1:135\n93#1:142\n94#1:149\n91#1:156,3\n91#1:125,6\n92#1:136,6\n93#1:143,6\n94#1:150,6\n92#1:161\n92#1:162,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneRadioBoxKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$OneRadioBoxKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OneRadioBoxKt$lambda1$1 INSTANCE = new ComposableSingletons$OneRadioBoxKt$lambda1$1();

    public ComposableSingletons$OneRadioBoxKt$lambda1$1() {
        super(2);
    }

    private static final boolean invoke$lambda$5$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
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
            ComposerKt.traceEventStart(1764576877, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneRadioBoxKt.lambda-1.<anonymous> (OneRadioBox.kt:89)");
        }
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.Companion;
        if (rememberedValue == companion3.getEmpty()) {
            rememberedValue = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        boolean invoke$lambda$5$lambda$1 = invoke$lambda$5$lambda$1(mutableState);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion3.getEmpty()) {
            rememberedValue2 = new ComposableSingletons$OneRadioBoxKt$lambda1$1$1$1$1(mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        OneRadioBoxKt.m74947OneRadioButton7dS3OtE("Radio Button Unchecked", invoke$lambda$5$lambda$1, (Function1) rememberedValue2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0L, 0L, 0L, null, 0.0f, composer, 3078, 0, 2032);
        boolean z = !invoke$lambda$5$lambda$1(mutableState);
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(mutableState);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion3.getEmpty()) {
            rememberedValue3 = new ComposableSingletons$OneRadioBoxKt$lambda1$1$1$2$1(mutableState);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        OneRadioBoxKt.m74947OneRadioButton7dS3OtE("Radio Button Checked", z, (Function1) rememberedValue3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0L, 0L, 0L, null, 0.0f, composer, 3078, 0, 2032);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
