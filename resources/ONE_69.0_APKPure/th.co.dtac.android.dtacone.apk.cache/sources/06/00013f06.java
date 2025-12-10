package th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Single;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.OneSelectShopResponse;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.OneShopListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.request.OneSelectShopRequest;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.request.OneShopListRequest;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/sellerID/repository/OneShopListRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/repository/OneShopListRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/request/OneShopListRequest;", "request", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/OneShopListResponse;", "getPromoterRTRList", "(Lth/co/dtac/android/dtacone/view/appOne/sellerID/request/OneShopListRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/request/OneSelectShopRequest;", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/OneSelectShopResponse;", "selectShop", "(Lth/co/dtac/android/dtacone/view/appOne/sellerID/request/OneSelectShopRequest;)Lio/reactivex/Single;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneShopListRepositoryImpl implements OneShopListRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f97151a;

    @Inject
    public OneShopListRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f97151a = api;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepository
    @NotNull
    public Single<OneShopListResponse> getPromoterRTRList(@NotNull OneShopListRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97151a.getPromoterRTRList(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepository
    @NotNull
    public Single<OneSelectShopResponse> selectShop(@NotNull OneSelectShopRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97151a.selectPromoterRTR(request);
    }
}