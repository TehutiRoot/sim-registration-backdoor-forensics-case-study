package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class Ticker {

    /* renamed from: a */
    public static final Ticker f52805a = new C7454a();

    /* renamed from: com.google.common.base.Ticker$a */
    /* loaded from: classes4.dex */
    public class C7454a extends Ticker {
        @Override // com.google.common.base.Ticker
        public long read() {
            return System.nanoTime();
        }
    }

    public static Ticker systemTicker() {
        return f52805a;
    }

    public abstract long read();
}
