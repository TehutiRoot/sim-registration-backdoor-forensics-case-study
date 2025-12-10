package th.p047co.dtac.android.dtacone.presenter.face;

import android.graphics.Bitmap;
import com.google.android.gms.analytics.ecommerce.Promotion;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.p051rx.RxBitmap;
import th.p047co.dtac.android.dtacone.p051rx.RxFaceDetection;
import th.p047co.dtac.android.dtacone.presenter.face.FacePresenter;
import th.p047co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "bitmapCollection", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3 */
/* loaded from: classes8.dex */
public final class FacePresenter$faceDetectionByBitmapMlKitCoverage$3 extends Lambda implements Function1<BitmapCollection, Unit> {
    final /* synthetic */ Integer $configCounter;
    final /* synthetic */ Bitmap $fullBitmap;
    final /* synthetic */ String $fullBitmapName;
    final /* synthetic */ FacePresenter this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3$1 */
    /* loaded from: classes8.dex */
    public static final class C143141 extends Lambda implements Function0<Unit> {
        final /* synthetic */ FacePresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143141(FacePresenter facePresenter) {
            super(0);
            this.this$0 = facePresenter;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final void invoke2() {
            FacePresenter.View view;
            view = this.this$0.f85774f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view = null;
            }
            view.onFaceDetected();
        }
    }

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3$2 */
    /* loaded from: classes8.dex */
    public static final class C143152 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Integer $configCounter;
        final /* synthetic */ Bitmap $fullBitmap;
        final /* synthetic */ String $fullBitmapName;
        final /* synthetic */ FacePresenter this$0;

        @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "bitmapCollection", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3$2$3 */
        /* loaded from: classes8.dex */
        public static final class C143163 extends Lambda implements Function1<BitmapCollection, Unit> {
            final /* synthetic */ Integer $configCounter;
            final /* synthetic */ FacePresenter this$0;

            @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3$2$3$1 */
            /* loaded from: classes8.dex */
            public static final class C143171 extends Lambda implements Function0<Unit> {
                final /* synthetic */ FacePresenter this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C143171(FacePresenter facePresenter) {
                    super(0);
                    this.this$0 = facePresenter;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final void invoke2() {
                    FacePresenter.View view;
                    view = this.this$0.f85774f;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                        view = null;
                    }
                    view.onFaceDetected();
                }
            }

            @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3$2$3$2 */
            /* loaded from: classes8.dex */
            public static final class C143182 extends Lambda implements Function0<Unit> {
                final /* synthetic */ Integer $configCounter;
                final /* synthetic */ FacePresenter this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C143182(FacePresenter facePresenter, Integer num) {
                    super(0);
                    this.this$0 = facePresenter;
                    this.$configCounter = num;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final void invoke2() {
                    int i;
                    int i2;
                    FacePresenter.View view;
                    FacePresenter.View view2;
                    FacePresenter facePresenter = this.this$0;
                    i = facePresenter.f85776h;
                    facePresenter.f85776h = i + 1;
                    i2 = this.this$0.f85776h;
                    Integer num = this.$configCounter;
                    Intrinsics.checkNotNull(num);
                    FacePresenter.View view3 = null;
                    if (i2 > num.intValue()) {
                        view2 = this.this$0.f85774f;
                        if (view2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                        } else {
                            view3 = view2;
                        }
                        view3.onByPassConfirmFaceByRTR();
                        return;
                    }
                    view = this.this$0.f85774f;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    } else {
                        view3 = view;
                    }
                    view3.onFaceNotFound();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C143163(FacePresenter facePresenter, Integer num) {
                super(1);
                this.this$0 = facePresenter;
                this.$configCounter = num;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BitmapCollection bitmapCollection) {
                invoke2(bitmapCollection);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(BitmapCollection bitmapCollection) {
                RxFaceDetection rxFaceDetection;
                rxFaceDetection = this.this$0.f85770b;
                Intrinsics.checkNotNullExpressionValue(bitmapCollection, "bitmapCollection");
                rxFaceDetection.callDetectByBitmapCollectionMlKit(bitmapCollection, new C143171(this.this$0), new C143182(this.this$0, this.$configCounter));
            }
        }

        @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKitCoverage$3$2$4 */
        /* loaded from: classes8.dex */
        public static final class C143194 extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ FacePresenter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C143194(FacePresenter facePresenter) {
                super(1);
                this.this$0 = facePresenter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Throwable th2) {
                FacePresenter.View view;
                th2.printStackTrace();
                view = this.this$0.f85774f;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view = null;
                }
                view.onFaceNotFound();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143152(FacePresenter facePresenter, String str, Bitmap bitmap, Integer num) {
            super(0);
            this.this$0 = facePresenter;
            this.$fullBitmapName = str;
            this.$fullBitmap = bitmap;
            this.$configCounter = num;
        }

        /* renamed from: a */
        public static /* synthetic */ BitmapCollection m18261a(String str, Bitmap bitmap) {
            return invoke$lambda$0(str, bitmap);
        }

        /* renamed from: c */
        public static /* synthetic */ void m18259c(Function1 function1, Object obj) {
            invoke$lambda$3(function1, obj);
        }

        /* renamed from: d */
        public static /* synthetic */ void m18258d(Function1 function1, Object obj) {
            invoke$lambda$2(function1, obj);
        }

        public static final BitmapCollection invoke$lambda$0(String str, Bitmap bitmap) {
            Bitmap bitmap2;
            if (bitmap != null) {
                bitmap2 = BitmapExtKt.toRotate(bitmap);
            } else {
                bitmap2 = null;
            }
            return new BitmapCollection(str, bitmap2);
        }

        public static final void invoke$lambda$1(FacePresenter this$0) {
            FacePresenter.View view;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            view = this$0.f85774f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view = null;
            }
            view.dismissSecondaryLoading();
        }

