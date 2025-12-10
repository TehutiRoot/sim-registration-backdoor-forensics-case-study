package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/viewmodel/stv/OneStvProsermOnlineViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "udidService", "Lth/co/dtac/android/dtacone/repository/home/HomeRepository;", "homeRepository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "<init>", "(Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/manager/service/UdidService;Lth/co/dtac/android/dtacone/repository/home/HomeRepository;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "d", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "e", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/service/UdidService;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/repository/home/HomeRepository;", "i", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModelFactory */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    /* renamed from: a */
    public final OneStvRepository f82719a;

    /* renamed from: b */
    public final Rx2ThreadService f82720b;

    /* renamed from: c */
    public final OneErrorService f82721c;

    /* renamed from: d */
    public final ConfigurationRepository f82722d;

    /* renamed from: e */
    public PreferencesViewModel f82723e;

    /* renamed from: f */
    public final ServerErrorService f82724f;

    /* renamed from: g */
    public final UdidService f82725g;

    /* renamed from: h */
    public final HomeRepository f82726h;

    /* renamed from: i */
    public final RtrRx2Repository f82727i;

    @Inject
    public OneStvProsermOnlineViewModelFactory(@NotNull OneStvRepository repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService oneErrorService, @NotNull ConfigurationRepository configurationRepository, @NotNull PreferencesViewModel pfViewModel, @NotNull ServerErrorService errorService, @NotNull UdidService udidService, @NotNull HomeRepository homeRepository, @NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        Intrinsics.checkNotNullParameter(homeRepository, "homeRepository");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        this.f82719a = repository;
        this.f82720b = threadService;
        this.f82721c = oneErrorService;
        this.f82722d = configurationRepository;
        this.f82723e = pfViewModel;
        this.f82724f = errorService;
        this.f82725g = udidService;
        this.f82726h = homeRepository;
        this.f82727i = rtrRx2Repository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return U22.m66144b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(OneStvProsermOnlineViewModel.class)) {
            return new OneStvProsermOnlineViewModel(this.f82719a, this.f82720b, this.f82721c, this.f82722d, this.f82723e, this.f82724f, this.f82725g, this.f82726h, this.f82727i);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
