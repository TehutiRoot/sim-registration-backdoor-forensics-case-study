package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.p005os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class FirebaseApp {
    @NonNull
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";

    /* renamed from: k */
    public static final Object f54496k = new Object();

    /* renamed from: l */
    public static final Map f54497l = new ArrayMap();

    /* renamed from: a */
    public final Context f54498a;

    /* renamed from: b */
    public final String f54499b;

    /* renamed from: c */
    public final FirebaseOptions f54500c;

    /* renamed from: d */
    public final ComponentRuntime f54501d;

    /* renamed from: g */
    public final Lazy f54504g;

    /* renamed from: h */
    public final Provider f54505h;

    /* renamed from: e */
    public final AtomicBoolean f54502e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f54503f = new AtomicBoolean();

    /* renamed from: i */
    public final List f54506i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List f54507j = new CopyOnWriteArrayList();

    @KeepForSdk
    /* loaded from: classes4.dex */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    /* renamed from: com.google.firebase.FirebaseApp$a */
    /* loaded from: classes4.dex */
    public static class C8320a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static AtomicReference f54508a = new AtomicReference();

        /* renamed from: b */
        public static void m39327b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f54508a.get() == null) {
                    C8320a c8320a = new C8320a();
                    if (AbstractC17300An1.m69050a(f54508a, null, c8320a)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(c8320a);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.f54496k) {
                try {
                    Iterator it = new ArrayList(FirebaseApp.f54497l.values()).iterator();
                    while (it.hasNext()) {
                        FirebaseApp firebaseApp = (FirebaseApp) it.next();
                        if (firebaseApp.f54502e.get()) {
                            firebaseApp.m39330m(z);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$b */
    /* loaded from: classes4.dex */
    public static class C8321b extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference f54509b = new AtomicReference();

        /* renamed from: a */
        public final Context f54510a;

        public C8321b(Context context) {
            this.f54510a = context;
        }

        /* renamed from: b */
        public static void m39325b(Context context) {
            if (f54509b.get() == null) {
                C8321b c8321b = new C8321b(context);
                if (AbstractC17300An1.m69050a(f54509b, null, c8321b)) {
                    context.registerReceiver(c8321b, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m39324c() {
            this.f54510a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f54496k) {
                try {
                    for (FirebaseApp firebaseApp : FirebaseApp.f54497l.values()) {
                        firebaseApp.m39334i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m39324c();
        }
    }

    public FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.f54498a = (Context) Preconditions.checkNotNull(context);
        this.f54499b = Preconditions.checkNotEmpty(str);
        this.f54500c = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> discoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(discoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.m39222of(context, Context.class, new Class[0])).addComponent(Component.m39222of(this, FirebaseApp.class, new Class[0])).addComponent(Component.m39222of(firebaseOptions, FirebaseOptions.class, new Class[0])).setProcessor(new ComponentMonitor());
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.m39222of(startupTime, StartupTime.class, new Class[0]));
        }
        ComponentRuntime build = processor.build();
        this.f54501d = build;
        FirebaseTrace.popTrace();
        this.f54504g = new Lazy(new Provider() { // from class: f10
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                DataCollectionConfigStorage m39333j;
                m39333j = FirebaseApp.this.m39333j(context);
                return m39333j;
            }
        });
        this.f54505h = build.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new BackgroundStateChangeListener() { // from class: g10
            {
                FirebaseApp.this = this;
            }

            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                FirebaseApp.this.m39332k(z);
            }
        });
        FirebaseTrace.popTrace();
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        synchronized (f54496k) {
            f54497l.clear();
        }
    }

    @NonNull
    public static List<FirebaseApp> getApps(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f54496k) {
            arrayList = new ArrayList(f54497l.values());
        }
        return arrayList;
    }

    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f54496k) {
            try {
                firebaseApp = (FirebaseApp) f54497l.get(DEFAULT_APP_NAME);
                if (firebaseApp != null) {
                    ((DefaultHeartBeatController) firebaseApp.f54505h.get()).registerHeartBeat();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseApp;
    }

    /* renamed from: h */
    public static List m39335h() {
        ArrayList arrayList = new ArrayList();
        synchronized (f54496k) {
            try {
                for (FirebaseApp firebaseApp : f54497l.values()) {
                    arrayList.add(firebaseApp.getName());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context) {
        synchronized (f54496k) {
            try {
                if (f54497l.containsKey(DEFAULT_APP_NAME)) {
                    return getInstance();
                }
                FirebaseOptions fromResource = FirebaseOptions.fromResource(context);
                if (fromResource == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, fromResource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public static String m39331l(String str) {
        return str.trim();
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        m39336g();
        if (this.f54502e.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.f54506i.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        m39336g();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.f54507j.add(firebaseAppLifecycleListener);
    }

    public void delete() {
        if (!this.f54503f.compareAndSet(false, true)) {
            return;
        }
        synchronized (f54496k) {
            f54497l.remove(this.f54499b);
        }
        m39329n();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f54499b.equals(((FirebaseApp) obj).getName());
    }

    /* renamed from: g */
    public final void m39336g() {
        Preconditions.checkState(!this.f54503f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        m39336g();
        return (T) this.f54501d.get(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        m39336g();
        return this.f54498a;
    }

    @NonNull
    public String getName() {
        m39336g();
        return this.f54499b;
    }

    @NonNull
    public FirebaseOptions getOptions() {
        m39336g();
        return this.f54500c;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.f54499b.hashCode();
    }

    /* renamed from: i */
    public final void m39334i() {
        if (!UserManagerCompat.isUserUnlocked(this.f54498a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(getName());
            C8321b.m39325b(this.f54498a);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(getName());
        this.f54501d.initializeEagerComponents(isDefaultApp());
        ((DefaultHeartBeatController) this.f54505h.get()).registerHeartBeat();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        m39336g();
        return ((DataCollectionConfigStorage) this.f54504g.get()).isEnabled();
    }

    @KeepForSdk
    @VisibleForTesting
    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    /* renamed from: j */
    public final /* synthetic */ DataCollectionConfigStorage m39333j(Context context) {
        return new DataCollectionConfigStorage(context, getPersistenceKey(), (Publisher) this.f54501d.get(Publisher.class));
    }

    /* renamed from: k */
    public final /* synthetic */ void m39332k(boolean z) {
        if (!z) {
            ((DefaultHeartBeatController) this.f54505h.get()).registerHeartBeat();
        }
    }

    /* renamed from: m */
    public final void m39330m(boolean z) {
        for (BackgroundStateChangeListener backgroundStateChangeListener : this.f54506i) {
            backgroundStateChangeListener.onBackgroundStateChanged(z);
        }
    }

    /* renamed from: n */
    public final void m39329n() {
        for (FirebaseAppLifecycleListener firebaseAppLifecycleListener : this.f54507j) {
            firebaseAppLifecycleListener.onDeleted(this.f54499b, this.f54500c);
        }
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        m39336g();
        this.f54506i.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        m39336g();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.f54507j.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        m39336g();
        if (this.f54502e.compareAndSet(!z, z)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && isInBackground) {
                m39330m(true);
            } else if (!z && isInBackground) {
                m39330m(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
        m39336g();
        ((DataCollectionConfigStorage) this.f54504g.get()).setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f54499b).add("options", this.f54500c).toString();
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z));
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @NonNull
    public static FirebaseApp getInstance(@NonNull String str) {
        FirebaseApp firebaseApp;
        List m39335h;
        String str2;
        synchronized (f54496k) {
            try {
                firebaseApp = (FirebaseApp) f54497l.get(m39331l(str));
                if (firebaseApp != null) {
                    ((DefaultHeartBeatController) firebaseApp.f54505h.get()).registerHeartBeat();
                } else {
                    if (m39335h().isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", m39335h);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } finally {
            }
        }
        return firebaseApp;
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        C8320a.m39327b(context);
        String m39331l = m39331l(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f54496k) {
            Map map = f54497l;
            Preconditions.checkState(!map.containsKey(m39331l), "FirebaseApp name " + m39331l + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, m39331l, firebaseOptions);
            map.put(m39331l, firebaseApp);
        }
        firebaseApp.m39334i();
        return firebaseApp;
    }
}
