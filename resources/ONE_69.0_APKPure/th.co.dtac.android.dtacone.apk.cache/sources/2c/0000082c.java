package p000;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzas;

/* renamed from: Id2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17815Id2 extends zzas {

    /* renamed from: a */
    public final /* synthetic */ OnMapReadyCallback f2734a;

    public BinderC17815Id2(C18205Od2 c18205Od2, OnMapReadyCallback onMapReadyCallback) {
        this.f2734a = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f2734a.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}