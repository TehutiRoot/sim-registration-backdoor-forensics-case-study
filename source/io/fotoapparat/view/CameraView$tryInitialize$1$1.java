package io.fotoapparat.view;

import android.graphics.SurfaceTexture;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroid/graphics/SurfaceTexture;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class CameraView$tryInitialize$1$1 extends Lambda implements Function1<SurfaceTexture, Unit> {
    final /* synthetic */ CameraView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraView$tryInitialize$1$1(CameraView cameraView) {
        super(1);
        this.this$0 = cameraView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SurfaceTexture surfaceTexture) {
        invoke2(surfaceTexture);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SurfaceTexture $receiver) {
        CountDownLatch countDownLatch;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.this$0.f63049e = $receiver;
        countDownLatch = this.this$0.f63045a;
        countDownLatch.countDown();
    }
}
