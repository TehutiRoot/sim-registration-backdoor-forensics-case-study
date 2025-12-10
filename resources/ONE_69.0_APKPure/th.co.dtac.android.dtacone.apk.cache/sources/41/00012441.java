package th.p047co.dtac.android.dtacone.presenter.postpaid_registration;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.postpaid.PostpaidConfigResponse;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidConfigResponse;", "kotlin.jvm.PlatformType", "config", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.postpaid_registration.PostpaidConfigPresenter$getPostpaidConfig$2 */
/* loaded from: classes8.dex */
public final class PostpaidConfigPresenter$getPostpaidConfig$2 extends Lambda implements Function1<PostpaidConfigResponse, ObservableSource<? extends PostpaidConfigResponse>> {
    public static final PostpaidConfigPresenter$getPostpaidConfig$2 INSTANCE = new PostpaidConfigPresenter$getPostpaidConfig$2();

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Integer;)Ljava/lang/String;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.postpaid_registration.PostpaidConfigPresenter$getPostpaidConfig$2$1 */
    /* loaded from: classes8.dex */
    public static final class C143481 extends Lambda implements Function1<Integer, String> {
        public static final C143481 INSTANCE = new C143481();

        public C143481() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(@NotNull Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringExtKt.toJpg(it.intValue());
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012(\u0010\u0003\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidConfigResponse;", "kotlin.jvm.PlatformType", "it", "", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.postpaid_registration.PostpaidConfigPresenter$getPostpaidConfig$2$2 */
    /* loaded from: classes8.dex */
    public static final class C143492 extends Lambda implements Function1<List<String>, PostpaidConfigResponse> {
        final /* synthetic */ PostpaidConfigResponse $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143492(PostpaidConfigResponse postpaidConfigResponse) {
            super(1);
            this.$config = postpaidConfigResponse;
        }

        @Override // kotlin.jvm.functions.Function1
        public final PostpaidConfigResponse invoke(@NotNull List<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new PostpaidConfigResponse(this.$config.getFaceRecognition(), this.$config.getFaceNotFoundCountBeforeManualAccept(), this.$config.getImageOptionals(), this.$config.getKYCRequireVerifyJC(), this.$config.getInvoiceAlertMethod(), it, false, false, false, null, null, 1792, null);
        }
    }

    public PostpaidConfigPresenter$getPostpaidConfig$2() {
        super(1);
    }

    /* renamed from: b */
    public static /* synthetic */ String m17713b(Function1 function1, Object obj) {
        return invoke$lambda$0(function1, obj);
    }

    public static final String invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    public static final PostpaidConfigResponse invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PostpaidConfigResponse) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends PostpaidConfigResponse> invoke(@NotNull PostpaidConfigResponse config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Observable<Integer> range = Observable.range(1, config.getImageOptionals());
        final C143481 c143481 = C143481.INSTANCE;
        Single list = range.map(new Function() { // from class: th.co.dtac.android.dtacone.presenter.postpaid_registration.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PostpaidConfigPresenter$getPostpaidConfig$2.m17713b(Function1.this, obj);
            }
        }).toList();
        final C143492 c143492 = new C143492(config);
        return list.map(new Function() { // from class: th.co.dtac.android.dtacone.presenter.postpaid_registration.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                PostpaidConfigResponse invoke$lambda$1;
                invoke$lambda$1 = PostpaidConfigPresenter$getPostpaidConfig$2.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        }).toObservable();
    }
}