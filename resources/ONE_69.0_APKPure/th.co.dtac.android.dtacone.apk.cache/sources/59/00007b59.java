package co.omise.android.api;

import co.omise.android.SDKLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m29142d2 = {"Lco/omise/android/api/Configurer;", "Lokhttp3/Interceptor;", "config", "Lco/omise/android/api/Config;", "(Lco/omise/android/api/Config;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class Configurer implements Interceptor {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Config config;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, m29142d2 = {"Lco/omise/android/api/Configurer$Companion;", "", "()V", "configure", "Lokhttp3/Request;", "config", "Lco/omise/android/api/Config;", "request", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final okhttp3.Request configure(@NotNull Config config, @NotNull okhttp3.Request request) {
            String str;
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(request, "request");
            String apiVersion = config.apiVersion();
            Endpoint endpoint = Endpoint.Companion.getAllEndpointsByHost().get(request.url().host());
            if (endpoint != null) {
                str = endpoint.authenticationKey(config);
            } else {
                str = null;
            }
            Request.Builder addHeader = request.newBuilder().addHeader("User-Agent", config.userAgent());
            if (str == null) {
                str = "";
            }
            Request.Builder addHeader2 = addHeader.addHeader("Authorization", Credentials.basic$default(str, "x", null, 4, null));
            if (apiVersion.length() > 0) {
                addHeader2 = addHeader2.addHeader("Omise-Version", apiVersion);
            }
            return addHeader2.build();
        }

        private Companion() {
        }
    }

    public Configurer(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @JvmStatic
    @NotNull
    public static final okhttp3.Request configure(@NotNull Config config, @NotNull okhttp3.Request request) {
        return Companion.configure(config, request);
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Request request = chain.request();
        SDKLog sDKLog = SDKLog.INSTANCE;
        sDKLog.m51298d(request.method() + TokenParser.f74644SP + request.url().encodedPath());
        Response proceed = chain.proceed(Companion.configure(this.config, chain.request()));
        sDKLog.m51298d(request.method() + TokenParser.f74644SP + request.url().encodedPath() + " - " + proceed.code());
        return proceed;
    }
}