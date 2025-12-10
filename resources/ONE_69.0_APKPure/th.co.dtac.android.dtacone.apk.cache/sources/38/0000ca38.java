package io.fotoapparat.concurrent;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Ljava/util/concurrent/Future;", "invoke", "(Ljava/util/concurrent/Future;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class CameraExecutor$cleanUpCancelledTasks$1 extends Lambda implements Function1<Future<?>, Boolean> {
    final /* synthetic */ CameraExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraExecutor$cleanUpCancelledTasks$1(CameraExecutor cameraExecutor) {
        super(1);
        this.this$0 = cameraExecutor;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Future<?> it) {
        boolean m30898d;
        Intrinsics.checkNotNullParameter(it, "it");
        m30898d = this.this$0.m30898d(it);
        return Boolean.valueOf(!m30898d);
    }
}