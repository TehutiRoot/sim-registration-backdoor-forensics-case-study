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
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u001d\u0010%\u001a\u00020\u00028AX\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m29142d2 = {"Landroidx/compose/material3/NavigationRailItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "enabled", "Landroidx/compose/runtime/State;", "iconColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "iconColor", "textColor$material3_release", "textColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "getIndicatorColor", "(Landroidx/compose/runtime/Composer;I)J", "indicatorColor", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavigationRailItemColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26003a;

    /* renamed from: b */
    public final long f26004b;

    /* renamed from: c */
    public final long f26005c;

    /* renamed from: d */
    public final long f26006d;

    /* renamed from: e */
    public final long f26007e;

    /* renamed from: f */
    public final long f26008f;

    /* renamed from: g */
    public final long f26009g;

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
        if (Color.m71920equalsimpl0(this.f26003a, navigationRailItemColors.f26003a) && Color.m71920equalsimpl0(this.f26006d, navigationRailItemColors.f26006d) && Color.m71920equalsimpl0(this.f26004b, navigationRailItemColors.f26004b) && Color.m71920equalsimpl0(this.f26007e, navigationRailItemColors.f26007e) && Color.m71920equalsimpl0(this.f26005c, navigationRailItemColors.f26005c) && Color.m71920equalsimpl0(this.f26008f, navigationRailItemColors.f26008f) && Color.m71920equalsimpl0(this.f26009g, navigationRailItemColors.f26009g)) {
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
        long j = this.f26005c;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public int hashCode() {
        return (((((((((((Color.m71926hashCodeimpl(this.f26003a) * 31) + Color.m71926hashCodeimpl(this.f26006d)) * 31) + Color.m71926hashCodeimpl(this.f26004b)) * 31) + Color.m71926hashCodeimpl(this.f26007e)) * 31) + Color.m71926hashCodeimpl(this.f26005c)) * 31) + Color.m71926hashCodeimpl(this.f26008f)) * 31) + Color.m71926hashCodeimpl(this.f26009g);
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
            j = this.f26008f;
        } else if (z) {
            j = this.f26003a;
        } else {
            j = this.f26006d;
        }
        State<Color> m69428animateColorAsStateeuL9pac = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69428animateColorAsStateeuL9pac;
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
            j = this.f26009g;
        } else if (z) {
            j = this.f26004b;
        } else {
            j = this.f26007e;
        }
        State<Color> m69428animateColorAsStateeuL9pac = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69428animateColorAsStateeuL9pac;
    }

    public NavigationRailItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f26003a = j;
        this.f26004b = j2;
        this.f26005c = j3;
        this.f26006d = j4;
        this.f26007e = j5;
        this.f26008f = j6;
        this.f26009g = j7;
    }
}