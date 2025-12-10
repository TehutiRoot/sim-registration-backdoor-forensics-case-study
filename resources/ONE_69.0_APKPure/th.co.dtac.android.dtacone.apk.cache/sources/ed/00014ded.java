package th.p047co.dtac.android.dtacone.view.fragment.home;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.ActivityNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_mnp.MrtrMnpActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/ActivityNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.home.HomeFragment$onStart$3$1 */
/* loaded from: classes9.dex */
public final class HomeFragment$onStart$3$1 extends Lambda implements Function1<ActivityNavEvent, Unit> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onStart$3$1(HomeFragment homeFragment) {
        super(1);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActivityNavEvent activityNavEvent) {
        invoke2(activityNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ActivityNavEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundle = it.getBundle();
        if (bundle != null) {
            MnpAuthorizationResponse mnpAuthorizationResponse = (MnpAuthorizationResponse) bundle.getParcelable(MrtrMnpActivity.EXTRA_AUTHORIZATION_RESPONSE);
        }
        HomeFragment homeFragment = this.this$0;
        FragmentActivity requireActivity = homeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        homeFragment.startActivity(it.buildIntent(requireActivity));
    }
}