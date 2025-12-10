package th.p047co.dtac.android.dtacone.app_one.presenter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvGroupCollection;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.stv.PackageKey;
import th.p047co.dtac.android.dtacone.util.Pair;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010Ja\u0010\u0019\u001a\u0004\u0018\u00010\u00132&\u0010\u0017\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u00112&\u0010\u0018\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OneStvPhoenixListPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "threadService", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/RxThreadService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupCollection;", "group", "calculateStvMatrix", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupCollection;)V", "onStop", "()V", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "pkg1", "pkg2", "u", "(Lth/co/dtac/android/dtacone/util/Pair;Lth/co/dtac/android/dtacone/util/Pair;)Ljava/lang/Integer;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;)Ljava/lang/Integer;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "Lth/co/dtac/android/dtacone/app_one/presenter/OneStvPhoenixListPresenter$View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/presenter/OneStvPhoenixListPresenter$View;", "Lrx/subscriptions/CompositeSubscription;", OperatorName.CURVE_TO, "Lrx/subscriptions/CompositeSubscription;", "subscriptions", "View", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneStvPhoenixListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStvPhoenixListPresenter.kt\nth/co/dtac/android/dtacone/app_one/presenter/OneStvPhoenixListPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter */
/* loaded from: classes7.dex */
public final class OneStvPhoenixListPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RxThreadService f82342a;

    /* renamed from: b */
    public View f82343b;

    /* renamed from: c */
    public final CompositeSubscription f82344c;

    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002JP\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00062,\u0010\n\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\f0\u000bH&¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OneStvPhoenixListPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "render", "", "columnHeader", "", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "pkgMatrix", "", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$View */
    /* loaded from: classes7.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void render(@NotNull List<? extends PackageKey<Integer, String>> list, @NotNull List<Pair<PackageKey<Integer, String>, List<OneStvPackageCollection>>> list2);
    }

    @Inject
    public OneStvPhoenixListPresenter(@NotNull RxThreadService threadService) {
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        this.f82342a = threadService;
        this.f82344c = new CompositeSubscription();
    }

    /* renamed from: a */
    public static /* synthetic */ Integer m20116a(Function2 function2, Object obj, Object obj2) {
        return m20101p(function2, obj, obj2);
    }

    /* renamed from: b */
    public static /* synthetic */ Integer m20115b(Function2 function2, Object obj, Object obj2) {
        return m20105l(function2, obj, obj2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20114c(Function1 function1, Object obj) {
        m20097t(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ PackageKey m20112e(Function1 function1, Object obj) {
        return m20106k(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ Integer m20111f(Function2 function2, Object obj, Object obj2) {
        return m20099r(function2, obj, obj2);
    }

    /* renamed from: g */
    public static /* synthetic */ PackageKey m20110g(Function1 function1, Object obj) {
        return m20102o(function1, obj);
    }

    /* renamed from: h */
    public static /* synthetic */ void m20109h(Throwable th2) {
        m20104m(th2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m20108i(OneStvPhoenixListPresenter oneStvPhoenixListPresenter) {
        m20098s(oneStvPhoenixListPresenter);
    }

    /* renamed from: j */
    public static /* synthetic */ OneStvPackageCollection m20107j(Function1 function1, Object obj) {
        return m20103n(function1, obj);
    }

    /* renamed from: k */
    public static final PackageKey m20106k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PackageKey) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final Integer m20105l(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj, obj2);
    }

    /* renamed from: m */
    public static final void m20104m(Throwable th2) {
        th2.getMessage();
    }

    /* renamed from: n */
    public static final OneStvPackageCollection m20103n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OneStvPackageCollection) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final PackageKey m20102o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PackageKey) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final Integer m20101p(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj, obj2);
    }

    /* renamed from: q */
    public static final Observable m20100q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final Integer m20099r(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj, obj2);
    }

    /* renamed from: s */
    public static final void m20098s(OneStvPhoenixListPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f82343b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: t */
    public static final void m20097t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@NotNull IPresenter.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f82343b = (View) view;
    }

    public final void calculateStvMatrix(@NotNull OneStvGroupCollection group) {
        Intrinsics.checkNotNullParameter(group, "group");
        View view = this.f82343b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        Observable from = Observable.from(group.getPackages());
        final OneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$1 oneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$1 = OneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$1.INSTANCE;
        Observable distinct = from.map(new Func1() { // from class: qd1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return OneStvPhoenixListPresenter.m20112e(oneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$1, obj);
            }
        }).distinct();
        final OneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$2 oneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$2 = new OneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$2(this);
        List list = (List) distinct.toSortedList(new Func2() { // from class: rd1
            @Override // p046rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return OneStvPhoenixListPresenter.m20115b(oneStvPhoenixListPresenter$calculateStvMatrix$columnHeader$2, obj, obj2);
            }
        }).toBlocking().single();
        CompositeSubscription compositeSubscription = this.f82344c;
        Observable from2 = Observable.from(group.getPackages());
        final OneStvPhoenixListPresenter$calculateStvMatrix$1 oneStvPhoenixListPresenter$calculateStvMatrix$1 = OneStvPhoenixListPresenter$calculateStvMatrix$1.INSTANCE;
        Observable map = from2.map(new Func1() { // from class: sd1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return OneStvPhoenixListPresenter.m20107j(Function1.this, obj);
            }
        });
        final OneStvPhoenixListPresenter$calculateStvMatrix$2 oneStvPhoenixListPresenter$calculateStvMatrix$2 = OneStvPhoenixListPresenter$calculateStvMatrix$2.INSTANCE;
        Observable groupBy = map.groupBy(new Func1() { // from class: td1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return OneStvPhoenixListPresenter.m20110g(oneStvPhoenixListPresenter$calculateStvMatrix$2, obj);
            }
        });
        final OneStvPhoenixListPresenter$calculateStvMatrix$3 oneStvPhoenixListPresenter$calculateStvMatrix$3 = new OneStvPhoenixListPresenter$calculateStvMatrix$3(this);
        Observable sorted = groupBy.sorted(new Func2() { // from class: ud1
            @Override // p046rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return OneStvPhoenixListPresenter.m20116a(oneStvPhoenixListPresenter$calculateStvMatrix$3, obj, obj2);
            }
        });
        final OneStvPhoenixListPresenter$calculateStvMatrix$4 oneStvPhoenixListPresenter$calculateStvMatrix$4 = new OneStvPhoenixListPresenter$calculateStvMatrix$4(list);
        Observable flatMap = sorted.flatMap(new Func1() { // from class: vd1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m20100q;
                m20100q = OneStvPhoenixListPresenter.m20100q(Function1.this, obj);
                return m20100q;
            }
        });
        final OneStvPhoenixListPresenter$calculateStvMatrix$5 oneStvPhoenixListPresenter$calculateStvMatrix$5 = new OneStvPhoenixListPresenter$calculateStvMatrix$5(this);
        Observable doOnTerminate = flatMap.toSortedList(new Func2() { // from class: wd1
            @Override // p046rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return OneStvPhoenixListPresenter.m20111f(oneStvPhoenixListPresenter$calculateStvMatrix$5, obj, obj2);
            }
        }).compose(this.f82342a.applyComputation()).compose(this.f82342a.applyMain()).doOnTerminate(new Action0() { // from class: xd1
            {
                OneStvPhoenixListPresenter.this = this;
            }

            @Override // p046rx.functions.Action0
            public final void call() {
                OneStvPhoenixListPresenter.m20108i(OneStvPhoenixListPresenter.this);
            }
        });
        final OneStvPhoenixListPresenter$calculateStvMatrix$7 oneStvPhoenixListPresenter$calculateStvMatrix$7 = new OneStvPhoenixListPresenter$calculateStvMatrix$7(this, list);
        compositeSubscription.add(doOnTerminate.subscribe(new Action1() { // from class: yd1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneStvPhoenixListPresenter.m20114c(oneStvPhoenixListPresenter$calculateStvMatrix$7, obj);
            }
        }, new Action1() { // from class: zd1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                OneStvPhoenixListPresenter.m20109h((Throwable) obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f82344c.clear();
    }

    /* renamed from: u */
    public final Integer m20096u(Pair pair, Pair pair2) {
        int i;
        int i2;
        Integer num;
        Integer num2;
        Iterator it = ((List) pair.getSecond()).iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
                OneStvPackageCollection oneStvPackageCollection = (OneStvPackageCollection) it.next();
                if (oneStvPackageCollection != null) {
                    num2 = oneStvPackageCollection.getUomOrder();
                    continue;
                } else {
                    num2 = null;
                    continue;
                }
                if (num2 != null) {
                    Integer uomOrder = oneStvPackageCollection.getUomOrder();
                    Intrinsics.checkNotNull(uomOrder);
                    i2 = uomOrder.intValue();
                    break;
                }
            } else {
                i2 = 0;
                break;
            }
        }
        Iterator it2 = ((List) pair2.getSecond()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            OneStvPackageCollection oneStvPackageCollection2 = (OneStvPackageCollection) it2.next();
            if (oneStvPackageCollection2 != null) {
                num = oneStvPackageCollection2.getUomOrder();
                continue;
            } else {
                num = null;
                continue;
            }
            if (num != null) {
                Integer uomOrder2 = oneStvPackageCollection2.getUomOrder();
                Intrinsics.checkNotNull(uomOrder2);
                i = uomOrder2.intValue();
                break;
            }
        }
        return Integer.valueOf(Intrinsics.compare(i2, i));
    }

    /* renamed from: v */
    public final Integer m20095v(PackageKey packageKey, PackageKey packageKey2) {
        Object unit = packageKey2.getUnit();
        Intrinsics.checkNotNullExpressionValue(unit, "pkg2.unit");
        int compareTo = ((String) packageKey.getUnit()).compareTo((String) unit);
        if (compareTo == 0) {
            int intValue = ((Number) packageKey.getValue()).intValue();
            Object value = packageKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "pkg2.value");
            return Integer.valueOf(Intrinsics.compare(intValue, ((Number) value).intValue()));
        }
        return Integer.valueOf(compareTo);
    }
}
