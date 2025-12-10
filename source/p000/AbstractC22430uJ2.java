package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: uJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22430uJ2 {

    /* renamed from: a */
    public final int f107339a;

    /* renamed from: b */
    public final TaskCompletionSource f107340b = new TaskCompletionSource();

    /* renamed from: c */
    public final int f107341c;

    /* renamed from: d */
    public final Bundle f107342d;

    public AbstractC22430uJ2(int i, int i2, Bundle bundle) {
        this.f107339a = i;
        this.f107341c = i2;
        this.f107342d = bundle;
    }

    /* renamed from: a */
    public abstract void mo1291a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo1290b();

    /* renamed from: c */
    public final void m1289c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = zztVar.toString();
            StringBuilder sb = new StringBuilder();
            sb.append("Failing ");
            sb.append(obj);
            sb.append(" with ");
            sb.append(obj2);
        }
        this.f107340b.setException(zztVar);
    }

    /* renamed from: d */
    public final void m1288d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder();
            sb.append("Finishing ");
            sb.append(obj2);
            sb.append(" with ");
            sb.append(valueOf);
        }
        this.f107340b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f107341c + " id=" + this.f107339a + " oneWay=" + mo1290b() + "}";
    }
}
