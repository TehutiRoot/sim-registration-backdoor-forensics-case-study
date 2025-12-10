package th.p047co.dtac.android.dtacone.presenter.face;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 12\u00020\u0001:\u0003123B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\r\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;", "multiPartService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", "customerNumber", "idCardImageName", "customerImageName", "simCardNumber", "compareImagePrepaid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "compareImagePostpaid", "onDestroy", "()V", "Lio/reactivex/Observable;", "Lokhttp3/MultipartBody$Part;", OperatorName.SAVE, "(Ljava/lang/String;)Lio/reactivex/Observable;", PDPageLabelRange.STYLE_ROMAN_LOWER, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "d", "Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;", "Lth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter$View;", "e", "Lth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", OperatorName.CLOSE_AND_STROKE, "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Companion", "MultiPartCompare", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFaceRecognitionComparePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceRecognitionComparePresenter.kt\nth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,106:1\n124#2,2:107\n124#2,2:109\n*S KotlinDebug\n*F\n+ 1 FaceRecognitionComparePresenter.kt\nth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter\n*L\n49#1:107,2\n83#1:109,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter */
/* loaded from: classes8.dex */
public final class FaceRecognitionComparePresenter extends LifecyclePresenter {

    /* renamed from: a */
    public final RTRApiRx2 f85782a;

    /* renamed from: b */
    public final Rx2ThreadService f85783b;

    /* renamed from: c */
    public final ServerErrorService f85784c;

    /* renamed from: d */
    public final MultiPartService f85785d;

    /* renamed from: e */
    public View f85786e;

    /* renamed from: f */
    public final Lazy f85787f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter$Companion;", "", "()V", "CUSTOMER_PHOTO_QUALITY", "", "IMAGE_CUSTOMER", "", "IMAGE_IDCARD", "QUALITY_PHOTO_ID_CARD", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter$MultiPartCompare;", "", "Lokhttp3/MultipartBody$Part;", "idCardMultiPart", "customerMultiPart", "<init>", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokhttp3/MultipartBody$Part;", "getIdCardMultiPart", "()Lokhttp3/MultipartBody$Part;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCustomerMultiPart", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter$MultiPartCompare */
    /* loaded from: classes8.dex */
    public static final class MultiPartCompare {
        public static final int $stable = 8;

        /* renamed from: a */
        public final MultipartBody.Part f85788a;

        /* renamed from: b */
        public final MultipartBody.Part f85789b;

        public MultiPartCompare(@NotNull MultipartBody.Part idCardMultiPart, @NotNull MultipartBody.Part customerMultiPart) {
            Intrinsics.checkNotNullParameter(idCardMultiPart, "idCardMultiPart");
            Intrinsics.checkNotNullParameter(customerMultiPart, "customerMultiPart");
            this.f85788a = idCardMultiPart;
            this.f85789b = customerMultiPart;
        }

        @NotNull
        public final MultipartBody.Part getCustomerMultiPart() {
            return this.f85789b;
        }

        @NotNull
        public final MultipartBody.Part getIdCardMultiPart() {
            return this.f85788a;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onFaceMatched", "", "faceCompareResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "onKycCounter", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onFaceMatched(@NotNull FaceCompareResponse faceCompareResponse);

        void onKycCounter(@NotNull FaceCompareResponse faceCompareResponse);
    }

