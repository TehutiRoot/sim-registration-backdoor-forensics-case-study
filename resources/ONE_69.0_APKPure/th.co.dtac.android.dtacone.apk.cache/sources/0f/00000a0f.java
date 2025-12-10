package p000;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzax;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;

/* renamed from: Kc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17942Kc2 implements TileProvider {

    /* renamed from: a */
    public final zzax f3362a;

    /* renamed from: b */
    public final /* synthetic */ TileOverlayOptions f3363b;

    public C17942Kc2(TileOverlayOptions tileOverlayOptions) {
        zzax zzaxVar;
        this.f3363b = tileOverlayOptions;
        zzaxVar = tileOverlayOptions.f48041a;
        this.f3362a = zzaxVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.f3362a.zzb(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}