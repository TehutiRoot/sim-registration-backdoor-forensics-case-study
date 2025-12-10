package com.netcetera.threeds.sdk.infrastructure;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.og */
/* loaded from: classes5.dex */
public final class C9663og<T> implements Serializable {
    private final Comparator<T> get;
    private final T valueOf;
    private final T values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.og$values */
    /* loaded from: classes5.dex */
    public enum values implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    private C9663og(T t, T t2, Comparator<T> comparator) {
        if (t != null && t2 != null) {
            if (comparator == null) {
                this.get = values.INSTANCE;
            } else {
                this.get = comparator;
            }
            if (this.get.compare(t, t2) < 1) {
                this.values = t;
                this.valueOf = t2;
                return;
            }
            this.values = t2;
            this.valueOf = t;
            return;
        }
        throw new IllegalArgumentException("Elements in a range must not be null: element1=" + t + ", element2=" + t2);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lcom/netcetera/threeds/sdk/infrastructure/og<TT;>; */
    public static C9663og ThreeDS2ServiceInstance(Comparable comparable, Comparable comparable2) {
        return get(comparable, comparable2, null);
    }

    public static <T> C9663og<T> get(T t, T t2, Comparator<T> comparator) {
        return new C9663og<>(t, t2, comparator);
    }

    public boolean valueOf(T t) {
        if (t == null || this.get.compare(t, this.values) <= -1 || this.get.compare(t, this.valueOf) >= 1) {
            return false;
        }
        return true;
    }
}
