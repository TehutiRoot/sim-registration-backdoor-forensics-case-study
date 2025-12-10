package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import com.mixpanel.android.viewcrawler.GestureTracker;
import java.text.NumberFormat;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mixpanel.android.mpmetrics.c */
/* loaded from: classes5.dex */
public class C9193c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public static Double f58714g;

    /* renamed from: b */
    public Runnable f58716b;

    /* renamed from: e */
    public final MixpanelAPI f58719e;

    /* renamed from: f */
    public final MPConfig f58720f;

    /* renamed from: a */
    public Handler f58715a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public boolean f58717c = true;

    /* renamed from: d */
    public boolean f58718d = true;

    /* renamed from: com.mixpanel.android.mpmetrics.c$a */
    /* loaded from: classes5.dex */
    public class RunnableC9194a implements Runnable {
        public RunnableC9194a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9193c.this.f58717c && C9193c.this.f58718d) {
                C9193c.this.f58717c = false;
                try {
                    double currentTimeMillis = System.currentTimeMillis() - C9193c.f58714g.doubleValue();
                    if (currentTimeMillis >= C9193c.this.f58720f.getMinimumSessionDuration() && currentTimeMillis < C9193c.this.f58720f.getSessionTimeoutDuration()) {
                        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.ENGLISH);
                        numberInstance.setMaximumFractionDigits(1);
                        String format = numberInstance.format((System.currentTimeMillis() - C9193c.f58714g.doubleValue()) / 1000.0d);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(AutomaticEvents.SESSION_LENGTH, format);
                        C9193c.this.f58719e.track(AutomaticEvents.SESSION, jSONObject, true);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C9193c.this.f58719e.m33577w();
            }
        }
    }

    public C9193c(MixpanelAPI mixpanelAPI, MPConfig mPConfig) {
        this.f58719e = mixpanelAPI;
        this.f58720f = mPConfig;
        if (f58714g == null) {
            f58714g = Double.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: g */
    public boolean m33480g() {
        return this.f58717c;
    }

    /* renamed from: h */
    public final void m33479h(Intent intent) {
        JSONObject jSONObject;
        if (intent == null) {
            return;
        }
        try {
            if (intent.hasExtra("mp_campaign_id") && intent.hasExtra("mp_message_id")) {
                String stringExtra = intent.getStringExtra("mp_campaign_id");
                String stringExtra2 = intent.getStringExtra("mp_message_id");
                String stringExtra3 = intent.getStringExtra("mp");
                try {
                    if (stringExtra3 != null) {
                        jSONObject = new JSONObject(stringExtra3);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("campaign_id", Integer.valueOf(stringExtra).intValue());
                    jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, Integer.valueOf(stringExtra2).intValue());
                    jSONObject.put(Constants.MessagePayloadKeys.MESSAGE_TYPE, "push");
                    this.f58719e.track("$app_open", jSONObject);
                } catch (JSONException unused) {
                }
                intent.removeExtra("mp_campaign_id");
                intent.removeExtra("mp_message_id");
                intent.removeExtra("mp");
            }
        } catch (BadParcelableException unused2) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f58718d = true;
        Runnable runnable = this.f58716b;
        if (runnable != null) {
            this.f58715a.removeCallbacks(runnable);
        }
        Handler handler = this.f58715a;
        RunnableC9194a runnableC9194a = new RunnableC9194a();
        this.f58716b = runnableC9194a;
        handler.postDelayed(runnableC9194a, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.f58720f.getAutoShowMixpanelUpdates()) {
            this.f58719e.getPeople().joinExperimentIfAvailable();
        }
        this.f58718d = false;
        boolean z = !this.f58717c;
        this.f58717c = true;
        Runnable runnable = this.f58716b;
        if (runnable != null) {
            this.f58715a.removeCallbacks(runnable);
        }
        if (z) {
            f58714g = Double.valueOf(System.currentTimeMillis());
            this.f58719e.m33576x();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m33479h(activity.getIntent());
        if (this.f58720f.getAutoShowMixpanelUpdates()) {
            this.f58719e.getPeople().showNotificationIfAvailable(activity);
        }
        new GestureTracker(this.f58719e, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
