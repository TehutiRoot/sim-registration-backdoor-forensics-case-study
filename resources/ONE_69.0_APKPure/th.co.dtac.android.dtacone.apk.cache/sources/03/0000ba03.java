package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Handler;
import com.mixpanel.android.util.MPLog;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;

/* renamed from: com.mixpanel.android.mpmetrics.b */
/* loaded from: classes5.dex */
public class C9180b {

    /* renamed from: a */
    public final MixpanelAPI f58721a;

    /* renamed from: b */
    public Context f58722b;

    /* renamed from: c */
    public String f58723c;

    /* renamed from: d */
    public int f58724d;

    /* renamed from: com.mixpanel.android.mpmetrics.b$a */
    /* loaded from: classes5.dex */
    public class RunnableC9181a implements Runnable {
        public RunnableC9181a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9180b.this.m33480d();
        }
    }

    public C9180b(MixpanelAPI mixpanelAPI, Context context) {
        this.f58721a = mixpanelAPI;
        this.f58722b = context;
    }

    /* renamed from: b */
    public void m33482b() {
        this.f58723c = null;
        this.f58724d = 0;
    }

    /* renamed from: c */
    public final void m33481c() {
        try {
            Object invoke = Class.forName("com.appboy.Appboy").getMethod("getInstance", Context.class).invoke(null, this.f58722b);
            String str = (String) invoke.getClass().getMethod("getDeviceId", null).invoke(invoke, null);
            Object invoke2 = invoke.getClass().getMethod("getCurrentUser", null).invoke(invoke, null);
            String str2 = (String) invoke2.getClass().getMethod("getUserId", null).invoke(invoke2, null);
            if (str != null) {
                MixpanelAPI mixpanelAPI = this.f58721a;
                mixpanelAPI.alias(str, mixpanelAPI.getDistinctId());
                this.f58721a.getPeople().set("$braze_device_id", str);
            }
            if (str2 != null) {
                MixpanelAPI mixpanelAPI2 = this.f58721a;
                mixpanelAPI2.alias(str2, mixpanelAPI2.getDistinctId());
                this.f58721a.getPeople().set("$braze_external_id", str2);
            }
        } catch (ClassNotFoundException e) {
            MPLog.m33442w("MixpanelAPI.CnctInts", "Braze SDK not found but Braze is integrated on Mixpanel", e);
        } catch (IllegalAccessException e2) {
            MPLog.m33448e("MixpanelAPI.CnctInts", "method invocation failed", e2);
        } catch (NoSuchMethodException e3) {
            MPLog.m33448e("MixpanelAPI.CnctInts", "Braze SDK class exists but methods do not", e3);
        } catch (InvocationTargetException e4) {
            MPLog.m33448e("MixpanelAPI.CnctInts", "method invocation failed", e4);
        }
    }

    /* renamed from: d */
    public final synchronized void m33480d() {
        try {
            try {
                try {
                    try {
                        Object invoke = Class.forName("com.urbanairship.UAirship").getMethod("shared", null).invoke(null, null);
                        Object invoke2 = invoke.getClass().getMethod("getPushManager", null).invoke(invoke, null);
                        String str = (String) invoke2.getClass().getMethod("getChannelId", null).invoke(invoke2, null);
                        if (str != null && !str.isEmpty()) {
                            this.f58724d = 0;
                            String str2 = this.f58723c;
                            if (str2 != null) {
                                if (!str2.equals(str)) {
                                }
                            }
                            this.f58721a.getPeople().set("$android_urban_airship_channel_id", str);
                            this.f58723c = str;
                        } else {
                            int i = this.f58724d + 1;
                            this.f58724d = i;
                            if (i <= 3) {
                                new Handler().postDelayed(new RunnableC9181a(), BuyDolAddBankAccountFragment.WAIT_MILLI);
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        MPLog.m33442w("MixpanelAPI.CnctInts", "Urban Airship SDK not found but Urban Airship is integrated on Mixpanel", e);
                    } catch (NoSuchMethodException e2) {
                        MPLog.m33448e("MixpanelAPI.CnctInts", "Urban Airship SDK class exists but methods do not", e2);
                    }
                } catch (InvocationTargetException e3) {
                    MPLog.m33448e("MixpanelAPI.CnctInts", "method invocation failed", e3);
                }
            } catch (IllegalAccessException e4) {
                MPLog.m33448e("MixpanelAPI.CnctInts", "method invocation failed", e4);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e */
    public synchronized void m33479e(Set set) {
        try {
            if (set.contains("urbanairship")) {
                m33480d();
            }
            if (set.contains("braze")) {
                m33481c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}