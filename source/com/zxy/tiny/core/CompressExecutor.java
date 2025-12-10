package com.zxy.tiny.core;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class CompressExecutor {

    /* renamed from: a */
    public static final ThreadPoolExecutor f60963a;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        f60963a = new CompressThreadPool(availableProcessors, availableProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new CompressThreadFactory());
    }

    public static ThreadPoolExecutor getExecutor() {
        return f60963a;
    }
}
