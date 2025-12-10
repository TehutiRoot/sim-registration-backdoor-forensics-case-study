package com.fasterxml.jackson.core.util;

import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
public class BufferRecyclers {
    public static final String SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef;

    /* renamed from: a */
    public static final LT1 f43259a;

    static {
        boolean z;
        LT1 lt1;
        try {
            z = "true".equals(System.getProperty(SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS));
        } catch (SecurityException unused) {
            z = false;
        }
        if (z) {
            lt1 = LT1.m67554a();
        } else {
            lt1 = null;
        }
        f43259a = lt1;
        _recyclerRef = new ThreadLocal<>();
    }

    public static BufferRecycler getBufferRecycler() {
        BufferRecycler bufferRecycler;
        SoftReference softReference;
        ThreadLocal<SoftReference<BufferRecycler>> threadLocal = _recyclerRef;
        SoftReference<BufferRecycler> softReference2 = threadLocal.get();
        if (softReference2 == null) {
            bufferRecycler = null;
        } else {
            bufferRecycler = softReference2.get();
        }
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            LT1 lt1 = f43259a;
            if (lt1 != null) {
                softReference = lt1.m67551d(bufferRecycler);
            } else {
                softReference = new SoftReference(bufferRecycler);
            }
            threadLocal.set(softReference);
        }
        return bufferRecycler;
    }

    public static int releaseBuffers() {
        LT1 lt1 = f43259a;
        if (lt1 != null) {
            return lt1.m67553b();
        }
        return -1;
    }
}