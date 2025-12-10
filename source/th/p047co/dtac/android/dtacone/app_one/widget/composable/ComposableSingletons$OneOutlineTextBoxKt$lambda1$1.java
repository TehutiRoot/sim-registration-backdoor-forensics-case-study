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
import androidx.compose.p003ui.res.PainterResources_androidKt;
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
import th.p047co.dtac.android.dtacone.R;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneOutlineTextBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOutlineTextBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/ComposableSingletons$OneOutlineTextBoxKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,147:1\n154#2:148\n154#2:149\n73#3,5:150\n78#3:183\n82#3:188\n78#4,11:155\n91#4:187\n456#5,8:166\n464#5,3:180\n467#5,3:184\n4144#6,6:174\n*S KotlinDebug\n*F\n+ 1 OneOutlineTextBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/ComposableSingletons$OneOutlineTextBoxKt$lambda-1$1\n*L\n129#1:148\n130#1:149\n128#1:150,5\n128#1:183\n128#1:188\n128#1:155,11\n128#1:187\n128#1:166,8\n128#1:180,3\n128#1:184,3\n128#1:174,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneOutlineTextBoxKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$OneOutlineTextBoxKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OneOutlineTextBoxKt$lambda1$1 INSTANCE = new ComposableSingletons$OneOutlineTextBoxKt$lambda1$1();

    public ComposableSingletons$OneOutlineTextBoxKt$lambda1$1() {
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
            ComposerKt.traceEventStart(-1736903968, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneOutlineTextBoxKt.lambda-1.<anonymous> (OneOutlineTextBox.kt:126)");
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        float f = 16;
        float m73658constructorimpl = C3641Dp.m73658constructorimpl(f);
        Alignment.Companion companion = Alignment.Companion;
        Arrangement.Vertical m69480spacedByD5KLDUw = arrangement.m69480spacedByD5KLDUw(m73658constructorimpl, companion.getTop());
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier m69529padding3ABfNKs = PaddingKt.m69529padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), C3641Dp.m73658constructorimpl(f));
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69480spacedByD5KLDUw, companion.getStart(), composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OneOutlineTextBoxKt.OneOutlineTextBox("Hello", SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PainterResources_androidKt.painterResource(R.drawable.ic_baseline_search_24, composer, 0), null, "Search", false, composer, 25142, 40);
        OneOutlineTextBoxKt.OneOutlineTextBox("World", SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PainterResources_androidKt.painterResource(R.drawable.ic_one_list, composer, 0), null, "Name", false, composer, 221750, 8);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
