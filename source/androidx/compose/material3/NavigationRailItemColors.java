package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u001d\u0010%\u001a\u00020\u00028AX\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m28850d2 = {"Landroidx/compose/material3/NavigationRailItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "enabled", "Landroidx/compose/runtime/State;", "iconColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "iconColor", "textColor$material3_release", "textColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "getIndicatorColor", "(Landroidx/compose/runtime/Composer;I)J", "indicatorColor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavigationRailItemColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f25915a;

    /* renamed from: b */
    public final long f25916b;

    /* renamed from: c */
    public final long f25917c;

    /* renamed from: d */
    public final long f25918d;

    /* renamed from: e */
    public final long f25919e;

    /* renamed from: f */
    public final long f25920f;

    /* renamed from: g */
    public final long f25921g;

    public /* synthetic */ NavigationRailItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        if (Color.m71736equalsimpl0(this.f25915a, navigationRailItemColors.f25915a) && Color.m71736equalsimpl0(this.f25918d, navigationRailItemColors.f25918d) && Color.m71736equalsimpl0(this.f25916b, navigationRailItemColors.f25916b) && Color.m71736equalsimpl0(this.f25919e, navigationRailItemColors.f25919e) && Color.m71736equalsimpl0(this.f25917c, navigationRailItemColors.f25917c) && Color.m71736equalsimpl0(this.f25920f, navigationRailItemColors.f25920f) && Color.m71736equalsimpl0(this.f25921g, navigationRailItemColors.f25921g)) {
            return true;
        }
        return false;
    }

    @Composable
    @JvmName(name = "getIndicatorColor")
    public final long getIndicatorColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(618271448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618271448, i, -1, "androidx.compose.material3.NavigationRailItemColors.<get-indicatorColor> (NavigationRail.kt:382)");
        }
        long j = this.f25917c;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public int hashCode() {
        return (((((((((((Color.m71742hashCodeimpl(this.f25915a) * 31) + Color.m71742hashCodeimpl(this.f25918d)) * 31) + Color.m71742hashCodeimpl(this.f25916b)) * 31) + Color.m71742hashCodeimpl(this.f25919e)) * 31) + Color.m71742hashCodeimpl(this.f25917c)) * 31) + Color.m71742hashCodeimpl(this.f25920f)) * 31) + Color.m71742hashCodeimpl(this.f25921g);
    }

    @Composable
    @NotNull
    public final State<Color> iconColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(2131995553);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2131995553, i, -1, "androidx.compose.material3.NavigationRailItemColors.iconColor (NavigationRail.kt:348)");
        }
        if (!z2) {
            j = this.f25920f;
        } else if (z) {
            j = this.f25915a;
        } else {
            j = this.f25918d;
        }
        State<Color> m69242animateColorAsStateeuL9pac = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69242animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> textColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-758555563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-758555563, i, -1, "androidx.compose.material3.NavigationRailItemColors.textColor (NavigationRail.kt:367)");
        }
        if (!z2) {
            j = this.f25921g;
        } else if (z) {
            j = this.f25916b;
        } else {
            j = this.f25919e;
        }
        State<Color> m69242animateColorAsStateeuL9pac = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69242animateColorAsStateeuL9pac;
    }

    public NavigationRailItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f25915a = j;
        this.f25916b = j2;
        this.f25917c = j3;
        this.f25918d = j4;
        this.f25919e = j5;
        this.f25920f = j6;
        this.f25921g = j7;
    }
}
