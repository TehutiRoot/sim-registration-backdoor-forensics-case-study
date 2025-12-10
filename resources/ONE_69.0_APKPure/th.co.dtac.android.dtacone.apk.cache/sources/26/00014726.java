package th.p047co.dtac.android.dtacone.view.compose.upPass;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.IdDocOcrFaceCompareLivenessNavGraphKt$idDocOcrFaceCompareLivenessNavGraph$4$1$6$1 */
/* loaded from: classes10.dex */
public final class C15723x118c9e2b extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutableState<Boolean> $cardReaderMode$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15723x118c9e2b(MutableState<Boolean> mutableState) {
        super(1);
        this.$cardReaderMode$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        C15706x2aaa178c.invoke$lambda$4(this.$cardReaderMode$delegate, z);
    }
}