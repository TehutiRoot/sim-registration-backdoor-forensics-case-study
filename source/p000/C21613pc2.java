package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: pc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21613pc2 extends AbstractC18677Wc2 {

    /* renamed from: b */
    public final /* synthetic */ ListenerHolder f76633b;

    /* renamed from: c */
    public final /* synthetic */ FusedLocationProviderClient f76634c;

    public C21613pc2(FusedLocationProviderClient fusedLocationProviderClient, ListenerHolder listenerHolder) {
        this.f76634c = fusedLocationProviderClient;
        this.f76633b = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        zzbe zzbeVar = (zzbe) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (m65594b()) {
            BinderC22129sc2 binderC22129sc2 = new BinderC22129sc2(this.f76634c, taskCompletionSource);
            ListenerHolder.ListenerKey listenerKey = this.f76633b.getListenerKey();
            if (listenerKey != null) {
                zzbeVar.zzy(listenerKey, binderC22129sc2);
            }
        }
    }
}
