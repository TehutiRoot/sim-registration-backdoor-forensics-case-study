package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$updateAppForms$4 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$updateAppForms$4 extends Lambda implements Function1<Pair<? extends String, ? extends String>, ObservableSource<? extends OneCommonResponse>> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$updateAppForms$4(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends OneCommonResponse> invoke(Pair<? extends String, ? extends String> pair) {
        return invoke2((Pair<String, String>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends OneCommonResponse> invoke2(@NotNull Pair<String, String> it) {
        OnePre2PostRepository onePre2PostRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        onePre2PostRepository = this.this$0.f95516c;
        return OnePre2PostRepository.updateAppForms$default(onePre2PostRepository, it.getFirst(), it.getSecond(), false, 4, null).toObservable();
    }
}