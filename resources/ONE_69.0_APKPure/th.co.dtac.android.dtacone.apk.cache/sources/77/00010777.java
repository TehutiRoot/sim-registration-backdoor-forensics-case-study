package p000;

import java.util.concurrent.Executor;

/* renamed from: r10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ExecutorC21921r10 implements Executor {

    /* renamed from: a */
    public static final Executor f77379a = new ExecutorC21921r10();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}