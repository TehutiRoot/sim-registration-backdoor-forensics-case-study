package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzia;

/* renamed from: Du2 */
/* loaded from: classes3.dex */
public final class Du2 extends ContentObserver {
    public Du2(Ju2 ju2, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzia.zzd();
    }
}
