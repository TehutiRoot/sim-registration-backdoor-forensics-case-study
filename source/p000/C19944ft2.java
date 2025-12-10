package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

/* renamed from: ft2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19944ft2 implements InterfaceC22370tz2 {

    /* renamed from: a */
    public final /* synthetic */ Account f61971a;

    public C19944ft2(Account account) {
        this.f61971a = account;
    }

    @Override // p000.InterfaceC22370tz2
    /* renamed from: a */
    public final /* synthetic */ Object mo1348a(IBinder iBinder) {
        Object m48701d;
        m48701d = zzd.m48701d(zzf.zza(iBinder).zza(this.f61971a));
        return (Bundle) m48701d;
    }
}
