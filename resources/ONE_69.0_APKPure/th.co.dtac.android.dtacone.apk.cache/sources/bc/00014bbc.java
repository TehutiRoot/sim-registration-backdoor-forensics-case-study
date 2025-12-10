package th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.self_update.RtrAddressTag;
import th.p047co.dtac.android.dtacone.util.validation.self_update.AddressValidate;
import th.p047co.dtac.android.dtacone.util.validation.self_update.FirstNameValidate;
import th.p047co.dtac.android.dtacone.util.validation.self_update.HomeAddressValidate;
import th.p047co.dtac.android.dtacone.util.validation.self_update.LastNameValidate;
import th.p047co.dtac.android.dtacone.util.validation.self_update.PassportValidate;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ReceiptInfo;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSaleInputAddressPassportFragment$onStart$1 */
/* loaded from: classes9.dex */
public final class DeviceSaleInputAddressPassportFragment$onStart$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ DeviceSaleInputAddressPassportFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleInputAddressPassportFragment$onStart$1(DeviceSaleInputAddressPassportFragment deviceSaleInputAddressPassportFragment) {
        super(1);
        this.this$0 = deviceSaleInputAddressPassportFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        DtacClearableEditText dtacClearableEditText;
        DtacClearableEditText dtacClearableEditText2;
        DtacClearableEditText dtacClearableEditText3;
        AddressItemData m7968L;
        AddressItemData m7979A;
        AddressItemData m7975E;
        AddressItemData m7976D;
        DtacClearableEditText dtacClearableEditText4;
        DtacClearableEditText dtacClearableEditText5;
        DtacFontTextView dtacFontTextView;
        DtacFontTextView dtacFontTextView2;
        DtacFontTextView dtacFontTextView3;
        DtacFontTextView dtacFontTextView4;
        DtacClearableEditText dtacClearableEditText6;
        DtacClearableEditText dtacClearableEditText7;
        DtacClearableEditText dtacClearableEditText8;
        try {
            PassportValidate passportValidate = new PassportValidate();
            dtacClearableEditText = this.this$0.f100160i;
            DtacClearableEditText dtacClearableEditText9 = null;
            if (dtacClearableEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtOtherCard");
                dtacClearableEditText = null;
            }
            passportValidate.validate(String.valueOf(dtacClearableEditText.getText()));
            FirstNameValidate firstNameValidate = new FirstNameValidate();
            dtacClearableEditText2 = this.this$0.f100161j;
            if (dtacClearableEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtName");
                dtacClearableEditText2 = null;
            }
            firstNameValidate.validate(String.valueOf(dtacClearableEditText2.getText()));
            LastNameValidate lastNameValidate = new LastNameValidate();
            dtacClearableEditText3 = this.this$0.f100162k;
            if (dtacClearableEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSureName");
                dtacClearableEditText3 = null;
            }
            lastNameValidate.validate(String.valueOf(dtacClearableEditText3.getText()));
            m7968L = this.this$0.m7968L();
            m7979A = this.this$0.m7979A();
            m7975E = this.this$0.m7975E();
            m7976D = this.this$0.m7976D();
            RtrAddressTag rtrAddressTag = new RtrAddressTag(m7968L, m7979A, m7975E, m7976D);
            HomeAddressValidate homeAddressValidate = new HomeAddressValidate();
            dtacClearableEditText4 = this.this$0.f100163l;
            if (dtacClearableEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtAddress");
                dtacClearableEditText4 = null;
            }
            homeAddressValidate.validate(String.valueOf(dtacClearableEditText4.getText()));
            new AddressValidate().validate(rtrAddressTag);
            DeviceSaleViewModel deviceSaleViewModel = this.this$0.getDeviceSaleViewModel();
            dtacClearableEditText5 = this.this$0.f100163l;
            if (dtacClearableEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtAddress");
                dtacClearableEditText5 = null;
            }
            String valueOf = String.valueOf(dtacClearableEditText5.getText());
            dtacFontTextView = this.this$0.f100166o;
            if (dtacFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSubDistrict");
                dtacFontTextView = null;
            }
            String obj = dtacFontTextView.getText().toString();
            dtacFontTextView2 = this.this$0.f100164m;
            if (dtacFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvProvince");
                dtacFontTextView2 = null;
            }
            String obj2 = dtacFontTextView2.getText().toString();
            dtacFontTextView3 = this.this$0.f100165n;
            if (dtacFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDistrict");
                dtacFontTextView3 = null;
            }
            String obj3 = dtacFontTextView3.getText().toString();
            dtacFontTextView4 = this.this$0.f100167p;
            if (dtacFontTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPostcode");
                dtacFontTextView4 = null;
            }
            String obj4 = dtacFontTextView4.getText().toString();
            dtacClearableEditText6 = this.this$0.f100160i;
            if (dtacClearableEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtOtherCard");
                dtacClearableEditText6 = null;
            }
            String valueOf2 = String.valueOf(dtacClearableEditText6.getText());
            dtacClearableEditText7 = this.this$0.f100161j;
            if (dtacClearableEditText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtName");
                dtacClearableEditText7 = null;
            }
            String valueOf3 = String.valueOf(dtacClearableEditText7.getText());
            dtacClearableEditText8 = this.this$0.f100162k;
            if (dtacClearableEditText8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSureName");
            } else {
                dtacClearableEditText9 = dtacClearableEditText8;
            }
            deviceSaleViewModel.saveReceiptOther(new ReceiptInfo(valueOf, obj, obj2, obj3, obj4, "15", valueOf2, null, null, valueOf3, String.valueOf(dtacClearableEditText9.getText()), false, 384, null));
        } catch (ValidatedRuleException e) {
            this.this$0.showDialog(e.getResId());
        }
    }
}