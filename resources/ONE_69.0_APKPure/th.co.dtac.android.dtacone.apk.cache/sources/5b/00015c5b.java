package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.graphics.Bitmap;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$ComposeSignatureCustom$3 */
/* loaded from: classes9.dex */
public final class ComposeSignatureCustomKt$ComposeSignatureCustom$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> $clearComponent;
    final /* synthetic */ Function3<Function0<Unit>, Composer, Integer, Unit> $completeComponent;
    final /* synthetic */ boolean $hasAlpha;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClear;
    final /* synthetic */ Function1<Bitmap, Unit> $onComplete;
    final /* synthetic */ long $signatureColor;
    final /* synthetic */ float $signaturePadCardElevation;
    final /* synthetic */ long $signaturePadColor;
    final /* synthetic */ float $signaturePadHeight;
    final /* synthetic */ float $signatureThickness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposeSignatureCustomKt$ComposeSignatureCustom$3(Modifier modifier, long j, float f, long j2, float f2, float f3, boolean z, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function3, Function3<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function32, Function1<? super Bitmap, Unit> function1, Function0<Unit> function0, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$signaturePadColor = j;
        this.$signaturePadHeight = f;
        this.$signatureColor = j2;
        this.$signaturePadCardElevation = f2;
        this.$signatureThickness = f3;
        this.$hasAlpha = z;
        this.$completeComponent = function3;
        this.$clearComponent = function32;
        this.$onComplete = function1;
        this.$onClear = function0;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ComposeSignatureCustomKt.m75353ComposeSignatureCustom4oWs0OM(this.$modifier, this.$signaturePadColor, this.$signaturePadHeight, this.$signatureColor, this.$signaturePadCardElevation, this.$signatureThickness, this.$hasAlpha, this.$completeComponent, this.$clearComponent, this.$onComplete, this.$onClear, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}