package com.google.common.eventbus;

import com.google.common.eventbus.EventBus;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(String str, Executor executor) {
        super(str, executor, AbstractC12189lJ.m26831b(), EventBus.C7985a.f53772a);
    }

    public AsyncEventBus(Executor executor, SubscriberExceptionHandler subscriberExceptionHandler) {
        super("default", executor, AbstractC12189lJ.m26831b(), subscriberExceptionHandler);
    }

    public AsyncEventBus(Executor executor) {
        super("default", executor, AbstractC12189lJ.m26831b(), EventBus.C7985a.f53772a);
    }
}