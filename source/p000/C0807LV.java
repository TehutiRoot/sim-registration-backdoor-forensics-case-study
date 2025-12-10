package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: LV */
/* loaded from: classes2.dex */
public final class C0807LV {

    /* renamed from: a */
    public final Object f3478a;

    /* renamed from: b */
    public final Function3 f3479b;

    public C0807LV(Object obj, Function3 transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f3478a = obj;
        this.f3479b = transition;
    }

    /* renamed from: a */
    public final Object m67517a() {
        return this.f3478a;
    }

    /* renamed from: b */
    public final Function3 m67516b() {
        return this.f3479b;
    }

    /* renamed from: c */
    public final Object m67515c() {
        return this.f3478a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0807LV)) {
            return false;
        }
        C0807LV c0807lv = (C0807LV) obj;
        if (Intrinsics.areEqual(this.f3478a, c0807lv.f3478a) && Intrinsics.areEqual(this.f3479b, c0807lv.f3479b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f3478a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f3479b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f3478a + ", transition=" + this.f3479b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
