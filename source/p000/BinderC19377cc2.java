package p000;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbs;

/* renamed from: cc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC19377cc2 extends zzbs {

    /* renamed from: a */
    public final /* synthetic */ OnStreetViewPanoramaReadyCallback f39467a;

    public BinderC19377cc2(C19721ec2 c19721ec2, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f39467a = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f39467a.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
