package androidx.camera.core;

import androidx.camera.core.SurfaceOutput;

/* renamed from: androidx.camera.core.e */
/* loaded from: classes.dex */
public final class C2447e extends SurfaceOutput.Event {

    /* renamed from: a */
    public final int f11050a;

    /* renamed from: b */
    public final SurfaceOutput f11051b;

    public C2447e(int i, SurfaceOutput surfaceOutput) {
        this.f11050a = i;
        if (surfaceOutput != null) {
            this.f11051b = surfaceOutput;
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
        if (this.f11050a == event.getEventCode() && this.f11051b.equals(event.getSurfaceOutput())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public int getEventCode() {
        return this.f11050a;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public SurfaceOutput getSurfaceOutput() {
        return this.f11051b;
    }

    public int hashCode() {
        return ((this.f11050a ^ 1000003) * 1000003) ^ this.f11051b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f11050a + ", surfaceOutput=" + this.f11051b + "}";
    }
}