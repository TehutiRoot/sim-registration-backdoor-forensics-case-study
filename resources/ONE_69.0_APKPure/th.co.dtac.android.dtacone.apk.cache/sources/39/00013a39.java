package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "id", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostRecommendedPackageFragment$onStart$1$6 */
/* loaded from: classes10.dex */
public final class OnePre2PostRecommendedPackageFragment$onStart$1$6 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ OnePre2PostRecommendedPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostRecommendedPackageFragment$onStart$1$6(OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment) {
        super(1);
        this.this$0 = onePre2PostRecommendedPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        ImageView imageView;
        if (num != null) {
            OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment = this.this$0;
            int intValue = num.intValue();
            imageView = onePre2PostRecommendedPackageFragment.f95016o;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bell");
                imageView = null;
            }
            imageView.setImageResource(intValue);
        }
    }
}