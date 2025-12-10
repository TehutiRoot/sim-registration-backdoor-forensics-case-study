package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a|\u0010\u001c\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u001d\u0010!\u001a\u00020\u00188\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001d\u0010$\u001a\u00020\u00188\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 \"\u0017\u0010&\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010\u001e\"\u0017\u0010(\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010\u001e\"\u0017\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010\u001e\"\u0017\u0010,\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010\u001e\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m28850d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "thumbContent", "enabled", "Landroidx/compose/material3/SwitchColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/State;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/ui/graphics/Shape;", "thumbShape", "Landroidx/compose/ui/unit/Dp;", "uncheckedThumbDiameter", "minBound", "maxBound", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material3/SwitchColors;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/runtime/Composer;II)V", "F", "getThumbDiameter", "()F", "ThumbDiameter", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUncheckedThumbDiameter", "UncheckedThumbDiameter", OperatorName.CURVE_TO, "SwitchWidth", "d", "SwitchHeight", "e", "ThumbPadding", OperatorName.FILL_NON_ZERO, "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,478:1\n25#2:479\n50#2:491\n49#2:492\n25#2:499\n25#2:510\n460#2,13:540\n473#2,3:554\n460#2,13:586\n36#2:600\n460#2,13:626\n473#2,3:640\n473#2,3:645\n1114#3,6:480\n1114#3,6:493\n1114#3,6:500\n1114#3,3:511\n1117#3,3:517\n1114#3,6:601\n58#4:486\n75#4:487\n58#4:560\n58#4:561\n81#4:562\n88#4:563\n51#4:564\n58#4:566\n75#4:607\n58#4:653\n75#4:654\n58#4:655\n76#5:488\n76#5:490\n76#5:528\n76#5:559\n76#5:565\n76#5:574\n76#5:614\n1#6:489\n474#7,4:506\n478#7,2:514\n482#7:520\n474#8:516\n67#9,6:521\n73#9:553\n77#9:558\n67#9,6:567\n73#9:599\n68#9,5:608\n73#9:639\n77#9:644\n77#9:649\n75#10:527\n76#10,11:529\n89#10:557\n75#10:573\n76#10,11:575\n75#10:613\n76#10,11:615\n89#10:643\n89#10:648\n76#11:650\n76#11:651\n76#11:652\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n98#1:479\n109#1:491\n109#1:492\n114#1:499\n115#1:510\n146#1:540,13\n146#1:554,3\n223#1:586,13\n229#1:600\n226#1:626,13\n226#1:640,3\n223#1:645,3\n98#1:480,6\n109#1:493,6\n114#1:500,6\n115#1:511,3\n115#1:517,3\n229#1:601,6\n106#1:486\n106#1:487\n195#1:560\n196#1:561\n196#1:562\n195#1:563\n195#1:564\n202#1:566\n232#1:607\n253#1:653\n253#1:654\n254#1:655\n107#1:488\n108#1:490\n146#1:528\n191#1:559\n200#1:565\n223#1:574\n226#1:614\n115#1:506,4\n115#1:514,2\n115#1:520\n115#1:516\n146#1:521,6\n146#1:553\n146#1:558\n223#1:567,6\n223#1:599\n226#1:608,5\n226#1:639\n226#1:644\n223#1:649\n146#1:527\n146#1:529,11\n146#1:557\n223#1:573\n223#1:575,11\n226#1:613\n226#1:615,11\n226#1:643\n223#1:648\n188#1:650\n189#1:651\n224#1:652\n*E\n"})
/* loaded from: classes2.dex */
public final class SwitchKt {

    /* renamed from: a */
    public static final float f26283a;

    /* renamed from: b */
    public static final float f26284b;

    /* renamed from: c */
    public static final float f26285c;

    /* renamed from: d */
    public static final float f26286d;

    /* renamed from: e */
    public static final float f26287e;

    /* renamed from: f */
    public static final float f26288f;

