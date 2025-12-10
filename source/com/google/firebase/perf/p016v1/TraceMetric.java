package com.google.firebase.perf.p016v1;

import com.google.firebase.perf.p016v1.PerfSession;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.perf.v1.TraceMetric */
/* loaded from: classes4.dex */
public final class TraceMetric extends GeneratedMessageLite<TraceMetric, Builder> implements TraceMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<TraceMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<TraceMetric> subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<PerfSession> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TraceMetric, Builder> implements TraceMetricOrBuilder {
        public /* synthetic */ Builder(C8613a c8613a) {
            this();
        }

        public Builder addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37862Z(iterable);
            return this;
        }

        public Builder addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37861a0(iterable);
            return this;
        }

        public Builder addPerfSessions(PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37859c0(perfSession);
            return this;
        }

        public Builder addSubtraces(TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37857e0(traceMetric);
            return this;
        }

        public Builder clearClientStartTimeUs() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37856f0();
            return this;
        }

        public Builder clearCounters() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37848n0().clear();
            return this;
        }

        public Builder clearCustomAttributes() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37847o0().clear();
            return this;
        }

        public Builder clearDurationUs() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37855g0();
            return this;
        }

        public Builder clearIsAuto() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37854h0();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37853i0();
            return this;
        }

        public Builder clearPerfSessions() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37852j0();
            return this;
        }

        public Builder clearSubtraces() {
            copyOnWrite();
            ((TraceMetric) this.instance).m37851k0();
            return this;
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public boolean containsCounters(String str) {
            str.getClass();
            return ((TraceMetric) this.instance).getCountersMap().containsKey(str);
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public boolean containsCustomAttributes(String str) {
            str.getClass();
            return ((TraceMetric) this.instance).getCustomAttributesMap().containsKey(str);
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public long getClientStartTimeUs() {
            return ((TraceMetric) this.instance).getClientStartTimeUs();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        @Deprecated
        public Map<String, Long> getCounters() {
            return getCountersMap();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public int getCountersCount() {
            return ((TraceMetric) this.instance).getCountersMap().size();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public Map<String, Long> getCountersMap() {
            return Collections.unmodifiableMap(((TraceMetric) this.instance).getCountersMap());
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public long getCountersOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> countersMap = ((TraceMetric) this.instance).getCountersMap();
            if (countersMap.containsKey(str)) {
                return countersMap.get(str).longValue();
            }
            return j;
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public long getCountersOrThrow(String str) {
            str.getClass();
            Map<String, Long> countersMap = ((TraceMetric) this.instance).getCountersMap();
            if (countersMap.containsKey(str)) {
                return countersMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        @Deprecated
        public Map<String, String> getCustomAttributes() {
            return getCustomAttributesMap();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public int getCustomAttributesCount() {
            return ((TraceMetric) this.instance).getCustomAttributesMap().size();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public Map<String, String> getCustomAttributesMap() {
            return Collections.unmodifiableMap(((TraceMetric) this.instance).getCustomAttributesMap());
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public String getCustomAttributesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> customAttributesMap = ((TraceMetric) this.instance).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            return str2;
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public String getCustomAttributesOrThrow(String str) {
            str.getClass();
            Map<String, String> customAttributesMap = ((TraceMetric) this.instance).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public long getDurationUs() {
            return ((TraceMetric) this.instance).getDurationUs();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public boolean getIsAuto() {
            return ((TraceMetric) this.instance).getIsAuto();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public String getName() {
            return ((TraceMetric) this.instance).getName();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public ByteString getNameBytes() {
            return ((TraceMetric) this.instance).getNameBytes();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public PerfSession getPerfSessions(int i) {
            return ((TraceMetric) this.instance).getPerfSessions(i);
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public int getPerfSessionsCount() {
            return ((TraceMetric) this.instance).getPerfSessionsCount();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public List<PerfSession> getPerfSessionsList() {
            return Collections.unmodifiableList(((TraceMetric) this.instance).getPerfSessionsList());
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public TraceMetric getSubtraces(int i) {
            return ((TraceMetric) this.instance).getSubtraces(i);
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public int getSubtracesCount() {
            return ((TraceMetric) this.instance).getSubtracesCount();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public List<TraceMetric> getSubtracesList() {
            return Collections.unmodifiableList(((TraceMetric) this.instance).getSubtracesList());
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public boolean hasClientStartTimeUs() {
            return ((TraceMetric) this.instance).hasClientStartTimeUs();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public boolean hasDurationUs() {
            return ((TraceMetric) this.instance).hasDurationUs();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public boolean hasIsAuto() {
            return ((TraceMetric) this.instance).hasIsAuto();
        }

        @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
        public boolean hasName() {
            return ((TraceMetric) this.instance).hasName();
        }

        public Builder putAllCounters(Map<String, Long> map) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37848n0().putAll(map);
            return this;
        }

        public Builder putAllCustomAttributes(Map<String, String> map) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37847o0().putAll(map);
            return this;
        }

        public Builder putCounters(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).m37848n0().put(str, Long.valueOf(j));
            return this;
        }

        public Builder putCustomAttributes(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).m37847o0().put(str, str2);
            return this;
        }

        public Builder removeCounters(String str) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).m37848n0().remove(str);
            return this;
        }

        public Builder removeCustomAttributes(String str) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).m37847o0().remove(str);
            return this;
        }

        public Builder removePerfSessions(int i) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37842t0(i);
            return this;
        }

        public Builder removeSubtraces(int i) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37841u0(i);
            return this;
        }

        public Builder setClientStartTimeUs(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37840v0(j);
            return this;
        }

        public Builder setDurationUs(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37839w0(j);
            return this;
        }

        public Builder setIsAuto(boolean z) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37838x0(z);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37837y0(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37836z0(byteString);
            return this;
        }

        public Builder setPerfSessions(int i, PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37888A0(i, perfSession);
            return this;
        }

        public Builder setSubtraces(int i, TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37886B0(i, traceMetric);
            return this;
        }

        public Builder() {
            super(TraceMetric.DEFAULT_INSTANCE);
        }

        public Builder addPerfSessions(int i, PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37860b0(i, perfSession);
            return this;
        }

        public Builder addSubtraces(int i, TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37858d0(i, traceMetric);
            return this;
        }

        public Builder setPerfSessions(int i, PerfSession.Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37888A0(i, builder.build());
            return this;
        }

        public Builder setSubtraces(int i, Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37886B0(i, builder.build());
            return this;
        }

        public Builder addPerfSessions(PerfSession.Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37859c0(builder.build());
            return this;
        }

        public Builder addSubtraces(Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37857e0(builder.build());
            return this;
        }

        public Builder addPerfSessions(int i, PerfSession.Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37860b0(i, builder.build());
            return this;
        }

        public Builder addSubtraces(int i, Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).m37858d0(i, builder.build());
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8613a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56307a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56307a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56307a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56307a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56307a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56307a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56307a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56307a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$b */
    /* loaded from: classes4.dex */
    public static final class C8614b {

        /* renamed from: a */
        public static final MapEntryLite f56308a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$c */
    /* loaded from: classes4.dex */
    public static final class C8615c {

        /* renamed from: a */
        public static final MapEntryLite f56309a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f56309a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        GeneratedMessageLite.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m37888A0(int i, PerfSession perfSession) {
        perfSession.getClass();
        m37850l0();
        this.perfSessions_.set(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m37862Z(Iterable iterable) {
        m37850l0();
        AbstractMessageLite.addAll(iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m37860b0(int i, PerfSession perfSession) {
        perfSession.getClass();
        m37850l0();
        this.perfSessions_.add(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m37859c0(PerfSession perfSession) {
        perfSession.getClass();
        m37850l0();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m37856f0() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m37853i0() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m37852j0() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: l0 */
    private void m37850l0() {
        Internal.ProtobufList<PerfSession> protobufList = this.perfSessions_;
        if (!protobufList.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public Map m37847o0() {
        return m37843s0();
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TraceMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: q0 */
    private MapFieldLite m37845q0() {
        return this.customAttributes_;
    }

    /* renamed from: s0 */
    private MapFieldLite m37843s0() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public void m37842t0(int i) {
        m37850l0();
        this.perfSessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public void m37840v0(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m37837y0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public void m37836z0(ByteString byteString) {
        this.name_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* renamed from: B0 */
    public final void m37886B0(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        m37849m0();
        this.subtraces_.set(i, traceMetric);
    }

    /* renamed from: a0 */
    public final void m37861a0(Iterable iterable) {
        m37849m0();
        AbstractMessageLite.addAll(iterable, (List) this.subtraces_);
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public boolean containsCounters(String str) {
        str.getClass();
        return m37846p0().containsKey(str);
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return m37845q0().containsKey(str);
    }

    /* renamed from: d0 */
    public final void m37858d0(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        m37849m0();
        this.subtraces_.add(i, traceMetric);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8613a.f56307a[methodToInvoke.ordinal()]) {
            case 1:
                return new TraceMetric();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C8614b.f56308a, "subtraces_", TraceMetric.class, "customAttributes_", C8615c.f56309a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TraceMetric> parser = PARSER;
                if (parser == null) {
                    synchronized (TraceMetric.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } finally {
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e0 */
    public final void m37857e0(TraceMetric traceMetric) {
        traceMetric.getClass();
        m37849m0();
        this.subtraces_.add(traceMetric);
    }

    /* renamed from: g0 */
    public final void m37855g0() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    @Deprecated
    public Map<String, Long> getCounters() {
        return getCountersMap();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public int getCountersCount() {
        return m37846p0().size();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(m37846p0());
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public long getCountersOrDefault(String str, long j) {
        str.getClass();
        MapFieldLite m37846p0 = m37846p0();
        if (m37846p0.containsKey(str)) {
            return ((Long) m37846p0.get(str)).longValue();
        }
        return j;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public long getCountersOrThrow(String str) {
        str.getClass();
        MapFieldLite m37846p0 = m37846p0();
        if (m37846p0.containsKey(str)) {
            return ((Long) m37846p0.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public int getCustomAttributesCount() {
        return m37845q0().size();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(m37845q0());
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite m37845q0 = m37845q0();
        if (m37845q0.containsKey(str)) {
            return (String) m37845q0.get(str);
        }
        return str2;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        MapFieldLite m37845q0 = m37845q0();
        if (m37845q0.containsKey(str)) {
            return (String) m37845q0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public long getDurationUs() {
        return this.durationUs_;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public boolean getIsAuto() {
        return this.isAuto_;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public PerfSession getPerfSessions(int i) {
        return this.perfSessions_.get(i);
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public PerfSessionOrBuilder getPerfSessionsOrBuilder(int i) {
        return this.perfSessions_.get(i);
    }

    public List<? extends PerfSessionOrBuilder> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public TraceMetric getSubtraces(int i) {
        return this.subtraces_.get(i);
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public List<TraceMetric> getSubtracesList() {
        return this.subtraces_;
    }

    public TraceMetricOrBuilder getSubtracesOrBuilder(int i) {
        return this.subtraces_.get(i);
    }

    public List<? extends TraceMetricOrBuilder> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    /* renamed from: h0 */
    public final void m37854h0() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public boolean hasClientStartTimeUs() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public boolean hasDurationUs() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public boolean hasIsAuto() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.p016v1.TraceMetricOrBuilder
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    public final void m37851k0() {
        this.subtraces_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: m0 */
    public final void m37849m0() {
        Internal.ProtobufList<TraceMetric> protobufList = this.subtraces_;
        if (!protobufList.isModifiable()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: n0 */
    public final Map m37848n0() {
        return m37844r0();
    }

    /* renamed from: p0 */
    public final MapFieldLite m37846p0() {
        return this.counters_;
    }

    /* renamed from: r0 */
    public final MapFieldLite m37844r0() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    /* renamed from: u0 */
    public final void m37841u0(int i) {
        m37849m0();
        this.subtraces_.remove(i);
    }

    /* renamed from: w0 */
    public final void m37839w0(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* renamed from: x0 */
    public final void m37838x0(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    public static Builder newBuilder(TraceMetric traceMetric) {
        return DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TraceMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
