package p000;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* renamed from: iR */
/* loaded from: classes2.dex */
public final class C10466iR extends Editable.Factory {

    /* renamed from: a */
    public static final Object f62794a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f62795b;

    /* renamed from: c */
    public static Class f62796c;

    public C10466iR() {
        try {
            f62796c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C10466iR.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f62795b == null) {
            synchronized (f62794a) {
                try {
                    if (f62795b == null) {
                        f62795b = new C10466iR();
                    }
                } finally {
                }
            }
        }
        return f62795b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f62796c;
        if (cls != null) {
            return SpannableBuilder.create(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
