package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C8553c;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes4.dex */
public class C8553c {

    /* renamed from: a */
    public final Executor f55679a;

    /* renamed from: b */
    public final Map f55680b = new ArrayMap();

    /* renamed from: com.google.firebase.messaging.c$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8554a {
        Task start();
    }

    public C8553c(Executor executor) {
        this.f55679a = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m38435a(C8553c c8553c, String str, Task task) {
        return c8553c.m38433c(str, task);
    }

    /* renamed from: b */
    public synchronized Task m38434b(final String str, InterfaceC8554a interfaceC8554a) {
        Task task = (Task) this.f55680b.get(str);
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
        Task continueWithTask = interfaceC8554a.start().continueWithTask(this.f55679a, new Continuation() { // from class: cx1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C8553c.m38435a(C8553c.this, str, task2);
            }
        });
        this.f55680b.put(str, continueWithTask);
        return continueWithTask;
    }

    /* renamed from: c */
    public final /* synthetic */ Task m38433c(String str, Task task) {
        synchronized (this) {
            this.f55680b.remove(str);
        }
        return task;
    }
}
