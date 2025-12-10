package p000;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: eK2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19731eK2 {

    /* renamed from: a */
    public final Object f61546a = new Object();

    /* renamed from: b */
    public Queue f61547b;

    /* renamed from: c */
    public boolean f61548c;

    /* renamed from: a */
    public final void m31713a(NJ2 nj2) {
        synchronized (this.f61546a) {
            try {
                if (this.f61547b == null) {
                    this.f61547b = new ArrayDeque();
                }
                this.f61547b.add(nj2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m31712b(Task task) {
        NJ2 nj2;
        synchronized (this.f61546a) {
            if (this.f61547b != null && !this.f61548c) {
                this.f61548c = true;
                while (true) {
                    synchronized (this.f61546a) {
                        try {
                            nj2 = (NJ2) this.f61547b.poll();
                            if (nj2 == null) {
                                this.f61548c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nj2.mo23918a(task);
                }
            }
        }
    }
}