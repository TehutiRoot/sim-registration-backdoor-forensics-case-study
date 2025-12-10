package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public class CustomVariable {

    /* renamed from: a */
    public String f32065a;

    /* renamed from: b */
    public int f32066b;

    /* renamed from: c */
    public int f32067c;

    /* renamed from: d */
    public float f32068d;

    /* renamed from: e */
    public String f32069e;

    /* renamed from: f */
    public boolean f32070f;

    public CustomVariable(CustomVariable customVariable) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32068d = Float.NaN;
        this.f32069e = null;
        this.f32065a = customVariable.f32065a;
        this.f32066b = customVariable.f32066b;
        this.f32067c = customVariable.f32067c;
        this.f32068d = customVariable.f32068d;
        this.f32069e = customVariable.f32069e;
        this.f32070f = customVariable.f32070f;
    }

    /* renamed from: a */
    public static int m58721a(int i) {
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
        int m58721a = m58721a((int) (f * 255.0f));
        int m58721a2 = m58721a((int) (f2 * 255.0f));
        return (m58721a << 16) | (m58721a((int) (f4 * 255.0f)) << 24) | (m58721a2 << 8) | m58721a((int) (f3 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        int i = this.f32066b;
        switch (i) {
            case 900:
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                motionWidget.setCustomAttribute(this.f32065a, i, this.f32067c);
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.f32065a, i, this.f32068d);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                motionWidget.setCustomAttribute(this.f32065a, i, this.f32069e);
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.f32065a, i, this.f32070f);
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
        if (customVariable == null || (i = this.f32066b) != customVariable.f32066b) {
            return false;
        }
        switch (i) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                if (this.f32067c != customVariable.f32067c) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                if (this.f32068d != customVariable.f32068d) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                if (this.f32067c != customVariable.f32067c) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                if (this.f32067c != customVariable.f32067c) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.f32070f != customVariable.f32070f) {
                    return false;
                }
                return true;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                if (this.f32068d != customVariable.f32068d) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public boolean getBooleanValue() {
        return this.f32070f;
    }

    public int getColorValue() {
        return this.f32067c;
    }

    public float getFloatValue() {
        return this.f32068d;
    }

    public int getIntegerValue() {
        return this.f32067c;
    }

    public int getInterpolatedColor(float[] fArr) {
        int m58721a = m58721a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
        int m58721a2 = m58721a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
        return (m58721a((int) (fArr[3] * 255.0f)) << 24) | (m58721a << 16) | (m58721a2 << 8) | m58721a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.f32065a;
    }

    public String getStringValue() {
        return this.f32069e;
    }

    public int getType() {
        return this.f32066b;
    }

    public float getValueToInterpolate() {
        switch (this.f32066b) {
            case 900:
                return this.f32067c;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return this.f32068d;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.f32070f) {
                    return 1.0f;
                }
                return 0.0f;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return this.f32068d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f;
        switch (this.f32066b) {
            case 900:
                fArr[0] = this.f32067c;
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                fArr[0] = this.f32068d;
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                int i = this.f32067c;
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
                if (this.f32070f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                fArr[0] = this.f32068d;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i = this.f32066b;
        if (i != 903 && i != 904 && i != 906) {
            return true;
        }
        return false;
    }

    public int numberOfInterpolatedValues() {
        if (this.f32066b != 902) {
            return 1;
        }
        return 4;
    }

    public void setBooleanValue(boolean z) {
        this.f32070f = z;
    }

    public void setFloatValue(float f) {
        this.f32068d = f;
    }

    public void setIntValue(int i) {
        this.f32067c = i;
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        int i = this.f32066b;
        boolean z = true;
        switch (i) {
            case 900:
                motionWidget.setCustomAttribute(this.f32065a, i, (int) fArr[0]);
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.f32065a, i, fArr[0]);
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                int m58721a = m58721a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                int m58721a2 = m58721a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                int m58721a3 = m58721a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                motionWidget.setCustomAttribute(this.f32065a, this.f32066b, (m58721a((int) (fArr[3] * 255.0f)) << 24) | (m58721a << 16) | (m58721a2 << 8) | m58721a3);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f32065a);
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                String str = this.f32065a;
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
        this.f32069e = str;
    }

    public void setValue(float[] fArr) {
        switch (this.f32066b) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.f32067c = (int) fArr[0];
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.f32068d = fArr[0];
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.f32067c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.f32070f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.f32065a + ':';
        switch (this.f32066b) {
            case 900:
                return str + this.f32067c;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return str + this.f32068d;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                return str + colorString(this.f32067c);
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                return str + this.f32069e;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                return str + Boolean.valueOf(this.f32070f);
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return str + this.f32068d;
            default:
                return str + "????";
        }
    }

    public CustomVariable(String str, int i, String str2) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32068d = Float.NaN;
        this.f32065a = str;
        this.f32066b = i;
        this.f32069e = str2;
    }

    public void setValue(Object obj) {
        switch (this.f32066b) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.f32067c = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                this.f32068d = ((Float) obj).floatValue();
                return;
            case TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.f32067c = ((Integer) obj).intValue();
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                this.f32069e = (String) obj;
                return;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.f32070f = ((Boolean) obj).booleanValue();
                return;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.f32068d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public CustomVariable(String str, int i, int i2) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32068d = Float.NaN;
        this.f32069e = null;
        this.f32065a = str;
        this.f32066b = i;
        if (i == 901) {
            this.f32068d = i2;
        } else {
            this.f32067c = i2;
        }
    }

    public CustomVariable(String str, int i, float f) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32069e = null;
        this.f32065a = str;
        this.f32066b = i;
        this.f32068d = f;
    }

    public CustomVariable(String str, int i, boolean z) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32068d = Float.NaN;
        this.f32069e = null;
        this.f32065a = str;
        this.f32066b = i;
        this.f32070f = z;
    }

    public CustomVariable(String str, int i) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32068d = Float.NaN;
        this.f32069e = null;
        this.f32065a = str;
        this.f32066b = i;
    }

    public CustomVariable(String str, int i, Object obj) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32068d = Float.NaN;
        this.f32069e = null;
        this.f32065a = str;
        this.f32066b = i;
        setValue(obj);
    }

    public CustomVariable(CustomVariable customVariable, Object obj) {
        this.f32067c = Integer.MIN_VALUE;
        this.f32068d = Float.NaN;
        this.f32069e = null;
        this.f32065a = customVariable.f32065a;
        this.f32066b = customVariable.f32066b;
        setValue(obj);
    }
}