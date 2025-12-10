package th.p047co.dtac.android.dtacone.presenter.postpaid_registration;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.postpaid.FaceDetectionConfig;
import th.p047co.dtac.android.dtacone.model.postpaid.PostpaidConfigResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidConfigResponse;", "kotlin.jvm.PlatformType", "config", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.postpaid_registration.PostpaidConfigPresenter$getPostpaidConfig$1 */
/* loaded from: classes8.dex */
public final class PostpaidConfigPresenter$getPostpaidConfig$1 extends Lambda implements Function1<PostpaidConfigResponse, ObservableSource<? extends PostpaidConfigResponse>> {
    final /* synthetic */ PostpaidConfigPresenter this$0;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidConfigResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lth/co/dtac/android/dtacone/model/postpaid/PostpaidConfigResponse;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.postpaid_registration.PostpaidConfigPresenter$getPostpaidConfig$1$2 */
    /* loaded from: classes8.dex */
    public static final class C143472 extends Lambda implements Function1<Unit, PostpaidConfigResponse> {
        final /* synthetic */ PostpaidConfigResponse $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143472(PostpaidConfigResponse postpaidConfigResponse) {
            super(1);
            this.$config = postpaidConfigResponse;
        }

        @Override // kotlin.jvm.functions.Function1
        public final PostpaidConfigResponse invoke(@NotNull Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$config;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostpaidConfigPresenter$getPostpaidConfig$1(PostpaidConfigPresenter postpaidConfigPresenter) {
        super(1);
        this.this$0 = postpaidConfigPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(PostpaidConfigResponse config, PostpaidConfigPresenter this$0) {
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceDetectionConfig faceNotFoundCountBeforeManualAccept = config.getFaceNotFoundCountBeforeManualAccept();
        this$0.getPref().setInt(Constant.FACE_DETECTION_CUSTOMER_COUNTER, faceNotFoundCountBeforeManualAccept.getCustomerPhotoCounter());
        this$0.getPref().setInt(Constant.FACE_DETECTION_ID_CARD_COUNTER, faceNotFoundCountBeforeManualAccept.getIdCardCounter());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostpaidConfigResponse invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PostpaidConfigResponse) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends PostpaidConfigResponse> invoke(@NotNull final PostpaidConfigResponse config) {
        Intrinsics.checkNotNullParameter(config, "config");
        final PostpaidConfigPresenter postpaidConfigPresenter = this.this$0;
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.postpaid_registration.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit invoke$lambda$0;
                invoke$lambda$0 = PostpaidConfigPresenter$getPostpaidConfig$1.invoke$lambda$0(PostpaidConfigResponse.this, postpaidConfigPresenter);
                return invoke$lambda$0;
            }
        });
        final C143472 c143472 = new C143472(config);
        return fromCallable.map(new Function() { // from class: th.co.dtac.android.dtacone.presenter.postpaid_registration.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                PostpaidConfigResponse invoke$lambda$1;
                invoke$lambda$1 = PostpaidConfigPresenter$getPostpaidConfig$1.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        });
    }
}