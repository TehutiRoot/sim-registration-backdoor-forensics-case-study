package ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CyclicBuffer<E> {

    /* renamed from: a */
    public Object[] f39747a;

    /* renamed from: b */
    public int f39748b;

    /* renamed from: c */
    public int f39749c;

    /* renamed from: d */
    public int f39750d;

    /* renamed from: e */
    public int f39751e;

    public CyclicBuffer(int i) throws IllegalArgumentException {
        if (i >= 1) {
            m51529a(i);
            return;
        }
        throw new IllegalArgumentException("The maxSize argument (" + i + ") is not a positive integer.");
    }

    /* renamed from: a */
    public final void m51529a(int i) {
        this.f39751e = i;
        this.f39747a = new Object[i];
        this.f39748b = 0;
        this.f39749c = 0;
        this.f39750d = 0;
    }

    public void add(E e) {
        Object[] objArr = this.f39747a;
        int i = this.f39749c;
        objArr[i] = e;
        int i2 = i + 1;
        this.f39749c = i2;
        int i3 = this.f39751e;
        if (i2 == i3) {
            this.f39749c = 0;
        }
        int i4 = this.f39750d;
        if (i4 < i3) {
            this.f39750d = i4 + 1;
            return;
        }
        int i5 = this.f39748b + 1;
        this.f39748b = i5;
        if (i5 == i3) {
            this.f39748b = 0;
        }
    }

    public List<E> asList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length(); i++) {
            arrayList.add(get(i));
        }
        return arrayList;
    }

    public void clear() {
        m51529a(this.f39751e);
    }

    public E get() {
        int i = this.f39750d;
        if (i > 0) {
            this.f39750d = i - 1;
            Object[] objArr = this.f39747a;
            int i2 = this.f39748b;
            E e = (E) objArr[i2];
            objArr[i2] = null;
            int i3 = i2 + 1;
            this.f39748b = i3;
            if (i3 == this.f39751e) {
                this.f39748b = 0;
            }
            return e;
        }
        return null;
    }

    public int getMaxSize() {
        return this.f39751e;
    }

    public int length() {
        return this.f39750d;
    }

    public void resize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative array size [" + i + "] not allowed.");
        }
        int i2 = this.f39750d;
        if (i == i2) {
            return;
        }
        Object[] objArr = new Object[i];
        if (i < i2) {
            i2 = i;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Object[] objArr2 = this.f39747a;
            int i4 = this.f39748b;
            objArr[i3] = objArr2[i4];
            objArr2[i4] = null;
            int i5 = i4 + 1;
            this.f39748b = i5;
            if (i5 == this.f39750d) {
                this.f39748b = 0;
            }
        }
        this.f39747a = objArr;
        this.f39748b = 0;
        this.f39750d = i2;
        this.f39751e = i;
        if (i2 == i) {
            this.f39749c = 0;
        } else {
            this.f39749c = i2;
        }
    }

    public CyclicBuffer(CyclicBuffer<E> cyclicBuffer) {
        int i = cyclicBuffer.f39751e;
        this.f39751e = i;
        Object[] objArr = new Object[i];
        this.f39747a = objArr;
        System.arraycopy(cyclicBuffer.f39747a, 0, objArr, 0, i);
        this.f39749c = cyclicBuffer.f39749c;
        this.f39748b = cyclicBuffer.f39748b;
        this.f39750d = cyclicBuffer.f39750d;
    }

    public E get(int i) {
        if (i < 0 || i >= this.f39750d) {
            return null;
        }
        return (E) this.f39747a[(this.f39748b + i) % this.f39751e];
    }
}