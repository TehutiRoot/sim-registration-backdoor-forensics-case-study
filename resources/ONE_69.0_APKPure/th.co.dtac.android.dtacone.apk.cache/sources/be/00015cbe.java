package th.p047co.dtac.android.dtacone.widget.compose.smartCard;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.IdCardReaderState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$4 */
/* loaded from: classes9.dex */
public final class IdCardReaderInfoKt$IdCardReaderInfo$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ IdCardReaderState $cardReaderState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onFinished;
    final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCard;
    final /* synthetic */ Function0<Unit> $onStart;
    final /* synthetic */ Function0<Unit> $onStop;
    final /* synthetic */ SharedFlow<IdCardInformationCollection> $onSuccessReadFinish;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdCardReaderInfoKt$IdCardReaderInfo$4(IdCardReaderState idCardReaderState, Function0<Unit> function0, Function0<Unit> function02, SharedFlow<? extends IdCardInformationCollection> sharedFlow, Function1<? super IdCardInformationCollection, Unit> function1, Function0<Unit> function03, Modifier modifier, int i, int i2) {
        super(2);
        this.$cardReaderState = idCardReaderState;
        this.$onStart = function0;
        this.$onStop = function02;
        this.$onSuccessReadFinish = sharedFlow;
        this.$onSaveIdCard = function1;
        this.$onFinished = function03;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        IdCardReaderInfoKt.IdCardReaderInfo(this.$cardReaderState, this.$onStart, this.$onStop, this.$onSuccessReadFinish, this.$onSaveIdCard, this.$onFinished, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}