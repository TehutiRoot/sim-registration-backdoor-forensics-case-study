package io.realm.internal;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public class NativeContext {

    /* renamed from: a */
    public static final ReferenceQueue f66670a;

    /* renamed from: b */
    public static final Thread f66671b;
    public static final NativeContext dummyContext;

    /* loaded from: classes5.dex */
    public interface NativeContextRunnable {
        void run(NativeContext nativeContext);
    }

    static {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        f66670a = referenceQueue;
        Thread thread = new Thread(new RunnableC11326a(referenceQueue));
        f66671b = thread;
        dummyContext = new NativeContext();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void addReference(NativeObject nativeObject) {
        new NativeObjectReference(this, nativeObject, f66670a);
    }
}
