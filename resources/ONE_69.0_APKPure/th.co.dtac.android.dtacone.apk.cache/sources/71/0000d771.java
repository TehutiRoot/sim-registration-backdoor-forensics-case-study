package p000;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzas;

/* renamed from: jc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC20637jc2 extends zzas {

    /* renamed from: a */
    public final /* synthetic */ OnMapReadyCallback f67348a;

    public BinderC20637jc2(C21848qc2 c21848qc2, OnMapReadyCallback onMapReadyCallback) {
        this.f67348a = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f67348a.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}