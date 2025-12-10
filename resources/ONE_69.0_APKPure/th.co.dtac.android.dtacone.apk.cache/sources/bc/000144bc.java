package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$1$1 */
/* loaded from: classes10.dex */
public final class TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$1$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ MutableState<IntSize> $size$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$1$1(MutableState<IntSize> mutableState) {
        super(1);
        this.$size$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m75267invokeozmzZPI(intSize.m74006unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m75267invokeozmzZPI(long j) {
        TakePhotoOptionalScreenKt.m9394e(this.$size$delegate, j);
    }
}