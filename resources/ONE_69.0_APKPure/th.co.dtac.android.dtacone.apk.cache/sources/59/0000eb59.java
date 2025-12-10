package p000;

import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;

/* renamed from: nR */
/* loaded from: classes2.dex */
public abstract class AbstractC12350nR {

    /* renamed from: nR$a */
    /* loaded from: classes2.dex */
    public static class C12351a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Set<int[]> m26413a() {
            return C12352b.m26412a();
        }
    }

    /* renamed from: nR$b */
    /* loaded from: classes2.dex */
    public static class C12352b {
        /* renamed from: a */
        public static Set m26412a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<Object> set = (Set) invoke;
                for (Object obj : set) {
                    if (!(obj instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    /* renamed from: a */
    public static Set m26414a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C12351a.m26413a();
        }
        return C12352b.m26412a();
    }
}