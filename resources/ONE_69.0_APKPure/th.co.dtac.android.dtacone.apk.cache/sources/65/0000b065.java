package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.C8494a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.a */
/* loaded from: classes4.dex */
public class C8494a {

    /* renamed from: a */
    public final Executor f55492a;

    /* renamed from: b */
    public final Map f55493b = new ArrayMap();

    /* renamed from: com.google.firebase.iid.a$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8495a {
        Task start();
    }

    public C8494a(Executor executor) {
        this.f55492a = executor;
    }

    /* renamed from: a */
    public synchronized Task m38670a(String str, String str2, InterfaceC8495a interfaceC8495a) {
        Pair pair = new Pair(str, str2);
        Task task = (Task) this.f55493b.get(pair);
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
        Task continueWithTask = interfaceC8495a.start().continueWithTask(this.f55492a, new Continuation(this, pair) { // from class: ay1

            /* renamed from: a */
            public final C8494a f38950a;

            /* renamed from: b */
            public final Pair f38951b;

            {
                this.f38950a = this;
                this.f38951b = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.f38950a.m38669b(this.f38951b, task2);
                return task2;
            }
        });
        this.f55493b.put(pair, continueWithTask);
        return continueWithTask;
    }

    /* renamed from: b */
    public final /* synthetic */ Task m38669b(Pair pair, Task task) {
        synchronized (this) {
            this.f55493b.remove(pair);
        }
        return task;
    }
}