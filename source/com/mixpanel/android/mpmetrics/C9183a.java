package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.stats.CodePackage;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.util.HttpService;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.util.RemoteService;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mixpanel.android.mpmetrics.a */
/* loaded from: classes5.dex */
public class C9183a {

    /* renamed from: d */
    public static final Map f58682d = new HashMap();

    /* renamed from: a */
    public final C9188e f58683a = m33526c();

    /* renamed from: b */
    public final Context f58684b;

    /* renamed from: c */
    public final MPConfig f58685c;

    /* renamed from: com.mixpanel.android.mpmetrics.a$a */
    /* loaded from: classes5.dex */
    public static class C9184a extends C9186c {

        /* renamed from: b */
        public final String f58686b;

        /* renamed from: c */
        public final JSONObject f58687c;

        /* renamed from: d */
        public final JSONObject f58688d;

        /* renamed from: e */
        public final boolean f58689e;

        public C9184a(String str, JSONObject jSONObject, String str2) {
            this(str, jSONObject, str2, false, new JSONObject());
        }

        /* renamed from: b */
        public String m33513b() {
            return this.f58686b;
        }

        /* renamed from: c */
        public JSONObject m33512c() {
            return this.f58687c;
        }

        /* renamed from: d */
        public JSONObject m33511d() {
            return this.f58688d;
        }

        /* renamed from: e */
        public boolean m33510e() {
            return this.f58689e;
        }

