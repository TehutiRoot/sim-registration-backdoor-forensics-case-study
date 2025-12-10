package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import androidx.constraintlayout.widget.Group;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ImeiSectionModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ImeiSectionModel;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$initView$1$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$initView$1$1 extends Lambda implements Function1<ImeiSectionModel, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$initView$1$1(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImeiSectionModel imeiSectionModel) {
        invoke2(imeiSectionModel);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ImeiSectionModel imeiSectionModel) {
        Group group;
        Group group2;
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        Group group3;
        Group group4;
        Group group5 = null;
        if (imeiSectionModel.getImei().length() != 0 && !Intrinsics.areEqual(imeiSectionModel.getImei(), HelpFormatter.DEFAULT_OPT_PREFIX)) {
            oneFontTextView = this.this$0.f90253s;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewIMEI");
                oneFontTextView = null;
            }
            oneFontTextView.setText(imeiSectionModel.getImei());
            oneFontTextView2 = this.this$0.f90254t;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewBrand");
                oneFontTextView2 = null;
            }
            oneFontTextView2.setText(imeiSectionModel.getBrandModel());
            group3 = this.this$0.f90251q;
            if (group3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noIMEIViewGroup");
                group3 = null;
            }
            ViewVisibleExtKt.toGone(group3);
            group4 = this.this$0.f90250p;
            if (group4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoIMEIViewGroup");
            } else {
                group5 = group4;
            }
            ViewVisibleExtKt.toVisible(group5);
            return;
        }
        group = this.this$0.f90251q;
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noIMEIViewGroup");
            group = null;
        }
        ViewVisibleExtKt.toVisible(group);
        group2 = this.this$0.f90250p;
        if (group2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("infoIMEIViewGroup");
        } else {
            group5 = group2;
        }
        ViewVisibleExtKt.toGone(group5);
    }
}