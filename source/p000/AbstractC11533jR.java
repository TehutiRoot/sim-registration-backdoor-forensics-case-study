package p000;

import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;

/* renamed from: jR */
/* loaded from: classes2.dex */
public abstract class AbstractC11533jR {

    /* renamed from: jR$a */
    /* loaded from: classes2.dex */
    public static class C11534a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Set<int[]> m29212a() {
            return C11535b.m29211a();
        }
    }

    /* renamed from: jR$b */
    /* loaded from: classes2.dex */
    public static class C11535b {
        /* renamed from: a */
        public static Set m29211a() {
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
    public static Set m29213a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C11534a.m29212a();
        }
        return C11535b.m29211a();
    }
}
