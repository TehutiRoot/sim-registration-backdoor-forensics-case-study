package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$2$2$1 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$2$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function2<Integer, Integer, Unit> $onTakePhoto;
    final /* synthetic */ MutableState<IntSize> $size$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$2$2$1(Function2<? super Integer, ? super Integer, Unit> function2, MutableState<IntSize> mutableState) {
        super(0);
        this.$onTakePhoto = function2;
        this.$size$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        long m9403l;
        long m9403l2;
        Function2<Integer, Integer, Unit> function2 = this.$onTakePhoto;
        m9403l = TakePhotoIdCardScreenKt.m9403l(this.$size$delegate);
        Integer valueOf = Integer.valueOf(IntSize.m74002getWidthimpl(m9403l));
        m9403l2 = TakePhotoIdCardScreenKt.m9403l(this.$size$delegate);
        function2.invoke(valueOf, Integer.valueOf(IntSize.m74001getHeightimpl(m9403l2)));
    }
}