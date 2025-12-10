package com.jakewharton.rxrelay2;

import io.reactivex.functions.Predicate;

/* loaded from: classes5.dex */
public class AppendOnlyLinkedArrayList {

    /* renamed from: a */
    public final int f58335a;

    /* renamed from: b */
    public final Object[] f58336b;

    /* renamed from: c */
    public Object[] f58337c;

    /* renamed from: d */
    public int f58338d;

    /* loaded from: classes5.dex */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t);
    }

    public AppendOnlyLinkedArrayList(int i) {
        this.f58335a = i;
        Object[] objArr = new Object[i + 1];
        this.f58336b = objArr;
        this.f58337c = objArr;
    }

    /* renamed from: a */
    public boolean m33729a(Relay relay) {
        Object[] objArr = this.f58336b;
        int i = this.f58335a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                relay.accept(objArr2);
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: b */
    public void m33728b(Object obj) {
        int i = this.f58335a;
        int i2 = this.f58338d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f58337c[i] = objArr;
            this.f58337c = objArr;
            i2 = 0;
        }
        this.f58337c[i2] = obj;
        this.f58338d = i2 + 1;
    }

    /* renamed from: c */
    public void m33727c(NonThrowingPredicate nonThrowingPredicate) {
        int i = this.f58335a;
        for (Object[] objArr = this.f58336b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 != null && !nonThrowingPredicate.test(objArr2)) {
                }
            }
        }
    }
}
