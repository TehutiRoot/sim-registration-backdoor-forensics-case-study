package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdText$2$1 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdText$2$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Function1<String, Unit> $onValueChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdText$2$1(Function1<? super String, Unit> function1) {
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
        String upperCase = new Regex("[^a-zA-Z0-9]").replace(it, "").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.$onValueChange.invoke(StringsKt___StringsKt.take(upperCase, 20));
    }
}