package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzmn {

    /* renamed from: a */
    public final zzlw f45949a;

    /* renamed from: b */
    public final boolean f45950b;

    /* renamed from: c */
    public final InterfaceC21220nH2 f45951c;

    /* renamed from: d */
    public final int f45952d;

    public zzmn(InterfaceC21220nH2 interfaceC21220nH2) {
        this(interfaceC21220nH2, false, C20185hG2.f62457b, Integer.MAX_VALUE);
    }

    public static zzmn zza(zzlw zzlwVar) {
        zzml.checkNotNull(zzlwVar);
        return new zzmn(new XG2(zzlwVar));
    }

    public zzmn(InterfaceC21220nH2 interfaceC21220nH2, boolean z, zzlw zzlwVar, int i) {
        this.f45951c = interfaceC21220nH2;
        this.f45950b = false;
        this.f45949a = zzlwVar;
        this.f45952d = Integer.MAX_VALUE;
    }

    public final List<String> zza(CharSequence charSequence) {
        zzml.checkNotNull(charSequence);
        Iterator mo26145a = this.f45951c.mo26145a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mo26145a.hasNext()) {
            arrayList.add((String) mo26145a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
