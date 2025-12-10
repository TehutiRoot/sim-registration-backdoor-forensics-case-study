package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class PathSegment {

    /* renamed from: a */
    public final PointF f33941a;

    /* renamed from: b */
    public final float f33942b;

    /* renamed from: c */
    public final PointF f33943c;

    /* renamed from: d */
    public final float f33944d;

    public PathSegment(@NonNull PointF pointF, float f, @NonNull PointF pointF2, float f2) {
        this.f33941a = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.f33942b = f;
        this.f33943c = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.f33944d = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        if (Float.compare(this.f33942b, pathSegment.f33942b) == 0 && Float.compare(this.f33944d, pathSegment.f33944d) == 0 && this.f33941a.equals(pathSegment.f33941a) && this.f33943c.equals(pathSegment.f33943c)) {
            return true;
        }
        return false;
    }

    @NonNull
    public PointF getEnd() {
        return this.f33943c;
    }

    public float getEndFraction() {
        return this.f33944d;
    }

    @NonNull
    public PointF getStart() {
        return this.f33941a;
    }

    public float getStartFraction() {
        return this.f33942b;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f33941a.hashCode() * 31;
        float f = this.f33942b;
        int i2 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.f33943c.hashCode()) * 31;
        float f2 = this.f33944d;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "PathSegment{start=" + this.f33941a + ", startFraction=" + this.f33942b + ", end=" + this.f33943c + ", endFraction=" + this.f33944d + '}';
    }
}