package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzw;
import com.google.android.gms.maps.model.Circle;

/* renamed from: com.google.android.gms.maps.t */
/* loaded from: classes3.dex */
public final class BinderC6674t extends zzw {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCircleClickListener f48057a;

    public BinderC6674t(GoogleMap googleMap, GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.f48057a = onCircleClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzx
    public final void zzb(zzl zzlVar) {
        this.f48057a.onCircleClick(new Circle(zzlVar));
    }
}