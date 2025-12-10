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
public class C9172a {

    /* renamed from: d */
    public static final Map f58694d = new HashMap();

    /* renamed from: a */
    public final C9177e f58695a = m33518c();

    /* renamed from: b */
    public final Context f58696b;

    /* renamed from: c */
    public final MPConfig f58697c;

    /* renamed from: com.mixpanel.android.mpmetrics.a$a */
    /* loaded from: classes5.dex */
    public static class C9173a extends C9175c {

        /* renamed from: b */
        public final String f58698b;

        /* renamed from: c */
        public final JSONObject f58699c;

        /* renamed from: d */
        public final JSONObject f58700d;

        /* renamed from: e */
        public final boolean f58701e;

        public C9173a(String str, JSONObject jSONObject, String str2) {
            this(str, jSONObject, str2, false, new JSONObject());
        }

        /* renamed from: b */
        public String m33505b() {
            return this.f58698b;
        }

        /* renamed from: c */
        public JSONObject m33504c() {
            return this.f58699c;
        }

        /* renamed from: d */
        public JSONObject m33503d() {
            return this.f58700d;
        }

        /* renamed from: e */
        public boolean m33502e() {
            return this.f58701e;
        }

        public C9173a(String str, JSONObject jSONObject, String str2, boolean z, JSONObject jSONObject2) {
            super(str2);
            this.f58698b = str;
            this.f58699c = jSONObject;
            this.f58701e = z;
            this.f58700d = jSONObject2;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$b */
    /* loaded from: classes5.dex */
    public static class C9174b extends C9175c {

        /* renamed from: b */
        public final boolean f58702b;

        public C9174b(String str) {
            this(str, true);
        }

        /* renamed from: b */
        public boolean m33501b() {
            return this.f58702b;
        }

        public C9174b(String str, boolean z) {
            super(str);
            this.f58702b = z;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$c */
    /* loaded from: classes5.dex */
    public static class C9175c {

        /* renamed from: a */
        public final String f58703a;

        public C9175c(String str) {
            this.f58703a = str;
        }

        /* renamed from: a */
        public String m33500a() {
            return this.f58703a;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$d */
    /* loaded from: classes5.dex */
    public static class C9176d extends C9175c {

        /* renamed from: b */
        public final JSONObject f58704b;

        public C9176d(JSONObject jSONObject, String str) {
            super(str);
            this.f58704b = jSONObject;
        }

        /* renamed from: b */
        public JSONObject m33499b() {
            return this.f58704b;
        }

        public String toString() {
            return this.f58704b.toString();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.a$e */
    /* loaded from: classes5.dex */
    public class C9177e {

        /* renamed from: f */
        public C19574dR1 f58710f;

        /* renamed from: a */
        public final Object f58705a = new Object();

        /* renamed from: c */
        public long f58707c = 0;

        /* renamed from: d */
        public long f58708d = 0;

        /* renamed from: e */
        public long f58709e = -1;

        /* renamed from: b */
        public Handler f58706b = m33493f();

        /* renamed from: com.mixpanel.android.mpmetrics.a$e$a */
        /* loaded from: classes5.dex */
        public class HandlerC9178a extends Handler {

            /* renamed from: a */
            public MPDbAdapter f58712a;

            /* renamed from: b */
            public final DecideChecker f58713b;

            /* renamed from: c */
            public final long f58714c;

            /* renamed from: d */
            public long f58715d;

            /* renamed from: e */
            public long f58716e;

            /* renamed from: f */
            public int f58717f;

            /* renamed from: com.mixpanel.android.mpmetrics.a$e$a$a */
            /* loaded from: classes5.dex */
            public class C9179a implements MixpanelAPI.InterfaceC9147d {

                /* renamed from: a */
                public final /* synthetic */ String f58719a;

                public C9179a(String str) {
                    this.f58719a = str;
                }

                @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9147d
                /* renamed from: a */
                public void mo33484a(MixpanelAPI mixpanelAPI) {
                    MPLog.m33445v("MixpanelAPI.Messages", "Using existing pushId " + this.f58719a);
                    mixpanelAPI.getPeople().setPushRegistrationId(this.f58719a);
                }
            }

            public HandlerC9178a(Looper looper) {
                super(looper);
                this.f58712a = null;
                C9177e.this.f58710f = C19574dR1.m31836g(C9172a.this.f58696b);
                this.f58713b = m33490a();
                this.f58714c = C9172a.this.f58697c.getFlushInterval();
            }

            /* renamed from: a */
            public DecideChecker m33490a() {
                C9172a c9172a = C9172a.this;
                return new DecideChecker(c9172a.f58696b, c9172a.f58697c);
            }

            /* renamed from: b */
            public final JSONObject m33489b() {
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
                        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C9172a.this.f58696b);
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
                DisplayMetrics m31837f = C9177e.this.f58710f.m31837f();
                jSONObject.put("$screen_dpi", m31837f.densityDpi);
                jSONObject.put("$screen_height", m31837f.heightPixels);
                jSONObject.put("$screen_width", m31837f.widthPixels);
                String m31840c = C9177e.this.f58710f.m31840c();
                if (m31840c != null) {
                    jSONObject.put("$app_version", m31840c);
                    jSONObject.put("$app_version_string", m31840c);
                }
                Integer m31841b = C9177e.this.f58710f.m31841b();
                if (m31841b != null) {
                    jSONObject.put("$app_release", m31841b);
                    jSONObject.put("$app_build_number", m31841b);
                }
                jSONObject.put("$has_nfc", C9177e.this.f58710f.m31835h());
                jSONObject.put("$has_telephone", C9177e.this.f58710f.m31834i());
                String m31838e = C9177e.this.f58710f.m31838e();
                if (m31838e != null) {
                    jSONObject.put("$carrier", m31838e);
                }
                Boolean m31832k = C9177e.this.f58710f.m31832k();
                if (m31832k != null) {
                    jSONObject.put("$wifi", m31832k.booleanValue());
                }
                Boolean m31833j = C9177e.this.f58710f.m31833j();
                if (m31833j != null) {
                    jSONObject.put("$bluetooth_enabled", m31833j);
                }
                String m31839d = C9177e.this.f58710f.m31839d();
                if (m31839d != null) {
                    jSONObject.put("$bluetooth_version", m31839d);
                }
                return jSONObject;
            }

            /* renamed from: c */
            public final JSONObject m33488c(C9173a c9173a) {
                JSONObject jSONObject = new JSONObject();
                JSONObject m33504c = c9173a.m33504c();
                JSONObject m33489b = m33489b();
                m33489b.put("token", c9173a.m33500a());
                if (m33504c != null) {
                    Iterator<String> keys = m33504c.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        m33489b.put(next, m33504c.get(next));
                    }
                }
                jSONObject.put("event", c9173a.m33505b());
                jSONObject.put("properties", m33489b);
                jSONObject.put("$mp_metadata", c9173a.m33503d());
                return jSONObject;
            }

            /* renamed from: d */
            public final void m33487d(String str) {
                try {
                    try {
                        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C9172a.this.f58696b) != 0) {
                            MPLog.m33447i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play Services are not installed.");
                        } else {
                            MixpanelAPI.m33577o(new C9179a(InstanceID.getInstance(C9172a.this.f58696b).getToken(str, CodePackage.GCM, (Bundle) null)));
                        }
                    } catch (RuntimeException unused) {
                        MPLog.m33447i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play services are not configured.");
                    }
                } catch (IOException e) {
                    MPLog.m33446i("MixpanelAPI.Messages", "Exception when trying to register for GCM", e);
                } catch (NoClassDefFoundError unused2) {
                    MPLog.m33443w("MixpanelAPI.Messages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
                }
            }

            /* renamed from: e */
            public final void m33486e(MPDbAdapter mPDbAdapter, String str) {
                RemoteService m33513h = C9172a.this.m33513h();
                C9172a c9172a = C9172a.this;
                if (!m33513h.isOnline(c9172a.f58696b, c9172a.f58697c.getOfflineMode())) {
                    C9172a.this.m33511j("Not flushing data to Mixpanel because the device is not connected to the internet.");
                    return;
                }
                m33485f(mPDbAdapter, str, MPDbAdapter.Table.EVENTS, C9172a.this.f58697c.getEventsEndpoint());
                m33485f(mPDbAdapter, str, MPDbAdapter.Table.PEOPLE, C9172a.this.f58697c.getPeopleEndpoint());
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01ce A[SYNTHETIC] */
            /* renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m33485f(com.mixpanel.android.mpmetrics.MPDbAdapter r18, java.lang.String r19, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r20, java.lang.String r21) {
                /*
                    Method dump skipped, instructions count: 550
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.C9172a.C9177e.HandlerC9178a.m33485f(com.mixpanel.android.mpmetrics.MPDbAdapter, java.lang.String, com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String):void");
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
                throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.C9172a.C9177e.HandlerC9178a.handleMessage(android.os.Message):void");
            }
        }

        public C9177e() {
        }

        /* renamed from: f */
        public Handler m33493f() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            return new HandlerC9178a(handlerThread.getLooper());
        }

        /* renamed from: g */
        public void m33492g(Message message) {
            synchronized (this.f58705a) {
                try {
                    Handler handler = this.f58706b;
                    if (handler == null) {
                        C9172a c9172a = C9172a.this;
                        c9172a.m33511j("Dead mixpanel worker dropping a message: " + message.what);
                    } else {
                        handler.sendMessage(message);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: h */
        public final void m33491h() {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f58707c;
            long j2 = 1 + j;
            long j3 = this.f58709e;
            if (j3 > 0) {
                long j4 = ((currentTimeMillis - j3) + (this.f58708d * j)) / j2;
                this.f58708d = j4;
                C9172a c9172a = C9172a.this;
                c9172a.m33511j("Average send frequency approximately " + (j4 / 1000) + " seconds.");
            }
            this.f58709e = currentTimeMillis;
            this.f58707c = j2;
        }
    }

    public C9172a(Context context) {
        this.f58696b = context;
        this.f58697c = m33515f(context);
        m33513h().checkIsMixpanelBlocked();
    }

    /* renamed from: g */
    public static C9172a m33514g(Context context) {
        C9172a c9172a;
        Map map = f58694d;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (!map.containsKey(applicationContext)) {
                    c9172a = new C9172a(applicationContext);
                    map.put(applicationContext, c9172a);
                } else {
                    c9172a = (C9172a) map.get(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9172a;
    }

    /* renamed from: c */
    public C9177e m33518c() {
        return new C9177e();
    }

    /* renamed from: d */
    public void m33517d(C9175c c9175c) {
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.obj = c9175c;
        this.f58695a.m33492g(obtain);
    }

    /* renamed from: e */
    public void m33516e(C9173a c9173a) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = c9173a;
        this.f58695a.m33492g(obtain);
    }

    /* renamed from: f */
    public MPConfig m33515f(Context context) {
        return MPConfig.getInstance(context);
    }

    /* renamed from: h */
    public RemoteService m33513h() {
        return new HttpService();
    }

    /* renamed from: i */
    public void m33512i(DecideMessages decideMessages) {
        Message obtain = Message.obtain();
        obtain.what = 12;
        obtain.obj = decideMessages;
        this.f58695a.m33492g(obtain);
    }

    /* renamed from: j */
    public final void m33511j(String str) {
        MPLog.m33445v("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")");
    }

    /* renamed from: k */
    public final void m33510k(String str, Throwable th2) {
        MPLog.m33444v("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")", th2);
    }

    /* renamed from: l */
    public MPDbAdapter m33509l(Context context) {
        return MPDbAdapter.m33602o(context);
    }

    /* renamed from: m */
    public void m33508m(C9176d c9176d) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = c9176d;
        this.f58695a.m33492g(obtain);
    }

    /* renamed from: n */
    public void m33507n(C9174b c9174b) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = c9174b.m33500a();
        obtain.arg1 = c9174b.m33501b() ? 1 : 0;
        this.f58695a.m33492g(obtain);
    }

    /* renamed from: o */
    public void m33506o(String str) {
        Message obtain = Message.obtain();
        obtain.what = 13;
        obtain.obj = str;
        this.f58695a.m33492g(obtain);
    }
}