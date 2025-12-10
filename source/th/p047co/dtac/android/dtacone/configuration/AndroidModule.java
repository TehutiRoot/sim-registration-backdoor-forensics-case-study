package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import android.content.SharedPreferences;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import androidx.autofill.HintConstants;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;
import dagger.Module;
import io.realm.RealmConfiguration;
import p046rx.Scheduler;
import pl.charmas.android.reactivelocation.ReactiveLocationProvider;
import th.p047co.dtac.android.dtacone.configuration.AndroidModule;
import th.p047co.dtac.android.dtacone.data.cache.database.LanguageDbHelper;
import th.p047co.dtac.android.dtacone.data.cache.database.LocationDbHelper;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.util.CustomTabsUtil;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.network.NetworkUtil;

@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule */
/* loaded from: classes7.dex */
public class AndroidModule {

    /* renamed from: a */
    public final Application f83056a;

    public AndroidModule(Application application) {
        this.f83056a = application;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19644a(String str) {
        m19643b(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19643b(String str) {
    }

    /* renamed from: c */
    public Application m19642c() {
        return this.f83056a;
    }

    /* renamed from: d */
    public BluetoothService m19641d() {
        return new BluetoothService();
    }

    /* renamed from: e */
    public BriteDatabase m19640e(SqlBrite sqlBrite, LanguageDbHelper languageDbHelper, Scheduler scheduler) {
        BriteDatabase wrapDatabaseHelper = sqlBrite.wrapDatabaseHelper(languageDbHelper, scheduler);
        wrapDatabaseHelper.setLoggingEnabled(true);
        return wrapDatabaseHelper;
    }

    /* renamed from: f */
    public BriteDatabase m19639f(SqlBrite sqlBrite, LocationDbHelper locationDbHelper, Scheduler scheduler) {
        BriteDatabase wrapDatabaseHelper = sqlBrite.wrapDatabaseHelper(locationDbHelper, scheduler);
        wrapDatabaseHelper.setLoggingEnabled(true);
        return wrapDatabaseHelper;
    }

    /* renamed from: g */
    public ConnectivityManager m19638g() {
        return (ConnectivityManager) this.f83056a.getSystemService("connectivity");
    }

    /* renamed from: h */
    public CustomTabsUtil m19637h(CustomTabsIntent.Builder builder) {
        return new CustomTabsUtil(builder);
    }

    /* renamed from: i */
    public CustomTabsIntent.Builder m19636i() {
        return new CustomTabsIntent.Builder();
    }

    /* renamed from: j */
    public RealmConfiguration m19635j() {
        return new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
    }

    /* renamed from: k */
    public InputMethodManager m19634k() {
        return (InputMethodManager) this.f83056a.getSystemService("input_method");
    }

    /* renamed from: l */
    public LocationDbHelper m19633l() {
        LocationDbHelper locationDbHelper = new LocationDbHelper(this.f83056a);
        FileUtil.copyDatabaseFromAsset(this.f83056a, LocationDbHelper.DATABASE_LOCATION_NAME);
        return locationDbHelper;
    }

    /* renamed from: m */
    public LocationManager m19632m() {
        return (LocationManager) this.f83056a.getSystemService(FirebaseAnalytics.Param.LOCATION);
    }

    /* renamed from: n */
    public ReactiveLocationProvider m19631n() {
        return new ReactiveLocationProvider(this.f83056a);
    }

    /* renamed from: o */
    public LanguageDbHelper m19630o() {
        LanguageDbHelper languageDbHelper = new LanguageDbHelper(this.f83056a);
        FileUtil.copyDatabaseFromAsset(this.f83056a, LanguageDbHelper.DATABASE_LANGUAGE_NAME);
        return languageDbHelper;
    }

    /* renamed from: p */
    public NetworkUtil m19629p(TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
        return new NetworkUtil(telephonyManager, connectivityManager);
    }

    /* renamed from: q */
    public PreferencesRepository m19628q(SharedPreferences sharedPreferences) {
        return new PreferencesRepository(sharedPreferences);
    }

    /* renamed from: r */
    public SharedPreferences m19627r() {
        return PreferenceManager.getDefaultSharedPreferences(this.f83056a);
    }

    /* renamed from: s */
    public SqlBrite m19626s() {
        return new SqlBrite.Builder().logger(new SqlBrite.Logger() { // from class: j4
            @Override // com.squareup.sqlbrite.SqlBrite.Logger
            public final void log(String str) {
                AndroidModule.m19644a(str);
            }
        }).build();
    }

    /* renamed from: t */
    public TelephonyManager m19625t() {
        return (TelephonyManager) this.f83056a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    /* renamed from: u */
    public UsbManager m19624u() {
        return (UsbManager) this.f83056a.getSystemService("usb");
    }
}
