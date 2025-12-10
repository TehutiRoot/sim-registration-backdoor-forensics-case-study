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

/* renamed from: Yk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18875Yk1 {

    /* renamed from: m */
    public static Integer f7949m = null;

    /* renamed from: n */
    public static Boolean f7950n = null;

    /* renamed from: o */
    public static boolean f7951o = true;

    /* renamed from: p */
    public static final Object f7952p = new Object();

    /* renamed from: a */
    public final Future f7953a;

    /* renamed from: b */
    public final Future f7954b;

    /* renamed from: c */
    public final Future f7955c;

    /* renamed from: d */
    public final Future f7956d;

    /* renamed from: i */
    public String f7961i;

    /* renamed from: j */
    public String f7962j;

    /* renamed from: k */
    public JSONArray f7963k;

    /* renamed from: l */
    public Boolean f7964l;

    /* renamed from: f */
    public JSONObject f7958f = null;

    /* renamed from: g */
    public Map f7959g = null;

    /* renamed from: h */
    public boolean f7960h = false;

    /* renamed from: e */
    public final SharedPreferences.OnSharedPreferenceChangeListener f7957e = new SharedPreferences$OnSharedPreferenceChangeListenerC1756a();

    /* renamed from: Yk1$a */
    /* loaded from: classes5.dex */
    public class SharedPreferences$OnSharedPreferenceChangeListenerC1756a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public SharedPreferences$OnSharedPreferenceChangeListenerC1756a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            synchronized (C18875Yk1.f7952p) {
                C18875Yk1.this.m65365x();
                boolean unused = C18875Yk1.f7951o = false;
            }
        }
    }

    public C18875Yk1(Future future, Future future2, Future future3, Future future4) {
        this.f7954b = future;
        this.f7953a = future2;
        this.f7955c = future3;
        this.f7956d = future4;
    }

    /* renamed from: O */
    public static JSONArray m65393O(SharedPreferences sharedPreferences) {
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
                        MPLog.m33448e("MixpanelAPI.PIdentity", "Unparsable object found in waiting people records", e);
                    }
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("waiting_array");
                m65392P(edit);
            } catch (JSONException unused) {
                MPLog.m33449e("MixpanelAPI.PIdentity", "Waiting people records were unreadable.");
            }
        }
        return jSONArray;
    }

    /* renamed from: P */
    public static void m65392P(SharedPreferences.Editor editor) {
        editor.apply();
    }

    /* renamed from: S */
    public static void m65389S(Context context, String str, Map map) {
        synchronized (f7952p) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.clear();
                for (Map.Entry entry : map.entrySet()) {
                    edit.putString((String) entry.getKey(), (String) entry.getValue());
                }
                m65392P(edit);
                f7951o = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: A */
    public synchronized void m65407A(JSONObject jSONObject) {
        JSONObject m65372q = m65372q();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!m65372q.has(next)) {
                try {
                    m65372q.put(next, jSONObject.get(next));
                } catch (JSONException e) {
                    MPLog.m33448e("MixpanelAPI.PIdentity", "Exception registering super property.", e);
                }
            }
        }
        m65398J();
    }

    /* renamed from: B */
    public void m65406B(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7955c.get()).edit();
            edit.remove(str);
            m65392P(edit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: C */
    public synchronized void m65405C(Integer num) {
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f7953a.get();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String string = sharedPreferences.getString("seen_campaign_ids", "");
            edit.putString("seen_campaign_ids", string + num + ",");
            m65392P(edit);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write campaign id to shared preferences", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write campaign d to shared preferences", e2.getCause());
        }
    }

    /* renamed from: D */
    public synchronized void m65404D(String str) {
        try {
            if (!this.f7960h) {
                m65367v();
            }
            this.f7961i = str;
            m65391Q();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: E */
    public synchronized void m65403E() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7956d.get()).edit();
            edit.putBoolean("has_launched", true);
            m65392P(edit);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e2.getCause());
        }
    }

    /* renamed from: F */
    public synchronized void m65402F(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7956d.get()).edit();
            edit.putBoolean(str, true);
            m65392P(edit);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e2.getCause());
        }
    }

    /* renamed from: G */
    public synchronized void m65401G(boolean z, String str) {
        this.f7964l = Boolean.valueOf(z);
        m65390R(str);
    }

    /* renamed from: H */
    public synchronized void m65400H(String str) {
        try {
            if (!this.f7960h) {
                m65367v();
            }
            this.f7962j = str;
            m65391Q();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: I */
    public synchronized void m65399I(String str) {
        try {
            try {
                SharedPreferences.Editor edit = ((SharedPreferences) this.f7953a.get()).edit();
                edit.putString("push_id", str);
                m65392P(edit);
            } catch (InterruptedException e) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e);
            }
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e2.getCause());
        }
    }

    /* renamed from: J */
    public final void m65398J() {
        JSONObject jSONObject = this.f7958f;
        if (jSONObject == null) {
            MPLog.m33449e("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        MPLog.m33445v("MixpanelAPI.PIdentity", "Storing Super Properties " + jSONObject2);
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7953a.get()).edit();
            edit.putString("super_properties", jSONObject2);
            m65392P(edit);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e2.getCause());
        }
    }

    /* renamed from: K */
    public synchronized void m65397K(JSONObject jSONObject) {
        try {
            if (!this.f7960h) {
                m65367v();
            }
            if (this.f7963k == null) {
                this.f7963k = new JSONArray();
            }
            this.f7963k.put(jSONObject);
            m65391Q();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: L */
    public synchronized void m65396L(String str) {
        m65372q().remove(str);
        m65398J();
    }

    /* renamed from: M */
    public synchronized void m65395M(SuperPropertyUpdate superPropertyUpdate) {
        JSONObject m65372q = m65372q();
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> keys = m65372q.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, m65372q.get(next));
            }
            JSONObject update = superPropertyUpdate.update(jSONObject);
            if (update == null) {
                MPLog.m33443w("MixpanelAPI.PIdentity", "An update to Mixpanel's super properties returned null, and will have no effect.");
                return;
            }
            this.f7958f = update;
            m65398J();
        } catch (JSONException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't copy from one JSONObject to another", e);
        }
    }

    /* renamed from: N */
    public synchronized JSONArray m65394N() {
        JSONArray jSONArray;
        jSONArray = null;
        try {
            jSONArray = m65393O((SharedPreferences) this.f7953a.get());
            m65367v();
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", e2.getCause());
        }
        return jSONArray;
    }

    /* renamed from: Q */
    public final void m65391Q() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7953a.get()).edit();
            edit.putString("events_distinct_id", this.f7961i);
            edit.putString("people_distinct_id", this.f7962j);
            JSONArray jSONArray = this.f7963k;
            if (jSONArray == null) {
                edit.remove("waiting_array");
            } else {
                edit.putString("waiting_array", jSONArray.toString());
            }
            m65392P(edit);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e2.getCause());
        }
    }

    /* renamed from: R */
    public final void m65390R(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7956d.get()).edit();
            edit.putBoolean("opt_out_" + str, this.f7964l.booleanValue());
            m65392P(edit);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e2.getCause());
        }
    }

    /* renamed from: d */
    public synchronized void m65385d(JSONObject jSONObject) {
        JSONObject m65372q = m65372q();
        Iterator<String> keys = m65372q.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, m65372q.get(next));
            } catch (JSONException e) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", e);
            }
        }
    }

    /* renamed from: e */
    public void m65384e(String str, Long l) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7955c.get()).edit();
            edit.putLong(str, l.longValue());
            m65392P(edit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: f */
    public synchronized void m65383f() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7953a.get()).edit();
            edit.clear();
            m65392P(edit);
            m65364y();
            m65367v();
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getCause());
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* renamed from: g */
    public synchronized void m65382g() {
        try {
            try {
                SharedPreferences.Editor edit = ((SharedPreferences) this.f7953a.get()).edit();
                edit.remove("push_id");
                m65392P(edit);
            } catch (InterruptedException e) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e);
            }
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e2.getCause());
        }
    }

    /* renamed from: h */
    public void m65381h() {
        synchronized (f7952p) {
            try {
                try {
                    SharedPreferences.Editor edit = ((SharedPreferences) this.f7954b.get()).edit();
                    edit.clear();
                    m65392P(edit);
                } catch (InterruptedException e) {
                    MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e);
                }
            } catch (ExecutionException e2) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e2.getCause());
            }
        }
    }

    /* renamed from: i */
    public synchronized void m65380i() {
        this.f7958f = new JSONObject();
        m65398J();
    }

    /* renamed from: j */
    public void m65379j() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f7955c.get()).edit();
            edit.clear();
            m65392P(edit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: k */
    public synchronized String m65378k() {
        try {
            if (!this.f7960h) {
                m65367v();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7961i;
    }

    /* renamed from: l */
    public synchronized boolean m65377l(String str) {
        try {
            if (this.f7964l == null) {
                m65366w(str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7964l.booleanValue();
    }

    /* renamed from: m */
    public synchronized String m65376m() {
        try {
            if (!this.f7960h) {
                m65367v();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7962j;
    }

    /* renamed from: n */
    public synchronized String m65375n() {
        String str;
        str = null;
        try {
            str = ((SharedPreferences) this.f7953a.get()).getString("push_id", null);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e2.getCause());
        }
        return str;
    }

    /* renamed from: o */
    public Map m65374o() {
        synchronized (f7952p) {
            try {
                if (!f7951o) {
                    if (this.f7959g == null) {
                    }
                }
                m65365x();
                f7951o = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f7959g;
    }

    /* renamed from: p */
    public synchronized HashSet m65373p() {
        HashSet hashSet;
        hashSet = new HashSet();
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(((SharedPreferences) this.f7953a.get()).getString("seen_campaign_ids", ""), ",");
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(Integer.valueOf(stringTokenizer.nextToken()));
            }
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't read Mixpanel shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't read Mixpanel shared preferences.", e2.getCause());
        }
        return hashSet;
    }

    /* renamed from: q */
    public final JSONObject m65372q() {
        if (this.f7958f == null) {
            m65364y();
        }
        return this.f7958f;
    }

    /* renamed from: r */
    public Map m65371r() {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f7955c.get()).getAll().entrySet()) {
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
    public synchronized boolean m65370s(String str) {
        boolean z;
        z = false;
        try {
            z = ((SharedPreferences) this.f7956d.get()).getBoolean(str, false);
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel shared preferences.", e2.getCause());
        }
        return z;
    }

    /* renamed from: t */
    public synchronized boolean m65369t(boolean z) {
        try {
            if (f7950n == null) {
                try {
                    if (((SharedPreferences) this.f7956d.get()).getBoolean("has_launched", false)) {
                        f7950n = Boolean.FALSE;
                    } else {
                        f7950n = Boolean.valueOf(!z);
                    }
                } catch (InterruptedException unused) {
                    f7950n = Boolean.FALSE;
                } catch (ExecutionException unused2) {
                    f7950n = Boolean.FALSE;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7950n.booleanValue();
    }

    /* renamed from: u */
    public synchronized boolean m65368u(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer valueOf = Integer.valueOf(str);
            try {
                if (f7949m == null) {
                    Integer valueOf2 = Integer.valueOf(((SharedPreferences) this.f7956d.get()).getInt("latest_version_code", -1));
                    f7949m = valueOf2;
                    if (valueOf2.intValue() == -1) {
                        f7949m = valueOf;
                        SharedPreferences.Editor edit = ((SharedPreferences) this.f7956d.get()).edit();
                        edit.putInt("latest_version_code", valueOf.intValue());
                        m65392P(edit);
                    }
                }
                if (f7949m.intValue() < valueOf.intValue()) {
                    SharedPreferences.Editor edit2 = ((SharedPreferences) this.f7956d.get()).edit();
                    edit2.putInt("latest_version_code", valueOf.intValue());
                    m65392P(edit2);
                    return true;
                }
            } catch (InterruptedException e) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e);
            } catch (ExecutionException e2) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e2.getCause());
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
    public final void m65367v() {
        /*
            r4 = this;
            java.lang.String r0 = "Cannot read distinct ids from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            r2 = 0
            java.util.concurrent.Future r3 = r4.f7953a     // Catch: java.lang.InterruptedException -> Le java.util.concurrent.ExecutionException -> L10
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
            com.mixpanel.android.util.MPLog.m33448e(r1, r0, r3)
            goto L1d
        L16:
            java.lang.Throwable r3 = r3.getCause()
            com.mixpanel.android.util.MPLog.m33448e(r1, r0, r3)
        L1d:
            r3 = r2
        L1e:
            if (r3 != 0) goto L21
            return
        L21:
            java.lang.String r0 = "events_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f7961i = r0
            java.lang.String r0 = "people_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f7962j = r0
            r4.f7963k = r2
            java.lang.String r0 = "waiting_array"
            java.lang.String r0 = r3.getString(r0, r2)
            if (r0 == 0) goto L57
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L43
            r2.<init>(r0)     // Catch: org.json.JSONException -> L43
            r4.f7963k = r2     // Catch: org.json.JSONException -> L43
            goto L57
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not interpret waiting people JSON record "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.mixpanel.android.util.MPLog.m33449e(r1, r0)
        L57:
            java.lang.String r0 = r4.f7961i
            if (r0 != 0) goto L68
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.f7961i = r0
            r4.m65391Q()
        L68:
            r0 = 1
            r4.f7960h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18875Yk1.m65367v():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m65366w(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Cannot read opt out flag from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            java.util.concurrent.Future r2 = r3.f7956d     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
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
            com.mixpanel.android.util.MPLog.m33448e(r1, r0, r2)
            goto L1c
        L15:
            java.lang.Throwable r2 = r2.getCause()
            com.mixpanel.android.util.MPLog.m33448e(r1, r0, r2)
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
            r3.f7964l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18875Yk1.m65366w(java.lang.String):void");
    }

    /* renamed from: x */
    public final void m65365x() {
        this.f7959g = new HashMap();
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f7954b.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.f7957e);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f7957e);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                this.f7959g.put(entry.getKey(), value.toString());
            }
        } catch (InterruptedException e) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e);
        } catch (ExecutionException e2) {
            MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e2.getCause());
        }
    }

    /* renamed from: y */
    public final void m65364y() {
        JSONObject jSONObject;
        try {
            try {
                try {
                    try {
                        String string = ((SharedPreferences) this.f7953a.get()).getString("super_properties", "{}");
                        MPLog.m33445v("MixpanelAPI.PIdentity", "Loading Super Properties " + string);
                        this.f7958f = new JSONObject(string);
                    } catch (JSONException unused) {
                        MPLog.m33449e("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
                        m65398J();
                        if (this.f7958f == null) {
                            jSONObject = new JSONObject();
                            this.f7958f = jSONObject;
                        }
                    }
                } catch (InterruptedException e) {
                    MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e);
                    if (this.f7958f == null) {
                        jSONObject = new JSONObject();
                        this.f7958f = jSONObject;
                    }
                }
            } catch (ExecutionException e2) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e2.getCause());
                if (this.f7958f == null) {
                    jSONObject = new JSONObject();
                    this.f7958f = jSONObject;
                }
            }
        } catch (Throwable th2) {
            if (this.f7958f == null) {
                this.f7958f = new JSONObject();
            }
            throw th2;
        }
    }

    /* renamed from: z */
    public synchronized void m65363z(JSONObject jSONObject) {
        JSONObject m65372q = m65372q();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                m65372q.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                MPLog.m33448e("MixpanelAPI.PIdentity", "Exception registering super property.", e);
            }
        }
        m65398J();
    }
}