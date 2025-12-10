package p000;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbs;

/* renamed from: Zc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18916Zc2 extends zzbs {

    /* renamed from: a */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f8216a;

    public BinderC18916Zc2(C19256bd2 c19256bd2, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f8216a = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f8216a.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}