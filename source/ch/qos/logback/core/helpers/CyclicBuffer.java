package ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CyclicBuffer<E> {

    /* renamed from: a */
    public Object[] f39749a;

    /* renamed from: b */
    public int f39750b;

    /* renamed from: c */
    public int f39751c;

    /* renamed from: d */
    public int f39752d;

    /* renamed from: e */
    public int f39753e;

    public CyclicBuffer(int i) throws IllegalArgumentException {
        if (i >= 1) {
            m51534a(i);
            return;
        }
        throw new IllegalArgumentException("The maxSize argument (" + i + ") is not a positive integer.");
    }

    /* renamed from: a */
    public final void m51534a(int i) {
        this.f39753e = i;
        this.f39749a = new Object[i];
        this.f39750b = 0;
        this.f39751c = 0;
        this.f39752d = 0;
    }

    public void add(E e) {
        Object[] objArr = this.f39749a;
        int i = this.f39751c;
        objArr[i] = e;
        int i2 = i + 1;
        this.f39751c = i2;
        int i3 = this.f39753e;
        if (i2 == i3) {
            this.f39751c = 0;
        }
        int i4 = this.f39752d;
        if (i4 < i3) {
            this.f39752d = i4 + 1;
            return;
        }
        int i5 = this.f39750b + 1;
        this.f39750b = i5;
        if (i5 == i3) {
            this.f39750b = 0;
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
        m51534a(this.f39753e);
    }

    public E get() {
        int i = this.f39752d;
        if (i > 0) {
            this.f39752d = i - 1;
            Object[] objArr = this.f39749a;
            int i2 = this.f39750b;
            E e = (E) objArr[i2];
            objArr[i2] = null;
            int i3 = i2 + 1;
            this.f39750b = i3;
            if (i3 == this.f39753e) {
                this.f39750b = 0;
            }
            return e;
        }
        return null;
    }

    public int getMaxSize() {
        return this.f39753e;
    }

    public int length() {
        return this.f39752d;
    }

    public void resize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative array size [" + i + "] not allowed.");
        }
        int i2 = this.f39752d;
        if (i == i2) {
            return;
        }
        Object[] objArr = new Object[i];
        if (i < i2) {
            i2 = i;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Object[] objArr2 = this.f39749a;
            int i4 = this.f39750b;
            objArr[i3] = objArr2[i4];
            objArr2[i4] = null;
            int i5 = i4 + 1;
            this.f39750b = i5;
            if (i5 == this.f39752d) {
                this.f39750b = 0;
            }
        }
        this.f39749a = objArr;
        this.f39750b = 0;
        this.f39752d = i2;
        this.f39753e = i;
        if (i2 == i) {
            this.f39751c = 0;
        } else {
            this.f39751c = i2;
        }
    }

    public CyclicBuffer(CyclicBuffer<E> cyclicBuffer) {
        int i = cyclicBuffer.f39753e;
        this.f39753e = i;
        Object[] objArr = new Object[i];
        this.f39749a = objArr;
        System.arraycopy(cyclicBuffer.f39749a, 0, objArr, 0, i);
        this.f39751c = cyclicBuffer.f39751c;
        this.f39750b = cyclicBuffer.f39750b;
        this.f39752d = cyclicBuffer.f39752d;
    }

    public E get(int i) {
        if (i < 0 || i >= this.f39752d) {
            return null;
        }
        return (E) this.f39749a[(this.f39750b + i) % this.f39753e];
    }
}
