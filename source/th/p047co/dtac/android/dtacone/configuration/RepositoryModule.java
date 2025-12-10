package th.p047co.dtac.android.dtacone.configuration;

import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.repository.otp_v3.OtpV3Repository;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/RepositoryModule;", "", "()V", "provideHomeRepository", "Lth/co/dtac/android/dtacone/repository/home/HomeRepository;", "api", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "oneCampaignApi", "Lth/co/dtac/android/dtacone/data/remote/campaign/OneCampaignApi;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "temporaryCache", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "pfViewModel", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "provideLoginRepository", "Lth/co/dtac/android/dtacone/repository/login/LoginRepository;", "rtrRepository", "oldRtrRepository", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "provideOtpV3Repository", "Lth/co/dtac/android/dtacone/repository/otp_v3/OtpV3Repository;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.RepositoryModule */
/* loaded from: classes7.dex */
public final class RepositoryModule {
    public static final int $stable = 0;

    @Provides
    @NotNull
    @PerActivity
    public final HomeRepository provideHomeRepository(@NotNull RTRApiRx2 api, @NotNull OneCampaignApi oneCampaignApi, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull TemporaryCache temporaryCache, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(oneCampaignApi, "oneCampaignApi");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        return new HomeRepository(api, oneCampaignApi, rtrRx2Repository, temporaryCache, pfViewModel);
    }

    @Provides
    @NotNull
    @PerActivity
    public final LoginRepository provideLoginRepository(@NotNull RTRApiRx2 api, @NotNull TemporaryCache temporaryCache, @NotNull RtrRx2Repository rtrRepository, @NotNull RtrRepository oldRtrRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        Intrinsics.checkNotNullParameter(rtrRepository, "rtrRepository");
        Intrinsics.checkNotNullParameter(oldRtrRepository, "oldRtrRepository");
        return new LoginRepository(api, temporaryCache, rtrRepository, oldRtrRepository);
    }

    @Provides
    @NotNull
    @PerActivity
    public final OtpV3Repository provideOtpV3Repository(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new OtpV3Repository(api);
    }
}
