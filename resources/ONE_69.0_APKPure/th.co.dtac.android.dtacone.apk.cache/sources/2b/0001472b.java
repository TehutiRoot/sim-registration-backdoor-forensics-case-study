package th.p047co.dtac.android.dtacone.view.compose.upPass;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.IdDocOcrFaceCompareLivenessNavGraphKt$idDocOcrFaceCompareLivenessNavGraph$4$1$reCreateForm$1 */
/* loaded from: classes10.dex */
public final class C15725x2face58 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UpPassFormType $formType;
    final /* synthetic */ UpPassViewModel $upPassViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15725x2face58(UpPassViewModel upPassViewModel, UpPassFormType upPassFormType) {
        super(0);
        this.$upPassViewModel = upPassViewModel;
        this.$formType = upPassFormType;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$upPassViewModel.resetFormState();
        this.$upPassViewModel.createForm(this.$formType);
    }
}