package io.grpc;

import ch.qos.logback.core.joran.action.Action;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@CheckReturnValue
@Immutable
/* loaded from: classes5.dex */
public final class CallOptions {
    public static final CallOptions DEFAULT;

    /* renamed from: a */
    public final Deadline f63072a;

    /* renamed from: b */
    public final Executor f63073b;

    /* renamed from: c */
    public final String f63074c;

    /* renamed from: d */
    public final CallCredentials f63075d;

    /* renamed from: e */
    public final String f63076e;

    /* renamed from: f */
    public final Object[][] f63077f;

    /* renamed from: g */
    public final List f63078g;

    /* renamed from: h */
    public final Boolean f63079h;

    /* renamed from: i */
    public final Integer f63080i;

    /* renamed from: j */
    public final Integer f63081j;

    /* renamed from: k */
    public final Integer f63082k;

    /* loaded from: classes5.dex */
    public static final class Key<T> {

        /* renamed from: a */
        public final String f63083a;

        /* renamed from: b */
        public final Object f63084b;

        public Key(String str, Object obj) {
            this.f63083a = str;
            this.f63084b = obj;
        }

        public static <T> Key<T> create(String str) {
            Preconditions.checkNotNull(str, "debugString");
            return new Key<>(str, null);
        }

        public static <T> Key<T> createWithDefault(String str, T t) {
            Preconditions.checkNotNull(str, "debugString");
            return new Key<>(str, t);
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1869")
        @Deprecated
        /* renamed from: of */
        public static <T> Key<T> m30458of(String str, T t) {
            Preconditions.checkNotNull(str, "debugString");
            return new Key<>(str, t);
        }

        public T getDefault() {
            return (T) this.f63084b;
        }

        public String toString() {
            return this.f63083a;
        }
    }

    /* renamed from: io.grpc.CallOptions$b */
    /* loaded from: classes5.dex */
    public static class C10502b {

        /* renamed from: a */
        public Deadline f63085a;

        /* renamed from: b */
        public Executor f63086b;

        /* renamed from: c */
        public String f63087c;

        /* renamed from: d */
        public CallCredentials f63088d;

        /* renamed from: e */
        public String f63089e;

        /* renamed from: f */
        public Object[][] f63090f;

        /* renamed from: g */
        public List f63091g;

        /* renamed from: h */
        public Boolean f63092h;

        /* renamed from: i */
        public Integer f63093i;

        /* renamed from: j */
        public Integer f63094j;

        /* renamed from: k */
        public Integer f63095k;

        /* renamed from: b */
        public final CallOptions m30456b() {
            return new CallOptions(this);
        }
    }

    static {
        C10502b c10502b = new C10502b();
        c10502b.f63090f = (Object[][]) Array.newInstance(Object.class, 0, 2);
        c10502b.f63091g = Collections.emptyList();
        DEFAULT = c10502b.m30456b();
    }

    /* renamed from: b */
    public static C10502b m30460b(CallOptions callOptions) {
        C10502b c10502b = new C10502b();
        c10502b.f63085a = callOptions.f63072a;
        c10502b.f63086b = callOptions.f63073b;
        c10502b.f63087c = callOptions.f63074c;
        c10502b.f63088d = callOptions.f63075d;
        c10502b.f63089e = callOptions.f63076e;
        c10502b.f63090f = callOptions.f63077f;
        c10502b.f63091g = callOptions.f63078g;
        c10502b.f63092h = callOptions.f63079h;
        c10502b.f63093i = callOptions.f63080i;
        c10502b.f63094j = callOptions.f63081j;
        c10502b.f63095k = callOptions.f63082k;
        return c10502b;
    }

