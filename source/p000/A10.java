package p000;

import java.util.concurrent.Executor;

/* renamed from: A10 */
/* loaded from: classes4.dex */
public final /* synthetic */ class A10 implements Executor {

    /* renamed from: a */
    public static final Executor f3a = new A10();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
