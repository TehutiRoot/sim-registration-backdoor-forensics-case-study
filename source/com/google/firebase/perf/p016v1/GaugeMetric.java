package com.google.firebase.perf.p016v1;

import com.google.firebase.perf.p016v1.AndroidMemoryReading;
import com.google.firebase.perf.p016v1.CpuMetricReading;
import com.google.firebase.perf.p016v1.GaugeMetadata;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.perf.v1.GaugeMetric */
/* loaded from: classes4.dex */
public final class GaugeMetric extends GeneratedMessageLite<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<GaugeMetric> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";
    private Internal.ProtobufList<CpuMetricReading> cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<AndroidMemoryReading> androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
        public /* synthetic */ Builder(C8596a c8596a) {
            this();
        }

        public Builder addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38036U(iterable);
            return this;
        }

        public Builder addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38035V(iterable);
            return this;
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38033X(androidMemoryReading);
            return this;
        }

        public Builder addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38031Z(cpuMetricReading);
            return this;
        }

        public Builder clearAndroidMemoryReadings() {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38030a0();
            return this;
        }

        public Builder clearCpuMetricReadings() {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38029b0();
            return this;
        }

        public Builder clearGaugeMetadata() {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38028c0();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38027d0();
            return this;
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public AndroidMemoryReading getAndroidMemoryReadings(int i) {
            return ((GaugeMetric) this.instance).getAndroidMemoryReadings(i);
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public int getAndroidMemoryReadingsCount() {
            return ((GaugeMetric) this.instance).getAndroidMemoryReadingsCount();
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.instance).getAndroidMemoryReadingsList());
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public CpuMetricReading getCpuMetricReadings(int i) {
            return ((GaugeMetric) this.instance).getCpuMetricReadings(i);
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public int getCpuMetricReadingsCount() {
            return ((GaugeMetric) this.instance).getCpuMetricReadingsCount();
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public List<CpuMetricReading> getCpuMetricReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.instance).getCpuMetricReadingsList());
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public GaugeMetadata getGaugeMetadata() {
            return ((GaugeMetric) this.instance).getGaugeMetadata();
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public String getSessionId() {
            return ((GaugeMetric) this.instance).getSessionId();
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public ByteString getSessionIdBytes() {
            return ((GaugeMetric) this.instance).getSessionIdBytes();
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public boolean hasGaugeMetadata() {
            return ((GaugeMetric) this.instance).hasGaugeMetadata();
        }

        @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
        public boolean hasSessionId() {
            return ((GaugeMetric) this.instance).hasSessionId();
        }

        public Builder mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38024g0(gaugeMetadata);
            return this;
        }

        public Builder removeAndroidMemoryReadings(int i) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38023h0(i);
            return this;
        }

        public Builder removeCpuMetricReadings(int i) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38022i0(i);
            return this;
        }

        public Builder setAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38021j0(i, androidMemoryReading);
            return this;
        }

        public Builder setCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38020k0(i, cpuMetricReading);
            return this;
        }

        public Builder setGaugeMetadata(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38019l0(gaugeMetadata);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38018m0(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38017n0(byteString);
            return this;
        }

        public Builder() {
            super(GaugeMetric.DEFAULT_INSTANCE);
        }

        public Builder addAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38034W(i, androidMemoryReading);
            return this;
        }

        public Builder addCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38032Y(i, cpuMetricReading);
            return this;
        }

        public Builder setAndroidMemoryReadings(int i, AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38021j0(i, builder.build());
            return this;
        }

        public Builder setCpuMetricReadings(int i, CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38020k0(i, builder.build());
            return this;
        }

        public Builder setGaugeMetadata(GaugeMetadata.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38019l0(builder.build());
            return this;
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38033X(builder.build());
            return this;
        }

        public Builder addCpuMetricReadings(CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38031Z(builder.build());
            return this;
        }

        public Builder addAndroidMemoryReadings(int i, AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38034W(i, builder.build());
            return this;
        }

        public Builder addCpuMetricReadings(int i, CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).m38032Y(i, builder.build());
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8596a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56296a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56296a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56296a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56296a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56296a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56296a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56296a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56296a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        GeneratedMessageLite.registerDefaultInstance(GaugeMetric.class, gaugeMetric);
    }

    public static GaugeMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GaugeMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: U */
    public final void m38036U(Iterable iterable) {
        m38026e0();
        AbstractMessageLite.addAll(iterable, (List) this.androidMemoryReadings_);
    }

    /* renamed from: V */
    public final void m38035V(Iterable iterable) {
        m38025f0();
        AbstractMessageLite.addAll(iterable, (List) this.cpuMetricReadings_);
    }

    /* renamed from: W */
    public final void m38034W(int i, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        m38026e0();
        this.androidMemoryReadings_.add(i, androidMemoryReading);
    }

    /* renamed from: X */
    public final void m38033X(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        m38026e0();
        this.androidMemoryReadings_.add(androidMemoryReading);
    }

    /* renamed from: Y */
    public final void m38032Y(int i, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        m38025f0();
        this.cpuMetricReadings_.add(i, cpuMetricReading);
    }

    /* renamed from: Z */
    public final void m38031Z(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        m38025f0();
        this.cpuMetricReadings_.add(cpuMetricReading);
    }

    /* renamed from: a0 */
    public final void m38030a0() {
        this.androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: b0 */
    public final void m38029b0() {
        this.cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: c0 */
    public final void m38028c0() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* renamed from: d0 */
    public final void m38027d0() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8596a.f56296a[methodToInvoke.ordinal()]) {
            case 1:
                return new GaugeMetric();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GaugeMetric> parser = PARSER;
                if (parser == null) {
                    synchronized (GaugeMetric.class) {
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
    public final void m38026e0() {
        Internal.ProtobufList<AndroidMemoryReading> protobufList = this.androidMemoryReadings_;
        if (!protobufList.isModifiable()) {
            this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: f0 */
    public final void m38025f0() {
        Internal.ProtobufList<CpuMetricReading> protobufList = this.cpuMetricReadings_;
        if (!protobufList.isModifiable()) {
            this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: g0 */
    public final void m38024g0(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        GaugeMetadata gaugeMetadata2 = this.gaugeMetadata_;
        if (gaugeMetadata2 != null && gaugeMetadata2 != GaugeMetadata.getDefaultInstance()) {
            this.gaugeMetadata_ = GaugeMetadata.newBuilder(this.gaugeMetadata_).mergeFrom((GaugeMetadata.Builder) gaugeMetadata).buildPartial();
        } else {
            this.gaugeMetadata_ = gaugeMetadata;
        }
        this.bitField0_ |= 2;
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public AndroidMemoryReading getAndroidMemoryReadings(int i) {
        return this.androidMemoryReadings_.get(i);
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public AndroidMemoryReadingOrBuilder getAndroidMemoryReadingsOrBuilder(int i) {
        return this.androidMemoryReadings_.get(i);
    }

    public List<? extends AndroidMemoryReadingOrBuilder> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public CpuMetricReading getCpuMetricReadings(int i) {
        return this.cpuMetricReadings_.get(i);
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public List<CpuMetricReading> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public CpuMetricReadingOrBuilder getCpuMetricReadingsOrBuilder(int i) {
        return this.cpuMetricReadings_.get(i);
    }

    public List<? extends CpuMetricReadingOrBuilder> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public GaugeMetadata getGaugeMetadata() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        if (gaugeMetadata == null) {
            return GaugeMetadata.getDefaultInstance();
        }
        return gaugeMetadata;
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    /* renamed from: h0 */
    public final void m38023h0(int i) {
        m38026e0();
        this.androidMemoryReadings_.remove(i);
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public boolean hasGaugeMetadata() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.p016v1.GaugeMetricOrBuilder
    public boolean hasSessionId() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final void m38022i0(int i) {
        m38025f0();
        this.cpuMetricReadings_.remove(i);
    }

    /* renamed from: j0 */
    public final void m38021j0(int i, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        m38026e0();
        this.androidMemoryReadings_.set(i, androidMemoryReading);
    }

    /* renamed from: k0 */
    public final void m38020k0(int i, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        m38025f0();
        this.cpuMetricReadings_.set(i, cpuMetricReading);
    }

    /* renamed from: l0 */
    public final void m38019l0(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        this.gaugeMetadata_ = gaugeMetadata;
        this.bitField0_ |= 2;
    }

    /* renamed from: m0 */
    public final void m38018m0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* renamed from: n0 */
    public final void m38017n0(ByteString byteString) {
        this.sessionId_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder(GaugeMetric gaugeMetric) {
        return DEFAULT_INSTANCE.createBuilder(gaugeMetric);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GaugeMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GaugeMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
