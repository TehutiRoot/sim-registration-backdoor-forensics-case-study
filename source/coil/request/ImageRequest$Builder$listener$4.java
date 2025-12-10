package coil.request;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcoil/request/ImageRequest;", "<anonymous parameter 1>", "Lcoil/request/SuccessResult;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$4\n*L\n1#1,1057:1\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageRequest$Builder$listener$4 extends Lambda implements Function2<ImageRequest, SuccessResult, Unit> {
    public static final ImageRequest$Builder$listener$4 INSTANCE = new ImageRequest$Builder$listener$4();

    public ImageRequest$Builder$listener$4() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ImageRequest imageRequest, SuccessResult successResult) {
        invoke2(imageRequest, successResult);
        return Unit.INSTANCE;
    }
}
