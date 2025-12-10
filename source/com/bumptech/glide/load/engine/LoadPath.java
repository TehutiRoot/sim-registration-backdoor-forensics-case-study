package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class LoadPath<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class f41959a;

    /* renamed from: b */
    public final Pools.Pool f41960b;

    /* renamed from: c */
    public final List f41961c;

    /* renamed from: d */
    public final String f41962d;

    public LoadPath(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<DecodePath<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f41959a = cls;
        this.f41960b = pool;
        this.f41961c = (List) Preconditions.checkNotEmpty(list);
        this.f41962d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final Resource m50435a(DataRewinder dataRewinder, Options options, int i, int i2, DecodePath.InterfaceC5775a interfaceC5775a, List list) {
        int size = this.f41961c.size();
        Resource<Transcode> resource = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                resource = ((DecodePath) this.f41961c.get(i3)).decode(dataRewinder, i, i2, options, interfaceC5775a);
            } catch (GlideException e) {
                list.add(e);
            }
            if (resource != null) {
                break;
            }
        }
        if (resource != null) {
            return resource;
        }
        throw new GlideException(this.f41962d, new ArrayList(list));
    }

    public Class<Data> getDataClass() {
        return this.f41959a;
    }

    public Resource<Transcode> load(DataRewinder<Data> dataRewinder, @NonNull Options options, int i, int i2, DecodePath.InterfaceC5775a interfaceC5775a) throws GlideException {
        List list = (List) Preconditions.checkNotNull(this.f41960b.acquire());
        try {
            return m50435a(dataRewinder, options, i, i2, interfaceC5775a, list);
        } finally {
            this.f41960b.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f41961c.toArray()) + '}';
    }
}
