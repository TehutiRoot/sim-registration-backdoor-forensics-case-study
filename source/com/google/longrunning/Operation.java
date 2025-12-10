package com.google.longrunning;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Operation extends GeneratedMessageLite<Operation, Builder> implements OperationOrBuilder {
    private static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Operation> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private Object result_;
    private int resultCase_ = 0;
    private String name_ = "";

    /* loaded from: classes4.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Operation, Builder> implements OperationOrBuilder {
        public /* synthetic */ Builder(C8805a c8805a) {
            this();
        }

        public Builder clearDone() {
            copyOnWrite();
            ((Operation) this.instance).m37294R();
            return this;
        }

        public Builder clearError() {
            copyOnWrite();
            ((Operation) this.instance).m37293S();
            return this;
        }

        public Builder clearMetadata() {
            copyOnWrite();
            ((Operation) this.instance).m37292T();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Operation) this.instance).m37291U();
            return this;
        }

        public Builder clearResponse() {
            copyOnWrite();
            ((Operation) this.instance).m37290V();
            return this;
        }

        public Builder clearResult() {
            copyOnWrite();
            ((Operation) this.instance).m37289W();
            return this;
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean getDone() {
            return ((Operation) this.instance).getDone();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public Status getError() {
            return ((Operation) this.instance).getError();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public Any getMetadata() {
            return ((Operation) this.instance).getMetadata();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public String getName() {
            return ((Operation) this.instance).getName();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public ByteString getNameBytes() {
            return ((Operation) this.instance).getNameBytes();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public Any getResponse() {
            return ((Operation) this.instance).getResponse();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public ResultCase getResultCase() {
            return ((Operation) this.instance).getResultCase();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean hasError() {
            return ((Operation) this.instance).hasError();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean hasMetadata() {
            return ((Operation) this.instance).hasMetadata();
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean hasResponse() {
            return ((Operation) this.instance).hasResponse();
        }

        public Builder mergeError(Status status) {
            copyOnWrite();
            ((Operation) this.instance).m37288X(status);
            return this;
        }

        public Builder mergeMetadata(Any any) {
            copyOnWrite();
            ((Operation) this.instance).m37287Y(any);
            return this;
        }

        public Builder mergeResponse(Any any) {
            copyOnWrite();
            ((Operation) this.instance).m37286Z(any);
            return this;
        }

        public Builder setDone(boolean z) {
            copyOnWrite();
            ((Operation) this.instance).m37285a0(z);
            return this;
        }

        public Builder setError(Status status) {
            copyOnWrite();
            ((Operation) this.instance).m37284b0(status);
            return this;
        }

        public Builder setMetadata(Any any) {
            copyOnWrite();
            ((Operation) this.instance).m37283c0(any);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Operation) this.instance).m37282d0(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Operation) this.instance).m37281e0(byteString);
            return this;
        }

        public Builder setResponse(Any any) {
            copyOnWrite();
            ((Operation) this.instance).m37280f0(any);
            return this;
        }

        public Builder() {
            super(Operation.DEFAULT_INSTANCE);
        }

        public Builder setError(Status.Builder builder) {
            copyOnWrite();
            ((Operation) this.instance).m37284b0(builder.build());
            return this;
        }

        public Builder setMetadata(Any.Builder builder) {
            copyOnWrite();
            ((Operation) this.instance).m37283c0(builder.build());
            return this;
        }

        public Builder setResponse(Any.Builder builder) {
            copyOnWrite();
            ((Operation) this.instance).m37280f0(builder.build());
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public enum ResultCase {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);
        
        private final int value;

        ResultCase(int i) {
            this.value = i;
        }

        public static ResultCase forNumber(int i) {
            if (i != 0) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                    return RESPONSE;
                }
                return ERROR;
            }
            return RESULT_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ResultCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.google.longrunning.Operation$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8805a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56863a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56863a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56863a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56863a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56863a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56863a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56863a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56863a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Operation operation = new Operation();
        DEFAULT_INSTANCE = operation;
        GeneratedMessageLite.registerDefaultInstance(Operation.class, operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m37292T() {
        this.metadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m37291U() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m37290V() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m37282d0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m37281e0(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Operation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: R */
    public final void m37294R() {
        this.done_ = false;
    }

    /* renamed from: S */
    public final void m37293S() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* renamed from: W */
    public final void m37289W() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* renamed from: X */
    public final void m37288X(Status status) {
        status.getClass();
        if (this.resultCase_ == 4 && this.result_ != Status.getDefaultInstance()) {
            this.result_ = Status.newBuilder((Status) this.result_).mergeFrom((Status.Builder) status).buildPartial();
        } else {
            this.result_ = status;
        }
        this.resultCase_ = 4;
    }

    /* renamed from: Y */
    public final void m37287Y(Any any) {
        any.getClass();
        Any any2 = this.metadata_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.metadata_ = Any.newBuilder(this.metadata_).mergeFrom((Any.Builder) any).buildPartial();
        } else {
            this.metadata_ = any;
        }
    }

    /* renamed from: Z */
    public final void m37286Z(Any any) {
        any.getClass();
        if (this.resultCase_ == 5 && this.result_ != Any.getDefaultInstance()) {
            this.result_ = Any.newBuilder((Any) this.result_).mergeFrom((Any.Builder) any).buildPartial();
        } else {
            this.result_ = any;
        }
        this.resultCase_ = 5;
    }

    /* renamed from: a0 */
    public final void m37285a0(boolean z) {
        this.done_ = z;
    }

    /* renamed from: b0 */
    public final void m37284b0(Status status) {
        status.getClass();
        this.result_ = status;
        this.resultCase_ = 4;
    }

    /* renamed from: c0 */
    public final void m37283c0(Any any) {
        any.getClass();
        this.metadata_ = any;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8805a.f56863a[methodToInvoke.ordinal()]) {
            case 1:
                return new Operation();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "name_", "metadata_", "done_", Status.class, Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Operation> parser = PARSER;
                if (parser == null) {
                    synchronized (Operation.class) {
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

    /* renamed from: f0 */
    public final void m37280f0(Any any) {
        any.getClass();
        this.result_ = any;
        this.resultCase_ = 5;
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean getDone() {
        return this.done_;
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public Status getError() {
        if (this.resultCase_ == 4) {
            return (Status) this.result_;
        }
        return Status.getDefaultInstance();
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public Any getMetadata() {
        Any any = this.metadata_;
        if (any == null) {
            return Any.getDefaultInstance();
        }
        return any;
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public Any getResponse() {
        if (this.resultCase_ == 5) {
            return (Any) this.result_;
        }
        return Any.getDefaultInstance();
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public ResultCase getResultCase() {
        return ResultCase.forNumber(this.resultCase_);
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean hasError() {
        if (this.resultCase_ == 4) {
            return true;
        }
        return false;
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean hasMetadata() {
        if (this.metadata_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean hasResponse() {
        if (this.resultCase_ == 5) {
            return true;
        }
        return false;
    }

    public static Builder newBuilder(Operation operation) {
        return DEFAULT_INSTANCE.createBuilder(operation);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Operation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Operation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Operation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Operation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
