package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: PV */
/* loaded from: classes2.dex */
public final class C1094PV {

    /* renamed from: a */
    public final Object f4816a;

    /* renamed from: b */
    public final Function3 f4817b;

    public C1094PV(Object obj, Function3 transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f4816a = obj;
        this.f4817b = transition;
    }

    /* renamed from: a */
    public final Object m66962a() {
        return this.f4816a;
    }

    /* renamed from: b */
    public final Function3 m66961b() {
        return this.f4817b;
    }

    /* renamed from: c */
    public final Object m66960c() {
        return this.f4816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1094PV)) {
            return false;
        }
        C1094PV c1094pv = (C1094PV) obj;
        if (Intrinsics.areEqual(this.f4816a, c1094pv.f4816a) && Intrinsics.areEqual(this.f4817b, c1094pv.f4817b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f4816a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f4817b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f4816a + ", transition=" + this.f4817b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}