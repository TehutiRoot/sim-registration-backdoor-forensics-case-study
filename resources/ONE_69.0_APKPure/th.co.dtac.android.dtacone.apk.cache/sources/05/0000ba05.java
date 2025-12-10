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
public class C9182c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public static Double f58726g;

    /* renamed from: b */
    public Runnable f58728b;

    /* renamed from: e */
    public final MixpanelAPI f58731e;

    /* renamed from: f */
    public final MPConfig f58732f;

    /* renamed from: a */
    public Handler f58727a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public boolean f58729c = true;

    /* renamed from: d */
    public boolean f58730d = true;

    /* renamed from: com.mixpanel.android.mpmetrics.c$a */
    /* loaded from: classes5.dex */
    public class RunnableC9183a implements Runnable {
        public RunnableC9183a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9182c.this.f58729c && C9182c.this.f58730d) {
                C9182c.this.f58729c = false;
                try {
                    double currentTimeMillis = System.currentTimeMillis() - C9182c.f58726g.doubleValue();
                    if (currentTimeMillis >= C9182c.this.f58732f.getMinimumSessionDuration() && currentTimeMillis < C9182c.this.f58732f.getSessionTimeoutDuration()) {
                        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.ENGLISH);
                        numberInstance.setMaximumFractionDigits(1);
                        String format = numberInstance.format((System.currentTimeMillis() - C9182c.f58726g.doubleValue()) / 1000.0d);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(AutomaticEvents.SESSION_LENGTH, format);
                        C9182c.this.f58731e.track(AutomaticEvents.SESSION, jSONObject, true);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C9182c.this.f58731e.m33569w();
            }
        }
    }

    public C9182c(MixpanelAPI mixpanelAPI, MPConfig mPConfig) {
        this.f58731e = mixpanelAPI;
        this.f58732f = mPConfig;
        if (f58726g == null) {
            f58726g = Double.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: g */
    public boolean m33472g() {
        return this.f58729c;
    }

    /* renamed from: h */
    public final void m33471h(Intent intent) {
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
                    this.f58731e.track("$app_open", jSONObject);
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
        this.f58730d = true;
        Runnable runnable = this.f58728b;
        if (runnable != null) {
            this.f58727a.removeCallbacks(runnable);
        }
        Handler handler = this.f58727a;
        RunnableC9183a runnableC9183a = new RunnableC9183a();
        this.f58728b = runnableC9183a;
        handler.postDelayed(runnableC9183a, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.f58732f.getAutoShowMixpanelUpdates()) {
            this.f58731e.getPeople().joinExperimentIfAvailable();
        }
        this.f58730d = false;
        boolean z = !this.f58729c;
        this.f58729c = true;
        Runnable runnable = this.f58728b;
        if (runnable != null) {
            this.f58727a.removeCallbacks(runnable);
        }
        if (z) {
            f58726g = Double.valueOf(System.currentTimeMillis());
            this.f58731e.m33568x();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m33471h(activity.getIntent());
        if (this.f58732f.getAutoShowMixpanelUpdates()) {
            this.f58731e.getPeople().showNotificationIfAvailable(activity);
        }
        new GestureTracker(this.f58731e, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}