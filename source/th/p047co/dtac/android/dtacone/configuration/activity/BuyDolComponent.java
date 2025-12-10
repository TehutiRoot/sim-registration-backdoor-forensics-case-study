package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.buy_dol.BuyDolActivity;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolBankAccountFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolCreditCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolFormCreditFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolPaymentInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolPriceListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolVerifyOtpFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.history.BuyDolHistoryDetailFragment;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.history.BuyDolHistoryFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/BuyDolComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/buy_dol/BuyDolActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolAddBankAccountFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolBankAccountFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolCreditCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolFormCreditFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolPaymentInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolPriceListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/BuyDolVerifyOtpFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/history/BuyDolHistoryDetailFragment;", "Lth/co/dtac/android/dtacone/view/fragment/buy_dol/history/BuyDolHistoryFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.BuyDolComponent */
/* loaded from: classes7.dex */
public interface BuyDolComponent extends AbstractActivityComponent<BuyDolActivity> {
    void inject(@NotNull BuyDolAddBankAccountFragment buyDolAddBankAccountFragment);

    void inject(@NotNull BuyDolBankAccountFragment buyDolBankAccountFragment);

    void inject(@NotNull BuyDolCreditCardFragment buyDolCreditCardFragment);

    void inject(@NotNull BuyDolFormCreditFragment buyDolFormCreditFragment);

    void inject(@NotNull BuyDolPaymentInfoFragment buyDolPaymentInfoFragment);

    void inject(@NotNull BuyDolPriceListFragment buyDolPriceListFragment);

    void inject(@NotNull BuyDolSummaryFragment buyDolSummaryFragment);

    void inject(@NotNull BuyDolVerifyOtpFragment buyDolVerifyOtpFragment);

    void inject(@NotNull BuyDolHistoryDetailFragment buyDolHistoryDetailFragment);

    void inject(@NotNull BuyDolHistoryFragment buyDolHistoryFragment);
}
