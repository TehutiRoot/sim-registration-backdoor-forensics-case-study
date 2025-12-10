package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCommonFragment$showDialogTakeMorePhotoCompose$1$2 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidCommonFragment$showDialogTakeMorePhotoCompose$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPostpaidCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidCommonFragment$showDialogTakeMorePhotoCompose$1$2(MrtrPostpaidCommonFragment mrtrPostpaidCommonFragment) {
        super(0);
        this.this$0 = mrtrPostpaidCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MrtrPostpaidRegistrationViewModel m6011p;
        MrtrPostpaidRegistrationActivity m6012o;
        this.this$0.m6014m();
        m6011p = this.this$0.m6011p();
        List<String> imageOptionalsName = m6011p.getImageOptionalsName();
        if (imageOptionalsName == null) {
            imageOptionalsName = CollectionsKt__CollectionsKt.emptyList();
        }
        m6012o = this.this$0.m6012o();
        Intent intent = new Intent(this.this$0.requireContext(), CameraActivity.class);
        intent.putExtra("EXTRA_IMAGE_NAME", (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) m6012o.getImageNameNotExistInMemoryOfApplication(imageOptionalsName)));
        this.this$0.startActivityForResult(intent, CameraActivity.REQUEST_CODE);
    }
}