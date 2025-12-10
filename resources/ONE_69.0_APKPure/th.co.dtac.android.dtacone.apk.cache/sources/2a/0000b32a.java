package com.google.geo.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Viewport extends GeneratedMessageLite<Viewport, Builder> implements ViewportOrBuilder {
    private static final Viewport DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile Parser<Viewport> PARSER;
    private LatLng high_;
    private LatLng low_;

    /* loaded from: classes4.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Viewport, Builder> implements ViewportOrBuilder {
        public /* synthetic */ Builder(C8659a c8659a) {
            this();
        }

        public Builder clearHigh() {
            copyOnWrite();
            ((Viewport) this.instance).m37579I();
            return this;
        }

        public Builder clearLow() {
            copyOnWrite();
            ((Viewport) this.instance).m37578J();
            return this;
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public LatLng getHigh() {
            return ((Viewport) this.instance).getHigh();
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public LatLng getLow() {
            return ((Viewport) this.instance).getLow();
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public boolean hasHigh() {
            return ((Viewport) this.instance).hasHigh();
        }

        @Override // com.google.geo.type.ViewportOrBuilder
        public boolean hasLow() {
            return ((Viewport) this.instance).hasLow();
        }

        public Builder mergeHigh(LatLng latLng) {
            copyOnWrite();
            ((Viewport) this.instance).m37577K(latLng);
            return this;
        }

        public Builder mergeLow(LatLng latLng) {
            copyOnWrite();
            ((Viewport) this.instance).m37576L(latLng);
            return this;
        }

        public Builder setHigh(LatLng latLng) {
            copyOnWrite();
            ((Viewport) this.instance).m37575M(latLng);
            return this;
        }

        public Builder setLow(LatLng latLng) {
            copyOnWrite();
            ((Viewport) this.instance).m37574N(latLng);
            return this;
        }

        public Builder() {
            super(Viewport.DEFAULT_INSTANCE);
        }

        public Builder setHigh(LatLng.Builder builder) {
            copyOnWrite();
            ((Viewport) this.instance).m37575M(builder.build());
            return this;
        }

        public Builder setLow(LatLng.Builder builder) {
            copyOnWrite();
            ((Viewport) this.instance).m37574N(builder.build());
            return this;
        }
    }

    /* renamed from: com.google.geo.type.Viewport$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8659a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56647a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56647a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56647a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56647a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56647a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56647a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56647a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56647a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Viewport viewport = new Viewport();
        DEFAULT_INSTANCE = viewport;
        GeneratedMessageLite.registerDefaultInstance(Viewport.class, viewport);
    }

    public static Viewport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Viewport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Viewport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: I */
    public final void m37579I() {
        this.high_ = null;
    }

    /* renamed from: J */
    public final void m37578J() {
        this.low_ = null;
    }

    /* renamed from: K */
    public final void m37577K(LatLng latLng) {
        latLng.getClass();
        LatLng latLng2 = this.high_;
        if (latLng2 != null && latLng2 != LatLng.getDefaultInstance()) {
            this.high_ = LatLng.newBuilder(this.high_).mergeFrom((LatLng.Builder) latLng).buildPartial();
        } else {
            this.high_ = latLng;
        }
    }

    /* renamed from: L */
    public final void m37576L(LatLng latLng) {
        latLng.getClass();
        LatLng latLng2 = this.low_;
        if (latLng2 != null && latLng2 != LatLng.getDefaultInstance()) {
            this.low_ = LatLng.newBuilder(this.low_).mergeFrom((LatLng.Builder) latLng).buildPartial();
        } else {
            this.low_ = latLng;
        }
    }

    /* renamed from: M */
    public final void m37575M(LatLng latLng) {
        latLng.getClass();
        this.high_ = latLng;
    }

    /* renamed from: N */
    public final void m37574N(LatLng latLng) {
        latLng.getClass();
        this.low_ = latLng;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8659a.f56647a[methodToInvoke.ordinal()]) {
            case 1:
                return new Viewport();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"low_", "high_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Viewport> parser = PARSER;
                if (parser == null) {
                    synchronized (Viewport.class) {
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

    @Override // com.google.geo.type.ViewportOrBuilder
    public LatLng getHigh() {
        LatLng latLng = this.high_;
        if (latLng == null) {
            return LatLng.getDefaultInstance();
        }
        return latLng;
    }

    @Override // com.google.geo.type.ViewportOrBuilder
    public LatLng getLow() {
        LatLng latLng = this.low_;
        if (latLng == null) {
            return LatLng.getDefaultInstance();
        }
        return latLng;
    }

    @Override // com.google.geo.type.ViewportOrBuilder
    public boolean hasHigh() {
        if (this.high_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.geo.type.ViewportOrBuilder
    public boolean hasLow() {
        if (this.low_ != null) {
            return true;
        }
        return false;
    }

    public static Builder newBuilder(Viewport viewport) {
        return DEFAULT_INSTANCE.createBuilder(viewport);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Viewport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Viewport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Viewport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Viewport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Viewport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Viewport parseFrom(InputStream inputStream) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}