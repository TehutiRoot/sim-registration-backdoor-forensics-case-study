package th.p047co.dtac.android.dtacone.presenter.prepaid;

import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.presenter.prepaid.OCRPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOCRPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OCRPresenter.kt\nth/co/dtac/android/dtacone/presenter/prepaid/OCRPresenter$getBirthdayFromOCRPostpaid$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n1#2:405\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter$getBirthdayFromOCRPostpaid$2 */
/* loaded from: classes8.dex */
public final class OCRPresenter$getBirthdayFromOCRPostpaid$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OCRPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRPresenter$getBirthdayFromOCRPostpaid$2(OCRPresenter oCRPresenter) {
        super(1);
        this.this$0 = oCRPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        OCRPresenter.View view;
        OCRPresenter.View view2;
        view = this.this$0.f86158c;
        OCRPresenter.View view3 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
        th2.getMessage();
        view2 = this.this$0.f86158c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        view3.onOCRFail();
    }
}