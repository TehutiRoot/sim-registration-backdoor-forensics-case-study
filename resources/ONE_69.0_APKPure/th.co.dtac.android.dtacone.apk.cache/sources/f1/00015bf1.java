package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogError$3 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogError$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $dateTime;
    final /* synthetic */ String $desc;
    final /* synthetic */ int $descriptionMaxLines;
    final /* synthetic */ String $errorCode;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $systemMessage;
    final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogError$3(String str, String str2, String str3, String str4, Function0<Unit> function0, String str5, int i, int i2, int i3) {
        super(2);
        this.$desc = str;
        this.$userId = str2;
        this.$errorCode = str3;
        this.$systemMessage = str4;
        this.$onDismiss = function0;
        this.$dateTime = str5;
        this.$descriptionMaxLines = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneDialogKt.OneDialogError(this.$desc, this.$userId, this.$errorCode, this.$systemMessage, this.$onDismiss, this.$dateTime, this.$descriptionMaxLines, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}