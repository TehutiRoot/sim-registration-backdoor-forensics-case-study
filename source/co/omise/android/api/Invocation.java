package co.omise.android.api;

import android.os.Handler;
import androidx.core.app.NotificationCompat;
import co.omise.android.api.Invocation;
import co.omise.android.api.exceptions.RedirectionException;
import co.omise.android.models.Model;
import co.omise.android.models.Serializer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m28850d2 = {"Lco/omise/android/api/Invocation;", "T", "Lco/omise/android/models/Model;", "", "replyHandler", "Landroid/os/Handler;", "httpClient", "Lokhttp3/OkHttpClient;", "request", "Lco/omise/android/api/Request;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/omise/android/api/RequestListener;", "serializer", "Lco/omise/android/models/Serializer;", "(Landroid/os/Handler;Lokhttp3/OkHttpClient;Lco/omise/android/api/Request;Lco/omise/android/api/RequestListener;Lco/omise/android/models/Serializer;)V", "didFail", "", "e", "", "didSucceed", "model", "invoke", "processCall", NotificationCompat.CATEGORY_CALL, "Lco/omise/android/api/TypedCall;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class Invocation<T extends Model> {
    @NotNull
    private final OkHttpClient httpClient;
    @NotNull
    private final RequestListener<T> listener;
    @NotNull
    private final Handler replyHandler;
    @NotNull
    private final Request<T> request;
    @NotNull
    private final Serializer serializer;

    public Invocation(@NotNull Handler replyHandler, @NotNull OkHttpClient httpClient, @NotNull Request<T> request, @NotNull RequestListener<T> listener, @NotNull Serializer serializer) {
        Intrinsics.checkNotNullParameter(replyHandler, "replyHandler");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.replyHandler = replyHandler;
        this.httpClient = httpClient;
        this.request = request;
        this.listener = listener;
        this.serializer = serializer;
    }

    /* renamed from: a */
    public static /* synthetic */ void m51299a(Invocation invocation, Throwable th2) {
        m73916didFail$lambda1(invocation, th2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m51298b(Invocation invocation, Model model) {
        m73917didSucceed$lambda0(invocation, model);
    }

    private final void didFail(final Throwable th2) {
        this.replyHandler.post(new Runnable() { // from class: mg0
            {
                Invocation.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Invocation.m51299a(Invocation.this, th2);
            }
        });
    }

    /* renamed from: didFail$lambda-1 */
    public static final void m73916didFail$lambda1(Invocation this$0, Throwable e) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e, "$e");
        this$0.listener.onRequestFailed(e);
    }

    private final void didSucceed(final Model model) {
        this.replyHandler.post(new Runnable() { // from class: lg0
            {
                Invocation.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Invocation.m51298b(Invocation.this, model);
            }
        });
    }

    /* renamed from: didSucceed$lambda-0 */
    public static final void m73917didSucceed$lambda0(Invocation this$0, Model model) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        this$0.listener.onRequestSucceed(model);
    }

    private final void processCall(TypedCall typedCall) {
        InputStream inputStream;
        Response execute = typedCall.execute();
        ResponseBody body = execute.body();
        if (body != null) {
            inputStream = body.byteStream();
        } else {
            inputStream = null;
        }
        if (inputStream == null) {
            didFail(new IOException("HTTP response have no body."));
            return;
        }
        int code = execute.code();
        if (200 <= code && code < 300) {
            didSucceed(this.serializer.deserialize(inputStream, (Class<?>) typedCall.getClazz()));
        } else if (300 <= code && code < 400) {
            didFail(new RedirectionException());
        } else {
            didFail(this.serializer.m73919deserialize(inputStream, typedCall.getErrorClazz()));
        }
    }

    public final void invoke() {
        try {
            processCall(InvocationKt.newTypedCall(this.httpClient, new Request.Builder().method(this.request.getMethod$sdk_productionRelease(), this.request.getPayload$sdk_productionRelease()).url(this.request.getUrl$sdk_productionRelease()).build(), this.request.getResponseType$sdk_productionRelease(), this.request.getErrorType$sdk_productionRelease()));
        } catch (IOException e) {
            didFail(e);
        } catch (JSONException e2) {
            didFail(e2);
        }
    }

    public /* synthetic */ Invocation(Handler handler, OkHttpClient okHttpClient, Request request, RequestListener requestListener, Serializer serializer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, okHttpClient, request, requestListener, (i & 16) != 0 ? new Serializer() : serializer);
    }
}
