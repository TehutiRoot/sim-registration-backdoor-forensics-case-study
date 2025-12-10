package th.p047co.dtac.android.dtacone.manager.header;

import android.location.LocationManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.BuildConfig;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.RootUtil;
import th.p047co.dtac.android.dtacone.util.string.StringEscapeUtils;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/header/CommonHeaderInterceptor;", "Lokhttp3/Interceptor;", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "udidService", "Landroid/telephony/TelephonyManager;", "telephonyManager", "Landroid/location/LocationManager;", "locationManager", "Lth/co/dtac/android/dtacone/manager/locale/LanguageService;", "languageService", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRepository", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "pfRepository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "oldRtrRepository", "<init>", "(Lth/co/dtac/android/dtacone/manager/TemporaryCache;Lth/co/dtac/android/dtacone/manager/service/UdidService;Landroid/telephony/TelephonyManager;Landroid/location/LocationManager;Lth/co/dtac/android/dtacone/manager/locale/LanguageService;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/Request;", "request", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lokhttp3/Request;)Lokhttp3/Request;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "Lth/co/dtac/android/dtacone/manager/service/UdidService;", OperatorName.CURVE_TO, "Landroid/telephony/TelephonyManager;", "d", "Landroid/location/LocationManager;", "e", "Lth/co/dtac/android/dtacone/manager/locale/LanguageService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "i", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommonHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHeaderInterceptor.kt\nth/co/dtac/android/dtacone/manager/header/CommonHeaderInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.manager.header.CommonHeaderInterceptor */
/* loaded from: classes7.dex */
public final class CommonHeaderInterceptor implements Interceptor {
    public static final int $stable = 8;

    /* renamed from: a */
    public final TemporaryCache f84934a;

    /* renamed from: b */
    public final UdidService f84935b;

    /* renamed from: c */
    public final TelephonyManager f84936c;

    /* renamed from: d */
    public final LocationManager f84937d;

    /* renamed from: e */
    public final LanguageService f84938e;

    /* renamed from: f */
    public final RtrRx2Repository f84939f;

    /* renamed from: g */
    public final PreferencesRepository f84940g;

    /* renamed from: h */
    public final PreferencesViewModel f84941h;

    /* renamed from: i */
    public final RtrRepository f84942i;

    public CommonHeaderInterceptor(@NotNull TemporaryCache temporaryCache, @NotNull UdidService udidService, @NotNull TelephonyManager telephonyManager, @NotNull LocationManager locationManager, @NotNull LanguageService languageService, @NotNull RtrRx2Repository rtrRepository, @NotNull PreferencesRepository pfRepository, @NotNull PreferencesViewModel pfViewModel, @NotNull RtrRepository oldRtrRepository) {
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(languageService, "languageService");
        Intrinsics.checkNotNullParameter(rtrRepository, "rtrRepository");
        Intrinsics.checkNotNullParameter(pfRepository, "pfRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(oldRtrRepository, "oldRtrRepository");
        this.f84934a = temporaryCache;
        this.f84935b = udidService;
        this.f84936c = telephonyManager;
        this.f84937d = locationManager;
        this.f84938e = languageService;
        this.f84939f = rtrRepository;
        this.f84940g = pfRepository;
        this.f84941h = pfViewModel;
        this.f84942i = oldRtrRepository;
    }

    /* renamed from: a */
    public final String m19287a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return uuid;
    }

    /* renamed from: b */
    public final Request m19286b(Request request) {
        String str;
        String str2;
        String str3;
        String simR;
        String rtrCode;
        String token;
        String latitudeLongitude;
        if (RootUtil.isDeviceRooted()) {
            str = "1";
        } else {
            str = "0";
        }
        String string = this.f84940g.getString(Constant.KEEP_FLAVOR_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "pfRepository.getString(Constant.KEEP_FLAVOR_KEY)");
        string.length();
        Request.Builder newBuilder = request.newBuilder();
        Request.Builder header = newBuilder.header("Content-Type", "application/json").header("Accept", "application/json").header("App-Version", StringEscapeUtils.escapeString(BuildConfig.VERSION_NAME) + " 297").header("Client-OS", "android " + Build.VERSION.RELEASE).header("Jail-Status", str);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        Request.Builder header2 = header.header("Client-Model", MODEL);
        String androidID = this.f84935b.getAndroidID();
        Intrinsics.checkNotNullExpressionValue(androidID, "udidService.androidID");
        Request.Builder header3 = header2.header("UDID", androidID).header("Network-Type", "");
        String language = this.f84938e.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "languageService.language");
        String upperCase = language.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        header3.header("Language", upperCase).header("Channel", "MRTR");
        if (this.f84942i.getHeaderApplication() != null) {
            String headerApplication = this.f84942i.getHeaderApplication();
            Intrinsics.checkNotNullExpressionValue(headerApplication, "oldRtrRepository.headerApplication");
            newBuilder.header("Application", headerApplication);
        } else {
            newBuilder.header("Application", "MRTR");
        }
        if (this.f84937d.isProviderEnabled("gps") && (latitudeLongitude = this.f84934a.getLatitudeLongitude()) != null && latitudeLongitude.length() != 0) {
            String latitudeLongitude2 = this.f84934a.getLatitudeLongitude();
            Intrinsics.checkNotNullExpressionValue(latitudeLongitude2, "temporaryCache.latitudeLongitude");
            newBuilder.header("Lat-Long", latitudeLongitude2);
        }
        SessionEntity sessionNow = this.f84939f.getSessionNow();
        TokenCollection token2 = sessionNow.getToken();
        String userLogin = sessionNow.getRetailerNumber();
        String str4 = null;
        if (token2 != null) {
            str2 = token2.getToken();
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            if (token2 != null && (token = token2.getToken()) != null) {
                newBuilder.header("X-Authorization", token);
            }
        } else if (StringUtil.hasText(this.f84934a.getToken())) {
            String token3 = this.f84934a.getToken();
            Intrinsics.checkNotNullExpressionValue(token3, "temporaryCache.token");
            newBuilder.header("X-Authorization", token3);
        }
        if (StringUtil.hasText(userLogin)) {
            Intrinsics.checkNotNullExpressionValue(userLogin, "userLogin");
            newBuilder.header("User-Name-Login", userLogin);
        } else if (StringUtil.hasText(this.f84934a.getRetailerNumber())) {
            String retailerNumber = this.f84934a.getRetailerNumber();
            Intrinsics.checkNotNullExpressionValue(retailerNumber, "temporaryCache.retailerNumber");
            newBuilder.header("User-Name-Login", retailerNumber);
        }
        if (token2 != null) {
            str3 = token2.getRtrCode();
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0 && token2 != null && (rtrCode = token2.getRtrCode()) != null) {
            newBuilder.header("Rtr-Code", rtrCode);
        }
        if (token2 != null) {
            str4 = token2.getSimR();
        }
        if (str4 != null && str4.length() != 0 && token2 != null && (simR = token2.getSimR()) != null) {
            newBuilder.header("Sim-R-Number", simR);
        }
        String cliNumber = this.f84934a.getCliNumber();
        if (cliNumber != null) {
            newBuilder.header("Cli-Number", cliNumber);
        }
        String sessionId = this.f84934a.getSessionId();
        if (sessionId != null) {
            newBuilder.header("X-Feature-Session-ID", sessionId);
        }
        String it = this.f84941h.getCompany();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        newBuilder.header("X-Company", it);
        newBuilder.header("X-Request-Id", m19287a());
        return newBuilder.build();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(m19286b(chain.request()));
    }
}
