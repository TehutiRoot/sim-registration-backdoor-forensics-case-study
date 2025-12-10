package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class CustomAttribute {

    /* renamed from: a */
    public boolean f32056a;

    /* renamed from: b */
    public String f32057b;

    /* renamed from: c */
    public AttributeType f32058c;

    /* renamed from: d */
    public int f32059d;

    /* renamed from: e */
    public float f32060e;

    /* renamed from: f */
    public String f32061f;

    /* renamed from: g */
    public boolean f32062g;

    /* renamed from: h */
    public int f32063h;

    /* loaded from: classes2.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* renamed from: androidx.constraintlayout.core.motion.CustomAttribute$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3653a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32064a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f32064a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32064a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32064a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32064a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32064a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32064a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32064a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32064a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.f32056a = false;
        this.f32057b = str;
        this.f32058c = attributeType;
    }

    /* renamed from: a */
    public static int m58722a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return 0;
                            }
                            return ((i5 << 16) + (i2 << 8) + i3) | (-16777216);
                        }
                        return ((i4 << 16) + (i2 << 8) + i5) | (-16777216);
                    }
                    return ((i2 << 16) + (i3 << 8) + i5) | (-16777216);
                }
                return ((i2 << 16) + (i5 << 8) + i4) | (-16777216);
            }
            return ((i3 << 16) + (i5 << 8) + i2) | (-16777216);
        }
        return ((i5 << 16) + (i4 << 8) + i2) | (-16777216);
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.f32058c) != customAttribute.f32058c) {
            return false;
        }
        switch (C3653a.f32064a[attributeType.ordinal()]) {
            case 1:
            case 6:
                if (this.f32059d != customAttribute.f32059d) {
                    return false;
                }
                return true;
            case 2:
                if (this.f32062g != customAttribute.f32062g) {
                    return false;
                }
                return true;
            case 3:
                if (this.f32059d != customAttribute.f32059d) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                if (this.f32063h != customAttribute.f32063h) {
                    return false;
                }
                return true;
            case 7:
                if (this.f32060e != customAttribute.f32060e) {
                    return false;
                }
                return true;
            case 8:
                if (this.f32060e != customAttribute.f32060e) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public AttributeType getType() {
        return this.f32058c;
    }

    public float getValueToInterpolate() {
        switch (C3653a.f32064a[this.f32058c.ordinal()]) {
            case 2:
                if (this.f32062g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f32059d;
            case 7:
                return this.f32060e;
            case 8:
                return this.f32060e;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f;
        switch (C3653a.f32064a[this.f32058c.ordinal()]) {
            case 2:
                if (this.f32062g) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.f32063h;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 6:
                fArr[0] = this.f32059d;
                return;
            case 7:
                fArr[0] = this.f32060e;
                return;
            case 8:
                fArr[0] = this.f32060e;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i = C3653a.f32064a[this.f32058c.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return true;
        }
        return false;
    }

    public int numberOfInterpolatedValues() {
        int i = C3653a.f32064a[this.f32058c.ordinal()];
        if (i == 4 || i == 5) {
            return 4;
        }
        return 1;
    }

    public void setColorValue(int i) {
        this.f32063h = i;
    }

    public void setFloatValue(float f) {
        this.f32060e = f;
    }

    public void setIntValue(int i) {
        this.f32059d = i;
    }

    public void setStringValue(String str) {
        this.f32061f = str;
    }

    public void setValue(float[] fArr) {
        switch (C3653a.f32064a[this.f32058c.ordinal()]) {
            case 1:
            case 6:
                this.f32059d = (int) fArr[0];
                return;
            case 2:
                this.f32062g = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.f32063h = hsvToRgb;
                this.f32063h = (m58722a((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 7:
                this.f32060e = fArr[0];
                return;
            case 8:
                this.f32060e = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.f32057b = str;
        this.f32058c = attributeType;
        this.f32056a = z;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (C3653a.f32064a[this.f32058c.ordinal()]) {
            case 1:
            case 6:
                this.f32059d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f32062g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f32061f = (String) obj;
                return;
            case 4:
            case 5:
                this.f32063h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f32060e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f32060e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.f32056a = false;
        this.f32057b = customAttribute.f32057b;
        this.f32058c = customAttribute.f32058c;
        setValue(obj);
    }
}