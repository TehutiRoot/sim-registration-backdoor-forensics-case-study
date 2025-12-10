package p000;

import java.util.concurrent.Executor;

/* renamed from: w10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ExecutorC22718w10 implements Executor {

    /* renamed from: a */
    public static final Executor f107876a = new ExecutorC22718w10();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
