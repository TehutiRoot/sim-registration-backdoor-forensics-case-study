package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.clearcut.zzab;

/* renamed from: ab2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19025ab2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ zzab f8363a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19025ab2(zzab zzabVar, Handler handler) {
        super(null);
        this.f8363a = zzabVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f8363a.zzh();
        this.f8363a.m48203c();
    }
}
