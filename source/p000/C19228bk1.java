package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.mixpanel.android.mpmetrics.SuperPropertyUpdate;
import com.mixpanel.android.util.MPLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19228bk1 {

    /* renamed from: m */
    public static Integer f39180m = null;

    /* renamed from: n */
    public static Boolean f39181n = null;

    /* renamed from: o */
    public static boolean f39182o = true;

    /* renamed from: p */
    public static final Object f39183p = new Object();

    /* renamed from: a */
    public final Future f39184a;

    /* renamed from: b */
    public final Future f39185b;

    /* renamed from: c */
    public final Future f39186c;

    /* renamed from: d */
    public final Future f39187d;

    /* renamed from: i */
    public String f39192i;

    /* renamed from: j */
    public String f39193j;

    /* renamed from: k */
    public JSONArray f39194k;

    /* renamed from: l */
    public Boolean f39195l;

    /* renamed from: f */
    public JSONObject f39189f = null;

    /* renamed from: g */
    public Map f39190g = null;

    /* renamed from: h */
    public boolean f39191h = false;

    /* renamed from: e */
    public final SharedPreferences.OnSharedPreferenceChangeListener f39188e = new SharedPreferences$OnSharedPreferenceChangeListenerC5397a();

    /* renamed from: bk1$a */
    /* loaded from: classes5.dex */
    public class SharedPreferences$OnSharedPreferenceChangeListenerC5397a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public SharedPreferences$OnSharedPreferenceChangeListenerC5397a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            synchronized (C19228bk1.f39183p) {
                C19228bk1.this.m51820x();
                boolean unused = C19228bk1.f39182o = false;
            }
        }
    }

    public C19228bk1(Future future, Future future2, Future future3, Future future4) {
        this.f39185b = future;
        this.f39184a = future2;
        this.f39186c = future3;
        this.f39187d = future4;
    }

    /* renamed from: O */
    public static JSONArray m51848O(SharedPreferences sharedPreferences) {
        JSONArray jSONArray = null;
        String string = sharedPreferences.getString("people_distinct_id", null);
        String string2 = sharedPreferences.getString("waiting_array", null);
        if (string2 != null && string != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(string2);
                jSONArray = new JSONArray();
                for (int i = 0; i < jSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i);
                        jSONObject.put("$distinct_id", string);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        MPLog.m33456e("MixpanelAPI.PIdentity", "Unparsable object found in waiting people records", e);
                    }
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("waiting_array");
                m51847P(edit);
            } catch (JSONException unused) {
                MPLog.m33457e("MixpanelAPI.PIdentity", "Waiting people records were unreadable.");
            }
        }
        return jSONArray;
    }

    /* renamed from: P */
    public static void m51847P(SharedPreferences.Editor editor) {
        editor.apply();
    }

    /* renamed from: S */
    public static void m51844S(Context context, String str, Map map) {
        synchronized (f39183p) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.clear();
                for (Map.Entry entry : map.entrySet()) {
                    edit.putString((String) entry.getKey(), (String) entry.getValue());
                }
                m51847P(edit);
                f39182o = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: A */
    public synchronized void m51862A(JSONObject jSONObject) {
        JSONObject m51827q = m51827q();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!m51827q.has(next)) {
                try {
                    m51827q.put(next, jSONObject.get(next));
                } catch (JSONException e) {
                    MPLog.m33456e("MixpanelAPI.PIdentity", "Exception registering super property.", e);
                }
            }
        }
        m51853J();
    }

    /* renamed from: B */
    public void m51861B(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39186c.get()).edit();
            edit.remove(str);
            m51847P(edit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: C */
    public synchronized void m51860C(Integer num) {
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f39184a.get();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String string = sharedPreferences.getString("seen_campaign_ids", "");
            edit.putString("seen_campaign_ids", string + num + ",");
            m51847P(edit);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write campaign id to shared preferences", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write campaign d to shared preferences", e2.getCause());
        }
    }

    /* renamed from: D */
    public synchronized void m51859D(String str) {
        try {
            if (!this.f39191h) {
                m51822v();
            }
            this.f39192i = str;
            m51846Q();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: E */
    public synchronized void m51858E() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39187d.get()).edit();
            edit.putBoolean("has_launched", true);
            m51847P(edit);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e2.getCause());
        }
    }

    /* renamed from: F */
    public synchronized void m51857F(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39187d.get()).edit();
            edit.putBoolean(str, true);
            m51847P(edit);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e2.getCause());
        }
    }

    /* renamed from: G */
    public synchronized void m51856G(boolean z, String str) {
        this.f39195l = Boolean.valueOf(z);
        m51845R(str);
    }

    /* renamed from: H */
    public synchronized void m51855H(String str) {
        try {
            if (!this.f39191h) {
                m51822v();
            }
            this.f39193j = str;
            m51846Q();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: I */
    public synchronized void m51854I(String str) {
        try {
            try {
                SharedPreferences.Editor edit = ((SharedPreferences) this.f39184a.get()).edit();
                edit.putString("push_id", str);
                m51847P(edit);
            } catch (InterruptedException e) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e);
            }
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e2.getCause());
        }
    }

    /* renamed from: J */
    public final void m51853J() {
        JSONObject jSONObject = this.f39189f;
        if (jSONObject == null) {
            MPLog.m33457e("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        MPLog.m33453v("MixpanelAPI.PIdentity", "Storing Super Properties " + jSONObject2);
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39184a.get()).edit();
            edit.putString("super_properties", jSONObject2);
            m51847P(edit);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e2.getCause());
        }
    }

    /* renamed from: K */
    public synchronized void m51852K(JSONObject jSONObject) {
        try {
            if (!this.f39191h) {
                m51822v();
            }
            if (this.f39194k == null) {
                this.f39194k = new JSONArray();
            }
            this.f39194k.put(jSONObject);
            m51846Q();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: L */
    public synchronized void m51851L(String str) {
        m51827q().remove(str);
        m51853J();
    }

    /* renamed from: M */
    public synchronized void m51850M(SuperPropertyUpdate superPropertyUpdate) {
        JSONObject m51827q = m51827q();
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> keys = m51827q.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, m51827q.get(next));
            }
            JSONObject update = superPropertyUpdate.update(jSONObject);
            if (update == null) {
                MPLog.m33451w("MixpanelAPI.PIdentity", "An update to Mixpanel's super properties returned null, and will have no effect.");
                return;
            }
            this.f39189f = update;
            m51853J();
        } catch (JSONException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't copy from one JSONObject to another", e);
        }
    }

    /* renamed from: N */
    public synchronized JSONArray m51849N() {
        JSONArray jSONArray;
        jSONArray = null;
        try {
            jSONArray = m51848O((SharedPreferences) this.f39184a.get());
            m51822v();
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", e2.getCause());
        }
        return jSONArray;
    }

    /* renamed from: Q */
    public final void m51846Q() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39184a.get()).edit();
            edit.putString("events_distinct_id", this.f39192i);
            edit.putString("people_distinct_id", this.f39193j);
            JSONArray jSONArray = this.f39194k;
            if (jSONArray == null) {
                edit.remove("waiting_array");
            } else {
                edit.putString("waiting_array", jSONArray.toString());
            }
            m51847P(edit);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e2.getCause());
        }
    }

    /* renamed from: R */
    public final void m51845R(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39187d.get()).edit();
            edit.putBoolean("opt_out_" + str, this.f39195l.booleanValue());
            m51847P(edit);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e2.getCause());
        }
    }

    /* renamed from: d */
    public synchronized void m51840d(JSONObject jSONObject) {
        JSONObject m51827q = m51827q();
        Iterator<String> keys = m51827q.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, m51827q.get(next));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", e);
            }
        }
    }

    /* renamed from: e */
    public void m51839e(String str, Long l) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39186c.get()).edit();
            edit.putLong(str, l.longValue());
            m51847P(edit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: f */
    public synchronized void m51838f() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39184a.get()).edit();
            edit.clear();
            m51847P(edit);
            m51819y();
            m51822v();
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getCause());
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* renamed from: g */
    public synchronized void m51837g() {
        try {
            try {
                SharedPreferences.Editor edit = ((SharedPreferences) this.f39184a.get()).edit();
                edit.remove("push_id");
                m51847P(edit);
            } catch (InterruptedException e) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e);
            }
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e2.getCause());
        }
    }

    /* renamed from: h */
    public void m51836h() {
        synchronized (f39183p) {
            try {
                try {
                    SharedPreferences.Editor edit = ((SharedPreferences) this.f39185b.get()).edit();
                    edit.clear();
                    m51847P(edit);
                } catch (InterruptedException e) {
                    MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e);
                }
            } catch (ExecutionException e2) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e2.getCause());
            }
        }
    }

    /* renamed from: i */
    public synchronized void m51835i() {
        this.f39189f = new JSONObject();
        m51853J();
    }

    /* renamed from: j */
    public void m51834j() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f39186c.get()).edit();
            edit.clear();
            m51847P(edit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: k */
    public synchronized String m51833k() {
        try {
            if (!this.f39191h) {
                m51822v();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f39192i;
    }

    /* renamed from: l */
    public synchronized boolean m51832l(String str) {
        try {
            if (this.f39195l == null) {
                m51821w(str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f39195l.booleanValue();
    }

    /* renamed from: m */
    public synchronized String m51831m() {
        try {
            if (!this.f39191h) {
                m51822v();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f39193j;
    }

    /* renamed from: n */
    public synchronized String m51830n() {
        String str;
        str = null;
        try {
            str = ((SharedPreferences) this.f39184a.get()).getString("push_id", null);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e2.getCause());
        }
        return str;
    }

    /* renamed from: o */
    public Map m51829o() {
        synchronized (f39183p) {
            try {
                if (!f39182o) {
                    if (this.f39190g == null) {
                    }
                }
                m51820x();
                f39182o = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f39190g;
    }

    /* renamed from: p */
    public synchronized HashSet m51828p() {
        HashSet hashSet;
        hashSet = new HashSet();
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(((SharedPreferences) this.f39184a.get()).getString("seen_campaign_ids", ""), ",");
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(Integer.valueOf(stringTokenizer.nextToken()));
            }
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't read Mixpanel shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't read Mixpanel shared preferences.", e2.getCause());
        }
        return hashSet;
    }

    /* renamed from: q */
    public final JSONObject m51827q() {
        if (this.f39189f == null) {
            m51819y();
        }
        return this.f39189f;
    }

    /* renamed from: r */
    public Map m51826r() {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f39186c.get()).getAll().entrySet()) {
                hashMap.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: s */
    public synchronized boolean m51825s(String str) {
        boolean z;
        z = false;
        try {
            z = ((SharedPreferences) this.f39187d.get()).getBoolean(str, false);
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel shared preferences.", e2.getCause());
        }
        return z;
    }

    /* renamed from: t */
    public synchronized boolean m51824t(boolean z) {
        try {
            if (f39181n == null) {
                try {
                    if (((SharedPreferences) this.f39187d.get()).getBoolean("has_launched", false)) {
                        f39181n = Boolean.FALSE;
                    } else {
                        f39181n = Boolean.valueOf(!z);
                    }
                } catch (InterruptedException unused) {
                    f39181n = Boolean.FALSE;
                } catch (ExecutionException unused2) {
                    f39181n = Boolean.FALSE;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f39181n.booleanValue();
    }

    /* renamed from: u */
    public synchronized boolean m51823u(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer valueOf = Integer.valueOf(str);
            try {
                if (f39180m == null) {
                    Integer valueOf2 = Integer.valueOf(((SharedPreferences) this.f39187d.get()).getInt("latest_version_code", -1));
                    f39180m = valueOf2;
                    if (valueOf2.intValue() == -1) {
                        f39180m = valueOf;
                        SharedPreferences.Editor edit = ((SharedPreferences) this.f39187d.get()).edit();
                        edit.putInt("latest_version_code", valueOf.intValue());
                        m51847P(edit);
                    }
                }
                if (f39180m.intValue() < valueOf.intValue()) {
                    SharedPreferences.Editor edit2 = ((SharedPreferences) this.f39187d.get()).edit();
                    edit2.putInt("latest_version_code", valueOf.intValue());
                    m51847P(edit2);
                    return true;
                }
            } catch (InterruptedException e) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e);
            } catch (ExecutionException e2) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e2.getCause());
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m51822v() {
        /*
            r4 = this;
            java.lang.String r0 = "Cannot read distinct ids from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            r2 = 0
            java.util.concurrent.Future r3 = r4.f39184a     // Catch: java.lang.InterruptedException -> Le java.util.concurrent.ExecutionException -> L10
            java.lang.Object r3 = r3.get()     // Catch: java.lang.InterruptedException -> Le java.util.concurrent.ExecutionException -> L10
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch: java.lang.InterruptedException -> Le java.util.concurrent.ExecutionException -> L10
            goto L1e
        Le:
            r3 = move-exception
            goto L12
        L10:
            r3 = move-exception
            goto L16
        L12:
            com.mixpanel.android.util.MPLog.m33456e(r1, r0, r3)
            goto L1d
        L16:
            java.lang.Throwable r3 = r3.getCause()
            com.mixpanel.android.util.MPLog.m33456e(r1, r0, r3)
        L1d:
            r3 = r2
        L1e:
            if (r3 != 0) goto L21
            return
        L21:
            java.lang.String r0 = "events_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f39192i = r0
            java.lang.String r0 = "people_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f39193j = r0
            r4.f39194k = r2
            java.lang.String r0 = "waiting_array"
            java.lang.String r0 = r3.getString(r0, r2)
            if (r0 == 0) goto L57
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L43
            r2.<init>(r0)     // Catch: org.json.JSONException -> L43
            r4.f39194k = r2     // Catch: org.json.JSONException -> L43
            goto L57
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not interpret waiting people JSON record "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.mixpanel.android.util.MPLog.m33457e(r1, r0)
        L57:
            java.lang.String r0 = r4.f39192i
            if (r0 != 0) goto L68
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.f39192i = r0
            r4.m51846Q()
        L68:
            r0 = 1
            r4.f39191h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19228bk1.m51822v():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m51821w(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Cannot read opt out flag from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            java.util.concurrent.Future r2 = r3.f39187d     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            java.lang.Object r2 = r2.get()     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            goto L1d
        Ld:
            r2 = move-exception
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.mixpanel.android.util.MPLog.m33456e(r1, r0, r2)
            goto L1c
        L15:
            java.lang.Throwable r2 = r2.getCause()
            com.mixpanel.android.util.MPLog.m33456e(r1, r0, r2)
        L1c:
            r2 = 0
        L1d:
            if (r2 != 0) goto L20
            return
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "opt_out_"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            boolean r4 = r2.getBoolean(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.f39195l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19228bk1.m51821w(java.lang.String):void");
    }

    /* renamed from: x */
    public final void m51820x() {
        this.f39190g = new HashMap();
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f39185b.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.f39188e);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f39188e);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                this.f39190g.put(entry.getKey(), value.toString());
            }
        } catch (InterruptedException e) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e2.getCause());
        }
    }

    /* renamed from: y */
    public final void m51819y() {
        JSONObject jSONObject;
        try {
            try {
                try {
                    try {
                        String string = ((SharedPreferences) this.f39184a.get()).getString("super_properties", "{}");
                        MPLog.m33453v("MixpanelAPI.PIdentity", "Loading Super Properties " + string);
                        this.f39189f = new JSONObject(string);
                    } catch (JSONException unused) {
                        MPLog.m33457e("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
                        m51853J();
                        if (this.f39189f == null) {
                            jSONObject = new JSONObject();
                            this.f39189f = jSONObject;
                        }
                    }
                } catch (InterruptedException e) {
                    MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e);
                    if (this.f39189f == null) {
                        jSONObject = new JSONObject();
                        this.f39189f = jSONObject;
                    }
                }
            } catch (ExecutionException e2) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e2.getCause());
                if (this.f39189f == null) {
                    jSONObject = new JSONObject();
                    this.f39189f = jSONObject;
                }
            }
        } catch (Throwable th2) {
            if (this.f39189f == null) {
                this.f39189f = new JSONObject();
            }
            throw th2;
        }
    }

    /* renamed from: z */
    public synchronized void m51818z(JSONObject jSONObject) {
        JSONObject m51827q = m51827q();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                m51827q.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.PIdentity", "Exception registering super property.", e);
            }
        }
        m51853J();
    }
}
