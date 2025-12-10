package coil.request;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.net.SyslogConstants;
import coil.target.Target;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m29142d2 = {"coil/request/ImageRequest$Builder$target$4", "Lcoil/target/Target;", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroid/graphics/drawable/Drawable;", Constant.ServiceAPIName.onStart, "placeholder", "onSuccess", "result", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$4\n*L\n1#1,1057:1\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageRequest$Builder$target$4 implements Target {

    /* renamed from: a */
    public final /* synthetic */ Function1 f40793a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f40794b;

    /* renamed from: c */
    public final /* synthetic */ Function1 f40795c;

    public ImageRequest$Builder$target$4(Function1<? super Drawable, Unit> function1, Function1<? super Drawable, Unit> function12, Function1<? super Drawable, Unit> function13) {
        this.f40793a = function1;
        this.f40794b = function12;
        this.f40795c = function13;
    }

    @Override // coil.target.Target
    public void onError(@Nullable Drawable drawable) {
        this.f40794b.invoke(drawable);
    }

    @Override // coil.target.Target
    public void onStart(@Nullable Drawable drawable) {
        this.f40793a.invoke(drawable);
    }

    @Override // coil.target.Target
    public void onSuccess(@NotNull Drawable drawable) {
        this.f40795c.invoke(drawable);
    }
}