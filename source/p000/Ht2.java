package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzhe;

/* renamed from: Ht2 */
/* loaded from: classes3.dex */
public final class Ht2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ zzhe f2342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ht2(zzhe zzheVar, Handler handler) {
        super(null);
        this.f2342a = zzheVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f2342a.zzf();
    }
}
