package io.fotoapparat.parameter.camera.convert;

import io.fotoapparat.parameter.FocusMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m28850d2 = {"toCode", "", "Lio/fotoapparat/parameter/FocusMode;", "toFocusMode", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class FocusModeConverterKt {
    @NotNull
    public static final String toCode(@NotNull FocusMode focusMode) {
        Intrinsics.checkNotNullParameter(focusMode, "<this>");
        if (Intrinsics.areEqual(focusMode, FocusMode.Edof.INSTANCE)) {
            return "edof";
        }
        if (Intrinsics.areEqual(focusMode, FocusMode.Auto.INSTANCE)) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        if (Intrinsics.areEqual(focusMode, FocusMode.Macro.INSTANCE)) {
            return "macro";
        }
        if (Intrinsics.areEqual(focusMode, FocusMode.Fixed.INSTANCE)) {
            return "fixed";
        }
        if (Intrinsics.areEqual(focusMode, FocusMode.Infinity.INSTANCE)) {
            return "infinity";
        }
        if (Intrinsics.areEqual(focusMode, FocusMode.ContinuousFocusVideo.INSTANCE)) {
            return "continuous-video";
        }
        if (Intrinsics.areEqual(focusMode, FocusMode.ContinuousFocusPicture.INSTANCE)) {
            return "continuous-picture";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final FocusMode toFocusMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -194628547:
                if (str.equals("continuous-video")) {
                    return FocusMode.ContinuousFocusVideo.INSTANCE;
                }
                break;
            case 3005871:
                if (str.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    return FocusMode.Auto.INSTANCE;
                }
                break;
            case 3108534:
                if (str.equals("edof")) {
                    return FocusMode.Edof.INSTANCE;
                }
                break;
            case 97445748:
                if (str.equals("fixed")) {
                    return FocusMode.Fixed.INSTANCE;
                }
                break;
            case 103652300:
                if (str.equals("macro")) {
                    return FocusMode.Macro.INSTANCE;
                }
                break;
            case 173173288:
                if (str.equals("infinity")) {
                    return FocusMode.Infinity.INSTANCE;
                }
                break;
            case 910005312:
                if (str.equals("continuous-picture")) {
                    return FocusMode.ContinuousFocusPicture.INSTANCE;
                }
                break;
        }
        return null;
    }
}
