package io.fotoapparat;

import io.fotoapparat.configuration.Configuration;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.log.Logger;
import io.fotoapparat.routine.camera.UpdateConfigurationRoutineKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class Fotoapparat$updateConfiguration$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Configuration $newConfiguration;
    final /* synthetic */ Fotoapparat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fotoapparat$updateConfiguration$1(Fotoapparat fotoapparat, Configuration configuration) {
        super(0);
        this.this$0 = fotoapparat;
        this.$newConfiguration = configuration;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Logger logger;
        Device device2;
        logger = this.this$0.f62962b;
        logger.recordMethod();
        device2 = this.this$0.f62965e;
        UpdateConfigurationRoutineKt.updateDeviceConfiguration(device2, this.$newConfiguration);
    }
}