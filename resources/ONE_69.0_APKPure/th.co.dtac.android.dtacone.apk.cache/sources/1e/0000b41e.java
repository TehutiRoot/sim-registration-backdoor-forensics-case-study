package com.google.logging.type;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum LogSeverity implements Internal.EnumLite {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);
    
    public static final int ALERT_VALUE = 700;
    public static final int CRITICAL_VALUE = 600;
    public static final int DEBUG_VALUE = 100;
    public static final int DEFAULT_VALUE = 0;
    public static final int EMERGENCY_VALUE = 800;
    public static final int ERROR_VALUE = 500;
    public static final int INFO_VALUE = 200;
    public static final int NOTICE_VALUE = 300;
    public static final int WARNING_VALUE = 400;
    private static final Internal.EnumLiteMap<LogSeverity> internalValueMap = new Internal.EnumLiteMap() { // from class: com.google.logging.type.LogSeverity.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public LogSeverity findValueByNumber(int i) {
            return LogSeverity.forNumber(i);
        }
    };
    private final int value;

    /* renamed from: com.google.logging.type.LogSeverity$b */
    /* loaded from: classes4.dex */
    public static final class C8788b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final Internal.EnumVerifier f56869a = new C8788b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            if (LogSeverity.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    LogSeverity(int i) {
        this.value = i;
    }

    public static LogSeverity forNumber(int i) {
        if (i != 0) {
            if (i != 100) {
                if (i != 200) {
                    if (i != 300) {
                        if (i != 400) {
                            if (i != 500) {
                                if (i != 600) {
                                    if (i != 700) {
                                        if (i != 800) {
                                            return null;
                                        }
                                        return EMERGENCY;
                                    }
                                    return ALERT;
                                }
                                return CRITICAL;
                            }
                            return ERROR;
                        }
                        return WARNING;
                    }
                    return NOTICE;
                }
                return INFO;
            }
            return DEBUG;
        }
        return DEFAULT;
    }

    public static Internal.EnumLiteMap<LogSeverity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C8788b.f56869a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LogSeverity valueOf(int i) {
        return forNumber(i);
    }
}