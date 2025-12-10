package co.omise.android.models;

import co.omise.android.models.BackendType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28850d2 = {"backendType", "Lco/omise/android/models/BackendType;", "Lco/omise/android/models/PaymentMethod;", "getBackendType", "(Lco/omise/android/models/PaymentMethod;)Lco/omise/android/models/BackendType;", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodKt {
    @NotNull
    public static final BackendType getBackendType(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        String name = paymentMethod.getName();
        if (Intrinsics.areEqual(name, "card")) {
            return new BackendType.Token(TokenizationMethod.Companion.creator(paymentMethod.getName()));
        }
        if (Intrinsics.areEqual(name, "googlepay")) {
            return new BackendType.Token(TokenizationMethod.Companion.creator(paymentMethod.getName()));
        }
        return new BackendType.Source(SourceType.Companion.creator(paymentMethod.getName()));
    }
}
