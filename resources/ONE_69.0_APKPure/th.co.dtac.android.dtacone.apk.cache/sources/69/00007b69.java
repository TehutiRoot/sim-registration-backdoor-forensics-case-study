package co.omise.android.api.exceptions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"Lco/omise/android/api/exceptions/RedirectionException;", "", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class RedirectionException extends Throwable {
    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return "Redirection is not allowed.";
    }
}