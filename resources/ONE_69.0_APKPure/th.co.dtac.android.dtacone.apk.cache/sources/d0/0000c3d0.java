package com.zxy.tiny.core;

import android.os.Handler;
import android.os.Looper;
import com.zxy.tiny.callback.CallbackDispatcher;

/* loaded from: classes5.dex */
public class MainThreadExecutor {

    /* renamed from: a */
    public static Handler f60986a;

    /* renamed from: com.zxy.tiny.core.MainThreadExecutor$a */
    /* loaded from: classes5.dex */
    public class RunnableC10013a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CallbackDispatcher f60987a;

        /* renamed from: b */
        public final /* synthetic */ Object f60988b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f60989c;

        public RunnableC10013a(CallbackDispatcher callbackDispatcher, Object obj, Throwable th2) {
            this.f60987a = callbackDispatcher;
            this.f60988b = obj;
            this.f60989c = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60987a.dispatch(this.f60988b, this.f60989c);
        }
    }

    /* renamed from: a */
    public static void m31960a() {
        Handler handler = f60986a;
        if (handler == null || !m31959b(handler)) {
            f60986a = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: b */
    public static boolean m31959b(Handler handler) {
        if (handler.getLooper().getThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static <T> void postToMainThread(T t, CallbackDispatcher<T> callbackDispatcher) {
        postToMainThread(t, callbackDispatcher, null);
    }

    public static <T> void postToMainThread(T t, CallbackDispatcher<T> callbackDispatcher, Throwable th2) {
        if (callbackDispatcher == null) {
            return;
        }
        m31960a();
        f60986a.post(new RunnableC10013a(callbackDispatcher, t, th2));
    }
}