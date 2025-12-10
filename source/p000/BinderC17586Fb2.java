package p000;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzas;

/* renamed from: Fb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17586Fb2 extends zzas {

    /* renamed from: a */
    public final /* synthetic */ OnMapReadyCallback f1646a;

    public BinderC17586Fb2(C17778Ib2 c17778Ib2, OnMapReadyCallback onMapReadyCallback) {
        this.f1646a = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f1646a.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
