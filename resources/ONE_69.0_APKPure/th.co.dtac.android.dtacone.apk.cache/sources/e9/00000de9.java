package p000;

import android.graphics.RectF;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import java.util.HashSet;

/* renamed from: Oh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC18215Oh0 extends Key {
    protected static final float SELECTION_SLOPE = 20.0f;

    /* renamed from: e */
    public int f4508e = Key.UNSET;

    public abstract boolean intersects(int i, int i2, RectF rectF, RectF rectF2, float f, float f2);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr);

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet hashSet) {
    }
}