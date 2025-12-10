package com.fasterxml.jackson.core.util;

import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
public class BufferRecyclers {
    public static final String SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef;

    /* renamed from: a */
    public static final OS1 f43247a;

    static {
        boolean z;
        OS1 os1;
        try {
            z = "true".equals(System.getProperty(SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS));
        } catch (SecurityException unused) {
            z = false;
        }
        if (z) {
            os1 = OS1.m67039a();
        } else {
            os1 = null;
        }
        f43247a = os1;
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
            OS1 os1 = f43247a;
            if (os1 != null) {
                softReference = os1.m67036d(bufferRecycler);
            } else {
                softReference = new SoftReference(bufferRecycler);
            }
            threadLocal.set(softReference);
        }
        return bufferRecycler;
    }

    public static int releaseBuffers() {
        OS1 os1 = f43247a;
        if (os1 != null) {
            return os1.m67038b();
        }
        return -1;
    }
}
