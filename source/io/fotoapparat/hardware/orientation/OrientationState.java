package io.fotoapparat.hardware.orientation;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ,\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/OrientationState;", "", "Lio/fotoapparat/hardware/orientation/Orientation;", "Lio/fotoapparat/hardware/orientation/DeviceOrientation;", "deviceOrientation", "Lio/fotoapparat/hardware/orientation/ScreenOrientation;", "screenOrientation", "<init>", "(Lio/fotoapparat/hardware/orientation/Orientation;Lio/fotoapparat/hardware/orientation/Orientation;)V", "component1", "()Lio/fotoapparat/hardware/orientation/Orientation;", "component2", "copy", "(Lio/fotoapparat/hardware/orientation/Orientation;Lio/fotoapparat/hardware/orientation/Orientation;)Lio/fotoapparat/hardware/orientation/OrientationState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/hardware/orientation/Orientation;", "getDeviceOrientation", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getScreenOrientation", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class OrientationState {

    /* renamed from: a */
    public final Orientation f62993a;

    /* renamed from: b */
    public final Orientation f62994b;

    public OrientationState(@NotNull Orientation deviceOrientation, @NotNull Orientation screenOrientation) {
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        Intrinsics.checkNotNullParameter(screenOrientation, "screenOrientation");
        this.f62993a = deviceOrientation;
        this.f62994b = screenOrientation;
    }

    public static /* synthetic */ OrientationState copy$default(OrientationState orientationState, Orientation orientation, Orientation orientation2, int i, Object obj) {
        if ((i & 1) != 0) {
            orientation = orientationState.f62993a;
        }
        if ((i & 2) != 0) {
            orientation2 = orientationState.f62994b;
        }
        return orientationState.copy(orientation, orientation2);
    }

    @NotNull
    public final Orientation component1() {
        return this.f62993a;
    }

    @NotNull
    public final Orientation component2() {
        return this.f62994b;
    }

    @NotNull
    public final OrientationState copy(@NotNull Orientation deviceOrientation, @NotNull Orientation screenOrientation) {
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        Intrinsics.checkNotNullParameter(screenOrientation, "screenOrientation");
        return new OrientationState(deviceOrientation, screenOrientation);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrientationState) {
            OrientationState orientationState = (OrientationState) obj;
            return Intrinsics.areEqual(this.f62993a, orientationState.f62993a) && Intrinsics.areEqual(this.f62994b, orientationState.f62994b);
        }
        return false;
    }

    @NotNull
    public final Orientation getDeviceOrientation() {
        return this.f62993a;
    }

    @NotNull
    public final Orientation getScreenOrientation() {
        return this.f62994b;
    }

    public int hashCode() {
        return (this.f62993a.hashCode() * 31) + this.f62994b.hashCode();
    }

    @NotNull
    public String toString() {
        Orientation orientation = this.f62993a;
        Orientation orientation2 = this.f62994b;
        return "OrientationState(deviceOrientation=" + orientation + ", screenOrientation=" + orientation2 + ")";
    }
}
