package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.C8505a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.a */
/* loaded from: classes4.dex */
public class C8505a {

    /* renamed from: a */
    public final Executor f55480a;

    /* renamed from: b */
    public final Map f55481b = new ArrayMap();

    /* renamed from: com.google.firebase.iid.a$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8506a {
        Task start();
    }

    public C8505a(Executor executor) {
        this.f55480a = executor;
    }

    /* renamed from: a */
    public synchronized Task m38678a(String str, String str2, InterfaceC8506a interfaceC8506a) {
        Pair pair = new Pair(str, str2);
        Task task = (Task) this.f55481b.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
        }
        Task continueWithTask = interfaceC8506a.start().continueWithTask(this.f55480a, new Continuation(this, pair) { // from class: dx1

            /* renamed from: a */
            public final C8505a f61362a;

            /* renamed from: b */
            public final Pair f61363b;

            {
                this.f61362a = this;
                this.f61363b = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.f61362a.m38677b(this.f61363b, task2);
                return task2;
            }
        });
        this.f55481b.put(pair, continueWithTask);
        return continueWithTask;
    }

    /* renamed from: b */
    public final /* synthetic */ Task m38677b(Pair pair, Task task) {
        synchronized (this) {
            this.f55481b.remove(pair);
        }
        return task;
    }
}
