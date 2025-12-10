package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.ComposableSingletons$InputIdCardScreenKt$lambda-2$1$7$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$InputIdCardScreenKt$lambda2$1$7$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<String> $idCardType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$InputIdCardScreenKt$lambda2$1$7$1(MutableState<String> mutableState) {
        super(1);
        this.$idCardType$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$idCardType$delegate.setValue(it);
    }
}