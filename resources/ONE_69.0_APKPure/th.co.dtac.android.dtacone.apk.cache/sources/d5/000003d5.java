package p000;

import java.util.concurrent.Executor;

/* renamed from: E10 */
/* loaded from: classes4.dex */
public final /* synthetic */ class E10 implements Executor {

    /* renamed from: a */
    public static final Executor f1225a = new E10();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}