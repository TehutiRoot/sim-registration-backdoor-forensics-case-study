package p000;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbs;

/* renamed from: Zd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18919Zd2 extends zzbs {

    /* renamed from: a */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f8220a;

    public BinderC18919Zd2(C19778ee2 c19778ee2, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f8220a = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f8220a.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}