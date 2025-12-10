package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;
import th.p047co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimPrepaidSmartCardFragment$setUpViewModel$1$2 */
/* loaded from: classes9.dex */
public final class ESimPrepaidSmartCardFragment$setUpViewModel$1$2 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ ESimViewModel $this_apply;
    final /* synthetic */ ESimPrepaidSmartCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPrepaidSmartCardFragment$setUpViewModel$1$2(ESimPrepaidSmartCardFragment eSimPrepaidSmartCardFragment, ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimPrepaidSmartCardFragment;
        this.$this_apply = eSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        List<String> emptyList;
        ESimActivity m7776r;
        UpdatePrepaidOptionalImage optionalImage;
        Intrinsics.checkNotNullParameter(it, "it");
        DeleteBitmapPresenter deleteBitmapPresenter = this.this$0.getDeleteBitmapPresenter();
        PrepaidConfig prepaidConfig = this.$this_apply.getPrepaidConfig();
        if (prepaidConfig == null || (optionalImage = prepaidConfig.getOptionalImage()) == null || (emptyList = optionalImage.getOptionalImages()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        deleteBitmapPresenter.deleteAllOptionalImage(emptyList);
        this.this$0.m7771w("Capture ID card");
        m7776r = this.this$0.m7776r();
        m7776r.replaceFragment(it.buildFragment(), it.getTag());
    }
}