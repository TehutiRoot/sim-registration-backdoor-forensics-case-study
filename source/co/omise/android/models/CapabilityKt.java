package co.omise.android.models;

import co.omise.android.models.BackendType;
import co.omise.android.models.SourceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\n"}, m28850d2 = {"installmentMethods", "", "Lco/omise/android/models/PaymentMethod;", "Lco/omise/android/models/Capability;", "getInstallmentMethods", "(Lco/omise/android/models/Capability;)Ljava/util/List;", "internetBankingMethods", "getInternetBankingMethods", "mobileBankingMethods", "getMobileBankingMethods", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class CapabilityKt {
    @NotNull
    public static final List<PaymentMethod> getInstallmentMethods(@NotNull Capability capability) {
        BackendType.Source source;
        SourceType sourceType;
        Intrinsics.checkNotNullParameter(capability, "<this>");
        List<PaymentMethod> paymentMethods = capability.getPaymentMethods();
        ArrayList arrayList = null;
        if (paymentMethods != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : paymentMethods) {
                BackendType backendType = PaymentMethodKt.getBackendType((PaymentMethod) obj);
                if (backendType instanceof BackendType.Source) {
                    source = (BackendType.Source) backendType;
                } else {
                    source = null;
                }
                if (source != null) {
                    sourceType = source.getSourceType();
                } else {
                    sourceType = null;
                }
                if (sourceType instanceof SourceType.Installment) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    @NotNull
    public static final List<PaymentMethod> getInternetBankingMethods(@NotNull Capability capability) {
        BackendType.Source source;
        SourceType sourceType;
        Intrinsics.checkNotNullParameter(capability, "<this>");
        List<PaymentMethod> paymentMethods = capability.getPaymentMethods();
        ArrayList arrayList = null;
        if (paymentMethods != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : paymentMethods) {
                BackendType backendType = PaymentMethodKt.getBackendType((PaymentMethod) obj);
                if (backendType instanceof BackendType.Source) {
                    source = (BackendType.Source) backendType;
                } else {
                    source = null;
                }
                if (source != null) {
                    sourceType = source.getSourceType();
                } else {
                    sourceType = null;
                }
                if (sourceType instanceof SourceType.InternetBanking) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    @NotNull
    public static final List<PaymentMethod> getMobileBankingMethods(@NotNull Capability capability) {
        BackendType.Source source;
        SourceType sourceType;
        Intrinsics.checkNotNullParameter(capability, "<this>");
        List<PaymentMethod> paymentMethods = capability.getPaymentMethods();
        ArrayList arrayList = null;
        if (paymentMethods != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : paymentMethods) {
                BackendType backendType = PaymentMethodKt.getBackendType((PaymentMethod) obj);
                if (backendType instanceof BackendType.Source) {
                    source = (BackendType.Source) backendType;
                } else {
                    source = null;
                }
                if (source != null) {
                    sourceType = source.getSourceType();
                } else {
                    sourceType = null;
                }
                if (sourceType instanceof SourceType.MobileBanking) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }
}
