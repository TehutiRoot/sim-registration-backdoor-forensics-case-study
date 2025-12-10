package co.omise.android.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0006¨\u0006\n"}, m28850d2 = {"newTypedCall", "Lco/omise/android/api/TypedCall;", "Lokhttp3/OkHttpClient;", "okRequest", "Lokhttp3/Request;", "clazz", "Ljava/lang/Class;", "errorClazz", "Ljava/lang/Error;", "Lkotlin/Error;", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class InvocationKt {
    @NotNull
    public static final TypedCall newTypedCall(@NotNull OkHttpClient okHttpClient, @NotNull okhttp3.Request okRequest, @NotNull Class<?> clazz, @NotNull Class<Error> errorClazz) {
        Intrinsics.checkNotNullParameter(okHttpClient, "<this>");
        Intrinsics.checkNotNullParameter(okRequest, "okRequest");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(errorClazz, "errorClazz");
        return new TypedCall(okHttpClient.newCall(okRequest), clazz, errorClazz);
    }
}
