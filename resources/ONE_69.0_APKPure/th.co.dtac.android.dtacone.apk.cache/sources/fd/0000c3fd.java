package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

/* renamed from: cu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19480cu2 implements InterfaceC21777qA2 {

    /* renamed from: a */
    public final /* synthetic */ Account f61026a;

    public C19480cu2(Account account) {
        this.f61026a = account;
    }

    @Override // p000.InterfaceC21777qA2
    /* renamed from: a */
    public final /* synthetic */ Object mo23687a(IBinder iBinder) {
        Object m48698d;
        m48698d = zzd.m48698d(zzf.zza(iBinder).zza(this.f61026a));
        return (Bundle) m48698d;
    }
}