package com.google.type;

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

/* loaded from: classes5.dex */
public final class PostalAddress extends GeneratedMessageLite<PostalAddress, Builder> implements PostalAddressOrBuilder {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser<PostalAddress> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private int revision_;
    private String regionCode_ = "";
    private String languageCode_ = "";
    private String postalCode_ = "";
    private String sortingCode_ = "";
    private String administrativeArea_ = "";
    private String locality_ = "";
    private String sublocality_ = "";
    private Internal.ProtobufList<String> addressLines_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> recipients_ = GeneratedMessageLite.emptyProtobufList();
    private String organization_ = "";

    /* loaded from: classes5.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PostalAddress, Builder> implements PostalAddressOrBuilder {
        public /* synthetic */ Builder(C8994a c8994a) {
            this();
        }

        public Builder addAddressLines(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34307m0(str);
            return this;
        }

        public Builder addAddressLinesBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34306n0(byteString);
            return this;
        }

        public Builder addAllAddressLines(Iterable<String> iterable) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34305o0(iterable);
            return this;
        }

        public Builder addAllRecipients(Iterable<String> iterable) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34304p0(iterable);
            return this;
        }

        public Builder addRecipients(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34303q0(str);
            return this;
        }

        public Builder addRecipientsBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34302r0(byteString);
            return this;
        }

        public Builder clearAddressLines() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34301s0();
            return this;
        }

        public Builder clearAdministrativeArea() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34300t0();
            return this;
        }

        public Builder clearLanguageCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34299u0();
            return this;
        }

        public Builder clearLocality() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34298v0();
            return this;
        }

        public Builder clearOrganization() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34297w0();
            return this;
        }

        public Builder clearPostalCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34296x0();
            return this;
        }

        public Builder clearRecipients() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34295y0();
            return this;
        }

        public Builder clearRegionCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34294z0();
            return this;
        }

        public Builder clearRevision() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34368A0();
            return this;
        }

        public Builder clearSortingCode() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34366B0();
            return this;
        }

        public Builder clearSublocality() {
            copyOnWrite();
            ((PostalAddress) this.instance).m34364C0();
            return this;
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getAddressLines(int i) {
            return ((PostalAddress) this.instance).getAddressLines(i);
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getAddressLinesBytes(int i) {
            return ((PostalAddress) this.instance).getAddressLinesBytes(i);
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public int getAddressLinesCount() {
            return ((PostalAddress) this.instance).getAddressLinesCount();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public List<String> getAddressLinesList() {
            return Collections.unmodifiableList(((PostalAddress) this.instance).getAddressLinesList());
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getAdministrativeArea() {
            return ((PostalAddress) this.instance).getAdministrativeArea();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getAdministrativeAreaBytes() {
            return ((PostalAddress) this.instance).getAdministrativeAreaBytes();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getLanguageCode() {
            return ((PostalAddress) this.instance).getLanguageCode();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getLanguageCodeBytes() {
            return ((PostalAddress) this.instance).getLanguageCodeBytes();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getLocality() {
            return ((PostalAddress) this.instance).getLocality();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getLocalityBytes() {
            return ((PostalAddress) this.instance).getLocalityBytes();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getOrganization() {
            return ((PostalAddress) this.instance).getOrganization();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getOrganizationBytes() {
            return ((PostalAddress) this.instance).getOrganizationBytes();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getPostalCode() {
            return ((PostalAddress) this.instance).getPostalCode();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getPostalCodeBytes() {
            return ((PostalAddress) this.instance).getPostalCodeBytes();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getRecipients(int i) {
            return ((PostalAddress) this.instance).getRecipients(i);
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getRecipientsBytes(int i) {
            return ((PostalAddress) this.instance).getRecipientsBytes(i);
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public int getRecipientsCount() {
            return ((PostalAddress) this.instance).getRecipientsCount();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public List<String> getRecipientsList() {
            return Collections.unmodifiableList(((PostalAddress) this.instance).getRecipientsList());
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getRegionCode() {
            return ((PostalAddress) this.instance).getRegionCode();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getRegionCodeBytes() {
            return ((PostalAddress) this.instance).getRegionCodeBytes();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public int getRevision() {
            return ((PostalAddress) this.instance).getRevision();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getSortingCode() {
            return ((PostalAddress) this.instance).getSortingCode();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getSortingCodeBytes() {
            return ((PostalAddress) this.instance).getSortingCodeBytes();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public String getSublocality() {
            return ((PostalAddress) this.instance).getSublocality();
        }

        @Override // com.google.type.PostalAddressOrBuilder
        public ByteString getSublocalityBytes() {
            return ((PostalAddress) this.instance).getSublocalityBytes();
        }

        public Builder setAddressLines(int i, String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34358F0(i, str);
            return this;
        }

        public Builder setAdministrativeArea(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34356G0(str);
            return this;
        }

        public Builder setAdministrativeAreaBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34354H0(byteString);
            return this;
        }

        public Builder setLanguageCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34352I0(str);
            return this;
        }

        public Builder setLanguageCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34350J0(byteString);
            return this;
        }

        public Builder setLocality(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34348K0(str);
            return this;
        }

        public Builder setLocalityBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34346L0(byteString);
            return this;
        }

        public Builder setOrganization(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34344M0(str);
            return this;
        }

        public Builder setOrganizationBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34342N0(byteString);
            return this;
        }

        public Builder setPostalCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34340O0(str);
            return this;
        }

        public Builder setPostalCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34338P0(byteString);
            return this;
        }

        public Builder setRecipients(int i, String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34336Q0(i, str);
            return this;
        }

        public Builder setRegionCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34334R0(str);
            return this;
        }

        public Builder setRegionCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34332S0(byteString);
            return this;
        }

        public Builder setRevision(int i) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34330T0(i);
            return this;
        }

        public Builder setSortingCode(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34328U0(str);
            return this;
        }

        public Builder setSortingCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34326V0(byteString);
            return this;
        }

        public Builder setSublocality(String str) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34324W0(str);
            return this;
        }

        public Builder setSublocalityBytes(ByteString byteString) {
            copyOnWrite();
            ((PostalAddress) this.instance).m34322X0(byteString);
            return this;
        }

        public Builder() {
            super(PostalAddress.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.type.PostalAddress$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C8994a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57575a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f57575a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57575a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57575a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57575a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57575a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57575a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57575a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        PostalAddress postalAddress = new PostalAddress();
        DEFAULT_INSTANCE = postalAddress;
        GeneratedMessageLite.registerDefaultInstance(PostalAddress.class, postalAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public void m34334R0(String str) {
        str.getClass();
        this.regionCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public void m34332S0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.regionCode_ = byteString.toStringUtf8();
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PostalAddress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public void m34294z0() {
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    /* renamed from: A0 */
    public final void m34368A0() {
        this.revision_ = 0;
    }

    /* renamed from: B0 */
    public final void m34366B0() {
        this.sortingCode_ = getDefaultInstance().getSortingCode();
    }

    /* renamed from: C0 */
    public final void m34364C0() {
        this.sublocality_ = getDefaultInstance().getSublocality();
    }

    /* renamed from: D0 */
    public final void m34362D0() {
        Internal.ProtobufList<String> protobufList = this.addressLines_;
        if (!protobufList.isModifiable()) {
            this.addressLines_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: E0 */
    public final void m34360E0() {
        Internal.ProtobufList<String> protobufList = this.recipients_;
        if (!protobufList.isModifiable()) {
            this.recipients_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* renamed from: F0 */
    public final void m34358F0(int i, String str) {
        str.getClass();
        m34362D0();
        this.addressLines_.set(i, str);
    }

    /* renamed from: G0 */
    public final void m34356G0(String str) {
        str.getClass();
        this.administrativeArea_ = str;
    }

    /* renamed from: H0 */
    public final void m34354H0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.administrativeArea_ = byteString.toStringUtf8();
    }

    /* renamed from: I0 */
    public final void m34352I0(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* renamed from: J0 */
    public final void m34350J0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.toStringUtf8();
    }

    /* renamed from: K0 */
    public final void m34348K0(String str) {
        str.getClass();
        this.locality_ = str;
    }

    /* renamed from: L0 */
    public final void m34346L0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.locality_ = byteString.toStringUtf8();
    }

    /* renamed from: M0 */
    public final void m34344M0(String str) {
        str.getClass();
        this.organization_ = str;
    }

    /* renamed from: N0 */
    public final void m34342N0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.organization_ = byteString.toStringUtf8();
    }

    /* renamed from: O0 */
    public final void m34340O0(String str) {
        str.getClass();
        this.postalCode_ = str;
    }

    /* renamed from: P0 */
    public final void m34338P0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.postalCode_ = byteString.toStringUtf8();
    }

    /* renamed from: Q0 */
    public final void m34336Q0(int i, String str) {
        str.getClass();
        m34360E0();
        this.recipients_.set(i, str);
    }

    /* renamed from: T0 */
    public final void m34330T0(int i) {
        this.revision_ = i;
    }

    /* renamed from: U0 */
    public final void m34328U0(String str) {
        str.getClass();
        this.sortingCode_ = str;
    }

    /* renamed from: V0 */
    public final void m34326V0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sortingCode_ = byteString.toStringUtf8();
    }

    /* renamed from: W0 */
    public final void m34324W0(String str) {
        str.getClass();
        this.sublocality_ = str;
    }

    /* renamed from: X0 */
    public final void m34322X0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sublocality_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8994a.f57575a[methodToInvoke.ordinal()]) {
            case 1:
                return new PostalAddress();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PostalAddress> parser = PARSER;
                if (parser == null) {
                    synchronized (PostalAddress.class) {
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

    @Override // com.google.type.PostalAddressOrBuilder
    public String getAddressLines(int i) {
        return this.addressLines_.get(i);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getAddressLinesBytes(int i) {
        return ByteString.copyFromUtf8(this.addressLines_.get(i));
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getAdministrativeAreaBytes() {
        return ByteString.copyFromUtf8(this.administrativeArea_);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getLanguageCode() {
        return this.languageCode_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8(this.languageCode_);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getLocality() {
        return this.locality_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getLocalityBytes() {
        return ByteString.copyFromUtf8(this.locality_);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getOrganization() {
        return this.organization_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8(this.organization_);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getPostalCode() {
        return this.postalCode_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getPostalCodeBytes() {
        return ByteString.copyFromUtf8(this.postalCode_);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getRecipients(int i) {
        return this.recipients_.get(i);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getRecipientsBytes(int i) {
        return ByteString.copyFromUtf8(this.recipients_.get(i));
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public int getRecipientsCount() {
        return this.recipients_.size();
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public List<String> getRecipientsList() {
        return this.recipients_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getRegionCode() {
        return this.regionCode_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getRegionCodeBytes() {
        return ByteString.copyFromUtf8(this.regionCode_);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public int getRevision() {
        return this.revision_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getSortingCode() {
        return this.sortingCode_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getSortingCodeBytes() {
        return ByteString.copyFromUtf8(this.sortingCode_);
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public String getSublocality() {
        return this.sublocality_;
    }

    @Override // com.google.type.PostalAddressOrBuilder
    public ByteString getSublocalityBytes() {
        return ByteString.copyFromUtf8(this.sublocality_);
    }

    /* renamed from: m0 */
    public final void m34307m0(String str) {
        str.getClass();
        m34362D0();
        this.addressLines_.add(str);
    }

    /* renamed from: n0 */
    public final void m34306n0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        m34362D0();
        this.addressLines_.add(byteString.toStringUtf8());
    }

    /* renamed from: o0 */
    public final void m34305o0(Iterable iterable) {
        m34362D0();
        AbstractMessageLite.addAll(iterable, (List) this.addressLines_);
    }

    /* renamed from: p0 */
    public final void m34304p0(Iterable iterable) {
        m34360E0();
        AbstractMessageLite.addAll(iterable, (List) this.recipients_);
    }

    /* renamed from: q0 */
    public final void m34303q0(String str) {
        str.getClass();
        m34360E0();
        this.recipients_.add(str);
    }

    /* renamed from: r0 */
    public final void m34302r0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        m34360E0();
        this.recipients_.add(byteString.toStringUtf8());
    }

    /* renamed from: s0 */
    public final void m34301s0() {
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: t0 */
    public final void m34300t0() {
        this.administrativeArea_ = getDefaultInstance().getAdministrativeArea();
    }

    /* renamed from: u0 */
    public final void m34299u0() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* renamed from: v0 */
    public final void m34298v0() {
        this.locality_ = getDefaultInstance().getLocality();
    }

    /* renamed from: w0 */
    public final void m34297w0() {
        this.organization_ = getDefaultInstance().getOrganization();
    }

    /* renamed from: x0 */
    public final void m34296x0() {
        this.postalCode_ = getDefaultInstance().getPostalCode();
    }

    /* renamed from: y0 */
    public final void m34295y0() {
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Builder newBuilder(PostalAddress postalAddress) {
        return DEFAULT_INSTANCE.createBuilder(postalAddress);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PostalAddress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PostalAddress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}