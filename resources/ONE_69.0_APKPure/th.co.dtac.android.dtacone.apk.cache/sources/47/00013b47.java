package th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository$oneGetPricePlans$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostRepository$oneGetPricePlans$1 extends Lambda implements Function1<OneGetPricePlansResponse, OneGetPricePlansResponse> {
    final /* synthetic */ OnePre2PostRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostRepository$oneGetPricePlans$1(OnePre2PostRepository onePre2PostRepository) {
        super(1);
        this.this$0 = onePre2PostRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneGetPricePlansResponse invoke(@NotNull OneGetPricePlansResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.getOnePre2PostModel().setPricePlansResponse(it.getData());
        return it;
    }
}