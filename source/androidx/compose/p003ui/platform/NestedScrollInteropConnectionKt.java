package androidx.compose.p003ui.platform;

import android.view.View;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0002\u001a%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\u0004*\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u001b\u0010\u001a\u001a\u00020\u0004*\u00020\f8BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28850d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)F", TypedValues.CycleType.S_WAVE_OFFSET, "", "composeToViewOffset", "(F)I", OperatorName.CURVE_TO, "(I)F", OperatorName.FILL_NON_ZERO, "", "consumed", "Landroidx/compose/ui/geometry/Offset;", "available", "d", "([IJ)J", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "e", "(I)I", "Landroid/view/View;", "hostView", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberNestedScrollInteropConnection", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(J)I", "scrollAxes", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,236:1\n76#2:237\n36#3:238\n1097#4,6:239\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n233#1:237\n234#1:238\n234#1:239,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.NestedScrollInteropConnectionKt */
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnectionKt {
    /* renamed from: a */
    public static final float m59216a(float f) {
        double floor;
        if (f >= 0.0f) {
            floor = Math.ceil(f);
        } else {
            floor = Math.floor(f);
        }
        return (float) floor;
    }

    /* renamed from: b */
    public static final int m59215b(long j) {
        int i;
        if (Math.abs(Offset.m71502getXimpl(j)) >= 0.5f) {
            i = 1;
        } else {
            i = 0;
        }
        if (Math.abs(Offset.m71503getYimpl(j)) >= 0.5f) {
            return i | 2;
        }
        return i;
    }

    /* renamed from: c */
    public static final float m59214c(int i) {
        return i * (-1.0f);
    }

    public static final int composeToViewOffset(float f) {
        return ((int) m59216a(f)) * (-1);
    }

    /* renamed from: d */
    public static final long m59213d(int[] iArr, long j) {
        float coerceAtLeast;
        float coerceAtLeast2;
        if (Offset.m71502getXimpl(j) >= 0.0f) {
            coerceAtLeast = AbstractC11719c.coerceAtMost(m59214c(iArr[0]), Offset.m71502getXimpl(j));
        } else {
            coerceAtLeast = AbstractC11719c.coerceAtLeast(m59214c(iArr[0]), Offset.m71502getXimpl(j));
        }
        if (Offset.m71503getYimpl(j) >= 0.0f) {
            coerceAtLeast2 = AbstractC11719c.coerceAtMost(m59214c(iArr[1]), Offset.m71503getYimpl(j));
        } else {
            coerceAtLeast2 = AbstractC11719c.coerceAtLeast(m59214c(iArr[1]), Offset.m71503getYimpl(j));
        }
        return OffsetKt.Offset(coerceAtLeast, coerceAtLeast2);
    }

    /* renamed from: e */
    public static final int m59212e(int i) {
        return !NestedScrollSource.m72623equalsimpl0(i, NestedScrollSource.Companion.m72628getDragWNlRxjI()) ? 1 : 0;
    }

    /* renamed from: f */
    public static final float m59211f(float f) {
        return f * (-1.0f);
    }

    @Composable
    @NotNull
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(@Nullable View view, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1260107652);
        if ((i2 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1260107652, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.kt:231)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScrollInteropConnection;
    }
}
