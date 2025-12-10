package com.google.api;

import com.google.api.JwtLocation;
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

/* loaded from: classes4.dex */
public final class AuthProvider extends GeneratedMessageLite<AuthProvider, Builder> implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser<AuthProvider> PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private Internal.ProtobufList<JwtLocation> jwtLocations_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes4.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AuthProvider, Builder> implements AuthProviderOrBuilder {
        public /* synthetic */ Builder(C7190a c7190a) {
            this();
        }

        public Builder addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43385X(iterable);
            return this;
        }

        public Builder addJwtLocations(JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43383Z(jwtLocation);
            return this;
        }

        public Builder clearAudiences() {
            copyOnWrite();
            ((AuthProvider) this.instance).m43382a0();
            return this;
        }

        public Builder clearAuthorizationUrl() {
            copyOnWrite();
            ((AuthProvider) this.instance).m43381b0();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((AuthProvider) this.instance).m43380c0();
            return this;
        }

        public Builder clearIssuer() {
            copyOnWrite();
            ((AuthProvider) this.instance).m43379d0();
            return this;
        }

        public Builder clearJwksUri() {
            copyOnWrite();
            ((AuthProvider) this.instance).m43378e0();
            return this;
        }

        public Builder clearJwtLocations() {
            copyOnWrite();
            ((AuthProvider) this.instance).m43377f0();
            return this;
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAudiences() {
            return ((AuthProvider) this.instance).getAudiences();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getAudiencesBytes() {
            return ((AuthProvider) this.instance).getAudiencesBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAuthorizationUrl() {
            return ((AuthProvider) this.instance).getAuthorizationUrl();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getAuthorizationUrlBytes() {
            return ((AuthProvider) this.instance).getAuthorizationUrlBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getId() {
            return ((AuthProvider) this.instance).getId();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getIdBytes() {
            return ((AuthProvider) this.instance).getIdBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getIssuer() {
            return ((AuthProvider) this.instance).getIssuer();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getIssuerBytes() {
            return ((AuthProvider) this.instance).getIssuerBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getJwksUri() {
            return ((AuthProvider) this.instance).getJwksUri();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getJwksUriBytes() {
            return ((AuthProvider) this.instance).getJwksUriBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public JwtLocation getJwtLocations(int i) {
            return ((AuthProvider) this.instance).getJwtLocations(i);
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public int getJwtLocationsCount() {
            return ((AuthProvider) this.instance).getJwtLocationsCount();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public List<JwtLocation> getJwtLocationsList() {
            return Collections.unmodifiableList(((AuthProvider) this.instance).getJwtLocationsList());
        }

        public Builder removeJwtLocations(int i) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43375h0(i);
            return this;
        }

        public Builder setAudiences(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43374i0(str);
            return this;
        }

        public Builder setAudiencesBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43373j0(byteString);
            return this;
        }

        public Builder setAuthorizationUrl(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43372k0(str);
            return this;
        }

        public Builder setAuthorizationUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43371l0(byteString);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43370m0(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43369n0(byteString);
            return this;
        }

        public Builder setIssuer(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43368o0(str);
            return this;
        }

        public Builder setIssuerBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43367p0(byteString);
            return this;
        }

        public Builder setJwksUri(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43366q0(str);
            return this;
        }

        public Builder setJwksUriBytes(ByteString byteString) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43365r0(byteString);
            return this;
        }

        public Builder setJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43364s0(i, jwtLocation);
            return this;
        }

        public Builder() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }

        public Builder addJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43384Y(i, jwtLocation);
            return this;
        }

        public Builder setJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43364s0(i, builder.build());
            return this;
        }

        public Builder addJwtLocations(JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43383Z(builder.build());
            return this;
        }

        public Builder addJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).m43384Y(i, builder.build());
            return this;
        }
    }

    /* renamed from: com.google.api.AuthProvider$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7190a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51599a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51599a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51599a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51599a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51599a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51599a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51599a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51599a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AuthProvider> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: X */
    public final void m43385X(Iterable iterable) {
        m43376g0();
        AbstractMessageLite.addAll(iterable, (List) this.jwtLocations_);
    }

    /* renamed from: Y */
    public final void m43384Y(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        m43376g0();
        this.jwtLocations_.add(i, jwtLocation);
    }

    /* renamed from: Z */
    public final void m43383Z(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        m43376g0();
        this.jwtLocations_.add(jwtLocation);
    }

    /* renamed from: a0 */
    public final void m43382a0() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* renamed from: b0 */
    public final void m43381b0() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* renamed from: c0 */
    public final void m43380c0() {
        this.id_ = getDefaultInstance().getId();
    }

    /* renamed from: d0 */
    public final void m43379d0() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7190a.f51599a[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthProvider();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AuthProvider> parser = PARSER;
                if (parser == null) {
                    synchronized (AuthProvider.class) {
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
    public final void m43378e0() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* renamed from: f0 */
    public final void m43377f0() {
        this.jwtLocations_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: g0 */
    public final void m43376g0() {
        Internal.ProtobufList<JwtLocation> protobufList = this.jwtLocations_;
        if (!protobufList.isModifiable()) {
            this.jwtLocations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAudiences() {
        return this.audiences_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8(this.audiences_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getAuthorizationUrlBytes() {
        return ByteString.copyFromUtf8(this.authorizationUrl_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getIssuer() {
        return this.issuer_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getIssuerBytes() {
        return ByteString.copyFromUtf8(this.issuer_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getJwksUri() {
        return this.jwksUri_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getJwksUriBytes() {
        return ByteString.copyFromUtf8(this.jwksUri_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public JwtLocation getJwtLocations(int i) {
        return this.jwtLocations_.get(i);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public JwtLocationOrBuilder getJwtLocationsOrBuilder(int i) {
        return this.jwtLocations_.get(i);
    }

    public List<? extends JwtLocationOrBuilder> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    /* renamed from: h0 */
    public final void m43375h0(int i) {
        m43376g0();
        this.jwtLocations_.remove(i);
    }

    /* renamed from: i0 */
    public final void m43374i0(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* renamed from: j0 */
    public final void m43373j0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.audiences_ = byteString.toStringUtf8();
    }

    /* renamed from: k0 */
    public final void m43372k0(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* renamed from: l0 */
    public final void m43371l0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.authorizationUrl_ = byteString.toStringUtf8();
    }

    /* renamed from: m0 */
    public final void m43370m0(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* renamed from: n0 */
    public final void m43369n0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* renamed from: o0 */
    public final void m43368o0(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* renamed from: p0 */
    public final void m43367p0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.issuer_ = byteString.toStringUtf8();
    }

    /* renamed from: q0 */
    public final void m43366q0(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* renamed from: r0 */
    public final void m43365r0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jwksUri_ = byteString.toStringUtf8();
    }

    /* renamed from: s0 */
    public final void m43364s0(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        m43376g0();
        this.jwtLocations_.set(i, jwtLocation);
    }

    public static Builder newBuilder(AuthProvider authProvider) {
        return DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AuthProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
