package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DeviceContractResponse;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.DeviceSummaryViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0011\u0010\u001dR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/customerenquiry/DeviceSummaryViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/customer_enquiry/CustomerEnquiryRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "schedulerProvider", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/customer_enquiry/CustomerEnquiryRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "", "callDeviceSummary", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/customer_enquiry/CustomerEnquiryRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lkotlin/Lazy;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceContractResponse;", OperatorName.FILL_NON_ZERO, "()Landroidx/lifecycle/MutableLiveData;", "_deviceContractResponseLiveData", "Landroidx/lifecycle/LiveData;", OperatorName.NON_STROKING_GRAY, "Landroidx/lifecycle/LiveData;", "getDeviceContractResponseLiveData", "()Landroidx/lifecycle/LiveData;", "deviceContractResponseLiveData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.DeviceSummaryViewModel */
/* loaded from: classes9.dex */
public final class DeviceSummaryViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final CustomerEnquiryRepository f105265b;

    /* renamed from: c */
    public final Rx2ThreadService f105266c;

    /* renamed from: d */
    public final MrtrErrorService f105267d;

    /* renamed from: e */
    public final Lazy f105268e;

    /* renamed from: f */
    public final Lazy f105269f;

    /* renamed from: g */
    public final LiveData f105270g;

    @Inject
    public DeviceSummaryViewModel(@NotNull CustomerEnquiryRepository repository, @NotNull Rx2ThreadService schedulerProvider, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f105265b = repository;
        this.f105266c = schedulerProvider;
        this.f105267d = errorService;
        this.f105268e = LazyKt__LazyJVMKt.lazy(DeviceSummaryViewModel$disposable$2.INSTANCE);
        this.f105269f = LazyKt__LazyJVMKt.lazy(DeviceSummaryViewModel$_deviceContractResponseLiveData$2.INSTANCE);
        this.f105270g = m3240d();
    }

    /* renamed from: c */
    public static final void m3241c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final CompositeDisposable getDisposable() {
        return (CompositeDisposable) this.f105268e.getValue();
    }

    public final void callDeviceSummary() {
        Single<R> compose = this.f105265b.mrtrCustomerenquiryDeviceSummary().compose(this.f105266c.applySingleAsync());
        final DeviceSummaryViewModel$callDeviceSummary$1 deviceSummaryViewModel$callDeviceSummary$1 = new DeviceSummaryViewModel$callDeviceSummary$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: PI
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceSummaryViewModel.m3241c(deviceSummaryViewModel$callDeviceSummary$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callDeviceSummary() … .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSummaryViewModel$callDeviceSummary$2(this), new DeviceSummaryViewModel$callDeviceSummary$3(this)), getDisposable());
    }

    /* renamed from: d */
    public final MutableLiveData m3240d() {
        return (MutableLiveData) this.f105269f.getValue();
    }

    @NotNull
    public final LiveData<Resource<DeviceContractResponse>> getDeviceContractResponseLiveData() {
        return this.f105270g;
    }
}