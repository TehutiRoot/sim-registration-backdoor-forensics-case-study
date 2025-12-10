package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class ComplexColorCompat {

    /* renamed from: a */
    public final Shader f33822a;

    /* renamed from: b */
    public final ColorStateList f33823b;

    /* renamed from: c */
    public int f33824c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.f33822a = shader;
        this.f33823b = colorStateList;
        this.f33824c = i;
    }

    /* renamed from: a */
    public static ComplexColorCompat m57422a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return m57420c(ColorStateListInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return m57419d(Q60.m66681b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ComplexColorCompat m57421b(int i) {
        return new ComplexColorCompat(null, null, i);
    }

    /* renamed from: c */
    public static ComplexColorCompat m57420c(ColorStateList colorStateList) {
        return new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static ComplexColorCompat m57419d(Shader shader) {
        return new ComplexColorCompat(shader, null, 0);
    }

    @Nullable
    public static ComplexColorCompat inflate(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
        try {
            return m57422a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @ColorInt
    public int getColor() {
        return this.f33824c;
    }

    @Nullable
    public Shader getShader() {
        return this.f33822a;
    }

    public boolean isGradient() {
        if (this.f33822a != null) {
            return true;
        }
        return false;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (this.f33822a == null && (colorStateList = this.f33823b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public boolean onStateChanged(int[] iArr) {
        if (isStateful()) {
            ColorStateList colorStateList = this.f33823b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f33824c) {
                this.f33824c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void setColor(@ColorInt int i) {
        this.f33824c = i;
    }

    public boolean willDraw() {
        if (!isGradient() && this.f33824c == 0) {
            return false;
        }
        return true;
    }
}
