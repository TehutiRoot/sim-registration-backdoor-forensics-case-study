package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DecodePath<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class f41926a;

    /* renamed from: b */
    public final List f41927b;

    /* renamed from: c */
    public final ResourceTranscoder f41928c;

    /* renamed from: d */
    public final Pools.Pool f41929d;

    /* renamed from: e */
    public final String f41930e;

    /* renamed from: com.bumptech.glide.load.engine.DecodePath$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC5775a {
        /* renamed from: a */
        Resource mo50449a(Resource resource);
    }

    public DecodePath(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> resourceTranscoder, Pools.Pool<List<Throwable>> pool) {
        this.f41926a = cls;
        this.f41927b = list;
        this.f41928c = resourceTranscoder;
        this.f41929d = pool;
        this.f41930e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final Resource m50451a(DataRewinder dataRewinder, int i, int i2, Options options) {
        List list = (List) Preconditions.checkNotNull(this.f41929d.acquire());
        try {
            return m50450b(dataRewinder, i, i2, options, list);
        } finally {
            this.f41929d.release(list);
        }
    }

    /* renamed from: b */
    public final Resource m50450b(DataRewinder dataRewinder, int i, int i2, Options options, List list) {
        int size = this.f41927b.size();
        Resource resource = null;
        for (int i3 = 0; i3 < size; i3++) {
            ResourceDecoder resourceDecoder = (ResourceDecoder) this.f41927b.get(i3);
            try {
                if (resourceDecoder.handles(dataRewinder.rewindAndGet(), options)) {
                    resource = resourceDecoder.decode(dataRewinder.rewindAndGet(), i, i2, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(resourceDecoder);
                }
                list.add(e);
            }
            if (resource != null) {
                break;
            }
        }
        if (resource != null) {
            return resource;
        }
        throw new GlideException(this.f41930e, new ArrayList(list));
    }

    public Resource<Transcode> decode(DataRewinder<DataType> dataRewinder, int i, int i2, @NonNull Options options, InterfaceC5775a interfaceC5775a) throws GlideException {
        return this.f41928c.transcode(interfaceC5775a.mo50449a(m50451a(dataRewinder, i, i2, options)), options);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f41926a + ", decoders=" + this.f41927b + ", transcoder=" + this.f41928c + '}';
    }
}
