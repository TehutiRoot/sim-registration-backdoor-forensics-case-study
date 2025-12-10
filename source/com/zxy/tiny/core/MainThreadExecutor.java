package com.zxy.tiny.core;

import android.os.Handler;
import android.os.Looper;
import com.zxy.tiny.callback.CallbackDispatcher;

/* loaded from: classes5.dex */
public class MainThreadExecutor {

    /* renamed from: a */
    public static Handler f60974a;

    /* renamed from: com.zxy.tiny.core.MainThreadExecutor$a */
    /* loaded from: classes5.dex */
    public class RunnableC10024a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CallbackDispatcher f60975a;

        /* renamed from: b */
        public final /* synthetic */ Object f60976b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f60977c;

        public RunnableC10024a(CallbackDispatcher callbackDispatcher, Object obj, Throwable th2) {
            this.f60975a = callbackDispatcher;
            this.f60976b = obj;
            this.f60977c = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60975a.dispatch(this.f60976b, this.f60977c);
        }
    }

    /* renamed from: a */
    public static void m31968a() {
        Handler handler = f60974a;
        if (handler == null || !m31967b(handler)) {
            f60974a = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: b */
    public static boolean m31967b(Handler handler) {
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
        m31968a();
        f60974a.post(new RunnableC10024a(callbackDispatcher, t, th2));
    }
}
