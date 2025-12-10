package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.schedulers.Schedulers;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneTabPackage;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneTabs;
import th.p047co.dtac.android.dtacone.presenter.IViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackageSetViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\"¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSalePackageSetViewModel;", "Lth/co/dtac/android/dtacone/presenter/IViewModel;", "Landroidx/lifecycle/ViewModel;", "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "threadService", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/RxThreadService;)V", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "postpaidPackageApi", "getOnePackageSet", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;)V", "onCleared", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSalePackageSetViewModel$View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSalePackageSetViewModel$View;", "Lrx/subscriptions/CompositeSubscription;", OperatorName.CURVE_TO, "Lkotlin/Lazy;", "p", "()Lrx/subscriptions/CompositeSubscription;", "subscription", "Landroidx/lifecycle/MutableLiveData;", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneTabPackage;", "d", "getViewModelTabPackage", "()Landroidx/lifecycle/MutableLiveData;", "viewModelTabPackage", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackageSetViewModel */
/* loaded from: classes10.dex */
public final class OneDeviceSalePackageSetViewModel extends ViewModel implements IViewModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RxThreadService f90586a;

    /* renamed from: b */
    public View f90587b;

    /* renamed from: c */
    public final Lazy f90588c;

    /* renamed from: d */
    public final Lazy f90589d;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSalePackageSetViewModel$View;", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", "onRenderComplete", "", "onRenderError", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackageSetViewModel$View */
    /* loaded from: classes10.dex */
    public interface View extends IViewModel.IView {
        void onRenderComplete();

        void onRenderError();
    }

    @Inject
    public OneDeviceSalePackageSetViewModel(@NotNull RxThreadService threadService) {
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        this.f90586a = threadService;
        this.f90588c = LazyKt__LazyJVMKt.lazy(OneDeviceSalePackageSetViewModel$subscription$2.INSTANCE);
        this.f90589d = LazyKt__LazyJVMKt.lazy(OneDeviceSalePackageSetViewModel$viewModelTabPackage$2.INSTANCE);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m14467b(Function1 function1, Object obj) {
        return m14460i(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ OneTabPackage m14466c(Function2 function2, Object obj, Object obj2) {
        return m14457l(function2, obj, obj2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m14465d(OneDeviceSalePackageSetViewModel oneDeviceSalePackageSetViewModel) {
        m14454o(oneDeviceSalePackageSetViewModel);
    }

    /* renamed from: e */
    public static /* synthetic */ Observable m14464e(Function1 function1, Object obj) {
        return m14458k(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ Observable m14463f(Function1 function1, Object obj) {
        return m14459j(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m14462g(OneDeviceSalePackageSetViewModel oneDeviceSalePackageSetViewModel, Throwable th2) {
        m14455n(oneDeviceSalePackageSetViewModel, th2);
    }

    /* renamed from: h */
    public static /* synthetic */ void m14461h(Function1 function1, Object obj) {
        m14456m(function1, obj);
    }

    /* renamed from: i */
    public static final Observable m14460i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final Observable m14459j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final Observable m14458k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final OneTabPackage m14457l(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OneTabPackage) tmp0.invoke(obj, obj2);
    }

    /* renamed from: m */
    public static final void m14456m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m14455n(OneDeviceSalePackageSetViewModel this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f90587b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onRenderError();
    }

    /* renamed from: o */
    public static final void m14454o(OneDeviceSalePackageSetViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f90587b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onRenderComplete();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IViewModel
    public void attachView(@NotNull IViewModel.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f90587b = (View) view;
    }

    public final void getOnePackageSet(@Nullable OnePostpaidPackageSetResponse onePostpaidPackageSetResponse) {
        List<OneTabs> list;
        View view = null;
        if (onePostpaidPackageSetResponse != null) {
            list = onePostpaidPackageSetResponse.getTabs();
        } else {
            list = null;
        }
        if (list == null) {
            View view2 = this.f90587b;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view = view2;
            }
            view.onRenderError();
            return;
        }
        Observable subscribeOn = Observable.just(onePostpaidPackageSetResponse).subscribeOn(Schedulers.m22943io());
        final OneDeviceSalePackageSetViewModel$getOnePackageSet$tabObs$1 oneDeviceSalePackageSetViewModel$getOnePackageSet$tabObs$1 = OneDeviceSalePackageSetViewModel$getOnePackageSet$tabObs$1.INSTANCE;
        Observable list2 = subscribeOn.flatMap(new Func1() { // from class: PP0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return OneDeviceSalePackageSetViewModel.m14467b(Function1.this, obj);
            }
        }).toList();
        final OneDeviceSalePackageSetViewModel$getOnePackageSet$tabObs$2 oneDeviceSalePackageSetViewModel$getOnePackageSet$tabObs$2 = OneDeviceSalePackageSetViewModel$getOnePackageSet$tabObs$2.INSTANCE;
        Observable autoConnect = list2.flatMap(new Func1() { // from class: QP0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return OneDeviceSalePackageSetViewModel.m14463f(Function1.this, obj);
            }
        }).publish().autoConnect(1);
        final OneDeviceSalePackageSetViewModel$getOnePackageSet$packageObs$1 oneDeviceSalePackageSetViewModel$getOnePackageSet$packageObs$1 = OneDeviceSalePackageSetViewModel$getOnePackageSet$packageObs$1.INSTANCE;
        Observable concatMap = autoConnect.concatMap(new Func1() { // from class: RP0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return OneDeviceSalePackageSetViewModel.m14464e(Function1.this, obj);
            }
        });
        CompositeSubscription m14453p = m14453p();
        final OneDeviceSalePackageSetViewModel$getOnePackageSet$1 oneDeviceSalePackageSetViewModel$getOnePackageSet$1 = OneDeviceSalePackageSetViewModel$getOnePackageSet$1.INSTANCE;
        Observable compose = Observable.zip(autoConnect, concatMap, new Func2() { // from class: SP0
            @Override // p046rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return OneDeviceSalePackageSetViewModel.m14466c(Function2.this, obj, obj2);
            }
        }).toList().compose(this.f90586a.applyAsync());
        final OneDeviceSalePackageSetViewModel$getOnePackageSet$2 oneDeviceSalePackageSetViewModel$getOnePackageSet$2 = new OneDeviceSalePackageSetViewModel$getOnePackageSet$2(this);
        m14453p.add(compose.subscribe(new Action1() { // from class: TP0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneDeviceSalePackageSetViewModel.m14461h(Function1.this, obj);
            }
        }, new Action1() { // from class: UP0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneDeviceSalePackageSetViewModel.m14462g(OneDeviceSalePackageSetViewModel.this, (Throwable) obj);
            }
        }, new Action0() { // from class: VP0
            @Override // p046rx.functions.Action0
            public final void call() {
                OneDeviceSalePackageSetViewModel.m14465d(OneDeviceSalePackageSetViewModel.this);
            }
        }));
    }

    @NotNull
    public final MutableLiveData<List<OneTabPackage>> getViewModelTabPackage() {
        return (MutableLiveData) this.f90589d.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        m14453p().clear();
    }

    /* renamed from: p */
    public final CompositeSubscription m14453p() {
        return (CompositeSubscription) this.f90588c.getValue();
    }
}