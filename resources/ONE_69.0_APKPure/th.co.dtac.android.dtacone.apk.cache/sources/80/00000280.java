package p000;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzas;

/* renamed from: Cc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17422Cc2 extends zzas {

    /* renamed from: a */
    public final /* synthetic */ OnMapReadyCallback f785a;

    public BinderC17422Cc2(C17617Fc2 c17617Fc2, OnMapReadyCallback onMapReadyCallback) {
        this.f785a = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f785a.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}