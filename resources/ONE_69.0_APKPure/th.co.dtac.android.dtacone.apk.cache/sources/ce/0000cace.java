package io.fotoapparat.routine.camera;

import io.fotoapparat.hardware.metering.FocalRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/hardware/metering/FocalRequest;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class StopRoutineKt$shutDown$1 extends Lambda implements Function1<FocalRequest, Unit> {
    public static final StopRoutineKt$shutDown$1 INSTANCE = new StopRoutineKt$shutDown$1();

    public StopRoutineKt$shutDown$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FocalRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocalRequest focalRequest) {
        invoke2(focalRequest);
        return Unit.INSTANCE;
    }
}