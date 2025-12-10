package co.omise.android.api;

import co.omise.android.models.APIError;
import co.omise.android.models.Model;
import co.omise.android.models.Serializer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001b*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000e\"\u00020\fH\u0004¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u000b\u001a\u00020\bH$J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H$¨\u0006\u001d"}, m28850d2 = {"Lco/omise/android/api/RequestBuilder;", "T", "Lco/omise/android/models/Model;", "", "()V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lco/omise/android/api/Request;", "buildUrl", "Lokhttp3/HttpUrl;", "endpoint", "Lco/omise/android/api/Endpoint;", ClientCookie.PATH_ATTR, "", "segments", "", "(Lco/omise/android/api/Endpoint;Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/HttpUrl;", "errorType", "Ljava/lang/Class;", "Ljava/lang/Error;", "Lkotlin/Error;", FirebaseAnalytics.Param.METHOD, "payload", "Lokhttp3/RequestBody;", "serialize", "serializer", "Lco/omise/android/models/Serializer;", "type", "Companion", "HttpUrlBuilder", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public abstract class RequestBuilder<T extends Model> {
    @NotNull
    public static final String DELETE = "DELETE";
    @NotNull
    public static final String GET = "GET";
    @NotNull
    public static final String PATCH = "PATCH";
    @NotNull
    public static final String POST = "POST";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final MediaType JSON_MEDIA_TYPE = MediaType.Companion.get("application/json; charset=utf-8");

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28850d2 = {"Lco/omise/android/api/RequestBuilder$Companion;", "", "()V", "DELETE", "", "GET", "JSON_MEDIA_TYPE", "Lokhttp3/MediaType;", "getJSON_MEDIA_TYPE", "()Lokhttp3/MediaType;", "PATCH", "POST", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MediaType getJSON_MEDIA_TYPE() {
            return RequestBuilder.JSON_MEDIA_TYPE;
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28850d2 = {"Lco/omise/android/api/RequestBuilder$HttpUrlBuilder;", "", "endpoint", "Lco/omise/android/api/Endpoint;", ClientCookie.PATH_ATTR, "", "segments", "", "(Lco/omise/android/api/RequestBuilder;Lco/omise/android/api/Endpoint;Ljava/lang/String;Ljava/util/List;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lokhttp3/HttpUrl;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public final class HttpUrlBuilder {
        @NotNull
        private final Endpoint endpoint;
        @NotNull
        private final String path;
        @NotNull
        private final List<String> segments;
        final /* synthetic */ RequestBuilder<T> this$0;

        public HttpUrlBuilder(@NotNull RequestBuilder requestBuilder, @NotNull Endpoint endpoint, @NotNull String path, List<String> segments) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(segments, "segments");
            this.this$0 = requestBuilder;
            this.endpoint = endpoint;
            this.path = path;
            this.segments = segments;
        }

        @NotNull
        public final HttpUrl build() {
            Objects.requireNonNull(this.endpoint);
            Objects.requireNonNull(this.path);
            HttpUrl.Builder addPathSegment = this.endpoint.buildUrl().addPathSegment(this.path);
            for (String str : this.segments) {
                if (!AbstractC20204hN1.isBlank(str)) {
                    addPathSegment.addPathSegment(str);
                }
            }
            return addPathSegment.build();
        }
    }

    private final Serializer serializer() {
        return new Serializer();
    }

    @NotNull
    public final Request<T> build() {
        return new Request<>(method(), path(), payload(), type(), errorType(), this);
    }

    @NotNull
    public final HttpUrl buildUrl(@NotNull Endpoint endpoint, @NotNull String path, @NotNull String... segments) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new HttpUrlBuilder(this, endpoint, path, ArraysKt___ArraysJvmKt.asList(segments)).build();
    }

    @NotNull
    public Class<Error> errorType() {
        return APIError.class;
    }

    @NotNull
    public String method() {
        return "GET";
    }

    @NotNull
    public abstract HttpUrl path();

    @Nullable
    public RequestBody payload() {
        return null;
    }

    @NotNull
    public final RequestBody serialize() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        serializer().serializeRequestBuilder(byteArrayOutputStream, this);
        RequestBody.Companion companion = RequestBody.Companion;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "stream.toByteArray()");
        return RequestBody.Companion.create$default(companion, byteArray, JSON_MEDIA_TYPE, 0, 0, 6, (Object) null);
    }

    @NotNull
    public abstract Class<T> type();
}
