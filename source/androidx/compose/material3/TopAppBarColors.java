package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Stable
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R#\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001aR#\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "colorTransitionFraction", "containerColor-XeAY9LY$material3_release", "(FLandroidx/compose/runtime/Composer;I)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "getNavigationIconContentColor-0d7_KjU$material3_release", "()J", "d", "getTitleContentColor-0d7_KjU$material3_release", "e", "getActionIconContentColor-0d7_KjU$material3_release", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26498a;

    /* renamed from: b */
    public final long f26499b;

    /* renamed from: c */
    public final long f26500c;

    /* renamed from: d */
    public final long f26501d;

    /* renamed from: e */
    public final long f26502e;

    public /* synthetic */ TopAppBarColors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    @Composable
    /* renamed from: containerColor-XeAY9LY$material3_release  reason: not valid java name */
    public final long m70808containerColorXeAY9LY$material3_release(float f, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1456204135);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1456204135, i, -1, "androidx.compose.material3.TopAppBarColors.containerColor (AppBar.kt:936)");
        }
        long m71785lerpjxsXWHM = ColorKt.m71785lerpjxsXWHM(this.f26498a, this.f26499b, EasingKt.getFastOutLinearInEasing().transform(f));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m71785lerpjxsXWHM;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        if (Color.m71736equalsimpl0(this.f26498a, topAppBarColors.f26498a) && Color.m71736equalsimpl0(this.f26499b, topAppBarColors.f26499b) && Color.m71736equalsimpl0(this.f26500c, topAppBarColors.f26500c) && Color.m71736equalsimpl0(this.f26501d, topAppBarColors.f26501d) && Color.m71736equalsimpl0(this.f26502e, topAppBarColors.f26502e)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActionIconContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70809getActionIconContentColor0d7_KjU$material3_release() {
        return this.f26502e;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70810getNavigationIconContentColor0d7_KjU$material3_release() {
        return this.f26500c;
    }

    /* renamed from: getTitleContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70811getTitleContentColor0d7_KjU$material3_release() {
        return this.f26501d;
    }

    public int hashCode() {
        return (((((((Color.m71742hashCodeimpl(this.f26498a) * 31) + Color.m71742hashCodeimpl(this.f26499b)) * 31) + Color.m71742hashCodeimpl(this.f26500c)) * 31) + Color.m71742hashCodeimpl(this.f26501d)) * 31) + Color.m71742hashCodeimpl(this.f26502e);
    }

    public TopAppBarColors(long j, long j2, long j3, long j4, long j5) {
        this.f26498a = j;
        this.f26499b = j2;
        this.f26500c = j3;
        this.f26501d = j4;
        this.f26502e = j5;
    }
}
