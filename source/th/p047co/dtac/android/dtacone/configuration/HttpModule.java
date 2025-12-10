package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.google.gson.Gson;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import dagger.Module;
import java.util.concurrent.TimeUnit;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.configuration.HttpModule;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;
import th.p047co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi;
import th.p047co.dtac.android.dtacone.data.remote.oneConsentAndESign.OneConsentAndESignApi;
import th.p047co.dtac.android.dtacone.data.remote.oneDeviceSaleTrue.OneDeviceSaleTrueApi;
import th.p047co.dtac.android.dtacone.data.remote.oneTol.OneTolApi;
import th.p047co.dtac.android.dtacone.data.remote.postpaid.OnePostpaidApi;
import th.p047co.dtac.android.dtacone.data.remote.pre2post.OnePre2PostApi;
import th.p047co.dtac.android.dtacone.data.remote.upPass.UpPassApi;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.header.CommonHeaderInterceptor;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.image.LoadImageUtil;

@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule */
/* loaded from: classes7.dex */
public class HttpModule {
    public static final String PREVENT_RETRY = "PREVENT_RETRY";
    public static final String RX_JAVA1 = "RX_JAVA1";
    public static final String RX_JAVA2 = "RX_JAVA2";

    /* renamed from: a */
    public String f83124a;

    /* renamed from: b */
    public HttpLoggingInterceptor.Level f83125b;

