package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;

/* loaded from: classes2.dex */
public class ListenerUtil {

    /* renamed from: a */
    public static final SparseArray f34562a = new SparseArray();

    public static <T> T getListener(View view, int i) {
        return (T) view.getTag(i);
    }

    public static <T> T trackListener(View view, T t, int i) {
        T t2 = (T) view.getTag(i);
        view.setTag(i, t);
        return t2;
    }
}
