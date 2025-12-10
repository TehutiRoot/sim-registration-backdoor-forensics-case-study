package io.opencensus.common;

import java.util.TreeMap;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class ServerStatsFieldEnums {

    /* renamed from: a */
    public static final int f63536a = m30611a();

    /* renamed from: io.opencensus.common.ServerStatsFieldEnums$Id */
    /* loaded from: classes5.dex */
    public enum EnumC10568Id {
        SERVER_STATS_LB_LATENCY_ID(0),
        SERVER_STATS_SERVICE_LATENCY_ID(1),
        SERVER_STATS_TRACE_OPTION_ID(2);
        
        private static final TreeMap<Integer, EnumC10568Id> map = new TreeMap<>();
        private final int value;

        static {
            EnumC10568Id[] values;
            for (EnumC10568Id enumC10568Id : values()) {
                map.put(Integer.valueOf(enumC10568Id.value), enumC10568Id);
            }
        }

        EnumC10568Id(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }

        @Nullable
        public static EnumC10568Id valueOf(int i) {
            return map.get(Integer.valueOf(i));
        }
    }

    /* loaded from: classes5.dex */
    public enum Size {
        SERVER_STATS_LB_LATENCY_SIZE(8),
        SERVER_STATS_SERVICE_LATENCY_SIZE(8),
        SERVER_STATS_TRACE_OPTION_SIZE(1);
        
        private final int value;

        Size(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    /* renamed from: a */
    public static int m30611a() {
        int i = 0;
        for (Size size : Size.values()) {
            i = i + size.value() + 1;
        }
        return i;
    }

    public static int getTotalSize() {
        return f63536a;
    }
}