package co.omise.android.api;

import androidx.core.app.NotificationCompat;
import co.omise.android.models.Model;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0005¢\u0006\u0002\u0010\nJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/api/TypedCall;", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "clazz", "Ljava/lang/Class;", "Lco/omise/android/models/Model;", "errorClazz", "Ljava/lang/Error;", "Lkotlin/Error;", "(Lokhttp3/Call;Ljava/lang/Class;Ljava/lang/Class;)V", "getClazz", "()Ljava/lang/Class;", "getErrorClazz", "execute", "Lokhttp3/Response;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TypedCall {
    @NotNull
    private final Call call;
    @NotNull
    private final Class<Model> clazz;
    @NotNull
    private final Class<Error> errorClazz;

    public TypedCall(@NotNull Call call, @NotNull Class<Model> clazz, @NotNull Class<Error> errorClazz) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(errorClazz, "errorClazz");
        this.call = call;
        this.clazz = clazz;
        this.errorClazz = errorClazz;
    }

    @NotNull
    public final Response execute() {
        return this.call.execute();
    }

    @NotNull
    public final Class<Model> getClazz() {
        return this.clazz;
    }

    @NotNull
    public final Class<Error> getErrorClazz() {
        return this.errorClazz;
    }
}