    @Inject
    public FaceRecognitionComparePresenter(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService, @NotNull MultiPartService multiPartService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(multiPartService, "multiPartService");
        this.f85782a = api;
        this.f85783b = threadService;
        this.f85784c = errorService;
        this.f85785d = multiPartService;
        this.f85787f = LazyKt__LazyJVMKt.lazy(FaceRecognitionComparePresenter$subscription$2.INSTANCE);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18256b(FaceRecognitionComparePresenter faceRecognitionComparePresenter) {
        m18244n(faceRecognitionComparePresenter);
    }

    /* renamed from: c */
    public static /* synthetic */ void m18255c(Function1 function1, Object obj) {
        m18246l(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m18253e(Function1 function1, Object obj) {
        m18247k(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m18252f(Function1 function1, Object obj) {
        m18243o(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m18251g(FaceRecognitionComparePresenter faceRecognitionComparePresenter) {
        m18248j(faceRecognitionComparePresenter);
    }

    /* renamed from: h */
    public static /* synthetic */ void m18250h(Function1 function1, Object obj) {
        m18242p(function1, obj);
    }

    /* renamed from: i */
    public static final ObservableSource m18249i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m18248j(FaceRecognitionComparePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85786e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: k */
    public static final void m18247k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m18246l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final ObservableSource m18245m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m18244n(FaceRecognitionComparePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85786e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: o */
    public static final void m18243o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m18242p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    private final CompositeDisposable m18239s() {
        return (CompositeDisposable) this.f85787f.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter.View");
        this.f85786e = (View) iView;
    }

    public final void compareImagePostpaid(@Nullable String str, @NotNull String idCardImageName, @NotNull String customerImageName, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(idCardImageName, "idCardImageName");
        Intrinsics.checkNotNullParameter(customerImageName, "customerImageName");
        Observable m18240r = m18240r(idCardImageName);
        Observable m18241q = m18241q(customerImageName);
        RequestBody requestBodyMediaPlainText = this.f85785d.getRequestBodyMediaPlainText(str2);
        RequestBody requestBodyMediaPlainText2 = this.f85785d.getRequestBodyMediaPlainText(str);
        View view = this.f85786e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeDisposable m18239s = m18239s();
        Observables observables = Observables.INSTANCE;
        Observable zip = Observable.zip(m18240r, m18241q, new BiFunction<T1, T2, R>() { // from class: th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter$compareImagePostpaid$$inlined$zip$1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) new FaceRecognitionComparePresenter.MultiPartCompare((MultipartBody.Part) t1, (MultipartBody.Part) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        final FaceRecognitionComparePresenter$compareImagePostpaid$2 faceRecognitionComparePresenter$compareImagePostpaid$2 = new FaceRecognitionComparePresenter$compareImagePostpaid$2(this, str, requestBodyMediaPlainText2, requestBodyMediaPlainText);
        Observable doOnTerminate = zip.flatMap(new Function() { // from class: uV
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m18249i;
                m18249i = FaceRecognitionComparePresenter.m18249i(Function1.this, obj);
                return m18249i;
            }
        }).compose(this.f85783b.applyAsync()).doOnTerminate(new Action() { // from class: vV
            @Override // io.reactivex.functions.Action
            public final void run() {
                FaceRecognitionComparePresenter.m18251g(FaceRecognitionComparePresenter.this);
            }
        });
        final FaceRecognitionComparePresenter$compareImagePostpaid$4 faceRecognitionComparePresenter$compareImagePostpaid$4 = new FaceRecognitionComparePresenter$compareImagePostpaid$4(this);
        Consumer consumer = new Consumer() { // from class: wV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceRecognitionComparePresenter.m18253e(Function1.this, obj);
            }
        };
        final FaceRecognitionComparePresenter$compareImagePostpaid$5 faceRecognitionComparePresenter$compareImagePostpaid$5 = new FaceRecognitionComparePresenter$compareImagePostpaid$5(this);
        m18239s.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: xV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceRecognitionComparePresenter.m18255c(Function1.this, obj);
            }
        }));
    }

    public final void compareImagePrepaid(@Nullable String str, @NotNull String idCardImageName, @NotNull String customerImageName, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(idCardImageName, "idCardImageName");
        Intrinsics.checkNotNullParameter(customerImageName, "customerImageName");
        Observable m18240r = m18240r(idCardImageName);
        Observable m18241q = m18241q(customerImageName);
        RequestBody requestBodyMediaPlainText = this.f85785d.getRequestBodyMediaPlainText(str2);
        RequestBody requestBodyMediaPlainText2 = this.f85785d.getRequestBodyMediaPlainText(str);
        View view = this.f85786e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeDisposable m18239s = m18239s();
        Observables observables = Observables.INSTANCE;
        Observable zip = Observable.zip(m18240r, m18241q, new BiFunction<T1, T2, R>() { // from class: th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter$compareImagePrepaid$$inlined$zip$1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) new FaceRecognitionComparePresenter.MultiPartCompare((MultipartBody.Part) t1, (MultipartBody.Part) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        final FaceRecognitionComparePresenter$compareImagePrepaid$2 faceRecognitionComparePresenter$compareImagePrepaid$2 = new FaceRecognitionComparePresenter$compareImagePrepaid$2(this, str, requestBodyMediaPlainText2, requestBodyMediaPlainText);
        Observable doOnTerminate = zip.flatMap(new Function() { // from class: yV
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m18245m;
                m18245m = FaceRecognitionComparePresenter.m18245m(Function1.this, obj);
                return m18245m;
            }
        }).compose(this.f85783b.applyAsync()).doOnTerminate(new Action() { // from class: zV
            @Override // io.reactivex.functions.Action
            public final void run() {
                FaceRecognitionComparePresenter.m18256b(FaceRecognitionComparePresenter.this);
            }
        });
        final FaceRecognitionComparePresenter$compareImagePrepaid$4 faceRecognitionComparePresenter$compareImagePrepaid$4 = new FaceRecognitionComparePresenter$compareImagePrepaid$4(this);
        Consumer consumer = new Consumer() { // from class: AV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceRecognitionComparePresenter.m18252f(Function1.this, obj);
            }
        };
        final FaceRecognitionComparePresenter$compareImagePrepaid$5 faceRecognitionComparePresenter$compareImagePrepaid$5 = new FaceRecognitionComparePresenter$compareImagePrepaid$5(this);
        m18239s.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: BV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceRecognitionComparePresenter.m18250h(Function1.this, obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        m18239s().clear();
    }

    /* renamed from: q */
    public final Observable m18241q(String str) {
        Observable<R> compose = this.f85785d.getRequestBodyMultiPartFileObservable(str, "customerPhoto", 75).compose(this.f85783b.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "multiPartService.getRequ…ervice.applyBackground())");
        return compose;
    }

    /* renamed from: r */
    public final Observable m18240r(String str) {
        Observable<R> compose = this.f85785d.getRequestBodyMultiPartFileObservable(str, "idCard", 80).compose(this.f85783b.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "multiPartService.getRequ…ervice.applyBackground())");
        return compose;
    }
}