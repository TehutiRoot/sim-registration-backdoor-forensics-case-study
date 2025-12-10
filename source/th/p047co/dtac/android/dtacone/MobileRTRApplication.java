package th.p047co.dtac.android.dtacone;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;
import com.facebook.stetho.Stetho;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.FirebasePerformance;
import dagger.Component;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import javax.inject.Singleton;
import okhttp3.logging.HttpLoggingInterceptor;
import th.p047co.dtac.android.dtacone.MobileRTRApplication;
import th.p047co.dtac.android.dtacone.configuration.AndroidModule;
import th.p047co.dtac.android.dtacone.configuration.ApplicationModule;
import th.p047co.dtac.android.dtacone.configuration.CameraModule;
import th.p047co.dtac.android.dtacone.configuration.CardReaderModule;
import th.p047co.dtac.android.dtacone.configuration.FaceDetectorModule;
import th.p047co.dtac.android.dtacone.configuration.HasApplicationComponent;
import th.p047co.dtac.android.dtacone.configuration.HttpModule;
import th.p047co.dtac.android.dtacone.configuration.MobileRTRComponent;
import th.p047co.dtac.android.dtacone.configuration.RoomModule;
import th.p047co.dtac.android.dtacone.configuration.Rx2ThreadingModule;
import th.p047co.dtac.android.dtacone.configuration.SingletonRepositoryModule;
import th.p047co.dtac.android.dtacone.configuration.ThreadingModule;
import th.p047co.dtac.android.dtacone.life_cycle.ApplicationLifecycle;
import th.p047co.dtac.android.dtacone.life_cycle.ApplicationLifecycleObserver;
import th.p047co.dtac.android.dtacone.manager.Contextor;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothReceiver;
import th.p047co.dtac.android.dtacone.manager.cardreader.usb.UsbBroadcastReceiver;
import th.p047co.dtac.android.dtacone.manager.config.MobileConfigService;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.messaging.module.FirebaseModule;
import th.p047co.dtac.android.dtacone.manager.messaging.module.NotificationModule;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.widget.DtacResources;

/* renamed from: th.co.dtac.android.dtacone.MobileRTRApplication */
/* loaded from: classes7.dex */
public class MobileRTRApplication extends MultiDexApplication implements HasApplicationComponent, ApplicationLifecycle {

    /* renamed from: a */
    public RealmConfiguration f80917a;

    /* renamed from: b */
    public LanguageService f80918b;

    /* renamed from: c */
    public MobileConfigService f80919c;

    /* renamed from: d */
    public DtacResources f80920d;

    /* renamed from: e */
    public ComponentName f80921e;

    /* renamed from: f */
    public ComponentName f80922f;
    public MobileRTRComponent rtrComponent;

    @Component(modules = {ApplicationModule.class, AndroidModule.class, HttpModule.class, ThreadingModule.class, CardReaderModule.class, Rx2ThreadingModule.class, FirebaseModule.class, NotificationModule.class, SingletonRepositoryModule.class, CameraModule.class, FaceDetectorModule.class, RoomModule.class})
    @Singleton
    /* renamed from: th.co.dtac.android.dtacone.MobileRTRApplication$ApplicationComponent */
    /* loaded from: classes7.dex */
    public interface ApplicationComponent extends MobileRTRComponent {
    }

    /* renamed from: a */
    public static /* synthetic */ void m20504a(MobileRTRApplication mobileRTRApplication) {
        mobileRTRApplication.m20499f();
    }

    /* renamed from: b */
    public final void m20503b() {
        FirebasePerformance.getInstance().setPerformanceCollectionEnabled(true);
    }

    /* renamed from: c */
    public final void m20502c() {
        this.f80918b.createDefaultLanguage(LanguageSupport.LANG_TH);
        this.f80919c.loadConfig();
    }

    @Override // th.p047co.dtac.android.dtacone.configuration.HasApplicationComponent
    public MobileRTRComponent component() {
        return this.rtrComponent;
    }

    public MobileRTRComponent createComponent() {
        return DaggerMobileRTRApplication_ApplicationComponent.builder().androidModule(new AndroidModule(this)).applicationModule(new ApplicationModule(this, Constant.getMixpanelToken())).httpModule(new HttpModule(Constant.getBaseURL(), HttpLoggingInterceptor.Level.NONE)).firebaseModule(new FirebaseModule(FirebaseMessaging.getInstance())).roomModule(new RoomModule(this)).build();
    }

    /* renamed from: d */
    public final void m20501d(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannelGroup m31959a = AbstractC19426ct0.m31959a("news_group", "NewsGroup");
            NotificationChannel m66215a = TI0.m66215a("news_channel", "News", 4);
            m66215a.setGroup("news_group");
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannelGroup(m31959a);
                notificationManager.createNotificationChannel(m66215a);
            }
        }
    }

    /* renamed from: e */
    public final void m20500e() {
        FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution();
        Contextor.getInstance().init(getApplicationContext());
        Realm.setDefaultConfiguration(this.f80917a);
    }

    /* renamed from: f */
    public final /* synthetic */ void m20499f() {
        try {
            final WebView webView = new WebView(this);
            webView.getSettings().setJavaScriptEnabled(false);
            webView.loadData("<html></html>", "text/html", "UTF-8");
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: et0
                @Override // java.lang.Runnable
                public final void run() {
                    webView.destroy();
                }
            }, 500L);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public final void m20498g() {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dt0
                {
                    MobileRTRApplication.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MobileRTRApplication.m20504a(MobileRTRApplication.this);
                }
            }, 100L);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f80918b == null) {
            return super.getResources();
        }
        if (this.f80920d == null) {
            this.f80920d = new DtacResources(super.getResources(), this.f80918b);
        }
        return this.f80920d;
    }

    /* renamed from: h */
    public final void m20497h(int i) {
        getPackageManager().setComponentEnabledSetting(this.f80921e, i, 1);
        getPackageManager().setComponentEnabledSetting(this.f80922f, i, 1);
    }

    @Override // th.p047co.dtac.android.dtacone.life_cycle.ApplicationLifecycle
    public void onApplicationDestroyed() {
        this.f80919c.cleanConfigResource();
        this.f80918b.cleanResource();
    }

    @Override // th.p047co.dtac.android.dtacone.life_cycle.ApplicationLifecycle
    public void onApplicationResumed() {
        m20497h(1);
    }

    @Override // th.p047co.dtac.android.dtacone.life_cycle.ApplicationLifecycle
    public void onApplicationStopped() {
        m20497h(2);
    }

    @Override // android.app.Application
    public void onCreate() {
        MultiDex.install(this);
        super.onCreate();
        m20498g();
        Realm.init(this);
        this.rtrComponent = createComponent();
        component().inject(this);
        this.f80921e = new ComponentName(getApplicationContext(), BluetoothReceiver.class);
        this.f80922f = new ComponentName(getApplicationContext(), UsbBroadcastReceiver.class);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationLifecycleObserver(this));
        m20500e();
        m20502c();
        m20503b();
        m20501d(getApplicationContext());
        Stetho.initializeWithDefaults(this);
    }
}
