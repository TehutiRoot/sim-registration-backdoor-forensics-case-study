package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.cache.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
final class LongAdder extends Striped64 implements Serializable, InterfaceC17970Km0 {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // p000.InterfaceC17970Km0
    public void add(long j) {
        int length;
        Striped64.C7522b c7522b;
        Striped64.C7522b[] c7522bArr = this.cells;
        if (c7522bArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.threadHashCode.get();
        boolean z = true;
        if (iArr != null && c7522bArr != null && (length = c7522bArr.length) >= 1 && (c7522b = c7522bArr[(length - 1) & iArr[0]]) != null) {
            long j3 = c7522b.f52983a;
            z = c7522b.m41114a(j3, j3 + j);
            if (z) {
                return;
            }
        }
        retryUpdate(j, iArr, z);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) sum();
    }

    @Override // com.google.common.cache.Striped64
    /* renamed from: fn */
    public final long mo41116fn(long j, long j2) {
        return j + j2;
    }

    @Override // p000.InterfaceC17970Km0
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void reset() {
        internalReset(0L);
    }

    @Override // p000.InterfaceC17970Km0
    public long sum() {
        long j = this.base;
        Striped64.C7522b[] c7522bArr = this.cells;
        if (c7522bArr != null) {
            for (Striped64.C7522b c7522b : c7522bArr) {
                if (c7522b != null) {
                    j += c7522b.f52983a;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.base;
        Striped64.C7522b[] c7522bArr = this.cells;
        this.base = 0L;
        if (c7522bArr != null) {
            for (Striped64.C7522b c7522b : c7522bArr) {
                if (c7522b != null) {
                    j += c7522b.f52983a;
                    c7522b.f52983a = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}