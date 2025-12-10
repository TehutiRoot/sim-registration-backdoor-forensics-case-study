package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class MethodDescriptor<ReqT, RespT> {

    /* renamed from: a */
    public final MethodType f63313a;

    /* renamed from: b */
    public final String f63314b;

    /* renamed from: c */
    public final String f63315c;

    /* renamed from: d */
    public final Marshaller f63316d;

    /* renamed from: e */
    public final Marshaller f63317e;

    /* renamed from: f */
    public final Object f63318f;

    /* renamed from: g */
    public final boolean f63319g;

    /* renamed from: h */
    public final boolean f63320h;

    /* renamed from: i */
    public final boolean f63321i;

    /* renamed from: j */
    public final AtomicReferenceArray f63322j;

    /* loaded from: classes5.dex */
    public static final class Builder<ReqT, RespT> {

        /* renamed from: a */
        public Marshaller f63323a;

        /* renamed from: b */
        public Marshaller f63324b;

        /* renamed from: c */
        public MethodType f63325c;

        /* renamed from: d */
        public String f63326d;

        /* renamed from: e */
        public boolean f63327e;

        /* renamed from: f */
        public boolean f63328f;

        /* renamed from: g */
        public Object f63329g;

        /* renamed from: h */
        public boolean f63330h;

        @CheckReturnValue
        public MethodDescriptor<ReqT, RespT> build() {
            return new MethodDescriptor<>(this.f63325c, this.f63326d, this.f63323a, this.f63324b, this.f63329g, this.f63327e, this.f63328f, this.f63330h);
        }

        public Builder<ReqT, RespT> setFullMethodName(String str) {
            this.f63326d = str;
            return this;
        }

        public Builder<ReqT, RespT> setIdempotent(boolean z) {
            this.f63327e = z;
            if (!z) {
                this.f63328f = false;
            }
            return this;
        }

        public Builder<ReqT, RespT> setRequestMarshaller(Marshaller<ReqT> marshaller) {
            this.f63323a = marshaller;
            return this;
        }

        public Builder<ReqT, RespT> setResponseMarshaller(Marshaller<RespT> marshaller) {
            this.f63324b = marshaller;
            return this;
        }

        public Builder<ReqT, RespT> setSafe(boolean z) {
            this.f63328f = z;
            if (z) {
                this.f63327e = true;
            }
            return this;
        }

        public Builder<ReqT, RespT> setSampledToLocalTracing(boolean z) {
            this.f63330h = z;
            return this;
        }

        public Builder<ReqT, RespT> setSchemaDescriptor(@Nullable Object obj) {
            this.f63329g = obj;
            return this;
        }

        public Builder<ReqT, RespT> setType(MethodType methodType) {
            this.f63325c = methodType;
            return this;
        }

        public Builder() {
        }
    }

    /* loaded from: classes5.dex */
    public interface Marshaller<T> {
        T parse(InputStream inputStream);

        InputStream stream(T t);
    }

    /* loaded from: classes5.dex */
    public enum MethodType {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean clientSendsOneMessage() {
            if (this != UNARY && this != SERVER_STREAMING) {
                return false;
            }
            return true;
        }

        public final boolean serverSendsOneMessage() {
            if (this != UNARY && this != CLIENT_STREAMING) {
                return false;
            }
            return true;
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2222")
    /* loaded from: classes5.dex */
    public interface PrototypeMarshaller<T> extends ReflectableMarshaller<T> {
        @Nullable
        T getMessagePrototype();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2222")
    /* loaded from: classes5.dex */
    public interface ReflectableMarshaller<T> extends Marshaller<T> {
        Class<T> getMessageClass();
    }

    @Deprecated
    public static <RequestT, ResponseT> MethodDescriptor<RequestT, ResponseT> create(MethodType methodType, String str, Marshaller<RequestT> marshaller, Marshaller<ResponseT> marshaller2) {
        return new MethodDescriptor<>(methodType, str, marshaller, marshaller2, null, false, false, false);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/5635")
    @Nullable
    public static String extractBareMethodName(String str) {
        int lastIndexOf = ((String) Preconditions.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    @Nullable
    public static String extractFullServiceName(String str) {
        int lastIndexOf = ((String) Preconditions.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static String generateFullMethodName(String str, String str2) {
        return ((String) Preconditions.checkNotNull(str, "fullServiceName")) + RemoteSettings.FORWARD_SLASH_STRING + ((String) Preconditions.checkNotNull(str2, "methodName"));
    }

    @CheckReturnValue
    public static <ReqT, RespT> Builder<ReqT, RespT> newBuilder() {
        return newBuilder(null, null);
    }

    /* renamed from: a */
    public final Object m30357a(int i) {
        return this.f63322j.get(i);
    }

    /* renamed from: b */
    public final void m30356b(int i, Object obj) {
        this.f63322j.lazySet(i, obj);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/5635")
    @Nullable
    public String getBareMethodName() {
        return extractBareMethodName(this.f63314b);
    }

    public String getFullMethodName() {
        return this.f63314b;
    }

    public Marshaller<ReqT> getRequestMarshaller() {
        return this.f63316d;
    }

    public Marshaller<RespT> getResponseMarshaller() {
        return this.f63317e;
    }

    @Nullable
    public Object getSchemaDescriptor() {
        return this.f63318f;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/5635")
    @Nullable
    public String getServiceName() {
        return this.f63315c;
    }

    public MethodType getType() {
        return this.f63313a;
    }

    public boolean isIdempotent() {
        return this.f63319g;
    }

    public boolean isSafe() {
        return this.f63320h;
    }

    public boolean isSampledToLocalTracing() {
        return this.f63321i;
    }

    public ReqT parseRequest(InputStream inputStream) {
        return (ReqT) this.f63316d.parse(inputStream);
    }

    public RespT parseResponse(InputStream inputStream) {
        return (RespT) this.f63317e.parse(inputStream);
    }

    public InputStream streamRequest(ReqT reqt) {
        return this.f63316d.stream(reqt);
    }

    public InputStream streamResponse(RespT respt) {
        return this.f63317e.stream(respt);
    }

    @CheckReturnValue
    public Builder<ReqT, RespT> toBuilder() {
        return (Builder<ReqT, RespT>) toBuilder(this.f63316d, this.f63317e);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("fullMethodName", this.f63314b).add("type", this.f63313a).add("idempotent", this.f63319g).add("safe", this.f63320h).add("sampledToLocalTracing", this.f63321i).add("requestMarshaller", this.f63316d).add("responseMarshaller", this.f63317e).add("schemaDescriptor", this.f63318f).omitNullValues().toString();
    }

    public MethodDescriptor(MethodType methodType, String str, Marshaller marshaller, Marshaller marshaller2, Object obj, boolean z, boolean z2, boolean z3) {
        this.f63322j = new AtomicReferenceArray(2);
        this.f63313a = (MethodType) Preconditions.checkNotNull(methodType, "type");
        this.f63314b = (String) Preconditions.checkNotNull(str, "fullMethodName");
        this.f63315c = extractFullServiceName(str);
        this.f63316d = (Marshaller) Preconditions.checkNotNull(marshaller, "requestMarshaller");
        this.f63317e = (Marshaller) Preconditions.checkNotNull(marshaller2, "responseMarshaller");
        this.f63318f = obj;
        this.f63319g = z;
        this.f63320h = z2;
        this.f63321i = z3;
    }

    @CheckReturnValue
    public static <ReqT, RespT> Builder<ReqT, RespT> newBuilder(Marshaller<ReqT> marshaller, Marshaller<RespT> marshaller2) {
        return new Builder().setRequestMarshaller(marshaller).setResponseMarshaller(marshaller2);
    }

    @CheckReturnValue
    public <NewReqT, NewRespT> Builder<NewReqT, NewRespT> toBuilder(Marshaller<NewReqT> marshaller, Marshaller<NewRespT> marshaller2) {
        return (Builder<ReqT, RespT>) newBuilder().setRequestMarshaller(marshaller).setResponseMarshaller(marshaller2).setType(this.f63313a).setFullMethodName(this.f63314b).setIdempotent(this.f63319g).setSafe(this.f63320h).setSampledToLocalTracing(this.f63321i).setSchemaDescriptor(this.f63318f);
    }
}
