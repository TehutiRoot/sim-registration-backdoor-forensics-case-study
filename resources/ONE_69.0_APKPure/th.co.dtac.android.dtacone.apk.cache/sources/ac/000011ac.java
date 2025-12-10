package p000;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.vision.zzau;

/* renamed from: Sd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18465Sd2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ zzau f5874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18465Sd2(zzau zzauVar, Handler handler) {
        super(null);
        this.f5874a = zzauVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f5874a.zza();
    }
}