package th.p047co.dtac.android.dtacone.viewmodel.image.upload;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimUploadImageResponse;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.image.upload.UploadImageViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002,-B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b \u0010*¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/image/upload/UploadImageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lth/co/dtac/android/dtacone/presenter/IViewModel;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;", "multiPartService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;)V", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;)V", "", "idCardImageName", "uploadImageChangeSim", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "d", "Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimUploadImageResponse;", "e", "Lkotlin/Lazy;", "getViewModelUploadImage", "()Landroidx/lifecycle/MutableLiveData;", "viewModelUploadImage", "Lth/co/dtac/android/dtacone/viewmodel/image/upload/UploadImageViewModel$View;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/viewmodel/image/upload/UploadImageViewModel$View;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Companion", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.image.upload.UploadImageViewModel */
/* loaded from: classes9.dex */
public final class UploadImageViewModel extends ViewModel implements IViewModel {

    /* renamed from: a */
    public final RTRApiRx2 f106068a;

    /* renamed from: b */
    public final Rx2ThreadService f106069b;

    /* renamed from: c */
    public final ServerErrorService f106070c;

    /* renamed from: d */
    public final MultiPartService f106071d;

    /* renamed from: e */
    public final Lazy f106072e;

    /* renamed from: f */
    public View f106073f;

    /* renamed from: g */
    public final Lazy f106074g;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/image/upload/UploadImageViewModel$Companion;", "", "()V", "IMAGE_IDCARD_WITH_WATERMARK", "", "QUALITY_PHOTO_ID_CARD", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.image.upload.UploadImageViewModel$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/image/upload/UploadImageViewModel$View;", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.image.upload.UploadImageViewModel$View */
    /* loaded from: classes9.dex */
    public interface View extends IViewModel.IView, ILoadingViewable {
    }

    @Inject
    public UploadImageViewModel(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService, @NotNull MultiPartService multiPartService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(multiPartService, "multiPartService");
        this.f106068a = api;
        this.f106069b = threadService;
        this.f106070c = errorService;
        this.f106071d = multiPartService;
        this.f106072e = LazyKt__LazyJVMKt.lazy(UploadImageViewModel$viewModelUploadImage$2.INSTANCE);
        this.f106074g = LazyKt__LazyJVMKt.lazy(UploadImageViewModel$subscription$2.INSTANCE);
    }

    /* renamed from: e */
    private final CompositeDisposable m2539e() {
        return (CompositeDisposable) this.f106074g.getValue();
    }

    /* renamed from: f */
    public static final void m2538f(UploadImageViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f106073f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: g */
    public static final void m2537g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m2536h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IViewModel
    public void attachView(@NotNull IViewModel.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f106073f = (View) view;
    }

    @NotNull
    public final MutableLiveData<ChangeSimUploadImageResponse> getViewModelUploadImage() {
        return (MutableLiveData) this.f106072e.getValue();
    }

    public final void uploadImageChangeSim(@NotNull String idCardImageName) {
        Intrinsics.checkNotNullParameter(idCardImageName, "idCardImageName");
        MultipartBody.Part requestBodyMultiPartFile = this.f106071d.getRequestBodyMultiPartFile(idCardImageName, ResponseProcessor.CONTENT_TYPE_IMAGE, 80);
        View view = this.f106073f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeDisposable m2539e = m2539e();
        Observable doOnTerminate = this.f106068a.changeSimUploadImage(requestBodyMultiPartFile).compose(this.f106069b.applyAsync()).doOnTerminate(new Action() { // from class: B02
            {
                UploadImageViewModel.this = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                UploadImageViewModel.m2538f(UploadImageViewModel.this);
            }
        });
        final UploadImageViewModel$uploadImageChangeSim$2 uploadImageViewModel$uploadImageChangeSim$2 = new UploadImageViewModel$uploadImageChangeSim$2(this);
        Consumer consumer = new Consumer() { // from class: C02
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadImageViewModel.m2537g(uploadImageViewModel$uploadImageChangeSim$2, obj);
            }
        };
        final UploadImageViewModel$uploadImageChangeSim$3 uploadImageViewModel$uploadImageChangeSim$3 = new UploadImageViewModel$uploadImageChangeSim$3(this);
        m2539e.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: D02
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadImageViewModel.m2536h(uploadImageViewModel$uploadImageChangeSim$3, obj);
            }
        }));
    }
}