package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Handler;
import com.mixpanel.android.util.MPLog;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;

/* renamed from: com.mixpanel.android.mpmetrics.b */
/* loaded from: classes5.dex */
public class C9191b {

    /* renamed from: a */
    public final MixpanelAPI f58709a;

    /* renamed from: b */
    public Context f58710b;

    /* renamed from: c */
    public String f58711c;

    /* renamed from: d */
    public int f58712d;

    /* renamed from: com.mixpanel.android.mpmetrics.b$a */
    /* loaded from: classes5.dex */
    public class RunnableC9192a implements Runnable {
        public RunnableC9192a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9191b.this.m33488d();
        }
    }

    public C9191b(MixpanelAPI mixpanelAPI, Context context) {
        this.f58709a = mixpanelAPI;
        this.f58710b = context;
    }

    /* renamed from: b */
    public void m33490b() {
        this.f58711c = null;
        this.f58712d = 0;
    }

    /* renamed from: c */
    public final void m33489c() {
        try {
            Object invoke = Class.forName("com.appboy.Appboy").getMethod("getInstance", Context.class).invoke(null, this.f58710b);
            String str = (String) invoke.getClass().getMethod("getDeviceId", null).invoke(invoke, null);
            Object invoke2 = invoke.getClass().getMethod("getCurrentUser", null).invoke(invoke, null);
            String str2 = (String) invoke2.getClass().getMethod("getUserId", null).invoke(invoke2, null);
            if (str != null) {
                MixpanelAPI mixpanelAPI = this.f58709a;
                mixpanelAPI.alias(str, mixpanelAPI.getDistinctId());
                this.f58709a.getPeople().set("$braze_device_id", str);
            }
            if (str2 != null) {
                MixpanelAPI mixpanelAPI2 = this.f58709a;
                mixpanelAPI2.alias(str2, mixpanelAPI2.getDistinctId());
                this.f58709a.getPeople().set("$braze_external_id", str2);
            }
        } catch (ClassNotFoundException e) {
            MPLog.m33450w("MixpanelAPI.CnctInts", "Braze SDK not found but Braze is integrated on Mixpanel", e);
        } catch (IllegalAccessException e2) {
            MPLog.m33456e("MixpanelAPI.CnctInts", "method invocation failed", e2);
        } catch (NoSuchMethodException e3) {
            MPLog.m33456e("MixpanelAPI.CnctInts", "Braze SDK class exists but methods do not", e3);
        } catch (InvocationTargetException e4) {
            MPLog.m33456e("MixpanelAPI.CnctInts", "method invocation failed", e4);
        }
    }

    /* renamed from: d */
    public final synchronized void m33488d() {
        try {
            try {
                try {
                    try {
                        Object invoke = Class.forName("com.urbanairship.UAirship").getMethod("shared", null).invoke(null, null);
                        Object invoke2 = invoke.getClass().getMethod("getPushManager", null).invoke(invoke, null);
                        String str = (String) invoke2.getClass().getMethod("getChannelId", null).invoke(invoke2, null);
                        if (str != null && !str.isEmpty()) {
                            this.f58712d = 0;
                            String str2 = this.f58711c;
                            if (str2 != null) {
                                if (!str2.equals(str)) {
                                }
                            }
                            this.f58709a.getPeople().set("$android_urban_airship_channel_id", str);
                            this.f58711c = str;
                        } else {
                            int i = this.f58712d + 1;
                            this.f58712d = i;
                            if (i <= 3) {
                                new Handler().postDelayed(new RunnableC9192a(), BuyDolAddBankAccountFragment.WAIT_MILLI);
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        MPLog.m33450w("MixpanelAPI.CnctInts", "Urban Airship SDK not found but Urban Airship is integrated on Mixpanel", e);
                    } catch (NoSuchMethodException e2) {
                        MPLog.m33456e("MixpanelAPI.CnctInts", "Urban Airship SDK class exists but methods do not", e2);
                    }
                } catch (InvocationTargetException e3) {
                    MPLog.m33456e("MixpanelAPI.CnctInts", "method invocation failed", e3);
                }
            } catch (IllegalAccessException e4) {
                MPLog.m33456e("MixpanelAPI.CnctInts", "method invocation failed", e4);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e */
    public synchronized void m33487e(Set set) {
        try {
            if (set.contains("urbanairship")) {
                m33488d();
            }
            if (set.contains("braze")) {
                m33489c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
