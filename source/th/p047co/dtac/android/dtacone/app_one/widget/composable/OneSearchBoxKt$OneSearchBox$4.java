package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxKt$OneSearchBox$4 */
/* loaded from: classes7.dex */
public final class OneSearchBoxKt$OneSearchBox$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onSearchClick;
    final /* synthetic */ Function1<String, Unit> $onTextChange;
    final /* synthetic */ String $placeHolder;
    final /* synthetic */ boolean $setKeyBoardNumber;
    final /* synthetic */ boolean $shouldFocus;
    final /* synthetic */ String $textState;
    final /* synthetic */ boolean $useButtonSearch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSearchBoxKt$OneSearchBox$4(Modifier modifier, boolean z, boolean z2, boolean z3, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$setKeyBoardNumber = z;
        this.$shouldFocus = z2;
        this.$useButtonSearch = z3;
        this.$placeHolder = str;
        this.$textState = str2;
        this.$onSearchClick = function0;
        this.$onTextChange = function1;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneSearchBoxKt.OneSearchBox(this.$modifier, this.$setKeyBoardNumber, this.$shouldFocus, this.$useButtonSearch, this.$placeHolder, this.$textState, this.$onSearchClick, this.$onTextChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
