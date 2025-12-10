package co.omise.android.api.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m29142d2 = {"Lco/omise/android/api/exceptions/ClientException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/Exception;)V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ClientException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientException(@NotNull Exception cause) {
        super("Client initialization failure.", cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}