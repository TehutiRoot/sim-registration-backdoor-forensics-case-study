package com.mixpanel.android.mpmetrics;

import android.os.Process;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import java.lang.Thread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static ExceptionHandler f58506b;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f58507a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: com.mixpanel.android.mpmetrics.ExceptionHandler$a */
    /* loaded from: classes5.dex */
    public class C9138a implements MixpanelAPI.InterfaceC9158d {

        /* renamed from: a */
        public final /* synthetic */ Throwable f58508a;

        public C9138a(Throwable th2) {
            this.f58508a = th2;
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9158d
        /* renamed from: a */
        public void mo33492a(MixpanelAPI mixpanelAPI) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AutomaticEvents.APP_CRASHED_REASON, this.f58508a.toString());
                mixpanelAPI.track(AutomaticEvents.APP_CRASHED, jSONObject, true);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.ExceptionHandler$b */
    /* loaded from: classes5.dex */
    public class C9139b implements MixpanelAPI.InterfaceC9158d {
        public C9139b() {
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9158d
        /* renamed from: a */
        public void mo33492a(MixpanelAPI mixpanelAPI) {
            mixpanelAPI.flushNoDecideCheck();
        }
    }

    public ExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void init() {
        if (f58506b == null) {
            synchronized (ExceptionHandler.class) {
                try {
                    if (f58506b == null) {
                        f58506b = new ExceptionHandler();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m33647a() {
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
        MixpanelAPI.m33585o(new C9138a(th2));
        MixpanelAPI.m33585o(new C9139b());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f58507a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            m33647a();
        }
    }
}
