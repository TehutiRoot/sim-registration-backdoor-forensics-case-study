package p000;

import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import androidx.compose.material.ripple.RippleHostView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22882wy1 {

    /* renamed from: a */
    public final Map f108191a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f108192b = new LinkedHashMap();

    /* renamed from: a */
    public final AndroidRippleIndicationInstance m636a(RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        return (AndroidRippleIndicationInstance) this.f108192b.get(rippleHostView);
    }

    /* renamed from: b */
    public final RippleHostView m635b(AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        return (RippleHostView) this.f108191a.get(indicationInstance);
    }

    /* renamed from: c */
    public final void m634c(AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        RippleHostView rippleHostView = (RippleHostView) this.f108191a.get(indicationInstance);
        if (rippleHostView != null) {
            AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) this.f108192b.remove(rippleHostView);
        }
        this.f108191a.remove(indicationInstance);
    }

    /* renamed from: d */
    public final void m633d(AndroidRippleIndicationInstance indicationInstance, RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        this.f108191a.put(indicationInstance, rippleHostView);
        this.f108192b.put(rippleHostView, indicationInstance);
    }
}
