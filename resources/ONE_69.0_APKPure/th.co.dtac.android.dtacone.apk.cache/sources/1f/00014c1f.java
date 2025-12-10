package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment$callAPI$1$1 */
/* loaded from: classes9.dex */
public final class ESimInProgressFragment$callAPI$1$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ ESimViewModel $this_with;
    final /* synthetic */ ESimInProgressFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment$callAPI$1$1$WhenMappings */
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
    public ESimInProgressFragment$callAPI$1$1(ESimInProgressFragment eSimInProgressFragment, ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimInProgressFragment;
        this.$this_with = eSimViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(ESimInProgressFragment this$0) {
        ESimViewModel viewModel;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        viewModel = this$0.getViewModel();
        viewModel.resetInProgressLiveData();
        FragmentManager fragmentManager = this$0.getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.popBackStack();
        }
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
        int i4;
        int m7790q;
        ErrorDialogBox MrtrErrorDialog;
        if (resource != null) {
            final ESimInProgressFragment eSimInProgressFragment = this.this$0;
            ESimViewModel eSimViewModel = this.$this_with;
            int i5 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i5 == 1) {
                eSimInProgressFragment.f100365k = 0;
                progressBar = eSimInProgressFragment.f100366l;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progress");
                    progressBar = null;
                }
                progressBar.setProgress(0);
                i = eSimInProgressFragment.f100365k;
                eSimInProgressFragment.f100365k = i + 1;
                i2 = eSimInProgressFragment.f100365k;
                eSimInProgressFragment.m7787t(i2, ESimInProgressFragment$callAPI$1$1$1$1.INSTANCE);
            } else if (i5 == 2) {
                if (Intrinsics.areEqual(resource.getData(), "onComplete")) {
                    m7790q = eSimInProgressFragment.m7790q();
                    eSimInProgressFragment.f100365k = m7790q + 1;
                } else {
                    i3 = eSimInProgressFragment.f100365k;
                    eSimInProgressFragment.f100365k = i3 + 1;
                }
                i4 = eSimInProgressFragment.f100365k;
                eSimInProgressFragment.m7787t(i4, new ESimInProgressFragment$callAPI$1$1$1$2(resource, eSimInProgressFragment));
            } else if (i5 != 3) {
            } else {
                String data = resource.getData();
                String str = Constant.ServiceAPIName.Validate;
                if (data == null) {
                    data = Constant.ServiceAPIName.Validate;
                }
                if (Intrinsics.areEqual(data, Constant.ServiceAPIName.Validate)) {
                    MrtrErrorDialog = eSimInProgressFragment.MrtrErrorDialog(eSimInProgressFragment.requireContext(), eSimViewModel.getInProgressError(), new ErrorDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.view.fragment.eSIM.c
                        @Override // th.p047co.dtac.android.dtacone.widget.dialog.ErrorDialogBox.Callback
                        public final void onButtonClick() {
                            ESimInProgressFragment$callAPI$1$1.invoke$lambda$1$lambda$0(ESimInProgressFragment.this);
                        }
                    });
                    MrtrErrorDialog.show();
                    return;
                }
                String data2 = resource.getData();
                if (data2 != null) {
                    str = data2;
                }
                eSimInProgressFragment.m7792o(str);
            }
        }
    }
}