package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public class CustomVariable {

    /* renamed from: a */
    public String f31977a;

    /* renamed from: b */
    public int f31978b;

    /* renamed from: c */
    public int f31979c;

    /* renamed from: d */
    public float f31980d;

    /* renamed from: e */
    public String f31981e;

    /* renamed from: f */
    public boolean f31982f;

    public CustomVariable(CustomVariable customVariable) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31980d = Float.NaN;
        this.f31981e = null;
        this.f31977a = customVariable.f31977a;
        this.f31978b = customVariable.f31978b;
        this.f31979c = customVariable.f31979c;
        this.f31980d = customVariable.f31980d;
        this.f31981e = customVariable.f31981e;
        this.f31982f = customVariable.f31982f;
    }

    /* renamed from: a */
    public static int m58771a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static String colorString(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
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

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int m58771a = m58771a((int) (f * 255.0f));
        int m58771a2 = m58771a((int) (f2 * 255.0f));
        return (m58771a << 16) | (m58771a((int) (f4 * 255.0f)) << 24) | (m58771a2 << 8) | m58771a((int) (f3 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        int i = this.f31978b;
        switch (i) {
            case 900:
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                motionWidget.setCustomAttribute(this.f31977a, i, this.f31979c);
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.f31977a, i, this.f31980d);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                motionWidget.setCustomAttribute(this.f31977a, i, this.f31981e);
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.f31977a, i, this.f31982f);
                return;
            default:
                return;
        }
    }

    public CustomVariable copy() {
        return new CustomVariable(this);
    }

    public boolean diff(CustomVariable customVariable) {
        int i;
        if (customVariable == null || (i = this.f31978b) != customVariable.f31978b) {
            return false;
        }
        switch (i) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                if (this.f31979c != customVariable.f31979c) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                if (this.f31980d != customVariable.f31980d) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                if (this.f31979c != customVariable.f31979c) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                if (this.f31979c != customVariable.f31979c) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.f31982f != customVariable.f31982f) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                if (this.f31980d != customVariable.f31980d) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public boolean getBooleanValue() {
        return this.f31982f;
    }

    public int getColorValue() {
        return this.f31979c;
    }

    public float getFloatValue() {
        return this.f31980d;
    }

    public int getIntegerValue() {
        return this.f31979c;
    }

    public int getInterpolatedColor(float[] fArr) {
        int m58771a = m58771a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
        int m58771a2 = m58771a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
        return (m58771a((int) (fArr[3] * 255.0f)) << 24) | (m58771a << 16) | (m58771a2 << 8) | m58771a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.f31977a;
    }

    public String getStringValue() {
        return this.f31981e;
    }

    public int getType() {
        return this.f31978b;
    }

    public float getValueToInterpolate() {
        switch (this.f31978b) {
            case 900:
                return this.f31979c;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return this.f31980d;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.f31982f) {
                    return 1.0f;
                }
                return 0.0f;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return this.f31980d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f;
        switch (this.f31978b) {
            case 900:
                fArr[0] = this.f31979c;
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                fArr[0] = this.f31980d;
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                int i = this.f31979c;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.f31982f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                fArr[0] = this.f31980d;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i = this.f31978b;
        if (i != 903 && i != 904 && i != 906) {
            return true;
        }
        return false;
    }

    public int numberOfInterpolatedValues() {
        if (this.f31978b != 902) {
            return 1;
        }
        return 4;
    }

    public void setBooleanValue(boolean z) {
        this.f31982f = z;
    }

    public void setFloatValue(float f) {
        this.f31980d = f;
    }

    public void setIntValue(int i) {
        this.f31979c = i;
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        int i = this.f31978b;
        boolean z = true;
        switch (i) {
            case 900:
                motionWidget.setCustomAttribute(this.f31977a, i, (int) fArr[0]);
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.f31977a, i, fArr[0]);
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                int m58771a = m58771a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                int m58771a2 = m58771a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                int m58771a3 = m58771a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                motionWidget.setCustomAttribute(this.f31977a, this.f31978b, (m58771a((int) (fArr[3] * 255.0f)) << 24) | (m58771a << 16) | (m58771a2 << 8) | m58771a3);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f31977a);
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                String str = this.f31977a;
                if (fArr[0] <= 0.5f) {
                    z = false;
                }
                motionWidget.setCustomAttribute(str, i, z);
                return;
            default:
                return;
        }
    }

    public void setStringValue(String str) {
        this.f31981e = str;
    }

    public void setValue(float[] fArr) {
        switch (this.f31978b) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.f31979c = (int) fArr[0];
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.f31980d = fArr[0];
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.f31979c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.f31982f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.f31977a + ':';
        switch (this.f31978b) {
            case 900:
                return str + this.f31979c;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return str + this.f31980d;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                return str + colorString(this.f31979c);
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                return str + this.f31981e;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                return str + Boolean.valueOf(this.f31982f);
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return str + this.f31980d;
            default:
                return str + "????";
        }
    }

    public CustomVariable(String str, int i, String str2) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31980d = Float.NaN;
        this.f31977a = str;
        this.f31978b = i;
        this.f31981e = str2;
    }

    public void setValue(Object obj) {
        switch (this.f31978b) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.f31979c = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                this.f31980d = ((Float) obj).floatValue();
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.f31979c = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                this.f31981e = (String) obj;
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.f31982f = ((Boolean) obj).booleanValue();
                return;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.f31980d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public CustomVariable(String str, int i, int i2) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31980d = Float.NaN;
        this.f31981e = null;
        this.f31977a = str;
        this.f31978b = i;
        if (i == 901) {
            this.f31980d = i2;
        } else {
            this.f31979c = i2;
        }
    }

    public CustomVariable(String str, int i, float f) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31981e = null;
        this.f31977a = str;
        this.f31978b = i;
        this.f31980d = f;
    }

    public CustomVariable(String str, int i, boolean z) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31980d = Float.NaN;
        this.f31981e = null;
        this.f31977a = str;
        this.f31978b = i;
        this.f31982f = z;
    }

    public CustomVariable(String str, int i) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31980d = Float.NaN;
        this.f31981e = null;
        this.f31977a = str;
        this.f31978b = i;
    }

    public CustomVariable(String str, int i, Object obj) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31980d = Float.NaN;
        this.f31981e = null;
        this.f31977a = str;
        this.f31978b = i;
        setValue(obj);
    }

    public CustomVariable(CustomVariable customVariable, Object obj) {
        this.f31979c = Integer.MIN_VALUE;
        this.f31980d = Float.NaN;
        this.f31981e = null;
        this.f31977a = customVariable.f31977a;
        this.f31978b = customVariable.f31978b;
        setValue(obj);
    }
}
