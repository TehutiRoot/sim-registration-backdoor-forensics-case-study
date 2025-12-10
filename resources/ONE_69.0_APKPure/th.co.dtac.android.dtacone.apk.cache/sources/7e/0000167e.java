package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.clearcut.zzab;

/* renamed from: Xb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18784Xb2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ zzab f7587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18784Xb2(zzab zzabVar, Handler handler) {
        super(null);
        this.f7587a = zzabVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f7587a.zzh();
        this.f7587a.m48200c();
    }
}