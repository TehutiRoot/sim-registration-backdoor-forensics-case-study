package io.opencensus.common;

import io.opencensus.common.ServerStatsFieldEnums;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
public final class ServerStatsEncoding {
    public static final byte CURRENT_VERSION = 0;

    /* renamed from: io.opencensus.common.ServerStatsEncoding$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C10567a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63535a;

        static {
            int[] iArr = new int[ServerStatsFieldEnums.EnumC10568Id.values().length];
            f63535a = iArr;
            try {
                iArr[ServerStatsFieldEnums.EnumC10568Id.SERVER_STATS_LB_LATENCY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63535a[ServerStatsFieldEnums.EnumC10568Id.SERVER_STATS_SERVICE_LATENCY_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63535a[ServerStatsFieldEnums.EnumC10568Id.SERVER_STATS_TRACE_OPTION_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static ServerStats parseBytes(byte[] bArr) throws ServerStatsDeserializationException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        if (wrap.hasRemaining()) {
            byte b = wrap.get();
            if (b <= 0 && b >= 0) {
                long j = 0;
                long j2 = 0;
                byte b2 = 0;
                while (wrap.hasRemaining()) {
                    ServerStatsFieldEnums.EnumC10568Id valueOf = ServerStatsFieldEnums.EnumC10568Id.valueOf(wrap.get() & 255);
                    if (valueOf == null) {
                        wrap.position(wrap.limit());
                    } else {
                        int i = C10567a.f63535a[valueOf.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    b2 = wrap.get();
                                }
                            } else {
                                j2 = wrap.getLong();
                            }
                        } else {
                            j = wrap.getLong();
                        }
                    }
                }
                try {
                    return ServerStats.create(j, j2, b2);
                } catch (IllegalArgumentException e) {
                    throw new ServerStatsDeserializationException("Serialized ServiceStats contains invalid values: " + e.getMessage());
                }
            }
            throw new ServerStatsDeserializationException("Invalid ServerStats version: " + ((int) b));
        }
        throw new ServerStatsDeserializationException("Serialized ServerStats buffer is empty");
    }

    public static byte[] toBytes(ServerStats serverStats) {
        ByteBuffer allocate = ByteBuffer.allocate(ServerStatsFieldEnums.getTotalSize() + 1);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put((byte) 0);
        allocate.put((byte) ServerStatsFieldEnums.EnumC10568Id.SERVER_STATS_LB_LATENCY_ID.value());
        allocate.putLong(serverStats.getLbLatencyNs());
        allocate.put((byte) ServerStatsFieldEnums.EnumC10568Id.SERVER_STATS_SERVICE_LATENCY_ID.value());
        allocate.putLong(serverStats.getServiceLatencyNs());
        allocate.put((byte) ServerStatsFieldEnums.EnumC10568Id.SERVER_STATS_TRACE_OPTION_ID.value());
        allocate.put(serverStats.getTraceOption());
        return allocate.array();
    }
}