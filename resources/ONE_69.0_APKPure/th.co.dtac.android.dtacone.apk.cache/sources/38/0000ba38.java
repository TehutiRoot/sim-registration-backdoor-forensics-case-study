package com.mixpanel.android.viewcrawler;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mixpanel.android.mpmetrics.MPConfig;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.mpmetrics.OnMixpanelTweaksUpdatedListener;
import com.mixpanel.android.mpmetrics.ResourceReader;
import com.mixpanel.android.mpmetrics.SuperPropertyUpdate;
import com.mixpanel.android.mpmetrics.Tweaks;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.util.JSONUtils;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.util.MPPair;
import com.mixpanel.android.viewcrawler.EditProtocol;
import com.mixpanel.android.viewcrawler.EditorConnection;
import com.mixpanel.android.viewcrawler.FlipGesture;
import com.mixpanel.android.viewcrawler.ViewVisitor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(16)
/* loaded from: classes5.dex */
public class ViewCrawler implements UpdatesFromMixpanel, TrackingDebug, ViewVisitor.OnLayoutErrorListener {

    /* renamed from: a */
    public final MPConfig f58802a;

    /* renamed from: b */
    public final Context f58803b;

    /* renamed from: c */
    public final MixpanelAPI f58804c;

    /* renamed from: d */
    public final C9212a f58805d;

    /* renamed from: f */
    public final Tweaks f58807f;

    /* renamed from: g */
    public final Map f58808g;

    /* renamed from: h */
    public final HandlerC9204g f58809h;

    /* renamed from: e */
    public final C1513VQ f58806e = new C1513VQ();

    /* renamed from: i */
    public final float f58810i = Resources.getSystem().getDisplayMetrics().scaledDensity;

    /* renamed from: j */
    public final Set f58811j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$a */
    /* loaded from: classes5.dex */
    public class C9198a implements Tweaks.OnTweakDeclaredListener {
        public C9198a() {
        }

