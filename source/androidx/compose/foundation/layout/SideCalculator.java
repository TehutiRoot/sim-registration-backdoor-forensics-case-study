package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.p003ui.unit.VelocityKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface SideCalculator {

    /* renamed from: a */
    public static final Companion f13243a = Companion.f13244a;

    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005*\u0004\f\u0010\u0014\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "LeftSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1", OperatorName.CURVE_TO, "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "TopSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1", "d", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "RightSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1", "e", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "BottomSideCalculator", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f13244a = new Companion();

        /* renamed from: b */
        public static final SideCalculator$Companion$LeftSideCalculator$1 f13245b = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.top;
                i3 = oldInsets.right;
                i4 = oldInsets.bottom;
                of = Insets.of(i, i2, i3, i4);
                Intrinsics.checkNotNullExpressionValue(of, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo69545consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p003ui.geometry.OffsetKt.Offset(Offset.m71502getXimpl(j), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo69546consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m73883getXimpl(j) - f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float hideMotion(float f, float f2) {
                return LI1.m67533a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float showMotion(float f, float f2) {
                return LI1.m67532b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.left;
                return i;
            }
        };

        /* renamed from: c */
        public static final SideCalculator$Companion$TopSideCalculator$1 f13246c = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.left;
                i3 = oldInsets.right;
                i4 = oldInsets.bottom;
                of = Insets.of(i2, i, i3, i4);
                Intrinsics.checkNotNullExpressionValue(of, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo69545consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p003ui.geometry.OffsetKt.Offset(0.0f, Offset.m71503getYimpl(j));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo69546consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m73884getYimpl(j) - f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float hideMotion(float f, float f2) {
                return LI1.m67533a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float showMotion(float f, float f2) {
                return LI1.m67532b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.top;
                return i;
            }
        };

        /* renamed from: d */
        public static final SideCalculator$Companion$RightSideCalculator$1 f13247d = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.left;
                i3 = oldInsets.top;
                i4 = oldInsets.bottom;
                of = Insets.of(i2, i3, i, i4);
                Intrinsics.checkNotNullExpressionValue(of, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo69545consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p003ui.geometry.OffsetKt.Offset(Offset.m71502getXimpl(j), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo69546consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m73883getXimpl(j) + f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float hideMotion(float f, float f2) {
                return LI1.m67533a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float showMotion(float f, float f2) {
                return LI1.m67532b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.right;
                return i;
            }
        };

        /* renamed from: e */
        public static final SideCalculator$Companion$BottomSideCalculator$1 f13248e = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.left;
                i3 = oldInsets.top;
                i4 = oldInsets.right;
                of = Insets.of(i2, i3, i4, i);
                Intrinsics.checkNotNullExpressionValue(of, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo69545consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p003ui.geometry.OffsetKt.Offset(0.0f, Offset.m71503getYimpl(j));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo69546consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m73884getYimpl(j) + f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float hideMotion(float f, float f2) {
                return LI1.m67533a(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* bridge */ /* synthetic */ float showMotion(float f, float f2) {
                return LI1.m67532b(this, f, f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.bottom;
                return i;
            }
        };

        @NotNull
        /* renamed from: chooseCalculator-ni1skBw  reason: not valid java name */
        public final SideCalculator m69547chooseCalculatorni1skBw(int i, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m69578equalsimpl0(i, companion.m69591getLeftJoeWqyM())) {
                return f13245b;
            }
            if (WindowInsetsSides.m69578equalsimpl0(i, companion.m69594getTopJoeWqyM())) {
                return f13246c;
            }
            if (WindowInsetsSides.m69578equalsimpl0(i, companion.m69592getRightJoeWqyM())) {
                return f13247d;
            }
            if (WindowInsetsSides.m69578equalsimpl0(i, companion.m69588getBottomJoeWqyM())) {
                return f13248e;
            }
            if (WindowInsetsSides.m69578equalsimpl0(i, companion.m69593getStartJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return f13245b;
                }
                return f13247d;
            } else if (WindowInsetsSides.m69578equalsimpl0(i, companion.m69589getEndJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return f13247d;
                }
                return f13245b;
            } else {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            }
        }
    }

    Insets adjustInsets(Insets insets, int i);

    /* renamed from: consumedOffsets-MK-Hz9U  reason: not valid java name */
    long mo69545consumedOffsetsMKHz9U(long j);

    /* renamed from: consumedVelocity-QWom1Mo  reason: not valid java name */
    long mo69546consumedVelocityQWom1Mo(long j, float f);

    float hideMotion(float f, float f2);

    float motionOf(float f, float f2);

    float showMotion(float f, float f2);

    int valueOf(Insets insets);
}
