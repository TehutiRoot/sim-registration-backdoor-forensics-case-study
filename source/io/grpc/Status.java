package io.grpc;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import io.grpc.Metadata;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@CheckReturnValue
@Immutable
/* loaded from: classes5.dex */
public final class Status {

    /* renamed from: f */
    public static final Metadata.InterfaceC10541i f63404f;

    /* renamed from: g */
    public static final Metadata.Key f63405g;

    /* renamed from: a */
    public final Code f63406a;

    /* renamed from: b */
    public final String f63407b;

    /* renamed from: c */
    public final Throwable f63408c;

    /* renamed from: d */
    public static final List f63402d = m30316c();

    /* renamed from: OK */
    public static final Status f63401OK = Code.OK.toStatus();
    public static final Status CANCELLED = Code.CANCELLED.toStatus();
    public static final Status UNKNOWN = Code.UNKNOWN.toStatus();
    public static final Status INVALID_ARGUMENT = Code.INVALID_ARGUMENT.toStatus();
    public static final Status DEADLINE_EXCEEDED = Code.DEADLINE_EXCEEDED.toStatus();
    public static final Status NOT_FOUND = Code.NOT_FOUND.toStatus();
    public static final Status ALREADY_EXISTS = Code.ALREADY_EXISTS.toStatus();
    public static final Status PERMISSION_DENIED = Code.PERMISSION_DENIED.toStatus();
    public static final Status UNAUTHENTICATED = Code.UNAUTHENTICATED.toStatus();
    public static final Status RESOURCE_EXHAUSTED = Code.RESOURCE_EXHAUSTED.toStatus();
    public static final Status FAILED_PRECONDITION = Code.FAILED_PRECONDITION.toStatus();
    public static final Status ABORTED = Code.ABORTED.toStatus();
    public static final Status OUT_OF_RANGE = Code.OUT_OF_RANGE.toStatus();
    public static final Status UNIMPLEMENTED = Code.UNIMPLEMENTED.toStatus();
    public static final Status INTERNAL = Code.INTERNAL.toStatus();
    public static final Status UNAVAILABLE = Code.UNAVAILABLE.toStatus();
    public static final Status DATA_LOSS = Code.DATA_LOSS.toStatus();

    /* renamed from: e */
    public static final Metadata.Key f63403e = Metadata.Key.m30376e("grpc-status", false, new C10560b());

    /* loaded from: classes5.dex */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        private final int value;
        private final byte[] valueAscii;

        Code(int i) {
            this.value = i;
            this.valueAscii = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] valueAscii() {
            return this.valueAscii;
        }

        public Status toStatus() {
            return (Status) Status.f63402d.get(this.value);
        }

