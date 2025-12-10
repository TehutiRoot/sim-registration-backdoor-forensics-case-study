package io.fotoapparat.hardware.orientation;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.Orientation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0012\u0012\b\u0012\u00060\u0019j\u0002`\u001a\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/OrientationSensor;", "", "Lio/fotoapparat/hardware/orientation/RotationListener;", "rotationListener", "Lio/fotoapparat/hardware/Device;", "device", "<init>", "(Lio/fotoapparat/hardware/orientation/RotationListener;Lio/fotoapparat/hardware/Device;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lio/fotoapparat/hardware/Device;)V", "Lkotlin/Function1;", "Lio/fotoapparat/hardware/orientation/OrientationState;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "start", "(Lkotlin/jvm/functions/Function1;)V", "stop", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/hardware/orientation/RotationListener;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/hardware/Device;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "", "Lio/fotoapparat/hardware/orientation/DeviceRotationDegrees;", "d", "onOrientationChanged", "e", "Lio/fotoapparat/hardware/orientation/OrientationState;", "getLastKnownOrientationState", "()Lio/fotoapparat/hardware/orientation/OrientationState;", "setLastKnownOrientationState", "(Lio/fotoapparat/hardware/orientation/OrientationState;)V", "lastKnownOrientationState", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public class OrientationSensor {

    /* renamed from: a */
    public final RotationListener f62988a;

    /* renamed from: b */
    public final Device f62989b;

    /* renamed from: c */
    public Function1 f62990c;

    /* renamed from: d */
    public final Function1 f62991d;

    /* renamed from: e */
    public OrientationState f62992e;

    public OrientationSensor(@NotNull RotationListener rotationListener, @NotNull Device device2) {
        Intrinsics.checkNotNullParameter(rotationListener, "rotationListener");
        Intrinsics.checkNotNullParameter(device2, "device");
        this.f62988a = rotationListener;
        this.f62989b = device2;
        OrientationSensor$onOrientationChanged$1 orientationSensor$onOrientationChanged$1 = new OrientationSensor$onOrientationChanged$1(this);
        this.f62991d = orientationSensor$onOrientationChanged$1;
        this.f62992e = new OrientationState(Orientation.Vertical.Portrait.INSTANCE, device2.getScreenOrientation());
        rotationListener.setOrientationChanged(orientationSensor$onOrientationChanged$1);
    }

    @NotNull
    public OrientationState getLastKnownOrientationState() {
        return this.f62992e;
    }

    public void setLastKnownOrientationState(@NotNull OrientationState orientationState) {
        Intrinsics.checkNotNullParameter(orientationState, "<set-?>");
        this.f62992e = orientationState;
    }

    public void start(@NotNull Function1<? super OrientationState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f62990c = listener;
        this.f62988a.enable();
    }

    public void stop() {
        this.f62988a.disable();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrientationSensor(@NotNull Context context, @NotNull Device device2) {
        this(new RotationListener(context), device2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(device2, "device");
    }
}
