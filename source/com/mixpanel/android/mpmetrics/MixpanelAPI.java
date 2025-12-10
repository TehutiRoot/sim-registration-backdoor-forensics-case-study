package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.mixpanel.android.R;
import com.mixpanel.android.mpmetrics.C9183a;
import com.mixpanel.android.mpmetrics.C9195d;
import com.mixpanel.android.mpmetrics.DecideMessages;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import com.mixpanel.android.takeoverinapp.TakeoverInAppActivity;
import com.mixpanel.android.util.ActivityImageUtils;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.viewcrawler.TrackingDebug;
import com.mixpanel.android.viewcrawler.UpdatesFromMixpanel;
import com.mixpanel.android.viewcrawler.ViewCrawler;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MixpanelAPI {
    public static final String VERSION = "5.4.1";

    /* renamed from: p */
    public static final Map f58591p = new HashMap();

    /* renamed from: q */
    public static final C9195d f58592q = new C9195d();

    /* renamed from: r */
    public static final Tweaks f58593r = new Tweaks();

    /* renamed from: s */
    public static Future f58594s;

    /* renamed from: a */
    public final Context f58595a;

    /* renamed from: b */
    public final C9183a f58596b;

    /* renamed from: c */
    public final MPConfig f58597c;

    /* renamed from: d */
    public final String f58598d;

    /* renamed from: e */
    public final C9160f f58599e;

    /* renamed from: f */
    public final UpdatesFromMixpanel f58600f;

    /* renamed from: g */
    public final C19228bk1 f58601g;

    /* renamed from: h */
    public final InterfaceC9165h f58602h;

    /* renamed from: i */
    public final TrackingDebug f58603i;

    /* renamed from: j */
    public final C9191b f58604j;

    /* renamed from: k */
    public final DecideMessages f58605k;

    /* renamed from: l */
    public final Map f58606l;

    /* renamed from: m */
    public final Map f58607m;

    /* renamed from: n */
    public C9193c f58608n;

    /* renamed from: o */
    public final C20528jG1 f58609o;

    /* loaded from: classes5.dex */
    public interface People {
        void addOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener);

        void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener);

        void append(String str, Object obj);

        void clearCharges();

        void clearPushRegistrationId();

        void clearPushRegistrationId(String str);

        void deleteUser();

        String getDistinctId();

        InAppNotification getNotificationIfAvailable();

        String getPushRegistrationId();

        void identify(String str);

        void increment(String str, double d);

        void increment(Map<String, ? extends Number> map);

        void initPushHandling(String str);

        boolean isIdentified();

        void joinExperimentIfAvailable();

        void merge(String str, JSONObject jSONObject);

        void remove(String str, Object obj);

        void removeOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener);

        void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener);

        void set(String str, Object obj);

        void set(JSONObject jSONObject);

        void setMap(Map<String, Object> map);

        void setOnce(String str, Object obj);

        void setOnce(JSONObject jSONObject);

        void setOnceMap(Map<String, Object> map);

        void setPushRegistrationId(String str);

        void showGivenNotification(InAppNotification inAppNotification, Activity activity);

        void showNotificationById(int i, Activity activity);

        void showNotificationIfAvailable(Activity activity);

        void trackCharge(double d, JSONObject jSONObject);

        void trackNotification(String str, InAppNotification inAppNotification, JSONObject jSONObject);

        void trackNotificationSeen(InAppNotification inAppNotification);

        void union(String str, JSONArray jSONArray);

        void unset(String str);

        People withIdentity(String str);
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$a */
    /* loaded from: classes5.dex */
    public class C9155a implements C9195d.InterfaceC9197b {
        public C9155a() {
        }

        @Override // com.mixpanel.android.mpmetrics.C9195d.InterfaceC9197b
        /* renamed from: a */
        public void mo33476a(SharedPreferences sharedPreferences) {
            JSONArray m51848O = C19228bk1.m51848O(sharedPreferences);
            if (m51848O != null) {
                MixpanelAPI.this.m33601C(m51848O);
            }
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$b */
    /* loaded from: classes5.dex */
    public static class C9156b extends BroadcastReceiver {
        public C9156b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            JSONObject jSONObject = new JSONObject();
            Bundle bundleExtra = intent.getBundleExtra("event_args");
            if (bundleExtra != null) {
                for (String str : bundleExtra.keySet()) {
                    try {
                        jSONObject.put(str, bundleExtra.get(str));
                    } catch (JSONException e) {
                        MPLog.m33456e("MixpanelAPI.AL", "failed to add key \"" + str + "\" to properties for tracking bolts event", e);
                    }
                }
            }
            MixpanelAPI mixpanelAPI = MixpanelAPI.this;
            mixpanelAPI.track("$" + intent.getStringExtra("event_name"), jSONObject);
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$c */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9157c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58612a;

        static {
            int[] iArr = new int[InAppNotification.Type.values().length];
            f58612a = iArr;
            try {
                iArr[InAppNotification.Type.MINI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58612a[InAppNotification.Type.TAKEOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC9158d {
        /* renamed from: a */
        void mo33492a(MixpanelAPI mixpanelAPI);
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$e */
    /* loaded from: classes5.dex */
    public class C9159e implements UpdatesFromMixpanel {

        /* renamed from: a */
        public final Tweaks f58613a;

        public C9159e(Tweaks tweaks) {
            this.f58613a = tweaks;
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public void addOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener) {
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public void applyPersistedUpdates() {
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public Tweaks getTweaks() {
            return this.f58613a;
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public void removeOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener) {
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public void setEventBindings(JSONArray jSONArray) {
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public void setVariants(JSONArray jSONArray) {
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public void startUpdates() {
        }

        @Override // com.mixpanel.android.viewcrawler.UpdatesFromMixpanel
        public void storeVariants(JSONArray jSONArray) {
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$f */
    /* loaded from: classes5.dex */
    public class C9160f implements People {

        /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$f$a */
        /* loaded from: classes5.dex */
        public class C9161a implements InterfaceC9158d {

            /* renamed from: a */
            public final /* synthetic */ String f58616a;

            public C9161a(String str) {
                this.f58616a = str;
            }

            @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9158d
            /* renamed from: a */
            public void mo33492a(MixpanelAPI mixpanelAPI) {
                MPLog.m33453v("MixpanelAPI.API", "Using existing pushId " + this.f58616a);
                mixpanelAPI.getPeople().setPushRegistrationId(this.f58616a);
            }
        }

        /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$f$b */
        /* loaded from: classes5.dex */
        public class C9162b extends C9160f {

            /* renamed from: b */
            public final /* synthetic */ String f58618b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9162b(String str) {
                super(MixpanelAPI.this, null);
                this.f58618b = str;
            }

            @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.C9160f, com.mixpanel.android.mpmetrics.MixpanelAPI.People
            public String getDistinctId() {
                return this.f58618b;
            }

            @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.C9160f, com.mixpanel.android.mpmetrics.MixpanelAPI.People
            public void identify(String str) {
                throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
            }
        }

        /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$f$c */
        /* loaded from: classes5.dex */
        public class RunnableC9163c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InAppNotification f58620a;

            /* renamed from: b */
            public final /* synthetic */ Activity f58621b;

            public RunnableC9163c(InAppNotification inAppNotification, Activity activity) {
                this.f58620a = inAppNotification;
                this.f58621b = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                ReentrantLock m33539a = UpdateDisplayState.m33539a();
                m33539a.lock();
                try {
                    if (UpdateDisplayState.m33538b()) {
                        MPLog.m33453v("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
                        return;
                    }
                    InAppNotification inAppNotification = this.f58620a;
                    if (inAppNotification == null) {
                        inAppNotification = C9160f.this.getNotificationIfAvailable();
                    }
                    if (inAppNotification == null) {
                        MPLog.m33453v("MixpanelAPI.API", "No notification available, will not show.");
                        return;
                    }
                    InAppNotification.Type type = inAppNotification.getType();
                    if (type == InAppNotification.Type.TAKEOVER && !AbstractC17161yw.m158d(this.f58621b.getApplicationContext())) {
                        MPLog.m33453v("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
                        return;
                    }
                    int m33537c = UpdateDisplayState.m33537c(new UpdateDisplayState.DisplayState.InAppNotificationState(inAppNotification, ActivityImageUtils.getHighlightColorFromBackground(this.f58621b)), C9160f.this.getDistinctId(), MixpanelAPI.this.f58598d);
                    if (m33537c <= 0) {
                        MPLog.m33457e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
                        return;
                    }
                    int i = C9157c.f58612a[type.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            MPLog.m33457e("MixpanelAPI.API", "Unrecognized notification type " + type + " can't be shown");
                        } else {
                            MPLog.m33453v("MixpanelAPI.API", "Sending intent for takeover notification.");
                            Intent intent = new Intent(this.f58621b.getApplicationContext(), TakeoverInAppActivity.class);
                            intent.addFlags(268435456);
                            intent.addFlags(131072);
                            intent.putExtra(TakeoverInAppActivity.INTENT_ID_KEY, m33537c);
                            this.f58621b.startActivity(intent);
                        }
                    } else {
                        UpdateDisplayState claimDisplayState = UpdateDisplayState.claimDisplayState(m33537c);
                        if (claimDisplayState == null) {
                            MPLog.m33453v("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
                            return;
                        }
                        InAppFragment inAppFragment = new InAppFragment();
                        inAppFragment.setDisplayState(MixpanelAPI.this, m33537c, (UpdateDisplayState.DisplayState.InAppNotificationState) claimDisplayState.getDisplayState());
                        inAppFragment.setRetainInstance(true);
                        MPLog.m33453v("MixpanelAPI.API", "Attempting to show mini notification.");
                        FragmentTransaction beginTransaction = this.f58621b.getFragmentManager().beginTransaction();
                        beginTransaction.setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down);
                        beginTransaction.add(16908290, inAppFragment);
                        try {
                            beginTransaction.commit();
                        } catch (IllegalStateException unused) {
                            MPLog.m33453v("MixpanelAPI.API", "Unable to show notification.");
                            MixpanelAPI.this.f58605k.m33651i(inAppNotification);
                        }
                    }
                    if (!MixpanelAPI.this.f58597c.getTestMode()) {
                        C9160f.this.trackNotificationSeen(inAppNotification);
                    }
                } finally {
                    m33539a.unlock();
                }
            }
        }

        public C9160f() {
        }

        /* renamed from: a */
        public final void m33573a(String str) {
            MixpanelAPI.this.f58596b.m33514o(str);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void addOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener) {
            if (onMixpanelTweaksUpdatedListener != null) {
                MixpanelAPI.this.f58600f.addOnMixpanelTweaksUpdatedListener(onMixpanelTweaksUpdatedListener);
                return;
            }
            throw new NullPointerException("Listener cannot be null");
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener) {
            MixpanelAPI.this.f58602h.addOnMixpanelUpdatesReceivedListener(onMixpanelUpdatesReceivedListener);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void append(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                MixpanelAPI.this.m33574z(m33571c("$append", jSONObject));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception appending a property", e);
            }
        }

        /* renamed from: b */
        public final void m33572b(InAppNotification inAppNotification, Activity activity) {
            activity.runOnUiThread(new RunnableC9163c(inAppNotification, activity));
        }

        /* renamed from: c */
        public final JSONObject m33571c(String str, Object obj) {
            JSONObject jSONObject = new JSONObject();
            String distinctId = getDistinctId();
            jSONObject.put(str, obj);
            jSONObject.put("$token", MixpanelAPI.this.f58598d);
            jSONObject.put("$time", System.currentTimeMillis());
            if (distinctId != null) {
                jSONObject.put("$distinct_id", distinctId);
            }
            jSONObject.put("$mp_metadata", MixpanelAPI.this.f58609o.m29226b());
            return jSONObject;
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void clearCharges() {
            unset("$transactions");
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void clearPushRegistrationId() {
            MixpanelAPI.this.f58601g.m51837g();
            set("$android_devices", new JSONArray());
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void deleteUser() {
            try {
                MixpanelAPI.this.m33574z(m33571c("$delete", JSONObject.NULL));
            } catch (JSONException unused) {
                MPLog.m33457e("MixpanelAPI.API", "Exception deleting a user");
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public String getDistinctId() {
            return MixpanelAPI.this.f58601g.m51831m();
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public InAppNotification getNotificationIfAvailable() {
            return MixpanelAPI.this.f58605k.m33656d(MixpanelAPI.this.f58597c.getTestMode());
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public String getPushRegistrationId() {
            return MixpanelAPI.this.f58601g.m51830n();
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void identify(String str) {
            if (!MixpanelAPI.this.hasOptedOutTracking()) {
                synchronized (MixpanelAPI.this.f58601g) {
                    MixpanelAPI.this.f58601g.m51855H(str);
                    MixpanelAPI.this.f58605k.m33649k(str);
                }
                MixpanelAPI.this.m33575y();
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void increment(Map map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                MixpanelAPI.this.m33574z(m33571c("$add", new JSONObject(map)));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception incrementing properties", e);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void initPushHandling(String str) {
            if (!AbstractC17161yw.m160b(MixpanelAPI.this.f58595a)) {
                MPLog.m33455i("MixpanelAPI.API", "Can't register for push notification services. Push notifications will not work.");
                MPLog.m33455i("MixpanelAPI.API", "See log tagged " + AbstractC17161yw.f108941a + " above for details.");
                return;
            }
            String m51830n = MixpanelAPI.this.f58601g.m51830n();
            if (m51830n == null) {
                m33573a(str);
            } else {
                MixpanelAPI.m33585o(new C9161a(m51830n));
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public boolean isIdentified() {
            if (getDistinctId() != null) {
                return true;
            }
            return false;
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void joinExperimentIfAvailable() {
            MixpanelAPI.this.f58600f.setVariants(MixpanelAPI.this.f58605k.m33654f());
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void merge(String str, JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(str, jSONObject);
                MixpanelAPI.this.m33574z(m33571c("$merge", jSONObject2));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception merging a property", e);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void remove(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                MixpanelAPI.this.m33574z(m33571c("$remove", jSONObject));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception appending a property", e);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void removeOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener onMixpanelTweaksUpdatedListener) {
            MixpanelAPI.this.f58600f.removeOnMixpanelTweaksUpdatedListener(onMixpanelTweaksUpdatedListener);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener) {
            MixpanelAPI.this.f58602h.removeOnMixpanelUpdatesReceivedListener(onMixpanelUpdatesReceivedListener);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void set(JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(MixpanelAPI.this.f58606l);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                MixpanelAPI.this.m33574z(m33571c("$set", jSONObject2));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception setting people properties", e);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setMap(Map map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            if (map == null) {
                MPLog.m33457e("MixpanelAPI.API", "setMap does not accept null properties");
                return;
            }
            try {
                set(new JSONObject(map));
            } catch (NullPointerException unused) {
                MPLog.m33451w("MixpanelAPI.API", "Can't have null keys in the properties of setMap!");
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setOnce(JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                MixpanelAPI.this.m33574z(m33571c("$set_once", jSONObject));
            } catch (JSONException unused) {
                MPLog.m33457e("MixpanelAPI.API", "Exception setting people properties");
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setOnceMap(Map map) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            if (map == null) {
                MPLog.m33457e("MixpanelAPI.API", "setOnceMap does not accept null properties");
                return;
            }
            try {
                setOnce(new JSONObject(map));
            } catch (NullPointerException unused) {
                MPLog.m33451w("MixpanelAPI.API", "Can't have null keys in the properties setOnceMap!");
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setPushRegistrationId(String str) {
            synchronized (MixpanelAPI.this.f58601g) {
                try {
                    if (MixpanelAPI.this.f58601g.m51831m() == null) {
                        return;
                    }
                    MixpanelAPI.this.f58601g.m51854I(str);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str);
                    union("$android_devices", jSONArray);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void showGivenNotification(InAppNotification inAppNotification, Activity activity) {
            if (inAppNotification != null) {
                m33572b(inAppNotification, activity);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void showNotificationById(int i, Activity activity) {
            showGivenNotification(MixpanelAPI.this.f58605k.m33657c(i, MixpanelAPI.this.f58597c.getTestMode()), activity);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void showNotificationIfAvailable(Activity activity) {
            m33572b(null, activity);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void trackCharge(double d, JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("$amount", d);
                jSONObject2.put("$time", simpleDateFormat.format(date));
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                }
                append("$transactions", jSONObject2);
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception creating new charge", e);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void trackNotification(String str, InAppNotification inAppNotification, JSONObject jSONObject) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            JSONObject m33629a = inAppNotification.m33629a();
            if (jSONObject != null) {
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        m33629a.put(next, jSONObject.get(next));
                    }
                } catch (JSONException e) {
                    MPLog.m33456e("MixpanelAPI.API", "Exception merging provided properties with notification properties", e);
                }
            }
            MixpanelAPI.this.track(str, m33629a);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void trackNotificationSeen(InAppNotification inAppNotification) {
            if (inAppNotification == null) {
                return;
            }
            MixpanelAPI.this.f58601g.m51860C(Integer.valueOf(inAppNotification.getId()));
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            trackNotification("$campaign_delivery", inAppNotification, null);
            People withIdentity = MixpanelAPI.this.getPeople().withIdentity(getDistinctId());
            if (withIdentity != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                JSONObject m33629a = inAppNotification.m33629a();
                try {
                    m33629a.put("$time", simpleDateFormat.format(new Date()));
                } catch (JSONException e) {
                    MPLog.m33456e("MixpanelAPI.API", "Exception trying to track an in-app notification seen", e);
                }
                withIdentity.append("$campaigns", Integer.valueOf(inAppNotification.getId()));
                withIdentity.append("$notifications", m33629a);
                return;
            }
            MPLog.m33457e("MixpanelAPI.API", "No identity found. Make sure to call getPeople().identify() before showing in-app notifications.");
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void union(String str, JSONArray jSONArray) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, jSONArray);
                MixpanelAPI.this.m33574z(m33571c("$union", jSONObject));
            } catch (JSONException unused) {
                MPLog.m33457e("MixpanelAPI.API", "Exception unioning a property");
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void unset(String str) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                MixpanelAPI.this.m33574z(m33571c("$unset", jSONArray));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception unsetting a property", e);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public People withIdentity(String str) {
            if (str == null) {
                return null;
            }
            return new C9162b(str);
        }

        public /* synthetic */ C9160f(MixpanelAPI mixpanelAPI, C9155a c9155a) {
            this();
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void clearPushRegistrationId(String str) {
            if (str == null) {
                return;
            }
            if (str.equals(MixpanelAPI.this.f58601g.m51830n())) {
                MixpanelAPI.this.f58601g.m51837g();
            }
            remove("$android_devices", str);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void setOnce(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                setOnce(new JSONObject().put(str, obj));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "set", e);
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void increment(String str, double d) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str, Double.valueOf(d));
            increment(hashMap);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.People
        public void set(String str, Object obj) {
            if (MixpanelAPI.this.hasOptedOutTracking()) {
                return;
            }
            try {
                set(new JSONObject().put(str, obj));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "set", e);
            }
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$h */
    /* loaded from: classes5.dex */
    public interface InterfaceC9165h extends DecideMessages.OnNewResultsListener {
        void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener);

        void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener);
    }

    public MixpanelAPI(Context context, Future future, String str, boolean z) {
        this(context, future, str, MPConfig.getInstance(context), z);
    }

    /* renamed from: A */
    public static void m33603A(Context context, MixpanelAPI mixpanelAPI) {
        try {
            Object obj = LocalBroadcastManager.f35994f;
            LocalBroadcastManager.class.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(LocalBroadcastManager.class.getMethod("getInstance", Context.class).invoke(null, context), new C9156b(), new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (ClassNotFoundException e) {
            MPLog.m33459d("MixpanelAPI.AL", "To enable App Links tracking android.support.v4 must be installed: " + e.getMessage());
        } catch (IllegalAccessException e2) {
            MPLog.m33459d("MixpanelAPI.AL", "App Links tracking will not be enabled due to this exception: " + e2.getMessage());
        } catch (NoSuchMethodException e3) {
            MPLog.m33459d("MixpanelAPI.AL", "To enable App Links tracking android.support.v4 must be installed: " + e3.getMessage());
        } catch (InvocationTargetException e4) {
            MPLog.m33458d("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", e4);
        }
    }

    public static Tweak<Boolean> booleanTweak(String str, boolean z) {
        return f58593r.m33566b(str, z);
    }

    public static Tweak<Byte> byteTweak(String str, byte b) {
        return f58593r.m33565c(str, b);
    }

    public static Tweak<Double> doubleTweak(String str, double d) {
        return f58593r.m33564d(str, d);
    }

    public static Tweak<Float> floatTweak(String str, float f) {
        return f58593r.m33562f(str, f);
    }

    public static MixpanelAPI getInstance(Context context, String str) {
        return getInstance(context, str, false);
    }

    public static Tweak<Integer> intTweak(String str, int i) {
        return f58593r.m33559i(str, i);
    }

    public static Tweak<Long> longTweak(String str, long j) {
        return f58593r.m33557k(str, j);
    }

    /* renamed from: o */
    public static void m33585o(InterfaceC9158d interfaceC9158d) {
        Map map = f58591p;
        synchronized (map) {
            try {
                for (Map map2 : map.values()) {
                    for (MixpanelAPI mixpanelAPI : map2.values()) {
                        interfaceC9158d.mo33492a(mixpanelAPI);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public static void m33584p(Context context) {
        if (context instanceof Activity) {
            try {
                Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
                return;
            } catch (ClassNotFoundException e) {
                MPLog.m33459d("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e.getMessage());
                return;
            } catch (IllegalAccessException e2) {
                MPLog.m33459d("MixpanelAPI.AL", "Unable to detect inbound App Links: " + e2.getMessage());
                return;
            } catch (NoSuchMethodException e3) {
                MPLog.m33459d("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e3.getMessage());
                return;
            } catch (InvocationTargetException e4) {
                MPLog.m33458d("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", e4);
                return;
            }
        }
        MPLog.m33459d("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
    }

    @Deprecated
    public static void setFlushInterval(Context context, long j) {
        MPLog.m33455i("MixpanelAPI.API", "MixpanelAPI.setFlushInterval is deprecated. Calling is now a no-op.\n    To set a custom Mixpanel flush interval for your application, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.FlushInterval\" android:value=\"YOUR_INTERVAL\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    public static Tweak<Short> shortTweak(String str, short s) {
        return f58593r.m33555m(str, s);
    }

    public static Tweak<String> stringTweak(String str, String str2) {
        return f58593r.m33554n(str, str2);
    }

    /* renamed from: B */
    public void m33602B() {
        if (this.f58595a.getApplicationContext() instanceof Application) {
            C9193c c9193c = new C9193c(this, this.f58597c);
            this.f58608n = c9193c;
            ((Application) this.f58595a.getApplicationContext()).registerActivityLifecycleCallbacks(c9193c);
            return;
        }
        MPLog.m33455i("MixpanelAPI.API", "Context is not an Application, Mixpanel will not automatically show in-app notifications or A/B test experiments. We won't be able to automatically flush on an app background.");
    }

    /* renamed from: C */
    public final void m33601C(JSONArray jSONArray) {
        if (hasOptedOutTracking()) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.f58596b.m33516m(new C9183a.C9187d(jSONArray.getJSONObject(i), this.f58598d));
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Malformed people record stored pending identity, will not send it.", e);
            }
        }
    }

    /* renamed from: D */
    public boolean m33600D() {
        return !this.f58597c.getDisableAppOpenEvent();
    }

    public void alias(String str, String str2) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (str2 == null) {
            str2 = getDistinctId();
        }
        if (str.equals(str2)) {
            MPLog.m33451w("MixpanelAPI.API", "Attempted to alias identical distinct_ids " + str + ". Alias message will not be sent.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alias", str);
            jSONObject.put("original", str2);
            track("$create_alias", jSONObject);
        } catch (JSONException e) {
            MPLog.m33456e("MixpanelAPI.API", "Failed to alias", e);
        }
        flush();
    }

    public void clearSuperProperties() {
        this.f58601g.m51835i();
    }

    public double eventElapsedTime(String str) {
        Long l;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f58607m) {
            l = (Long) this.f58607m.get(str);
        }
        if (l == null) {
            return 0.0d;
        }
        return (currentTimeMillis - l.longValue()) / 1000;
    }

    public void flush() {
        if (hasOptedOutTracking()) {
            return;
        }
        this.f58596b.m33515n(new C9183a.C9185b(this.f58598d));
    }

    public void flushNoDecideCheck() {
        if (hasOptedOutTracking()) {
            return;
        }
        this.f58596b.m33515n(new C9183a.C9185b(this.f58598d, false));
    }

    public Map<String, String> getDeviceInfo() {
        return this.f58606l;
    }

    public String getDistinctId() {
        return this.f58601g.m51833k();
    }

    public People getPeople() {
        return this.f58599e;
    }

    public JSONObject getSuperProperties() {
        JSONObject jSONObject = new JSONObject();
        this.f58601g.m51840d(jSONObject);
        return jSONObject;
    }

    public boolean hasOptedOutTracking() {
        return this.f58601g.m51832l(this.f58598d);
    }

    public void identify(String str) {
        if (hasOptedOutTracking()) {
            return;
        }
        synchronized (this.f58601g) {
            try {
                this.f58601g.m51859D(str);
                String m51831m = this.f58601g.m51831m();
                if (m51831m == null) {
                    m51831m = this.f58601g.m51833k();
                }
                this.f58605k.m33649k(m51831m);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isAppInForeground() {
        C9193c c9193c = this.f58608n;
        if (c9193c != null) {
            return c9193c.m33480g();
        }
        return false;
    }

    @Deprecated
    public void logPosts() {
        MPLog.m33455i("MixpanelAPI.API", "MixpanelAPI.logPosts() is deprecated.\n    To get verbose debug level logging, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.EnableDebugLogging\" value=\"true\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    public void optInTracking() {
        optInTracking(null, null);
    }

    public void optOutTracking() {
        m33579u().m33525d(new C9183a.C9186c(this.f58598d));
        if (getPeople().isIdentified()) {
            getPeople().deleteUser();
            getPeople().clearCharges();
        }
        this.f58601g.m51838f();
        synchronized (this.f58607m) {
            this.f58607m.clear();
            this.f58601g.m51834j();
        }
        this.f58601g.m51836h();
        this.f58601g.m51856G(true, this.f58598d);
    }

    /* renamed from: q */
    public DecideMessages m33583q(String str, DecideMessages.OnNewResultsListener onNewResultsListener, UpdatesFromMixpanel updatesFromMixpanel) {
        return new DecideMessages(this.f58595a, str, onNewResultsListener, updatesFromMixpanel, this.f58601g.m51828p());
    }

    /* renamed from: r */
    public TrackingDebug m33582r() {
        UpdatesFromMixpanel updatesFromMixpanel = this.f58600f;
        if (updatesFromMixpanel instanceof ViewCrawler) {
            return (TrackingDebug) updatesFromMixpanel;
        }
        return null;
    }

    public void registerSuperProperties(JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.f58601g.m51818z(jSONObject);
    }

    public void registerSuperPropertiesMap(Map<String, Object> map) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (map == null) {
            MPLog.m33457e("MixpanelAPI.API", "registerSuperPropertiesMap does not accept null properties");
            return;
        }
        try {
            registerSuperProperties(new JSONObject(map));
        } catch (NullPointerException unused) {
            MPLog.m33451w("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesMap");
        }
    }

    public void registerSuperPropertiesOnce(JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.f58601g.m51862A(jSONObject);
    }

    public void registerSuperPropertiesOnceMap(Map<String, Object> map) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (map == null) {
            MPLog.m33457e("MixpanelAPI.API", "registerSuperPropertiesOnceMap does not accept null properties");
            return;
        }
        try {
            registerSuperPropertiesOnce(new JSONObject(map));
        } catch (NullPointerException unused) {
            MPLog.m33451w("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesOnce!");
        }
    }

    public void reset() {
        this.f58601g.m51838f();
        identify(getDistinctId());
        this.f58604j.m33490b();
        this.f58600f.storeVariants(new JSONArray());
        this.f58600f.applyPersistedUpdates();
        flush();
    }

    /* renamed from: s */
    public UpdatesFromMixpanel m33581s(Context context, String str) {
        if (!this.f58597c.getDisableViewCrawler() && !Arrays.asList(this.f58597c.getDisableViewCrawlerForProjects()).contains(str)) {
            return new ViewCrawler(this.f58595a, this.f58598d, this, f58593r);
        }
        MPLog.m33455i("MixpanelAPI.API", "DisableViewCrawler is set to true. Web Configuration, A/B Testing, and Dynamic Tweaks are disabled.");
        return new C9159e(f58593r);
    }

    /* renamed from: t */
    public InterfaceC9165h m33580t() {
        return new RunnableC9164g(this, null);
    }

    public void timeEvent(String str) {
        if (hasOptedOutTracking()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f58607m) {
            this.f58607m.put(str, Long.valueOf(currentTimeMillis));
            this.f58601g.m51839e(str, Long.valueOf(currentTimeMillis));
        }
    }

    public void track(String str, JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        track(str, jSONObject, false);
    }

    public void trackMap(String str, Map<String, Object> map) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (map == null) {
            track(str, null);
            return;
        }
        try {
            track(str, new JSONObject(map));
        } catch (NullPointerException unused) {
            MPLog.m33451w("MixpanelAPI.API", "Can't have null keys in the properties of trackMap!");
        }
    }

    /* renamed from: u */
    public C9183a m33579u() {
        return C9183a.m33522g(this.f58595a);
    }

    public void unregisterSuperProperty(String str) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.f58601g.m51851L(str);
    }

    public void updateSuperProperties(SuperPropertyUpdate superPropertyUpdate) {
        if (hasOptedOutTracking()) {
            return;
        }
        this.f58601g.m51850M(superPropertyUpdate);
    }

    /* renamed from: v */
    public C19228bk1 m33578v(Context context, Future future, String str) {
        C9155a c9155a = new C9155a();
        C9195d c9195d = f58592q;
        return new C19228bk1(future, c9195d.m33478a(context, "com.mixpanel.android.mpmetrics.MixpanelAPI_" + str, c9155a), c9195d.m33478a(context, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_" + str, null), c9195d.m33478a(context, "com.mixpanel.android.mpmetrics.Mixpanel", null));
    }

    /* renamed from: w */
    public void m33577w() {
        flush();
        this.f58600f.applyPersistedUpdates();
    }

    /* renamed from: x */
    public void m33576x() {
        this.f58609o.m29224d();
    }

    /* renamed from: y */
    public final void m33575y() {
        JSONArray m51849N;
        if (!hasOptedOutTracking() && (m51849N = this.f58601g.m51849N()) != null) {
            m33601C(m51849N);
        }
    }

    /* renamed from: z */
    public final void m33574z(JSONObject jSONObject) {
        if (hasOptedOutTracking()) {
            return;
        }
        if (jSONObject.has("$distinct_id")) {
            this.f58596b.m33516m(new C9183a.C9187d(jSONObject, this.f58598d));
        } else {
            this.f58601g.m51852K(jSONObject);
        }
    }

    public MixpanelAPI(Context context, Future future, String str, MPConfig mPConfig, boolean z) {
        this.f58595a = context;
        this.f58598d = str;
        this.f58599e = new C9160f(this, null);
        this.f58597c = mPConfig;
        HashMap hashMap = new HashMap();
        hashMap.put("$android_lib_version", "5.4.1");
        hashMap.put("$android_os", "Android");
        String str2 = Build.VERSION.RELEASE;
        hashMap.put("$android_os_version", str2 == null ? "UNKNOWN" : str2);
        String str3 = Build.MANUFACTURER;
        hashMap.put("$android_manufacturer", str3 == null ? "UNKNOWN" : str3);
        String str4 = Build.BRAND;
        hashMap.put("$android_brand", str4 == null ? "UNKNOWN" : str4);
        String str5 = Build.MODEL;
        hashMap.put("$android_model", str5 != null ? str5 : "UNKNOWN");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            hashMap.put("$android_app_version", packageInfo.versionName);
            hashMap.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            MPLog.m33456e("MixpanelAPI.API", "Exception getting app version name", e);
        }
        this.f58606l = Collections.unmodifiableMap(hashMap);
        this.f58609o = new C20528jG1();
        UpdatesFromMixpanel m33581s = m33581s(context, str);
        this.f58600f = m33581s;
        this.f58603i = m33582r();
        C19228bk1 m33578v = m33578v(context, future, str);
        this.f58601g = m33578v;
        this.f58607m = m33578v.m51826r();
        C9183a m33579u = m33579u();
        this.f58596b = m33579u;
        if (z) {
            optOutTracking();
        }
        InterfaceC9165h m33580t = m33580t();
        this.f58602h = m33580t;
        DecideMessages m33583q = m33583q(str, m33580t, m33581s);
        this.f58605k = m33583q;
        this.f58604j = new C9191b(this, this.f58595a);
        String m51831m = m33578v.m51831m();
        m33583q.m33649k(m51831m == null ? m33578v.m51833k() : m51831m);
        if (m33578v.m51824t(MPDbAdapter.m33610o(this.f58595a).m33611n().exists())) {
            track(AutomaticEvents.FIRST_OPEN, null, true);
            m33578v.m51858E();
        }
        if (!this.f58597c.getDisableDecideChecker()) {
            m33579u.m33520i(m33583q);
        }
        m33602B();
        if (m33600D()) {
            track("$app_open", null);
        }
        if (!m33578v.m51825s(this.f58598d)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mp_lib", "Android");
                jSONObject.put("lib", "Android");
                jSONObject.put("distinct_id", str);
                jSONObject.put("$lib_version", "5.4.1");
                m33579u.m33524e(new C9183a.C9184a("Integration", jSONObject, "85053bf24bba75239b16a601d9387e17"));
                m33579u.m33515n(new C9183a.C9185b("85053bf24bba75239b16a601d9387e17", false));
                m33578v.m51857F(this.f58598d);
            } catch (JSONException unused) {
            }
        }
        if (this.f58601g.m51823u((String) hashMap.get("$android_app_version_code"))) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(AutomaticEvents.VERSION_UPDATED, hashMap.get("$android_app_version"));
                track(AutomaticEvents.APP_UPDATED, jSONObject2, true);
            } catch (JSONException unused2) {
            }
        }
        this.f58600f.startUpdates();
        ExceptionHandler.init();
    }

    public static Tweak<Double> doubleTweak(String str, double d, double d2, double d3) {
        return f58593r.m33563e(str, d, d2, d3);
    }

    public static Tweak<Float> floatTweak(String str, float f, float f2, float f3) {
        return f58593r.m33561g(str, f, f2, f3);
    }

    public static MixpanelAPI getInstance(Context context, String str, boolean z) {
        MixpanelAPI mixpanelAPI;
        if (str == null || context == null) {
            return null;
        }
        Map map = f58591p;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (f58594s == null) {
                    f58594s = f58592q.m33478a(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
                }
                Map map2 = (Map) map.get(str);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(str, map2);
                }
                mixpanelAPI = (MixpanelAPI) map2.get(applicationContext);
                if (mixpanelAPI == null && AbstractC17161yw.m161a(applicationContext)) {
                    mixpanelAPI = new MixpanelAPI(applicationContext, f58594s, str, z);
                    m33603A(context, mixpanelAPI);
                    map2.put(applicationContext, mixpanelAPI);
                }
                m33584p(context);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mixpanelAPI;
    }

    public static Tweak<Integer> intTweak(String str, int i, int i2, int i3) {
        return f58593r.m33558j(str, i, i2, i3);
    }

    public static Tweak<Long> longTweak(String str, long j, long j2, long j3) {
        return f58593r.m33556l(str, j, j2, j3);
    }

    public void optInTracking(String str) {
        optInTracking(str, null);
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelAPI$g */
    /* loaded from: classes5.dex */
    public class RunnableC9164g implements InterfaceC9165h, Runnable {

        /* renamed from: a */
        public final Set f58623a;

        /* renamed from: b */
        public final Executor f58624b;

        public RunnableC9164g() {
            this.f58623a = Collections.newSetFromMap(new ConcurrentHashMap());
            this.f58624b = Executors.newSingleThreadExecutor();
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9165h
        public void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener) {
            this.f58623a.add(onMixpanelUpdatesReceivedListener);
            if (MixpanelAPI.this.f58605k.m33653g()) {
                onNewResults();
            }
        }

        @Override // com.mixpanel.android.mpmetrics.DecideMessages.OnNewResultsListener
        public void onNewConnectIntegrations() {
            MixpanelAPI.this.f58604j.m33487e(MixpanelAPI.this.f58605k.m33658b());
        }

        @Override // com.mixpanel.android.mpmetrics.DecideMessages.OnNewResultsListener
        public void onNewResults() {
            this.f58624b.execute(this);
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9165h
        public void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener) {
            this.f58623a.remove(onMixpanelUpdatesReceivedListener);
        }

        @Override // java.lang.Runnable
        public void run() {
            for (OnMixpanelUpdatesReceivedListener onMixpanelUpdatesReceivedListener : this.f58623a) {
                onMixpanelUpdatesReceivedListener.onMixpanelUpdatesReceived();
            }
        }

        public /* synthetic */ RunnableC9164g(MixpanelAPI mixpanelAPI, C9155a c9155a) {
            this();
        }
    }

    public void optInTracking(String str, JSONObject jSONObject) {
        this.f58601g.m51856G(false, this.f58598d);
        if (str != null) {
            identify(str);
        }
        track("$opt_in", jSONObject);
    }

    public void track(String str) {
        if (hasOptedOutTracking()) {
            return;
        }
        track(str, null);
    }

    public void track(String str, JSONObject jSONObject, boolean z) {
        Long l;
        if (hasOptedOutTracking()) {
            return;
        }
        if (!z || this.f58605k.m33648l()) {
            synchronized (this.f58607m) {
                l = (Long) this.f58607m.get(str);
                this.f58607m.remove(str);
                this.f58601g.m51861B(str);
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : this.f58601g.m51829o().entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                }
                this.f58601g.m51840d(jSONObject2);
                double currentTimeMillis = System.currentTimeMillis() / 1000.0d;
                jSONObject2.put("time", (long) currentTimeMillis);
                jSONObject2.put("distinct_id", getDistinctId());
                if (l != null) {
                    jSONObject2.put("$duration", currentTimeMillis - (l.longValue() / 1000.0d));
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!jSONObject.isNull(next)) {
                            jSONObject2.put(next, jSONObject.get(next));
                        }
                    }
                }
                this.f58596b.m33524e(new C9183a.C9184a(str, jSONObject2, this.f58598d, z, this.f58609o.m29227a()));
                TrackingDebug trackingDebug = this.f58603i;
                if (trackingDebug != null) {
                    trackingDebug.reportTrack(str);
                }
            } catch (JSONException e) {
                MPLog.m33456e("MixpanelAPI.API", "Exception tracking event " + str, e);
            }
        }
    }
}
