package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
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
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aC\u0010\u001e\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010 \"\u001a\u0010%\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u001a\u0010(\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$\"\u001a\u0010+\u001a\u0004\u0018\u00010)*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010*\"\u0018\u0010-\u001a\u00020\u0004*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Box", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "alignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "boxMeasurePolicy", "(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "boxWidth", "boxHeight", OperatorName.CURVE_TO, "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/LayoutDirection;IILandroidx/compose/ui/Alignment;)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultBoxMeasurePolicy", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEmptyBoxMeasurePolicy", "EmptyBoxMeasurePolicy", "Lsc;", "(Landroidx/compose/ui/layout/Measurable;)Lsc;", "boxChildDataNode", "(Landroidx/compose/ui/layout/Measurable;)Z", "matchesParentSize", "foundation-layout_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,301:1\n78#2,11:302\n91#2:333\n78#2,11:342\n91#2:373\n456#3,8:313\n464#3,6:327\n50#3:334\n49#3:335\n456#3,8:353\n464#3,6:367\n4144#4,6:321\n4144#4,6:361\n1097#5,6:336\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n71#1:302,11\n71#1:333\n200#1:342,11\n200#1:373\n71#1:313,8\n71#1:327,6\n86#1:334\n86#1:335\n200#1:353,8\n200#1:367,6\n71#1:321,6\n200#1:361,6\n86#1:336,6\n*E\n"})
/* loaded from: classes.dex */
public final class BoxKt {

    /* renamed from: a */
    public static final MeasurePolicy f13110a = boxMeasurePolicy(Alignment.Companion.getTopStart(), false);

    /* renamed from: b */
    public static final MeasurePolicy f13111b = BoxKt$EmptyBoxMeasurePolicy$1.f13112a;

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(@Nullable Modifier modifier, @Nullable Alignment alignment, boolean z, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(733328855);
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        MeasurePolicy rememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z, composer, (i >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
        Updater.m71400setimpl(m71393constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: a */
    public static final C13939sc m61411a(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof C13939sc) {
            return (C13939sc) parentData;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m61410b(Measurable measurable) {
        C13939sc m61411a = m61411a(measurable);
        if (m61411a != null) {
            return m61411a.m22568b();
        }
        return false;
    }

    @NotNull
    public static final MeasurePolicy boxMeasurePolicy(@NotNull final Alignment alignment, final boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1
            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
                return AbstractC22344tr0.m1366a(this, intrinsicMeasureScope, list, i);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
                return AbstractC22344tr0.m1365b(this, intrinsicMeasureScope, list, i);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo69194measure3p2s80s(MeasureScope MeasurePolicy, List measurables, long j) {
                long m73618copyZbe2FdA$default;
                int i;
                int i2;
                boolean m61410b;
                boolean m61410b2;
                boolean m61410b3;
                int m73628getMinWidthimpl;
                Placeable mo72811measureBRTryo0;
                int i3;
                Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.m59532q(MeasurePolicy, Constraints.m73628getMinWidthimpl(j), Constraints.m73627getMinHeightimpl(j), null, BoxKt$boxMeasurePolicy$1$measure$1.INSTANCE, 4, null);
                }
                if (z) {
                    m73618copyZbe2FdA$default = j;
                } else {
                    m73618copyZbe2FdA$default = Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                }
                if (measurables.size() == 1) {
                    Measurable measurable = (Measurable) measurables.get(0);
                    m61410b3 = BoxKt.m61410b(measurable);
                    if (!m61410b3) {
                        Placeable mo72811measureBRTryo02 = measurable.mo72811measureBRTryo0(m73618copyZbe2FdA$default);
                        int max = Math.max(Constraints.m73628getMinWidthimpl(j), mo72811measureBRTryo02.getWidth());
                        i3 = Math.max(Constraints.m73627getMinHeightimpl(j), mo72811measureBRTryo02.getHeight());
                        mo72811measureBRTryo0 = mo72811measureBRTryo02;
                        m73628getMinWidthimpl = max;
                    } else {
                        m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
                        int m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
                        mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.Companion.m73634fixedJhjzzOo(Constraints.m73628getMinWidthimpl(j), Constraints.m73627getMinHeightimpl(j)));
                        i3 = m73627getMinHeightimpl;
                    }
                    return MeasureScope.CC.m59532q(MeasurePolicy, m73628getMinWidthimpl, i3, null, new BoxKt$boxMeasurePolicy$1$measure$2(mo72811measureBRTryo0, measurable, MeasurePolicy, m73628getMinWidthimpl, i3, alignment), 4, null);
                }
                Placeable[] placeableArr = new Placeable[measurables.size()];
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = Constraints.m73628getMinWidthimpl(j);
                Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = Constraints.m73627getMinHeightimpl(j);
                int size = measurables.size();
                boolean z2 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    Measurable measurable2 = (Measurable) measurables.get(i4);
                    m61410b2 = BoxKt.m61410b(measurable2);
                    if (!m61410b2) {
                        Placeable mo72811measureBRTryo03 = measurable2.mo72811measureBRTryo0(m73618copyZbe2FdA$default);
                        placeableArr[i4] = mo72811measureBRTryo03;
                        intRef.element = Math.max(intRef.element, mo72811measureBRTryo03.getWidth());
                        intRef2.element = Math.max(intRef2.element, mo72811measureBRTryo03.getHeight());
                    } else {
                        z2 = true;
                    }
                }
                if (z2) {
                    int i5 = intRef.element;
                    if (i5 != Integer.MAX_VALUE) {
                        i = i5;
                    } else {
                        i = 0;
                    }
                    int i6 = intRef2.element;
                    if (i6 != Integer.MAX_VALUE) {
                        i2 = i6;
                    } else {
                        i2 = 0;
                    }
                    long Constraints = ConstraintsKt.Constraints(i, i5, i2, i6);
                    int size2 = measurables.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Measurable measurable3 = (Measurable) measurables.get(i7);
                        m61410b = BoxKt.m61410b(measurable3);
                        if (m61410b) {
                            placeableArr[i7] = measurable3.mo72811measureBRTryo0(Constraints);
                        }
                    }
                }
                return MeasureScope.CC.m59532q(MeasurePolicy, intRef.element, intRef2.element, null, new BoxKt$boxMeasurePolicy$1$measure$5(placeableArr, measurables, MeasurePolicy, intRef, intRef2, alignment), 4, null);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
                return AbstractC22344tr0.m1364c(this, intrinsicMeasureScope, list, i);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
                return AbstractC22344tr0.m1363d(this, intrinsicMeasureScope, list, i);
            }
        };
    }

    /* renamed from: c */
    public static final void m61409c(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        Alignment alignment2;
        Alignment m22569a;
        C13939sc m61411a = m61411a(measurable);
        if (m61411a != null && (m22569a = m61411a.m22569a()) != null) {
            alignment2 = m22569a;
        } else {
            alignment2 = alignment;
        }
        Placeable.PlacementScope.m72850place70tqf50$default(placementScope, placeable, alignment2.mo71407alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i, i2), layoutDirection), 0.0f, 2, null);
    }

    @NotNull
    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return f13110a;
    }

    @NotNull
    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return f13111b;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rememberBoxMeasurePolicy(@NotNull Alignment alignment, boolean z, @Nullable Composer composer, int i) {
        MeasurePolicy measurePolicy;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        composer.startReplaceableGroup(56522820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:79)");
        }
        if (Intrinsics.areEqual(alignment, Alignment.Companion.getTopStart()) && !z) {
            measurePolicy = f13110a;
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(valueOf) | composer.changed(alignment);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = boxMeasurePolicy(alignment, z);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:198)");
            }
            MeasurePolicy measurePolicy = f13111b;
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71393constructorimpl = Updater.m71393constructorimpl(startRestartGroup);
            Updater.m71400setimpl(m71393constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BoxKt$Box$3(modifier, i));
    }
}
