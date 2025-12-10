package th.p047co.dtac.android.dtacone.presenter.login;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.login.introduction.IntroductionItem;
import th.p047co.dtac.android.dtacone.presenter.login.IntroductionPresenter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/model/login/introduction/IntroductionItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.login.IntroductionPresenter$getIntroductionBanner$2 */
/* loaded from: classes8.dex */
public final class IntroductionPresenter$getIntroductionBanner$2 extends Lambda implements Function1<List<? extends IntroductionItem>, Unit> {
    final /* synthetic */ IntroductionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroductionPresenter$getIntroductionBanner$2(IntroductionPresenter introductionPresenter) {
        super(1);
        this.this$0 = introductionPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends IntroductionItem> list) {
        invoke2((List<IntroductionItem>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<IntroductionItem> it) {
        IntroductionPresenter.View view;
        IntroductionPresenter.View view2;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        IntroductionPresenter.View view3 = null;
        if (!it.isEmpty()) {
            view2 = this.this$0.f85911f;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view2;
            }
            view3.onGetBannerSuccess(it);
            return;
        }
        view = this.this$0.f85911f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        view3.onGetBannerEmpty();
    }
}