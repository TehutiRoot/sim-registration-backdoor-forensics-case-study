package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrNavigateDeviceSales;
import th.p047co.dtac.android.dtacone.view.activity.device_sale.DeviceSaleActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSelectRegisterTypeFragment;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrNavigateDeviceSales;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentNonTelcoFragment$onStart$1$2 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostConsentNonTelcoFragment$onStart$1$2 extends Lambda implements Function1<Pair<? extends Boolean, ? extends MrtrNavigateDeviceSales>, Unit> {
    final /* synthetic */ MrtrPre2PostConsentNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostConsentNonTelcoFragment$onStart$1$2(MrtrPre2PostConsentNonTelcoFragment mrtrPre2PostConsentNonTelcoFragment) {
        super(1);
        this.this$0 = mrtrPre2PostConsentNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends MrtrNavigateDeviceSales> pair) {
        invoke2((Pair<Boolean, MrtrNavigateDeviceSales>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Pair<Boolean, MrtrNavigateDeviceSales> it) {
        ActivityResultLauncher activityResultLauncher;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getFirst().booleanValue()) {
            Intent intent = new Intent(this.this$0.requireActivity(), DeviceSaleActivity.class);
            intent.putExtra("bundlePostpaidRegist", it.getSecond());
            intent.putExtra(OnePre2PostSelectRegisterTypeFragment.DISPLAY_CAMPAIGN_EXTRA, this.this$0.m5250u().isDisplayCampaign());
            if (this.this$0.m5250u().isDisplayCampaign()) {
                activityResultLauncher = this.this$0.f103071l;
                activityResultLauncher.launch(intent);
                return;
            }
            this.this$0.requireActivity().startActivity(intent);
            this.this$0.requireActivity().finish();
            return;
        }
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity");
        ((MrtrPre2PostActivity) requireActivity).replaceFragment(MrtrPre2PostSuccessFragment.Companion.newInstance(), Reflection.getOrCreateKotlinClass(MrtrPre2PostSuccessFragment.class).getSimpleName());
    }
}