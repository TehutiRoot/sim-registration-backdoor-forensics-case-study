package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.vision.zzau;

/* renamed from: Vc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18613Vc2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ zzau f6755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18613Vc2(zzau zzauVar, Handler handler) {
        super(null);
        this.f6755a = zzauVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f6755a.zza();
    }
}
