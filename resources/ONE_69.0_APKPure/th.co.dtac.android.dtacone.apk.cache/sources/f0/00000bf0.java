package p000;

import com.google.android.gms.internal.maps.zzaw;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;

/* renamed from: Mc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18072Mc2 extends zzaw {

    /* renamed from: a */
    public final /* synthetic */ TileProvider f3927a;

    public BinderC18072Mc2(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.f3927a = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzax
    public final Tile zzb(int i, int i2, int i3) {
        return this.f3927a.getTile(i, i2, i3);
    }
}