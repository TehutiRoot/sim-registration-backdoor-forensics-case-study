package com.fasterxml.jackson.databind.util;

/* loaded from: classes3.dex */
public abstract class PrimitiveArrayBuilder<T> {
    protected C6146a _bufferHead;
    protected C6146a _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    /* renamed from: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder$a */
    /* loaded from: classes3.dex */
    public static final class C6146a {

        /* renamed from: a */
        public final Object f43476a;

        /* renamed from: b */
        public final int f43477b;

        /* renamed from: c */
        public C6146a f43478c;

        public C6146a(Object obj, int i) {
            this.f43476a = obj;
            this.f43477b = i;
        }

        /* renamed from: a */
        public int m49382a(Object obj, int i) {
            System.arraycopy(this.f43476a, 0, obj, i, this.f43477b);
            return i + this.f43477b;
        }

        /* renamed from: b */
        public Object m49381b() {
            return this.f43476a;
        }

        /* renamed from: c */
        public void m49380c(C6146a c6146a) {
            if (this.f43478c == null) {
                this.f43478c = c6146a;
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public C6146a m49379d() {
            return this.f43478c;
        }
    }

    public abstract T _constructArray(int i);

    public void _reset() {
        C6146a c6146a = this._bufferTail;
        if (c6146a != null) {
            this._freeBuffer = (T) c6146a.m49381b();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t, int i) {
        int i2;
        C6146a c6146a = new C6146a(t, i);
        if (this._bufferHead == null) {
            this._bufferTail = c6146a;
            this._bufferHead = c6146a;
        } else {
            this._bufferTail.m49380c(c6146a);
            this._bufferTail = c6146a;
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
        for (C6146a c6146a = this._bufferHead; c6146a != null; c6146a = c6146a.m49379d()) {
            i3 = c6146a.m49382a(_constructArray, i3);
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
