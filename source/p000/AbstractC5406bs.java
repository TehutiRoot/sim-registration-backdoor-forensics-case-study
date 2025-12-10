package p000;

import com.google.common.base.Preconditions;

/* renamed from: bs */
/* loaded from: classes4.dex */
public abstract class AbstractC5406bs {
    /* renamed from: a */
    public static void m51815a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    /* renamed from: b */
    public static int m51814b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: c */
    public static long m51813c(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j);
    }

    /* renamed from: d */
    public static void m51812d(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i);
    }

    /* renamed from: e */
    public static void m51811e(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
