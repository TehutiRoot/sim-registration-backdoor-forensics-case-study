package th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_changesim.MrtrChangeSimActivity;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.ESimChangeSIMInProgressFragment$callAPI$1$1 */
/* loaded from: classes9.dex */
public final class ESimChangeSIMInProgressFragment$callAPI$1$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel $this_with;
    final /* synthetic */ ESimChangeSIMInProgressFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.ESimChangeSIMInProgressFragment$callAPI$1$1$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimChangeSIMInProgressFragment$callAPI$1$1(ESimChangeSIMInProgressFragment eSimChangeSIMInProgressFragment, MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = eSimChangeSIMInProgressFragment;
        this.$this_with = mrtrChangeSimViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(ESimChangeSIMInProgressFragment this$0) {
        MrtrChangeSimViewModel m6328r;
        MrtrChangeSimActivity m6330p;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m6328r = this$0.m6328r();
        m6328r.resetInProgressLiveData();
        m6330p = this$0.m6330p();
        m6330p.popBackStackForFragment();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        ProgressBar progressBar;
        int i;
        int i2;
        int i3;
        ErrorDialogBox MrtrErrorDialog;
        if (resource != null) {
            final ESimChangeSIMInProgressFragment eSimChangeSIMInProgressFragment = this.this$0;
            MrtrChangeSimViewModel mrtrChangeSimViewModel = this.$this_with;
            int i4 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i4 == 1) {
                eSimChangeSIMInProgressFragment.f101974m = 0;
                progressBar = eSimChangeSIMInProgressFragment.f101971j;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progress");
                    progressBar = null;
                }
                progressBar.setProgress(0);
                i = eSimChangeSIMInProgressFragment.f101974m;
                eSimChangeSIMInProgressFragment.f101974m = i + 1;
                i2 = eSimChangeSIMInProgressFragment.f101974m;
                eSimChangeSIMInProgressFragment.m6323w(i2, ESimChangeSIMInProgressFragment$callAPI$1$1$1$1.INSTANCE);
            } else if (i4 == 2) {
                eSimChangeSIMInProgressFragment.f101974m = (Intrinsics.areEqual(resource.getData(), "onComplete") ? eSimChangeSIMInProgressFragment.m6329q() : eSimChangeSIMInProgressFragment.f101974m) + 1;
                i3 = eSimChangeSIMInProgressFragment.f101974m;
                eSimChangeSIMInProgressFragment.m6323w(i3, new ESimChangeSIMInProgressFragment$callAPI$1$1$1$2(resource, eSimChangeSIMInProgressFragment));
            } else if (i4 != 3) {
            } else {
                String data = resource.getData();
                if (data == null) {
                    data = Constant.ServiceAPIName.Validate;
                }
                if (Intrinsics.areEqual(data, Constant.ServiceAPIName.Validate)) {
                    MrtrErrorDialog = eSimChangeSIMInProgressFragment.MrtrErrorDialog(eSimChangeSIMInProgressFragment.requireContext(), mrtrChangeSimViewModel.getInProgressError(), new ErrorDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.a
                        @Override // th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox.Callback
                        public final void onButtonClick() {
                            ESimChangeSIMInProgressFragment$callAPI$1$1.invoke$lambda$1$lambda$0(ESimChangeSIMInProgressFragment.this);
                        }
                    });
                    MrtrErrorDialog.show();
                }
            }
        }
    }
}