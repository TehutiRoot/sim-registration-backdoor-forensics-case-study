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
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$3 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdForms$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
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
    public InputIdCardScreenKt$InputIdForms$3(boolean z, String str, List<String> list, List<Boolean> list2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super Boolean, Unit> function13, Function0<Unit> function0, int i) {
        super(2);
        this.$hasOtherId = z;
        this.$idCardType = str;
        this.$idCardList = list;
        this.$isCheckedExpireList = list2;
        this.$onIdTypeChange = function1;
        this.$onIdValueChange = function12;
        this.$onCheckedExpiredChange = function13;
        this.$onValidateInput = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputIdCardScreenKt.m9535a(this.$hasOtherId, this.$idCardType, this.$idCardList, this.$isCheckedExpireList, this.$onIdTypeChange, this.$onIdValueChange, this.$onCheckedExpiredChange, this.$onValidateInput, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}