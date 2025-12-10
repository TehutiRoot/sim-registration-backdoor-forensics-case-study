package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

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
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.retailer.RetailerBody;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.login_mrtr.RetailerViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R9\u0010!\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001d0\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 R5\u0010'\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001d0\u001c0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/login_mrtr/RetailerViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/login/LoginRepository;", "loginRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/login/LoginRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "", "rtrCode", "", "getRetailerProfile", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/login/LoginRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Triple;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_retailerProfileResponse", "Landroidx/lifecycle/LiveData;", OperatorName.NON_STROKING_GRAY, "Landroidx/lifecycle/LiveData;", "getRetailerProfileResponse", "()Landroidx/lifecycle/LiveData;", "retailerProfileResponse", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.RetailerViewModel */
/* loaded from: classes9.dex */
public final class RetailerViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final LoginRepository f106197b;

    /* renamed from: c */
    public final Rx2ThreadService f106198c;

    /* renamed from: d */
    public final MrtrErrorService f106199d;

    /* renamed from: e */
    public final CompositeDisposable f106200e;

    /* renamed from: f */
    public final Lazy f106201f;

    /* renamed from: g */
    public final LiveData f106202g;

    @Inject
    public RetailerViewModel(@NotNull LoginRepository loginRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f106197b = loginRepository;
        this.f106198c = threadService;
        this.f106199d = errorService;
        this.f106200e = new CompositeDisposable();
        this.f106201f = LazyKt__LazyJVMKt.lazy(RetailerViewModel$_retailerProfileResponse$2.INSTANCE);
        this.f106202g = m2429d();
    }

    /* renamed from: c */
    public static final void m2430c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final MutableLiveData m2429d() {
        return (MutableLiveData) this.f106201f.getValue();
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f106200e;
    }

    public final void getRetailerProfile(@NotNull String rtrCode) {
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Single<R> compose = this.f106197b.getRetailerProfile(new RetailerBody(rtrCode)).compose(this.f106198c.applySingleAsync());
        final RetailerViewModel$getRetailerProfile$1 retailerViewModel$getRetailerProfile$1 = new RetailerViewModel$getRetailerProfile$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Wy1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RetailerViewModel.m2430c(retailerViewModel$getRetailerProfile$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getRetailerProfile(r… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new RetailerViewModel$getRetailerProfile$2(this), new RetailerViewModel$getRetailerProfile$3(this, rtrCode)), this.f106200e);
    }

    @NotNull
    public final LiveData<Resource<Triple<String, String, String>>> getRetailerProfileResponse() {
        return this.f106202g;
    }
}