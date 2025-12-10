package io.fotoapparat.parameter;

import android.hardware.Camera;
import io.fotoapparat.parameter.Zoom;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/parameter/Zoom;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class SupportedParameters$supportedZoom$2 extends Lambda implements Function0<Zoom> {
    final /* synthetic */ SupportedParameters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedParameters$supportedZoom$2(SupportedParameters supportedParameters) {
        super(0);
        this.this$0 = supportedParameters;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Zoom invoke() {
        Camera.Parameters parameters;
        Camera.Parameters parameters2;
        Camera.Parameters parameters3;
        parameters = this.this$0.f63002a;
        if (parameters.isZoomSupported()) {
            parameters2 = this.this$0.f63002a;
            int maxZoom = parameters2.getMaxZoom();
            parameters3 = this.this$0.f63002a;
            List<Integer> zoomRatios = parameters3.getZoomRatios();
            Intrinsics.checkNotNullExpressionValue(zoomRatios, "cameraParameters.zoomRatios");
            return new Zoom.VariableZoom(maxZoom, zoomRatios);
        }
        return Zoom.FixedZoom.INSTANCE;
    }
}
