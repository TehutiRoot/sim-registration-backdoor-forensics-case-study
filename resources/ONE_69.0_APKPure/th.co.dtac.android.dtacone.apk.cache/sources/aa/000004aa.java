package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzhe;

/* renamed from: Eu2 */
/* loaded from: classes3.dex */
public final class Eu2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ zzhe f1514a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eu2(zzhe zzheVar, Handler handler) {
        super(null);
        this.f1514a = zzheVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f1514a.zzf();
    }
}