package io.fotoapparat.parameter;

import android.hardware.Camera;
import io.fotoapparat.parameter.extract.RawValuesExtractorKt;
import io.fotoapparat.util.ListConvertionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class SupportedParameters$sensorSensitivities$2 extends Lambda implements Function0<List<? extends Integer>> {
    final /* synthetic */ SupportedParameters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedParameters$sensorSensitivities$2(SupportedParameters supportedParameters) {
        super(0);
        this.this$0 = supportedParameters;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends Integer> invoke() {
        Camera.Parameters parameters;
        List list;
        parameters = this.this$0.f63065a;
        list = SupportedParametersKt.f63079a;
        return ListConvertionsKt.toInts(RawValuesExtractorKt.extractRawCameraValues(parameters, list));
    }
}