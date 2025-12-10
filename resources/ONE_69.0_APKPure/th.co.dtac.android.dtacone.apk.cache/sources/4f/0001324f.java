package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "isUpdate", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpScanSimFragment$setupViewModel$1$5 */
/* loaded from: classes10.dex */
public final class OneMnpScanSimFragment$setupViewModel$1$5 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    final /* synthetic */ OneMnpScanSimFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpScanSimFragment$setupViewModel$1$5(OneMnpScanSimFragment oneMnpScanSimFragment, OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneMnpScanSimFragment;
        this.$this_apply = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean isUpdate) {
        Intrinsics.checkNotNullExpressionValue(isUpdate, "isUpdate");
        if (isUpdate.booleanValue()) {
            this.this$0.onStartCamera();
            this.$this_apply.getResumeScanSimLiveData().setValue(Boolean.FALSE);
        }
    }
}