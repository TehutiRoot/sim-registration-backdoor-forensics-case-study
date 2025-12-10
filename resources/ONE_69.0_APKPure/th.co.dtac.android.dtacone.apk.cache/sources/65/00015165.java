package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common;

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
import th.p047co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter;
import th.p047co.dtac.android.dtacone.view.activity.PureCameraActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_registration.MrtrPrepaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common.MrtrPrepaidNavigateToCommonFragment$showDialogTakeMorePhotoCompose$1$2 */
/* loaded from: classes9.dex */
public final class C16376x9ee26fad extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPrepaidRegistrationActivity $this_apply;
    final /* synthetic */ MrtrPrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16376x9ee26fad(MrtrPrepaidNavigateToCommonFragment mrtrPrepaidNavigateToCommonFragment, MrtrPrepaidRegistrationActivity mrtrPrepaidRegistrationActivity) {
        super(0);
        this.this$0 = mrtrPrepaidNavigateToCommonFragment;
        this.$this_apply = mrtrPrepaidRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MrtrPrepaidRegistrationViewModel m4812q;
        List<String> emptyList;
        MrtrPrepaidRegistrationActivity m4814o;
        MrtrPrepaidRegistrationViewModel m4812q2;
        List<String> emptyList2;
        MrtrPrepaidRegistrationActivity m4814o2;
        UpdatePrepaidOptionalImage optionalImage;
        UpdatePrepaidOptionalImage optionalImage2;
        DeleteBitmapPresenter deleteBitmapPresenter = this.this$0.getDeleteBitmapPresenter();
        m4812q = this.this$0.m4812q();
        PrepaidConfig prepaidConfig = m4812q.getPrepaidConfig();
        if (prepaidConfig == null || (optionalImage2 = prepaidConfig.getOptionalImage()) == null || (emptyList = optionalImage2.getOptionalImages()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        deleteBitmapPresenter.deleteAllOptionalImage(emptyList);
        m4814o = this.this$0.m4814o();
        m4812q2 = this.this$0.m4812q();
        PrepaidConfig prepaidConfig2 = m4812q2.getPrepaidConfig();
        if (prepaidConfig2 == null || (optionalImage = prepaidConfig2.getOptionalImage()) == null || (emptyList2 = optionalImage.getOptionalImages()) == null) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        m4814o2 = this.this$0.m4814o();
        Intent intent = new Intent(m4814o2, PureCameraActivity.class);
        intent.putExtra("EXTRA_CARD_TYPE", (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) m4814o.getImageNameNotExistInMemoryOfApplication(emptyList2)));
        this.$this_apply.getLauncher().launch(intent);
    }
}