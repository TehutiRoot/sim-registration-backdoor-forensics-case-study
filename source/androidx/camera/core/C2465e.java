package androidx.camera.core;

import androidx.camera.core.SurfaceOutput;

/* renamed from: androidx.camera.core.e */
/* loaded from: classes.dex */
public final class C2465e extends SurfaceOutput.Event {

    /* renamed from: a */
    public final int f10962a;

    /* renamed from: b */
    public final SurfaceOutput f10963b;

    public C2465e(int i, SurfaceOutput surfaceOutput) {
        this.f10962a = i;
        if (surfaceOutput != null) {
            this.f10963b = surfaceOutput;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutput.Event)) {
            return false;
        }
        SurfaceOutput.Event event = (SurfaceOutput.Event) obj;
        if (this.f10962a == event.getEventCode() && this.f10963b.equals(event.getSurfaceOutput())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public int getEventCode() {
        return this.f10962a;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public SurfaceOutput getSurfaceOutput() {
        return this.f10963b;
    }

    public int hashCode() {
        return ((this.f10962a ^ 1000003) * 1000003) ^ this.f10963b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f10962a + ", surfaceOutput=" + this.f10963b + "}";
    }
}
