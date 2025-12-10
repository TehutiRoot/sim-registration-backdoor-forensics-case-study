package co.omise.android.api;

import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0004H&J\u0006\u0010\n\u001a\u00020\u0004¨\u0006\f"}, m28850d2 = {"Lco/omise/android/api/Endpoint;", "", "()V", "authenticationKey", "", "config", "Lco/omise/android/api/Config;", "buildUrl", "Lokhttp3/HttpUrl$Builder;", "host", "scheme", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public abstract class Endpoint {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Endpoint VAULT = new Endpoint() { // from class: co.omise.android.api.Endpoint$Companion$VAULT$1
        @Override // co.omise.android.api.Endpoint
        @NotNull
        public String authenticationKey(@NotNull Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return config.publicKey();
        }

        @Override // co.omise.android.api.Endpoint
        @NotNull
        public String host() {
            return OmiseEndpointsKt.OMISE_VAULT;
        }
    };
    @JvmField
    @NotNull
    public static final Endpoint API = new Endpoint() { // from class: co.omise.android.api.Endpoint$Companion$API$1
        @Override // co.omise.android.api.Endpoint
        @NotNull
        public String authenticationKey(@NotNull Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return config.publicKey();
        }

        @Override // co.omise.android.api.Endpoint
        @NotNull
        public String host() {
            return OmiseEndpointsKt.OMISE_API;
        }
    };

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28850d2 = {"Lco/omise/android/api/Endpoint$Companion;", "", "()V", "API", "Lco/omise/android/api/Endpoint;", "VAULT", "allEndpoints", "", "getAllEndpoints$annotations", "getAllEndpoints", "()Ljava/util/List;", "allEndpointsByHost", "", "", "getAllEndpointsByHost$annotations", "getAllEndpointsByHost", "()Ljava/util/Map;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getAllEndpoints$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getAllEndpointsByHost$annotations() {
        }

        @NotNull
        public final List<Endpoint> getAllEndpoints() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Endpoint.VAULT);
            arrayList.add(Endpoint.API);
            List<Endpoint> unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(endpoints)");
            return unmodifiableList;
        }

        @NotNull
        public final Map<String, Endpoint> getAllEndpointsByHost() {
            HashMap hashMap = new HashMap();
            Endpoint endpoint = Endpoint.VAULT;
            hashMap.put(endpoint.host(), endpoint);
            Endpoint endpoint2 = Endpoint.API;
            hashMap.put(endpoint2.host(), endpoint2);
            Map<String, Endpoint> unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(endpoints)");
            return unmodifiableMap;
        }

        private Companion() {
        }
    }

    @NotNull
    public static final List<Endpoint> getAllEndpoints() {
        return Companion.getAllEndpoints();
    }

    @NotNull
    public static final Map<String, Endpoint> getAllEndpointsByHost() {
        return Companion.getAllEndpointsByHost();
    }

    @NotNull
    public abstract String authenticationKey(@NotNull Config config);

    @NotNull
    public final HttpUrl.Builder buildUrl() {
        return new HttpUrl.Builder().scheme(scheme()).host(host());
    }

    @NotNull
    public abstract String host();

    @NotNull
    public final String scheme() {
        return UriUtil.HTTPS_SCHEME;
    }
}
