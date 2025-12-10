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
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialog1IDXDevice$2 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialog1IDXDevice$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $alertMessage;
    final /* synthetic */ String $alertXDeviceMessage;
    final /* synthetic */ Function0<Unit> $onCancel;
    final /* synthetic */ Function0<Unit> $onConfirm;
    final /* synthetic */ String $responseDateTime;
    final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialog1IDXDevice$2(String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$alertMessage = str;
        this.$alertXDeviceMessage = str2;
        this.$responseDateTime = str3;
        this.$userId = str4;
        this.$onConfirm = function0;
        this.$onCancel = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneDialogKt.OneDialog1IDXDevice(this.$alertMessage, this.$alertXDeviceMessage, this.$responseDateTime, this.$userId, this.$onConfirm, this.$onCancel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}