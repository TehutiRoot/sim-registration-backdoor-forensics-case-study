package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdCardScreen$3$3 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdCardScreen$3$3 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ boolean $hasOtherId;
    final /* synthetic */ List<String> $idCardList;
    final /* synthetic */ String $idCardType;
    final /* synthetic */ List<Boolean> $isCheckedExpireList;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedExpiredChange;
    final /* synthetic */ Function1<String, Unit> $onIdTypeChange;
    final /* synthetic */ Function1<String, Unit> $onIdValueChange;
    final /* synthetic */ Function0<Unit> $onValidateInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdCardScreen$3$3(boolean z, String str, List<String> list, List<Boolean> list2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super Boolean, Unit> function13, Function0<Unit> function0, int i, int i2) {
        super(3);
        this.$hasOtherId = z;
        this.$idCardType = str;
        this.$idCardList = list;
        this.$isCheckedExpireList = list2;
        this.$onIdTypeChange = function1;
        this.$onIdValueChange = function12;
        this.$onCheckedExpiredChange = function13;
        this.$onValidateInput = function0;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1642772612, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreen.<anonymous>.<anonymous> (InputIdCardScreen.kt:117)");
        }
        boolean z = this.$hasOtherId;
        String str = this.$idCardType;
        List<String> list = this.$idCardList;
        List<Boolean> list2 = this.$isCheckedExpireList;
        Function1<String, Unit> function1 = this.$onIdTypeChange;
        Function1<String, Unit> function12 = this.$onIdValueChange;
        Function1<Boolean, Unit> function13 = this.$onCheckedExpiredChange;
        Function0<Unit> function0 = this.$onValidateInput;
        int i2 = this.$$dirty;
        int i3 = this.$$dirty1;
        InputIdCardScreenKt.m9535a(z, str, list, list2, function1, function12, function13, function0, composer, ((i2 >> 6) & 112) | (i2 & 14) | 4608 | ((i3 << 6) & 57344) | ((i3 << 6) & 458752) | ((i3 << 6) & 3670016) | ((i3 << 6) & 29360128));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}