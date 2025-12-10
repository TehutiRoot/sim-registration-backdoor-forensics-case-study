package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.o */
/* loaded from: classes3.dex */
public abstract class AbstractC6610o implements Iterator {

    /* renamed from: a */
    public int f47287a;

    /* renamed from: b */
    public int f47288b;

    /* renamed from: c */
    public int f47289c;

    /* renamed from: d */
    public final /* synthetic */ zzba f47290d;

    public /* synthetic */ AbstractC6610o(zzba zzbaVar, zzav zzavVar) {
        int i;
        this.f47290d = zzbaVar;
        i = zzbaVar.zzf;
        this.f47287a = i;
        this.f47288b = zzbaVar.zze();
        this.f47289c = -1;
    }

    /* renamed from: a */
    public abstract Object mo46720a(int i);

    /* renamed from: b */
    public final void m46719b() {
        int i;
        i = this.f47290d.zzf;
        if (i == this.f47287a) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47288b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m46719b();
        if (hasNext()) {
            int i = this.f47288b;
            this.f47289c = i;
            Object mo46720a = mo46720a(i);
            this.f47288b = this.f47290d.zzf(this.f47288b);
            return mo46720a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        m46719b();
        if (this.f47289c >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzx.zzd(z, "no calls to next() since the last call to remove()");
        this.f47287a += 32;
        int i = this.f47289c;
        zzba zzbaVar = this.f47290d;
        zzbaVar.remove(zzba.zzg(zzbaVar, i));
        this.f47288b--;
        this.f47289c = -1;
    }
}
