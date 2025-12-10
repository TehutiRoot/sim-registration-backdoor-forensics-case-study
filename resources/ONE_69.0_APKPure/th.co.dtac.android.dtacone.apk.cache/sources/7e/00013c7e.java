package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$navigateNextToCommon$upPassFormOnSuccessCallback$1 */
/* loaded from: classes10.dex */
public final class C15087x552643c0 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ OnePrepaidNavigateToCommonFragment this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$navigateNextToCommon$upPassFormOnSuccessCallback$1$1 */
    /* loaded from: classes10.dex */
    public static final class C150881 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OnePrepaidNavigateToCommonFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C150881(OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment) {
            super(0);
            this.this$0 = onePrepaidNavigateToCommonFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.m10649w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15087x552643c0(OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = onePrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        UpPassViewModel m10653s;
        OnePrepaidValidationViewModel onePrepaidValidationViewModel;
        UpPassViewModel m10653s2;
        OnePrepaidValidationViewModel onePrepaidValidationViewModel2;
        Intrinsics.checkNotNullParameter(result, "result");
        OnePrepaidValidationViewModel onePrepaidValidationViewModel3 = null;
        if (result.getFormType() instanceof UpPassFormType.OcrFaceCompareLiveness) {
            if (!Intrinsics.areEqual(((UpPassFormType.OcrFaceCompareLiveness) result.getFormType()).isFaceRecognition(), Boolean.TRUE)) {
                this.this$0.m10660C();
                return;
            } else if (result.isCardReader()) {
                OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment = this.this$0;
                onePrepaidNavigateToCommonFragment.m10657o(new C150881(onePrepaidNavigateToCommonFragment));
                return;
            } else {
                FaceCompareResult faceCompare = result.getFaceCompare();
                if (faceCompare == null || !faceCompare.isSuccess()) {
                    m10653s2 = this.this$0.m10653s();
                    if (!m10653s2.is2ndLineFlow()) {
                        return;
                    }
                }
                onePrepaidValidationViewModel2 = this.this$0.f95768i;
                if (onePrepaidValidationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
                } else {
                    onePrepaidValidationViewModel3 = onePrepaidValidationViewModel2;
                }
                onePrepaidValidationViewModel3.mapCompareDocument(result);
                this.this$0.m10662A();
                return;
            }
        }
        FaceCompareResult faceCompare2 = result.getFaceCompare();
        if (faceCompare2 == null || !faceCompare2.isSuccess()) {
            m10653s = this.this$0.m10653s();
            if (!m10653s.is2ndLineFlow()) {
                return;
            }
        }
        onePrepaidValidationViewModel = this.this$0.f95768i;
        if (onePrepaidValidationViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
        } else {
            onePrepaidValidationViewModel3 = onePrepaidValidationViewModel;
        }
        onePrepaidValidationViewModel3.mapCompareDocument(result);
        this.this$0.m10662A();
    }
}