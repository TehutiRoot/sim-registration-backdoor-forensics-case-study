package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$UpPassFormScreen$8$2$3$1 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$UpPassFormScreen$8$2$3$1 extends Lambda implements Function1<CommonErrorResponse, Unit> {
    final /* synthetic */ MutableState<CommonErrorResponse> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isShowErrorUrl$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormScreenKt$UpPassFormScreen$8$2$3$1(MutableState<Boolean> mutableState, MutableState<CommonErrorResponse> mutableState2) {
        super(1);
        this.$isShowErrorUrl$delegate = mutableState;
        this.$error$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CommonErrorResponse commonErrorResponse) {
        invoke2(commonErrorResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable CommonErrorResponse commonErrorResponse) {
        UpPassFormScreenKt.m9136p(this.$isShowErrorUrl$delegate, true);
        if (commonErrorResponse != null) {
            UpPassFormScreenKt.m9129w(this.$error$delegate, commonErrorResponse);
        }
    }
}