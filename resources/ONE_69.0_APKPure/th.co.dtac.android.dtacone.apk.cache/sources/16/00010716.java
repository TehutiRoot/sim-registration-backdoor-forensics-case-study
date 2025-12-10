package p000;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbs;

/* renamed from: qd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC21851qd2 extends zzbs {

    /* renamed from: a */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f77249a;

    public BinderC21851qd2(C22716vd2 c22716vd2, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f77249a = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f77249a.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}