package th.p047co.dtac.android.dtacone.viewmodel.news;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.newsfeed.MissionRequest;
import th.p047co.dtac.android.dtacone.model.newsfeed.MissionResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.news.DynamicCampaignViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R'\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R'\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b\u001e\u0010)R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0+8\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/¨\u00066"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/news/DynamicCampaignViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "", "option", "", "getMissionList", "(Ljava/lang/String;)V", "getOneMissionList", "onCleared", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "d", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "e", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/newsfeed/MissionResponse;", OperatorName.CLOSE_PATH, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_missionResponse", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getGetMissionResponse", "()Landroidx/lifecycle/LiveData;", "getMissionResponse", OperatorName.SET_LINE_JOINSTYLE, "_missionHomeResponse", OperatorName.NON_STROKING_CMYK, "getGetMissionHomeResponse", "getMissionHomeResponse", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.news.DynamicCampaignViewModel */
/* loaded from: classes9.dex */
public final class DynamicCampaignViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final RTRApiRx2 f106904b;

    /* renamed from: c */
    public final RtrRx2Repository f106905c;

    /* renamed from: d */
    public final ConfigurationRepository f106906d;

    /* renamed from: e */
    public final Rx2ThreadService f106907e;

    /* renamed from: f */
    public final MrtrErrorService f106908f;

    /* renamed from: g */
    public final CompositeDisposable f106909g;

    /* renamed from: h */
    public final Lazy f106910h;

    /* renamed from: i */
    public final LiveData f106911i;

    /* renamed from: j */
    public final Lazy f106912j;

    /* renamed from: k */
    public final LiveData f106913k;

    public DynamicCampaignViewModel(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f106904b = api;
        this.f106905c = rtrRx2Repository;
        this.f106906d = configurationRepository;
        this.f106907e = threadService;
        this.f106908f = errorService;
        this.f106909g = new CompositeDisposable();
        this.f106910h = LazyKt__LazyJVMKt.lazy(DynamicCampaignViewModel$_missionResponse$2.INSTANCE);
        this.f106911i = m1953g();
        this.f106912j = LazyKt__LazyJVMKt.lazy(DynamicCampaignViewModel$_missionHomeResponse$2.INSTANCE);
        this.f106913k = m1954f();
    }

    /* renamed from: d */
    public static final void m1956d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m1955e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getMissionList$default(DynamicCampaignViewModel dynamicCampaignViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constant.MissionOption.trophy;
        }
        dynamicCampaignViewModel.getMissionList(str);
    }

    public static /* synthetic */ void getOneMissionList$default(DynamicCampaignViewModel dynamicCampaignViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constant.MissionOption.trophy;
        }
        dynamicCampaignViewModel.getOneMissionList(str);
    }

    /* renamed from: f */
    public final MutableLiveData m1954f() {
        return (MutableLiveData) this.f106912j.getValue();
    }

    /* renamed from: g */
    public final MutableLiveData m1953g() {
        return (MutableLiveData) this.f106910h.getValue();
    }

    @NotNull
    public final LiveData<Resource<MissionResponse>> getGetMissionHomeResponse() {
        return this.f106913k;
    }

    @NotNull
    public final LiveData<Resource<MissionResponse>> getGetMissionResponse() {
        return this.f106911i;
    }

    public final void getMissionList(@Nullable String str) {
        String str2;
        RTRApiRx2 rTRApiRx2 = this.f106904b;
        String rtrCode = this.f106905c.getUserSession().getRtrCode();
        if (Intrinsics.areEqual(str, Constant.MissionOption.trophy)) {
            str2 = Constant.MissionOptinStatus.All;
        } else {
            str2 = "N";
        }
        Single<R> compose = rTRApiRx2.getMissionList(new MissionRequest(rtrCode, "dtacone", str2, str)).compose(this.f106907e.applySingleAsync());
        final DynamicCampaignViewModel$getMissionList$1 dynamicCampaignViewModel$getMissionList$1 = new DynamicCampaignViewModel$getMissionList$1(str, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: gL
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DynamicCampaignViewModel.m1956d(dynamicCampaignViewModel$getMissionList$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMissionList(optio….addTo(disposable)\n\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DynamicCampaignViewModel$getMissionList$2(str, this), new DynamicCampaignViewModel$getMissionList$3(str, this)), this.f106909g);
    }

    public final void getOneMissionList(@Nullable String str) {
        String str2;
        RTRApiRx2 rTRApiRx2 = this.f106904b;
        String rtrCode = this.f106905c.getUserSession().getRtrCode();
        if (Intrinsics.areEqual(str, Constant.MissionOption.trophy)) {
            str2 = Constant.MissionOptinStatus.All;
        } else {
            str2 = "N";
        }
        Single<R> compose = rTRApiRx2.getOneMissionList(new MissionRequest(rtrCode, "dtacone", str2, str)).compose(this.f106907e.applySingleAsync());
        final DynamicCampaignViewModel$getOneMissionList$1 dynamicCampaignViewModel$getOneMissionList$1 = new DynamicCampaignViewModel$getOneMissionList$1(str, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: fL
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DynamicCampaignViewModel.m1955e(dynamicCampaignViewModel$getOneMissionList$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getOneMissionList(op….addTo(disposable)\n\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DynamicCampaignViewModel$getOneMissionList$2(str, this), new DynamicCampaignViewModel$getOneMissionList$3(str, this)), this.f106909g);
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f106909g.clear();
    }
}