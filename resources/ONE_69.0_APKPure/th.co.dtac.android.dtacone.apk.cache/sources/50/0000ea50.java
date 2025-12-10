package p000;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* renamed from: mR */
/* loaded from: classes2.dex */
public final class C12271mR extends Editable.Factory {

    /* renamed from: a */
    public static final Object f71993a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f71994b;

    /* renamed from: c */
    public static Class f71995c;

    public C12271mR() {
        try {
            f71995c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C12271mR.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f71994b == null) {
            synchronized (f71993a) {
                try {
                    if (f71994b == null) {
                        f71994b = new C12271mR();
                    }
                } finally {
                }
            }
        }
        return f71994b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f71995c;
        if (cls != null) {
            return SpannableBuilder.create(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}