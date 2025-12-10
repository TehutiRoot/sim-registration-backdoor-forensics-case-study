package p000;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.ThreadLocalEventLoop;

/* renamed from: Uc */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1475Uc {
    /* renamed from: a */
    public static final Object m66001a(CoroutineContext coroutineContext, Function2 function2) {
        EventLoop eventLoop;
        EventLoop currentOrNull$kotlinx_coroutines_core;
        CoroutineContext newCoroutineContext;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        if (continuationInterceptor == null) {
            currentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            newCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext.plus(currentOrNull$kotlinx_coroutines_core));
        } else {
            EventLoop eventLoop2 = null;
            if (continuationInterceptor instanceof EventLoop) {
                eventLoop = (EventLoop) continuationInterceptor;
            } else {
                eventLoop = null;
            }
            if (eventLoop != null) {
                if (eventLoop.shouldBeProcessedFromContext()) {
                    eventLoop2 = eventLoop;
                }
                if (eventLoop2 != null) {
                    currentOrNull$kotlinx_coroutines_core = eventLoop2;
                    newCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext);
                }
            }
            currentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            newCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext);
        }
        C1835Zb c1835Zb = new C1835Zb(newCoroutineContext, currentThread, currentOrNull$kotlinx_coroutines_core);
        c1835Zb.start(CoroutineStart.DEFAULT, c1835Zb, function2);
        return c1835Zb.m65213I();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m66000b(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return BuildersKt.runBlocking(coroutineContext, function2);
    }
}
