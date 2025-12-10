package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class LayoutInflaterCompat {

    /* renamed from: androidx.core.view.LayoutInflaterCompat$a */
    /* loaded from: classes2.dex */
    public static class LayoutInflater$Factory2C4095a implements LayoutInflater.Factory2 {

        /* renamed from: a */
        public final LayoutInflaterFactory f34254a;

        public LayoutInflater$Factory2C4095a(LayoutInflaterFactory layoutInflaterFactory) {
            this.f34254a = layoutInflaterFactory;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f34254a.onCreateView(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f34254a + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f34254a.onCreateView(view, str, context, attributeSet);
        }
    }

    @Deprecated
    public static LayoutInflaterFactory getFactory(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater$Factory2C4095a) {
            return ((LayoutInflater$Factory2C4095a) factory).f34254a;
        }
        return null;
    }

    @Deprecated
    public static void setFactory(@NonNull LayoutInflater layoutInflater, @NonNull LayoutInflaterFactory layoutInflaterFactory) {
        layoutInflater.setFactory2(new LayoutInflater$Factory2C4095a(layoutInflaterFactory));
    }

    public static void setFactory2(@NonNull LayoutInflater layoutInflater, @NonNull LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}