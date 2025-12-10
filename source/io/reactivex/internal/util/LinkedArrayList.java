package io.reactivex.internal.util;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public class LinkedArrayList {

    /* renamed from: a */
    public final int f66119a;

    /* renamed from: b */
    public Object[] f66120b;

    /* renamed from: c */
    public Object[] f66121c;

    /* renamed from: d */
    public volatile int f66122d;

    /* renamed from: e */
    public int f66123e;

    public LinkedArrayList(int i) {
        this.f66119a = i;
    }

    public void add(Object obj) {
        if (this.f66122d == 0) {
            Object[] objArr = new Object[this.f66119a + 1];
            this.f66120b = objArr;
            this.f66121c = objArr;
            objArr[0] = obj;
            this.f66123e = 1;
            this.f66122d = 1;
            return;
        }
        int i = this.f66123e;
        int i2 = this.f66119a;
        if (i == i2) {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f66121c[i2] = objArr2;
            this.f66121c = objArr2;
            this.f66123e = 1;
            this.f66122d++;
            return;
        }
        this.f66121c[i] = obj;
        this.f66123e = i + 1;
        this.f66122d++;
    }

    public Object[] head() {
        return this.f66120b;
    }

    public int size() {
        return this.f66122d;
    }

    public String toString() {
        int i = this.f66119a;
        int i2 = this.f66122d;
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
