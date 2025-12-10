package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter;
import th.p047co.dtac.android.dtacone.view.appOne.common.optional_camera.OnePureCameraActivity;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$showDialogTakeMorePhotoCompose$1$2 */
/* loaded from: classes10.dex */
public final class C15091xb1d78e30 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePrepaidRegistrationActivity $this_apply;
    final /* synthetic */ OnePrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15091xb1d78e30(OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment, OnePrepaidRegistrationActivity onePrepaidRegistrationActivity) {
        super(0);
        this.this$0 = onePrepaidNavigateToCommonFragment;
        this.$this_apply = onePrepaidRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePrepaidRegistrationActivity m10654r;
        OnePrepaidRegistrationActivity m10654r2;
        OnePrepaidRegistrationActivity m10654r3;
        DeleteBitmapPresenter deleteBitmapPresenter = this.this$0.getDeleteBitmapPresenter();
        List<String> optionalImages = this.$this_apply.getViewModel().getOptionalImages();
        if (optionalImages == null) {
            optionalImages = CollectionsKt__CollectionsKt.emptyList();
        }
        deleteBitmapPresenter.deleteAllOptionalImage(optionalImages);
        m10654r = this.this$0.m10654r();
        List<String> optionalImages2 = this.$this_apply.getViewModel().getOptionalImages();
        if (optionalImages2 == null) {
            optionalImages2 = CollectionsKt__CollectionsKt.emptyList();
        }
        m10654r2 = this.this$0.m10654r();
        Intent intent = new Intent(m10654r2, OnePureCameraActivity.class);
        intent.putExtra("EXTRA_CARD_TYPE", (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) m10654r.getImageNameNotExistInMemoryOfApplication(optionalImages2)));
        m10654r3 = this.this$0.m10654r();
        intent.putExtra(OnePureCameraActivity.EXTRA_TITLE_TEXT, m10654r3.getString(R.string.prepaid_registration_menu));
        this.$this_apply.getLauncher().launch(intent);
    }
}