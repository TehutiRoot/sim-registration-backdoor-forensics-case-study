package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.request.OneOwnerListRequest;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerDataResponse;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerTransactionResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/repository/OneOwnerManagementRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/repository/OneOwnerManagementRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/request/OneOwnerListRequest;", "oneOwnerListRequest", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerDataResponse;", "getOneOwnerList", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/request/OneOwnerListRequest;)Lio/reactivex/Observable;", "", "mrtrUserId", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionResponse;", "getOneOwnerDetail", "(I)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "deleteOneOwner", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneOwnerManagementRepositoryImpl implements OneOwnerManagementRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f93151a;

    @Inject
    public OneOwnerManagementRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f93151a = api;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepository
    @NotNull
    public Observable<StatusResponse> deleteOneOwner(int i) {
        return this.f93151a.deleteOneOwner(i);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepository
    @NotNull
    public Observable<OneOwnerTransactionResponse> getOneOwnerDetail(int i) {
        return this.f93151a.getOneOwnerDetail(i);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepository
    @NotNull
    public Observable<OneOwnerDataResponse> getOneOwnerList(@NotNull OneOwnerListRequest oneOwnerListRequest) {
        Intrinsics.checkNotNullParameter(oneOwnerListRequest, "oneOwnerListRequest");
        return this.f93151a.getOneOwnerList(oneOwnerListRequest);
    }
}