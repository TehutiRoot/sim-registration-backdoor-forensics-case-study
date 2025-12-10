package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class TranscoderRegistry {

    /* renamed from: a */
    public final List f42480a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.transcode.TranscoderRegistry$a */
    /* loaded from: classes3.dex */
    public static final class C5885a {

        /* renamed from: a */
        public final Class f42481a;

        /* renamed from: b */
        public final Class f42482b;

        /* renamed from: c */
        public final ResourceTranscoder f42483c;

        public C5885a(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
            this.f42481a = cls;
            this.f42482b = cls2;
            this.f42483c = resourceTranscoder;
        }

        /* renamed from: a */
        public boolean m50107a(Class cls, Class cls2) {
            if (this.f42481a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f42482b)) {
                return true;
            }
            return false;
        }
    }

    @NonNull
    public synchronized <Z, R> ResourceTranscoder<Z, R> get(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.get();
        }
        for (C5885a c5885a : this.f42480a) {
            if (c5885a.m50107a(cls, cls2)) {
                return c5885a.f42483c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C5885a c5885a : this.f42480a) {
            if (c5885a.m50107a(cls, cls2) && !arrayList.contains(c5885a.f42482b)) {
                arrayList.add(c5885a.f42482b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void register(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
        this.f42480a.add(new C5885a(cls, cls2, resourceTranscoder));
    }
}