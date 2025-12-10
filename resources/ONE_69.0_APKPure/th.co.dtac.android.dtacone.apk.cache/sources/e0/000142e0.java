package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdNumber$1$1 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdNumber$1$1 extends Lambda implements Function1<KeyboardActionScope, Unit> {
    final /* synthetic */ Function0<Unit> $onNext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputIdCardScreenKt$InputIdNumber$1$1(Function0<Unit> function0) {
        super(1);
        this.$onNext = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
        invoke2(keyboardActionScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull KeyboardActionScope $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.$onNext.invoke();
    }
}