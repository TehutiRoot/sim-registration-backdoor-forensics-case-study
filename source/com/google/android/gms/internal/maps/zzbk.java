package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbk {

    /* renamed from: a */
    public Object[] f46191a;

    /* renamed from: b */
    public int f46192b;

    /* renamed from: c */
    public C21963re2 f46193c;

    public zzbk() {
        this(4);
    }

    /* renamed from: a */
    public final void m47408a(int i) {
        Object[] objArr = this.f46191a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f46191a = Arrays.copyOf(objArr, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbk zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            m47408a(this.f46192b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            m47408a(this.f46192b + 1);
            AbstractC18744Xd2.m65471a(key, value);
            Object[] objArr = this.f46191a;
            int i = this.f46192b;
            int i2 = i + i;
            objArr[i2] = key;
            objArr[i2 + 1] = value;
            this.f46192b = i + 1;
        }
        return this;
    }

    public zzbk(int i) {
        this.f46191a = new Object[i + i];
        this.f46192b = 0;
    }
}
