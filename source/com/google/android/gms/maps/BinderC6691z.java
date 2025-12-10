package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzaj;
import com.google.android.gms.maps.internal.zzj;

/* renamed from: com.google.android.gms.maps.z */
/* loaded from: classes3.dex */
public final class BinderC6691z extends zzj {

    /* renamed from: a */
    public final /* synthetic */ LocationSource f48051a;

    public BinderC6691z(GoogleMap googleMap, LocationSource locationSource) {
        this.f48051a = locationSource;
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void activate(zzaj zzajVar) {
        this.f48051a.activate(new C6683r(this, zzajVar));
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void deactivate() {
        this.f48051a.deactivate();
    }
}
