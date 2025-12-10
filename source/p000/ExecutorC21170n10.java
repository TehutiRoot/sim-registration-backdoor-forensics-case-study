package p000;

import java.util.concurrent.Executor;

/* renamed from: n10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ExecutorC21170n10 implements Executor {

    /* renamed from: a */
    public static final Executor f72111a = new ExecutorC21170n10();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
