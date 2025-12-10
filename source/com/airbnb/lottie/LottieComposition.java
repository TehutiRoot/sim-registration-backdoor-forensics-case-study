package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import ch.qos.logback.classic.net.SyslogAppender;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class LottieComposition {

    /* renamed from: c */
    public Map f40916c;

    /* renamed from: d */
    public Map f40917d;

    /* renamed from: e */
    public Map f40918e;

    /* renamed from: f */
    public List f40919f;

    /* renamed from: g */
    public SparseArrayCompat f40920g;

    /* renamed from: h */
    public LongSparseArray f40921h;

    /* renamed from: i */
    public List f40922i;

    /* renamed from: j */
    public Rect f40923j;

    /* renamed from: k */
    public float f40924k;

    /* renamed from: l */
    public float f40925l;

    /* renamed from: m */
    public float f40926m;

    /* renamed from: n */
    public boolean f40927n;

    /* renamed from: a */
    public final PerformanceTracker f40914a = new PerformanceTracker();

    /* renamed from: b */
    public final HashSet f40915b = new HashSet();

    /* renamed from: o */
    public int f40928o = 0;

    @Deprecated
    /* loaded from: classes3.dex */
    public static class Factory {

        /* renamed from: com.airbnb.lottie.LottieComposition$Factory$a */
        /* loaded from: classes3.dex */
        public static final class C5661a implements LottieListener, Cancellable {

            /* renamed from: a */
            public final OnCompositionLoadedListener f40929a;

            /* renamed from: b */
            public boolean f40930b;

            @Override // com.airbnb.lottie.LottieListener
            /* renamed from: a */
            public void onResult(LottieComposition lottieComposition) {
                if (this.f40930b) {
                    return;
                }
                this.f40929a.onCompositionLoaded(lottieComposition);
            }

            @Override // com.airbnb.lottie.Cancellable
            public void cancel() {
                this.f40930b = true;
            }

            public C5661a(OnCompositionLoadedListener onCompositionLoadedListener) {
                this.f40930b = false;
                this.f40929a = onCompositionLoadedListener;
            }
        }

        @Deprecated
        public static Cancellable fromAssetFileName(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            C5661a c5661a = new C5661a(onCompositionLoadedListener);
            LottieCompositionFactory.fromAsset(context, str).addListener(c5661a);
            return c5661a;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromFileSync(Context context, String str) {
            return LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        @Deprecated
        public static Cancellable fromInputStream(InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
            C5661a c5661a = new C5661a(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonInputStream(inputStream, null).addListener(c5661a);
            return c5661a;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @Deprecated
        public static Cancellable fromJsonReader(JsonReader jsonReader, OnCompositionLoadedListener onCompositionLoadedListener) {
            C5661a c5661a = new C5661a(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonReader(jsonReader, null).addListener(c5661a);
            return c5661a;
        }

        @Deprecated
        public static Cancellable fromJsonString(String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            C5661a c5661a = new C5661a(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonString(str, null).addListener(c5661a);
            return c5661a;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
            return LottieCompositionFactory.fromJsonSync(jSONObject, null).getValue();
        }

        @Deprecated
        public static Cancellable fromRawFile(Context context, @RawRes int i, OnCompositionLoadedListener onCompositionLoadedListener) {
            C5661a c5661a = new C5661a(onCompositionLoadedListener);
            LottieCompositionFactory.fromRawRes(context, i).addListener(c5661a);
            return c5661a;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z) {
            if (z) {
                Logger.warning("Lottie now auto-closes input stream!");
            }
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(String str) {
            return LottieCompositionFactory.fromJsonStringSync(str, null).getValue();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(JsonReader jsonReader) {
            return LottieCompositionFactory.fromJsonReaderSync(jsonReader, null).getValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void addWarning(String str) {
        Logger.warning(str);
        this.f40915b.add(str);
    }

    public Rect getBounds() {
        return this.f40923j;
    }

    public SparseArrayCompat<FontCharacter> getCharacters() {
        return this.f40920g;
    }

    public float getDuration() {
        return (getDurationFrames() / this.f40926m) * 1000.0f;
    }

    public float getDurationFrames() {
        return this.f40925l - this.f40924k;
    }

    public float getEndFrame() {
        return this.f40925l;
    }

    public Map<String, Font> getFonts() {
        return this.f40918e;
    }

    public float getFrameForProgress(float f) {
        return MiscUtils.lerp(this.f40924k, this.f40925l, f);
    }

    public float getFrameRate() {
        return this.f40926m;
    }

    public Map<String, LottieImageAsset> getImages() {
        return this.f40917d;
    }

    public List<Layer> getLayers() {
        return this.f40922i;
    }

    @Nullable
    public Marker getMarker(String str) {
        int size = this.f40919f.size();
        for (int i = 0; i < size; i++) {
            Marker marker = (Marker) this.f40919f.get(i);
            if (marker.matchesName(str)) {
                return marker;
            }
        }
        return null;
    }

    public List<Marker> getMarkers() {
        return this.f40919f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMaskAndMatteCount() {
        return this.f40928o;
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.f40914a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> getPrecomps(String str) {
        return (List) this.f40916c.get(str);
    }

    public float getProgressForFrame(float f) {
        float f2 = this.f40924k;
        return (f - f2) / (this.f40925l - f2);
    }

    public float getStartFrame() {
        return this.f40924k;
    }

    public ArrayList<String> getWarnings() {
        HashSet hashSet = this.f40915b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDashPattern() {
        return this.f40927n;
    }

    public boolean hasImages() {
        return !this.f40917d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void incrementMatteOrMaskCount(int i) {
        this.f40928o += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void init(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, SparseArrayCompat<FontCharacter> sparseArrayCompat, Map<String, Font> map3, List<Marker> list2) {
        this.f40923j = rect;
        this.f40924k = f;
        this.f40925l = f2;
        this.f40926m = f3;
        this.f40922i = list;
        this.f40921h = longSparseArray;
        this.f40916c = map;
        this.f40917d = map2;
        this.f40920g = sparseArrayCompat;
        this.f40918e = map3;
        this.f40919f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer layerModelForId(long j) {
        return (Layer) this.f40921h.get(j);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasDashPattern(boolean z) {
        this.f40927n = z;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f40914a.m50911a(z);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.f40922i) {
            sb.append(layer.toString(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
        }
        return sb.toString();
    }
}
