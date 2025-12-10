package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    /* loaded from: classes.dex */
    public static final class Helper {

        /* renamed from: a */
        public final Context f9941a;

        /* renamed from: b */
        public final LayoutInflater f9942b;

        /* renamed from: c */
        public LayoutInflater f9943c;

        public Helper(@NonNull Context context) {
            this.f9941a = context;
            this.f9942b = LayoutInflater.from(context);
        }

        @NonNull
        public LayoutInflater getDropDownViewInflater() {
            LayoutInflater layoutInflater = this.f9943c;
            if (layoutInflater == null) {
                return this.f9942b;
            }
            return layoutInflater;
        }

        @Nullable
        public Resources.Theme getDropDownViewTheme() {
            LayoutInflater layoutInflater = this.f9943c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void setDropDownViewTheme(@Nullable Resources.Theme theme) {
            if (theme == null) {
                this.f9943c = null;
            } else if (theme.equals(this.f9941a.getTheme())) {
                this.f9943c = this.f9942b;
            } else {
                this.f9943c = LayoutInflater.from(new ContextThemeWrapper(this.f9941a, theme));
            }
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}
