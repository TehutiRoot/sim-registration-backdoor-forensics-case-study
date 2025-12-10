package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: md2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21159md2 extends AbstractC18530Td2 {

    /* renamed from: b */
    public final /* synthetic */ ListenerHolder f72036b;

    /* renamed from: c */
    public final /* synthetic */ FusedLocationProviderClient f72037c;

    public C21159md2(FusedLocationProviderClient fusedLocationProviderClient, ListenerHolder listenerHolder) {
        this.f72037c = fusedLocationProviderClient;
        this.f72036b = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        zzbe zzbeVar = (zzbe) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (m66330b()) {
            BinderC21678pd2 binderC21678pd2 = new BinderC21678pd2(this.f72037c, taskCompletionSource);
            ListenerHolder.ListenerKey listenerKey = this.f72036b.getListenerKey();
            if (listenerKey != null) {
                zzbeVar.zzy(listenerKey, binderC21678pd2);
            }
        }
    }
}