    /* renamed from: a */
    public Boolean m30461a() {
        return this.f63079h;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/11021")
    public CallOptions clearOnReadyThreshold() {
        C10502b m30460b = m30460b(this);
        m30460b.f63095k = null;
        return m30460b.m30456b();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1767")
    @Nullable
    public String getAuthority() {
        return this.f63074c;
    }

    @Nullable
    public String getCompressor() {
        return this.f63076e;
    }

    @Nullable
    public CallCredentials getCredentials() {
        return this.f63075d;
    }

    @Nullable
    public Deadline getDeadline() {
        return this.f63072a;
    }

    @Nullable
    public Executor getExecutor() {
        return this.f63073b;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2563")
    @Nullable
    public Integer getMaxInboundMessageSize() {
        return this.f63080i;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2563")
    @Nullable
    public Integer getMaxOutboundMessageSize() {
        return this.f63081j;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/11021")
    @Nullable
    public Integer getOnReadyThreshold() {
        return this.f63082k;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1869")
    public <T> T getOption(Key<T> key) {
        Preconditions.checkNotNull(key, Action.KEY_ATTRIBUTE);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f63077f;
            if (i >= objArr.length) {
                return (T) key.f63084b;
            }
            if (key.equals(objArr[i][0])) {
                return (T) this.f63077f[i][1];
            }
            i++;
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2861")
    public List<ClientStreamTracer.Factory> getStreamTracerFactories() {
        return this.f63078g;
    }

    public boolean isWaitForReady() {
        return Boolean.TRUE.equals(this.f63079h);
    }

    public String toString() {
        Class<?> cls;
        MoreObjects.ToStringHelper add = MoreObjects.toStringHelper(this).add("deadline", this.f63072a).add("authority", this.f63074c).add("callCredentials", this.f63075d);
        Executor executor = this.f63073b;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        return add.add("executor", cls).add("compressorName", this.f63076e).add("customOptions", Arrays.deepToString(this.f63077f)).add("waitForReady", isWaitForReady()).add("maxInboundMessageSize", this.f63080i).add("maxOutboundMessageSize", this.f63081j).add("onReadyThreshold", this.f63082k).add("streamTracerFactories", this.f63078g).toString();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1767")
    public CallOptions withAuthority(@Nullable String str) {
        C10502b m30460b = m30460b(this);
        m30460b.f63087c = str;
        return m30460b.m30456b();
    }

    public CallOptions withCallCredentials(@Nullable CallCredentials callCredentials) {
        C10502b m30460b = m30460b(this);
        m30460b.f63088d = callCredentials;
        return m30460b.m30456b();
    }

    public CallOptions withCompression(@Nullable String str) {
        C10502b m30460b = m30460b(this);
        m30460b.f63089e = str;
        return m30460b.m30456b();
    }

    public CallOptions withDeadline(@Nullable Deadline deadline) {
        C10502b m30460b = m30460b(this);
        m30460b.f63085a = deadline;
        return m30460b.m30456b();
    }

    public CallOptions withDeadlineAfter(long j, TimeUnit timeUnit) {
        return withDeadline(Deadline.after(j, timeUnit));
    }

    public CallOptions withExecutor(@Nullable Executor executor) {
        C10502b m30460b = m30460b(this);
        m30460b.f63086b = executor;
        return m30460b.m30456b();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2563")
    public CallOptions withMaxInboundMessageSize(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "invalid maxsize %s", i);
        C10502b m30460b = m30460b(this);
        m30460b.f63093i = Integer.valueOf(i);
        return m30460b.m30456b();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2563")
    public CallOptions withMaxOutboundMessageSize(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "invalid maxsize %s", i);
        C10502b m30460b = m30460b(this);
        m30460b.f63094j = Integer.valueOf(i);
        return m30460b.m30456b();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/11021")
    public CallOptions withOnReadyThreshold(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "numBytes must be positive: %s", i);
        C10502b m30460b = m30460b(this);
        m30460b.f63095k = Integer.valueOf(i);
        return m30460b.m30456b();
    }

    public <T> CallOptions withOption(Key<T> key, T t) {
        int i;
        Preconditions.checkNotNull(key, Action.KEY_ATTRIBUTE);
        Preconditions.checkNotNull(t, "value");
        C10502b m30460b = m30460b(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f63077f;
            if (i2 < objArr.length) {
                if (key.equals(objArr[i2][0])) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        int length = this.f63077f.length;
        if (i2 == -1) {
            i = 1;
        } else {
            i = 0;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, length + i, 2);
        m30460b.f63090f = objArr2;
        Object[][] objArr3 = this.f63077f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i2 == -1) {
            Object[][] objArr4 = m30460b.f63090f;
            int length2 = this.f63077f.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = key;
            objArr5[1] = t;
            objArr4[length2] = objArr5;
        } else {
            Object[][] objArr6 = m30460b.f63090f;
            Object[] objArr7 = new Object[2];
            objArr7[0] = key;
            objArr7[1] = t;
            objArr6[i2] = objArr7;
        }
        return m30460b.m30456b();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2861")
    public CallOptions withStreamTracerFactory(ClientStreamTracer.Factory factory) {
        ArrayList arrayList = new ArrayList(this.f63078g.size() + 1);
        arrayList.addAll(this.f63078g);
        arrayList.add(factory);
        C10502b m30460b = m30460b(this);
        m30460b.f63091g = Collections.unmodifiableList(arrayList);
        return m30460b.m30456b();
    }

    public CallOptions withWaitForReady() {
        C10502b m30460b = m30460b(this);
        m30460b.f63092h = Boolean.TRUE;
        return m30460b.m30456b();
    }

    public CallOptions withoutWaitForReady() {
        C10502b m30460b = m30460b(this);
        m30460b.f63092h = Boolean.FALSE;
        return m30460b.m30456b();
    }

    public CallOptions(C10502b c10502b) {
        this.f63072a = c10502b.f63085a;
        this.f63073b = c10502b.f63086b;
        this.f63074c = c10502b.f63087c;
        this.f63075d = c10502b.f63088d;
        this.f63076e = c10502b.f63089e;
        this.f63077f = c10502b.f63090f;
        this.f63078g = c10502b.f63091g;
        this.f63079h = c10502b.f63092h;
        this.f63080i = c10502b.f63093i;
        this.f63081j = c10502b.f63094j;
        this.f63082k = c10502b.f63095k;
    }
}
