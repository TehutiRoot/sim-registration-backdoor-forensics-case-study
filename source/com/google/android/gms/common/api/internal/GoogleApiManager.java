package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GoogleApiManager implements Handler.Callback {

    /* renamed from: r */
    public static GoogleApiManager f44752r;

    /* renamed from: c */
    public TelemetryData f44755c;

    /* renamed from: d */
    public TelemetryLoggingClient f44756d;

    /* renamed from: e */
    public final Context f44757e;

    /* renamed from: f */
    public final GoogleApiAvailability f44758f;

    /* renamed from: g */
    public final com.google.android.gms.common.internal.zal f44759g;

    /* renamed from: n */
    public final Handler f44766n;

    /* renamed from: o */
    public volatile boolean f44767o;
    @NonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: p */
    public static final Status f44750p = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: q */
    public static final Object f44751q = new Object();

    /* renamed from: a */
    public long f44753a = 10000;

    /* renamed from: b */
    public boolean f44754b = false;

    /* renamed from: h */
    public final AtomicInteger f44760h = new AtomicInteger(1);

    /* renamed from: i */
    public final AtomicInteger f44761i = new AtomicInteger(0);

    /* renamed from: j */
    public final Map f44762j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k */
    public zaae f44763k = null;

    /* renamed from: l */
    public final Set f44764l = new ArraySet();

    /* renamed from: m */
    public final Set f44765m = new ArraySet();

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f44767o = true;
        this.f44757e = context;
        com.google.android.gms.internal.base.zau zauVar = new com.google.android.gms.internal.base.zau(looper, this);
        this.f44766n = zauVar;
        this.f44758f = googleApiAvailability;
        this.f44759g = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.f44767o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    /* renamed from: e */
    public static Status m48603e(ApiKey apiKey, ConnectionResult connectionResult) {
        String zaa2 = apiKey.zaa();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + zaa2 + " is not available on this device. Connection failed with: " + valueOf);
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (f44751q) {
            try {
                GoogleApiManager googleApiManager = f44752r;
                if (googleApiManager != null) {
                    googleApiManager.f44761i.incrementAndGet();
                    Handler handler = googleApiManager.f44766n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static GoogleApiManager zaj() {
        GoogleApiManager googleApiManager;
        synchronized (f44751q) {
            Preconditions.checkNotNull(f44752r, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = f44752r;
        }
        return googleApiManager;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static GoogleApiManager zak(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f44751q) {
            try {
                if (f44752r == null) {
                    f44752r = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
                }
                googleApiManager = f44752r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return googleApiManager;
    }

    /* renamed from: a */
    public final void m48607a(zaae zaaeVar) {
        synchronized (f44751q) {
            try {
                if (this.f44763k == zaaeVar) {
                    this.f44763k = null;
                    this.f44764l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m48605c() {
        if (this.f44754b) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.f44759g.zaa(this.f44757e, 203400000);
        if (zaa2 != -1 && zaa2 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m48604d(ConnectionResult connectionResult, int i) {
        return this.f44758f.zah(this.f44757e, connectionResult, i);
    }

    /* renamed from: f */
    public final zabq m48602f(GoogleApi googleApi) {
        Map map = this.f44762j;
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            this.f44762j.put(apiKey, zabqVar);
        }
        if (zabqVar.zaA()) {
            this.f44765m.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    /* renamed from: g */
    public final TelemetryLoggingClient m48601g() {
        if (this.f44756d == null) {
            this.f44756d = TelemetryLogging.getClient(this.f44757e);
        }
        return this.f44756d;
    }

    /* renamed from: h */
    public final void m48600h() {
        TelemetryData telemetryData = this.f44755c;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || m48605c()) {
                m48601g().log(telemetryData);
            }
            this.f44755c = null;
        }
    }

    @Override // android.os.Handler.Callback
    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        ApiKey apiKey;
        ApiKey apiKey2;
        ApiKey apiKey3;
        ApiKey apiKey4;
        int i = message.what;
        long j = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        zabq zabqVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f44753a = j;
                this.f44766n.removeMessages(12);
                for (ApiKey apiKey5 : this.f44762j.keySet()) {
                    Handler handler = this.f44766n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey5), this.f44753a);
                }
                break;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator it = zalVar.zab().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey apiKey6 = (ApiKey) it.next();
                        zabq zabqVar2 = (zabq) this.f44762j.get(apiKey6);
                        if (zabqVar2 == null) {
                            zalVar.zac(apiKey6, new ConnectionResult(13), null);
                            break;
                        } else if (zabqVar2.m48478y()) {
                            zalVar.zac(apiKey6, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult zad = zabqVar2.zad();
                            if (zad != null) {
                                zalVar.zac(apiKey6, zad, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
            case 3:
                for (zabq zabqVar3 : this.f44762j.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                break;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq zabqVar4 = (zabq) this.f44762j.get(zachVar.zac.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = m48602f(zachVar.zac);
                }
                if (zabqVar4.zaA() && this.f44761i.get() != zachVar.zab) {
                    zachVar.zaa.zad(zaa);
                    zabqVar4.zav();
                    break;
                } else {
                    zabqVar4.zap(zachVar.zaa);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f44762j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq zabqVar5 = (zabq) it2.next();
                        if (zabqVar5.zab() == i2) {
                            zabqVar = zabqVar5;
                        }
                    }
                }
                if (zabqVar != null) {
                    if (connectionResult.getErrorCode() == 13) {
                        String errorString = this.f44758f.getErrorString(connectionResult.getErrorCode());
                        String errorMessage = connectionResult.getErrorMessage();
                        zabq.m48486q(zabqVar, new Status(17, "Error resolution was canceled by the user, original error message: " + errorString + ": " + errorMessage));
                        break;
                    } else {
                        zabq.m48486q(zabqVar, m48603e(zabq.m48487p(zabqVar), connectionResult));
                        break;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    new Exception();
                    break;
                }
            case 6:
                if (this.f44757e.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.f44757e.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new C6344c(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.f44753a = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                        break;
                    }
                }
                break;
            case 7:
                m48602f((GoogleApi) message.obj);
                break;
            case 9:
                if (this.f44762j.containsKey(message.obj)) {
                    ((zabq) this.f44762j.get(message.obj)).zau();
                    break;
                }
                break;
            case 10:
                for (ApiKey apiKey7 : this.f44765m) {
                    zabq zabqVar6 = (zabq) this.f44762j.remove(apiKey7);
                    if (zabqVar6 != null) {
                        zabqVar6.zav();
                    }
                }
                this.f44765m.clear();
                break;
            case 11:
                if (this.f44762j.containsKey(message.obj)) {
                    ((zabq) this.f44762j.get(message.obj)).zaw();
                    break;
                }
                break;
            case 12:
                if (this.f44762j.containsKey(message.obj)) {
                    ((zabq) this.f44762j.get(message.obj)).zaB();
                    break;
                }
                break;
            case 14:
                C18951a82 c18951a82 = (C18951a82) message.obj;
                ApiKey m65121a = c18951a82.m65121a();
                if (!this.f44762j.containsKey(m65121a)) {
                    c18951a82.m65120b().setResult(Boolean.FALSE);
                    break;
                } else {
                    c18951a82.m65120b().setResult(Boolean.valueOf(zabq.m48479x((zabq) this.f44762j.get(m65121a), false)));
                    break;
                }
            case 15:
                B82 b82 = (B82) message.obj;
                Map map = this.f44762j;
                apiKey = b82.f309a;
                if (map.containsKey(apiKey)) {
                    Map map2 = this.f44762j;
                    apiKey2 = b82.f309a;
                    zabq.m48483t((zabq) map2.get(apiKey2), b82);
                    break;
                }
                break;
            case 16:
                B82 b822 = (B82) message.obj;
                Map map3 = this.f44762j;
                apiKey3 = b822.f309a;
                if (map3.containsKey(apiKey3)) {
                    Map map4 = this.f44762j;
                    apiKey4 = b822.f309a;
                    zabq.m48482u((zabq) map4.get(apiKey4), b822);
                    break;
                }
                break;
            case 17:
                m48600h();
                break;
            case 18:
                J82 j82 = (J82) message.obj;
                if (j82.f2717c == 0) {
                    m48601g().log(new TelemetryData(j82.f2716b, Arrays.asList(j82.f2715a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.f44755c;
                    if (telemetryData != null) {
                        List zab = telemetryData.zab();
                        if (telemetryData.zaa() == j82.f2716b && (zab == null || zab.size() < j82.f2718d)) {
                            this.f44755c.zac(j82.f2715a);
                        } else {
                            this.f44766n.removeMessages(17);
                            m48600h();
                        }
                    }
                    if (this.f44755c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(j82.f2715a);
                        this.f44755c = new TelemetryData(j82.f2716b, arrayList);
                        Handler handler2 = this.f44766n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j82.f2717c);
                        break;
                    }
                }
                break;
            case 19:
                this.f44754b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void m48599i(TaskCompletionSource taskCompletionSource, int i, GoogleApi googleApi) {
        I82 m67993a;
        if (i != 0 && (m67993a = I82.m67993a(this, i, googleApi.getApiKey())) != null) {
            Task task = taskCompletionSource.getTask();
            final Handler handler = this.f44766n;
            handler.getClass();
            task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, m67993a);
        }
    }

    /* renamed from: q */
    public final zabq m48591q(ApiKey apiKey) {
        return (zabq) this.f44762j.get(apiKey);
    }

    /* renamed from: w */
    public final void m48585w(MethodInvocation methodInvocation, int i, long j, int i2) {
        this.f44766n.sendMessage(this.f44766n.obtainMessage(18, new J82(methodInvocation, i, j, i2)));
    }

    public final void zaA(@NonNull zaae zaaeVar) {
        synchronized (f44751q) {
            try {
                if (this.f44763k != zaaeVar) {
                    this.f44763k = zaaeVar;
                    this.f44764l.clear();
                }
                this.f44764l.addAll(zaaeVar.m48551f());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zaa() {
        return this.f44760h.getAndIncrement();
    }

    @NonNull
    public final Task zam(@NonNull Iterable iterable) {
        zal zalVar = new zal(iterable);
        this.f44766n.sendMessage(this.f44766n.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public final Task zan(@NonNull GoogleApi googleApi) {
        C18951a82 c18951a82 = new C18951a82(googleApi.getApiKey());
        this.f44766n.sendMessage(this.f44766n.obtainMessage(14, c18951a82));
        return c18951a82.m65120b().getTask();
    }

    @NonNull
    public final Task zao(@NonNull GoogleApi googleApi, @NonNull RegisterListenerMethod registerListenerMethod, @NonNull UnregisterListenerMethod unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m48599i(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        this.f44766n.sendMessage(this.f44766n.obtainMessage(8, new zach(new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), this.f44761i.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public final Task zap(@NonNull GoogleApi googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m48599i(taskCompletionSource, i, googleApi);
        this.f44766n.sendMessage(this.f44766n.obtainMessage(13, new zach(new zah(listenerKey, taskCompletionSource), this.f44761i.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final void zau(@NonNull GoogleApi googleApi, int i, @NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f44766n.sendMessage(this.f44766n.obtainMessage(4, new zach(new zae(i, apiMethodImpl), this.f44761i.get(), googleApi)));
    }

    public final void zav(@NonNull GoogleApi googleApi, int i, @NonNull TaskApiCall taskApiCall, @NonNull TaskCompletionSource taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        m48599i(taskCompletionSource, taskApiCall.zaa(), googleApi);
        this.f44766n.sendMessage(this.f44766n.obtainMessage(4, new zach(new zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper), this.f44761i.get(), googleApi)));
    }

    public final void zax(@NonNull ConnectionResult connectionResult, int i) {
        if (!m48604d(connectionResult, i)) {
            Handler handler = this.f44766n;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void zay() {
        Handler handler = this.f44766n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(@NonNull GoogleApi googleApi) {
        Handler handler = this.f44766n;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}
