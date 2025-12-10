package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C8542c;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes4.dex */
public class C8542c {

    /* renamed from: a */
    public final Executor f55691a;

    /* renamed from: b */
    public final Map f55692b = new ArrayMap();

    /* renamed from: com.google.firebase.messaging.c$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8543a {
        Task start();
    }

    public C8542c(Executor executor) {
        this.f55691a = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m38427a(C8542c c8542c, String str, Task task) {
        return c8542c.m38425c(str, task);
    }

    /* renamed from: b */
    public synchronized Task m38426b(final String str, InterfaceC8543a interfaceC8543a) {
        Task task = (Task) this.f55692b.get(str);
        if (task != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Joining ongoing request for: ");
                sb.append(str);
            }
            return task;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Making new request for: ");
            sb2.append(str);
        }
        Task continueWithTask = interfaceC8543a.start().continueWithTask(this.f55691a, new Continuation() { // from class: Zx1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C8542c.m38427a(C8542c.this, str, task2);
            }
        });
        this.f55692b.put(str, continueWithTask);
        return continueWithTask;
    }

    /* renamed from: c */
    public final /* synthetic */ Task m38425c(String str, Task task) {
        synchronized (this) {
            this.f55692b.remove(str);
        }
        return task;
    }
}