package io.reactivex.internal.util;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public class LinkedArrayList {

    /* renamed from: a */
    public final int f66182a;

    /* renamed from: b */
    public Object[] f66183b;

    /* renamed from: c */
    public Object[] f66184c;

    /* renamed from: d */
    public volatile int f66185d;

    /* renamed from: e */
    public int f66186e;

    public LinkedArrayList(int i) {
        this.f66182a = i;
    }

    public void add(Object obj) {
        if (this.f66185d == 0) {
            Object[] objArr = new Object[this.f66182a + 1];
            this.f66183b = objArr;
            this.f66184c = objArr;
            objArr[0] = obj;
            this.f66186e = 1;
            this.f66185d = 1;
            return;
        }
        int i = this.f66186e;
        int i2 = this.f66182a;
        if (i == i2) {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f66184c[i2] = objArr2;
            this.f66184c = objArr2;
            this.f66186e = 1;
            this.f66185d++;
            return;
        }
        this.f66184c[i] = obj;
        this.f66186e = i + 1;
        this.f66185d++;
    }

    public Object[] head() {
        return this.f66183b;
    }

    public int size() {
        return this.f66185d;
    }

    public String toString() {
        int i = this.f66182a;
        int i2 = this.f66185d;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] head = head();
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (i3 < i2) {
                arrayList.add(head[i4]);
                i3++;
                i4++;
                if (i4 == i) {
                    break;
                }
            }
            return arrayList.toString();
            head = head[i];
        }
    }
}