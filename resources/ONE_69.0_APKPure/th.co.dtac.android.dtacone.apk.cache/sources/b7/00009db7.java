package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzy;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzaa;
import com.google.android.gms.maps.model.IndoorBuilding;

/* renamed from: com.google.android.gms.maps.q */
/* loaded from: classes3.dex */
public final class BinderC6671q extends zzaa {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnIndoorStateChangeListener f48054a;

    public BinderC6671q(GoogleMap googleMap, GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f48054a = onIndoorStateChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzb() {
        this.f48054a.onIndoorBuildingFocused();
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzc(zzy zzyVar) {
        this.f48054a.onIndoorLevelActivated(new IndoorBuilding(zzyVar));
    }
}