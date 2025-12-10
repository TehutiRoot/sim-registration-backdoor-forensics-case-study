package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;
import th.p047co.dtac.android.dtacone.view.activity.PureCameraActivity;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimCommonFragment$showDialogTakeMorePhotoCompose$1$1 */
/* loaded from: classes9.dex */
public final class ESimCommonFragment$showDialogTakeMorePhotoCompose$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ESimActivity $this_apply;
    final /* synthetic */ ESimCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimCommonFragment$showDialogTakeMorePhotoCompose$1$1(ESimCommonFragment eSimCommonFragment, ESimActivity eSimActivity) {
        super(0);
        this.this$0 = eSimCommonFragment;
        this.$this_apply = eSimActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<String> imageOptionalsName;
        ESimActivity m7826o;
        UpdatePrepaidOptionalImage optionalImage;
        this.this$0.m7828m();
        if (this.$this_apply.getESimViewModel().isPrepaid()) {
            PrepaidConfig prepaidConfig = this.$this_apply.getESimViewModel().getPrepaidConfig();
            if (prepaidConfig == null || (optionalImage = prepaidConfig.getOptionalImage()) == null || (imageOptionalsName = optionalImage.getOptionalImages()) == null) {
                imageOptionalsName = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            imageOptionalsName = this.$this_apply.getESimPostpaidViewModel().getImageOptionalsName();
            if (imageOptionalsName == null) {
                imageOptionalsName = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        m7826o = this.this$0.m7826o();
        Intent intent = new Intent(this.this$0.requireContext(), PureCameraActivity.class);
        intent.putExtra("EXTRA_CARD_TYPE", (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) m7826o.getImageNameNotExistInMemoryOfApplication(imageOptionalsName)));
        this.this$0.startActivityForResult(intent, 10);
    }
}