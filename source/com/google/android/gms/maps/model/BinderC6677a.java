package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzaq;
import com.google.android.gms.maps.model.FeatureLayer;

/* renamed from: com.google.android.gms.maps.model.a */
/* loaded from: classes3.dex */
public final class BinderC6677a extends zzaq {

    /* renamed from: a */
    public final /* synthetic */ FeatureLayer.StyleFactory f48037a;

    public BinderC6677a(FeatureLayer featureLayer, FeatureLayer.StyleFactory styleFactory) {
        this.f48037a = styleFactory;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final FeatureStyle zzb(com.google.android.gms.internal.maps.zzp zzpVar) {
        Feature m46395a = Feature.m46395a(zzpVar);
        if (m46395a == null) {
            return null;
        }
        return this.f48037a.getStyle(m46395a);
    }
}
