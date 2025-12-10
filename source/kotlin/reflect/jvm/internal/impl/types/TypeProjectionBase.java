package kotlin.reflect.jvm.internal.impl.types;

import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class TypeProjectionBase implements TypeProjection {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        if (isStarProjection() == typeProjection.isStarProjection() && getProjectionKind() == typeProjection.getProjectionKind() && getType().equals(typeProjection.getType())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = getProjectionKind().hashCode();
        if (TypeUtils.noExpectedType(getType())) {
            return (hashCode2 * 31) + 19;
        }
        int i = hashCode2 * 31;
        if (isStarProjection()) {
            hashCode = 17;
        } else {
            hashCode = getType().hashCode();
        }
        return i + hashCode;
    }

    public String toString() {
        if (isStarProjection()) {
            return Marker.ANY_MARKER;
        }
        if (getProjectionKind() == Variance.INVARIANT) {
            return getType().toString();
        }
        return getProjectionKind() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + getType();
    }
}
