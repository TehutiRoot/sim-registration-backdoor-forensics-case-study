package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.p005os.TraceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public class PrecomputedTextCompat implements Spannable {

    /* renamed from: e */
    public static final Object f34047e = new Object();

    /* renamed from: f */
    public static Executor f34048f;

    /* renamed from: a */
    public final Spannable f34049a;

    /* renamed from: b */
    public final Params f34050b;

    /* renamed from: c */
    public final int[] f34051c;

    /* renamed from: d */
    public final PrecomputedText f34052d;

    /* renamed from: androidx.core.text.PrecomputedTextCompat$a */
    /* loaded from: classes2.dex */
    public static class C4081a extends FutureTask {

        /* renamed from: androidx.core.text.PrecomputedTextCompat$a$a */
        /* loaded from: classes2.dex */
        public static class CallableC4082a implements Callable {

            /* renamed from: a */
            public Params f34062a;

            /* renamed from: b */
            public CharSequence f34063b;

            public CallableC4082a(Params params, CharSequence charSequence) {
                this.f34062a = params;
                this.f34063b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public PrecomputedTextCompat call() {
                return PrecomputedTextCompat.create(this.f34063b, this.f34062a);
            }
        }

        public C4081a(Params params, CharSequence charSequence) {
            super(new CallableC4082a(params, charSequence));
        }
    }

    public PrecomputedTextCompat(CharSequence charSequence, Params params, int[] iArr) {
        this.f34049a = new SpannableString(charSequence);
        this.f34050b = params;
        this.f34051c = iArr;
        this.f34052d = null;
    }

    @SuppressLint({"WrongConstant"})
    public static PrecomputedTextCompat create(@NonNull CharSequence charSequence, @NonNull Params params) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder textDirection;
        PrecomputedText.Params params2;
        PrecomputedText create;
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(params);
        try {
            TraceCompat.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.f34057e) != null) {
                create = PrecomputedText.create(charSequence, params2);
                return new PrecomputedTextCompat(create, params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                if (indexOf < 0) {
                    i = length;
                } else {
                    i = indexOf + 1;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE);
                breakStrategy = obtain.setBreakStrategy(params.getBreakStrategy());
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(params.getHyphenationFrequency());
                textDirection = hyphenationFrequency.setTextDirection(params.getTextDirection());
                textDirection.build();
            } else {
                new StaticLayout(charSequence, params.getTextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            TraceCompat.endSection();
        }
    }

    @UiThread
    public static Future<PrecomputedTextCompat> getTextFuture(@NonNull CharSequence charSequence, @NonNull Params params, @Nullable Executor executor) {
        C4081a c4081a = new C4081a(params, charSequence);
        if (executor == null) {
            synchronized (f34047e) {
                try {
                    if (f34048f == null) {
                        f34048f = Executors.newFixedThreadPool(1);
                    }
                    executor = f34048f;
                } finally {
                }
            }
        }
        executor.execute(c4081a);
        return c4081a;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f34049a.charAt(i);
    }

    @IntRange(from = 0)
    public int getParagraphCount() {
        int paragraphCount;
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphCount = this.f34052d.getParagraphCount();
            return paragraphCount;
        }
        return this.f34051c.length;
    }

    @IntRange(from = 0)
    public int getParagraphEnd(@IntRange(from = 0) int i) {
        int paragraphEnd;
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphEnd = this.f34052d.getParagraphEnd(i);
            return paragraphEnd;
        }
        return this.f34051c[i];
    }

    @IntRange(from = 0)
    public int getParagraphStart(@IntRange(from = 0) int i) {
        int paragraphStart;
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.f34052d.getParagraphStart(i);
            return paragraphStart;
        } else if (i == 0) {
            return 0;
        } else {
            return this.f34051c[i - 1];
        }
    }

    @NonNull
    public Params getParams() {
        return this.f34050b;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText getPrecomputedText() {
        if (AbstractC17743Hl1.m68044a(this.f34049a)) {
            return AbstractC17807Il1.m67874a(this.f34049a);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f34049a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f34049a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f34049a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.f34052d.getSpans(i, i2, cls);
            return (T[]) spans;
        }
        return (T[]) this.f34049a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f34049a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f34049a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f34052d.removeSpan(obj);
                return;
            } else {
                this.f34049a.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f34052d.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f34049a.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f34049a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f34049a.toString();
    }

    public PrecomputedTextCompat(PrecomputedText precomputedText, Params params) {
        this.f34049a = precomputedText;
        this.f34050b = params;
        this.f34051c = null;
        this.f34052d = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* loaded from: classes2.dex */
    public static final class Params {

        /* renamed from: a */
        public final TextPaint f34053a;

        /* renamed from: b */
        public final TextDirectionHeuristic f34054b;

        /* renamed from: c */
        public final int f34055c;

        /* renamed from: d */
        public final int f34056d;

        /* renamed from: e */
        public final PrecomputedText.Params f34057e;

        /* loaded from: classes2.dex */
        public static class Builder {

            /* renamed from: a */
            public final TextPaint f34058a;

            /* renamed from: b */
            public TextDirectionHeuristic f34059b;

            /* renamed from: c */
            public int f34060c;

            /* renamed from: d */
            public int f34061d;

            public Builder(@NonNull TextPaint textPaint) {
                this.f34058a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f34060c = 1;
                    this.f34061d = 1;
                } else {
                    this.f34061d = 0;
                    this.f34060c = 0;
                }
                this.f34059b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            @NonNull
            public Params build() {
                return new Params(this.f34058a, this.f34059b, this.f34060c, this.f34061d);
            }

            @RequiresApi(23)
            public Builder setBreakStrategy(int i) {
                this.f34060c = i;
                return this;
            }

            @RequiresApi(23)
            public Builder setHyphenationFrequency(int i) {
                this.f34061d = i;
                return this;
            }

            @RequiresApi(18)
            public Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f34059b = textDirectionHeuristic;
                return this;
            }
        }

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = AbstractC18319Ql1.m66526a(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f34057e = build;
            } else {
                this.f34057e = null;
            }
            this.f34053a = textPaint;
            this.f34054b = textDirectionHeuristic;
            this.f34055c = i;
            this.f34056d = i2;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (equalsWithoutTextDirection(params) && this.f34054b == params.getTextDirection()) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean equalsWithoutTextDirection(@NonNull Params params) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f34055c != params.getBreakStrategy() || this.f34056d != params.getHyphenationFrequency())) || this.f34053a.getTextSize() != params.getTextPaint().getTextSize() || this.f34053a.getTextScaleX() != params.getTextPaint().getTextScaleX() || this.f34053a.getTextSkewX() != params.getTextPaint().getTextSkewX() || this.f34053a.getLetterSpacing() != params.getTextPaint().getLetterSpacing() || !TextUtils.equals(this.f34053a.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()) || this.f34053a.getFlags() != params.getTextPaint().getFlags()) {
                return false;
            }
            if (i >= 24) {
                textLocales = this.f34053a.getTextLocales();
                textLocales2 = params.getTextPaint().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f34053a.getTextLocale().equals(params.getTextPaint().getTextLocale())) {
                return false;
            }
            if (this.f34053a.getTypeface() == null) {
                if (params.getTextPaint().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f34053a.getTypeface().equals(params.getTextPaint().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        @RequiresApi(23)
        public int getBreakStrategy() {
            return this.f34055c;
        }

        @RequiresApi(23)
        public int getHyphenationFrequency() {
            return this.f34056d;
        }

        @Nullable
        @RequiresApi(18)
        public TextDirectionHeuristic getTextDirection() {
            return this.f34054b;
        }

        @NonNull
        public TextPaint getTextPaint() {
            return this.f34053a;
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT >= 24) {
                Float valueOf = Float.valueOf(this.f34053a.getTextSize());
                Float valueOf2 = Float.valueOf(this.f34053a.getTextScaleX());
                Float valueOf3 = Float.valueOf(this.f34053a.getTextSkewX());
                Float valueOf4 = Float.valueOf(this.f34053a.getLetterSpacing());
                Integer valueOf5 = Integer.valueOf(this.f34053a.getFlags());
                textLocales = this.f34053a.getTextLocales();
                return ObjectsCompat.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, this.f34053a.getTypeface(), Boolean.valueOf(this.f34053a.isElegantTextHeight()), this.f34054b, Integer.valueOf(this.f34055c), Integer.valueOf(this.f34056d));
            }
            return ObjectsCompat.hash(Float.valueOf(this.f34053a.getTextSize()), Float.valueOf(this.f34053a.getTextScaleX()), Float.valueOf(this.f34053a.getTextSkewX()), Float.valueOf(this.f34053a.getLetterSpacing()), Integer.valueOf(this.f34053a.getFlags()), this.f34053a.getTextLocale(), this.f34053a.getTypeface(), Boolean.valueOf(this.f34053a.isElegantTextHeight()), this.f34054b, Integer.valueOf(this.f34055c), Integer.valueOf(this.f34056d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f34053a.getTextSize());
            sb.append(", textScaleX=" + this.f34053a.getTextScaleX());
            sb.append(", textSkewX=" + this.f34053a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f34053a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f34053a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocales = this.f34053a.getTextLocales();
                sb2.append(textLocales);
                sb.append(sb2.toString());
            } else {
                sb.append(", textLocale=" + this.f34053a.getTextLocale());
            }
            sb.append(", typeface=" + this.f34053a.getTypeface());
            if (i >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f34053a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb.append(sb3.toString());
            }
            sb.append(", textDir=" + this.f34054b);
            sb.append(", breakStrategy=" + this.f34055c);
            sb.append(", hyphenationFrequency=" + this.f34056d);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi(28)
        public Params(@NonNull PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f34053a = textPaint;
            textDirection = params.getTextDirection();
            this.f34054b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f34055c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f34056d = hyphenationFrequency;
            this.f34057e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
