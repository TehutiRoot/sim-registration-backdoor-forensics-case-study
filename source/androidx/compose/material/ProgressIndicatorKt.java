package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.feitian.readerdk.Tool.C6150DK;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\u001aE\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0017\u001a\u00020\t*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\t*\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aG\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a;\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a3\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a9\u0010)\u001a\u00020\t*\u00020\u00132\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a)\u0010+\u001a\u00020\t*\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u00020\t*\u00020\u00132\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010*\u001aA\u0010.\u001a\u00020\t*\u00020\u00132\u0006\u0010%\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\"\u0017\u00102\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u00101\"\u0017\u00104\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u00101\"\u0017\u00106\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u00101\"\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010<\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109\"\u0014\u0010>\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109\"\u0014\u0010@\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00109\"\u0014\u0010B\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006K²\u0006\f\u0010C\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002²\u0006\f\u0010I\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m28850d2 = {"", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "backgroundColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", OperatorName.MOVE_TO, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", OperatorName.ENDPATH, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "i", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", OperatorName.SET_LINE_JOINSTYLE, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "LinearIndicatorHeight", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "LinearIndicatorWidth", OperatorName.CURVE_TO, "CircularIndicatorDiameter", "Landroidx/compose/animation/core/CubicBezierEasing;", "d", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "e", "FirstLineTailEasing", OperatorName.FILL_NON_ZERO, "SecondLineHeadEasing", OperatorName.NON_STROKING_GRAY, "SecondLineTailEasing", OperatorName.CLOSE_PATH, "CircularEasing", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "material_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,587:1\n83#2,3:588\n83#2,3:597\n1097#3,6:591\n1097#3,6:600\n76#4:606\n76#4:607\n75#5,7:608\n81#6:615\n81#6:616\n81#6:617\n81#6:618\n81#6:619\n81#6:620\n81#6:621\n81#6:622\n154#7:623\n154#7:624\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n86#1:588,3\n165#1:597,3\n86#1:591,6\n165#1:600,6\n296#1:606\n334#1:607\n512#1:608,7\n117#1:615\n128#1:616\n139#1:617\n150#1:618\n340#1:619\n352#1:620\n363#1:621\n375#1:622\n530#1:623\n534#1:624\n*E\n"})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {

    /* renamed from: a */
    public static final float f14556a = ProgressIndicatorDefaults.INSTANCE.m70064getStrokeWidthD9Ej5fM();

    /* renamed from: b */
    public static final float f14557b = C3641Dp.m73658constructorimpl((float) C6150DK.ERROR_RECEIVE_LRC);

    /* renamed from: c */
    public static final float f14558c = C3641Dp.m73658constructorimpl(40);

    /* renamed from: d */
    public static final CubicBezierEasing f14559d = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: e */
    public static final CubicBezierEasing f14560e = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f */
    public static final CubicBezierEasing f14561f = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: g */
    public static final CubicBezierEasing f14562g = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: h */
    public static final CubicBezierEasing f14563h = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70065CircularProgressIndicatorDUhRLBM(float r18, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r19, long r20, float r22, long r23, int r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m70065CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70066CircularProgressIndicatorLxG7B9w(@org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r25, long r26, float r28, long r29, int r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m70066CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-MBs18nI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m70067CircularProgressIndicatorMBs18nI(float r20, androidx.compose.p003ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m70067CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-aM-cp0Q  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m70068CircularProgressIndicatoraMcp0Q(androidx.compose.p003ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m70068CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LinearProgressIndicator-2cYBFYY  reason: not valid java name */
    public static final void m70069LinearProgressIndicator2cYBFYY(@Nullable Modifier modifier, long j, long j2, int i, @Nullable Composer composer, int i2, int i3) {
        Modifier.Companion companion;
        int i4;
        int i5;
        long j3;
        long j4;
        int i6;
        long j5;
        long j6;
        int i7;
        Modifier modifier2;
        long j7;
        long j8;
        int i8;
        long j9;
        long j10;
        Modifier modifier3;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1501635280);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            companion = modifier;
        } else if ((i2 & 14) == 0) {
            companion = modifier;
            if (startRestartGroup.changed(companion)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            companion = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i11 = 32;
                    i4 |= i11;
                }
            } else {
                j3 = j;
            }
            i11 = 16;
            i4 |= i11;
        } else {
            j3 = j;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i10 = 256;
                    i4 |= i10;
                }
            } else {
                j4 = j2;
            }
            i10 = 128;
            i4 |= i10;
        } else {
            j4 = j2;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                i6 = i;
                if (startRestartGroup.changed(i6)) {
                    i9 = 2048;
                    i4 |= i9;
                }
            } else {
                i6 = i;
            }
            i9 = 1024;
            i4 |= i9;
        } else {
            i6 = i;
        }
        if ((i4 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            i8 = i6;
            modifier3 = companion;
            j9 = j3;
            j10 = j4;
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                i7 = i6;
                modifier2 = companion;
                j7 = j3;
                j8 = j4;
            } else {
                if (i12 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 2) != 0) {
                    j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m69970getPrimary0d7_KjU();
                } else {
                    j5 = j3;
                }
                if ((i3 & 4) != 0) {
                    j6 = Color.m71734copywmQWz5c$default(j5, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    j6 = j4;
                }
                if ((i3 & 8) != 0) {
                    i6 = StrokeCap.Companion.m72043getButtKaPHkGw();
                }
                i7 = i6;
                modifier2 = companion;
                j7 = j5;
                j8 = j6;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, i2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)");
            }
            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
            InfiniteRepeatableSpec m69262infiniteRepeatable9IiC70o$default = AnimationSpecKt.m69262infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.INSTANCE), null, 0L, 6, null);
            int i13 = InfiniteTransition.$stable;
            int i14 = InfiniteRepeatableSpec.$stable;
            State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, m69262infiniteRepeatable9IiC70o$default, null, startRestartGroup, i13 | 432 | (i14 << 9), 8);
            State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m69262infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, i13 | 432 | (i14 << 9), 8);
            State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m69262infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, i13 | 432 | (i14 << 9), 8);
            State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m69262infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, i13 | 432 | (i14 << 9), 8);
            Modifier m69566sizeVpY3zN4 = SizeKt.m69566sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier2), f14557b, f14556a);
            Object[] objArr = {Color.m71725boximpl(j8), StrokeCap.m72036boximpl(i7), animateFloat, animateFloat2, Color.m71725boximpl(j7), animateFloat3, animateFloat4};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z = false;
            for (int i15 = 0; i15 < 7; i15++) {
                z |= startRestartGroup.changed(objArr[i15]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ProgressIndicatorKt$LinearProgressIndicator$3$1(j8, i7, j7, animateFloat, animateFloat2, animateFloat3, animateFloat4);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m69566sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = i7;
            j9 = j7;
            j10 = j8;
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$4(modifier3, j9, j10, i8, i2, i3));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: LinearProgressIndicator-RIQooxk  reason: not valid java name */
    public static final /* synthetic */ void m70070LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        long j3;
        long j4;
        Object obj2;
        long j5;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            if (startRestartGroup.changed(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            j3 = j;
            if ((i2 & 2) == 0 && startRestartGroup.changed(j3)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            j4 = j2;
            if ((i2 & 4) == 0 && startRestartGroup.changed(j4)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            obj2 = obj;
            j5 = j3;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                obj2 = obj;
            } else {
                if (i7 != 0) {
                    obj2 = Modifier.Companion;
                } else {
                    obj2 = obj;
                }
                if ((i2 & 2) != 0) {
                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m69970getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = Color.m71734copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            }
            int i8 = i3;
            j5 = j3;
            long j6 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i8, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:205)");
            }
            m70069LinearProgressIndicator2cYBFYY(obj2, j5, j6, StrokeCap.Companion.m72043getButtKaPHkGw(), startRestartGroup, i8 & 1022, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j6;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$6(obj2, j5, j4, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156 A[LOOP:0: B:83:0x0154->B:84:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70071LinearProgressIndicator_5eSRE(float r25, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r26, long r27, long r29, int r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m70071LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-eaDK9VM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m70072LinearProgressIndicatoreaDK9VM(float r20, androidx.compose.p003ui.Modifier r21, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m70072LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final float m60856a(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: b */
    public static final float m60855b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: c */
    public static final int m60854c(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* renamed from: d */
    public static final float m60853d(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: e */
    public static final float m60852e(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: f */
    public static final float m60851f(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: g */
    public static final float m60850g(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: h */
    public static final float m60849h(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: i */
    public static final void m60848i(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m71571getWidthimpl = Size.m71571getWidthimpl(drawScope.mo72144getSizeNHjbRc()) - (f3 * width);
        AbstractC12212lK.m26492v(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.p003ui.geometry.SizeKt.Size(m71571getWidthimpl, m71571getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* renamed from: j */
    public static final void m60847j(DrawScope drawScope, long j, Stroke stroke) {
        m60848i(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* renamed from: k */
    public static final void m60846k(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m60848i(drawScope, f, f2, j, stroke);
    }

    /* renamed from: l */
    public static final void m60845l(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        float m73658constructorimpl;
        if (StrokeCap.m72039equalsimpl0(stroke.m72231getCapKaPHkGw(), StrokeCap.Companion.m72043getButtKaPHkGw())) {
            m73658constructorimpl = 0.0f;
        } else {
            m73658constructorimpl = ((f2 / C3641Dp.m73658constructorimpl(f14558c / 2)) * 57.29578f) / 2.0f;
        }
        m60848i(drawScope, f + m73658constructorimpl, Math.max(f3, 0.1f), j, stroke);
    }

    /* renamed from: m */
    public static final void m60844m(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        boolean z;
        float f4;
        float f5;
        float m71571getWidthimpl = Size.m71571getWidthimpl(drawScope.mo72144getSizeNHjbRc());
        float m71568getHeightimpl = Size.m71568getHeightimpl(drawScope.mo72144getSizeNHjbRc());
        float f6 = 2;
        float f7 = m71568getHeightimpl / f6;
        if (drawScope.getLayoutDirection() == LayoutDirection.Ltr) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f8 = f4 * m71571getWidthimpl;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        float f9 = f5 * m71571getWidthimpl;
        if (!StrokeCap.m72039equalsimpl0(i, StrokeCap.Companion.m72043getButtKaPHkGw()) && m71568getHeightimpl <= m71571getWidthimpl) {
            float f10 = f3 / f6;
            ClosedFloatingPointRange<Float> rangeTo = AbstractC18012Lr1.rangeTo(f10, m71571getWidthimpl - f10);
            float floatValue = ((Number) AbstractC11719c.coerceIn(Float.valueOf(f8), rangeTo)).floatValue();
            float floatValue2 = ((Number) AbstractC11719c.coerceIn(Float.valueOf(f9), rangeTo)).floatValue();
            if (Math.abs(f2 - f) > 0.0f) {
                AbstractC12212lK.m26524C(drawScope, j, OffsetKt.Offset(floatValue, f7), OffsetKt.Offset(floatValue2, f7), f3, i, null, 0.0f, null, 0, 480, null);
                return;
            }
            return;
        }
        AbstractC12212lK.m26524C(drawScope, j, OffsetKt.Offset(f8, f7), OffsetKt.Offset(f9, f7), f3, 0, null, 0.0f, null, 0, 496, null);
    }

    /* renamed from: n */
    public static final void m60843n(DrawScope drawScope, long j, float f, int i) {
        m60844m(drawScope, 0.0f, 1.0f, j, f, i);
    }
}
