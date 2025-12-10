package th.p047co.dtac.android.dtacone.view.appOne.notification.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.newsFeed.OneNewsItem;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.util.p052enum.UserNameType;
import th.p047co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.notification.viewmodel.OneNewsNotificationViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R'\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R'\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020&0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b-\u0010*R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020&0,8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b4\u00100R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010;\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006="}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/notification/viewmodel/OneNewsNotificationViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "rtrRepository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/view/appOne/notification/repository/OneNewsNotificationRepository;", "notiRepository", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/view/appOne/notification/repository/OneNewsNotificationRepository;)V", "", OperatorName.NON_STROKING_CMYK, "()V", OperatorName.SET_LINE_JOINSTYLE, "", "newsId", "getOneNews", "(I)V", "onCleared", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "d", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "e", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/view/appOne/notification/repository/OneNewsNotificationRepository;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/newsFeed/OneNewsItem;", OperatorName.CLOSE_PATH, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_onNewsResult", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getOnNewsResult", "()Landroidx/lifecycle/LiveData;", "onNewsResult", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "_onNewsResultErrorMessage", "getOnNewsResultErrorMessage", "onNewsResultErrorMessage", "", "getUserFormatType", "()Ljava/lang/String;", "userFormatType", "", "isUserLan", "()Z", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.viewmodel.OneNewsNotificationViewModel */
/* loaded from: classes10.dex */
public final class OneNewsNotificationViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final Rx2ThreadService f92469b;

    /* renamed from: c */
    public final OneErrorService f92470c;

    /* renamed from: d */
    public final RtrRepository f92471d;

    /* renamed from: e */
    public final RtrRx2Repository f92472e;

    /* renamed from: f */
    public final OneNewsNotificationRepository f92473f;

    /* renamed from: g */
    public final CompositeDisposable f92474g;

    /* renamed from: h */
    public final Lazy f92475h;

    /* renamed from: i */
    public final LiveData f92476i;

    /* renamed from: j */
    public final Lazy f92477j;

    /* renamed from: k */
    public final LiveData f92478k;

    @Inject
    public OneNewsNotificationViewModel(@NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService, @NotNull RtrRepository rtrRepository, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull OneNewsNotificationRepository notiRepository) {
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(rtrRepository, "rtrRepository");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(notiRepository, "notiRepository");
        this.f92469b = threadService;
        this.f92470c = errorService;
        this.f92471d = rtrRepository;
        this.f92472e = rtrRx2Repository;
        this.f92473f = notiRepository;
        this.f92474g = new CompositeDisposable();
        this.f92475h = LazyKt__LazyJVMKt.lazy(OneNewsNotificationViewModel$_onNewsResult$2.INSTANCE);
        this.f92476i = m13203h();
        this.f92477j = LazyKt__LazyJVMKt.lazy(OneNewsNotificationViewModel$_onNewsResultErrorMessage$2.INSTANCE);
        this.f92478k = m13202i();
    }

    /* renamed from: b */
    public static /* synthetic */ void m13209b(Function1 function1, Object obj) {
        m13205f(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m13208c(Function1 function1, Object obj) {
        m13206e(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m13207d(Function1 function1, Object obj) {
        m13204g(function1, obj);
    }

    /* renamed from: e */
    public static final void m13206e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m13205f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m13204g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public final void m13201j() {
        this.f92471d.setHeaderApplication("MRTR");
    }

    /* renamed from: k */
    private final void m13200k() {
        if (isUserLan()) {
            this.f92471d.setHeaderApplication("DTACX");
        } else {
            this.f92471d.setHeaderApplication("MRTR");
        }
    }

    @NotNull
    public final LiveData<Resource<OneNewsItem>> getOnNewsResult() {
        return this.f92476i;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getOnNewsResultErrorMessage() {
        return this.f92478k;
    }

    public final void getOneNews(int i) {
        m13200k();
        CompositeDisposable compositeDisposable = this.f92474g;
        Observable<R> compose = this.f92473f.oneNewsDetail(i).compose(this.f92469b.applyAsync());
        final OneNewsNotificationViewModel$getOneNews$1 oneNewsNotificationViewModel$getOneNews$1 = new OneNewsNotificationViewModel$getOneNews$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: RY0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneNewsNotificationViewModel.m13208c(Function1.this, obj);
            }
        });
        final OneNewsNotificationViewModel$getOneNews$2 oneNewsNotificationViewModel$getOneNews$2 = new OneNewsNotificationViewModel$getOneNews$2(this);
        Consumer consumer = new Consumer() { // from class: SY0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneNewsNotificationViewModel.m13209b(Function1.this, obj);
            }
        };
        final OneNewsNotificationViewModel$getOneNews$3 oneNewsNotificationViewModel$getOneNews$3 = new OneNewsNotificationViewModel$getOneNews$3(this);
        compositeDisposable.add(doOnSubscribe.subscribe(consumer, new Consumer() { // from class: TY0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneNewsNotificationViewModel.m13207d(Function1.this, obj);
            }
        }));
    }

    @NotNull
    public final String getUserFormatType() {
        String userName = this.f92472e.getSessionNow().getRetailerNumber();
        if (userName.length() >= 10) {
            Intrinsics.checkNotNullExpressionValue(userName, "userName");
            if (new Regex("[0-9]+").matches(userName)) {
                return UserNameType.TELEPHONE_NUMBER.INSTANCE.getUserFormatType();
            }
        }
        return UserNameType.USER_LAN.INSTANCE.getUserFormatType();
    }

    /* renamed from: h */
    public final MutableLiveData m13203h() {
        return (MutableLiveData) this.f92475h.getValue();
    }

    /* renamed from: i */
    public final MutableLiveData m13202i() {
        return (MutableLiveData) this.f92477j.getValue();
    }

    public final boolean isUserLan() {
        return Intrinsics.areEqual(getUserFormatType(), UserNameType.USER_LAN.INSTANCE.getUserFormatType());
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f92474g.clear();
    }
}