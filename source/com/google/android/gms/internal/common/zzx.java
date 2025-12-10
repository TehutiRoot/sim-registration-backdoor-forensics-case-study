package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
public final class zzx {

    /* renamed from: a */
    public final zzo f45670a;

    /* renamed from: b */
    public final boolean f45671b;

    /* renamed from: c */
    public final VJ2 f45672c;

    public zzx(VJ2 vj2, boolean z, zzo zzoVar, int i) {
        this.f45672c = vj2;
        this.f45671b = z;
        this.f45670a = zzoVar;
    }

    public static zzx zzc(zzo zzoVar) {
        return new zzx(new VJ2(zzoVar), false, LH2.f3432b, Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public final Iterator m48074d(CharSequence charSequence) {
        return new MJ2(this.f45672c, this, charSequence);
    }

    public final zzx zzb() {
        return new zzx(this.f45672c, true, this.f45670a, Integer.MAX_VALUE);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new C20369iK2(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator m48074d = m48074d(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m48074d.hasNext()) {
            arrayList.add((String) m48074d.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