    /* renamed from: g */
    public static final TweenSpec f26289g;

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float m71282getSelectedHandleWidthD9Ej5fM = switchTokens.m71282getSelectedHandleWidthD9Ej5fM();
        f26283a = m71282getSelectedHandleWidthD9Ej5fM;
        f26284b = switchTokens.m71289getUnselectedHandleWidthD9Ej5fM();
        float m71287getTrackWidthD9Ej5fM = switchTokens.m71287getTrackWidthD9Ej5fM();
        f26285c = m71287getTrackWidthD9Ej5fM;
        float m71285getTrackHeightD9Ej5fM = switchTokens.m71285getTrackHeightD9Ej5fM();
        f26286d = m71285getTrackHeightD9Ej5fM;
        float m73658constructorimpl = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(m71285getTrackHeightD9Ej5fM - m71282getSelectedHandleWidthD9Ej5fM) / 2);
        f26287e = m73658constructorimpl;
        f26288f = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(m71287getTrackWidthD9Ej5fM - m71282getSelectedHandleWidthD9Ej5fM) - m73658constructorimpl);
        f26289g = new TweenSpec(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(boolean r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, boolean r56, @org.jetbrains.annotations.Nullable androidx.compose.material3.SwitchColors r57, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r58, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m60483a(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State state, Function2 function2, InteractionSource interactionSource, Shape shape, float f, float f2, float f3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        float m73658constructorimpl;
        float floatValue;
        Composer composer2;
        float m71286getTrackOutlineWidthD9Ej5fM;
        Composer startRestartGroup = composer.startRestartGroup(-1968109941);
        if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= startRestartGroup.changed(f) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(f2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changed(f3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i3, i4, "androidx.compose.material3.SwitchImpl (Switch.kt:175)");
            }
            int i5 = ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896);
            State<Color> trackColor$material3_release = switchColors.trackColor$material3_release(z2, z, startRestartGroup, i5);
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, startRestartGroup, (i3 >> 18) & 14);
            int i6 = i3;
            float mo69434toDpu2uoSUM = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo69434toDpu2uoSUM(((Number) state.getValue()).floatValue());
            if (m60480d(collectIsPressedAsState)) {
                m73658constructorimpl = SwitchTokens.INSTANCE.m71280getPressedHandleWidthD9Ej5fM();
            } else {
                m73658constructorimpl = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(f26283a - f) * (C3641Dp.m73658constructorimpl(mo69434toDpu2uoSUM - f2) / C3641Dp.m73658constructorimpl(f3 - f2))) + f);
            }
            startRestartGroup.startReplaceableGroup(-993794105);
            if (m60480d(collectIsPressedAsState)) {
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                if (z) {
                    m71286getTrackOutlineWidthD9Ej5fM = C3641Dp.m73658constructorimpl(f26288f - SwitchTokens.INSTANCE.m71286getTrackOutlineWidthD9Ej5fM());
                } else {
                    m71286getTrackOutlineWidthD9Ej5fM = SwitchTokens.INSTANCE.m71286getTrackOutlineWidthD9Ej5fM();
                }
                floatValue = density.mo69438toPx0680j_4(m71286getTrackOutlineWidthD9Ej5fM);
            } else {
                floatValue = ((Number) state.getValue()).floatValue();
            }
            startRestartGroup.endReplaceableGroup();
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape shape2 = ShapesKt.toShape(switchTokens.getTrackShape(), startRestartGroup, 6);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier m69318backgroundbw27NRU = BackgroundKt.m69318backgroundbw27NRU(BorderKt.m69326borderxT4_qwU(SizeKt.m69550height3ABfNKs(SizeKt.m69569width3ABfNKs(boxScope.align(companion, companion2.getCenter()), f26285c), f26286d), switchTokens.m71286getTrackOutlineWidthD9Ej5fM(), switchColors.borderColor$material3_release(z2, z, startRestartGroup, i5).getValue().m71745unboximpl(), shape2), m60481c(trackColor$material3_release), shape2);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m69318backgroundbw27NRU);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71393constructorimpl = Updater.m71393constructorimpl(startRestartGroup);
            Updater.m71400setimpl(m71393constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, density2, companion3.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long m60482b = m60482b(switchColors.thumbColor$material3_release(z2, z, startRestartGroup, i5));
            Modifier align = boxScopeInstance.align(companion, companion2.getCenterStart());
            Float valueOf = Float.valueOf(floatValue);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwitchKt$SwitchImpl$1$1$1(floatValue);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            Modifier m69318backgroundbw27NRU2 = BackgroundKt.m69318backgroundbw27NRU(SizeKt.m69556requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue), interactionSource, RippleKt.m70180rememberRipple9IZ8Weo(false, C3641Dp.m73658constructorimpl(switchTokens.m71284getStateLayerSizeD9Ej5fM() / 2), 0L, composer2, 54, 4)), m73658constructorimpl), m60482b, shape);
            Alignment center = companion2.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m69318backgroundbw27NRU2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m71393constructorimpl2 = Updater.m71393constructorimpl(composer2);
            Updater.m71400setimpl(m71393constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl2, density3, companion3.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(1420970387);
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors.iconColor$material3_release(z2, z, composer2, i5).getValue())}, function2, composer2, ((i6 >> 12) & 112) | 8);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SwitchKt$SwitchImpl$2(boxScope, z, z2, switchColors, state, function2, interactionSource, shape, f, f2, f3, i, i2));
    }

    /* renamed from: b */
    public static final long m60482b(State state) {
        return ((Color) state.getValue()).m71745unboximpl();
    }

    /* renamed from: c */
    public static final long m60481c(State state) {
        return ((Color) state.getValue()).m71745unboximpl();
    }

    /* renamed from: d */
    public static final boolean m60480d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final float getThumbDiameter() {
        return f26283a;
    }

    public static final float getUncheckedThumbDiameter() {
        return f26284b;
    }
}
