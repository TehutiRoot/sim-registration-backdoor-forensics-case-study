package androidx.core.content;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes2.dex */
public final class SharedPreferencesCompat {

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class EditorCompat {

        /* renamed from: b */
        public static EditorCompat f33778b;

        /* renamed from: a */
        public final C3967a f33779a = new C3967a();

        /* renamed from: androidx.core.content.SharedPreferencesCompat$EditorCompat$a */
        /* loaded from: classes2.dex */
        public static class C3967a {
            /* renamed from: a */
            public void m57457a(SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static EditorCompat getInstance() {
            if (f33778b == null) {
                f33778b = new EditorCompat();
            }
            return f33778b;
        }

        @Deprecated
        public void apply(@NonNull SharedPreferences.Editor editor) {
            this.f33779a.m57457a(editor);
        }
    }
}
