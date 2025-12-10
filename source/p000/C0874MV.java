package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: MV */
/* loaded from: classes.dex */
public final class C0874MV {

    /* renamed from: a */
    public final Object f3790a;

    /* renamed from: b */
    public final Function3 f3791b;

    public C0874MV(Object obj, Function3 transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f3790a = obj;
        this.f3791b = transition;
    }

    /* renamed from: a */
    public final Object m67379a() {
        return this.f3790a;
    }

    /* renamed from: b */
    public final Function3 m67378b() {
        return this.f3791b;
    }

    /* renamed from: c */
    public final Object m67377c() {
        return this.f3790a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0874MV)) {
            return false;
        }
        C0874MV c0874mv = (C0874MV) obj;
        if (Intrinsics.areEqual(this.f3790a, c0874mv.f3790a) && Intrinsics.areEqual(this.f3791b, c0874mv.f3791b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f3790a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f3791b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f3790a + ", transition=" + this.f3791b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
