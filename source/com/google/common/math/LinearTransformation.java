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
        public final double f53998a;

        /* renamed from: b */
        public final double f53999b;

        public LinearTransformation and(double d, double d2) {
            boolean z;
            boolean z2 = false;
            if (AbstractC1671XJ.m65521d(d) && AbstractC1671XJ.m65521d(d2)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            double d3 = this.f53998a;
            if (d == d3) {
                if (d2 != this.f53999b) {
                    z2 = true;
                }
                Preconditions.checkArgument(z2);
                return new C8122d(this.f53998a);
            }
            return withSlope((d2 - this.f53999b) / (d - d3));
        }

        public LinearTransformation withSlope(double d) {
            Preconditions.checkArgument(!Double.isNaN(d));
            if (AbstractC1671XJ.m65521d(d)) {
                return new C8121c(d, this.f53999b - (this.f53998a * d));
            }
            return new C8122d(this.f53998a);
        }

        public LinearTransformationBuilder(double d, double d2) {
            this.f53998a = d;
            this.f53999b = d2;
        }
    }

    /* renamed from: com.google.common.math.LinearTransformation$b */
    /* loaded from: classes4.dex */
    public static final class C8120b extends LinearTransformation {

        /* renamed from: a */
        public static final C8120b f54000a = new C8120b();

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
        return C8120b.f54000a;
    }

    public static LinearTransformation horizontal(double d) {
        Preconditions.checkArgument(AbstractC1671XJ.m65521d(d));
        return new C8121c(0.0d, d);
    }

    public static LinearTransformationBuilder mapping(double d, double d2) {
        boolean z;
        if (AbstractC1671XJ.m65521d(d) && AbstractC1671XJ.m65521d(d2)) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new LinearTransformationBuilder(d, d2);
    }

    public static LinearTransformation vertical(double d) {
        Preconditions.checkArgument(AbstractC1671XJ.m65521d(d));
        return new C8122d(d);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d);

    /* renamed from: com.google.common.math.LinearTransformation$d */
    /* loaded from: classes4.dex */
    public static final class C8122d extends LinearTransformation {

        /* renamed from: a */
        public final double f54004a;

        /* renamed from: b */
        public LinearTransformation f54005b;

        public C8122d(double d) {
            this.f54004a = d;
            this.f54005b = null;
        }

        /* renamed from: a */
        private LinearTransformation m39955a() {
            return new C8121c(0.0d, this.f54004a, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f54005b;
            if (linearTransformation == null) {
                LinearTransformation m39955a = m39955a();
                this.f54005b = m39955a;
                return m39955a;
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
            return String.format("x = %g", Double.valueOf(this.f54004a));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            throw new IllegalStateException();
        }

        public C8122d(double d, LinearTransformation linearTransformation) {
            this.f54004a = d;
            this.f54005b = linearTransformation;
        }
    }

    /* renamed from: com.google.common.math.LinearTransformation$c */
    /* loaded from: classes4.dex */
    public static final class C8121c extends LinearTransformation {

        /* renamed from: a */
        public final double f54001a;

        /* renamed from: b */
        public final double f54002b;

        /* renamed from: c */
        public LinearTransformation f54003c;

        public C8121c(double d, double d2) {
            this.f54001a = d;
            this.f54002b = d2;
            this.f54003c = null;
        }

        /* renamed from: a */
        public final LinearTransformation m39956a() {
            double d = this.f54001a;
            if (d != 0.0d) {
                return new C8121c(1.0d / d, (this.f54002b * (-1.0d)) / d, this);
            }
            return new C8122d(this.f54002b, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f54003c;
            if (linearTransformation == null) {
                LinearTransformation m39956a = m39956a();
                this.f54003c = m39956a;
                return m39956a;
            }
            return linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            if (this.f54001a == 0.0d) {
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
            return this.f54001a;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f54001a), Double.valueOf(this.f54002b));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return (d * this.f54001a) + this.f54002b;
        }

        public C8121c(double d, double d2, LinearTransformation linearTransformation) {
            this.f54001a = d;
            this.f54002b = d2;
            this.f54003c = linearTransformation;
        }
    }
}
