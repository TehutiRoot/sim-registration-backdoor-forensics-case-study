package p046rx.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rx.internal.util.LinkedArrayList */
/* loaded from: classes7.dex */
public class LinkedArrayList {

    /* renamed from: a */
    public final int f79199a;

    /* renamed from: b */
    public Object[] f79200b;

    /* renamed from: c */
    public Object[] f79201c;

    /* renamed from: d */
    public volatile int f79202d;

    /* renamed from: e */
    public int f79203e;

    public LinkedArrayList(int i) {
        this.f79199a = i;
    }

    /* renamed from: a */
    public List m22882a() {
        int i = this.f79199a;
        int i2 = this.f79202d;
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
            return arrayList;
            head = head[i];
        }
    }

    public void add(Object obj) {
        if (this.f79202d == 0) {
            Object[] objArr = new Object[this.f79199a + 1];
            this.f79200b = objArr;
            this.f79201c = objArr;
            objArr[0] = obj;
            this.f79203e = 1;
            this.f79202d = 1;
            return;
        }
        int i = this.f79203e;
        int i2 = this.f79199a;
        if (i == i2) {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f79201c[i2] = objArr2;
            this.f79201c = objArr2;
            this.f79203e = 1;
            this.f79202d++;
            return;
        }
        this.f79201c[i] = obj;
        this.f79203e = i + 1;
        this.f79202d++;
    }

    public int capacityHint() {
        return this.f79199a;
    }

    public Object[] head() {
        return this.f79200b;
    }

    public int indexInTail() {
        return this.f79203e;
    }

    public int size() {
        return this.f79202d;
    }

    public Object[] tail() {
        return this.f79201c;
    }

    public String toString() {
        return m22882a().toString();
    }
}
