package co.omise.android.p009ui;

import co.omise.android.models.Bank;
import co.omise.android.models.Capability;
import co.omise.android.models.PaymentMethod;
import co.omise.android.models.Source;
import co.omise.android.models.SupportedEcontext;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J \u0010\u000e\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0018H&J\u0016\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H&J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u001f\u001a\u00020\u0003H&¨\u0006 "}, m28850d2 = {"Lco/omise/android/ui/PaymentCreatorNavigation;", "", "createSourceFinished", "", "source", "Lco/omise/android/models/Source;", "navigateToAtomeForm", "navigateToCreditCardForm", "navigateToDuitNowOBWBankChooser", "capability", "Lco/omise/android/models/Capability;", "navigateToEContextForm", "eContext", "Lco/omise/android/models/SupportedEcontext;", "navigateToFpxBankChooser", "banks", "", "Lco/omise/android/models/Bank;", "email", "", "navigateToFpxEmailForm", "navigateToGooglePayForm", "navigateToInstallmentChooser", "allowedInstalls", "Lco/omise/android/models/PaymentMethod;", "navigateToInstallmentTermChooser", "installment", "navigateToInternetBankingChooser", "allowedBanks", "navigateToMobileBankingChooser", "navigateToPaymentChooser", "navigateToTrueMoneyForm", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.PaymentCreatorNavigation */
/* loaded from: classes3.dex */
public interface PaymentCreatorNavigation {
    void createSourceFinished(@NotNull Source source);

    void navigateToAtomeForm();

    void navigateToCreditCardForm();

    void navigateToDuitNowOBWBankChooser(@NotNull Capability capability);

    void navigateToEContextForm(@NotNull SupportedEcontext supportedEcontext);

    void navigateToFpxBankChooser(@Nullable List<Bank> list, @NotNull String str);

    void navigateToFpxEmailForm();

    void navigateToGooglePayForm();

    void navigateToInstallmentChooser(@NotNull List<PaymentMethod> list);

    void navigateToInstallmentTermChooser(@NotNull PaymentMethod paymentMethod);

    void navigateToInternetBankingChooser(@NotNull List<PaymentMethod> list);

    void navigateToMobileBankingChooser(@NotNull List<PaymentMethod> list);

    void navigateToPaymentChooser(@NotNull Capability capability);

    void navigateToTrueMoneyForm();
}
