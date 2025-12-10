package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class LinearTransformation {

    /* loaded from: classes4.dex */
    public static final class LinearTransformationBuilder {

        /* renamed from: a */
        public final double f54010a;

        /* renamed from: b */
        public final double f54011b;

        public LinearTransformation and(double d, double d2) {
            boolean z;
            boolean z2 = false;
            if (AbstractC1728YJ.m65476d(d) && AbstractC1728YJ.m65476d(d2)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            double d3 = this.f54010a;
            if (d == d3) {
                if (d2 != this.f54011b) {
                    z2 = true;
                }
                Preconditions.checkArgument(z2);
                return new C8111d(this.f54010a);
            }
            return withSlope((d2 - this.f54011b) / (d - d3));
        }

        public LinearTransformation withSlope(double d) {
            Preconditions.checkArgument(!Double.isNaN(d));
            if (AbstractC1728YJ.m65476d(d)) {
                return new C8110c(d, this.f54011b - (this.f54010a * d));
            }
            return new C8111d(this.f54010a);
        }

        public LinearTransformationBuilder(double d, double d2) {
            this.f54010a = d;
            this.f54011b = d2;
        }
    }

    /* renamed from: com.google.common.math.LinearTransformation$b */
    /* loaded from: classes4.dex */
    public static final class C8109b extends LinearTransformation {

        /* renamed from: a */
        public static final C8109b f54012a = new C8109b();

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            return this;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return Double.NaN;
        }
    }

    public static LinearTransformation forNaN() {
        return C8109b.f54012a;
    }

    public static LinearTransformation horizontal(double d) {
        Preconditions.checkArgument(AbstractC1728YJ.m65476d(d));
        return new C8110c(0.0d, d);
    }

    public static LinearTransformationBuilder mapping(double d, double d2) {
        boolean z;
        if (AbstractC1728YJ.m65476d(d) && AbstractC1728YJ.m65476d(d2)) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new LinearTransformationBuilder(d, d2);
    }

    public static LinearTransformation vertical(double d) {
        Preconditions.checkArgument(AbstractC1728YJ.m65476d(d));
        return new C8111d(d);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d);

    /* renamed from: com.google.common.math.LinearTransformation$d */
    /* loaded from: classes4.dex */
    public static final class C8111d extends LinearTransformation {

        /* renamed from: a */
        public final double f54016a;

        /* renamed from: b */
        public LinearTransformation f54017b;

        public C8111d(double d) {
            this.f54016a = d;
            this.f54017b = null;
        }

        /* renamed from: a */
        private LinearTransformation m39947a() {
            return new C8110c(0.0d, this.f54016a, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f54017b;
            if (linearTransformation == null) {
                LinearTransformation m39947a = m39947a();
                this.f54017b = m39947a;
                return m39947a;
            }
            return linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f54016a));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            throw new IllegalStateException();
        }

        public C8111d(double d, LinearTransformation linearTransformation) {
            this.f54016a = d;
            this.f54017b = linearTransformation;
        }
    }

    /* renamed from: com.google.common.math.LinearTransformation$c */
    /* loaded from: classes4.dex */
    public static final class C8110c extends LinearTransformation {

        /* renamed from: a */
        public final double f54013a;

        /* renamed from: b */
        public final double f54014b;

        /* renamed from: c */
        public LinearTransformation f54015c;

        public C8110c(double d, double d2) {
            this.f54013a = d;
            this.f54014b = d2;
            this.f54015c = null;
        }

        /* renamed from: a */
        public final LinearTransformation m39948a() {
            double d = this.f54013a;
            if (d != 0.0d) {
                return new C8110c(1.0d / d, (this.f54014b * (-1.0d)) / d, this);
            }
            return new C8111d(this.f54014b, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f54015c;
            if (linearTransformation == null) {
                LinearTransformation m39948a = m39948a();
                this.f54015c = m39948a;
                return m39948a;
            }
            return linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            if (this.f54013a == 0.0d) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.f54013a;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f54013a), Double.valueOf(this.f54014b));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return (d * this.f54013a) + this.f54014b;
        }

        public C8110c(double d, double d2, LinearTransformation linearTransformation) {
            this.f54013a = d;
            this.f54014b = d2;
            this.f54015c = linearTransformation;
        }
    }
}