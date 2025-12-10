package th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_mnp.MrtrMnpActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpNavigateToCommonFragment$showDialogTakeMorePhotoCompose$1$2 */
/* loaded from: classes9.dex */
public final class C16208xb6ec9e2d extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrMnpActivity $this_apply;
    final /* synthetic */ MrtrMnpNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16208xb6ec9e2d(MrtrMnpActivity mrtrMnpActivity, MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment) {
        super(0);
        this.$this_apply = mrtrMnpActivity;
        this.this$0 = mrtrMnpNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        MrtrMnpActivity m6201o;
        List<String> imageOptionalsName = this.$this_apply.getMrtrMnpViewModel().getImageOptionalsName();
        if (imageOptionalsName != null) {
            m6201o = this.this$0.m6201o();
            str = (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) m6201o.getImageNameNotExistInMemoryOfApplication(imageOptionalsName));
        } else {
            str = null;
        }
        Intent intent = new Intent(this.this$0.getContext(), CameraActivity.class);
        intent.putExtra("EXTRA_IMAGE_NAME", str);
        this.this$0.startActivityForResult(intent, CameraActivity.REQUEST_CODE);
    }
}