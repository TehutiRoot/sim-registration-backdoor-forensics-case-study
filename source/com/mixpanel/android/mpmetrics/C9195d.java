package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: com.mixpanel.android.mpmetrics.d */
/* loaded from: classes5.dex */
public class C9195d {

    /* renamed from: a */
    public final Executor f58722a = Executors.newSingleThreadExecutor();

    /* renamed from: com.mixpanel.android.mpmetrics.d$a */
    /* loaded from: classes5.dex */
    public static class CallableC9196a implements Callable {

        /* renamed from: a */
        public final Context f58723a;

        /* renamed from: b */
        public final String f58724b;

        /* renamed from: c */
        public final InterfaceC9197b f58725c;

        public CallableC9196a(Context context, String str, InterfaceC9197b interfaceC9197b) {
            this.f58723a = context;
            this.f58724b = str;
            this.f58725c = interfaceC9197b;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public SharedPreferences call() {
            SharedPreferences sharedPreferences = this.f58723a.getSharedPreferences(this.f58724b, 0);
            InterfaceC9197b interfaceC9197b = this.f58725c;
            if (interfaceC9197b != null) {
                interfaceC9197b.mo33476a(sharedPreferences);
            }
            return sharedPreferences;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.d$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC9197b {
        /* renamed from: a */
        void mo33476a(SharedPreferences sharedPreferences);
    }

    /* renamed from: a */
    public Future m33478a(Context context, String str, InterfaceC9197b interfaceC9197b) {
        FutureTask futureTask = new FutureTask(new CallableC9196a(context, str, interfaceC9197b));
        this.f58722a.execute(futureTask);
        return futureTask;
    }
}
