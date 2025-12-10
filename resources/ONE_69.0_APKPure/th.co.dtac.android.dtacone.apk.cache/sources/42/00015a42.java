package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrRequest;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_reregist/GetAuthorizationByRTRViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_reregist/MrtrPrepaidReregistRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "<init>", "(Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_reregist/MrtrPrepaidReregistRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;)V", "", "getAuthorizationByRTR", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_reregist/MrtrPrepaidReregistRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "Lio/reactivex/disposables/CompositeDisposable;", "d", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.GetAuthorizationByRTRViewModel */
/* loaded from: classes9.dex */
public final class GetAuthorizationByRTRViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final MrtrPrepaidReregistRepository f106829b;

    /* renamed from: c */
    public final Rx2ThreadService f106830c;

    /* renamed from: d */
    public final CompositeDisposable f106831d;

    public GetAuthorizationByRTRViewModel(@NotNull MrtrPrepaidReregistRepository repository, @NotNull Rx2ThreadService threadService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        this.f106829b = repository;
        this.f106830c = threadService;
        this.f106831d = new CompositeDisposable();
    }

    public final void getAuthorizationByRTR() {
        Single<R> compose = this.f106829b.getAuthorizationByRTR(new GetAuthorizationByRtrRequest(PermissionConstant.M_CHNG_OWNR_PRE, this.f106829b.getRetailerNumber())).compose(this.f106830c.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "repository.getAuthorizat…rvice.applySingleAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new GetAuthorizationByRTRViewModel$getAuthorizationByRTR$1(this), new GetAuthorizationByRTRViewModel$getAuthorizationByRTR$2(this)), this.f106831d);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f106831d;
    }
}