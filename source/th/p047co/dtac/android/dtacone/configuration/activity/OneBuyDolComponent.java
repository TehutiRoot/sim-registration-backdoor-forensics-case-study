package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.activity.OneBuyDolActivity;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolAddBankAccountFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankDetailFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolCreditCardFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolHistoryDetailFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolHistoryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolPaymentInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolPriceListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolVerifyOtpFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&¨\u0006\u0011"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneBuyDolComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/activity/OneBuyDolActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolAddBankAccountFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolBankAccountFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolBankDetailFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolBankListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolCreditCardFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolHistoryDetailFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolHistoryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolPaymentInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolPriceListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/fragment/OneBuyDolVerifyOtpFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneBuyDolComponent */
/* loaded from: classes7.dex */
public interface OneBuyDolComponent extends AbstractActivityComponent<OneBuyDolActivity> {
    void inject(@NotNull OneBuyDolAddBankAccountFragment oneBuyDolAddBankAccountFragment);

    void inject(@NotNull OneBuyDolBankAccountFragment oneBuyDolBankAccountFragment);

    void inject(@NotNull OneBuyDolBankDetailFragment oneBuyDolBankDetailFragment);

    void inject(@NotNull OneBuyDolBankListFragment oneBuyDolBankListFragment);

    void inject(@NotNull OneBuyDolCreditCardFragment oneBuyDolCreditCardFragment);

    void inject(@NotNull OneBuyDolHistoryDetailFragment oneBuyDolHistoryDetailFragment);

    void inject(@NotNull OneBuyDolHistoryFragment oneBuyDolHistoryFragment);

    void inject(@NotNull OneBuyDolPaymentInfoFragment oneBuyDolPaymentInfoFragment);

    void inject(@NotNull OneBuyDolPriceListFragment oneBuyDolPriceListFragment);

    void inject(@NotNull OneBuyDolSummaryFragment oneBuyDolSummaryFragment);

    void inject(@NotNull OneBuyDolVerifyOtpFragment oneBuyDolVerifyOtpFragment);
}
