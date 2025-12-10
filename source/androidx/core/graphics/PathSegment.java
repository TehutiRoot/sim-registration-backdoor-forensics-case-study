package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class PathSegment {

    /* renamed from: a */
    public final PointF f33853a;

    /* renamed from: b */
    public final float f33854b;

    /* renamed from: c */
    public final PointF f33855c;

    /* renamed from: d */
    public final float f33856d;

    public PathSegment(@NonNull PointF pointF, float f, @NonNull PointF pointF2, float f2) {
        this.f33853a = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.f33854b = f;
        this.f33855c = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.f33856d = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        if (Float.compare(this.f33854b, pathSegment.f33854b) == 0 && Float.compare(this.f33856d, pathSegment.f33856d) == 0 && this.f33853a.equals(pathSegment.f33853a) && this.f33855c.equals(pathSegment.f33855c)) {
            return true;
        }
        return false;
    }

    @NonNull
    public PointF getEnd() {
        return this.f33855c;
    }

    public float getEndFraction() {
        return this.f33856d;
    }

    @NonNull
    public PointF getStart() {
        return this.f33853a;
    }

    public float getStartFraction() {
        return this.f33854b;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f33853a.hashCode() * 31;
        float f = this.f33854b;
        int i2 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.f33855c.hashCode()) * 31;
        float f2 = this.f33856d;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "PathSegment{start=" + this.f33853a + ", startFraction=" + this.f33854b + ", end=" + this.f33855c + ", endFraction=" + this.f33856d + '}';
    }
}
