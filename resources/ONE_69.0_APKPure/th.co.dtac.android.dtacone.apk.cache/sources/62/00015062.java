package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device.MrtrPostpaidExtraAdvanceFragment$showDialogTakeMorePhotoCompose$1$2 */
/* loaded from: classes9.dex */
final class C16326xf8e7e1cf extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPostpaidRegistrationActivity $this_apply;
    final /* synthetic */ MrtrPostpaidExtraAdvanceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16326xf8e7e1cf(MrtrPostpaidRegistrationActivity mrtrPostpaidRegistrationActivity, MrtrPostpaidExtraAdvanceFragment mrtrPostpaidExtraAdvanceFragment) {
        super(0);
        this.$this_apply = mrtrPostpaidRegistrationActivity;
        this.this$0 = mrtrPostpaidExtraAdvanceFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ActivityResultLauncher activityResultLauncher;
        List<String> imageOptionalsName = this.$this_apply.getViewModel().getImageOptionalsName();
        String str = imageOptionalsName != null ? (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) this.this$0.m5295n().getImageNameNotExistInMemoryOfApplication(imageOptionalsName)) : null;
        Intent intent = new Intent(this.this$0.getContext(), CameraActivity.class);
        intent.putExtra("EXTRA_IMAGE_NAME", str);
        activityResultLauncher = this.this$0.f103003m;
        activityResultLauncher.launch(intent);
    }
}