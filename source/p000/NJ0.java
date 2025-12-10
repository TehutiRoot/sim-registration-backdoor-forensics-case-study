package p000;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: NJ0 */
/* loaded from: classes2.dex */
public abstract class NJ0 {
    /* renamed from: a */
    public static ObjectAnimator m67231a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }
}
