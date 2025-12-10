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
        public final Context f10029a;

        /* renamed from: b */
        public final LayoutInflater f10030b;

        /* renamed from: c */
        public LayoutInflater f10031c;

        public Helper(@NonNull Context context) {
            this.f10029a = context;
            this.f10030b = LayoutInflater.from(context);
        }

        @NonNull
        public LayoutInflater getDropDownViewInflater() {
            LayoutInflater layoutInflater = this.f10031c;
            if (layoutInflater == null) {
                return this.f10030b;
            }
            return layoutInflater;
        }

        @Nullable
        public Resources.Theme getDropDownViewTheme() {
            LayoutInflater layoutInflater = this.f10031c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void setDropDownViewTheme(@Nullable Resources.Theme theme) {
            if (theme == null) {
                this.f10031c = null;
            } else if (theme.equals(this.f10029a.getTheme())) {
                this.f10031c = this.f10030b;
            } else {
                this.f10031c = LayoutInflater.from(new ContextThemeWrapper(this.f10029a, theme));
            }
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}