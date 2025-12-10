package p000;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: TJ0 */
/* loaded from: classes2.dex */
public abstract class TJ0 {
    /* renamed from: a */
    public static ObjectAnimator m66357a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }
}