    public HttpModule(String str, HttpLoggingInterceptor.Level level) {
        this.f83124a = str;
        this.f83125b = level;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19622a(String str) {
        m19617f(str);
    }

    /* renamed from: b */
    public static /* synthetic */ Response m19621b(Interceptor.Chain chain) {
        return m19618e(chain);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19620c(String str) {
        m19616g(str);
    }

    /* renamed from: e */
    public static /* synthetic */ Response m19618e(Interceptor.Chain chain) {
        Request request = chain.request();
        String header = request.header("CONNECT_TIMEOUT");
        String header2 = request.header("READ_TIMEOUT");
        String header3 = request.header("WRITE_TIMEOUT");
        int connectTimeoutMillis = chain.connectTimeoutMillis() / 1000;
        if (header != null && !header.isEmpty()) {
            connectTimeoutMillis = Integer.parseInt(header);
        }
        int readTimeoutMillis = chain.readTimeoutMillis() / 1000;
        if (header2 != null && !header2.isEmpty()) {
            readTimeoutMillis = Integer.parseInt(header2);
        }
        int writeTimeoutMillis = chain.writeTimeoutMillis() / 1000;
        if (header3 != null && !header3.isEmpty()) {
            writeTimeoutMillis = Integer.parseInt(header3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("connectTimeout: ");
        sb.append(connectTimeoutMillis);
        sb.append(OperatorName.CLOSE_AND_STROKE);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("readTimeout: ");
        sb2.append(readTimeoutMillis);
        sb2.append(OperatorName.CLOSE_AND_STROKE);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("writeTimeout: ");
        sb3.append(writeTimeoutMillis);
        sb3.append(OperatorName.CLOSE_AND_STROKE);
        Request.Builder removeHeader = request.newBuilder().removeHeader("CONNECT_TIMEOUT").removeHeader("READ_TIMEOUT").removeHeader("WRITE_TIMEOUT");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return chain.withConnectTimeout(connectTimeoutMillis, timeUnit).withReadTimeout(readTimeoutMillis, timeUnit).withWriteTimeout(writeTimeoutMillis, timeUnit).proceed(removeHeader.build());
    }

    /* renamed from: f */
    public static /* synthetic */ void m19617f(String str) {
    }

    /* renamed from: g */
    public static /* synthetic */ void m19616g(String str) {
    }

    /* renamed from: A */
    public UpPassApi m19623A(Retrofit retrofit) {
        return (UpPassApi) retrofit.create(UpPassApi.class);
    }

    /* renamed from: d */
    public final OkHttpClient.Builder m19619d() {
        OkHttpClient.Builder cache = new OkHttpClient.Builder().cache(null);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return cache.readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).certificatePinner(getCertificatePinner());
    }

    public CertificatePinner getCertificatePinner() {
        return new CertificatePinner.Builder().add("*.dtac.co.th", "sha256/Ky9FdF53yRzY/M1vwDWfvXh6lSkjD2nK99uinPx2t/s=").add("*.dtac.co.th", "sha256/Q1LANMxC+SFh7/RQgnMcVX7xsy9bvCduy3Q5+CYXuVg=").build();
    }

    public CommonHeaderInterceptor getCommonHeaderInterceptor(TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, PreferencesViewModel preferencesViewModel, RtrRepository rtrRepository) {
        return new CommonHeaderInterceptor(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRx2Repository, preferencesRepository, preferencesViewModel, rtrRepository);
    }

    public HttpLoggingInterceptor getOkHttpLogging() {
        return new HttpLoggingInterceptor().setLevel(this.f83125b);
    }

    public Interceptor getTimeoutHeaderInterceptor() {
        return new Interceptor() { // from class: a90
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return HttpModule.m19621b(chain);
            }
        };
    }

    /* renamed from: h */
    public LoadImageUtil m19615h(TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRepository rtrRepository) {
        return new LoadImageUtil(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRepository);
    }

    /* renamed from: i */
    public MultiPartService m19614i(CompressImage compressImage) {
        return new MultiPartService(compressImage);
    }

    /* renamed from: j */
    public OkHttpClient m19613j(TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRx2Repository rtrRx2Repository, Application application, PreferencesRepository preferencesRepository, PreferencesViewModel preferencesViewModel, RtrRepository rtrRepository) {
        OkHttpClient.Builder addInterceptor = m19619d().addInterceptor(getTimeoutHeaderInterceptor()).addInterceptor(getCommonHeaderInterceptor(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRx2Repository, preferencesRepository, preferencesViewModel, rtrRepository)).addInterceptor(getOkHttpLogging());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: Z80
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public final void log(String str) {
                HttpModule.m19622a(str);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        addInterceptor.addInterceptor(httpLoggingInterceptor);
        preferencesRepository.getString(Constant.KEEP_FLAVOR_KEY).isEmpty();
        return addInterceptor.build();
    }

    /* renamed from: k */
    public OkHttpClient m19612k(TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRx2Repository rtrRx2Repository, Application application, PreferencesRepository preferencesRepository, PreferencesViewModel preferencesViewModel, RtrRepository rtrRepository) {
        OkHttpClient.Builder addInterceptor = m19619d().retryOnConnectionFailure(false).addInterceptor(getTimeoutHeaderInterceptor()).addInterceptor(getCommonHeaderInterceptor(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRx2Repository, preferencesRepository, preferencesViewModel, rtrRepository)).addInterceptor(getOkHttpLogging());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: b90
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public final void log(String str) {
                HttpModule.m19620c(str);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        addInterceptor.addInterceptor(httpLoggingInterceptor);
        preferencesRepository.getString(Constant.KEEP_FLAVOR_KEY).isEmpty();
        return addInterceptor.build();
    }

    /* renamed from: l */
    public OneCampaignApi m19611l(Retrofit retrofit) {
        return (OneCampaignApi) retrofit.create(OneCampaignApi.class);
    }

    /* renamed from: m */
    public OneChangeOwnerApi m19610m(Retrofit retrofit) {
        return (OneChangeOwnerApi) retrofit.create(OneChangeOwnerApi.class);
    }

    /* renamed from: n */
    public OneConsentAndESignApi m19609n(Retrofit retrofit) {
        return (OneConsentAndESignApi) retrofit.create(OneConsentAndESignApi.class);
    }

    /* renamed from: o */
    public OneDeviceSaleApi m19608o(Retrofit retrofit) {
        return (OneDeviceSaleApi) retrofit.create(OneDeviceSaleApi.class);
    }

    /* renamed from: p */
    public OneDeviceSaleTrueApi m19607p(Retrofit retrofit) {
        return (OneDeviceSaleTrueApi) retrofit.create(OneDeviceSaleTrueApi.class);
    }

    /* renamed from: q */
    public OnePostpaidApi m19606q(Retrofit retrofit) {
        return (OnePostpaidApi) retrofit.create(OnePostpaidApi.class);
    }

    /* renamed from: r */
    public OnePre2PostApi m19605r(Retrofit retrofit) {
        return (OnePre2PostApi) retrofit.create(OnePre2PostApi.class);
    }

    /* renamed from: s */
    public OneTolApi m19604s(Retrofit retrofit) {
        return (OneTolApi) retrofit.create(OneTolApi.class);
    }

    /* renamed from: t */
    public RTRApi m19603t(Retrofit retrofit) {
        return (RTRApi) retrofit.create(RTRApi.class);
    }

    /* renamed from: u */
    public RTRApi m19602u(Retrofit retrofit) {
        return (RTRApi) retrofit.create(RTRApi.class);
    }

    /* renamed from: v */
    public RTRApi m19601v(Retrofit retrofit) {
        return (RTRApi) retrofit.create(RTRApi.class);
    }

    /* renamed from: w */
    public Retrofit m19600w(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder().baseUrl(this.f83124a).addConverterFactory(GsonConverterFactory.create(gson)).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).client(okHttpClient).build();
    }

    /* renamed from: x */
    public Retrofit m19599x(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder().baseUrl(this.f83124a).addConverterFactory(GsonConverterFactory.create(gson)).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).client(okHttpClient).build();
    }

    /* renamed from: y */
    public Retrofit m19598y(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(this.f83124a).addConverterFactory(GsonConverterFactory.create(gson)).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).client(okHttpClient).build();
    }

    /* renamed from: z */
    public RTRApiRx2 m19597z(Retrofit retrofit) {
        return (RTRApiRx2) retrofit.create(RTRApiRx2.class);
    }
}
