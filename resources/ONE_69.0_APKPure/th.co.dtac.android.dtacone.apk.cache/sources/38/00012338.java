package th.p047co.dtac.android.dtacone.presenter.face;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.p051rx.RxFaceDetection;
import th.p047co.dtac.android.dtacone.presenter.face.FacePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "bitmapCollection", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKit$3 */
/* loaded from: classes8.dex */
public final class FacePresenter$faceDetectionByBitmapMlKit$3 extends Lambda implements Function1<BitmapCollection, Unit> {
    final /* synthetic */ Integer $configCounter;
    final /* synthetic */ FacePresenter this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKit$3$1 */
    /* loaded from: classes8.dex */
    public static final class C143121 extends Lambda implements Function0<Unit> {
        final /* synthetic */ FacePresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143121(FacePresenter facePresenter) {
            super(0);
            this.this$0 = facePresenter;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
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
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmapMlKit$3$2 */
    /* loaded from: classes8.dex */
    public static final class C143132 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Integer $configCounter;
        final /* synthetic */ FacePresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143132(FacePresenter facePresenter, Integer num) {
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
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
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
    public FacePresenter$faceDetectionByBitmapMlKit$3(FacePresenter facePresenter, Integer num) {
        super(1);
        this.this$0 = facePresenter;
        this.$configCounter = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BitmapCollection bitmapCollection) {
        invoke2(bitmapCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BitmapCollection bitmapCollection) {
        RxFaceDetection rxFaceDetection;
        rxFaceDetection = this.this$0.f85770b;
        Intrinsics.checkNotNullExpressionValue(bitmapCollection, "bitmapCollection");
        rxFaceDetection.callDetectByBitmapCollectionMlKit(bitmapCollection, new C143121(this.this$0), new C143132(this.this$0, this.$configCounter));
    }
}