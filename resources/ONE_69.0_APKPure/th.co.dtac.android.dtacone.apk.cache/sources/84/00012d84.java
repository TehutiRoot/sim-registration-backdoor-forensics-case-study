package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.VerifyKeyListItem;
import th.p047co.dtac.android.dtacone.model.error.OneValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.appOne.OneCampaignVerify;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDeviceSaleTrueVerifyCampaignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleTrueVerifyCampaignFragment.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueVerifyCampaignFragment$initView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,346:1\n1855#2,2:347\n*S KotlinDebug\n*F\n+ 1 OneDeviceSaleTrueVerifyCampaignFragment.kt\nth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueVerifyCampaignFragment$initView$1\n*L\n90#1:347,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueVerifyCampaignFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueVerifyCampaignFragment$initView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneDeviceSaleTrueVerifyCampaignFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueVerifyCampaignFragment$initView$1(OneDeviceSaleTrueVerifyCampaignFragment oneDeviceSaleTrueVerifyCampaignFragment) {
        super(0);
        this.this$0 = oneDeviceSaleTrueVerifyCampaignFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneDeviceSaleCampaignVerifyKeyAdapter oneDeviceSaleCampaignVerifyKeyAdapter;
        OneDeviceSaleTrueViewModel viewModel;
        List<VerifyKeyListItem> getVerifyKeyList;
        try {
            ArrayList arrayList = new ArrayList();
            oneDeviceSaleCampaignVerifyKeyAdapter = this.this$0.f89967l;
            if (oneDeviceSaleCampaignVerifyKeyAdapter != null && (getVerifyKeyList = oneDeviceSaleCampaignVerifyKeyAdapter.getGetVerifyKeyList()) != null) {
                for (VerifyKeyListItem verifyKeyListItem : getVerifyKeyList) {
                    new OneCampaignVerify().validate(verifyKeyListItem);
                    String verifyKey = verifyKeyListItem.getVerifyKey();
                    if (Intrinsics.areEqual(verifyKey, Constant.OnePostpaidVerifyKey.MSISDN)) {
                        String verifyKey2 = verifyKeyListItem.getVerifyKey();
                        String value = verifyKeyListItem.getValue();
                        arrayList.add(new OneCheckPrivilegeRequest.VerificationItem(verifyKey2, value != null ? StringExtKt.toRemoveDash(value) : null));
                    } else if (Intrinsics.areEqual(verifyKey, Constant.OnePostpaidVerifyKey.ThaiId)) {
                        String verifyKey3 = verifyKeyListItem.getVerifyKey();
                        String value2 = verifyKeyListItem.getValue();
                        arrayList.add(new OneCheckPrivilegeRequest.VerificationItem(verifyKey3, value2 != null ? StringExtKt.toRemoveAllSpecialCharacter(value2) : null));
                    } else {
                        arrayList.add(new OneCheckPrivilegeRequest.VerificationItem(verifyKeyListItem.getVerifyKey(), verifyKeyListItem.getValue()));
                    }
                }
            }
            viewModel = this.this$0.getViewModel();
            viewModel.getOneModel().setVerificationList(arrayList);
            viewModel.checkPrivilege(arrayList);
        } catch (OneValidatedRuleException e) {
            String value3 = e.getValue();
            if (value3 == null || value3.length() == 0) {
                this.this$0.showDialogOne(e.getResId());
                return;
            }
            OneDeviceSaleTrueVerifyCampaignFragment oneDeviceSaleTrueVerifyCampaignFragment = this.this$0;
            oneDeviceSaleTrueVerifyCampaignFragment.showDialogOne(oneDeviceSaleTrueVerifyCampaignFragment.getString(e.getResId(), e.getValue()));
        }
    }
}