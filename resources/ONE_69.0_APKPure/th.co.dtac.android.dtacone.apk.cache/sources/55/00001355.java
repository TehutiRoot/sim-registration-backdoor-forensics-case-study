package p000;

import java.util.concurrent.Executor;

/* renamed from: UI */
/* loaded from: classes.dex */
public final class ExecutorC1434UI implements Executor {

    /* renamed from: a */
    public static volatile ExecutorC1434UI f6599a;

    /* renamed from: a */
    public static Executor m66221a() {
        if (f6599a != null) {
            return f6599a;
        }
        synchronized (ExecutorC1434UI.class) {
            try {
                if (f6599a == null) {
                    f6599a = new ExecutorC1434UI();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f6599a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}