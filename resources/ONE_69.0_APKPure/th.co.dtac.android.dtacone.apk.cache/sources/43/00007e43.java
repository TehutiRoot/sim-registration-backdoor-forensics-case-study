package coil.request;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lcoil/request/ImageRequest;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$2\n*L\n1#1,1057:1\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageRequest$Builder$listener$2 extends Lambda implements Function1<ImageRequest, Unit> {
    public static final ImageRequest$Builder$listener$2 INSTANCE = new ImageRequest$Builder$listener$2();

    public ImageRequest$Builder$listener$2() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ImageRequest imageRequest) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImageRequest imageRequest) {
        invoke2(imageRequest);
        return Unit.INSTANCE;
    }
}