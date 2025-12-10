package coil.request;

import ch.qos.logback.core.net.SyslogConstants;
import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¨\u0006\f"}, m29142d2 = {"coil/request/ImageRequest$Builder$listener$5", "Lcoil/request/ImageRequest$Listener;", "onCancel", "", "request", "Lcoil/request/ImageRequest;", "onError", "result", "Lcoil/request/ErrorResult;", Constant.ServiceAPIName.onStart, "onSuccess", "Lcoil/request/SuccessResult;", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n*L\n1#1,1057:1\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageRequest$Builder$listener$5 implements ImageRequest.Listener {

    /* renamed from: a */
    public final /* synthetic */ Function1 f40789a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f40790b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f40791c;

    /* renamed from: d */
    public final /* synthetic */ Function2 f40792d;

    public ImageRequest$Builder$listener$5(Function1<? super ImageRequest, Unit> function1, Function1<? super ImageRequest, Unit> function12, Function2<? super ImageRequest, ? super ErrorResult, Unit> function2, Function2<? super ImageRequest, ? super SuccessResult, Unit> function22) {
        this.f40789a = function1;
        this.f40790b = function12;
        this.f40791c = function2;
        this.f40792d = function22;
    }

    @Override // coil.request.ImageRequest.Listener
    public void onCancel(@NotNull ImageRequest imageRequest) {
        this.f40790b.invoke(imageRequest);
    }

    @Override // coil.request.ImageRequest.Listener
    public void onError(@NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
        this.f40791c.invoke(imageRequest, errorResult);
    }

    @Override // coil.request.ImageRequest.Listener
    public void onStart(@NotNull ImageRequest imageRequest) {
        this.f40789a.invoke(imageRequest);
    }

    @Override // coil.request.ImageRequest.Listener
    public void onSuccess(@NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
        this.f40792d.invoke(imageRequest, successResult);
    }
}