package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.squareup.sqlbrite.BriteDatabase;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneAddressViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R-\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R)\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R-\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u00105R)\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/078\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R-\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00103\u001a\u0004\bD\u00105R)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/078\u0006¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010;R-\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\bJ\u00105R)\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/078\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bM\u0010;R'\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0/0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\bQ\u00105R#\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0/078\u0006¢\u0006\f\n\u0004\bS\u00109\u001a\u0004\bT\u0010;¨\u0006V"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/viewModel/OneAddressViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/repository/OneRetailerProfileUpdateRepository;", "repository", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "rtrRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "Lth/co/dtac/android/dtacone/manager/locale/LanguageService;", "languageService", "Lcom/squareup/sqlbrite/BriteDatabase;", "database", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/repository/OneRetailerProfileUpdateRepository;Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/manager/locale/LanguageService;Lcom/squareup/sqlbrite/BriteDatabase;)V", "", "getProvinceFromEdms", "()V", "", "provinceId", "getDistrictFromEdms", "(J)V", "districtId", "getSubDistrictFromEdms", "getPostcodeFromEdms", "filterPostcodeFromEdms", "onCleared", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/repository/OneRetailerProfileUpdateRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/locale/LanguageService;", OperatorName.NON_STROKING_GRAY, "Lcom/squareup/sqlbrite/BriteDatabase;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_PATH, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "i", "Lkotlin/Lazy;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()Landroidx/lifecycle/MutableLiveData;", "_provinceLiveData", "Landroidx/lifecycle/LiveData;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/lifecycle/LiveData;", "getProvinceLiveData", "()Landroidx/lifecycle/LiveData;", "provinceLiveData", OperatorName.NON_STROKING_CMYK, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "_districtLiveData", OperatorName.LINE_TO, "getDistrictLiveData", "districtLiveData", OperatorName.MOVE_TO, "z", "_subDistrictLivedata", OperatorName.ENDPATH, "getSubDistrictLivedata", "subDistrictLivedata", "o", "x", "_postCodeLiveData", "p", "getPostCodeLiveData", "postCodeLiveData", "", OperatorName.SAVE, OperatorName.SET_LINE_WIDTH, "_filterPostCodeLivedata", PDPageLabelRange.STYLE_ROMAN_LOWER, "getFilterPostCodeLivedata", "filterPostCodeLivedata", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneAddressViewModel */
/* loaded from: classes10.dex */
public final class OneAddressViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneRetailerProfileUpdateRepository f96994b;

    /* renamed from: c */
    public final RtrRepository f96995c;

    /* renamed from: d */
    public final Rx2ThreadService f96996d;

    /* renamed from: e */
    public final OneErrorService f96997e;

    /* renamed from: f */
    public final LanguageService f96998f;

    /* renamed from: g */
    public final BriteDatabase f96999g;

    /* renamed from: h */
    public final CompositeDisposable f97000h;

    /* renamed from: i */
    public final Lazy f97001i;

    /* renamed from: j */
    public final LiveData f97002j;

    /* renamed from: k */
    public final Lazy f97003k;

    /* renamed from: l */
    public final LiveData f97004l;

    /* renamed from: m */
    public final Lazy f97005m;

    /* renamed from: n */
    public final LiveData f97006n;

    /* renamed from: o */
    public final Lazy f97007o;

    /* renamed from: p */
    public final LiveData f97008p;

    /* renamed from: q */
    public final Lazy f97009q;

    /* renamed from: r */
    public final LiveData f97010r;

    @Inject
    public OneAddressViewModel(@NotNull OneRetailerProfileUpdateRepository repository, @NotNull RtrRepository rtrRepository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService oneErrorService, @NotNull LanguageService languageService, @Named("location.sqlite") @NotNull BriteDatabase database) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(rtrRepository, "rtrRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        Intrinsics.checkNotNullParameter(languageService, "languageService");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f96994b = repository;
        this.f96995c = rtrRepository;
        this.f96996d = threadService;
        this.f96997e = oneErrorService;
        this.f96998f = languageService;
        this.f96999g = database;
        this.f97000h = new CompositeDisposable();
        this.f97001i = LazyKt__LazyJVMKt.lazy(OneAddressViewModel$_provinceLiveData$2.INSTANCE);
        this.f97002j = m10078y();
        this.f97003k = LazyKt__LazyJVMKt.lazy(OneAddressViewModel$_districtLiveData$2.INSTANCE);
        this.f97004l = m10081v();
        this.f97005m = LazyKt__LazyJVMKt.lazy(OneAddressViewModel$_subDistrictLivedata$2.INSTANCE);
        this.f97006n = m10077z();
        this.f97007o = LazyKt__LazyJVMKt.lazy(OneAddressViewModel$_postCodeLiveData$2.INSTANCE);
        this.f97008p = m10079x();
        this.f97009q = LazyKt__LazyJVMKt.lazy(OneAddressViewModel$_filterPostCodeLivedata$2.INSTANCE);
        this.f97010r = m10080w();
    }

    /* renamed from: l */
    public static final void m10091l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final List m10090m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m10089n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final List m10088o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m10087p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final List m10086q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m10085r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final List m10084s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m10083t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final List m10082u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    public final void filterPostcodeFromEdms(long j) {
        Observable<R> compose = this.f96994b.getOneRetailerProfileSubDistrict(j).compose(this.f96996d.applyAsync());
        final OneAddressViewModel$filterPostcodeFromEdms$1 oneAddressViewModel$filterPostcodeFromEdms$1 = new OneAddressViewModel$filterPostcodeFromEdms$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: VK0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneAddressViewModel.m10091l(oneAddressViewModel$filterPostcodeFromEdms$1, obj);
            }
        });
        final OneAddressViewModel$filterPostcodeFromEdms$2 oneAddressViewModel$filterPostcodeFromEdms$2 = OneAddressViewModel$filterPostcodeFromEdms$2.INSTANCE;
        Observable map = doOnSubscribe.map(new Function() { // from class: WK0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m10090m;
                m10090m = OneAddressViewModel.m10090m(oneAddressViewModel$filterPostcodeFromEdms$2, obj);
                return m10090m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun filterPostcodeFromEd…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(map, new OneAddressViewModel$filterPostcodeFromEdms$3(this), (Function0) null, new OneAddressViewModel$filterPostcodeFromEdms$4(this), 2, (Object) null), this.f97000h);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f97000h;
    }

    public final void getDistrictFromEdms(long j) {
        Observable<R> compose = this.f96994b.getOneRetailerProfileDistrict(j).compose(this.f96996d.applyAsync());
        final OneAddressViewModel$getDistrictFromEdms$1 oneAddressViewModel$getDistrictFromEdms$1 = new OneAddressViewModel$getDistrictFromEdms$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: TK0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneAddressViewModel.m10089n(oneAddressViewModel$getDistrictFromEdms$1, obj);
            }
        });
        final OneAddressViewModel$getDistrictFromEdms$2 oneAddressViewModel$getDistrictFromEdms$2 = OneAddressViewModel$getDistrictFromEdms$2.INSTANCE;
        Observable map = doOnSubscribe.map(new Function() { // from class: UK0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m10088o;
                m10088o = OneAddressViewModel.m10088o(oneAddressViewModel$getDistrictFromEdms$2, obj);
                return m10088o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun getDistrictFromEdms(…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(map, new OneAddressViewModel$getDistrictFromEdms$3(this), (Function0) null, new OneAddressViewModel$getDistrictFromEdms$4(this), 2, (Object) null), this.f97000h);
    }

    @NotNull
    public final LiveData<Resource<List<AddressItemData>>> getDistrictLiveData() {
        return this.f97004l;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getFilterPostCodeLivedata() {
        return this.f97010r;
    }

    @NotNull
    public final LiveData<Resource<List<AddressItemData>>> getPostCodeLiveData() {
        return this.f97008p;
    }

    public final void getPostcodeFromEdms(long j) {
        Observable<R> compose = this.f96994b.getOneRetailerProfileSubDistrict(j).compose(this.f96996d.applyAsync());
        final OneAddressViewModel$getPostcodeFromEdms$1 oneAddressViewModel$getPostcodeFromEdms$1 = new OneAddressViewModel$getPostcodeFromEdms$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: XK0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneAddressViewModel.m10087p(oneAddressViewModel$getPostcodeFromEdms$1, obj);
            }
        });
        final OneAddressViewModel$getPostcodeFromEdms$2 oneAddressViewModel$getPostcodeFromEdms$2 = OneAddressViewModel$getPostcodeFromEdms$2.INSTANCE;
        Observable map = doOnSubscribe.map(new Function() { // from class: YK0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m10086q;
                m10086q = OneAddressViewModel.m10086q(oneAddressViewModel$getPostcodeFromEdms$2, obj);
                return m10086q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun getPostcodeFromEdms(…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(map, new OneAddressViewModel$getPostcodeFromEdms$3(this), (Function0) null, new OneAddressViewModel$getPostcodeFromEdms$4(this), 2, (Object) null), this.f97000h);
    }

    public final void getProvinceFromEdms() {
        Observable<R> compose = this.f96994b.getOneRetailerProfileProvince().compose(this.f96996d.applyAsync());
        final OneAddressViewModel$getProvinceFromEdms$1 oneAddressViewModel$getProvinceFromEdms$1 = new OneAddressViewModel$getProvinceFromEdms$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: ZK0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneAddressViewModel.m10085r(oneAddressViewModel$getProvinceFromEdms$1, obj);
            }
        });
        final OneAddressViewModel$getProvinceFromEdms$2 oneAddressViewModel$getProvinceFromEdms$2 = OneAddressViewModel$getProvinceFromEdms$2.INSTANCE;
        Observable map = doOnSubscribe.map(new Function() { // from class: aL0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m10084s;
                m10084s = OneAddressViewModel.m10084s(oneAddressViewModel$getProvinceFromEdms$2, obj);
                return m10084s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun getProvinceFromEdms(…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(map, new OneAddressViewModel$getProvinceFromEdms$3(this), (Function0) null, new OneAddressViewModel$getProvinceFromEdms$4(this), 2, (Object) null), this.f97000h);
    }

    @NotNull
    public final LiveData<Resource<List<AddressItemData>>> getProvinceLiveData() {
        return this.f97002j;
    }

    public final void getSubDistrictFromEdms(long j) {
        Observable<R> compose = this.f96994b.getOneRetailerProfileSubDistrict(j).compose(this.f96996d.applyAsync());
        final OneAddressViewModel$getSubDistrictFromEdms$1 oneAddressViewModel$getSubDistrictFromEdms$1 = new OneAddressViewModel$getSubDistrictFromEdms$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: bL0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneAddressViewModel.m10083t(oneAddressViewModel$getSubDistrictFromEdms$1, obj);
            }
        });
        final OneAddressViewModel$getSubDistrictFromEdms$2 oneAddressViewModel$getSubDistrictFromEdms$2 = OneAddressViewModel$getSubDistrictFromEdms$2.INSTANCE;
        Observable map = doOnSubscribe.map(new Function() { // from class: cL0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m10082u;
                m10082u = OneAddressViewModel.m10082u(oneAddressViewModel$getSubDistrictFromEdms$2, obj);
                return m10082u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun getSubDistrictFromEd…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(map, new OneAddressViewModel$getSubDistrictFromEdms$3(this), (Function0) null, new OneAddressViewModel$getSubDistrictFromEdms$4(this), 2, (Object) null), this.f97000h);
    }

    @NotNull
    public final LiveData<Resource<List<AddressItemData>>> getSubDistrictLivedata() {
        return this.f97006n;
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f97000h.clear();
    }

    /* renamed from: v */
    public final MutableLiveData m10081v() {
        return (MutableLiveData) this.f97003k.getValue();
    }

    /* renamed from: w */
    public final MutableLiveData m10080w() {
        return (MutableLiveData) this.f97009q.getValue();
    }

    /* renamed from: x */
    public final MutableLiveData m10079x() {
        return (MutableLiveData) this.f97007o.getValue();
    }

    /* renamed from: y */
    public final MutableLiveData m10078y() {
        return (MutableLiveData) this.f97001i.getValue();
    }

    /* renamed from: z */
    public final MutableLiveData m10077z() {
        return (MutableLiveData) this.f97005m.getValue();
    }
}