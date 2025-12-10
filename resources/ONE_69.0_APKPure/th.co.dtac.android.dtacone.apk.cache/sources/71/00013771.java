package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.view.appOne.common.optional_camera.OnePureCameraActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$showDialogMultiplePhoto$1$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidNavigateToCommonFragment$showDialogMultiplePhoto$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostpaidRegistrationActivity $this_apply;
    final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidNavigateToCommonFragment$showDialogMultiplePhoto$1$2(OnePostpaidRegistrationActivity onePostpaidRegistrationActivity, OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
        super(0);
        this.$this_apply = onePostpaidRegistrationActivity;
        this.this$0 = onePostpaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<String> imageOptionalsName = this.$this_apply.getViewModel().getImageOptionalsName();
        String str = imageOptionalsName != null ? (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) this.this$0.m12339m().getImageNameNotExistInMemoryOfApplication(imageOptionalsName)) : null;
        Intent intent = new Intent(this.this$0.m12339m(), OnePureCameraActivity.class);
        intent.putExtra("EXTRA_CARD_TYPE", str);
        intent.putExtra(OnePureCameraActivity.EXTRA_TITLE_TEXT, this.this$0.m12339m().getString(R.string.postpaid_registration_title));
        this.$this_apply.getLauncher().launch(intent);
    }
}