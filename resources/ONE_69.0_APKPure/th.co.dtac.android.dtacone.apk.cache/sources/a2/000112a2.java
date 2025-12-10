package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;

@Metadata(m29143d1 = {"\u0000`\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aC\u0010\n\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\n\u0010\u0010\u001a\u0097\u0001\u0010\"\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0013\b\u0002\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\"\u0010#\u001a=\u0010$\u001a\u00020\u00062\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0006H\u0003¢\u0006\u0004\b&\u0010'\"$\u0010-\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, m29142d2 = {"", "", "labels", "", "selectedIndex", "Lkotlin/Function1;", "", "onSelectedChange", "Landroidx/compose/ui/Modifier;", "modifier", "OneSegmentedButtonRow", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonRowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "Landroidx/compose/ui/graphics/Shape;", "shape", "enabled", "Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "colors", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "icon", "label", "SegmentedButton", "(Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonRowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", "Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "getDefaultSegmentedButtonColorsCached", "()Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "setDefaultSegmentedButtonColorsCached", "(Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;)V", "defaultSegmentedButtonColorsCached", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneSegmentedButtonRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneSegmentedButtonRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,643:1\n154#2:644\n154#2:645\n154#2:679\n154#2:680\n154#2:681\n154#2:682\n154#2:697\n154#2:698\n77#3,2:646\n79#3:676\n83#3:696\n77#3,2:699\n79#3:729\n83#3:741\n78#4,11:648\n91#4:695\n78#4,11:701\n91#4:740\n78#4,11:754\n91#4:786\n456#5,8:659\n464#5,3:673\n50#5:683\n49#5:684\n467#5,3:692\n456#5,8:712\n464#5,3:726\n25#5:730\n467#5,3:737\n25#5:742\n456#5,8:765\n464#5,3:779\n467#5,3:783\n4144#6,6:667\n4144#6,6:720\n4144#6,6:773\n1864#7,2:677\n1866#7:691\n1097#8,6:685\n1097#8,6:731\n1097#8,6:743\n67#9,5:749\n72#9:782\n76#9:787\n*S KotlinDebug\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneSegmentedButtonRowKt\n*L\n90#1:644\n93#1:645\n106#1:679\n107#1:680\n117#1:681\n118#1:682\n146#1:697\n148#1:698\n87#1:646,2\n87#1:676\n87#1:696\n142#1:699,2\n142#1:729\n142#1:741\n87#1:648,11\n87#1:695\n142#1:701,11\n142#1:740\n209#1:754,11\n209#1:786\n87#1:659,8\n87#1:673,3\n115#1:683\n115#1:684\n87#1:692,3\n142#1:712,8\n142#1:726,3\n151#1:730\n142#1:737,3\n174#1:742\n209#1:765,8\n209#1:779,3\n209#1:783,3\n87#1:667,6\n142#1:720,6\n209#1:773,6\n96#1:677,2\n96#1:691\n115#1:685,6\n151#1:731,6\n174#1:743,6\n209#1:749,5\n209#1:782\n209#1:787\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRowKt */
/* loaded from: classes7.dex */
public final class OneSegmentedButtonRowKt {

    /* renamed from: a */
    public static SegmentedButtonColors f82978a;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OneSegmentedButtonRow(@NotNull List<String> labels, int i, @NotNull Function1<? super Integer, Unit> onSelectedChange, @Nullable Modifier modifier, @Nullable Composer composer, int i2, int i3) {
        long colorResource;
        long m71954getTransparent0d7_KjU;
        Shape rectangleShape;
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(onSelectedChange, "onSelectedChange");
        Composer startRestartGroup = composer.startRestartGroup(-2118056321);
        Modifier.Companion companion = (i3 & 8) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2118056321, i2, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRow (OneSegmentedButtonRow.kt:80)");
        }
        Modifier m69733defaultMinSizeVpY3zN4$default = SizeKt.m69733defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(companion), 0.0f, C3623Dp.m73842constructorimpl(20), 1, null);
        IntrinsicSize intrinsicSize = IntrinsicSize.Min;
        Modifier width = IntrinsicKt.width(IntrinsicKt.height(m69733defaultMinSizeVpY3zN4$default, intrinsicSize), intrinsicSize);
        Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = Arrangement.INSTANCE.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(-1));
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69662spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int i4 = 0;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(width);
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
        startRestartGroup.startReplaceableGroup(-1036628376);
        int i5 = 0;
        for (Object obj : labels) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if (i5 == i) {
                startRestartGroup.startReplaceableGroup(1573658519);
                colorResource = ColorResources_androidKt.colorResource(R.color.white, startRestartGroup, i4);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(1573658572);
                colorResource = ColorResources_androidKt.colorResource(R.color.red4, startRestartGroup, i4);
                startRestartGroup.endReplaceableGroup();
            }
            long j = colorResource;
            startRestartGroup.startReplaceableGroup(2690159);
            if (i5 == i) {
                m71954getTransparent0d7_KjU = ColorResources_androidKt.colorResource(R.color.red4, startRestartGroup, i4);
            } else {
                m71954getTransparent0d7_KjU = Color.Companion.m71954getTransparent0d7_KjU();
            }
            startRestartGroup.endReplaceableGroup();
            if (i5 == 0) {
                float f = 4;
                float f2 = i4;
                rectangleShape = RoundedCornerShapeKt.m69896RoundedCornerShapea9UjIt4(C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f2), C3623Dp.m73842constructorimpl(f2), C3623Dp.m73842constructorimpl(f));
            } else if (i5 == labels.size() - 1) {
                float f3 = 0;
                float f4 = 4;
                rectangleShape = RoundedCornerShapeKt.m69896RoundedCornerShapea9UjIt4(C3623Dp.m73842constructorimpl(f3), C3623Dp.m73842constructorimpl(f4), C3623Dp.m73842constructorimpl(f4), C3623Dp.m73842constructorimpl(f3));
            } else {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            }
            Shape shape = rectangleShape;
            int i7 = i5;
            Composer composer2 = startRestartGroup;
            ButtonColors m70394buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m70394buttonColorsro_MJ88(m71954getTransparent0d7_KjU, j, 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 12);
            BorderStroke m69525BorderStrokecXLIe8U = BorderStrokeKt.m69525BorderStrokecXLIe8U(C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.red4, composer2, 0));
            PaddingValues m69706PaddingValues0680j_4 = PaddingKt.m69706PaddingValues0680j_4(C3623Dp.m73842constructorimpl(0));
            Modifier m68554a = AbstractC17608Ez1.m68554a(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            Integer valueOf = Integer.valueOf(i7);
            composer2.startReplaceableGroup(511388516);
            boolean changed = composer2.changed(valueOf) | composer2.changed(onSelectedChange);
            Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OneSegmentedButtonRowKt$OneSegmentedButtonRow$1$1$1$1(onSelectedChange, i7);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceableGroup();
            ButtonKt.Button((Function0) rememberedValue, m68554a, false, shape, m70394buttonColorsro_MJ88, null, m69525BorderStrokecXLIe8U, m69706PaddingValues0680j_4, null, ComposableLambdaKt.composableLambda(composer2, 1922619321, true, new OneSegmentedButtonRowKt$OneSegmentedButtonRow$1$1$2(str, j)), composer2, 817889280, 292);
            startRestartGroup = composer2;
            i5 = i6;
            i4 = 0;
        }
        Composer composer3 = startRestartGroup;
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OneSegmentedButtonRowKt$OneSegmentedButtonRow$2(labels, i, onSelectedChange, companion, i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SegmentedButton(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonRowScope r31, boolean r32, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r33, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.graphics.Shape r34, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r35, boolean r36, @org.jetbrains.annotations.Nullable th.p047co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonColors r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r38, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRowKt.SegmentedButton(th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonRowScope, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, boolean, th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final void m19986a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1855013587);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855013587, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentRowPreview2 (OneSegmentedButtonRow.kt:632)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneSegmentedButtonRowKt.INSTANCE.m75128getLambda2$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneSegmentedButtonRowKt$SegmentRowPreview2$1(i));
        }
    }

    /* renamed from: b */
    public static final void m19985b(Function2 function2, Function2 function22, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(469597386);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function22)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(469597386, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonContent (OneSegmentedButtonRow.kt:203)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier padding = PaddingKt.padding(Modifier.Companion, paddingValues);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(16);
            long sp2 = TextUnitKt.getSp(24);
            TextKt.ProvideTextStyle(new TextStyle(0L, sp, FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), ComposableLambdaKt.composableLambda(startRestartGroup, 1582737971, true, new OneSegmentedButtonRowKt$SegmentedButtonContent$1$1(function2, function22, AnimationSpecKt.tween$default(300, 0, null, 6, null))), startRestartGroup, 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneSegmentedButtonRowKt$SegmentedButtonContent$2(function2, function22, paddingValues, i));
        }
    }

    @Nullable
    public static final SegmentedButtonColors getDefaultSegmentedButtonColorsCached() {
        return f82978a;
    }

    public static final void setDefaultSegmentedButtonColorsCached(@Nullable SegmentedButtonColors segmentedButtonColors) {
        f82978a = segmentedButtonColors;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OneSegmentedButtonRow(@Nullable Modifier modifier, @NotNull Function3<? super SegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1184399298);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184399298, i3, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRow (OneSegmentedButtonRow.kt:137)");
            }
            Modifier width = IntrinsicKt.width(SizeKt.m69733defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(modifier), 0.0f, C3623Dp.m73842constructorimpl(20), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = Arrangement.INSTANCE.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(-1));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69662spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(width);
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
            Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C21621pG1(rowScopeInstance);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            content.invoke((C21621pG1) rememberedValue, startRestartGroup, Integer.valueOf((i3 & 112) | 6));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OneSegmentedButtonRowKt$OneSegmentedButtonRow$4(modifier, content, i, i2));
    }
}