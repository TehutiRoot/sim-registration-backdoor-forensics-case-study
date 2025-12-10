package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdCardScreen$3$2 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdCardScreen$3$2 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ IdCardReaderState $cardReaderState;
    final /* synthetic */ Function0<Unit> $gotoTakeMorePhoto;
    final /* synthetic */ Function0<Unit> $gotoTolPackage;
    final /* synthetic */ Function1<String, Unit> $onIdTypeChange;
    final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCardInfo;
    final /* synthetic */ Function0<Unit> $onStartFetchingCardDataLoop;
    final /* synthetic */ Function0<Unit> $onStopFetchingCardDataLoop;
    final /* synthetic */ SharedFlow<IdCardInformationCollection> $onSuccessReadFinish;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdCardScreen$3$2(IdCardReaderState idCardReaderState, Function0<Unit> function0, Function0<Unit> function02, SharedFlow<? extends IdCardInformationCollection> sharedFlow, Function1<? super String, Unit> function1, Function1<? super IdCardInformationCollection, Unit> function12, Function0<Unit> function03, Function0<Unit> function04, int i, int i2) {
        super(3);
        this.$cardReaderState = idCardReaderState;
        this.$onStartFetchingCardDataLoop = function0;
        this.$onStopFetchingCardDataLoop = function02;
        this.$onSuccessReadFinish = sharedFlow;
        this.$onIdTypeChange = function1;
        this.$onSaveIdCardInfo = function12;
        this.$gotoTolPackage = function03;
        this.$gotoTakeMorePhoto = function04;
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
            ComposerKt.traceEventStart(-1984648805, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreen.<anonymous>.<anonymous> (InputIdCardScreen.kt:105)");
        }
        IdCardReaderState idCardReaderState = this.$cardReaderState;
        Function0<Unit> function0 = this.$onStartFetchingCardDataLoop;
        Function0<Unit> function02 = this.$onStopFetchingCardDataLoop;
        SharedFlow<IdCardInformationCollection> sharedFlow = this.$onSuccessReadFinish;
        Function1<String, Unit> function1 = this.$onIdTypeChange;
        Function1<IdCardInformationCollection, Unit> function12 = this.$onSaveIdCardInfo;
        Function0<Unit> function03 = this.$gotoTolPackage;
        Function0<Unit> function04 = this.$gotoTakeMorePhoto;
        int i2 = this.$$dirty;
        int i3 = this.$$dirty1;
        IdCardReaderScreenKt.SmartCardReaderInfo(idCardReaderState, function0, function02, sharedFlow, function1, function12, function03, function04, composer, ((i2 >> 21) & 896) | ((i2 >> 18) & 14) | 4096 | ((i2 >> 21) & 112) | ((i3 << 6) & 57344) | ((i3 << 12) & 458752) | ((i3 >> 3) & 3670016) | ((i3 << 3) & 29360128));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}