package p000;

import android.os.IBinder;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

/* renamed from: fq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19935fq2 implements InterfaceC22370tz2 {

    /* renamed from: a */
    public final /* synthetic */ String f61947a;

    /* renamed from: b */
    public final /* synthetic */ int f61948b;

    public C19935fq2(String str, int i) {
        this.f61947a = str;
        this.f61948b = i;
    }

    @Override // p000.InterfaceC22370tz2
    /* renamed from: a */
    public final /* synthetic */ Object mo1348a(IBinder iBinder) {
        Object m48701d;
        m48701d = zzd.m48701d(zzf.zza(iBinder).zza(new AccountChangeEventsRequest().setAccountName(this.f61947a).setEventIndex(this.f61948b)));
        return ((AccountChangeEventsResponse) m48701d).getEvents();
    }
}