        public static final void invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$3(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final void invoke2() {
            CompositeDisposable m18343B0;
            RxBitmap rxBitmap;
            Rx2ThreadService rx2ThreadService;
            m18343B0 = this.this$0.m18343B0();
            final String str = this.$fullBitmapName;
            final Bitmap bitmap = this.$fullBitmap;
            Observable fromCallable = Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.face.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return FacePresenter$faceDetectionByBitmapMlKitCoverage$3.C143152.m18261a(str, bitmap);
                }
            });
            rxBitmap = this.this$0.f85772d;
            Observable compose = fromCallable.compose(rxBitmap.applySaveBitmap());
            rx2ThreadService = this.this$0.f85773e;
            Observable compose2 = compose.compose(rx2ThreadService.applyAsync());
            final FacePresenter facePresenter = this.this$0;
            Observable doOnTerminate = compose2.doOnTerminate(new Action() { // from class: th.co.dtac.android.dtacone.presenter.face.b
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FacePresenter$faceDetectionByBitmapMlKitCoverage$3.C143152.invoke$lambda$1(FacePresenter.this);
                }
            });
            final C143163 c143163 = new C143163(this.this$0, this.$configCounter);
            Consumer consumer = new Consumer() { // from class: th.co.dtac.android.dtacone.presenter.face.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FacePresenter$faceDetectionByBitmapMlKitCoverage$3.C143152.m18258d(Function1.this, obj);
                }
            };
            final C143194 c143194 = new C143194(this.this$0);
            m18343B0.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: th.co.dtac.android.dtacone.presenter.face.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FacePresenter$faceDetectionByBitmapMlKitCoverage$3.C143152.m18259c(Function1.this, obj);
                }
            }));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacePresenter$faceDetectionByBitmapMlKitCoverage$3(FacePresenter facePresenter, String str, Bitmap bitmap, Integer num) {
        super(1);
        this.this$0 = facePresenter;
        this.$fullBitmapName = str;
        this.$fullBitmap = bitmap;
        this.$configCounter = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BitmapCollection bitmapCollection) {
        invoke2(bitmapCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(BitmapCollection bitmapCollection) {
        RxFaceDetection rxFaceDetection;
        rxFaceDetection = this.this$0.f85770b;
        Intrinsics.checkNotNullExpressionValue(bitmapCollection, "bitmapCollection");
        rxFaceDetection.callDetectByBitmapCollectionMlKit(bitmapCollection, new C143141(this.this$0), new C143152(this.this$0, this.$fullBitmapName, this.$fullBitmap, this.$configCounter));
    }
}