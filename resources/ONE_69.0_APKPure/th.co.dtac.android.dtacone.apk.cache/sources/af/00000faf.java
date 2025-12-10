package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: QV */
/* loaded from: classes.dex */
public final class C1162QV {

    /* renamed from: a */
    public final Object f5238a;

    /* renamed from: b */
    public final Function3 f5239b;

    public C1162QV(Object obj, Function3 transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f5238a = obj;
        this.f5239b = transition;
    }

    /* renamed from: a */
    public final Object m66762a() {
        return this.f5238a;
    }

    /* renamed from: b */
    public final Function3 m66761b() {
        return this.f5239b;
    }

    /* renamed from: c */
    public final Object m66760c() {
        return this.f5238a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1162QV)) {
            return false;
        }
        C1162QV c1162qv = (C1162QV) obj;
        if (Intrinsics.areEqual(this.f5238a, c1162qv.f5238a) && Intrinsics.areEqual(this.f5239b, c1162qv.f5239b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f5238a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f5239b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f5238a + ", transition=" + this.f5239b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}