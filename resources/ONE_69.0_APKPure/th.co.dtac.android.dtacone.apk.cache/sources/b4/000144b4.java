package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$6$1 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$6$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onNext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$6$1(Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$onNext = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onNext.invoke(Boolean.TRUE);
    }
}