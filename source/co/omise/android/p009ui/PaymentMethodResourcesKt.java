package co.omise.android.p009ui;

import co.omise.android.models.BackendType;
import co.omise.android.models.Capability;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.PaymentMethodKt;
import co.omise.android.models.SourceType;
import co.omise.android.models.TokenizationMethod;
import co.omise.android.p009ui.PaymentMethodResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\b\u0012\u0004\u0012\u00020\b0\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\b\u0012\u0004\u0012\u00020\f0\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\"\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28850d2 = {"installmentResources", "", "Lco/omise/android/ui/InstallmentResource;", "Lco/omise/android/models/SourceType$Installment;", "getInstallmentResources", "(Ljava/util/List;)Ljava/util/List;", "internetBankingResources", "Lco/omise/android/ui/InternetBankingResource;", "Lco/omise/android/models/SourceType$InternetBanking;", "getInternetBankingResources", "mobileBankingResources", "Lco/omise/android/ui/MobileBankingResource;", "Lco/omise/android/models/SourceType$MobileBanking;", "getMobileBankingResources", "paymentMethodResources", "Lco/omise/android/ui/PaymentMethodResource;", "Lco/omise/android/models/Capability;", "getPaymentMethodResources", "(Lco/omise/android/models/Capability;)Ljava/util/List;", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.PaymentMethodResourcesKt */
/* loaded from: classes3.dex */
public final class PaymentMethodResourcesKt {
    @NotNull
    public static final List<InstallmentResource> getInstallmentResources(@NotNull List<? extends SourceType.Installment> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (SourceType.Installment installment : list) {
            Iterator<T> it = InstallmentResource.Companion.getAll().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((InstallmentResource) obj).getSourceType(), installment)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InstallmentResource installmentResource = (InstallmentResource) obj;
            if (installmentResource != null) {
                arrayList.add(installmentResource);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<InternetBankingResource> getInternetBankingResources(@NotNull List<? extends SourceType.InternetBanking> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (SourceType.InternetBanking internetBanking : list) {
            Iterator<T> it = InternetBankingResource.Companion.getAll().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((InternetBankingResource) obj).getSourceType(), internetBanking)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InternetBankingResource internetBankingResource = (InternetBankingResource) obj;
            if (internetBankingResource != null) {
                arrayList.add(internetBankingResource);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<MobileBankingResource> getMobileBankingResources(@NotNull List<? extends SourceType.MobileBanking> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (SourceType.MobileBanking mobileBanking : list) {
            Iterator<T> it = MobileBankingResource.Companion.getAll().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((MobileBankingResource) obj).getSourceType(), mobileBanking)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MobileBankingResource mobileBankingResource = (MobileBankingResource) obj;
            if (mobileBankingResource != null) {
                arrayList.add(mobileBankingResource);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<PaymentMethodResource> getPaymentMethodResources(@NotNull Capability capability) {
        BackendType.Token token;
        TokenizationMethod tokenizationMethod;
        BackendType.Source source;
        SourceType sourceType;
        Intrinsics.checkNotNullParameter(capability, "<this>");
        ArrayList arrayList = new ArrayList();
        List<PaymentMethod> paymentMethods = capability.getPaymentMethods();
        if (paymentMethods == null) {
            paymentMethods = CollectionsKt__CollectionsKt.emptyList();
        }
        for (PaymentMethod paymentMethod : paymentMethods) {
            BackendType backendType = PaymentMethodKt.getBackendType(paymentMethod);
            Object obj = null;
            if (backendType instanceof BackendType.Token) {
                BackendType backendType2 = PaymentMethodKt.getBackendType(paymentMethod);
                Intrinsics.checkNotNull(backendType2, "null cannot be cast to non-null type co.omise.android.models.BackendType.Token");
                if (((BackendType.Token) backendType2).getTokenizationMethod() instanceof TokenizationMethod.Card) {
                    arrayList.add(PaymentMethodResource.CreditCard.INSTANCE);
                } else {
                    Iterator<T> it = PaymentMethodResource.Companion.getAll().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        TokenizationMethod tokenizationMethod2 = ((PaymentMethodResource) next).getTokenizationMethod();
                        BackendType backendType3 = PaymentMethodKt.getBackendType(paymentMethod);
                        if (backendType3 instanceof BackendType.Token) {
                            token = (BackendType.Token) backendType3;
                        } else {
                            token = null;
                        }
                        if (token != null) {
                            tokenizationMethod = token.getTokenizationMethod();
                        } else {
                            tokenizationMethod = null;
                        }
                        if (Intrinsics.areEqual(tokenizationMethod2, tokenizationMethod)) {
                            obj = next;
                            break;
                        }
                    }
                    PaymentMethodResource paymentMethodResource = (PaymentMethodResource) obj;
                    if (paymentMethodResource != null) {
                        arrayList.add(paymentMethodResource);
                    }
                }
            } else if (backendType instanceof BackendType.Source) {
                BackendType backendType4 = PaymentMethodKt.getBackendType(paymentMethod);
                Intrinsics.checkNotNull(backendType4, "null cannot be cast to non-null type co.omise.android.models.BackendType.Source");
                SourceType sourceType2 = ((BackendType.Source) backendType4).getSourceType();
                if (sourceType2 instanceof SourceType.Installment) {
                    arrayList.add(PaymentMethodResource.Installments.INSTANCE);
                } else if (sourceType2 instanceof SourceType.InternetBanking) {
                    arrayList.add(PaymentMethodResource.InternetBankings.INSTANCE);
                } else if (sourceType2 instanceof SourceType.MobileBanking) {
                    arrayList.add(PaymentMethodResource.MobileBankings.INSTANCE);
                } else if (sourceType2 instanceof SourceType.Econtext) {
                    arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new PaymentMethodResource[]{PaymentMethodResource.ConvenienceStore.INSTANCE, PaymentMethodResource.PayEasy.INSTANCE, PaymentMethodResource.Netbanking.INSTANCE}));
                } else if (sourceType2 instanceof SourceType.TouchNGo) {
                    if (Intrinsics.areEqual(paymentMethod.getProvider(), PaymentMethodResource.ALIPAY_PLUS_PROVIDER)) {
                        arrayList.add(PaymentMethodResource.TouchNGoAlipay.INSTANCE);
                    } else {
                        arrayList.add(PaymentMethodResource.TouchNGo.INSTANCE);
                    }
                } else if (sourceType2 instanceof SourceType.TrueMoneyJumpApp) {
                    arrayList.remove(PaymentMethodResource.TrueMoney.INSTANCE);
                    arrayList.add(PaymentMethodResource.TrueMoneyJumpApp.INSTANCE);
                } else if (sourceType2 instanceof SourceType.ShopeePayJumpApp) {
                    arrayList.remove(PaymentMethodResource.ShopeePay.INSTANCE);
                    arrayList.add(PaymentMethodResource.ShopeePayJumpApp.INSTANCE);
                } else if (sourceType2 instanceof SourceType.GrabPay) {
                    if (Intrinsics.areEqual(paymentMethod.getProvider(), PaymentMethodResource.RMS_PROVIDER)) {
                        arrayList.add(PaymentMethodResource.GrabPayRMS.INSTANCE);
                    } else {
                        arrayList.add(PaymentMethodResource.GrabPay.INSTANCE);
                    }
                } else {
                    Iterator<T> it2 = PaymentMethodResource.Companion.getAll().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        SourceType sourceType3 = ((PaymentMethodResource) next2).getSourceType();
                        BackendType backendType5 = PaymentMethodKt.getBackendType(paymentMethod);
                        if (backendType5 instanceof BackendType.Source) {
                            source = (BackendType.Source) backendType5;
                        } else {
                            source = null;
                        }
                        if (source != null) {
                            sourceType = source.getSourceType();
                        } else {
                            sourceType = null;
                        }
                        if (Intrinsics.areEqual(sourceType3, sourceType)) {
                            obj = next2;
                            break;
                        }
                    }
                    PaymentMethodResource paymentMethodResource2 = (PaymentMethodResource) obj;
                    if (paymentMethodResource2 != null) {
                        arrayList.add(paymentMethodResource2);
                    }
                }
            }
        }
        return CollectionsKt___CollectionsKt.distinct(arrayList);
    }
}