        public C9184a(String str, JSONObject jSONObject, String str2, boolean z, JSONObject jSONObject2) {
            super(str2);
            this.f58686b = str;
            this.f58687c = jSONObject;
            this.f58689e = z;
            this.f58688d = jSONObject2;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$b */
    /* loaded from: classes5.dex */
    public static class C9185b extends C9186c {

        /* renamed from: b */
        public final boolean f58690b;

        public C9185b(String str) {
            this(str, true);
        }

        /* renamed from: b */
        public boolean m33509b() {
            return this.f58690b;
        }

        public C9185b(String str, boolean z) {
            super(str);
            this.f58690b = z;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$c */
    /* loaded from: classes5.dex */
    public static class C9186c {

        /* renamed from: a */
        public final String f58691a;

        public C9186c(String str) {
            this.f58691a = str;
        }

        /* renamed from: a */
        public String m33508a() {
            return this.f58691a;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$d */
    /* loaded from: classes5.dex */
    public static class C9187d extends C9186c {

        /* renamed from: b */
        public final JSONObject f58692b;

        public C9187d(JSONObject jSONObject, String str) {
            super(str);
            this.f58692b = jSONObject;
        }

        /* renamed from: b */
        public JSONObject m33507b() {
            return this.f58692b;
        }

        public String toString() {
            return this.f58692b.toString();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$e */
    /* loaded from: classes5.dex */
    public class C9188e {

        /* renamed from: f */
        public C20038gQ1 f58698f;

        /* renamed from: a */
        public final Object f58693a = new Object();

        /* renamed from: c */
        public long f58695c = 0;

        /* renamed from: d */
        public long f58696d = 0;

        /* renamed from: e */
        public long f58697e = -1;

        /* renamed from: b */
        public Handler f58694b = m33501f();

        /* renamed from: com.mixpanel.android.mpmetrics.a$e$a */
        /* loaded from: classes5.dex */
        public class HandlerC9189a extends Handler {

            /* renamed from: a */
            public MPDbAdapter f58700a;

            /* renamed from: b */
            public final DecideChecker f58701b;

            /* renamed from: c */
            public final long f58702c;

            /* renamed from: d */
            public long f58703d;

            /* renamed from: e */
            public long f58704e;

            /* renamed from: f */
            public int f58705f;

            /* renamed from: com.mixpanel.android.mpmetrics.a$e$a$a */
            /* loaded from: classes5.dex */
            public class C9190a implements MixpanelAPI.InterfaceC9158d {

                /* renamed from: a */
                public final /* synthetic */ String f58707a;

                public C9190a(String str) {
                    this.f58707a = str;
                }

                @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9158d
                /* renamed from: a */
                public void mo33492a(MixpanelAPI mixpanelAPI) {
                    MPLog.m33453v("MixpanelAPI.Messages", "Using existing pushId " + this.f58707a);
                    mixpanelAPI.getPeople().setPushRegistrationId(this.f58707a);
                }
            }

            public HandlerC9189a(Looper looper) {
                super(looper);
                this.f58700a = null;
                C9188e.this.f58698f = C20038gQ1.m31135g(C9183a.this.f58684b);
                this.f58701b = m33498a();
                this.f58702c = C9183a.this.f58685c.getFlushInterval();
            }

            /* renamed from: a */
            public DecideChecker m33498a() {
                C9183a c9183a = C9183a.this;
                return new DecideChecker(c9183a.f58684b, c9183a.f58685c);
            }

            /* renamed from: b */
            public final JSONObject m33497b() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mp_lib", "android");
                jSONObject.put("$lib_version", "5.4.1");
                jSONObject.put("$os", "Android");
                String str = Build.VERSION.RELEASE;
                String str2 = "UNKNOWN";
                if (str == null) {
                    str = "UNKNOWN";
                }
                jSONObject.put("$os_version", str);
                String str3 = Build.MANUFACTURER;
                if (str3 == null) {
                    str3 = "UNKNOWN";
                }
                jSONObject.put("$manufacturer", str3);
                String str4 = Build.BRAND;
                if (str4 == null) {
                    str4 = "UNKNOWN";
                }
                jSONObject.put("$brand", str4);
                String str5 = Build.MODEL;
                if (str5 != null) {
                    str2 = str5;
                }
                jSONObject.put("$model", str2);
                try {
                    try {
                        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C9183a.this.f58684b);
                        if (isGooglePlayServicesAvailable != 0) {
                            if (isGooglePlayServicesAvailable != 1) {
                                if (isGooglePlayServicesAvailable != 2) {
                                    if (isGooglePlayServicesAvailable != 3) {
                                        if (isGooglePlayServicesAvailable == 9) {
                                            jSONObject.put("$google_play_services", "invalid");
                                        }
                                    } else {
                                        jSONObject.put("$google_play_services", "disabled");
                                    }
                                } else {
                                    jSONObject.put("$google_play_services", "out of date");
                                }
                            } else {
                                jSONObject.put("$google_play_services", "missing");
                            }
                        } else {
                            jSONObject.put("$google_play_services", "available");
                        }
                    } catch (RuntimeException unused) {
                        jSONObject.put("$google_play_services", "not configured");
                    }
                } catch (NoClassDefFoundError unused2) {
                    jSONObject.put("$google_play_services", "not included");
                }
                DisplayMetrics m31136f = C9188e.this.f58698f.m31136f();
                jSONObject.put("$screen_dpi", m31136f.densityDpi);
                jSONObject.put("$screen_height", m31136f.heightPixels);
                jSONObject.put("$screen_width", m31136f.widthPixels);
                String m31139c = C9188e.this.f58698f.m31139c();
                if (m31139c != null) {
                    jSONObject.put("$app_version", m31139c);
                    jSONObject.put("$app_version_string", m31139c);
                }
                Integer m31140b = C9188e.this.f58698f.m31140b();
                if (m31140b != null) {
                    jSONObject.put("$app_release", m31140b);
                    jSONObject.put("$app_build_number", m31140b);
                }
                jSONObject.put("$has_nfc", C9188e.this.f58698f.m31134h());
                jSONObject.put("$has_telephone", C9188e.this.f58698f.m31133i());
                String m31137e = C9188e.this.f58698f.m31137e();
                if (m31137e != null) {
                    jSONObject.put("$carrier", m31137e);
                }
                Boolean m31131k = C9188e.this.f58698f.m31131k();
                if (m31131k != null) {
                    jSONObject.put("$wifi", m31131k.booleanValue());
                }
                Boolean m31132j = C9188e.this.f58698f.m31132j();
                if (m31132j != null) {
                    jSONObject.put("$bluetooth_enabled", m31132j);
                }
                String m31138d = C9188e.this.f58698f.m31138d();
                if (m31138d != null) {
                    jSONObject.put("$bluetooth_version", m31138d);
                }
                return jSONObject;
            }

            /* renamed from: c */
            public final JSONObject m33496c(C9184a c9184a) {
                JSONObject jSONObject = new JSONObject();
                JSONObject m33512c = c9184a.m33512c();
                JSONObject m33497b = m33497b();
                m33497b.put("token", c9184a.m33508a());
                if (m33512c != null) {
                    Iterator<String> keys = m33512c.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        m33497b.put(next, m33512c.get(next));
                    }
                }
                jSONObject.put("event", c9184a.m33513b());
                jSONObject.put("properties", m33497b);
                jSONObject.put("$mp_metadata", c9184a.m33511d());
                return jSONObject;
            }

            /* renamed from: d */
            public final void m33495d(String str) {
                try {
                    try {
                        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C9183a.this.f58684b) != 0) {
                            MPLog.m33455i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play Services are not installed.");
                        } else {
                            MixpanelAPI.m33585o(new C9190a(InstanceID.getInstance(C9183a.this.f58684b).getToken(str, CodePackage.GCM, (Bundle) null)));
                        }
                    } catch (RuntimeException unused) {
                        MPLog.m33455i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play services are not configured.");
                    }
                } catch (IOException e) {
                    MPLog.m33454i("MixpanelAPI.Messages", "Exception when trying to register for GCM", e);
                } catch (NoClassDefFoundError unused2) {
                    MPLog.m33451w("MixpanelAPI.Messages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
                }
            }

            /* renamed from: e */
            public final void m33494e(MPDbAdapter mPDbAdapter, String str) {
                RemoteService m33521h = C9183a.this.m33521h();
                C9183a c9183a = C9183a.this;
                if (!m33521h.isOnline(c9183a.f58684b, c9183a.f58685c.getOfflineMode())) {
                    C9183a.this.m33519j("Not flushing data to Mixpanel because the device is not connected to the internet.");
                    return;
                }
                m33493f(mPDbAdapter, str, MPDbAdapter.Table.EVENTS, C9183a.this.f58685c.getEventsEndpoint());
                m33493f(mPDbAdapter, str, MPDbAdapter.Table.PEOPLE, C9183a.this.f58685c.getPeopleEndpoint());
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01ce A[SYNTHETIC] */
            /* renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m33493f(com.mixpanel.android.mpmetrics.MPDbAdapter r18, java.lang.String r19, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r20, java.lang.String r21) {
                /*
                    Method dump skipped, instructions count: 550
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.C9183a.C9188e.HandlerC9189a.m33493f(com.mixpanel.android.mpmetrics.MPDbAdapter, java.lang.String, com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:111:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:117:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void handleMessage(android.os.Message r11) {
                /*
                    Method dump skipped, instructions count: 733
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.C9183a.C9188e.HandlerC9189a.handleMessage(android.os.Message):void");
            }
        }

        public C9188e() {
        }

        /* renamed from: f */
        public Handler m33501f() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            return new HandlerC9189a(handlerThread.getLooper());
        }

        /* renamed from: g */
        public void m33500g(Message message) {
            synchronized (this.f58693a) {
                try {
                    Handler handler = this.f58694b;
                    if (handler == null) {
                        C9183a c9183a = C9183a.this;
                        c9183a.m33519j("Dead mixpanel worker dropping a message: " + message.what);
                    } else {
                        handler.sendMessage(message);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: h */
        public final void m33499h() {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f58695c;
            long j2 = 1 + j;
            long j3 = this.f58697e;
            if (j3 > 0) {
                long j4 = ((currentTimeMillis - j3) + (this.f58696d * j)) / j2;
                this.f58696d = j4;
                C9183a c9183a = C9183a.this;
                c9183a.m33519j("Average send frequency approximately " + (j4 / 1000) + " seconds.");
            }
            this.f58697e = currentTimeMillis;
            this.f58695c = j2;
        }
    }

    public C9183a(Context context) {
        this.f58684b = context;
        this.f58685c = m33523f(context);
        m33521h().checkIsMixpanelBlocked();
    }

    /* renamed from: g */
    public static C9183a m33522g(Context context) {
        C9183a c9183a;
        Map map = f58682d;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (!map.containsKey(applicationContext)) {
                    c9183a = new C9183a(applicationContext);
                    map.put(applicationContext, c9183a);
                } else {
                    c9183a = (C9183a) map.get(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9183a;
    }

    /* renamed from: c */
    public C9188e m33526c() {
        return new C9188e();
    }

    /* renamed from: d */
    public void m33525d(C9186c c9186c) {
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.obj = c9186c;
        this.f58683a.m33500g(obtain);
    }

    /* renamed from: e */
    public void m33524e(C9184a c9184a) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = c9184a;
        this.f58683a.m33500g(obtain);
    }

    /* renamed from: f */
    public MPConfig m33523f(Context context) {
        return MPConfig.getInstance(context);
    }

    /* renamed from: h */
    public RemoteService m33521h() {
        return new HttpService();
    }

    /* renamed from: i */
    public void m33520i(DecideMessages decideMessages) {
        Message obtain = Message.obtain();
        obtain.what = 12;
        obtain.obj = decideMessages;
        this.f58683a.m33500g(obtain);
    }

    /* renamed from: j */
    public final void m33519j(String str) {
        MPLog.m33453v("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")");
    }

    /* renamed from: k */
    public final void m33518k(String str, Throwable th2) {
        MPLog.m33452v("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")", th2);
    }

    /* renamed from: l */
    public MPDbAdapter m33517l(Context context) {
        return MPDbAdapter.m33610o(context);
    }

    /* renamed from: m */
    public void m33516m(C9187d c9187d) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = c9187d;
        this.f58683a.m33500g(obtain);
    }

    /* renamed from: n */
    public void m33515n(C9185b c9185b) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = c9185b.m33508a();
        obtain.arg1 = c9185b.m33509b() ? 1 : 0;
        this.f58683a.m33500g(obtain);
    }

    /* renamed from: o */
    public void m33514o(String str) {
        Message obtain = Message.obtain();
        obtain.what = 13;
        obtain.obj = str;
        this.f58683a.m33500g(obtain);
    }
}
