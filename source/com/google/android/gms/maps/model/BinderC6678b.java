package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.maps.model.FeatureLayer;

/* renamed from: com.google.android.gms.maps.model.b */
/* loaded from: classes3.dex */
public final class BinderC6678b extends zzai {

    /* renamed from: a */
    public final /* synthetic */ FeatureLayer.OnFeatureClickListener f48038a;

    public BinderC6678b(FeatureLayer featureLayer, FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        this.f48038a = onFeatureClickListener;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzb(com.google.android.gms.internal.maps.zzm zzmVar) {
        this.f48038a.onFeatureClick(new FeatureClickEvent(zzmVar));
    }
}
