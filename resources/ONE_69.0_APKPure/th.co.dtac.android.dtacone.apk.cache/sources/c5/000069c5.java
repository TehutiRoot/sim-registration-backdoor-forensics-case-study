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
        public static EditorCompat f33866b;

        /* renamed from: a */
        public final C3949a f33867a = new C3949a();

        /* renamed from: androidx.core.content.SharedPreferencesCompat$EditorCompat$a */
        /* loaded from: classes2.dex */
        public static class C3949a {
            /* renamed from: a */
            public void m57407a(SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static EditorCompat getInstance() {
            if (f33866b == null) {
                f33866b = new EditorCompat();
            }
            return f33866b;
        }

        @Deprecated
        public void apply(@NonNull SharedPreferences.Editor editor) {
            this.f33867a.m57407a(editor);
        }
    }
}