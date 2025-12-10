package io.fotoapparat.error;

import android.os.Looper;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.hardware.ExecutorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "cameraException", "Lio/fotoapparat/exception/camera/CameraException;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class ErrorCallbacksKt$onMainThread$1 extends Lambda implements Function1<CameraException, Unit> {
    final /* synthetic */ Function1<CameraException, Unit> $this_onMainThread;

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: io.fotoapparat.error.ErrorCallbacksKt$onMainThread$1$1 */
    /* loaded from: classes5.dex */
    public static final class C104951 extends Lambda implements Function0<Unit> {
        final /* synthetic */ CameraException $cameraException;
        final /* synthetic */ Function1<CameraException, Unit> $this_onMainThread;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C104951(Function1<? super CameraException, Unit> function1, CameraException cameraException) {
            super(0);
            this.$this_onMainThread = function1;
            this.$cameraException = cameraException;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_onMainThread.invoke(this.$cameraException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorCallbacksKt$onMainThread$1(Function1<? super CameraException, Unit> function1) {
        super(1);
        this.$this_onMainThread = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CameraException cameraException) {
        invoke2(cameraException);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull CameraException cameraException) {
        Intrinsics.checkNotNullParameter(cameraException, "cameraException");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.$this_onMainThread.invoke(cameraException);
        } else {
            ExecutorKt.executeMainThread(new C104951(this.$this_onMainThread, cameraException));
        }
    }
}
