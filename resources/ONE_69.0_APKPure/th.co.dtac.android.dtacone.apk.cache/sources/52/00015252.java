package th.p047co.dtac.android.dtacone.view.fragment.multi_sim.one_common;

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
import th.p047co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment$showDialogTakeMorePhotoCompose$1$2 */
/* loaded from: classes9.dex */
public final class C16421x722218f8 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrMultiSimNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16421x722218f8(MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment) {
        super(0);
        this.this$0 = mrtrMultiSimNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MrtrPrepaidMultiSimActivity m4261o;
        MrtrPrepaidMultiSimActivity m4261o2;
        List<String> emptyList;
        UpdatePrepaidOptionalImage optionalImage;
        m4261o = this.this$0.m4261o();
        m4261o2 = this.this$0.m4261o();
        PrepaidConfig prepaidConfig = m4261o2.getViewModel().getPrepaidConfig();
        if (prepaidConfig == null || (optionalImage = prepaidConfig.getOptionalImage()) == null || (emptyList = optionalImage.getOptionalImages()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intent intent = new Intent(this.this$0.getContext(), PureCameraActivity.class);
        intent.putExtra("EXTRA_CARD_TYPE", (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) m4261o.getImageNameNotExistInMemoryOfApplication(emptyList)));
        this.this$0.startActivityForResult(intent, 10);
    }
}