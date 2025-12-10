package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public abstract class FloatPropertyCompat<T> {

    /* renamed from: a */
    public final String f35084a;

    /* renamed from: androidx.dynamicanimation.animation.FloatPropertyCompat$a */
    /* loaded from: classes2.dex */
    public static class C4507a extends FloatPropertyCompat {

        /* renamed from: b */
        public final /* synthetic */ FloatProperty f35085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4507a(String str, FloatProperty floatProperty) {
            super(str);
            this.f35085b = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(Object obj) {
            Object obj2;
            obj2 = this.f35085b.get(obj);
            return ((Float) obj2).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(Object obj, float f) {
            this.f35085b.setValue(obj, f);
        }
    }

    public FloatPropertyCompat(String str) {
        this.f35084a = str;
    }

    @RequiresApi(24)
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        String name;
        name = floatProperty.getName();
        return new C4507a(name, floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
