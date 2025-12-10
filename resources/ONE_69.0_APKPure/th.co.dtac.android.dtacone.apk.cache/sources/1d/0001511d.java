package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostPreviewImageFragment$onStart$1 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostPreviewImageFragment$onStart$1 extends Lambda implements Function1<Resource<? extends Boolean>, Unit> {
    final /* synthetic */ MrtrPre2PostPreviewImageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostPreviewImageFragment$onStart$1(MrtrPre2PostPreviewImageFragment mrtrPre2PostPreviewImageFragment) {
        super(1);
        this.this$0 = mrtrPre2PostPreviewImageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Boolean> resource) {
        invoke2((Resource<Boolean>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Resource<Boolean> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getStatus() == StatusResource.SUCCESS && Intrinsics.areEqual(it.getData(), Boolean.TRUE)) {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity");
            ((MrtrPre2PostActivity) requireActivity).replaceFragment(MrtrPre2PostCameraCustomerFragment.Companion.newInstance(), Reflection.getOrCreateKotlinClass(MrtrPre2PostCameraCustomerFragment.class).getSimpleName());
        }
    }
}