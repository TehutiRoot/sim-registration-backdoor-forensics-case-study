package io.fotoapparat;

import android.content.Context;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.OrientationSensor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/hardware/orientation/OrientationSensor;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class Fotoapparat$orientationSensor$2 extends Lambda implements Function0<OrientationSensor> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Fotoapparat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fotoapparat$orientationSensor$2(Context context, Fotoapparat fotoapparat) {
        super(0);
        this.$context = context;
        this.this$0 = fotoapparat;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final OrientationSensor invoke() {
        Device device2;
        Context context = this.$context;
        device2 = this.this$0.f62902e;
        return new OrientationSensor(context, device2);
    }
}
