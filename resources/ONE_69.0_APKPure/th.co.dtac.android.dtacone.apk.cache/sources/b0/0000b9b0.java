package com.mixpanel.android.mpmetrics;

import android.os.Process;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import java.lang.Thread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static ExceptionHandler f58518b;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f58519a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: com.mixpanel.android.mpmetrics.ExceptionHandler$a */
    /* loaded from: classes5.dex */
    public class C9127a implements MixpanelAPI.InterfaceC9147d {

        /* renamed from: a */
        public final /* synthetic */ Throwable f58520a;

        public C9127a(Throwable th2) {
            this.f58520a = th2;
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9147d
        /* renamed from: a */
        public void mo33484a(MixpanelAPI mixpanelAPI) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AutomaticEvents.APP_CRASHED_REASON, this.f58520a.toString());
                mixpanelAPI.track(AutomaticEvents.APP_CRASHED, jSONObject, true);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.ExceptionHandler$b */
    /* loaded from: classes5.dex */
    public class C9128b implements MixpanelAPI.InterfaceC9147d {
        public C9128b() {
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9147d
        /* renamed from: a */
        public void mo33484a(MixpanelAPI mixpanelAPI) {
            mixpanelAPI.flushNoDecideCheck();
        }
    }

    public ExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void init() {
        if (f58518b == null) {
            synchronized (ExceptionHandler.class) {
                try {
                    if (f58518b == null) {
                        f58518b = new ExceptionHandler();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m33639a() {
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        MixpanelAPI.m33577o(new C9127a(th2));
        MixpanelAPI.m33577o(new C9128b());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f58519a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            m33639a();
        }
    }
}