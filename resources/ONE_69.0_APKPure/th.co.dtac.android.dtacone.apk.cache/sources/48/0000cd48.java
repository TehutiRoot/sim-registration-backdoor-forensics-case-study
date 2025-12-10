package io.opencensus.trace;

import io.opencensus.internal.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class Status {

    /* renamed from: a */
    public final CanonicalCode f63746a;

    /* renamed from: b */
    public final String f63747b;

    /* renamed from: c */
    public static final List f63745c = m30494b();

    /* renamed from: OK */
    public static final Status f63744OK = CanonicalCode.OK.toStatus();
    public static final Status CANCELLED = CanonicalCode.CANCELLED.toStatus();
    public static final Status UNKNOWN = CanonicalCode.UNKNOWN.toStatus();
    public static final Status INVALID_ARGUMENT = CanonicalCode.INVALID_ARGUMENT.toStatus();
    public static final Status DEADLINE_EXCEEDED = CanonicalCode.DEADLINE_EXCEEDED.toStatus();
    public static final Status NOT_FOUND = CanonicalCode.NOT_FOUND.toStatus();
    public static final Status ALREADY_EXISTS = CanonicalCode.ALREADY_EXISTS.toStatus();
    public static final Status PERMISSION_DENIED = CanonicalCode.PERMISSION_DENIED.toStatus();
    public static final Status UNAUTHENTICATED = CanonicalCode.UNAUTHENTICATED.toStatus();
    public static final Status RESOURCE_EXHAUSTED = CanonicalCode.RESOURCE_EXHAUSTED.toStatus();
    public static final Status FAILED_PRECONDITION = CanonicalCode.FAILED_PRECONDITION.toStatus();
    public static final Status ABORTED = CanonicalCode.ABORTED.toStatus();
    public static final Status OUT_OF_RANGE = CanonicalCode.OUT_OF_RANGE.toStatus();
    public static final Status UNIMPLEMENTED = CanonicalCode.UNIMPLEMENTED.toStatus();
    public static final Status INTERNAL = CanonicalCode.INTERNAL.toStatus();
    public static final Status UNAVAILABLE = CanonicalCode.UNAVAILABLE.toStatus();
    public static final Status DATA_LOSS = CanonicalCode.DATA_LOSS.toStatus();

    /* loaded from: classes5.dex */
    public enum CanonicalCode {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        private final int value;

        CanonicalCode(int i) {
            this.value = i;
        }

        public Status toStatus() {
            return (Status) Status.f63745c.get(this.value);
        }

        public int value() {
            return this.value;
        }
    }

    public Status(CanonicalCode canonicalCode, String str) {
        this.f63746a = (CanonicalCode) Utils.checkNotNull(canonicalCode, "canonicalCode");
        this.f63747b = str;
    }

    /* renamed from: b */
    public static List m30494b() {
        CanonicalCode[] values;
        Status status;
        TreeMap treeMap = new TreeMap();
        for (CanonicalCode canonicalCode : CanonicalCode.values()) {
            if (((Status) treeMap.put(Integer.valueOf(canonicalCode.value()), new Status(canonicalCode, null))) != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCanonicalCode().name() + " & " + canonicalCode.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f63746a == status.f63746a && Utils.equalsObjects(this.f63747b, status.f63747b)) {
            return true;
        }
        return false;
    }

    public CanonicalCode getCanonicalCode() {
        return this.f63746a;
    }

    @Nullable
    public String getDescription() {
        return this.f63747b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f63746a, this.f63747b});
    }

    public boolean isOk() {
        if (CanonicalCode.OK == this.f63746a) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Status{canonicalCode=" + this.f63746a + ", description=" + this.f63747b + "}";
    }

    public Status withDescription(@Nullable String str) {
        if (Utils.equalsObjects(this.f63747b, str)) {
            return this;
        }
        return new Status(this.f63746a, str);
    }
}