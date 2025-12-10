package co.omise.android.api;

import android.os.Handler;
import android.os.Looper;
import co.omise.android.api.Client;
import co.omise.android.models.Model;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J)\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J,\u0010\u000e\u001a\u00020\u0014\"\b\b\u0000\u0010\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28850d2 = {"Lco/omise/android/api/Client;", "", "publicKey", "", "(Ljava/lang/String;)V", "background", "Ljava/util/concurrent/Executor;", "handler", "Landroid/os/Handler;", "httpClient", "Lokhttp3/OkHttpClient;", "buildHttpClient", "config", "Lco/omise/android/api/Config;", "send", "T", "Lco/omise/android/models/Model;", "request", "Lco/omise/android/api/Request;", "(Lco/omise/android/api/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/omise/android/api/RequestListener;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class Client {
    @NotNull
    private final Executor background;
    @NotNull
    private final Handler handler;
    @NotNull
    private OkHttpClient httpClient;

    public Client(@NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.handler = new Handler(Looper.getMainLooper());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.background = newSingleThreadExecutor;
        this.httpClient = buildHttpClient(new Config(null, publicKey, 1, null));
    }

    /* renamed from: a */
    public static /* synthetic */ void m51300a(Client client, Request request, RequestListener requestListener) {
        m73915send$lambda0(client, request, requestListener);
    }

    private final OkHttpClient buildHttpClient(Config config) {
        return new OkHttpClient.Builder().addInterceptor(new Configurer(config)).connectionSpecs(AbstractC10108ds.listOf(new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build())).readTimeout(60L, TimeUnit.SECONDS).build();
    }

    /* renamed from: send$lambda-0 */
    public static final void m73915send$lambda0(Client this$0, Request request, RequestListener listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new Invocation(this$0.handler, this$0.httpClient, request, listener, null, 16, null).invoke();
    }

    public final <T extends Model> void send(@NotNull final Request<T> request, @NotNull final RequestListener<T> listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.background.execute(new Runnable() { // from class: Zp
            @Override // java.lang.Runnable
            public final void run() {
                Client.m51300a(Client.this, request, listener);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final <T extends Model> Object send(@NotNull Request<T> request, @NotNull Continuation<? super T> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        send((Request) request, (RequestListener) new RequestListener<T>() { // from class: co.omise.android.api.Client$send$3$1
            @Override // co.omise.android.api.RequestListener
            public void onRequestFailed(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Continuation<T> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(throwable)));
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            @Override // co.omise.android.api.RequestListener
            public void onRequestSucceed(@NotNull Model model) {
                Intrinsics.checkNotNullParameter(model, "model");
                safeContinuation.resumeWith(Result.m74087constructorimpl(model));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
