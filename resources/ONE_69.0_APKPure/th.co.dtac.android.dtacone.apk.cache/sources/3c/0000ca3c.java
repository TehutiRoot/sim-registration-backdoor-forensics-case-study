package io.fotoapparat.configuration;

import io.fotoapparat.preview.Frame;
import io.fotoapparat.preview.FrameProcessor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class CameraConfiguration$Builder$frameProcessor$1$1$1 extends FunctionReferenceImpl implements Function1<Frame, Unit> {
    public CameraConfiguration$Builder$frameProcessor$1$1$1(Object obj) {
        super(1, obj, FrameProcessor.class, "process", "process(Lio/fotoapparat/preview/Frame;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Frame frame) {
        invoke2(frame);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Frame p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FrameProcessor) this.receiver).process(p0);
    }
}