        @Override // com.mixpanel.android.mpmetrics.Tweaks.OnTweakDeclaredListener
        public void onTweakDeclared() {
            ViewCrawler.this.f58809h.sendMessage(ViewCrawler.this.f58809h.obtainMessage(4));
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$b */
    /* loaded from: classes5.dex */
    public class C9199b implements EditorConnection.Editor {
        public C9199b() {
        }

        @Override // com.mixpanel.android.viewcrawler.EditorConnection.Editor
        public void bindEvents(JSONObject jSONObject) {
            Message obtainMessage = ViewCrawler.this.f58809h.obtainMessage(6);
            obtainMessage.obj = jSONObject;
            ViewCrawler.this.f58809h.sendMessage(obtainMessage);
        }

        @Override // com.mixpanel.android.viewcrawler.EditorConnection.Editor
        public void cleanup() {
            ViewCrawler.this.f58809h.sendMessage(ViewCrawler.this.f58809h.obtainMessage(8));
        }

        @Override // com.mixpanel.android.viewcrawler.EditorConnection.Editor
        public void clearEdits(JSONObject jSONObject) {
            Message obtainMessage = ViewCrawler.this.f58809h.obtainMessage(10);
            obtainMessage.obj = jSONObject;
            ViewCrawler.this.f58809h.sendMessage(obtainMessage);
        }

        @Override // com.mixpanel.android.viewcrawler.EditorConnection.Editor
        public void performEdit(JSONObject jSONObject) {
            Message obtainMessage = ViewCrawler.this.f58809h.obtainMessage(3);
            obtainMessage.obj = jSONObject;
            ViewCrawler.this.f58809h.sendMessage(obtainMessage);
        }

        @Override // com.mixpanel.android.viewcrawler.EditorConnection.Editor
        public void sendDeviceInfo() {
            ViewCrawler.this.f58809h.sendMessage(ViewCrawler.this.f58809h.obtainMessage(4));
        }

        @Override // com.mixpanel.android.viewcrawler.EditorConnection.Editor
        public void sendSnapshot(JSONObject jSONObject) {
            Message obtainMessage = ViewCrawler.this.f58809h.obtainMessage(2);
            obtainMessage.obj = jSONObject;
            ViewCrawler.this.f58809h.sendMessage(obtainMessage);
        }

        @Override // com.mixpanel.android.viewcrawler.EditorConnection.Editor
        public void setTweaks(JSONObject jSONObject) {
            Message obtainMessage = ViewCrawler.this.f58809h.obtainMessage(11);
            obtainMessage.obj = jSONObject;
            ViewCrawler.this.f58809h.sendMessage(obtainMessage);
        }

        public /* synthetic */ C9199b(ViewCrawler viewCrawler, C9198a c9198a) {
            this();
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$c */
    /* loaded from: classes5.dex */
    public class RunnableC9200c implements Runnable {

        /* renamed from: a */
        public volatile boolean f58814a = true;

        public RunnableC9200c() {
        }

        /* renamed from: a */
        public void m33401a() {
            this.f58814a = false;
            ViewCrawler.this.f58809h.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f58814a) {
                ViewCrawler.this.f58809h.sendMessage(ViewCrawler.this.f58809h.obtainMessage(1));
            }
            ViewCrawler.this.f58809h.postDelayed(this, 30000L);
        }

        public void stop() {
            this.f58814a = true;
            ViewCrawler.this.f58809h.removeCallbacks(this);
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$d */
    /* loaded from: classes5.dex */
    public class C9201d implements Application.ActivityLifecycleCallbacks, FlipGesture.OnFlipGestureListener {

        /* renamed from: a */
        public final FlipGesture f58816a = new FlipGesture(this);

        /* renamed from: b */
        public final RunnableC9200c f58817b;

        public C9201d() {
            this.f58817b = new RunnableC9200c();
        }

        /* renamed from: a */
        public final void m33400a(Activity activity) {
            if (m33399b() && !ViewCrawler.this.f58802a.getDisableEmulatorBindingUI()) {
                this.f58817b.m33401a();
            } else if (!ViewCrawler.this.f58802a.getDisableGestureBindingUI()) {
                SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
                sensorManager.registerListener(this.f58816a, sensorManager.getDefaultSensor(1), 3);
            }
        }

        /* renamed from: b */
        public final boolean m33399b() {
            String str = Build.HARDWARE;
            if (!str.toLowerCase().equals("goldfish") && !str.toLowerCase().equals("ranchu")) {
                return false;
            }
            String str2 = Build.BRAND;
            if ((!str2.toLowerCase().startsWith("generic") && !str2.toLowerCase().equals("android") && !str2.toLowerCase().equals("google")) || !Build.DEVICE.toLowerCase().startsWith("generic") || !Build.PRODUCT.toLowerCase().contains("sdk") || !Build.MODEL.toLowerCase(Locale.US).contains("sdk")) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final void m33398c(Activity activity) {
            if (m33399b() && !ViewCrawler.this.f58802a.getDisableEmulatorBindingUI()) {
                this.f58817b.stop();
            } else if (!ViewCrawler.this.f58802a.getDisableGestureBindingUI()) {
                ((SensorManager) activity.getSystemService("sensor")).unregisterListener(this.f58816a);
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
            ViewCrawler.this.f58806e.m65997i(activity);
            m33398c(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            m33400a(activity);
            ViewCrawler.this.f58806e.m66001e(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // com.mixpanel.android.viewcrawler.FlipGesture.OnFlipGestureListener
        public void onFlipGesture() {
            ViewCrawler.this.f58804c.track("$ab_gesture3");
            ViewCrawler.this.f58809h.sendMessage(ViewCrawler.this.f58809h.obtainMessage(1));
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$e */
    /* loaded from: classes5.dex */
    public static class C9202e {

        /* renamed from: a */
        public final String f58819a;

        /* renamed from: b */
        public final String f58820b;

        /* renamed from: c */
        public final JSONObject f58821c;

        /* renamed from: d */
        public final MPPair f58822d;

        public C9202e(String str, String str2, JSONObject jSONObject, MPPair mPPair) {
            this.f58819a = str;
            this.f58820b = str2;
            this.f58821c = jSONObject;
            this.f58822d = mPPair;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9202e) || obj.hashCode() != hashCode()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f58819a.hashCode();
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$f */
    /* loaded from: classes5.dex */
    public static class C9203f {

        /* renamed from: a */
        public final String f58823a;

        /* renamed from: b */
        public final JSONObject f58824b;

        /* renamed from: c */
        public final MPPair f58825c;

        public C9203f(String str, JSONObject jSONObject, MPPair mPPair) {
            this.f58823a = str;
            this.f58824b = jSONObject;
            this.f58825c = mPPair;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9203f) || obj.hashCode() != hashCode()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f58823a.hashCode();
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$g */
    /* loaded from: classes5.dex */
    public class HandlerC9204g extends Handler {

        /* renamed from: a */
        public EditorConnection f58826a;

        /* renamed from: b */
        public C19510d42 f58827b;

        /* renamed from: c */
        public final String f58828c;

        /* renamed from: d */
        public final Lock f58829d;

        /* renamed from: e */
        public final EditProtocol f58830e;

        /* renamed from: f */
        public final ImageStore f58831f;

        /* renamed from: g */
        public final Map f58832g;

        /* renamed from: h */
        public final Map f58833h;

        /* renamed from: i */
        public final List f58834i;

        /* renamed from: j */
        public final Map f58835j;

        /* renamed from: k */
        public final Set f58836k;

        /* renamed from: l */
        public final Set f58837l;

        /* renamed from: m */
        public final Set f58838m;

        /* renamed from: n */
        public final Set f58839n;

        /* renamed from: o */
        public final Set f58840o;

        /* renamed from: p */
        public final Set f58841p;

        /* renamed from: com.mixpanel.android.viewcrawler.ViewCrawler$g$a */
        /* loaded from: classes5.dex */
        public class C9205a implements SuperPropertyUpdate {

            /* renamed from: a */
            public final /* synthetic */ JSONObject f58843a;

            public C9205a(JSONObject jSONObject) {
                this.f58843a = jSONObject;
            }

            @Override // com.mixpanel.android.mpmetrics.SuperPropertyUpdate
            public JSONObject update(JSONObject jSONObject) {
                try {
                    jSONObject.put("$experiments", this.f58843a);
                } catch (JSONException e) {
                    MPLog.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", e);
                }
                return jSONObject;
            }
        }

        public HandlerC9204g(Context context, String str, Looper looper, ViewVisitor.OnLayoutErrorListener onLayoutErrorListener) {
            super(looper);
            this.f58828c = str;
            this.f58827b = null;
            String resourcePackageName = ViewCrawler.this.f58802a.getResourcePackageName();
            ResourceReader.Ids ids = new ResourceReader.Ids(resourcePackageName == null ? context.getPackageName() : resourcePackageName, context);
            ImageStore imageStore = new ImageStore(context, "ViewCrawler");
            this.f58831f = imageStore;
            this.f58830e = new EditProtocol(context, ids, imageStore, onLayoutErrorListener);
            this.f58840o = new HashSet();
            this.f58832g = new HashMap();
            this.f58833h = new HashMap();
            this.f58834i = new ArrayList();
            this.f58835j = new HashMap();
            this.f58836k = new HashSet();
            this.f58837l = new HashSet();
            this.f58838m = new HashSet();
            this.f58839n = new HashSet();
            this.f58841p = new HashSet();
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f58829d = reentrantLock;
            reentrantLock.lock();
        }

        /* renamed from: a */
        public final void m33397a() {
            List arrayList;
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C9202e c9202e : this.f58836k) {
                try {
                    arrayList2.add(new MPPair(c9202e.f58820b, this.f58830e.m33439c(c9202e.f58821c).visitor));
                    if (!this.f58841p.contains(c9202e.f58822d)) {
                        hashSet.add(c9202e.f58822d);
                    }
                } catch (EditProtocol.CantGetEditAssetsException e) {
                    MPLog.m33444v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", e);
                } catch (EditProtocol.InapplicableInstructionsException e2) {
                    MPLog.m33447i("MixpanelAPI.ViewCrawler", e2.getMessage());
                } catch (EditProtocol.BadInstructionsException e3) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", e3);
                }
            }
            for (C9203f c9203f : this.f58837l) {
                try {
                    MPPair m33434h = this.f58830e.m33434h(c9203f.f58824b);
                    if (!this.f58841p.contains(c9203f.f58825c)) {
                        hashSet.add(c9203f.f58825c);
                        hashSet2.add(((Pair) m33434h).first);
                    } else if (ViewCrawler.this.f58807f.isNewValue((String) ((Pair) m33434h).first, ((Pair) m33434h).second)) {
                        hashSet2.add(((Pair) m33434h).first);
                    }
                    if (!ViewCrawler.this.f58807f.getAllValues().containsKey(((Pair) m33434h).first)) {
                        ViewCrawler.this.f58807f.addUndeclaredTweak((String) ((Pair) m33434h).first, Tweaks.TweakValue.fromJson(c9203f.f58824b));
                    } else {
                        ViewCrawler.this.f58807f.set((String) ((Pair) m33434h).first, ((Pair) m33434h).second);
                    }
                } catch (EditProtocol.BadInstructionsException e4) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad editor tweak cannot be applied.", e4);
                }
            }
            if (this.f58837l.size() == 0) {
                for (Map.Entry<String, Tweaks.TweakValue> entry : ViewCrawler.this.f58807f.getDefaultValues().entrySet()) {
                    Tweaks.TweakValue value = entry.getValue();
                    String key = entry.getKey();
                    if (ViewCrawler.this.f58807f.isNewValue(key, value.getValue())) {
                        ViewCrawler.this.f58807f.set(key, value.getValue());
                        hashSet2.add(key);
                    }
                }
            }
            for (MPPair mPPair : this.f58832g.values()) {
                try {
                    EditProtocol.Edit m33439c = this.f58830e.m33439c((JSONObject) ((Pair) mPPair).second);
                    arrayList2.add(new MPPair(((Pair) mPPair).first, m33439c.visitor));
                    this.f58834i.addAll(m33439c.imageUrls);
                } catch (EditProtocol.CantGetEditAssetsException e5) {
                    MPLog.m33444v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", e5);
                } catch (EditProtocol.InapplicableInstructionsException e6) {
                    MPLog.m33447i("MixpanelAPI.ViewCrawler", e6.getMessage());
                } catch (EditProtocol.BadInstructionsException e7) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", e7);
                }
            }
            for (MPPair mPPair2 : this.f58833h.values()) {
                if (ViewCrawler.this.f58807f.isNewValue((String) ((Pair) mPPair2).first, ((Pair) mPPair2).second)) {
                    hashSet2.add(((Pair) mPPair2).first);
                }
                ViewCrawler.this.f58807f.set((String) ((Pair) mPPair2).first, ((Pair) mPPair2).second);
            }
            if (this.f58835j.size() == 0 && this.f58840o.size() == 0) {
                for (MPPair mPPair3 : this.f58839n) {
                    try {
                        arrayList2.add(new MPPair(((Pair) mPPair3).first, this.f58830e.m33438d((JSONObject) ((Pair) mPPair3).second, ViewCrawler.this.f58805d)));
                    } catch (EditProtocol.InapplicableInstructionsException e8) {
                        MPLog.m33447i("MixpanelAPI.ViewCrawler", e8.getMessage());
                    } catch (EditProtocol.BadInstructionsException e9) {
                        MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", e9);
                    }
                }
            }
            for (MPPair mPPair4 : this.f58835j.values()) {
                try {
                    arrayList2.add(new MPPair(((Pair) mPPair4).first, this.f58830e.m33438d((JSONObject) ((Pair) mPPair4).second, ViewCrawler.this.f58805d)));
                } catch (EditProtocol.InapplicableInstructionsException e10) {
                    MPLog.m33447i("MixpanelAPI.ViewCrawler", e10.getMessage());
                } catch (EditProtocol.BadInstructionsException e11) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", e11);
                }
            }
            HashMap hashMap = new HashMap();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                MPPair mPPair5 = (MPPair) arrayList2.get(i);
                if (hashMap.containsKey(((Pair) mPPair5).first)) {
                    arrayList = (List) hashMap.get(((Pair) mPPair5).first);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(((Pair) mPPair5).first, arrayList);
                }
                arrayList.add(((Pair) mPPair5).second);
            }
            ViewCrawler.this.f58806e.m65996j(hashMap);
            for (MPPair mPPair6 : this.f58838m) {
                if (!this.f58841p.contains(mPPair6)) {
                    hashSet.add(mPPair6);
                }
            }
            this.f58841p.addAll(hashSet);
            m33377u(hashSet);
            this.f58838m.clear();
            if (hashSet2.size() > 0) {
                for (OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener : ViewCrawler.this.f58811j) {
                    onMixpanelTweaksUpdatedListener.onMixpanelTweakUpdated(hashSet2);
                }
            }
        }

        /* renamed from: b */
        public final void m33396b() {
            MPLog.m33445v("MixpanelAPI.ViewCrawler", "connecting to editor");
            EditorConnection editorConnection = this.f58826a;
            if (editorConnection != null && editorConnection.m33426g()) {
                MPLog.m33445v("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
                return;
            }
            SSLSocketFactory sSLSocketFactory = ViewCrawler.this.f58802a.getSSLSocketFactory();
            if (sSLSocketFactory == null) {
                MPLog.m33445v("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
                return;
            }
            String str = MPConfig.getInstance(ViewCrawler.this.f58803b).getEditorUrl() + this.f58828c;
            try {
                this.f58826a = new EditorConnection(new URI(str), new C9199b(ViewCrawler.this, null), sSLSocketFactory.createSocket());
            } catch (EditorConnection.EditorConnectionException e) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Error connecting to URI " + str, e);
            } catch (IOException e2) {
                MPLog.m33446i("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", e2);
            } catch (URISyntaxException e3) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Error parsing URI " + str + " for editor websocket", e3);
            }
        }

        /* renamed from: c */
        public final SharedPreferences m33395c() {
            return ViewCrawler.this.f58803b.getSharedPreferences("mixpanel.viewcrawler.changes" + this.f58828c, 0);
        }

        /* renamed from: d */
        public final void m33394d(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("actions");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f58832g.remove(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad clear request received", e);
            }
            m33397a();
        }

        /* renamed from: e */
        public final void m33393e(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("events");
                int length = jSONArray.length();
                this.f58835j.clear();
                if (!this.f58839n.isEmpty() && this.f58840o.isEmpty()) {
                    this.f58840o.addAll(this.f58839n);
                    for (MPPair mPPair : this.f58839n) {
                        try {
                            this.f58835j.put(((JSONObject) ((Pair) mPPair).second).get(ClientCookie.PATH_ATTR).toString(), mPPair);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    this.f58839n.clear();
                }
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        this.f58835j.put(jSONObject2.get(ClientCookie.PATH_ATTR).toString(), new MPPair(JSONUtils.optionalStringKey(jSONObject2, "target_activity"), jSONObject2));
                    } catch (JSONException e2) {
                        MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad event binding received from editor in " + jSONArray.toString(), e2);
                    }
                }
                m33397a();
            } catch (JSONException e3) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad event bindings received", e3);
            }
        }

        /* renamed from: f */
        public final void m33392f(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("actions");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String optionalStringKey = JSONUtils.optionalStringKey(jSONObject2, "target_activity");
                    this.f58832g.put(jSONObject2.getString("name"), new MPPair(optionalStringKey, jSONObject2));
                }
                m33397a();
            } catch (JSONException e) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad change request received", e);
            }
        }

        /* renamed from: g */
        public final void m33391g() {
            this.f58832g.clear();
            this.f58835j.clear();
            this.f58833h.clear();
            this.f58839n.addAll(this.f58840o);
            this.f58840o.clear();
            this.f58827b = null;
            MPLog.m33445v("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
            m33397a();
            for (String str : this.f58834i) {
                this.f58831f.deleteStorage(str);
            }
        }

        /* renamed from: h */
        public final void m33390h(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("tweaks");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    MPPair m33434h = this.f58830e.m33434h(jSONArray.getJSONObject(i));
                    this.f58833h.put(((Pair) m33434h).first, m33434h);
                }
            } catch (EditProtocol.BadInstructionsException e) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad tweaks received", e);
            } catch (JSONException e2) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Bad tweaks received", e2);
            }
            m33397a();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f58829d.lock();
            try {
                switch (message.what) {
                    case 0:
                        m33386l();
                        break;
                    case 1:
                        m33396b();
                        break;
                    case 2:
                        m33379s((JSONObject) message.obj);
                        break;
                    case 3:
                        m33392f((JSONObject) message.obj);
                        break;
                    case 4:
                        m33383o();
                        break;
                    case 5:
                        m33389i((JSONArray) message.obj);
                        break;
                    case 6:
                        m33393e((JSONObject) message.obj);
                        break;
                    case 7:
                        m33380r((String) message.obj);
                        break;
                    case 8:
                        m33391g();
                        break;
                    case 9:
                        m33388j((JSONArray) message.obj);
                        break;
                    case 10:
                        m33394d((JSONObject) message.obj);
                        break;
                    case 11:
                        m33390h((JSONObject) message.obj);
                        break;
                    case 12:
                        m33381q((ViewVisitor.LayoutErrorMessage) message.obj);
                        break;
                    case 13:
                        m33384n((JSONArray) message.obj);
                        break;
                }
            } finally {
                this.f58829d.unlock();
            }
        }

