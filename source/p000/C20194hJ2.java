package p000;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: hJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20194hJ2 {

    /* renamed from: a */
    public final Object f62472a = new Object();

    /* renamed from: b */
    public Queue f62473b;

    /* renamed from: c */
    public boolean f62474c;

    /* renamed from: a */
    public final void m30893a(QI2 qi2) {
        synchronized (this.f62472a) {
            try {
                if (this.f62473b == null) {
                    this.f62473b = new ArrayDeque();
                }
                this.f62473b.add(qi2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m30892b(Task task) {
        QI2 qi2;
        synchronized (this.f62472a) {
            if (this.f62473b != null && !this.f62474c) {
                this.f62474c = true;
                while (true) {
                    synchronized (this.f62472a) {
                        try {
                            qi2 = (QI2) this.f62473b.poll();
                            if (qi2 == null) {
                                this.f62474c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    qi2.mo22537a(task);
                }
            }
        }
    }
}
