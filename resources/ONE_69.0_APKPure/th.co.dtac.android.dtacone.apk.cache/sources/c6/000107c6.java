package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: rK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21980rK2 {

    /* renamed from: a */
    public final int f77489a;

    /* renamed from: b */
    public final TaskCompletionSource f77490b = new TaskCompletionSource();

    /* renamed from: c */
    public final int f77491c;

    /* renamed from: d */
    public final Bundle f77492d;

    public AbstractC21980rK2(int i, int i2, Bundle bundle) {
        this.f77489a = i;
        this.f77491c = i2;
        this.f77492d = bundle;
    }

    /* renamed from: a */
    public abstract void mo23522a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo23521b();

    /* renamed from: c */
    public final void m23520c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = zztVar.toString();
            StringBuilder sb = new StringBuilder();
            sb.append("Failing ");
            sb.append(obj);
            sb.append(" with ");
            sb.append(obj2);
        }
        this.f77490b.setException(zztVar);
    }

    /* renamed from: d */
    public final void m23519d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder();
            sb.append("Finishing ");
            sb.append(obj2);
            sb.append(" with ");
            sb.append(valueOf);
        }
        this.f77490b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f77491c + " id=" + this.f77489a + " oneWay=" + mo23521b() + "}";
    }
}