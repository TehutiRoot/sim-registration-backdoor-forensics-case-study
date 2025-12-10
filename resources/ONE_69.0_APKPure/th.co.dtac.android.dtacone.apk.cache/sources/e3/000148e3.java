package th.p047co.dtac.android.dtacone.view.compose.upPassDemo.screen.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.LabelValue;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m29142d2 = {"LabelValueRow", "", "item", "Lth/co/dtac/android/dtacone/view/compose/upPassDemo/model/LabelValue;", "(Lth/co/dtac/android/dtacone/view/compose/upPassDemo/model/LabelValue;Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLabelValueRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelValueRow.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/component/LabelValueRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,43:1\n154#2:44\n154#2:45\n73#3,6:46\n79#3:80\n83#3:85\n78#4,11:52\n91#4:84\n456#5,8:63\n464#5,3:77\n467#5,3:81\n4144#6,6:71\n*S KotlinDebug\n*F\n+ 1 LabelValueRow.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/component/LabelValueRowKt\n*L\n21#1:44\n28#1:45\n24#1:46,6\n24#1:80\n24#1:85\n24#1:52,11\n24#1:84\n24#1:63,8\n24#1:77,3\n24#1:81,3\n24#1:71,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.component.LabelValueRowKt */
/* loaded from: classes10.dex */
public final class LabelValueRowKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LabelValueRow(@NotNull LabelValue item, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-2123582235);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(item)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2123582235, i, -1, "th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.component.LabelValueRow (LabelValueRow.kt:15)");
            }
            if (Intrinsics.areEqual(item.getLabel(), HelpFormatter.DEFAULT_OPT_PREFIX)) {
                startRestartGroup.startReplaceableGroup(459815599);
                DividerKt.m70554Divider9IZ8Weo(PaddingKt.m69713padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(8)), 0.0f, 0L, startRestartGroup, 6, 6);
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceableGroup(459815734);
                Alignment.Vertical top = Alignment.Companion.getTop();
                Modifier.Companion companion = Modifier.Companion;
                Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(8));
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
                Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                String label = item.getLabel();
                composer2 = startRestartGroup;
                TextKt.m70882Text4IGK_g(label + " :", AbstractC17608Ez1.m68554a(rowScopeInstance, companion, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (int) ProfileVerifier.CompilationStatus.f36619xf2722a21, 0, 131036);
                String value = item.getValue();
                if (value == null) {
                    value = HelpFormatter.DEFAULT_OPT_PREFIX;
                }
                TextKt.m70882Text4IGK_g(value, AbstractC17608Ez1.m68554a(rowScopeInstance, companion, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73733getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 130556);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LabelValueRowKt$LabelValueRow$2(item, i));
        }
    }
}