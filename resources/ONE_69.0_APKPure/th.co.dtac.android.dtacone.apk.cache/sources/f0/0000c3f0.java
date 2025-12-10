package p000;

import android.os.IBinder;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

/* renamed from: cr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19471cr2 implements InterfaceC21777qA2 {

    /* renamed from: a */
    public final /* synthetic */ String f61001a;

    /* renamed from: b */
    public final /* synthetic */ int f61002b;

    public C19471cr2(String str, int i) {
        this.f61001a = str;
        this.f61002b = i;
    }

    @Override // p000.InterfaceC21777qA2
    /* renamed from: a */
    public final /* synthetic */ Object mo23687a(IBinder iBinder) {
        Object m48698d;
        m48698d = zzd.m48698d(zzf.zza(iBinder).zza(new AccountChangeEventsRequest().setAccountName(this.f61001a).setEventIndex(this.f61002b)));
        return ((AccountChangeEventsResponse) m48698d).getEvents();
    }
}