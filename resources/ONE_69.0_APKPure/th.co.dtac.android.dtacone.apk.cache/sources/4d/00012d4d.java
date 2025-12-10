package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Properties;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectPackageFragment$applyData$1$12 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueSelectPackageFragment$applyData$1$12 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel $this_apply;
    final /* synthetic */ OneDeviceSaleTrueSelectPackageFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectPackageFragment$applyData$1$12$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueSelectPackageFragment$applyData$1$12(OneDeviceSaleTrueSelectPackageFragment oneDeviceSaleTrueSelectPackageFragment, OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueSelectPackageFragment;
        this.$this_apply = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        OneDeviceSaleTrueActivity m14974s;
        DataItem dataItem;
        Properties properties;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSaleTrueSelectPackageFragment oneDeviceSaleTrueSelectPackageFragment = this.this$0;
        OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel = this.$this_apply;
        if (WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()] == 1) {
            oneDeviceSaleTrueSelectPackageFragment.dismissLoading();
            List<DataItem> propositionList = oneDeviceSaleTrueViewModel.getOneModel().getPropositionList();
            String str = (propositionList == null || (dataItem = propositionList.get(0)) == null || (properties = dataItem.getProperties()) == null || (str = properties.getTERM()) == null) ? "0" : "0";
            m14974s = oneDeviceSaleTrueSelectPackageFragment.m14974s();
            m14974s.showDialogConfirmTakeReferenceDoc(new OneDeviceSaleTrueSelectPackageFragment$applyData$1$12$1$1(oneDeviceSaleTrueSelectPackageFragment), new OneDeviceSaleTrueSelectPackageFragment$applyData$1$12$1$2(str, oneDeviceSaleTrueViewModel));
        }
    }
}