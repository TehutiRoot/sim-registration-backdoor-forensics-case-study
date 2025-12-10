package th.p047co.dtac.android.dtacone.view.compose.upPassDemo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "<anonymous parameter 1>", "Lkotlin/Function0;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.UpPassDemoNavGraphKt$upPassDemoNavGraph$9 */
/* loaded from: classes10.dex */
public final class UpPassDemoNavGraphKt$upPassDemoNavGraph$9 extends Lambda implements Function2<UpPassFormResult, Function0<? extends Unit>, Unit> {
    public static final UpPassDemoNavGraphKt$upPassDemoNavGraph$9 INSTANCE = new UpPassDemoNavGraphKt$upPassDemoNavGraph$9();

    public UpPassDemoNavGraphKt$upPassDemoNavGraph$9() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult upPassFormResult, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(upPassFormResult, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(function0, "<anonymous parameter 1>");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult, Function0<? extends Unit> function0) {
        invoke2(upPassFormResult, (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }
}