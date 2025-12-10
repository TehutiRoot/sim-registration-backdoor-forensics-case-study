package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class DecodeJob implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable, FactoryPools.Poolable {

    /* renamed from: A */
    public DataSource f41895A;

    /* renamed from: B */
    public DataFetcher f41896B;

    /* renamed from: C */
    public volatile DataFetcherGenerator f41897C;

    /* renamed from: D */
    public volatile boolean f41898D;

    /* renamed from: E */
    public volatile boolean f41899E;

    /* renamed from: F */
    public boolean f41900F;

    /* renamed from: d */
    public final InterfaceC5762e f41904d;

    /* renamed from: e */
    public final Pools.Pool f41905e;

    /* renamed from: h */
    public GlideContext f41908h;

    /* renamed from: i */
    public Key f41909i;

    /* renamed from: j */
    public Priority f41910j;

    /* renamed from: k */
    public C0247DS f41911k;

    /* renamed from: l */
    public int f41912l;

    /* renamed from: m */
    public int f41913m;

    /* renamed from: n */
    public DiskCacheStrategy f41914n;

    /* renamed from: o */
    public Options f41915o;

    /* renamed from: p */
    public InterfaceC5759b f41916p;

    /* renamed from: q */
    public int f41917q;

    /* renamed from: r */
    public Stage f41918r;

    /* renamed from: s */
    public RunReason f41919s;

    /* renamed from: t */
    public long f41920t;

    /* renamed from: u */
    public boolean f41921u;

    /* renamed from: v */
    public Object f41922v;

    /* renamed from: w */
    public Thread f41923w;

    /* renamed from: x */
    public Key f41924x;

    /* renamed from: y */
    public Key f41925y;

    /* renamed from: z */
    public Object f41926z;

    /* renamed from: a */
    public final C5789c f41901a = new C5789c();

    /* renamed from: b */
    public final List f41902b = new ArrayList();

    /* renamed from: c */
    public final StateVerifier f41903c = StateVerifier.newInstance();

    /* renamed from: f */
    public final C5761d f41906f = new C5761d();

    /* renamed from: g */
    public final C5763f f41907g = new C5763f();

    /* loaded from: classes3.dex */
    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* loaded from: classes3.dex */
    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5758a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41927a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41928b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f41929c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f41929c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41929c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f41928b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41928b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41928b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41928b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41928b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f41927a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41927a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41927a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5759b {
        /* renamed from: a */
        void mo50350a(DecodeJob decodeJob);

        void onLoadFailed(GlideException glideException);

        void onResourceReady(Resource resource, DataSource dataSource, boolean z);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    /* loaded from: classes3.dex */
    public final class C5760c implements DecodePath.InterfaceC5764a {

        /* renamed from: a */
        public final DataSource f41930a;

        public C5760c(DataSource dataSource) {
            this.f41930a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.DecodePath.InterfaceC5764a
        /* renamed from: a */
        public Resource mo50446a(Resource resource) {
            return DecodeJob.this.m50464t(this.f41930a, resource);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    /* loaded from: classes3.dex */
    public static class C5761d {

        /* renamed from: a */
        public Key f41932a;

        /* renamed from: b */
        public ResourceEncoder f41933b;

        /* renamed from: c */
        public C18289Pk0 f41934c;

        /* renamed from: a */
        public void m50457a() {
            this.f41932a = null;
            this.f41933b = null;
            this.f41934c = null;
        }

        /* renamed from: b */
        public void m50456b(InterfaceC5762e interfaceC5762e, Options options) {
            GlideTrace.beginSection("DecodeJob.encode");
            try {
                interfaceC5762e.getDiskCache().put(this.f41932a, new C0503HD(this.f41933b, this.f41934c, options));
            } finally {
                this.f41934c.m66927d();
                GlideTrace.endSection();
            }
        }

        /* renamed from: c */
        public boolean m50455c() {
            if (this.f41934c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public void m50454d(Key key, ResourceEncoder resourceEncoder, C18289Pk0 c18289Pk0) {
            this.f41932a = key;
            this.f41933b = resourceEncoder;
            this.f41934c = c18289Pk0;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC5762e {
        DiskCache getDiskCache();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    /* loaded from: classes3.dex */
    public static class C5763f {

        /* renamed from: a */
        public boolean f41935a;

        /* renamed from: b */
        public boolean f41936b;

        /* renamed from: c */
        public boolean f41937c;

        /* renamed from: a */
        public final boolean m50453a(boolean z) {
            if ((this.f41937c || z || this.f41936b) && this.f41935a) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public synchronized boolean m50452b() {
            this.f41936b = true;
            return m50453a(false);
        }

        /* renamed from: c */
        public synchronized boolean m50451c() {
            this.f41937c = true;
            return m50453a(false);
        }

        /* renamed from: d */
        public synchronized boolean m50450d(boolean z) {
            this.f41935a = true;
            return m50453a(z);
        }

        /* renamed from: e */
        public synchronized void m50449e() {
            this.f41936b = false;
            this.f41935a = false;
            this.f41937c = false;
        }
    }

    public DecodeJob(InterfaceC5762e interfaceC5762e, Pools.Pool pool) {
        this.f41904d = interfaceC5762e;
        this.f41905e = pool;
    }

    /* renamed from: A */
    public final void m50483A() {
        Throwable th2;
        this.f41903c.throwIfRecycled();
        if (this.f41898D) {
            if (this.f41902b.isEmpty()) {
                th2 = null;
            } else {
                List list = this.f41902b;
                th2 = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.f41898D = true;
    }

    /* renamed from: B */
    public boolean m50482B() {
        Stage m50475i = m50475i(Stage.INITIALIZE);
        if (m50475i != Stage.RESOURCE_CACHE && m50475i != Stage.DATA_CACHE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m50481a() {
        this.f41899E = true;
        DataFetcherGenerator dataFetcherGenerator = this.f41897C;
        if (dataFetcherGenerator != null) {
            dataFetcherGenerator.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(DecodeJob decodeJob) {
        int m50473k = m50473k() - decodeJob.m50473k();
        if (m50473k == 0) {
            return this.f41917q - decodeJob.f41917q;
        }
        return m50473k;
    }

    /* renamed from: c */
    public final Resource m50479c(DataFetcher dataFetcher, Object obj, DataSource dataSource) {
        if (obj == null) {
            dataFetcher.cleanup();
            return null;
        }
        try {
            long logTime = LogTime.getLogTime();
            Resource m50478d = m50478d(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m50471m("Decoded result " + m50478d, logTime);
            }
            return m50478d;
        } finally {
            dataFetcher.cleanup();
        }
    }

    /* renamed from: d */
    public final Resource m50478d(Object obj, DataSource dataSource) {
        return m50459y(obj, dataSource, this.f41901a.m50378h(obj.getClass()));
    }

    /* renamed from: f */
    public final void m50477f() {
        Resource resource;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f41920t;
            m50470n("Retrieved data", j, "data: " + this.f41926z + ", cache key: " + this.f41924x + ", fetcher: " + this.f41896B);
        }
        try {
            resource = m50479c(this.f41896B, this.f41926z, this.f41895A);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f41925y, this.f41895A);
            this.f41902b.add(e);
            resource = null;
        }
        if (resource != null) {
            m50468p(resource, this.f41895A, this.f41900F);
        } else {
            m50460x();
        }
    }

    /* renamed from: g */
    public final DataFetcherGenerator m50476g() {
        int i = C5758a.f41928b[this.f41918r.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f41918r);
                }
                return new C5816g(this.f41901a, this);
            }
            return new C5781b(this.f41901a, this);
        }
        return new C5815f(this.f41901a, this);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public StateVerifier getVerifier() {
        return this.f41903c;
    }

    /* renamed from: i */
    public final Stage m50475i(Stage stage) {
        int i = C5758a.f41928b[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        if (this.f41914n.decodeCachedResource()) {
                            return Stage.RESOURCE_CACHE;
                        }
                        return m50475i(Stage.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + stage);
                }
                return Stage.FINISHED;
            } else if (this.f41921u) {
                return Stage.FINISHED;
            } else {
                return Stage.SOURCE;
            }
        } else if (this.f41914n.decodeCachedData()) {
            return Stage.DATA_CACHE;
        } else {
            return m50475i(Stage.DATA_CACHE);
        }
    }

    /* renamed from: j */
    public final Options m50474j(DataSource dataSource) {
        boolean z;
        Options options = this.f41915o;
        if (Build.VERSION.SDK_INT < 26) {
            return options;
        }
        if (dataSource != DataSource.RESOURCE_DISK_CACHE && !this.f41901a.m50362x()) {
            z = false;
        } else {
            z = true;
        }
        Option<Boolean> option = Downsampler.ALLOW_HARDWARE_CONFIG;
        Boolean bool = (Boolean) options.get(option);
        if (bool != null && (!bool.booleanValue() || z)) {
            return options;
        }
        Options options2 = new Options();
        options2.putAll(this.f41915o);
        options2.set(option, Boolean.valueOf(z));
        return options2;
    }

    /* renamed from: k */
    public final int m50473k() {
        return this.f41910j.ordinal();
    }

    /* renamed from: l */
    public DecodeJob m50472l(GlideContext glideContext, Object obj, C0247DS c0247ds, Key key, int i, int i2, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map map, boolean z, boolean z2, boolean z3, Options options, InterfaceC5759b interfaceC5759b, int i3) {
        this.f41901a.m50364v(glideContext, obj, key, i, i2, diskCacheStrategy, cls, cls2, priority, options, map, z, z2, this.f41904d);
        this.f41908h = glideContext;
        this.f41909i = key;
        this.f41910j = priority;
        this.f41911k = c0247ds;
        this.f41912l = i;
        this.f41913m = i2;
        this.f41914n = diskCacheStrategy;
        this.f41921u = z3;
        this.f41915o = options;
        this.f41916p = interfaceC5759b;
        this.f41917q = i3;
        this.f41919s = RunReason.INITIALIZE;
        this.f41922v = obj;
        return this;
    }

    /* renamed from: m */
    public final void m50471m(String str, long j) {
        m50470n(str, j, null);
    }

    /* renamed from: n */
    public final void m50470n(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(LogTime.getElapsedMillis(j));
        sb.append(", load key: ");
        sb.append(this.f41911k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    /* renamed from: o */
    public final void m50469o(Resource resource, DataSource dataSource, boolean z) {
        m50483A();
        this.f41916p.onResourceReady(resource, dataSource, z);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource) {
        dataFetcher.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(key, dataSource, dataFetcher.getDataClass());
        this.f41902b.add(glideException);
        if (Thread.currentThread() != this.f41923w) {
            m50461w(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m50460x();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2) {
        this.f41924x = key;
        this.f41926z = obj;
        this.f41896B = dataFetcher;
        this.f41895A = dataSource;
        this.f41925y = key2;
        boolean z = false;
        if (key != this.f41901a.m50383c().get(0)) {
            z = true;
        }
        this.f41900F = z;
        if (Thread.currentThread() != this.f41923w) {
            m50461w(RunReason.DECODE_DATA);
            return;
        }
        GlideTrace.beginSection("DecodeJob.decodeFromRetrievedData");
        try {
            m50477f();
        } finally {
            GlideTrace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final void m50468p(Resource resource, DataSource dataSource, boolean z) {
        C18289Pk0 c18289Pk0;
        GlideTrace.beginSection("DecodeJob.notifyEncodeAndRelease");
        try {
            if (resource instanceof Initializable) {
                ((Initializable) resource).initialize();
            }
            if (this.f41906f.m50455c()) {
                resource = C18289Pk0.m66929b(resource);
                c18289Pk0 = resource;
            } else {
                c18289Pk0 = 0;
            }
            m50469o(resource, dataSource, z);
            this.f41918r = Stage.ENCODE;
            if (this.f41906f.m50455c()) {
                this.f41906f.m50456b(this.f41904d, this.f41915o);
            }
            if (c18289Pk0 != 0) {
                c18289Pk0.m66927d();
            }
            m50466r();
            GlideTrace.endSection();
        } catch (Throwable th2) {
            GlideTrace.endSection();
            throw th2;
        }
    }

    /* renamed from: q */
    public final void m50467q() {
        m50483A();
        this.f41916p.onLoadFailed(new GlideException("Failed to load resource", new ArrayList(this.f41902b)));
        m50465s();
    }

    /* renamed from: r */
    public final void m50466r() {
        if (this.f41907g.m50452b()) {
            m50462v();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
        m50461w(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Runnable
    public void run() {
        GlideTrace.beginSectionFormat("DecodeJob#run(reason=%s, model=%s)", this.f41919s, this.f41922v);
        DataFetcher dataFetcher = this.f41896B;
        try {
            try {
                if (this.f41899E) {
                    m50467q();
                    if (dataFetcher != null) {
                        dataFetcher.cleanup();
                    }
                    GlideTrace.endSection();
                    return;
                }
                m50458z();
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
                GlideTrace.endSection();
            } catch (CallbackException e) {
                throw e;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DecodeJob threw unexpectedly, isCancelled: ");
                    sb.append(this.f41899E);
                    sb.append(", stage: ");
                    sb.append(this.f41918r);
                }
                if (this.f41918r != Stage.ENCODE) {
                    this.f41902b.add(th2);
                    m50467q();
                }
                if (!this.f41899E) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
            GlideTrace.endSection();
            throw th3;
        }
    }

    /* renamed from: s */
    public final void m50465s() {
        if (this.f41907g.m50451c()) {
            m50462v();
        }
    }

    /* renamed from: t */
    public Resource m50464t(DataSource dataSource, Resource resource) {
        Resource resource2;
        Transformation transformation;
        EncodeStrategy encodeStrategy;
        Key c0436gd;
        Class<?> cls = resource.get().getClass();
        ResourceEncoder resourceEncoder = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            Transformation m50367s = this.f41901a.m50367s(cls);
            transformation = m50367s;
            resource2 = m50367s.transform(this.f41908h, resource, this.f41912l, this.f41913m);
        } else {
            resource2 = resource;
            transformation = null;
        }
        if (!resource.equals(resource2)) {
            resource.recycle();
        }
        if (this.f41901a.m50363w(resource2)) {
            resourceEncoder = this.f41901a.m50372n(resource2);
            encodeStrategy = resourceEncoder.getEncodeStrategy(this.f41915o);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        ResourceEncoder resourceEncoder2 = resourceEncoder;
        if (this.f41914n.isResourceCacheable(!this.f41901a.m50361y(this.f41924x), dataSource, encodeStrategy)) {
            if (resourceEncoder2 != null) {
                int i = C5758a.f41929c[encodeStrategy.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c0436gd = new C23124xy1(this.f41901a.m50384b(), this.f41924x, this.f41909i, this.f41912l, this.f41913m, transformation, cls, this.f41915o);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                    }
                } else {
                    c0436gd = new C0436GD(this.f41924x, this.f41909i);
                }
                C18289Pk0 m66929b = C18289Pk0.m66929b(resource2);
                this.f41906f.m50454d(c0436gd, resourceEncoder2, m66929b);
                return m66929b;
            }
            throw new Registry.NoResultEncoderAvailableException(resource2.get().getClass());
        }
        return resource2;
    }

    /* renamed from: u */
    public void m50463u(boolean z) {
        if (this.f41907g.m50450d(z)) {
            m50462v();
        }
    }

    /* renamed from: v */
    public final void m50462v() {
        this.f41907g.m50449e();
        this.f41906f.m50457a();
        this.f41901a.m50385a();
        this.f41898D = false;
        this.f41908h = null;
        this.f41909i = null;
        this.f41915o = null;
        this.f41910j = null;
        this.f41911k = null;
        this.f41916p = null;
        this.f41918r = null;
        this.f41897C = null;
        this.f41923w = null;
        this.f41924x = null;
        this.f41926z = null;
        this.f41895A = null;
        this.f41896B = null;
        this.f41920t = 0L;
        this.f41899E = false;
        this.f41922v = null;
        this.f41902b.clear();
        this.f41905e.release(this);
    }

    /* renamed from: w */
    public final void m50461w(RunReason runReason) {
        this.f41919s = runReason;
        this.f41916p.mo50350a(this);
    }

    /* renamed from: x */
    public final void m50460x() {
        this.f41923w = Thread.currentThread();
        this.f41920t = LogTime.getLogTime();
        boolean z = false;
        while (!this.f41899E && this.f41897C != null && !(z = this.f41897C.mo50322a())) {
            this.f41918r = m50475i(this.f41918r);
            this.f41897C = m50476g();
            if (this.f41918r == Stage.SOURCE) {
                m50461w(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f41918r == Stage.FINISHED || this.f41899E) && !z) {
            m50467q();
        }
    }

    /* renamed from: y */
    public final Resource m50459y(Object obj, DataSource dataSource, LoadPath loadPath) {
        Options m50474j = m50474j(dataSource);
        DataRewinder rewinder = this.f41908h.getRegistry().getRewinder(obj);
        try {
            return loadPath.load(rewinder, m50474j, this.f41912l, this.f41913m, new C5760c(dataSource));
        } finally {
            rewinder.cleanup();
        }
    }

    /* renamed from: z */
    public final void m50458z() {
        int i = C5758a.f41927a[this.f41919s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m50477f();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.f41919s);
            }
            m50460x();
            return;
        }
        this.f41918r = m50475i(Stage.INITIALIZE);
        this.f41897C = m50476g();
        m50460x();
    }
}