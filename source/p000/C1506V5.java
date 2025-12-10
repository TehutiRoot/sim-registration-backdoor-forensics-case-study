package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: V5 */
/* loaded from: classes.dex */
public class C1506V5 {

    /* renamed from: l */
    public static final RectF f6534l = new RectF();

    /* renamed from: m */
    public static ConcurrentHashMap f6535m = new ConcurrentHashMap();

    /* renamed from: n */
    public static ConcurrentHashMap f6536n = new ConcurrentHashMap();

    /* renamed from: a */
    public int f6537a = 0;

    /* renamed from: b */
    public boolean f6538b = false;

    /* renamed from: c */
    public float f6539c = -1.0f;

    /* renamed from: d */
    public float f6540d = -1.0f;

    /* renamed from: e */
    public float f6541e = -1.0f;

    /* renamed from: f */
    public int[] f6542f = new int[0];

    /* renamed from: g */
    public boolean f6543g = false;

    /* renamed from: h */
    public TextPaint f6544h;

    /* renamed from: i */
    public final TextView f6545i;

    /* renamed from: j */
    public final Context f6546j;

    /* renamed from: k */
    public final C1512f f6547k;

    /* renamed from: V5$a */
    /* loaded from: classes.dex */
    public static final class C1507a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static StaticLayout m65916a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, @NonNull TextView textView, @NonNull TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @DoNotInline
        /* renamed from: b */
        public static int m65915b(@NonNull TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: V5$b */
    /* loaded from: classes.dex */
    public static final class C1508b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m65914a(@NonNull View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: V5$c */
    /* loaded from: classes.dex */
    public static final class C1509c {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static StaticLayout m65913a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, int i2, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull C1512f c1512f) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c1512f.mo65912a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: V5$d */
    /* loaded from: classes.dex */
    public static class C1510d extends C1512f {
        @Override // p000.C1506V5.C1512f
        /* renamed from: a */
        public void mo65912a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1506V5.m65930m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: V5$e */
    /* loaded from: classes.dex */
    public static class C1511e extends C1510d {
        @Override // p000.C1506V5.C1510d, p000.C1506V5.C1512f
        /* renamed from: a */
        public void mo65912a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // p000.C1506V5.C1512f
        /* renamed from: b */
        public boolean mo65911b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    public C1506V5(TextView textView) {
        this.f6545i = textView;
        this.f6546j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f6547k = new C1511e();
        } else if (i >= 23) {
            this.f6547k = new C1510d();
        } else {
            this.f6547k = new C1512f();
        }
    }

    /* renamed from: k */
    public static Method m65932k(String str) {
        try {
            Method method = (Method) f6535m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                f6535m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: m */
    public static Object m65930m(Object obj, String str, Object obj2) {
        try {
            return m65932k(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* renamed from: a */
    public void m65942a() {
        int measuredWidth;
        if (!m65929n()) {
            return;
        }
        if (this.f6538b) {
            if (this.f6545i.getMeasuredHeight() > 0 && this.f6545i.getMeasuredWidth() > 0) {
                if (this.f6547k.mo65911b(this.f6545i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f6545i.getMeasuredWidth() - this.f6545i.getTotalPaddingLeft()) - this.f6545i.getTotalPaddingRight();
                }
                int height = (this.f6545i.getHeight() - this.f6545i.getCompoundPaddingBottom()) - this.f6545i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f6534l;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float m65938e = m65938e(rectF);
                            if (m65938e != this.f6545i.getTextSize()) {
                                m65923t(0, m65938e);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f6538b = true;
    }

    /* renamed from: b */
    public final int[] m65941b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final void m65940c() {
        this.f6537a = 0;
        this.f6540d = -1.0f;
        this.f6541e = -1.0f;
        this.f6539c = -1.0f;
        this.f6542f = new int[0];
        this.f6538b = false;
    }

    /* renamed from: d */
    public StaticLayout m65939d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1509c.m65913a(charSequence, alignment, i, i2, this.f6545i, this.f6544h, this.f6547k);
        }
        return C1507a.m65916a(charSequence, alignment, i, this.f6545i, this.f6544h);
    }

    /* renamed from: e */
    public final int m65938e(RectF rectF) {
        int length = this.f6542f.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (m65919x(this.f6542f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i;
                    i = i5;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.f6542f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: f */
    public int m65937f() {
        return Math.round(this.f6541e);
    }

    /* renamed from: g */
    public int m65936g() {
        return Math.round(this.f6540d);
    }

    /* renamed from: h */
    public int m65935h() {
        return Math.round(this.f6539c);
    }

    /* renamed from: i */
    public int[] m65934i() {
        return this.f6542f;
    }

    /* renamed from: j */
    public int m65933j() {
        return this.f6537a;
    }

    /* renamed from: l */
    public void m65931l(int i) {
        TextPaint textPaint = this.f6544h;
        if (textPaint == null) {
            this.f6544h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f6544h.set(this.f6545i.getPaint());
        this.f6544h.setTextSize(i);
    }

    /* renamed from: n */
    public boolean m65929n() {
        if (m65918y() && this.f6537a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public void m65928o(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        TypedArray obtainStyledAttributes = this.f6546j.obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        TextView textView = this.f6545i;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), R.styleable.AppCompatTextView, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.f6537a = obtainStyledAttributes.getInt(R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeStepGranularity)) {
            f = obtainStyledAttributes.getDimension(R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeMinTextSize)) {
            f2 = obtainStyledAttributes.getDimension(R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizeMaxTextSize)) {
            f3 = obtainStyledAttributes.getDimension(R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m65921v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m65918y()) {
            if (this.f6537a == 1) {
                if (!this.f6543g) {
                    DisplayMetrics displayMetrics = this.f6546j.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    m65917z(f2, f3, f);
                }
                m65922u();
                return;
            }
            return;
        }
        this.f6537a = 0;
    }

    /* renamed from: p */
    public void m65927p(int i, int i2, int i3, int i4) {
        if (m65918y()) {
            DisplayMetrics displayMetrics = this.f6546j.getResources().getDisplayMetrics();
            m65917z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m65922u()) {
                m65942a();
            }
        }
    }

    /* renamed from: q */
    public void m65926q(int[] iArr, int i) {
        if (m65918y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f6546j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f6542f = m65941b(iArr2);
                if (!m65920w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f6543g = false;
            }
            if (m65922u()) {
                m65942a();
            }
        }
    }

    /* renamed from: r */
    public void m65925r(int i) {
        if (m65918y()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = this.f6546j.getResources().getDisplayMetrics();
                    m65917z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m65922u()) {
                        m65942a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            m65940c();
        }
    }

    /* renamed from: s */
    public final void m65924s(float f) {
        if (f != this.f6545i.getPaint().getTextSize()) {
            this.f6545i.getPaint().setTextSize(f);
            boolean m65914a = C1508b.m65914a(this.f6545i);
            if (this.f6545i.getLayout() != null) {
                this.f6538b = false;
                try {
                    Method m65932k = m65932k("nullLayouts");
                    if (m65932k != null) {
                        m65932k.invoke(this.f6545i, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!m65914a) {
                    this.f6545i.requestLayout();
                } else {
                    this.f6545i.forceLayout();
                }
                this.f6545i.invalidate();
            }
        }
    }

    /* renamed from: t */
    public void m65923t(int i, float f) {
        Resources resources;
        Context context = this.f6546j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m65924s(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: u */
    public final boolean m65922u() {
        if (m65918y() && this.f6537a == 1) {
            if (!this.f6543g || this.f6542f.length == 0) {
                int floor = ((int) Math.floor((this.f6541e - this.f6540d) / this.f6539c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f6540d + (i * this.f6539c));
                }
                this.f6542f = m65941b(iArr);
            }
            this.f6538b = true;
        } else {
            this.f6538b = false;
        }
        return this.f6538b;
    }

    /* renamed from: v */
    public final void m65921v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f6542f = m65941b(iArr);
            m65920w();
        }
    }

    /* renamed from: w */
    public final boolean m65920w() {
        boolean z;
        int[] iArr = this.f6542f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f6543g = z;
        if (z) {
            this.f6537a = 1;
            this.f6540d = iArr[0];
            this.f6541e = iArr[length - 1];
            this.f6539c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    public final boolean m65919x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f6545i.getText();
        TransformationMethod transformationMethod = this.f6545i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f6545i)) != null) {
            text = transformation;
        }
        int m65915b = C1507a.m65915b(this.f6545i);
        m65931l(i);
        StaticLayout m65939d = m65939d(text, (Layout.Alignment) m65930m(this.f6545i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m65915b);
        if ((m65915b != -1 && (m65939d.getLineCount() > m65915b || m65939d.getLineEnd(m65939d.getLineCount() - 1) != text.length())) || m65939d.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m65918y() {
        return !(this.f6545i instanceof AppCompatEditText);
    }

    /* renamed from: z */
    public final void m65917z(float f, float f2, float f3) {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.f6537a = 1;
                    this.f6540d = f;
                    this.f6541e = f2;
                    this.f6539c = f3;
                    this.f6543g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }

    /* renamed from: V5$f */
    /* loaded from: classes.dex */
    public static class C1512f {
        /* renamed from: b */
        public boolean mo65911b(TextView textView) {
            return ((Boolean) C1506V5.m65930m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        /* renamed from: a */
        public void mo65912a(StaticLayout.Builder builder, TextView textView) {
        }
    }
}
