package p000;

import androidx.compose.material.SliderColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: RE */
/* loaded from: classes.dex */
public final class C1207RE implements SliderColors {

    /* renamed from: a */
    public final long f5435a;

    /* renamed from: b */
    public final long f5436b;

    /* renamed from: c */
    public final long f5437c;

    /* renamed from: d */
    public final long f5438d;

    /* renamed from: e */
    public final long f5439e;

    /* renamed from: f */
    public final long f5440f;

    /* renamed from: g */
    public final long f5441g;

    /* renamed from: h */
    public final long f5442h;

    /* renamed from: i */
    public final long f5443i;

    /* renamed from: j */
    public final long f5444j;

    public /* synthetic */ C1207RE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1207RE.class != obj.getClass()) {
            return false;
        }
        C1207RE c1207re = (C1207RE) obj;
        if (Color.m71920equalsimpl0(this.f5435a, c1207re.f5435a) && Color.m71920equalsimpl0(this.f5436b, c1207re.f5436b) && Color.m71920equalsimpl0(this.f5437c, c1207re.f5437c) && Color.m71920equalsimpl0(this.f5438d, c1207re.f5438d) && Color.m71920equalsimpl0(this.f5439e, c1207re.f5439e) && Color.m71920equalsimpl0(this.f5440f, c1207re.f5440f) && Color.m71920equalsimpl0(this.f5441g, c1207re.f5441g) && Color.m71920equalsimpl0(this.f5442h, c1207re.f5442h) && Color.m71920equalsimpl0(this.f5443i, c1207re.f5443i) && Color.m71920equalsimpl0(this.f5444j, c1207re.f5444j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m71926hashCodeimpl(this.f5435a) * 31) + Color.m71926hashCodeimpl(this.f5436b)) * 31) + Color.m71926hashCodeimpl(this.f5437c)) * 31) + Color.m71926hashCodeimpl(this.f5438d)) * 31) + Color.m71926hashCodeimpl(this.f5439e)) * 31) + Color.m71926hashCodeimpl(this.f5440f)) * 31) + Color.m71926hashCodeimpl(this.f5441g)) * 31) + Color.m71926hashCodeimpl(this.f5442h)) * 31) + Color.m71926hashCodeimpl(this.f5443i)) * 31) + Color.m71926hashCodeimpl(this.f5444j);
    }

    @Override // androidx.compose.material.SliderColors
    public State thumbColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1086)");
        }
        if (z) {
            j = this.f5435a;
        } else {
            j = this.f5436b;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State tickColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1102)");
        }
        if (z) {
            if (z2) {
                j = this.f5441g;
            } else {
                j = this.f5442h;
            }
        } else if (z2) {
            j = this.f5443i;
        } else {
            j = this.f5444j;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State trackColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1091)");
        }
        if (z) {
            if (z2) {
                j = this.f5437c;
            } else {
                j = this.f5438d;
            }
        } else if (z2) {
            j = this.f5439e;
        } else {
            j = this.f5440f;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C1207RE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f5435a = j;
        this.f5436b = j2;
        this.f5437c = j3;
        this.f5438d = j4;
        this.f5439e = j5;
        this.f5440f = j6;
        this.f5441g = j7;
        this.f5442h = j8;
        this.f5443i = j9;
        this.f5444j = j10;
    }
}