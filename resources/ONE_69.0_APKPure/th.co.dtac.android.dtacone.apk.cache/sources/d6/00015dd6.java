package p000;

import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import androidx.compose.material.ripple.RippleHostView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22435tz1 {

    /* renamed from: a */
    public final Map f107585a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f107586b = new LinkedHashMap();

    /* renamed from: a */
    public final AndroidRippleIndicationInstance m1286a(RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        return (AndroidRippleIndicationInstance) this.f107586b.get(rippleHostView);
    }

    /* renamed from: b */
    public final RippleHostView m1285b(AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        return (RippleHostView) this.f107585a.get(indicationInstance);
    }

    /* renamed from: c */
    public final void m1284c(AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        RippleHostView rippleHostView = (RippleHostView) this.f107585a.get(indicationInstance);
        if (rippleHostView != null) {
            AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) this.f107586b.remove(rippleHostView);
        }
        this.f107585a.remove(indicationInstance);
    }

    /* renamed from: d */
    public final void m1283d(AndroidRippleIndicationInstance indicationInstance, RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        this.f107585a.put(indicationInstance, rippleHostView);
        this.f107586b.put(rippleHostView, indicationInstance);
    }
}