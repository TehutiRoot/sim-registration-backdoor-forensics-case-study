package io.fotoapparat.parameter;

import android.hardware.Camera;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class SupportedParameters$supportedAutoBandingModes$2 extends Lambda implements Function0<List<? extends String>> {
    final /* synthetic */ SupportedParameters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedParameters$supportedAutoBandingModes$2(SupportedParameters supportedParameters) {
        super(0);
        this.this$0 = supportedParameters;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends String> invoke() {
        Camera.Parameters parameters;
        parameters = this.this$0.f63002a;
        List<String> supportedAntibanding = parameters.getSupportedAntibanding();
        return supportedAntibanding == null ? AbstractC10108ds.listOf("off") : supportedAntibanding;
    }
}
