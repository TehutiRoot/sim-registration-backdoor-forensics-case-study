package p000;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzas;

/* renamed from: Lc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17973Lc2 extends zzas {

    /* renamed from: a */
    public final /* synthetic */ OnMapReadyCallback f3508a;

    public BinderC17973Lc2(C18357Rc2 c18357Rc2, OnMapReadyCallback onMapReadyCallback) {
        this.f3508a = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f3508a.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
