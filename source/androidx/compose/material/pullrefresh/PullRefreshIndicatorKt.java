package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ShadowKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathFillType;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aA\u0010\u001d\u001a\u00020\n*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u0017\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010 \"\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#\"\u0017\u0010&\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010 \"\u0017\u0010(\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010 \"\u0017\u0010)\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010 \"\u0017\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010 \"\u0017\u0010-\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010 \"\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064²\u0006\f\u00102\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m28850d2 = {"", "refreshing", "Landroidx/compose/material/pullrefresh/PullRefreshState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "scale", "", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "PullRefreshIndicator", TypedValues.Custom.S_COLOR, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "progress", "Lb7;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)Lb7;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Path;", "arrow", "Landroidx/compose/ui/geometry/Rect;", "bounds", "alpha", "values", "e", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLb7;)V", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorSize", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "SpinnerShape", OperatorName.CURVE_TO, "ArcRadius", "d", "StrokeWidth", "ArrowWidth", OperatorName.FILL_NON_ZERO, "ArrowHeight", OperatorName.NON_STROKING_GRAY, "Elevation", "Landroidx/compose/animation/core/TweenSpec;", OperatorName.CLOSE_PATH, "Landroidx/compose/animation/core/TweenSpec;", "AlphaTween", "showElevation", "targetAlpha", "material_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,250:1\n50#2:251\n49#2:252\n456#2,8:278\n464#2,3:292\n467#2,3:296\n25#2:301\n36#2:309\n1097#3,6:253\n1097#3,3:302\n1100#3,3:306\n1097#3,6:310\n76#4:259\n154#5:260\n154#5:334\n164#5:335\n164#5:336\n154#5:337\n154#5:338\n154#5:339\n66#6,6:261\n72#6:295\n76#6:300\n78#7,11:267\n91#7:299\n4144#8,6:286\n1#9:305\n136#10,5:316\n261#10,11:321\n81#11:332\n81#11:333\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n83#1:251\n83#1:252\n94#1:278,8\n94#1:292,3\n94#1:296,3\n135#1:301\n137#1:309\n83#1:253,6\n135#1:302,3\n135#1:306,3\n137#1:310,6\n90#1:259\n98#1:260\n238#1:334\n240#1:335\n241#1:336\n242#1:337\n243#1:338\n244#1:339\n94#1:261,6\n94#1:295\n94#1:300\n94#1:267,11\n94#1:299\n94#1:286,6\n230#1:316,5\n230#1:321,11\n83#1:332\n137#1:333\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt {

    /* renamed from: a */
    public static final float f25435a = C3641Dp.m73658constructorimpl(40);

    /* renamed from: b */
    public static final RoundedCornerShape f25436b = RoundedCornerShapeKt.getCircleShape();

    /* renamed from: c */
    public static final float f25437c = C3641Dp.m73658constructorimpl((float) 7.5d);

    /* renamed from: d */
    public static final float f25438d = C3641Dp.m73658constructorimpl((float) 2.5d);

    /* renamed from: e */
    public static final float f25439e = C3641Dp.m73658constructorimpl(10);

    /* renamed from: f */
    public static final float f25440f = C3641Dp.m73658constructorimpl(5);

    /* renamed from: g */
    public static final float f25441g = C3641Dp.m73658constructorimpl(6);

    /* renamed from: h */
    public static final TweenSpec f25442h = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: PullRefreshIndicator-jB83MbM  reason: not valid java name */
    public static final void m70169PullRefreshIndicatorjB83MbM(boolean z, @NotNull PullRefreshState state, @Nullable Modifier modifier, long j, long j2, boolean z2, @Nullable Composer composer, int i, int i2) {
        Modifier.Companion companion;
        long j3;
        int i3;
        long j4;
        boolean z3;
        Color m71725boximpl;
        int i4;
        long j5;
        float m73658constructorimpl;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(308716636);
        if ((i2 & 4) != 0) {
            companion = Modifier.Companion;
        } else {
            companion = modifier;
        }
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m69974getSurface0d7_KjU();
        } else {
            j3 = j;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            i3 &= -57345;
            j4 = ColorsKt.m69988contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308716636, i3, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:74)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        int i5 = i3 & 14;
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(state);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(z, state));
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        State state2 = (State) rememberedValue;
        ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
        startRestartGroup.startReplaceableGroup(52228748);
        if (elevationOverlay == null) {
            m71725boximpl = null;
        } else {
            m71725boximpl = Color.m71725boximpl(elevationOverlay.mo70023apply7g2Lkgo(j3, f25441g, startRestartGroup, ((i3 >> 9) & 14) | 48));
        }
        startRestartGroup.endReplaceableGroup();
        if (m71725boximpl != null) {
            i4 = i5;
            j5 = m71725boximpl.m71745unboximpl();
        } else {
            i4 = i5;
            j5 = j3;
        }
        Modifier pullRefreshIndicatorTransform = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m69564size3ABfNKs(companion, f25435a), state, z3);
        if (m60745d(state2)) {
            m73658constructorimpl = f25441g;
        } else {
            m73658constructorimpl = C3641Dp.m73658constructorimpl(0);
        }
        float f = m73658constructorimpl;
        RoundedCornerShape roundedCornerShape = f25436b;
        Modifier m69318backgroundbw27NRU = BackgroundKt.m69318backgroundbw27NRU(ShadowKt.m71425shadows4CzXII$default(pullRefreshIndicatorTransform, f, roundedCornerShape, true, 0L, 0L, 24, null), j5, roundedCornerShape);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69318backgroundbw27NRU);
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
        Updater.m71400setimpl(m71393constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        long j6 = j4;
        CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1853731063, true, new PullRefreshIndicatorKt$PullRefreshIndicator$1$1(j4, i3, state)), startRestartGroup, i4 | 24960, 10);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$PullRefreshIndicator$2(z, state, companion, j3, j6, z3, i, i2));
        }
    }

    /* renamed from: a */
    public static final C5348b7 m60748a(float f) {
        float max = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5) / 3;
        float coerceIn = AbstractC11719c.coerceIn(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (coerceIn - (((float) Math.pow(coerceIn, 2)) / 4))) * 0.5f;
        float f2 = 360;
        return new C5348b7(pow, pow * f2, ((0.8f * max) + pow) * f2, Math.min(1.0f, max));
    }

    /* renamed from: b */
    public static final void m60747b(PullRefreshState pullRefreshState, long j, Modifier modifier, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-486016981);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-486016981, i, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:129)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Path path = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo71637setFillTypeoQ8Xj4U(PathFillType.Companion.m71975getEvenOddRgk1Os());
            startRestartGroup.updateRememberedValue(Path);
            path = Path;
        }
        startRestartGroup.endReplaceableGroup();
        Path path2 = (Path) path;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(pullRefreshState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(pullRefreshState));
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(SemanticsModifierKt.semantics$default(modifier, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.INSTANCE, 1, null), new PullRefreshIndicatorKt$CircularArrowIndicator$2(pullRefreshState, AnimateAsStateKt.animateFloatAsState(m60746c((State) rememberedValue2), f25442h, 0.0f, null, null, startRestartGroup, 48, 28), j, path2), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$CircularArrowIndicator$3(pullRefreshState, j, modifier, i));
        }
    }

    /* renamed from: c */
    public static final float m60746c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: d */
    public static final boolean m60745d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: e */
    public static final void m60744e(DrawScope drawScope, Path path, Rect rect, long j, float f, C5348b7 c5348b7) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f2 = f25439e;
        path.lineTo(drawScope.mo69438toPx0680j_4(f2) * c5348b7.m52046c(), 0.0f);
        path.lineTo((drawScope.mo69438toPx0680j_4(f2) * c5348b7.m52046c()) / 2, drawScope.mo69438toPx0680j_4(f25440f) * c5348b7.m52046c());
        path.mo71639translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m71502getXimpl(rect.m71532getCenterF1C5BW0())) - ((drawScope.mo69438toPx0680j_4(f2) * c5348b7.m52046c()) / 2.0f), Offset.m71503getYimpl(rect.m71532getCenterF1C5BW0()) + (drawScope.mo69438toPx0680j_4(f25438d) / 2.0f)));
        path.close();
        float m52048a = c5348b7.m52048a();
        long mo72143getCenterF1C5BW0 = drawScope.mo72143getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo72156rotateUv8p0NA(m52048a, mo72143getCenterF1C5BW0);
        AbstractC12212lK.m26520G(drawScope, path, j, f, null, null, 0, 56, null);
        drawContext.getCanvas().restore();
        drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
    }
}
