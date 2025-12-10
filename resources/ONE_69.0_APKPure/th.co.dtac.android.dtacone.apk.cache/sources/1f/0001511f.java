package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostRecommendedPackageFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostPreviewImageFragment$onStart$4 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostPreviewImageFragment$onStart$4 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MrtrPre2PostPreviewImageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostPreviewImageFragment$onStart$4(MrtrPre2PostPreviewImageFragment mrtrPre2PostPreviewImageFragment) {
        super(1);
        this.this$0 = mrtrPre2PostPreviewImageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity");
        ((MrtrPre2PostActivity) requireActivity).replaceFragment(new MrtrPre2PostRecommendedPackageFragment(), Reflection.getOrCreateKotlinClass(MrtrPre2PostRecommendedPackageFragment.class).getSimpleName());
    }
}