package p000;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbs;

/* renamed from: tc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22301tc2 extends zzbs {

    /* renamed from: a */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f80164a;

    public BinderC22301tc2(C23161yc2 c23161yc2, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f80164a = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f80164a.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
