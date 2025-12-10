package io.fotoapparat.hardware.display;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.orientation.Orientation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28850d2 = {"Lio/fotoapparat/hardware/display/Display;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lio/fotoapparat/hardware/orientation/Orientation;", "getOrientation", "()Lio/fotoapparat/hardware/orientation/Orientation;", "Landroid/view/Display;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/Display;", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public class Display {

    /* renamed from: a */
    public final android.view.Display f62982a;

    public Display(@NotNull Context context) {
        android.view.Display m30531a;
        Intrinsics.checkNotNullParameter(context, "context");
        m30531a = DisplayKt.m30531a(context);
        this.f62982a = m30531a;
    }

    @NotNull
    public Orientation getOrientation() {
        Integer num;
        android.view.Display display = this.f62982a;
        if (display != null) {
            num = Integer.valueOf(display.getRotation());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return Orientation.Vertical.Portrait.INSTANCE;
        }
        if (num != null && num.intValue() == 1) {
            return Orientation.Horizontal.Landscape.INSTANCE;
        }
        if (num != null && num.intValue() == 2) {
            return Orientation.Vertical.ReversePortrait.INSTANCE;
        }
        if (num != null && num.intValue() == 3) {
            return Orientation.Horizontal.ReverseLandscape.INSTANCE;
        }
        return Orientation.Vertical.Portrait.INSTANCE;
    }
}