        public int value() {
            return this.value;
        }
    }

    /* renamed from: io.grpc.Status$b */
    /* loaded from: classes5.dex */
    public static final class C10560b implements Metadata.InterfaceC10541i {
        public C10560b() {
        }

        @Override // io.grpc.Metadata.InterfaceC10541i
        /* renamed from: a */
        public Status parseAsciiString(byte[] bArr) {
            return Status.m30314e(bArr);
        }

        @Override // io.grpc.Metadata.InterfaceC10541i
        /* renamed from: b */
        public byte[] toAsciiString(Status status) {
            return status.getCode().valueAscii();
        }
    }

    /* renamed from: io.grpc.Status$c */
    /* loaded from: classes5.dex */
    public static final class C10561c implements Metadata.InterfaceC10541i {

        /* renamed from: a */
        public static final byte[] f63410a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        public C10561c() {
        }

        /* renamed from: a */
        public static boolean m30310a(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        /* renamed from: c */
        public static String m30308c(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == 37 && i + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, StandardCharsets.US_ASCII), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i]);
                i++;
            }
            return new String(allocate.array(), 0, allocate.position(), StandardCharsets.UTF_8);
        }

        /* renamed from: e */
        public static byte[] m30306e(byte[] bArr, int i) {
            byte[] bArr2 = new byte[((bArr.length - i) * 3) + i];
            if (i != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            int i2 = i;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (m30310a(b)) {
                    bArr2[i2] = 37;
                    byte[] bArr3 = f63410a;
                    bArr2[i2 + 1] = bArr3[(b >> 4) & 15];
                    bArr2[i2 + 2] = bArr3[b & 15];
                    i2 += 3;
                } else {
                    bArr2[i2] = b;
                    i2++;
                }
                i++;
            }
            return Arrays.copyOf(bArr2, i2);
        }

        @Override // io.grpc.Metadata.InterfaceC10541i
        /* renamed from: b */
        public String parseAsciiString(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    return m30308c(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // io.grpc.Metadata.InterfaceC10541i
        /* renamed from: d */
        public byte[] toAsciiString(String str) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < bytes.length; i++) {
                if (m30310a(bytes[i])) {
                    return m30306e(bytes, i);
                }
            }
            return bytes;
        }
    }

    static {
        C10561c c10561c = new C10561c();
        f63404f = c10561c;
        f63405g = Metadata.Key.m30376e("grpc-message", false, c10561c);
    }

    public Status(Code code) {
        this(code, null, null);
    }

    /* renamed from: c */
    public static List m30316c() {
        Code[] values;
        Status status;
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            if (((Status) treeMap.put(Integer.valueOf(code.value()), new Status(code))) != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* renamed from: d */
    public static String m30315d(Status status) {
        if (status.f63407b == null) {
            return status.f63406a.toString();
        }
        return status.f63406a + ": " + status.f63407b;
    }

    /* renamed from: e */
    public static Status m30314e(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f63401OK;
        }
        return m30313f(bArr);
    }

    /* renamed from: f */
    public static Status m30313f(byte[] bArr) {
        byte b;
        int length = bArr.length;
        char c = 1;
        int i = 0;
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
            }
            Status status = UNKNOWN;
            return status.withDescription("Unknown code " + new String(bArr, StandardCharsets.US_ASCII));
        }
        c = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            List list = f63402d;
            if (i2 < list.size()) {
                return (Status) list.get(i2);
            }
        }
        Status status2 = UNKNOWN;
        return status2.withDescription("Unknown code " + new String(bArr, StandardCharsets.US_ASCII));
    }

    public static Status fromCode(Code code) {
        return code.toStatus();
    }

    public static Status fromCodeValue(int i) {
        if (i >= 0) {
            List list = f63402d;
            if (i < list.size()) {
                return (Status) list.get(i);
            }
        }
        Status status = UNKNOWN;
        return status.withDescription("Unknown code " + i);
    }

    public static Status fromThrowable(Throwable th2) {
        for (Throwable th3 = (Throwable) Preconditions.checkNotNull(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof StatusException) {
                return ((StatusException) th3).getStatus();
            }
            if (th3 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th3).getStatus();
            }
        }
        return UNKNOWN.withCause(th2);
    }

    @Nullable
    public static Metadata trailersFromThrowable(Throwable th2) {
        for (Throwable th3 = (Throwable) Preconditions.checkNotNull(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof StatusException) {
                return ((StatusException) th3).getTrailers();
            }
            if (th3 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th3).getTrailers();
            }
        }
        return null;
    }

    public StatusException asException() {
        return new StatusException(this);
    }

    public StatusRuntimeException asRuntimeException() {
        return new StatusRuntimeException(this);
    }

    public Status augmentDescription(String str) {
        if (str == null) {
            return this;
        }
        if (this.f63407b == null) {
            return new Status(this.f63406a, str, this.f63408c);
        }
        Code code = this.f63406a;
        return new Status(code, this.f63407b + "\n" + str, this.f63408c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Throwable getCause() {
        return this.f63408c;
    }

    public Code getCode() {
        return this.f63406a;
    }

    @Nullable
    public String getDescription() {
        return this.f63407b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isOk() {
        if (Code.OK == this.f63406a) {
            return true;
        }
        return false;
    }

    public String toString() {
        MoreObjects.ToStringHelper add = MoreObjects.toStringHelper(this).add("code", this.f63406a.name()).add("description", this.f63407b);
        Throwable th2 = this.f63408c;
        String str = th2;
        if (th2 != null) {
            str = Throwables.getStackTraceAsString(th2);
        }
        return add.add("cause", str).toString();
    }

    public Status withCause(Throwable th2) {
        if (Objects.equal(this.f63408c, th2)) {
            return this;
        }
        return new Status(this.f63406a, this.f63407b, th2);
    }

    public Status withDescription(String str) {
        if (Objects.equal(this.f63407b, str)) {
            return this;
        }
        return new Status(this.f63406a, str, this.f63408c);
    }

    public Status(Code code, String str, Throwable th2) {
        this.f63406a = (Code) Preconditions.checkNotNull(code, "code");
        this.f63407b = str;
        this.f63408c = th2;
    }

    public StatusException asException(@Nullable Metadata metadata) {
        return new StatusException(this, metadata);
    }

    public StatusRuntimeException asRuntimeException(@Nullable Metadata metadata) {
        return new StatusRuntimeException(this, metadata);
    }
}
