package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.c */
/* loaded from: classes3.dex */
public final class C5800c {

    /* renamed from: a */
    public final List f42016a = new ArrayList();

    /* renamed from: b */
    public final List f42017b = new ArrayList();

    /* renamed from: c */
    public GlideContext f42018c;

    /* renamed from: d */
    public Object f42019d;

    /* renamed from: e */
    public int f42020e;

    /* renamed from: f */
    public int f42021f;

    /* renamed from: g */
    public Class f42022g;

    /* renamed from: h */
    public DecodeJob.InterfaceC5773e f42023h;

    /* renamed from: i */
    public Options f42024i;

    /* renamed from: j */
    public Map f42025j;

    /* renamed from: k */
    public Class f42026k;

    /* renamed from: l */
    public boolean f42027l;

    /* renamed from: m */
    public boolean f42028m;

    /* renamed from: n */
    public Key f42029n;

    /* renamed from: o */
    public Priority f42030o;

    /* renamed from: p */
    public DiskCacheStrategy f42031p;

    /* renamed from: q */
    public boolean f42032q;

    /* renamed from: r */
    public boolean f42033r;

    /* renamed from: a */
    public void m50388a() {
        this.f42018c = null;
        this.f42019d = null;
        this.f42029n = null;
        this.f42022g = null;
        this.f42026k = null;
        this.f42024i = null;
        this.f42030o = null;
        this.f42025j = null;
        this.f42031p = null;
        this.f42016a.clear();
        this.f42027l = false;
        this.f42017b.clear();
        this.f42028m = false;
    }

    /* renamed from: b */
    public ArrayPool m50387b() {
        return this.f42018c.getArrayPool();
    }

    /* renamed from: c */
    public List m50386c() {
        if (!this.f42028m) {
            this.f42028m = true;
            this.f42017b.clear();
            List m50382g = m50382g();
            int size = m50382g.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData loadData = (ModelLoader.LoadData) m50382g.get(i);
                if (!this.f42017b.contains(loadData.sourceKey)) {
                    this.f42017b.add(loadData.sourceKey);
                }
                for (int i2 = 0; i2 < loadData.alternateKeys.size(); i2++) {
                    if (!this.f42017b.contains(loadData.alternateKeys.get(i2))) {
                        this.f42017b.add(loadData.alternateKeys.get(i2));
                    }
                }
            }
        }
        return this.f42017b;
    }

    /* renamed from: d */
    public DiskCache m50385d() {
        return this.f42023h.getDiskCache();
    }

    /* renamed from: e */
    public DiskCacheStrategy m50384e() {
        return this.f42031p;
    }

    /* renamed from: f */
    public int m50383f() {
        return this.f42021f;
    }

    /* renamed from: g */
    public List m50382g() {
        if (!this.f42027l) {
            this.f42027l = true;
            this.f42016a.clear();
            List modelLoaders = this.f42018c.getRegistry().getModelLoaders(this.f42019d);
            int size = modelLoaders.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData buildLoadData = ((ModelLoader) modelLoaders.get(i)).buildLoadData(this.f42019d, this.f42020e, this.f42021f, this.f42024i);
                if (buildLoadData != null) {
                    this.f42016a.add(buildLoadData);
                }
            }
        }
        return this.f42016a;
    }

    /* renamed from: h */
    public LoadPath m50381h(Class cls) {
        return this.f42018c.getRegistry().getLoadPath(cls, this.f42022g, this.f42026k);
    }

    /* renamed from: i */
    public Class m50380i() {
        return this.f42019d.getClass();
    }

    /* renamed from: j */
    public List m50379j(File file) {
        return this.f42018c.getRegistry().getModelLoaders(file);
    }

    /* renamed from: k */
    public Options m50378k() {
        return this.f42024i;
    }

    /* renamed from: l */
    public Priority m50377l() {
        return this.f42030o;
    }

    /* renamed from: m */
    public List m50376m() {
        return this.f42018c.getRegistry().getRegisteredResourceClasses(this.f42019d.getClass(), this.f42022g, this.f42026k);
    }

    /* renamed from: n */
    public ResourceEncoder m50375n(Resource resource) {
        return this.f42018c.getRegistry().getResultEncoder(resource);
    }

    /* renamed from: o */
    public DataRewinder m50374o(Object obj) {
        return this.f42018c.getRegistry().getRewinder(obj);
    }

    /* renamed from: p */
    public Key m50373p() {
        return this.f42029n;
    }

    /* renamed from: q */
    public Encoder m50372q(Object obj) {
        return this.f42018c.getRegistry().getSourceEncoder(obj);
    }

    /* renamed from: r */
    public Class m50371r() {
        return this.f42026k;
    }

    /* renamed from: s */
    public Transformation m50370s(Class cls) {
        Transformation transformation = (Transformation) this.f42025j.get(cls);
        if (transformation == null) {
            Iterator it = this.f42025j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation == null) {
            if (this.f42025j.isEmpty() && this.f42032q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return UnitTransformation.get();
        }
        return transformation;
    }

    /* renamed from: t */
    public int m50369t() {
        return this.f42020e;
    }

    /* renamed from: u */
    public boolean m50368u(Class cls) {
        if (m50381h(cls) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public void m50367v(GlideContext glideContext, Object obj, Key key, int i, int i2, DiskCacheStrategy diskCacheStrategy, Class cls, Class cls2, Priority priority, Options options, Map map, boolean z, boolean z2, DecodeJob.InterfaceC5773e interfaceC5773e) {
        this.f42018c = glideContext;
        this.f42019d = obj;
        this.f42029n = key;
        this.f42020e = i;
        this.f42021f = i2;
        this.f42031p = diskCacheStrategy;
        this.f42022g = cls;
        this.f42023h = interfaceC5773e;
        this.f42026k = cls2;
        this.f42030o = priority;
        this.f42024i = options;
        this.f42025j = map;
        this.f42032q = z;
        this.f42033r = z2;
    }

    /* renamed from: w */
    public boolean m50366w(Resource resource) {
        return this.f42018c.getRegistry().isResourceEncoderAvailable(resource);
    }

    /* renamed from: x */
    public boolean m50365x() {
        return this.f42033r;
    }

    /* renamed from: y */
    public boolean m50364y(Key key) {
        List m50382g = m50382g();
        int size = m50382g.size();
        for (int i = 0; i < size; i++) {
            if (((ModelLoader.LoadData) m50382g.get(i)).sourceKey.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
