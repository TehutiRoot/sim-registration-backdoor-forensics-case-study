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
    public final Context f55391a;

    /* renamed from: b */
    public final HG1 f55392b;

    /* renamed from: c */
    public final SettingsJsonParser f55393c;

    /* renamed from: d */
    public final CurrentTimeProvider f55394d;

    /* renamed from: e */
    public final CachedSettingsIo f55395e;

    /* renamed from: f */
    public final IG1 f55396f;

    /* renamed from: g */
    public final DataCollectionArbiter f55397g;

    /* renamed from: h */
    public final AtomicReference f55398h;

    /* renamed from: i */
    public final AtomicReference f55399i;

    /* renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$a */
    /* loaded from: classes4.dex */
    public class C8489a implements SuccessContinuation {

        /* renamed from: a */
        public final /* synthetic */ CrashlyticsWorkers f55400a;

        public C8489a(CrashlyticsWorkers crashlyticsWorkers) {
            SettingsController.this = r1;
            this.f55400a = crashlyticsWorkers;
        }

        /* renamed from: a */
        public static /* synthetic */ JSONObject m38776a(C8489a c8489a) {
            return c8489a.m38775b();
        }

        /* renamed from: b */
        public final /* synthetic */ JSONObject m38775b() {
            return SettingsController.this.f55396f.mo66899a(SettingsController.this.f55392b, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: c */
        public Task then(Void r5) {
            JSONObject jSONObject = (JSONObject) this.f55400a.network.getExecutor().submit(new Callable() { // from class: FG1
                {
                    SettingsController.C8489a.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SettingsController.C8489a.m38776a(SettingsController.C8489a.this);
                }
            }).get();
            if (jSONObject != null) {
                Settings parseSettingsJson = SettingsController.this.f55393c.parseSettingsJson(jSONObject);
                SettingsController.this.f55395e.writeCachedSettings(parseSettingsJson.expiresAtMillis, jSONObject);
                SettingsController.this.m38778l(jSONObject, "Loaded settings: ");
                SettingsController settingsController = SettingsController.this;
                settingsController.m38777m(settingsController.f55392b.f2172f);
                SettingsController.this.f55398h.set(parseSettingsJson);
                ((TaskCompletionSource) SettingsController.this.f55399i.get()).trySetResult(parseSettingsJson);
            }
            return Tasks.forResult(null);
        }
    }

    public SettingsController(Context context, HG1 hg1, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, IG1 ig1, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference atomicReference = new AtomicReference();
        this.f55398h = atomicReference;
        this.f55399i = new AtomicReference(new TaskCompletionSource());
        this.f55391a = context;
        this.f55392b = hg1;
        this.f55394d = currentTimeProvider;
        this.f55393c = settingsJsonParser;
        this.f55395e = cachedSettingsIo;
        this.f55396f = ig1;
        this.f55397g = dataCollectionArbiter;
        atomicReference.set(C8490a.m38772b(currentTimeProvider));
    }

    public static SettingsController create(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String installerPackageName = idManager.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        return new SettingsController(context, new HG1(str, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager, CommonUtils.createInstanceIdFrom(CommonUtils.getMappingFileId(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(installerPackageName).getId()), systemCurrentTimeProvider, new SettingsJsonParser(systemCurrentTimeProvider), new CachedSettingsIo(fileStore), new C1085PE(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), httpRequestFactory), dataCollectionArbiter);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task<Settings> getSettingsAsync() {
        return ((TaskCompletionSource) this.f55399i.get()).getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Settings getSettingsSync() {
        return (Settings) this.f55398h.get();
    }

    /* renamed from: i */
    public boolean m38781i() {
        return !m38779k().equals(this.f55392b.f2172f);
    }

    /* renamed from: j */
    public final Settings m38780j(SettingsCacheBehavior settingsCacheBehavior) {
        Settings settings = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject readCachedSettings = this.f55395e.readCachedSettings();
                if (readCachedSettings != null) {
                    Settings parseSettingsJson = this.f55393c.parseSettingsJson(readCachedSettings);
                    if (parseSettingsJson != null) {
                        m38778l(readCachedSettings, "Loaded cached settings: ");
                        long currentTimeMillis = this.f55394d.getCurrentTimeMillis();
                        if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && parseSettingsJson.isExpired(currentTimeMillis)) {
                            Logger.getLogger().m39134v("Cached settings have expired.");
                        }
                        try {
                            Logger.getLogger().m39134v("Returning cached settings.");
                            settings = parseSettingsJson;
                        } catch (Exception e) {
                            e = e;
                            settings = parseSettingsJson;
                            Logger.getLogger().m39137e("Failed to get cached settings", e);
                            return settings;
                        }
                    } else {
                        Logger.getLogger().m39137e("Failed to parse cached settings data.", null);
                    }
                } else {
                    Logger.getLogger().m39140d("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return settings;
    }

    /* renamed from: k */
    public final String m38779k() {
        return CommonUtils.getSharedPrefs(this.f55391a).getString("existing_instance_identifier", "");
    }

    /* renamed from: l */
    public final void m38778l(JSONObject jSONObject, String str) {
        Logger logger = Logger.getLogger();
        logger.m39140d(str + jSONObject.toString());
    }

    public Task<Void> loadSettingsData(CrashlyticsWorkers crashlyticsWorkers) {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE, crashlyticsWorkers);
    }

    /* renamed from: m */
    public final boolean m38777m(String str) {
        SharedPreferences.Editor edit = CommonUtils.getSharedPrefs(this.f55391a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    public Task<Void> loadSettingsData(SettingsCacheBehavior settingsCacheBehavior, CrashlyticsWorkers crashlyticsWorkers) {
        Settings m38780j;
        if (!m38781i() && (m38780j = m38780j(settingsCacheBehavior)) != null) {
            this.f55398h.set(m38780j);
            ((TaskCompletionSource) this.f55399i.get()).trySetResult(m38780j);
            return Tasks.forResult(null);
        }
        Settings m38780j2 = m38780j(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (m38780j2 != null) {
            this.f55398h.set(m38780j2);
            ((TaskCompletionSource) this.f55399i.get()).trySetResult(m38780j2);
        }
        return this.f55397g.waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers.common, new C8489a(crashlyticsWorkers));
    }
}
