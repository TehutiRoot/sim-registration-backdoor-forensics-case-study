package io.fotoapparat.hardware.orientation;

import android.content.Context;
import android.view.OrientationEventListener;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\u0007j\u0002`\bH\u0016R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/RotationListener;", "Landroid/view/OrientationEventListener;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "orientationChanged", "Lkotlin/Function1;", "", "Lio/fotoapparat/hardware/orientation/DeviceRotationDegrees;", "", "getOrientationChanged", "()Lkotlin/jvm/functions/Function1;", "setOrientationChanged", "(Lkotlin/jvm/functions/Function1;)V", "onOrientationChanged", "orientation", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public class RotationListener extends OrientationEventListener {
    public Function1<? super Integer, Unit> orientationChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotationListener(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final Function1<Integer, Unit> getOrientationChanged() {
        Function1 function1 = this.orientationChanged;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orientationChanged");
        return null;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        if (canDetectOrientation()) {
            getOrientationChanged().invoke(Integer.valueOf(i));
        }
    }

    public final void setOrientationChanged(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.orientationChanged = function1;
    }
}
