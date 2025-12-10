package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import com.google.firebase.messaging.Constants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "iteration", "", "invoke", "(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1 extends Lambda implements Function1<Integer, ObservableSource<? extends OneGetPricePlansDetailResponse>> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Lio/reactivex/SingleSource;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C145711 extends Lambda implements Function1<Long, SingleSource<? extends OneGetPricePlansDetailResponse>> {
        final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

        @Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C145721 extends Lambda implements Function1<Throwable, SingleSource<? extends OneGetPricePlansDetailResponse>> {
            final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C145721(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
                super(1);
                this.this$0 = oneDeviceSaleTrueViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final SingleSource<? extends OneGetPricePlansDetailResponse> invoke(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return Single.just(new OneGetPricePlansDetailResponse(null, null, null, null, new Data(this.this$0.getOneModel().getPricePlansDetailStatusResponse(), CollectionsKt__CollectionsKt.emptyList()), null, null, 111, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C145711(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
            super(1);
            this.this$0 = oneDeviceSaleTrueViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleSource invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (SingleSource) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SingleSource<? extends OneGetPricePlansDetailResponse> invoke(@NotNull Long it) {
            OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository;
            Rx2ThreadService rx2ThreadService;
            Intrinsics.checkNotNullParameter(it, "it");
            oneDeviceSaleTrueRepository = this.this$0.f90027b;
            Single<OneGetPricePlansDetailResponse> oneGetPricePlansDetail = oneDeviceSaleTrueRepository.oneGetPricePlansDetail();
            rx2ThreadService = this.this$0.f90031d;
            Single<R> compose = oneGetPricePlansDetail.compose(rx2ThreadService.applySingleAsync());
            final C145721 c145721 = new C145721(this.this$0);
            return compose.onErrorResumeNext(new Function() { // from class: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.b
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    SingleSource invoke$lambda$0;
                    invoke$lambda$0 = OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1.C145711.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends OneGetPricePlansDetailResponse> invoke(@NotNull Integer iteration) {
        Intrinsics.checkNotNullParameter(iteration, "iteration");
        Observable<Long> timer = Observable.timer(3L, TimeUnit.SECONDS);
        final C145711 c145711 = new C145711(this.this$0);
        return timer.concatMapSingle(new Function() { // from class: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource invoke$lambda$0;
                invoke$lambda$0 = OneDeviceSaleTrueViewModel$fetchDataPricePlansDetail$apiCall$1$1.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        });
    }
}