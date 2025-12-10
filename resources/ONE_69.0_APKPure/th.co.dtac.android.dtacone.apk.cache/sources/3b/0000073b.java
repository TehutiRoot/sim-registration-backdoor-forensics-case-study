package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.zzaf;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Hd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17750Hd2 extends BinderC18140Nd2 {

    /* renamed from: b */
    public final zzaf f2438b;

    public BinderC17750Hd2(TaskCompletionSource taskCompletionSource, zzaf zzafVar, byte[] bArr) {
        super(taskCompletionSource);
        this.f2438b = zzafVar;
    }

    @Override // p000.BinderC18140Nd2, com.google.android.gms.internal.location.zzai
    public final void zzc() {
        zzaf zzafVar = this.f2438b;
        FusedLocationProviderClient fusedLocationProviderClient = zzafVar.zza;
        AbstractC18530Td2 abstractC18530Td2 = zzafVar.zzb;
        ListenerHolder listenerHolder = zzafVar.zzc;
        abstractC18530Td2.m66331a(false);
        ListenerHolder.ListenerKey<?> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey != null) {
            fusedLocationProviderClient.doUnregisterEventListener(listenerKey);
        }
    }
}