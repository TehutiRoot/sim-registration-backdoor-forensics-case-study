package androidx.camera.core.impl.utils;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import java.util.Comparator;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AspectRatioUtil {
    public static final Rational ASPECT_RATIO_4_3 = new Rational(4, 3);
    public static final Rational ASPECT_RATIO_3_4 = new Rational(3, 4);
    public static final Rational ASPECT_RATIO_16_9 = new Rational(16, 9);
    public static final Rational ASPECT_RATIO_9_16 = new Rational(9, 16);

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements Comparator<Rational> {

        /* renamed from: a */
        public final Rational f11358a;

        /* renamed from: b */
        public final RectF f11359b;

        /* renamed from: c */
        public final Rational f11360c;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(@NonNull Rational rational, @Nullable Rational rational2) {
            this.f11358a = rational;
            this.f11360c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f11359b = m62831c(rational);
        }

        /* renamed from: a */
        public final float m62833a(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        /* renamed from: b */
        public final float m62832b(RectF rectF, RectF rectF2) {
            float width;
            float height;
            if (rectF.width() < rectF2.width()) {
                width = rectF.width();
            } else {
                width = rectF2.width();
            }
            if (rectF.height() < rectF2.height()) {
                height = rectF.height();
            } else {
                height = rectF2.height();
            }
            return width * height;
        }

        /* renamed from: c */
        public final RectF m62831c(Rational rational) {
            if (rational.floatValue() == this.f11360c.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f11360c.getNumerator(), this.f11360c.getDenominator());
            }
            if (rational.floatValue() > this.f11360c.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f11360c.getNumerator(), (rational.getDenominator() * this.f11360c.getNumerator()) / rational.getNumerator());
            }
            return new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f11360c.getDenominator()) / rational.getDenominator(), this.f11360c.getDenominator());
        }

        /* renamed from: d */
        public final boolean m62830d(RectF rectF, RectF rectF2) {
            if (rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Comparator
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF m62831c = m62831c(rational);
            RectF m62831c2 = m62831c(rational2);
            boolean m62830d = m62830d(m62831c, this.f11359b);
            boolean m62830d2 = m62830d(m62831c2, this.f11359b);
            if (m62830d && m62830d2) {
                return (int) Math.signum(m62833a(m62831c) - m62833a(m62831c2));
            }
            if (m62830d) {
                return -1;
            }
            if (m62830d2) {
                return 1;
            }
            return -((int) Math.signum(m62832b(m62831c, this.f11359b) - m62832b(m62831c2, this.f11359b)));
        }
    }

    /* renamed from: a */
    public static boolean m62835a(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            if (!m62834b(Math.max(0, height - 16), width, rational) && !m62834b(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
            return true;
        } else if (i == 0) {
            return m62834b(height, width, rational);
        } else {
            if (height % 16 != 0) {
                return false;
            }
            return m62834b(width, height, rational2);
        }
    }

    /* renamed from: b */
    public static boolean m62834b(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        if (numerator > Math.max(0, i2 - 16) && numerator < i2 + 16) {
            return true;
        }
        return false;
    }

    public static boolean hasMatchingAspectRatio(@NonNull Size size, @Nullable Rational rational) {
        return hasMatchingAspectRatio(size, rational, SizeUtil.RESOLUTION_VGA);
    }

    public static boolean hasMatchingAspectRatio(@NonNull Size size, @Nullable Rational rational, @NonNull Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (SizeUtil.getArea(size) >= SizeUtil.getArea(size2)) {
            return m62835a(size, rational);
        }
        return false;
    }
}