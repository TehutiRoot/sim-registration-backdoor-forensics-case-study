package p046rx.plugins;

import p046rx.Completable;

/* renamed from: rx.plugins.RxJavaCompletableExecutionHook */
/* loaded from: classes7.dex */
public abstract class RxJavaCompletableExecutionHook {
    @Deprecated
    public Completable.OnSubscribe onCreate(Completable.OnSubscribe onSubscribe) {
        return onSubscribe;
    }

    @Deprecated
    public Completable.Operator onLift(Completable.Operator operator) {
        return operator;
    }

    @Deprecated
    public Throwable onSubscribeError(Throwable th2) {
        return th2;
    }

    @Deprecated
    public Completable.OnSubscribe onSubscribeStart(Completable completable, Completable.OnSubscribe onSubscribe) {
        return onSubscribe;
    }
}