package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzy;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzaa;
import com.google.android.gms.maps.model.IndoorBuilding;

/* renamed from: com.google.android.gms.maps.q */
/* loaded from: classes3.dex */
public final class BinderC6682q extends zzaa {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnIndoorStateChangeListener f48042a;

    public BinderC6682q(GoogleMap googleMap, GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f48042a = onIndoorStateChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzb() {
        this.f48042a.onIndoorBuildingFocused();
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzc(zzy zzyVar) {
        this.f48042a.onIndoorLevelActivated(new IndoorBuilding(zzyVar));
    }
}
