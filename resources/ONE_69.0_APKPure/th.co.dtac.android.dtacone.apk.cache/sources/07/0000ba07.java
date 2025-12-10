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
public class C9184d {

    /* renamed from: a */
    public final Executor f58734a = Executors.newSingleThreadExecutor();

    /* renamed from: com.mixpanel.android.mpmetrics.d$a */
    /* loaded from: classes5.dex */
    public static class CallableC9185a implements Callable {

        /* renamed from: a */
        public final Context f58735a;

        /* renamed from: b */
        public final String f58736b;

        /* renamed from: c */
        public final InterfaceC9186b f58737c;

        public CallableC9185a(Context context, String str, InterfaceC9186b interfaceC9186b) {
            this.f58735a = context;
            this.f58736b = str;
            this.f58737c = interfaceC9186b;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public SharedPreferences call() {
            SharedPreferences sharedPreferences = this.f58735a.getSharedPreferences(this.f58736b, 0);
            InterfaceC9186b interfaceC9186b = this.f58737c;
            if (interfaceC9186b != null) {
                interfaceC9186b.mo33468a(sharedPreferences);
            }
            return sharedPreferences;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.d$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC9186b {
        /* renamed from: a */
        void mo33468a(SharedPreferences sharedPreferences);
    }

    /* renamed from: a */
    public Future m33470a(Context context, String str, InterfaceC9186b interfaceC9186b) {
        FutureTask futureTask = new FutureTask(new CallableC9185a(context, str, interfaceC9186b));
        this.f58734a.execute(futureTask);
        return futureTask;
    }
}