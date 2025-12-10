package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdNumber$2$1 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdNumber$2$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Function1<String, Unit> $onValueChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdNumber$2$1(Function1<? super String, Unit> function1) {
        super(1);
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String replace = new Regex("[^0-9]").replace(it, "");
        if (replace.length() > 13) {
            replace = replace.substring(0, 13);
            Intrinsics.checkNotNullExpressionValue(replace, "substring(...)");
        }
        this.$onValueChange.invoke(replace);
    }
}