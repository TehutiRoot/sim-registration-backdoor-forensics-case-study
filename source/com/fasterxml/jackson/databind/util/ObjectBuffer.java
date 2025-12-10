package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes3.dex */
public final class ObjectBuffer {

    /* renamed from: a */
    public LinkedNode f43472a;

    /* renamed from: b */
    public LinkedNode f43473b;

    /* renamed from: c */
    public int f43474c;

    /* renamed from: d */
    public Object[] f43475d;

    public final void _copyTo(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (LinkedNode linkedNode = this.f43472a; linkedNode != null; linkedNode = linkedNode.next()) {
            Object[] objArr2 = (Object[]) linkedNode.value();
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 == i) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
    }

    public void _reset() {
        LinkedNode linkedNode = this.f43473b;
        if (linkedNode != null) {
            this.f43475d = (Object[]) linkedNode.value();
        }
        this.f43473b = null;
        this.f43472a = null;
        this.f43474c = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode linkedNode = new LinkedNode(objArr, null);
        if (this.f43472a == null) {
            this.f43473b = linkedNode;
            this.f43472a = linkedNode;
        } else {
            this.f43473b.linkNext(linkedNode);
            this.f43473b = linkedNode;
        }
        int length = objArr.length;
        this.f43474c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int bufferedSize() {
        return this.f43474c;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i) {
        int i2 = this.f43474c + i;
        Object[] objArr2 = new Object[i2];
        _copyTo(objArr2, i2, objArr, i);
        _reset();
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this.f43475d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this.f43475d;
        if (objArr == null) {
            Object[] objArr2 = new Object[12];
            this.f43475d = objArr2;
            return objArr2;
        }
        return objArr;
    }

    public Object[] resetAndStart(Object[] objArr, int i) {
        _reset();
        Object[] objArr2 = this.f43475d;
        if (objArr2 == null || objArr2.length < i) {
            this.f43475d = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.f43475d, 0, i);
        return this.f43475d;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.f43474c + i;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        _copyTo(tArr, i2, objArr, i);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i, List<Object> list) {
        int i2;
        LinkedNode linkedNode = this.f43472a;
        while (true) {
            i2 = 0;
            if (linkedNode == null) {
                break;
            }
            Object[] objArr2 = (Object[]) linkedNode.value();
            int length = objArr2.length;
            while (i2 < length) {
                list.add(objArr2[i2]);
                i2++;
            }
            linkedNode = linkedNode.next();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        _reset();
    }
}
