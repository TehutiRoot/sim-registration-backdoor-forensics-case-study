package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import org.apache.commons.cli.HelpFormatter;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class MutablePair<T> {

    /* renamed from: a */
    public Object f41319a;

    /* renamed from: b */
    public Object f41320b;

    /* renamed from: a */
    public static boolean m50794a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!m50794a(pair.first, this.f41319a) || !m50794a(pair.second, this.f41320b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f41319a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f41320b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public void set(T t, T t2) {
        this.f41319a = t;
        this.f41320b = t2;
    }

    public String toString() {
        return "Pair{" + this.f41319a + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f41320b + "}";
    }
}