package p000;

import java.util.concurrent.Executor;

/* renamed from: KJ2 */
/* loaded from: classes4.dex */
public final class KJ2 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
