package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SettingsController implements SettingsProvider {

    /* renamed from: a */
    public final Context f55403a;

    /* renamed from: b */
    public final EH1 f55404b;

    /* renamed from: c */
    public final SettingsJsonParser f55405c;

    /* renamed from: d */
    public final CurrentTimeProvider f55406d;

    /* renamed from: e */
    public final CachedSettingsIo f55407e;

    /* renamed from: f */
    public final FH1 f55408f;

    /* renamed from: g */
    public final DataCollectionArbiter f55409g;

    /* renamed from: h */
    public final AtomicReference f55410h;

    /* renamed from: i */
    public final AtomicReference f55411i;

    /* renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$a */
    /* loaded from: classes4.dex */
    public class C8478a implements SuccessContinuation {

        /* renamed from: a */
        public final /* synthetic */ CrashlyticsWorkers f55412a;

        public C8478a(CrashlyticsWorkers crashlyticsWorkers) {
            SettingsController.this = r1;
            this.f55412a = crashlyticsWorkers;
        }

        /* renamed from: a */
        public static /* synthetic */ JSONObject m38768a(C8478a c8478a) {
            return c8478a.m38767b();
        }

        /* renamed from: b */
        public final /* synthetic */ JSONObject m38767b() {
            return SettingsController.this.f55408f.mo66809a(SettingsController.this.f55404b, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: c */
        public Task then(Void r5) {
            JSONObject jSONObject = (JSONObject) this.f55412a.network.getExecutor().submit(new Callable() { // from class: CH1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SettingsController.C8478a.m38768a(SettingsController.C8478a.this);
                }
            }).get();
            if (jSONObject != null) {
                Settings parseSettingsJson = SettingsController.this.f55405c.parseSettingsJson(jSONObject);
                SettingsController.this.f55407e.writeCachedSettings(parseSettingsJson.expiresAtMillis, jSONObject);
                SettingsController.this.m38770l(jSONObject, "Loaded settings: ");
                SettingsController settingsController = SettingsController.this;
                settingsController.m38769m(settingsController.f55404b.f1316f);
                SettingsController.this.f55410h.set(parseSettingsJson);
                ((TaskCompletionSource) SettingsController.this.f55411i.get()).trySetResult(parseSettingsJson);
            }
            return Tasks.forResult(null);
        }
    }

    public SettingsController(Context context, EH1 eh1, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, FH1 fh1, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference atomicReference = new AtomicReference();
        this.f55410h = atomicReference;
        this.f55411i = new AtomicReference(new TaskCompletionSource());
        this.f55403a = context;
        this.f55404b = eh1;
        this.f55406d = currentTimeProvider;
        this.f55405c = settingsJsonParser;
        this.f55407e = cachedSettingsIo;
        this.f55408f = fh1;
        this.f55409g = dataCollectionArbiter;
        atomicReference.set(C8479a.m38764b(currentTimeProvider));
    }

    public static SettingsController create(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String installerPackageName = idManager.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        return new SettingsController(context, new EH1(str, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager, CommonUtils.createInstanceIdFrom(CommonUtils.getMappingFileId(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(installerPackageName).getId()), systemCurrentTimeProvider, new SettingsJsonParser(systemCurrentTimeProvider), new CachedSettingsIo(fileStore), new C1145QE(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), httpRequestFactory), dataCollectionArbiter);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task<Settings> getSettingsAsync() {
        return ((TaskCompletionSource) this.f55411i.get()).getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Settings getSettingsSync() {
        return (Settings) this.f55410h.get();
    }

    /* renamed from: i */
    public boolean m38773i() {
        return !m38771k().equals(this.f55404b.f1316f);
    }

    /* renamed from: j */
    public final Settings m38772j(SettingsCacheBehavior settingsCacheBehavior) {
        Settings settings = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject readCachedSettings = this.f55407e.readCachedSettings();
                if (readCachedSettings != null) {
                    Settings parseSettingsJson = this.f55405c.parseSettingsJson(readCachedSettings);
                    if (parseSettingsJson != null) {
                        m38770l(readCachedSettings, "Loaded cached settings: ");
                        long currentTimeMillis = this.f55406d.getCurrentTimeMillis();
                        if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && parseSettingsJson.isExpired(currentTimeMillis)) {
                            Logger.getLogger().m39126v("Cached settings have expired.");
                        }
                        try {
                            Logger.getLogger().m39126v("Returning cached settings.");
                            settings = parseSettingsJson;
                        } catch (Exception e) {
                            e = e;
                            settings = parseSettingsJson;
                            Logger.getLogger().m39129e("Failed to get cached settings", e);
                            return settings;
                        }
                    } else {
                        Logger.getLogger().m39129e("Failed to parse cached settings data.", null);
                    }
                } else {
                    Logger.getLogger().m39132d("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return settings;
    }

    /* renamed from: k */
    public final String m38771k() {
        return CommonUtils.getSharedPrefs(this.f55403a).getString("existing_instance_identifier", "");
    }

    /* renamed from: l */
    public final void m38770l(JSONObject jSONObject, String str) {
        Logger logger = Logger.getLogger();
        logger.m39132d(str + jSONObject.toString());
    }

    public Task<Void> loadSettingsData(CrashlyticsWorkers crashlyticsWorkers) {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE, crashlyticsWorkers);
    }

    /* renamed from: m */
    public final boolean m38769m(String str) {
        SharedPreferences.Editor edit = CommonUtils.getSharedPrefs(this.f55403a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    public Task<Void> loadSettingsData(SettingsCacheBehavior settingsCacheBehavior, CrashlyticsWorkers crashlyticsWorkers) {
        Settings m38772j;
        if (!m38773i() && (m38772j = m38772j(settingsCacheBehavior)) != null) {
            this.f55410h.set(m38772j);
            ((TaskCompletionSource) this.f55411i.get()).trySetResult(m38772j);
            return Tasks.forResult(null);
        }
        Settings m38772j2 = m38772j(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (m38772j2 != null) {
            this.f55410h.set(m38772j2);
            ((TaskCompletionSource) this.f55411i.get()).trySetResult(m38772j2);
        }
        return this.f55409g.waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers.common, new C8478a(crashlyticsWorkers));
    }
}