        /* renamed from: i */
        public final void m33389i(JSONArray jSONArray) {
            SharedPreferences.Editor edit = m33395c().edit();
            edit.putString("mixpanel.viewcrawler.bindings", jSONArray.toString());
            edit.apply();
            m33387k(jSONArray.toString());
            m33397a();
        }

        /* renamed from: j */
        public final void m33388j(JSONArray jSONArray) {
            m33384n(jSONArray);
            m33385m(jSONArray.toString(), true);
            m33397a();
        }

        /* renamed from: k */
        public final void m33387k(String str) {
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    this.f58839n.clear();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        this.f58839n.add(new MPPair(JSONUtils.optionalStringKey(jSONObject, "target_activity"), jSONObject));
                    }
                } catch (JSONException e) {
                    MPLog.m33446i("MixpanelAPI.ViewCrawler", "JSON error when loading event bindings, clearing persistent memory", e);
                    SharedPreferences.Editor edit = m33395c().edit();
                    edit.remove("mixpanel.viewcrawler.bindings");
                    edit.apply();
                }
            }
        }

        /* renamed from: l */
        public final void m33386l() {
            SharedPreferences m33395c = m33395c();
            String string = m33395c.getString("mixpanel.viewcrawler.changes", null);
            String string2 = m33395c.getString("mixpanel.viewcrawler.bindings", null);
            this.f58836k.clear();
            this.f58837l.clear();
            this.f58841p.clear();
            m33385m(string, false);
            this.f58839n.clear();
            m33387k(string2);
            m33397a();
        }

        /* renamed from: m */
        public final void m33385m(String str, boolean z) {
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        MPPair mPPair = new MPPair(Integer.valueOf(jSONObject.getInt("experiment_id")), Integer.valueOf(jSONObject.getInt("id")));
                        JSONArray jSONArray2 = jSONObject.getJSONArray("actions");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            this.f58836k.add(new C9202e(jSONObject2.getString("name"), JSONUtils.optionalStringKey(jSONObject2, "target_activity"), jSONObject2, mPPair));
                        }
                        JSONArray jSONArray3 = jSONObject.getJSONArray("tweaks");
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i3);
                            this.f58837l.add(new C9203f(jSONObject3.getString("name"), jSONObject3, mPPair));
                        }
                        if (!z) {
                            this.f58841p.add(mPPair);
                        }
                        if (length3 == 0 && length2 == 0) {
                            this.f58838m.add(mPPair);
                        }
                    }
                } catch (JSONException e) {
                    MPLog.m33446i("MixpanelAPI.ViewCrawler", "JSON error when loading ab tests / tweaks, clearing persistent memory", e);
                    SharedPreferences.Editor edit = m33395c().edit();
                    edit.remove("mixpanel.viewcrawler.changes");
                    edit.apply();
                }
            }
        }

        /* renamed from: n */
        public final void m33384n(JSONArray jSONArray) {
            SharedPreferences.Editor edit = m33395c().edit();
            edit.putString("mixpanel.viewcrawler.changes", jSONArray.toString());
            edit.apply();
        }

        /* renamed from: o */
        public final void m33383o() {
            EditorConnection editorConnection = this.f58826a;
            if (editorConnection != null && editorConnection.m33426g() && this.f58826a.m33427f()) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.f58826a.m33428e()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("device_info_response");
                            jsonWriter.name("payload").beginObject();
                            jsonWriter.name("device_type").value("Android");
                            JsonWriter name = jsonWriter.name("device_name");
                            name.value(Build.BRAND + RemoteSettings.FORWARD_SLASH_STRING + Build.MODEL);
                            jsonWriter.name("scaled_density").value((double) ViewCrawler.this.f58810i);
                            for (Map.Entry entry : ViewCrawler.this.f58808g.entrySet()) {
                                jsonWriter.name((String) entry.getKey()).value((String) entry.getValue());
                            }
                            Map<String, Tweaks.TweakValue> allValues = ViewCrawler.this.f58807f.getAllValues();
                            jsonWriter.name("tweaks").beginArray();
                            for (Map.Entry<String, Tweaks.TweakValue> entry2 : allValues.entrySet()) {
                                Tweaks.TweakValue value = entry2.getValue();
                                jsonWriter.beginObject();
                                jsonWriter.name("name").value(entry2.getKey());
                                jsonWriter.name("minimum").value(value.getMinimum());
                                jsonWriter.name("maximum").value(value.getMaximum());
                                int i = value.type;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i != 4) {
                                                MPLog.wtf("MixpanelAPI.ViewCrawler", "Unrecognized Tweak Type " + value.type + " encountered.");
                                            } else {
                                                jsonWriter.name("type").value(TypedValues.Custom.S_STRING);
                                                jsonWriter.name("value").value(value.getStringValue());
                                                jsonWriter.name("default").value((String) value.getDefaultValue());
                                            }
                                        } else {
                                            jsonWriter.name("type").value("number");
                                            jsonWriter.name("encoding").value(OperatorName.LINE_TO);
                                            jsonWriter.name("value").value(value.getNumberValue().longValue());
                                            jsonWriter.name("default").value(((Number) value.getDefaultValue()).longValue());
                                        }
                                    } else {
                                        jsonWriter.name("type").value("number");
                                        jsonWriter.name("encoding").value("d");
                                        jsonWriter.name("value").value(value.getNumberValue().doubleValue());
                                        jsonWriter.name("default").value(((Number) value.getDefaultValue()).doubleValue());
                                    }
                                } else {
                                    jsonWriter.name("type").value(TypedValues.Custom.S_BOOLEAN);
                                    jsonWriter.name("value").value(value.getBooleanValue().booleanValue());
                                    jsonWriter.name("default").value(((Boolean) value.getDefaultValue()).booleanValue());
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                            jsonWriter.endObject();
                            jsonWriter.endObject();
                            jsonWriter.close();
                        } catch (IOException e) {
                            MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't write device_info to server", e);
                            jsonWriter.close();
                        }
                    } catch (Throwable th2) {
                        try {
                            jsonWriter.close();
                        } catch (IOException e2) {
                            MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", e2);
                        }
                        throw th2;
                    }
                } catch (IOException e3) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", e3);
                }
            }
        }

        /* renamed from: p */
        public final void m33382p(String str) {
            EditorConnection editorConnection = this.f58826a;
            if (editorConnection != null && editorConnection.m33426g() && this.f58826a.m33427f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_message", str);
                } catch (JSONException e) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", e);
                }
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f58826a.m33428e());
                try {
                    try {
                        try {
                            outputStreamWriter.write("{\"type\": \"error\", ");
                            outputStreamWriter.write("\"payload\": ");
                            outputStreamWriter.write(jSONObject.toString());
                            outputStreamWriter.write("}");
                            outputStreamWriter.close();
                        } catch (IOException e2) {
                            MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't write error message to editor", e2);
                            outputStreamWriter.close();
                        }
                    } catch (Throwable th2) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            MPLog.m33448e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", e3);
                        }
                        throw th2;
                    }
                } catch (IOException e4) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", e4);
                }
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0057 -> B:20:0x0066). Please submit an issue!!! */
        /* renamed from: q */
        public final void m33381q(ViewVisitor.LayoutErrorMessage layoutErrorMessage) {
            EditorConnection editorConnection = this.f58826a;
            if (editorConnection != null && editorConnection.m33426g() && this.f58826a.m33427f()) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.f58826a.m33428e()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("layout_error");
                            jsonWriter.name("exception_type").value(layoutErrorMessage.getErrorType());
                            jsonWriter.name("cid").value(layoutErrorMessage.getName());
                            jsonWriter.endObject();
                            jsonWriter.close();
                        } catch (IOException e) {
                            MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", e);
                            jsonWriter.close();
                        }
                    } catch (IOException e2) {
                        MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close writer.", e2);
                    }
                } catch (Throwable th2) {
                    try {
                        jsonWriter.close();
                    } catch (IOException e3) {
                        MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close writer.", e3);
                    }
                    throw th2;
                }
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0054 -> B:20:0x0063). Please submit an issue!!! */
        /* renamed from: r */
        public final void m33380r(String str) {
            EditorConnection editorConnection = this.f58826a;
            if (editorConnection != null && editorConnection.m33426g() && this.f58826a.m33427f()) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.f58826a.m33428e()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("track_message");
                            jsonWriter.name("payload");
                            jsonWriter.beginObject();
                            jsonWriter.name("event_name").value(str);
                            jsonWriter.endObject();
                            jsonWriter.endObject();
                            jsonWriter.flush();
                            jsonWriter.close();
                        } catch (Throwable th2) {
                            try {
                                jsonWriter.close();
                            } catch (IOException e) {
                                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close writer.", e);
                            }
                            throw th2;
                        }
                    } catch (IOException e2) {
                        MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close writer.", e2);
                    }
                } catch (IOException e3) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", e3);
                    jsonWriter.close();
                }
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0084 -> B:26:0x0093). Please submit an issue!!! */
        /* renamed from: s */
        public final void m33379s(JSONObject jSONObject) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                if (jSONObject2.has("config")) {
                    this.f58827b = this.f58830e.m33435g(jSONObject2);
                    MPLog.m33445v("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
                }
                if (this.f58827b == null) {
                    m33382p("No snapshot configuration (or a malformed snapshot configuration) was sent.");
                    MPLog.m33443w("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
                    return;
                }
                BufferedOutputStream m33428e = this.f58826a.m33428e();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(m33428e);
                try {
                    try {
                        try {
                            outputStreamWriter.write("{");
                            outputStreamWriter.write("\"type\": \"snapshot_response\",");
                            outputStreamWriter.write("\"payload\": {");
                            outputStreamWriter.write("\"activities\":");
                            outputStreamWriter.flush();
                            this.f58827b.m31922d(ViewCrawler.this.f58806e, m33428e);
                            outputStreamWriter.write(",\"snapshot_time_millis\": ");
                            outputStreamWriter.write(Long.toString(System.currentTimeMillis() - currentTimeMillis));
                            outputStreamWriter.write("}");
                            outputStreamWriter.write("}");
                            outputStreamWriter.close();
                        } catch (Throwable th2) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e) {
                                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close writer.", e);
                            }
                            throw th2;
                        }
                    } catch (IOException e2) {
                        MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't close writer.", e2);
                    }
                } catch (IOException e3) {
                    MPLog.m33448e("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", e3);
                    outputStreamWriter.close();
                }
            } catch (EditProtocol.BadInstructionsException e4) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", e4);
                m33382p(e4.getMessage());
            } catch (JSONException e5) {
                MPLog.m33448e("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", e5);
                m33382p("Payload with snapshot config required with snapshot request");
            }
        }

        /* renamed from: t */
        public void m33378t() {
            this.f58829d.unlock();
        }

        /* renamed from: u */
        public final void m33377u(Set set) {
            if (set != null && set.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        MPPair mPPair = (MPPair) it.next();
                        int intValue = ((Integer) ((Pair) mPPair).first).intValue();
                        int intValue2 = ((Integer) ((Pair) mPPair).second).intValue();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("$experiment_id", intValue);
                        jSONObject2.put("$variant_id", intValue2);
                        jSONObject.put(Integer.toString(intValue), intValue2);
                        ViewCrawler.this.f58804c.getPeople().merge("$experiments", jSONObject);
                        ViewCrawler.this.f58804c.updateSuperProperties(new C9205a(jSONObject));
                        ViewCrawler.this.f58804c.track("$experiment_started", jSONObject2);
                    }
                } catch (JSONException e) {
                    MPLog.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", e);
                }
            }
        }
    }

    public ViewCrawler(Context context, String str, MixpanelAPI mixpanelAPI, Tweaks tweaks) {
        this.f58802a = MPConfig.getInstance(context);
        this.f58803b = context;
        this.f58807f = tweaks;
        this.f58808g = mixpanelAPI.getDeviceInfo();
        HandlerThread handlerThread = new HandlerThread(ViewCrawler.class.getCanonicalName());
        handlerThread.setPriority(10);
        handlerThread.start();
        HandlerC9204g handlerC9204g = new HandlerC9204g(context, str, handlerThread.getLooper(), this);
        this.f58809h = handlerC9204g;
        this.f58805d = new C9212a(mixpanelAPI, handlerC9204g);
        this.f58804c = mixpanelAPI;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C9201d());
        tweaks.addOnTweakDeclaredListener(new C9198a());
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public void addOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener) {
        if (onMixpanelTweaksUpdatedListener != null) {
            this.f58811j.add(onMixpanelTweaksUpdatedListener);
            return;
        }
        throw new NullPointerException("Listener cannot be null");
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public void applyPersistedUpdates() {
        HandlerC9204g handlerC9204g = this.f58809h;
        handlerC9204g.sendMessage(handlerC9204g.obtainMessage(0));
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public Tweaks getTweaks() {
        return this.f58807f;
    }

    @Override // com.mixpanel.android.viewcrawler.ViewVisitor.OnLayoutErrorListener
    public void onLayoutError(ViewVisitor.LayoutErrorMessage layoutErrorMessage) {
        Message obtainMessage = this.f58809h.obtainMessage();
        obtainMessage.what = 12;
        obtainMessage.obj = layoutErrorMessage;
        this.f58809h.sendMessage(obtainMessage);
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public void removeOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener) {
        this.f58811j.remove(onMixpanelTweaksUpdatedListener);
    }

    @Override // com.mixpanel.android.viewcrawler.TrackingDebug
    public void reportTrack(String str) {
        Message obtainMessage = this.f58809h.obtainMessage();
        obtainMessage.what = 7;
        obtainMessage.obj = str;
        this.f58809h.sendMessage(obtainMessage);
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public void setEventBindings(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.f58809h.obtainMessage(5);
            obtainMessage.obj = jSONArray;
            this.f58809h.sendMessage(obtainMessage);
        }
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public void setVariants(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.f58809h.obtainMessage(9);
            obtainMessage.obj = jSONArray;
            this.f58809h.sendMessage(obtainMessage);
        }
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public void startUpdates() {
        this.f58809h.m33378t();
        applyPersistedUpdates();
    }

    @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
    public void storeVariants(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.f58809h.obtainMessage(13);
            obtainMessage.obj = jSONArray;
            this.f58809h.sendMessage(obtainMessage);
        }
    }
}