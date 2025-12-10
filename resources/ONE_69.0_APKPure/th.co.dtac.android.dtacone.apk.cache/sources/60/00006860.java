package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class ConstraintAttribute {

    /* renamed from: a */
    public boolean f33308a;

    /* renamed from: b */
    public String f33309b;

    /* renamed from: c */
    public AttributeType f33310c;

    /* renamed from: d */
    public int f33311d;

    /* renamed from: e */
    public float f33312e;

    /* renamed from: f */
    public String f33313f;

    /* renamed from: g */
    public boolean f33314g;

    /* renamed from: h */
    public int f33315h;

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

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3758a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33316a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f33316a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33316a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33316a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33316a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33316a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33316a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33316a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33316a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
        this.f33308a = false;
        this.f33309b = str;
        this.f33310c = attributeType;
    }

    /* renamed from: a */
    public static int m58097a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == R.styleable.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == R.styleable.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str2);
            if (!constraintAttribute.f33308a) {
                str = "set" + str2;
            } else {
                str = str2;
            }
            try {
                switch (C3758a.f33316a[constraintAttribute.f33310c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f33311d));
                        break;
                    case 2:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f33314g));
                        break;
                    case 3:
                        cls.getMethod(str, CharSequence.class).invoke(view, constraintAttribute.f33313f);
                        break;
                    case 4:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f33315h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f33315h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f33311d));
                        break;
                    case 7:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f33312e));
                        break;
                    case 8:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f33312e));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str2);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str2);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cls.getName());
                sb3.append(" must have a method ");
                sb3.append(str);
            } catch (InvocationTargetException e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Custom Attribute \"");
                sb4.append(str2);
                sb4.append("\" not found on ");
                sb4.append(cls.getName());
                e3.printStackTrace();
            }
        }
    }

    public void applyCustom(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f33309b;
        if (!this.f33308a) {
            str = "set" + str2;
        } else {
            str = str2;
        }
        try {
            switch (C3758a.f33316a[this.f33310c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f33311d));
                    return;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f33314g));
                    return;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f33313f);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f33315h));
                    return;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f33315h);
                    method.invoke(view, colorDrawable);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f33312e));
                    return;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f33312e));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(" Custom Attribute \"");
            sb.append(str2);
            sb.append("\" not found on ");
            sb.append(cls.getName());
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" Custom Attribute \"");
            sb2.append(str2);
            sb2.append("\" not found on ");
            sb2.append(cls.getName());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append(" must have a method ");
            sb3.append(str);
        } catch (InvocationTargetException e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" Custom Attribute \"");
            sb4.append(str2);
            sb4.append("\" not found on ");
            sb4.append(cls.getName());
            e3.printStackTrace();
        }
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        if (constraintAttribute == null || (attributeType = this.f33310c) != constraintAttribute.f33310c) {
            return false;
        }
        switch (C3758a.f33316a[attributeType.ordinal()]) {
            case 1:
            case 6:
                if (this.f33311d != constraintAttribute.f33311d) {
                    return false;
                }
                return true;
            case 2:
                if (this.f33314g != constraintAttribute.f33314g) {
                    return false;
                }
                return true;
            case 3:
                if (this.f33311d != constraintAttribute.f33311d) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                if (this.f33315h != constraintAttribute.f33315h) {
                    return false;
                }
                return true;
            case 7:
                if (this.f33312e != constraintAttribute.f33312e) {
                    return false;
                }
                return true;
            case 8:
                if (this.f33312e != constraintAttribute.f33312e) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public int getColorValue() {
        return this.f33315h;
    }

    public float getFloatValue() {
        return this.f33312e;
    }

    public int getIntegerValue() {
        return this.f33311d;
    }

    public String getName() {
        return this.f33309b;
    }

    public String getStringValue() {
        return this.f33313f;
    }

    public AttributeType getType() {
        return this.f33310c;
    }

    public float getValueToInterpolate() {
        switch (C3758a.f33316a[this.f33310c.ordinal()]) {
            case 2:
                if (this.f33314g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f33311d;
            case 7:
                return this.f33312e;
            case 8:
                return this.f33312e;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f;
        switch (C3758a.f33316a[this.f33310c.ordinal()]) {
            case 2:
                if (this.f33314g) {
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
                int i = this.f33315h;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 6:
                fArr[0] = this.f33311d;
                return;
            case 7:
                fArr[0] = this.f33312e;
                return;
            case 8:
                fArr[0] = this.f33312e;
                return;
            default:
                return;
        }
    }

    public boolean isBooleanValue() {
        return this.f33314g;
    }

    public boolean isContinuous() {
        int i = C3758a.f33316a[this.f33310c.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return true;
        }
        return false;
    }

    public boolean isMethod() {
        return this.f33308a;
    }

    public int numberOfInterpolatedValues() {
        int i = C3758a.f33316a[this.f33310c.ordinal()];
        if (i == 4 || i == 5) {
            return 4;
        }
        return 1;
    }

    public void setColorValue(int i) {
        this.f33315h = i;
    }

    public void setFloatValue(float f) {
        this.f33312e = f;
    }

    public void setIntValue(int i) {
        this.f33311d = i;
    }

    public void setStringValue(String str) {
        this.f33313f = str;
    }

    public void setValue(float[] fArr) {
        switch (C3758a.f33316a[this.f33310c.ordinal()]) {
            case 1:
            case 6:
                this.f33311d = (int) fArr[0];
                return;
            case 2:
                this.f33314g = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int HSVToColor = Color.HSVToColor(fArr);
                this.f33315h = HSVToColor;
                this.f33315h = (m58097a((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 7:
                this.f33312e = fArr[0];
                return;
            case 8:
                this.f33312e = fArr[0];
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.f33309b = str;
        this.f33310c = attributeType;
        this.f33308a = z;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (C3758a.f33316a[this.f33310c.ordinal()]) {
            case 1:
            case 6:
                this.f33311d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f33314g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f33313f = (String) obj;
                return;
            case 4:
            case 5:
                this.f33315h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f33312e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f33312e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f33308a = false;
        this.f33309b = constraintAttribute.f33309b;
        this.f33310c = constraintAttribute.f33310c;
        setValue(obj);
    }
}