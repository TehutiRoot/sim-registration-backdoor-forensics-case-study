package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdCardScreen$4 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdCardScreen$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $cardReaderMode;
    final /* synthetic */ IdCardReaderState $cardReaderState;
    final /* synthetic */ Function0<Unit> $gotoTakeMorePhoto;
    final /* synthetic */ Function0<Unit> $gotoTolPackage;
    final /* synthetic */ boolean $hasOtherId;
    final /* synthetic */ List<String> $idCardList;
    final /* synthetic */ String $idCardType;
    final /* synthetic */ boolean $isCardReaderConnected;
    final /* synthetic */ List<Boolean> $isCheckedExpireList;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedExpiredChange;
    final /* synthetic */ Function1<String, Unit> $onIdTypeChange;
    final /* synthetic */ Function1<String, Unit> $onIdValueChange;
    final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCardInfo;
    final /* synthetic */ Function0<Unit> $onStartFetchingCardDataLoop;
    final /* synthetic */ Function0<Unit> $onStopFetchingCardDataLoop;
    final /* synthetic */ SharedFlow<IdCardInformationCollection> $onSuccessReadFinish;
    final /* synthetic */ Function1<Boolean, Unit> $onSwitchCardReaderMode;
    final /* synthetic */ Function0<Unit> $onValidateInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdCardScreen$4(boolean z, boolean z2, boolean z3, String str, List<String> list, List<Boolean> list2, IdCardReaderState idCardReaderState, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, SharedFlow<? extends IdCardInformationCollection> sharedFlow, Function1<? super IdCardInformationCollection, Unit> function12, Function1<? super String, Unit> function13, Function1<? super String, Unit> function14, Function1<? super Boolean, Unit> function15, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i, int i2) {
        super(2);
        this.$hasOtherId = z;
        this.$isCardReaderConnected = z2;
        this.$cardReaderMode = z3;
        this.$idCardType = str;
        this.$idCardList = list;
        this.$isCheckedExpireList = list2;
        this.$cardReaderState = idCardReaderState;
        this.$onSwitchCardReaderMode = function1;
        this.$onStartFetchingCardDataLoop = function0;
        this.$onStopFetchingCardDataLoop = function02;
        this.$onSuccessReadFinish = sharedFlow;
        this.$onSaveIdCardInfo = function12;
        this.$onIdTypeChange = function13;
        this.$onIdValueChange = function14;
        this.$onCheckedExpiredChange = function15;
        this.$onValidateInput = function03;
        this.$gotoTakeMorePhoto = function04;
        this.$gotoTolPackage = function05;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputIdCardScreenKt.InputIdCardScreen(this.$hasOtherId, this.$isCardReaderConnected, this.$cardReaderMode, this.$idCardType, this.$idCardList, this.$isCheckedExpireList, this.$cardReaderState, this.$onSwitchCardReaderMode, this.$onStartFetchingCardDataLoop, this.$onStopFetchingCardDataLoop, this.$onSuccessReadFinish, this.$onSaveIdCardInfo, this.$onIdTypeChange, this.$onIdValueChange, this.$onCheckedExpiredChange, this.$onValidateInput, this.$gotoTakeMorePhoto, this.$gotoTolPackage, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}