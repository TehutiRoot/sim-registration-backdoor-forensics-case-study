package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public final class Palette {

    /* renamed from: f */
    public static final Filter f36511f = new C4817a();

    /* renamed from: a */
    public final List f36512a;

    /* renamed from: b */
    public final List f36513b;

    /* renamed from: d */
    public final SparseBooleanArray f36515d = new SparseBooleanArray();

    /* renamed from: c */
    public final Map f36514c = new ArrayMap();

    /* renamed from: e */
    public final Swatch f36516e = m53767a();

    /* loaded from: classes2.dex */
    public interface Filter {
        boolean isAllowed(@ColorInt int i, @NonNull float[] fArr);
    }

    /* loaded from: classes2.dex */
    public interface PaletteAsyncListener {
        void onGenerated(@Nullable Palette palette);
    }

    /* loaded from: classes2.dex */
    public static final class Swatch {

        /* renamed from: a */
        public final int f36527a;

        /* renamed from: b */
        public final int f36528b;

        /* renamed from: c */
        public final int f36529c;

        /* renamed from: d */
        public final int f36530d;

        /* renamed from: e */
        public final int f36531e;

        /* renamed from: f */
        public boolean f36532f;

        /* renamed from: g */
        public int f36533g;

        /* renamed from: h */
        public int f36534h;

        /* renamed from: i */
        public float[] f36535i;

        public Swatch(@ColorInt int i, int i2) {
            this.f36527a = Color.red(i);
            this.f36528b = Color.green(i);
            this.f36529c = Color.blue(i);
            this.f36530d = i;
            this.f36531e = i2;
        }

        /* renamed from: a */
        public final void m53757a() {
            int alphaComponent;
            int alphaComponent2;
            if (!this.f36532f) {
                int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.f36530d, 4.5f);
                int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.f36530d, 3.0f);
                if (calculateMinimumAlpha != -1 && calculateMinimumAlpha2 != -1) {
                    this.f36534h = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                    this.f36533g = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                    this.f36532f = true;
                    return;
                }
                int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(-16777216, this.f36530d, 4.5f);
                int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(-16777216, this.f36530d, 3.0f);
                if (calculateMinimumAlpha3 != -1 && calculateMinimumAlpha4 != -1) {
                    this.f36534h = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                    this.f36533g = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                    this.f36532f = true;
                    return;
                }
                if (calculateMinimumAlpha != -1) {
                    alphaComponent = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                } else {
                    alphaComponent = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                }
                this.f36534h = alphaComponent;
                if (calculateMinimumAlpha2 != -1) {
                    alphaComponent2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                } else {
                    alphaComponent2 = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                }
                this.f36533g = alphaComponent2;
                this.f36532f = true;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Swatch.class != obj.getClass()) {
                return false;
            }
            Swatch swatch = (Swatch) obj;
            if (this.f36531e == swatch.f36531e && this.f36530d == swatch.f36530d) {
                return true;
            }
            return false;
        }

        @ColorInt
        public int getBodyTextColor() {
            m53757a();
            return this.f36534h;
        }

        @NonNull
        public float[] getHsl() {
            if (this.f36535i == null) {
                this.f36535i = new float[3];
            }
            ColorUtils.RGBToHSL(this.f36527a, this.f36528b, this.f36529c, this.f36535i);
            return this.f36535i;
        }

        public int getPopulation() {
            return this.f36531e;
        }

        @ColorInt
        public int getRgb() {
            return this.f36530d;
        }

        @ColorInt
        public int getTitleTextColor() {
            m53757a();
            return this.f36533g;
        }

        public int hashCode() {
            return (this.f36530d * 31) + this.f36531e;
        }

        public String toString() {
            return Swatch.class.getSimpleName() + " [RGB: #" + Integer.toHexString(getRgb()) + AbstractJsonLexerKt.END_LIST + " [HSL: " + Arrays.toString(getHsl()) + AbstractJsonLexerKt.END_LIST + " [Population: " + this.f36531e + AbstractJsonLexerKt.END_LIST + " [Title Text: #" + Integer.toHexString(getTitleTextColor()) + AbstractJsonLexerKt.END_LIST + " [Body Text: #" + Integer.toHexString(getBodyTextColor()) + AbstractJsonLexerKt.END_LIST;
        }
    }

    /* renamed from: androidx.palette.graphics.Palette$a */
    /* loaded from: classes2.dex */
    public static class C4817a implements Filter {
        /* renamed from: a */
        public final boolean m53756a(float[] fArr) {
            if (fArr[2] <= 0.05f) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m53755b(float[] fArr) {
            float f = fArr[0];
            if (f < 10.0f || f > 37.0f || fArr[1] > 0.82f) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m53754c(float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return true;
            }
            return false;
        }

        @Override // androidx.palette.graphics.Palette.Filter
        public boolean isAllowed(int i, float[] fArr) {
            if (!m53754c(fArr) && !m53756a(fArr) && !m53755b(fArr)) {
                return true;
            }
            return false;
        }
    }

    public Palette(List list, List list2) {
        this.f36512a = list;
        this.f36513b = list2;
    }

    @NonNull
    public static Builder from(@NonNull Bitmap bitmap) {
        return new Builder(bitmap);
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap) {
        return from(bitmap).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).generate(paletteAsyncListener);
    }

    /* renamed from: a */
    public final Swatch m53767a() {
        int size = this.f36512a.size();
        int i = Integer.MIN_VALUE;
        Swatch swatch = null;
        for (int i2 = 0; i2 < size; i2++) {
            Swatch swatch2 = (Swatch) this.f36512a.get(i2);
            if (swatch2.getPopulation() > i) {
                i = swatch2.getPopulation();
                swatch = swatch2;
            }
        }
        return swatch;
    }

    /* renamed from: b */
    public void m53766b() {
        int size = this.f36513b.size();
        for (int i = 0; i < size; i++) {
            Target target = (Target) this.f36513b.get(i);
            target.m53753a();
            this.f36514c.put(target, m53764d(target));
        }
        this.f36515d.clear();
    }

    /* renamed from: c */
    public final float m53765c(Swatch swatch, Target target) {
        int i;
        float f;
        float f2;
        float[] hsl = swatch.getHsl();
        Swatch swatch2 = this.f36516e;
        if (swatch2 != null) {
            i = swatch2.getPopulation();
        } else {
            i = 1;
        }
        float f3 = 0.0f;
        if (target.getSaturationWeight() > 0.0f) {
            f = target.getSaturationWeight() * (1.0f - Math.abs(hsl[1] - target.getTargetSaturation()));
        } else {
            f = 0.0f;
        }
        if (target.getLightnessWeight() > 0.0f) {
            f2 = target.getLightnessWeight() * (1.0f - Math.abs(hsl[2] - target.getTargetLightness()));
        } else {
            f2 = 0.0f;
        }
        if (target.getPopulationWeight() > 0.0f) {
            f3 = target.getPopulationWeight() * (swatch.getPopulation() / i);
        }
        return f + f2 + f3;
    }

    /* renamed from: d */
    public final Swatch m53764d(Target target) {
        Swatch m53763e = m53763e(target);
        if (m53763e != null && target.isExclusive()) {
            this.f36515d.append(m53763e.getRgb(), true);
        }
        return m53763e;
    }

    /* renamed from: e */
    public final Swatch m53763e(Target target) {
        int size = this.f36512a.size();
        float f = 0.0f;
        Swatch swatch = null;
        for (int i = 0; i < size; i++) {
            Swatch swatch2 = (Swatch) this.f36512a.get(i);
            if (m53762f(swatch2, target)) {
                float m53765c = m53765c(swatch2, target);
                if (swatch == null || m53765c > f) {
                    swatch = swatch2;
                    f = m53765c;
                }
            }
        }
        return swatch;
    }

    /* renamed from: f */
    public final boolean m53762f(Swatch swatch, Target target) {
        float[] hsl = swatch.getHsl();
        if (hsl[1] >= target.getMinimumSaturation() && hsl[1] <= target.getMaximumSaturation() && hsl[2] >= target.getMinimumLightness() && hsl[2] <= target.getMaximumLightness() && !this.f36515d.get(swatch.getRgb())) {
            return true;
        }
        return false;
    }

    @ColorInt
    public int getColorForTarget(@NonNull Target target, @ColorInt int i) {
        Swatch swatchForTarget = getSwatchForTarget(target);
        if (swatchForTarget != null) {
            return swatchForTarget.getRgb();
        }
        return i;
    }

    @ColorInt
    public int getDarkMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_MUTED, i);
    }

    @Nullable
    public Swatch getDarkMutedSwatch() {
        return getSwatchForTarget(Target.DARK_MUTED);
    }

    @ColorInt
    public int getDarkVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_VIBRANT, i);
    }

    @Nullable
    public Swatch getDarkVibrantSwatch() {
        return getSwatchForTarget(Target.DARK_VIBRANT);
    }

    @ColorInt
    public int getDominantColor(@ColorInt int i) {
        Swatch swatch = this.f36516e;
        if (swatch != null) {
            return swatch.getRgb();
        }
        return i;
    }

    @Nullable
    public Swatch getDominantSwatch() {
        return this.f36516e;
    }

    @ColorInt
    public int getLightMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_MUTED, i);
    }

    @Nullable
    public Swatch getLightMutedSwatch() {
        return getSwatchForTarget(Target.LIGHT_MUTED);
    }

    @ColorInt
    public int getLightVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_VIBRANT, i);
    }

    @Nullable
    public Swatch getLightVibrantSwatch() {
        return getSwatchForTarget(Target.LIGHT_VIBRANT);
    }

    @ColorInt
    public int getMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.MUTED, i);
    }

    @Nullable
    public Swatch getMutedSwatch() {
        return getSwatchForTarget(Target.MUTED);
    }

    @Nullable
    public Swatch getSwatchForTarget(@NonNull Target target) {
        return (Swatch) this.f36514c.get(target);
    }

    @NonNull
    public List<Swatch> getSwatches() {
        return Collections.unmodifiableList(this.f36512a);
    }

    @NonNull
    public List<Target> getTargets() {
        return Collections.unmodifiableList(this.f36513b);
    }

    @ColorInt
    public int getVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.VIBRANT, i);
    }

    @Nullable
    public Swatch getVibrantSwatch() {
        return getSwatchForTarget(Target.VIBRANT);
    }

    @NonNull
    public static Palette from(@NonNull List<Swatch> list) {
        return new Builder(list).generate();
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap, int i) {
        return from(bitmap).maximumColorCount(i).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, int i, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).maximumColorCount(i).generate(paletteAsyncListener);
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f36517a;

        /* renamed from: b */
        public final Bitmap f36518b;

        /* renamed from: c */
        public final List f36519c;

        /* renamed from: d */
        public int f36520d;

        /* renamed from: e */
        public int f36521e;

        /* renamed from: f */
        public int f36522f;

        /* renamed from: g */
        public final List f36523g;

        /* renamed from: h */
        public Rect f36524h;

        /* renamed from: androidx.palette.graphics.Palette$Builder$a */
        /* loaded from: classes2.dex */
        public class AsyncTaskC4816a extends AsyncTask {

            /* renamed from: a */
            public final /* synthetic */ PaletteAsyncListener f36525a;

            public AsyncTaskC4816a(PaletteAsyncListener paletteAsyncListener) {
                this.f36525a = paletteAsyncListener;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Palette doInBackground(Bitmap... bitmapArr) {
                try {
                    return Builder.this.generate();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: b */
            public void onPostExecute(Palette palette) {
                this.f36525a.onGenerated(palette);
            }
        }

        public Builder(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f36519c = arrayList;
            this.f36520d = 16;
            this.f36521e = 12544;
            this.f36522f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f36523g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(Palette.f36511f);
                this.f36518b = bitmap;
                this.f36517a = null;
                arrayList.add(Target.LIGHT_VIBRANT);
                arrayList.add(Target.VIBRANT);
                arrayList.add(Target.DARK_VIBRANT);
                arrayList.add(Target.LIGHT_MUTED);
                arrayList.add(Target.MUTED);
                arrayList.add(Target.DARK_MUTED);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        /* renamed from: a */
        public final int[] m53761a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f36524h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f36524h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f36524h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        @NonNull
        public Builder addFilter(Filter filter) {
            if (filter != null) {
                this.f36523g.add(filter);
            }
            return this;
        }

        @NonNull
        public Builder addTarget(@NonNull Target target) {
            if (!this.f36519c.contains(target)) {
                this.f36519c.add(target);
            }
            return this;
        }

        /* renamed from: b */
        public final Bitmap m53760b(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f36521e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f36521e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f36522f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f36522f)) {
                d = i / max;
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }

        @NonNull
        public Builder clearFilters() {
            this.f36523g.clear();
            return this;
        }

        @NonNull
        public Builder clearRegion() {
            this.f36524h = null;
            return this;
        }

        @NonNull
        public Builder clearTargets() {
            List list = this.f36519c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @NonNull
        public Palette generate() {
            List list;
            Filter[] filterArr;
            Bitmap bitmap = this.f36518b;
            if (bitmap != null) {
                Bitmap m53760b = m53760b(bitmap);
                Rect rect = this.f36524h;
                if (m53760b != this.f36518b && rect != null) {
                    double width = m53760b.getWidth() / this.f36518b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), m53760b.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), m53760b.getHeight());
                }
                int[] m53761a = m53761a(m53760b);
                int i = this.f36520d;
                if (this.f36523g.isEmpty()) {
                    filterArr = null;
                } else {
                    List list2 = this.f36523g;
                    filterArr = (Filter[]) list2.toArray(new Filter[list2.size()]);
                }
                C4818a c4818a = new C4818a(m53761a, i, filterArr);
                if (m53760b != this.f36518b) {
                    m53760b.recycle();
                }
                list = c4818a.m53742d();
            } else {
                list = this.f36517a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            Palette palette = new Palette(list, this.f36519c);
            palette.m53766b();
            return palette;
        }

        @NonNull
        public Builder maximumColorCount(int i) {
            this.f36520d = i;
            return this;
        }

        @NonNull
        public Builder resizeBitmapArea(int i) {
            this.f36521e = i;
            this.f36522f = -1;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder resizeBitmapSize(int i) {
            this.f36522f = i;
            this.f36521e = -1;
            return this;
        }

        @NonNull
        public Builder setRegion(@InterfaceC2037Px int i, @InterfaceC2037Px int i2, @InterfaceC2037Px int i3, @InterfaceC2037Px int i4) {
            if (this.f36518b != null) {
                if (this.f36524h == null) {
                    this.f36524h = new Rect();
                }
                this.f36524h.set(0, 0, this.f36518b.getWidth(), this.f36518b.getHeight());
                if (!this.f36524h.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public Builder(@NonNull List<Swatch> list) {
            this.f36519c = new ArrayList();
            this.f36520d = 16;
            this.f36521e = 12544;
            this.f36522f = -1;
            ArrayList arrayList = new ArrayList();
            this.f36523g = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(Palette.f36511f);
                this.f36517a = list;
                this.f36518b = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }

        @NonNull
        public AsyncTask<Bitmap, Void, Palette> generate(@NonNull PaletteAsyncListener paletteAsyncListener) {
            if (paletteAsyncListener != null) {
                return new AsyncTaskC4816a(paletteAsyncListener).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f36518b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }
    }
}