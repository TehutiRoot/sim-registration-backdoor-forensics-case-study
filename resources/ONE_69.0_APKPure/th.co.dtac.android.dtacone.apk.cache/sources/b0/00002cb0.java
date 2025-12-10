package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ShadowKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u001a\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u001d\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001d\u0010$\u001a\u00020\u001c8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 \"\u001d\u0010'\u001a\u00020\u001c8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 \"\u0017\u0010)\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010\u001e\"\u0017\u0010*\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001e\"\u0017\u0010,\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010\u001e\"\u0017\u0010.\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010\u001e\"\u0017\u00100\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u0010\u001e\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102\"\u0017\u00105\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010\u001e\"\u0017\u00107\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010\u001e\"\u0017\u00109\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006?²\u0006\u000e\u0010:\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m29142d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SwitchColors;", "colors", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/Function0;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "e", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "trackColor", "trackWidth", "strokeWidth", "i", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getTrackWidth", "()F", "TrackWidth", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTrackStrokeWidth", "TrackStrokeWidth", OperatorName.CURVE_TO, "getThumbDiameter", "ThumbDiameter", "d", "ThumbRippleRadius", "DefaultSwitchPadding", OperatorName.FILL_NON_ZERO, "SwitchWidth", OperatorName.NON_STROKING_GRAY, "SwitchHeight", OperatorName.CLOSE_PATH, "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", OperatorName.SET_LINE_JOINSTYLE, "ThumbDefaultElevation", OperatorName.NON_STROKING_CMYK, "ThumbPressedElevation", OperatorName.LINE_TO, "SwitchVelocityThreshold", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor", "material_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,421:1\n25#2:422\n25#2:431\n36#2:439\n67#2,3:446\n66#2:449\n83#2,3:456\n50#2:465\n49#2:466\n456#2,8:491\n464#2,3:505\n36#2:509\n467#2,3:516\n25#2:521\n50#2:528\n49#2:529\n36#2:536\n36#2:546\n1097#3,6:423\n1097#3,6:432\n1097#3,6:440\n1097#3,6:450\n1097#3,6:459\n1097#3,6:467\n1097#3,6:510\n1097#3,6:522\n1097#3,6:530\n1097#3,6:537\n1097#3,6:547\n76#4:429\n76#4:438\n76#4:473\n76#4:543\n76#4:544\n1#5:430\n66#6,6:474\n72#6:508\n76#6:520\n78#7,11:480\n91#7:519\n4144#8,6:499\n51#9:545\n58#9:566\n81#10:553\n107#10,2:554\n81#10:556\n81#10:557\n81#10:558\n81#10:559\n81#10:560\n154#11:561\n154#11:562\n154#11:563\n154#11:564\n154#11:565\n154#11:567\n154#11:568\n154#11:569\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n100#1:422\n109#1:431\n111#1:439\n121#1:446,3\n121#1:449\n124#1:456,3\n133#1:465\n133#1:466\n153#1:491,8\n153#1:505,3\n178#1:509\n153#1:516,3\n220#1:521\n222#1:528\n222#1:529\n245#1:536\n261#1:546\n100#1:423,6\n109#1:432,6\n111#1:440,6\n121#1:450,6\n124#1:459,6\n133#1:467,6\n178#1:510,6\n220#1:522,6\n222#1:530,6\n245#1:537,6\n261#1:547,6\n104#1:429\n110#1:438\n138#1:473\n249#1:543\n250#1:544\n153#1:474,6\n153#1:508\n153#1:520\n153#1:480,11\n153#1:519\n153#1:499,6\n250#1:545\n292#1:566\n109#1:553\n109#1:554,2\n119#1:556\n120#1:557\n241#1:558\n248#1:559\n251#1:560\n283#1:561\n284#1:562\n285#1:563\n287#1:564\n289#1:565\n296#1:567\n297#1:568\n420#1:569\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchKt {

    /* renamed from: a */
    public static final float f14750a;

    /* renamed from: b */
    public static final float f14751b;

    /* renamed from: c */
    public static final float f14752c;

    /* renamed from: d */
    public static final float f14753d;

    /* renamed from: e */
    public static final float f14754e;

    /* renamed from: f */
    public static final float f14755f;

    /* renamed from: g */
    public static final float f14756g;

    /* renamed from: h */
    public static final float f14757h;

    /* renamed from: i */
    public static final TweenSpec f14758i;

    /* renamed from: j */
    public static final float f14759j;

    /* renamed from: k */
    public static final float f14760k;

    /* renamed from: l */
    public static final float f14761l;

    static {
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(34);
        f14750a = m73842constructorimpl;
        f14751b = C3623Dp.m73842constructorimpl(14);
        float m73842constructorimpl2 = C3623Dp.m73842constructorimpl(20);
        f14752c = m73842constructorimpl2;
        f14753d = C3623Dp.m73842constructorimpl(24);
        f14754e = C3623Dp.m73842constructorimpl(2);
        f14755f = m73842constructorimpl;
        f14756g = m73842constructorimpl2;
        f14757h = C3623Dp.m73842constructorimpl(m73842constructorimpl - m73842constructorimpl2);
        f14758i = new TweenSpec(100, 0, null, 6, null);
        f14759j = C3623Dp.m73842constructorimpl(1);
        f14760k = C3623Dp.m73842constructorimpl(6);
        f14761l = C3623Dp.m73842constructorimpl(125);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0248 A[LOOP:0: B:113:0x0246->B:114:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(boolean r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r42, boolean r43, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r44, @org.jetbrains.annotations.Nullable androidx.compose.material.SwitchColors r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final boolean m60740a(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final void m60739b(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public static final Function1 m60738c(State state) {
        return (Function1) state.getValue();
    }

    /* renamed from: d */
    public static final boolean m60737d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: e */
    public static final void m60736e(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, Function0 function0, InteractionSource interactionSource, Composer composer, int i) {
        int i2;
        float f;
        long m60734g;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(70908914);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(switchColors)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(interactionSource)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i2, -1, "androidx.compose.material.SwitchImpl (Switch.kt:212)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i9 = (i2 >> 15) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2) rememberedValue2, startRestartGroup, i9 | 64);
            if (!snapshotStateList.isEmpty()) {
                f = f14760k;
            } else {
                f = f14759j;
            }
            float f2 = f;
            int i10 = ((i2 >> 6) & 14) | (i2 & 112) | ((i2 >> 3) & 896);
            State<Color> trackColor = switchColors.trackColor(z2, z, startRestartGroup, i10);
            Modifier.Companion companion2 = Modifier.Companion;
            Alignment.Companion companion3 = Alignment.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SwitchKt$SwitchImpl$2$1(trackColor);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors.thumbColor(z2, z, startRestartGroup, i10);
            ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float m73842constructorimpl = C3623Dp.m73842constructorimpl(((C3623Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m73856unboximpl() + f2);
            startRestartGroup.startReplaceableGroup(-539243578);
            if (Color.m71920equalsimpl0(m60734g(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m70158getSurface0d7_KjU()) && elevationOverlay != null) {
                m60734g = elevationOverlay.mo70207apply7g2Lkgo(m60734g(thumbColor), m73842constructorimpl, startRestartGroup, 0);
            } else {
                m60734g = m60734g(thumbColor);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            State<Color> m69428animateColorAsStateeuL9pac = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(m60734g, null, null, null, startRestartGroup, 0, 14);
            Modifier align = boxScope.align(companion2, companion3.getCenterStart());
            composer2.startReplaceableGroup(1157296644);
            boolean changed3 = composer2.changed(function0);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new SwitchKt$SwitchImpl$3$1(function0);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m69504backgroundbw27NRU(ShadowKt.m71609shadows4CzXII$default(SizeKt.m69740requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue4), interactionSource, RippleKt.m70364rememberRipple9IZ8Weo(false, f14753d, 0L, composer2, 54, 4)), f14752c), f2, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), m60733h(m69428animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$4(boxScope, z, z2, switchColors, function0, interactionSource, i));
        }
    }

    /* renamed from: f */
    public static final long m60735f(State state) {
        return ((Color) state.getValue()).m71929unboximpl();
    }

    /* renamed from: g */
    public static final long m60734g(State state) {
        return ((Color) state.getValue()).m71929unboximpl();
    }

    public static final float getThumbDiameter() {
        return f14752c;
    }

    public static final float getTrackStrokeWidth() {
        return f14751b;
    }

    public static final float getTrackWidth() {
        return f14750a;
    }

    /* renamed from: h */
    public static final long m60733h(State state) {
        return ((Color) state.getValue()).m71929unboximpl();
    }

    /* renamed from: i */
    public static final void m60732i(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        AbstractC12264mK.m26713C(drawScope, j, androidx.compose.p003ui.geometry.OffsetKt.Offset(f3, Offset.m71687getYimpl(drawScope.mo72327getCenterF1C5BW0())), androidx.compose.p003ui.geometry.OffsetKt.Offset(f - f3, Offset.m71687getYimpl(drawScope.mo72327getCenterF1C5BW0())), f2, StrokeCap.Companion.m72228getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }
}