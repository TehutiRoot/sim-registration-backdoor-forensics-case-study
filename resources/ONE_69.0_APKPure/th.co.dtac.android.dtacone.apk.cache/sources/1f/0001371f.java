package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.ValidateSimBarcodeData;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.appOne.OneBirthDayBelowEighteenAge;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePostpaidSummaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidSummaryFragment.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidSummaryFragment$actionClick$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,950:1\n766#2:951\n857#2,2:952\n1#3:954\n*S KotlinDebug\n*F\n+ 1 OnePostpaidSummaryFragment.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidSummaryFragment$actionClick$3\n*L\n709#1:951\n709#1:952,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidSummaryFragment$actionClick$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidSummaryFragment$actionClick$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostpaidSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidSummaryFragment$actionClick$3(OnePostpaidSummaryFragment onePostpaidSummaryFragment) {
        super(0);
        this.this$0 = onePostpaidSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String string;
        OnePostpaidRegistrationActivity m12388z;
        ArrayList arrayList;
        OneAddressMailingData m12392v;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        ValidateSimBarcodeData data;
        String birthDate;
        String thaiDateToThaiDateValidateFormat;
        try {
            List<String> imageOptionalsName = this.this$0.getViewModelRegistration().getImageOptionalsName();
            OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2 = null;
            if (imageOptionalsName != null) {
                OnePostpaidSummaryFragment onePostpaidSummaryFragment = this.this$0;
                arrayList = new ArrayList();
                for (Object obj : imageOptionalsName) {
                    if (onePostpaidSummaryFragment.getFileUtil().isFileExist((String) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            m12392v = this.this$0.m12392v();
            if (m12392v != null && (birthDate = m12392v.getBirthDate()) != null && (thaiDateToThaiDateValidateFormat = DateFormatExtKt.thaiDateToThaiDateValidateFormat(birthDate)) != null && OneBirthDayBelowEighteenAge.Companion.isBelowEighteenAge(thaiDateToThaiDateValidateFormat)) {
                if ((arrayList != null ? arrayList.size() : 0) < this.this$0.getViewModelRegistration().getBelowEighteenDocMin()) {
                    throw new ValidatedRuleException(R.string.one_below_eighteen_age_message);
                }
            }
            if (this.this$0.getViewModelRegistration().isTrue()) {
                this.this$0.getViewModelRegistration().checkLogicCallReserveForSummary();
                return;
            }
            OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = this.this$0.getViewModelRegistration().getValidateSimBarcodeResponse();
            if (Intrinsics.areEqual((validateSimBarcodeResponse == null || (data = validateSimBarcodeResponse.getData()) == null) ? null : data.isNiceNumber(), Boolean.TRUE)) {
                this.this$0.m12421B();
                return;
            }
            oneConsentNonTelcoViewModel = this.this$0.f93715S0;
            if (oneConsentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            } else {
                oneConsentNonTelcoViewModel2 = oneConsentNonTelcoViewModel;
            }
            oneConsentNonTelcoViewModel2.getConsentNonTelco(Constant.ConsentDomain.POSTPAID_REGISTRATION);
        } catch (ValidatedRuleException e) {
            int resId = e.getResId();
            int i = R.string.one_below_eighteen_age_message;
            if (resId == i) {
                OnePostpaidSummaryFragment onePostpaidSummaryFragment2 = this.this$0;
                string = onePostpaidSummaryFragment2.getString(i, String.valueOf(onePostpaidSummaryFragment2.getViewModelRegistration().getBelowEighteenDocMin()));
            } else {
                string = this.this$0.getString(e.getResId());
            }
            Intrinsics.checkNotNullExpressionValue(string, "if (e.resId == R.string.…  else getString(e.resId)");
            m12388z = this.this$0.m12388z();
            m12388z.setDialogMessage(string);
            m12388z.setOnDismissDialog(OnePostpaidSummaryFragment$actionClick$3$2$1.INSTANCE);
            m12388z.get_showDialogMessageState().setValue(Boolean.TRUE);
        }
    }
}