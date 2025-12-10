package p046rx.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rx.internal.util.LinkedArrayList */
/* loaded from: classes7.dex */
public class LinkedArrayList {

    /* renamed from: a */
    public final int f79405a;

    /* renamed from: b */
    public Object[] f79406b;

    /* renamed from: c */
    public Object[] f79407c;

    /* renamed from: d */
    public volatile int f79408d;

    /* renamed from: e */
    public int f79409e;

    public LinkedArrayList(int i) {
        this.f79405a = i;
    }

    /* renamed from: a */
    public List m23070a() {
        int i = this.f79405a;
        int i2 = this.f79408d;
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
        if (this.f79408d == 0) {
            Object[] objArr = new Object[this.f79405a + 1];
            this.f79406b = objArr;
            this.f79407c = objArr;
            objArr[0] = obj;
            this.f79409e = 1;
            this.f79408d = 1;
            return;
        }
        int i = this.f79409e;
        int i2 = this.f79405a;
        if (i == i2) {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f79407c[i2] = objArr2;
            this.f79407c = objArr2;
            this.f79409e = 1;
            this.f79408d++;
            return;
        }
        this.f79407c[i] = obj;
        this.f79409e = i + 1;
        this.f79408d++;
    }

    public int capacityHint() {
        return this.f79405a;
    }

    public Object[] head() {
        return this.f79406b;
    }

    public int indexInTail() {
        return this.f79409e;
    }

    public int size() {
        return this.f79408d;
    }

    public Object[] tail() {
        return this.f79407c;
    }

    public String toString() {
        return m23070a().toString();
    }
}