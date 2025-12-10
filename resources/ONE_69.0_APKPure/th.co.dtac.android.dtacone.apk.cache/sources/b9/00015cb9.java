package th.p047co.dtac.android.dtacone.widget.compose.smartCard;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nIdCardReaderInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdCardReaderInfo.kt\nth/co/dtac/android/dtacone/widget/compose/smartCard/IdCardReaderInfoKt$IdCardReaderInfo$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,218:1\n63#2,5:219\n*S KotlinDebug\n*F\n+ 1 IdCardReaderInfo.kt\nth/co/dtac/android/dtacone/widget/compose/smartCard/IdCardReaderInfoKt$IdCardReaderInfo$2$1\n*L\n70#1:219,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$2$1 */
/* loaded from: classes9.dex */
public final class IdCardReaderInfoKt$IdCardReaderInfo$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Function0<Unit> $onStart;
    final /* synthetic */ Function0<Unit> $onStop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdCardReaderInfoKt$IdCardReaderInfo$2$1(Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$onStart = function0;
        this.$onStop = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$onStart.invoke();
        final Function0<Unit> function0 = this.$onStop;
        return new DisposableEffectResult() { // from class: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                function0.invoke();
            }
        };
    }
}