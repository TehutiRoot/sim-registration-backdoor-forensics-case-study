package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OneFullPDFFragment;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueBlackListFragment$setupView$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueBlackListFragment$setupView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneDeviceSaleTrueBlackListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueBlackListFragment$setupView$1(OneDeviceSaleTrueBlackListFragment oneDeviceSaleTrueBlackListFragment) {
        super(0);
        this.this$0 = oneDeviceSaleTrueBlackListFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneDeviceSaleTrueActivity m15065n;
        OneDeviceSaleTrueViewModel viewModel;
        m15065n = this.this$0.m15065n();
        OneFullPDFFragment.Companion companion = OneFullPDFFragment.Companion;
        viewModel = this.this$0.getViewModel();
        String pdfData = viewModel.getOneModel().getPdfData();
        if (pdfData == null) {
            pdfData = "";
        }
        m15065n.replaceFragment(companion.newInstance(pdfData), null);
    }
}