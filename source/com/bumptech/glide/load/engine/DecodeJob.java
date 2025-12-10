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
    public DataSource f41883A;

    /* renamed from: B */
    public DataFetcher f41884B;

    /* renamed from: C */
    public volatile DataFetcherGenerator f41885C;

    /* renamed from: D */
    public volatile boolean f41886D;

    /* renamed from: E */
    public volatile boolean f41887E;

    /* renamed from: F */
    public boolean f41888F;

    /* renamed from: d */
    public final InterfaceC5773e f41892d;

    /* renamed from: e */
    public final Pools.Pool f41893e;

    /* renamed from: h */
    public GlideContext f41896h;

    /* renamed from: i */
    public Key f41897i;

    /* renamed from: j */
    public Priority f41898j;

    /* renamed from: k */
    public C17195zS f41899k;

    /* renamed from: l */
    public int f41900l;

    /* renamed from: m */
    public int f41901m;

    /* renamed from: n */
    public DiskCacheStrategy f41902n;

    /* renamed from: o */
    public Options f41903o;

    /* renamed from: p */
    public InterfaceC5770b f41904p;

    /* renamed from: q */
    public int f41905q;

    /* renamed from: r */
    public Stage f41906r;

    /* renamed from: s */
    public RunReason f41907s;

    /* renamed from: t */
    public long f41908t;

    /* renamed from: u */
    public boolean f41909u;

    /* renamed from: v */
    public Object f41910v;

    /* renamed from: w */
    public Thread f41911w;

    /* renamed from: x */
    public Key f41912x;

    /* renamed from: y */
    public Key f41913y;

    /* renamed from: z */
    public Object f41914z;

    /* renamed from: a */
    public final C5800c f41889a = new C5800c();

    /* renamed from: b */
    public final List f41890b = new ArrayList();

    /* renamed from: c */
    public final StateVerifier f41891c = StateVerifier.newInstance();

    /* renamed from: f */
    public final C5772d f41894f = new C5772d();

    /* renamed from: g */
    public final C5774f f41895g = new C5774f();

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
    public static /* synthetic */ class C5769a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41915a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41916b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f41917c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f41917c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41917c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f41916b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41916b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41916b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41916b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41916b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f41915a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41915a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41915a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5770b {
        /* renamed from: a */
        void mo50353a(DecodeJob decodeJob);

        void onLoadFailed(GlideException glideException);

        void onResourceReady(Resource resource, DataSource dataSource, boolean z);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    /* loaded from: classes3.dex */
    public final class C5771c implements DecodePath.InterfaceC5775a {

        /* renamed from: a */
        public final DataSource f41918a;

        public C5771c(DataSource dataSource) {
            this.f41918a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.DecodePath.InterfaceC5775a
        /* renamed from: a */
        public Resource mo50449a(Resource resource) {
            return DecodeJob.this.m50467t(this.f41918a, resource);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    /* loaded from: classes3.dex */
    public static class C5772d {

        /* renamed from: a */
        public Key f41920a;

        /* renamed from: b */
        public ResourceEncoder f41921b;

        /* renamed from: c */
        public C17867Jk0 f41922c;

        /* renamed from: a */
        public void m50460a() {
            this.f41920a = null;
            this.f41921b = null;
            this.f41922c = null;
        }

        /* renamed from: b */
        public void m50459b(InterfaceC5773e interfaceC5773e, Options options) {
            GlideTrace.beginSection("DecodeJob.encode");
            try {
                interfaceC5773e.getDiskCache().put(this.f41920a, new C0439GD(this.f41921b, this.f41922c, options));
            } finally {
                this.f41922c.m67687d();
                GlideTrace.endSection();
            }
        }

        /* renamed from: c */
        public boolean m50458c() {
            if (this.f41922c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public void m50457d(Key key, ResourceEncoder resourceEncoder, C17867Jk0 c17867Jk0) {
            this.f41920a = key;
            this.f41921b = resourceEncoder;
            this.f41922c = c17867Jk0;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC5773e {
        DiskCache getDiskCache();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    /* loaded from: classes3.dex */
    public static class C5774f {

        /* renamed from: a */
        public boolean f41923a;

        /* renamed from: b */
        public boolean f41924b;

        /* renamed from: c */
        public boolean f41925c;

        /* renamed from: a */
        public final boolean m50456a(boolean z) {
            if ((this.f41925c || z || this.f41924b) && this.f41923a) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public synchronized boolean m50455b() {
            this.f41924b = true;
            return m50456a(false);
        }

        /* renamed from: c */
        public synchronized boolean m50454c() {
            this.f41925c = true;
            return m50456a(false);
        }

        /* renamed from: d */
        public synchronized boolean m50453d(boolean z) {
            this.f41923a = true;
            return m50456a(z);
        }

        /* renamed from: e */
        public synchronized void m50452e() {
            this.f41924b = false;
            this.f41923a = false;
            this.f41925c = false;
        }
    }

    public DecodeJob(InterfaceC5773e interfaceC5773e, Pools.Pool pool) {
        this.f41892d = interfaceC5773e;
        this.f41893e = pool;
    }

    /* renamed from: A */
    public final void m50486A() {
        Throwable th2;
        this.f41891c.throwIfRecycled();
        if (this.f41886D) {
            if (this.f41890b.isEmpty()) {
                th2 = null;
            } else {
                List list = this.f41890b;
                th2 = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.f41886D = true;
    }

    /* renamed from: B */
    public boolean m50485B() {
        Stage m50478i = m50478i(Stage.INITIALIZE);
        if (m50478i != Stage.RESOURCE_CACHE && m50478i != Stage.DATA_CACHE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m50484a() {
        this.f41887E = true;
        DataFetcherGenerator dataFetcherGenerator = this.f41885C;
        if (dataFetcherGenerator != null) {
            dataFetcherGenerator.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(DecodeJob decodeJob) {
        int m50476k = m50476k() - decodeJob.m50476k();
        if (m50476k == 0) {
            return this.f41905q - decodeJob.f41905q;
        }
        return m50476k;
    }

    /* renamed from: c */
    public final Resource m50482c(DataFetcher dataFetcher, Object obj, DataSource dataSource) {
        if (obj == null) {
            dataFetcher.cleanup();
            return null;
        }
        try {
            long logTime = LogTime.getLogTime();
            Resource m50481d = m50481d(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m50474m("Decoded result " + m50481d, logTime);
            }
            return m50481d;
        } finally {
            dataFetcher.cleanup();
        }
    }

    /* renamed from: d */
    public final Resource m50481d(Object obj, DataSource dataSource) {
        return m50462y(obj, dataSource, this.f41889a.m50381h(obj.getClass()));
    }

    /* renamed from: f */
    public final void m50480f() {
        Resource resource;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f41908t;
            m50473n("Retrieved data", j, "data: " + this.f41914z + ", cache key: " + this.f41912x + ", fetcher: " + this.f41884B);
        }
        try {
            resource = m50482c(this.f41884B, this.f41914z, this.f41883A);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f41913y, this.f41883A);
            this.f41890b.add(e);
            resource = null;
        }
        if (resource != null) {
            m50471p(resource, this.f41883A, this.f41888F);
        } else {
            m50463x();
        }
    }

    /* renamed from: g */
    public final DataFetcherGenerator m50479g() {
        int i = C5769a.f41916b[this.f41906r.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f41906r);
                }
                return new C5827g(this.f41889a, this);
            }
            return new C5792b(this.f41889a, this);
        }
        return new C5826f(this.f41889a, this);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public StateVerifier getVerifier() {
        return this.f41891c;
    }

    /* renamed from: i */
    public final Stage m50478i(Stage stage) {
        int i = C5769a.f41916b[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        if (this.f41902n.decodeCachedResource()) {
                            return Stage.RESOURCE_CACHE;
                        }
                        return m50478i(Stage.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + stage);
                }
                return Stage.FINISHED;
            } else if (this.f41909u) {
                return Stage.FINISHED;
            } else {
                return Stage.SOURCE;
            }
        } else if (this.f41902n.decodeCachedData()) {
            return Stage.DATA_CACHE;
        } else {
            return m50478i(Stage.DATA_CACHE);
        }
    }

    /* renamed from: j */
    public final Options m50477j(DataSource dataSource) {
        boolean z;
        Options options = this.f41903o;
        if (Build.VERSION.SDK_INT < 26) {
            return options;
        }
        if (dataSource != DataSource.RESOURCE_DISK_CACHE && !this.f41889a.m50365x()) {
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
        options2.putAll(this.f41903o);
        options2.set(option, Boolean.valueOf(z));
        return options2;
    }

    /* renamed from: k */
    public final int m50476k() {
        return this.f41898j.ordinal();
    }

    /* renamed from: l */
    public DecodeJob m50475l(GlideContext glideContext, Object obj, C17195zS c17195zS, Key key, int i, int i2, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map map, boolean z, boolean z2, boolean z3, Options options, InterfaceC5770b interfaceC5770b, int i3) {
        this.f41889a.m50367v(glideContext, obj, key, i, i2, diskCacheStrategy, cls, cls2, priority, options, map, z, z2, this.f41892d);
        this.f41896h = glideContext;
        this.f41897i = key;
        this.f41898j = priority;
        this.f41899k = c17195zS;
        this.f41900l = i;
        this.f41901m = i2;
        this.f41902n = diskCacheStrategy;
        this.f41909u = z3;
        this.f41903o = options;
        this.f41904p = interfaceC5770b;
        this.f41905q = i3;
        this.f41907s = RunReason.INITIALIZE;
        this.f41910v = obj;
        return this;
    }

    /* renamed from: m */
    public final void m50474m(String str, long j) {
        m50473n(str, j, null);
    }

    /* renamed from: n */
    public final void m50473n(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(LogTime.getElapsedMillis(j));
        sb.append(", load key: ");
        sb.append(this.f41899k);
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
    public final void m50472o(Resource resource, DataSource dataSource, boolean z) {
        m50486A();
        this.f41904p.onResourceReady(resource, dataSource, z);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource) {
        dataFetcher.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(key, dataSource, dataFetcher.getDataClass());
        this.f41890b.add(glideException);
        if (Thread.currentThread() != this.f41911w) {
            m50464w(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m50463x();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2) {
        this.f41912x = key;
        this.f41914z = obj;
        this.f41884B = dataFetcher;
        this.f41883A = dataSource;
        this.f41913y = key2;
        boolean z = false;
        if (key != this.f41889a.m50386c().get(0)) {
            z = true;
        }
        this.f41888F = z;
        if (Thread.currentThread() != this.f41911w) {
            m50464w(RunReason.DECODE_DATA);
            return;
        }
        GlideTrace.beginSection("DecodeJob.decodeFromRetrievedData");
        try {
            m50480f();
        } finally {
            GlideTrace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final void m50471p(Resource resource, DataSource dataSource, boolean z) {
        C17867Jk0 c17867Jk0;
        GlideTrace.beginSection("DecodeJob.notifyEncodeAndRelease");
        try {
            if (resource instanceof Initializable) {
                ((Initializable) resource).initialize();
            }
            if (this.f41894f.m50458c()) {
                resource = C17867Jk0.m67689b(resource);
                c17867Jk0 = resource;
            } else {
                c17867Jk0 = 0;
            }
            m50472o(resource, dataSource, z);
            this.f41906r = Stage.ENCODE;
            if (this.f41894f.m50458c()) {
                this.f41894f.m50459b(this.f41892d, this.f41903o);
            }
            if (c17867Jk0 != 0) {
                c17867Jk0.m67687d();
            }
            m50469r();
            GlideTrace.endSection();
        } catch (Throwable th2) {
            GlideTrace.endSection();
            throw th2;
        }
    }

    /* renamed from: q */
    public final void m50470q() {
        m50486A();
        this.f41904p.onLoadFailed(new GlideException("Failed to load resource", new ArrayList(this.f41890b)));
        m50468s();
    }

    /* renamed from: r */
    public final void m50469r() {
        if (this.f41895g.m50455b()) {
            m50465v();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
        m50464w(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Runnable
    public void run() {
        GlideTrace.beginSectionFormat("DecodeJob#run(reason=%s, model=%s)", this.f41907s, this.f41910v);
        DataFetcher dataFetcher = this.f41884B;
        try {
            try {
                if (this.f41887E) {
                    m50470q();
                    if (dataFetcher != null) {
                        dataFetcher.cleanup();
                    }
                    GlideTrace.endSection();
                    return;
                }
                m50461z();
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
                    sb.append(this.f41887E);
                    sb.append(", stage: ");
                    sb.append(this.f41906r);
                }
                if (this.f41906r != Stage.ENCODE) {
                    this.f41890b.add(th2);
                    m50470q();
                }
                if (!this.f41887E) {
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
    public final void m50468s() {
        if (this.f41895g.m50454c()) {
            m50465v();
        }
    }

    /* renamed from: t */
    public Resource m50467t(DataSource dataSource, Resource resource) {
        Resource resource2;
        Transformation transformation;
        EncodeStrategy encodeStrategy;
        Key c0373fd;
        Class<?> cls = resource.get().getClass();
        ResourceEncoder resourceEncoder = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            Transformation m50370s = this.f41889a.m50370s(cls);
            transformation = m50370s;
            resource2 = m50370s.transform(this.f41896h, resource, this.f41900l, this.f41901m);
        } else {
            resource2 = resource;
            transformation = null;
        }
        if (!resource.equals(resource2)) {
            resource.recycle();
        }
        if (this.f41889a.m50366w(resource2)) {
            resourceEncoder = this.f41889a.m50375n(resource2);
            encodeStrategy = resourceEncoder.getEncodeStrategy(this.f41903o);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        ResourceEncoder resourceEncoder2 = resourceEncoder;
        if (this.f41902n.isResourceCacheable(!this.f41889a.m50364y(this.f41912x), dataSource, encodeStrategy)) {
            if (resourceEncoder2 != null) {
                int i = C5769a.f41917c[encodeStrategy.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c0373fd = new C17320Ax1(this.f41889a.m50387b(), this.f41912x, this.f41897i, this.f41900l, this.f41901m, transformation, cls, this.f41903o);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                    }
                } else {
                    c0373fd = new C0373FD(this.f41912x, this.f41897i);
                }
                C17867Jk0 m67689b = C17867Jk0.m67689b(resource2);
                this.f41894f.m50457d(c0373fd, resourceEncoder2, m67689b);
                return m67689b;
            }
            throw new Registry.NoResultEncoderAvailableException(resource2.get().getClass());
        }
        return resource2;
    }

    /* renamed from: u */
    public void m50466u(boolean z) {
        if (this.f41895g.m50453d(z)) {
            m50465v();
        }
    }

    /* renamed from: v */
    public final void m50465v() {
        this.f41895g.m50452e();
        this.f41894f.m50460a();
        this.f41889a.m50388a();
        this.f41886D = false;
        this.f41896h = null;
        this.f41897i = null;
        this.f41903o = null;
        this.f41898j = null;
        this.f41899k = null;
        this.f41904p = null;
        this.f41906r = null;
        this.f41885C = null;
        this.f41911w = null;
        this.f41912x = null;
        this.f41914z = null;
        this.f41883A = null;
        this.f41884B = null;
        this.f41908t = 0L;
        this.f41887E = false;
        this.f41910v = null;
        this.f41890b.clear();
        this.f41893e.release(this);
    }

    /* renamed from: w */
    public final void m50464w(RunReason runReason) {
        this.f41907s = runReason;
        this.f41904p.mo50353a(this);
    }

    /* renamed from: x */
    public final void m50463x() {
        this.f41911w = Thread.currentThread();
        this.f41908t = LogTime.getLogTime();
        boolean z = false;
        while (!this.f41887E && this.f41885C != null && !(z = this.f41885C.mo50325a())) {
            this.f41906r = m50478i(this.f41906r);
            this.f41885C = m50479g();
            if (this.f41906r == Stage.SOURCE) {
                m50464w(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f41906r == Stage.FINISHED || this.f41887E) && !z) {
            m50470q();
        }
    }

    /* renamed from: y */
    public final Resource m50462y(Object obj, DataSource dataSource, LoadPath loadPath) {
        Options m50477j = m50477j(dataSource);
        DataRewinder rewinder = this.f41896h.getRegistry().getRewinder(obj);
        try {
            return loadPath.load(rewinder, m50477j, this.f41900l, this.f41901m, new C5771c(dataSource));
        } finally {
            rewinder.cleanup();
        }
    }

    /* renamed from: z */
    public final void m50461z() {
        int i = C5769a.f41915a[this.f41907s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m50480f();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.f41907s);
            }
            m50463x();
            return;
        }
        this.f41906r = m50478i(Stage.INITIALIZE);
        this.f41885C = m50479g();
        m50463x();
    }
}
