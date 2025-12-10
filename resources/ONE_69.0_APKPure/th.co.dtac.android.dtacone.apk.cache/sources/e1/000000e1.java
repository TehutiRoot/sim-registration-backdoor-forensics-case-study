package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzia;

/* renamed from: Av2 */
/* loaded from: classes3.dex */
public final class Av2 extends ContentObserver {
    public Av2(Gv2 gv2, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzia.zzd();
    }
}