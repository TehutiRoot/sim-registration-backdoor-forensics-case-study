package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.success.ESimPostpaidRegisSuccessFragment;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressAfterSubmitFragment$callAPI$1$1 */
/* loaded from: classes9.dex */
public final class ESimInProgressAfterSubmitFragment$callAPI$1$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ ESimViewModel $this_with;
    final /* synthetic */ ESimInProgressAfterSubmitFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressAfterSubmitFragment$callAPI$1$1$WhenMappings */
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
    public ESimInProgressAfterSubmitFragment$callAPI$1$1(ESimInProgressAfterSubmitFragment eSimInProgressAfterSubmitFragment, ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimInProgressAfterSubmitFragment;
        this.$this_with = eSimViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(ESimInProgressAfterSubmitFragment this$0) {
        ESimViewModel viewModel;
        ESimViewModel viewModel2;
        ESimActivity m7802o;
        ESimActivity m7802o2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        viewModel = this$0.getViewModel();
        viewModel.resetInProgressLiveData();
        viewModel2 = this$0.getViewModel();
        if (viewModel2.isPrepaid()) {
            m7802o2 = this$0.m7802o();
            m7802o2.replaceFragment(ESimPrepaidSuccessFragment.Companion.newInstance(), null);
            return;
        }
        m7802o = this$0.m7802o();
        m7802o.replaceFragment(ESimPostpaidRegisSuccessFragment.Companion.newInstance(), null);
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
            final ESimInProgressAfterSubmitFragment eSimInProgressAfterSubmitFragment = this.this$0;
            ESimViewModel eSimViewModel = this.$this_with;
            int i4 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i4 == 1) {
                eSimInProgressAfterSubmitFragment.f100359m = 0;
                progressBar = eSimInProgressAfterSubmitFragment.f100356j;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progress");
                    progressBar = null;
                }
                progressBar.setProgress(0);
                i = eSimInProgressAfterSubmitFragment.f100359m;
                eSimInProgressAfterSubmitFragment.f100359m = i + 1;
                i2 = eSimInProgressAfterSubmitFragment.f100359m;
                eSimInProgressAfterSubmitFragment.m7798s(i2, ESimInProgressAfterSubmitFragment$callAPI$1$1$1$1.INSTANCE);
            } else if (i4 == 2) {
                eSimInProgressAfterSubmitFragment.f100359m = (Intrinsics.areEqual(resource.getData(), "onComplete") ? eSimInProgressAfterSubmitFragment.m7801p() : eSimInProgressAfterSubmitFragment.f100359m) + 1;
                i3 = eSimInProgressAfterSubmitFragment.f100359m;
                eSimInProgressAfterSubmitFragment.m7798s(i3, new ESimInProgressAfterSubmitFragment$callAPI$1$1$1$2(resource, eSimInProgressAfterSubmitFragment));
            } else if (i4 != 3) {
            } else {
                String data = resource.getData();
                if (data == null) {
                    data = Constant.ServiceAPIName.Validate;
                }
                if (Intrinsics.areEqual(data, Constant.ServiceAPIName.Validate)) {
                    MrtrErrorDialog = eSimInProgressAfterSubmitFragment.MrtrErrorDialog(eSimInProgressAfterSubmitFragment.requireContext(), eSimViewModel.getInProgressError(), new ErrorDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.view.fragment.eSIM.a
                        @Override // th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox.Callback
                        public final void onButtonClick() {
                            ESimInProgressAfterSubmitFragment$callAPI$1$1.invoke$lambda$1$lambda$0(ESimInProgressAfterSubmitFragment.this);
                        }
                    });
                    MrtrErrorDialog.show();
                }
            }
        }
    }
}