package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.consent.ConsentResponse;
import th.p047co.dtac.android.dtacone.model.consent.SaveConsentRequest;
import th.p047co.dtac.android.dtacone.model.self_update.RtrProfileDistrict;
import th.p047co.dtac.android.dtacone.model.self_update.RtrProfileProvince;
import th.p047co.dtac.android.dtacone.model.self_update.RtrProfileSubdistrictResponse;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.request.OneRetailerProfileUpdateAddressRequest;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.request.OneRetailerProfileUpdateProfileInfoRequest;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateAddressResponse;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00130\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001c\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u0011j\b\u0012\u0004\u0012\u00020\u001b`\u00130\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u001e\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/repository/OneRetailerProfileUpdateRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/repository/OneRetailerProfileUpdateRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateResponse;", "getOneRetailerProfile", "()Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/consent/ConsentResponse;", "getRetailerProfileConsent", "Lth/co/dtac/android/dtacone/model/consent/SaveConsentRequest;", "consent", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "acceptRetailerProfileConsent", "(Lth/co/dtac/android/dtacone/model/consent/SaveConsentRequest;)Lio/reactivex/Observable;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileProvince;", "Lkotlin/collections/ArrayList;", "getOneRetailerProfileProvince", "", "districtId", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileSubdistrictResponse;", "getOneRetailerProfileSubDistrict", "(J)Lio/reactivex/Observable;", "provinceId", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileDistrict;", "getOneRetailerProfileDistrict", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/request/OneRetailerProfileUpdateAddressRequest;", "request", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateAddressResponse;", "updateOneRetailerShopAddress", "(Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/request/OneRetailerProfileUpdateAddressRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/request/OneRetailerProfileUpdateProfileInfoRequest;", "updateOneRetailerProfile", "(Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/request/OneRetailerProfileUpdateProfileInfoRequest;)Lio/reactivex/Observable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateRepositoryImpl implements OneRetailerProfileUpdateRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f96992a;

    @Inject
    public OneRetailerProfileUpdateRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f96992a = api;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<StatusResponse> acceptRetailerProfileConsent(@NotNull SaveConsentRequest consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        return this.f96992a.acceptRetailerProfileConsent(consent);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<OneRetailerProfileUpdateResponse> getOneRetailerProfile() {
        return this.f96992a.getOneRetailerProfile();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<ArrayList<RtrProfileDistrict>> getOneRetailerProfileDistrict(long j) {
        return this.f96992a.getOneRetailerProfileDistrict(j);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<ArrayList<RtrProfileProvince>> getOneRetailerProfileProvince() {
        return this.f96992a.getOneRetailerProfileProvince();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<RtrProfileSubdistrictResponse> getOneRetailerProfileSubDistrict(long j) {
        return this.f96992a.getOneRetailerProfileSubDistrict(j);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<ConsentResponse> getRetailerProfileConsent() {
        return this.f96992a.getRetailerProfileConsent();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<StatusResponse> updateOneRetailerProfile(@NotNull OneRetailerProfileUpdateProfileInfoRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f96992a.updateOneRetailerProfile(request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository
    @NotNull
    public Observable<OneRetailerProfileUpdateAddressResponse> updateOneRetailerShopAddress(@NotNull OneRetailerProfileUpdateAddressRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f96992a.updateOneRetailerShopAddress(request);
    }
}