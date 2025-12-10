package p000;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzas;

/* renamed from: mb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC21094mb2 extends zzas {

    /* renamed from: a */
    public final /* synthetic */ OnMapReadyCallback f71931a;

    public BinderC21094mb2(C22298tb2 c22298tb2, OnMapReadyCallback onMapReadyCallback) {
        this.f71931a = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f71931a.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
