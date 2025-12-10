package p000;

import java.util.concurrent.Executor;

/* renamed from: HK2 */
/* loaded from: classes4.dex */
public final class HK2 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}