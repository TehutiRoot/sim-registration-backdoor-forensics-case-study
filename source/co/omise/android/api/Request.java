package co.omise.android.api;

import co.omise.android.models.Model;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u0011R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m28850d2 = {"Lco/omise/android/api/Request;", "T", "Lco/omise/android/models/Model;", "", FirebaseAnalytics.Param.METHOD, "", ImagesContract.URL, "Lokhttp3/HttpUrl;", "payload", "Lokhttp3/RequestBody;", "responseType", "Ljava/lang/Class;", "errorType", "Ljava/lang/Error;", "Lkotlin/Error;", "builder", "Lco/omise/android/api/RequestBuilder;", "(Ljava/lang/String;Lokhttp3/HttpUrl;Lokhttp3/RequestBody;Ljava/lang/Class;Ljava/lang/Class;Lco/omise/android/api/RequestBuilder;)V", "getBuilder$sdk_productionRelease", "()Lco/omise/android/api/RequestBuilder;", "getErrorType$sdk_productionRelease", "()Ljava/lang/Class;", "getMethod$sdk_productionRelease", "()Ljava/lang/String;", "getPayload$sdk_productionRelease", "()Lokhttp3/RequestBody;", "getResponseType$sdk_productionRelease", "getUrl$sdk_productionRelease", "()Lokhttp3/HttpUrl;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public class Request<T extends Model> {
    @NotNull
    private final RequestBuilder<T> builder;
    @NotNull
    private final Class<Error> errorType;
    @NotNull
    private final String method;
    @Nullable
    private final RequestBody payload;
    @NotNull
    private final Class<T> responseType;
    @NotNull
    private final HttpUrl url;

    public Request(@NotNull String method, @NotNull HttpUrl url, @Nullable RequestBody requestBody, @NotNull Class<T> responseType, @NotNull Class<Error> errorType, @NotNull RequestBuilder<T> builder) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.method = method;
        this.url = url;
        this.payload = requestBody;
        this.responseType = responseType;
        this.errorType = errorType;
        this.builder = builder;
    }

    @NotNull
    public final RequestBuilder<T> getBuilder$sdk_productionRelease() {
        return this.builder;
    }

    @NotNull
    public final Class<Error> getErrorType$sdk_productionRelease() {
        return this.errorType;
    }

    @NotNull
    public final String getMethod$sdk_productionRelease() {
        return this.method;
    }

    @Nullable
    public final RequestBody getPayload$sdk_productionRelease() {
        return this.payload;
    }

    @NotNull
    public final Class<T> getResponseType$sdk_productionRelease() {
        return this.responseType;
    }

    @NotNull
    public final HttpUrl getUrl$sdk_productionRelease() {
        return this.url;
    }
}
