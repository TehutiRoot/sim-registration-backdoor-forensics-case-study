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
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$DtacOneDialog1IdXDevice$2 */
/* loaded from: classes9.dex */
public final class OneDialogKt$DtacOneDialog1IdXDevice$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $cancelText;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ String $desc;
    final /* synthetic */ String $errorCode;
    final /* synthetic */ Boolean $isCancelButtonLine;
    final /* synthetic */ Function0<Unit> $onConfirm;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $responseDateTime;
    final /* synthetic */ String $suggestionText;
    final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$DtacOneDialog1IdXDevice$2(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$desc = str;
        this.$userId = str2;
        this.$errorCode = str3;
        this.$responseDateTime = str4;
        this.$suggestionText = str5;
        this.$isCancelButtonLine = bool;
        this.$confirmText = str6;
        this.$cancelText = str7;
        this.$onConfirm = function0;
        this.$onDismiss = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneDialogKt.DtacOneDialog1IdXDevice(this.$desc, this.$userId, this.$errorCode, this.$responseDateTime, this.$suggestionText, this.$isCancelButtonLine, this.$confirmText, this.$cancelText, this.$onConfirm, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}