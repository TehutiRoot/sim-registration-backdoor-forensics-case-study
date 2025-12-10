package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.zzaf;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Kc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17909Kc2 extends BinderC18293Qc2 {

    /* renamed from: b */
    public final zzaf f3233b;

    public BinderC17909Kc2(TaskCompletionSource taskCompletionSource, zzaf zzafVar, byte[] bArr) {
        super(taskCompletionSource);
        this.f3233b = zzafVar;
    }

    @Override // p000.BinderC18293Qc2, com.google.android.gms.internal.location.zzai
    public final void zzc() {
        zzaf zzafVar = this.f3233b;
        FusedLocationProviderClient fusedLocationProviderClient = zzafVar.zza;
        AbstractC18677Wc2 abstractC18677Wc2 = zzafVar.zzb;
        ListenerHolder listenerHolder = zzafVar.zzc;
        abstractC18677Wc2.m65595a(false);
        ListenerHolder.ListenerKey<?> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey != null) {
            fusedLocationProviderClient.doUnregisterEventListener(listenerKey);
        }
    }
}
