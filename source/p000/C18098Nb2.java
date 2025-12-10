package p000;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzax;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;

/* renamed from: Nb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18098Nb2 implements TileProvider {

    /* renamed from: a */
    public final zzax f4144a;

    /* renamed from: b */
    public final /* synthetic */ TileOverlayOptions f4145b;

    public C18098Nb2(TileOverlayOptions tileOverlayOptions) {
        zzax zzaxVar;
        this.f4145b = tileOverlayOptions;
        zzaxVar = tileOverlayOptions.f48029a;
        this.f4144a = zzaxVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.f4144a.zzb(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
