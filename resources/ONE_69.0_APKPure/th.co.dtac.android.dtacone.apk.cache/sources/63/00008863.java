package com.fasterxml.jackson.databind.util;

/* loaded from: classes3.dex */
public abstract class PrimitiveArrayBuilder<T> {
    protected C6135a _bufferHead;
    protected C6135a _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    /* renamed from: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder$a */
    /* loaded from: classes3.dex */
    public static final class C6135a {

        /* renamed from: a */
        public final Object f43488a;

        /* renamed from: b */
        public final int f43489b;

        /* renamed from: c */
        public C6135a f43490c;

        public C6135a(Object obj, int i) {
            this.f43488a = obj;
            this.f43489b = i;
        }

        /* renamed from: a */
        public int m49379a(Object obj, int i) {
            System.arraycopy(this.f43488a, 0, obj, i, this.f43489b);
            return i + this.f43489b;
        }

        /* renamed from: b */
        public Object m49378b() {
            return this.f43488a;
        }

        /* renamed from: c */
        public void m49377c(C6135a c6135a) {
            if (this.f43490c == null) {
                this.f43490c = c6135a;
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public C6135a m49376d() {
            return this.f43490c;
        }
    }

    public abstract T _constructArray(int i);

    public void _reset() {
        C6135a c6135a = this._bufferTail;
        if (c6135a != null) {
            this._freeBuffer = (T) c6135a.m49378b();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t, int i) {
        int i2;
        C6135a c6135a = new C6135a(t, i);
        if (this._bufferHead == null) {
            this._bufferTail = c6135a;
            this._bufferHead = c6135a;
        } else {
            this._bufferTail.m49377c(c6135a);
            this._bufferTail = c6135a;
        }
        this._bufferedEntryCount += i;
        if (i < 16384) {
            i2 = i + i;
        } else {
            i2 = i + (i >> 2);
        }
        return _constructArray(i2);
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t, int i) {
        int i2 = this._bufferedEntryCount + i;
        T _constructArray = _constructArray(i2);
        int i3 = 0;
        for (C6135a c6135a = this._bufferHead; c6135a != null; c6135a = c6135a.m49376d()) {
            i3 = c6135a.m49379a(_constructArray, i3);
        }
        System.arraycopy(t, 0, _constructArray, i3, i);
        int i4 = i3 + i;
        if (i4 == i2) {
            return _constructArray;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i4);
    }

    public T resetAndStart() {
        _reset();
        T t = this._freeBuffer;
        if (t == null) {
            return _constructArray(12);
        }
        return t;
    }
}