package com.google.firebase.perf.p016v1;

import com.google.protobuf.Internal;

/* renamed from: com.google.firebase.perf.v1.SessionVerbosity */
/* loaded from: classes4.dex */
public enum SessionVerbosity implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<SessionVerbosity> internalValueMap = new Internal.EnumLiteMap() { // from class: com.google.firebase.perf.v1.SessionVerbosity.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public SessionVerbosity findValueByNumber(int i) {
            return SessionVerbosity.forNumber(i);
        }
    };
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$b */
    /* loaded from: classes4.dex */
    public static final class C8612b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final Internal.EnumVerifier f56306a = new C8612b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            if (SessionVerbosity.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    SessionVerbosity(int i) {
        this.value = i;
    }

    public static SessionVerbosity forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static Internal.EnumLiteMap<SessionVerbosity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C8612b.f56306a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
        return forNumber(i);
    }
}
