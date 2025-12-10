package coil.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.MainThread;
import coil.target.Target;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, m28850d2 = {"Lcoil/transition/TransitionTarget;", "Lcoil/target/Target;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", Promotion.ACTION_VIEW, "Landroid/view/View;", "getView", "()Landroid/view/View;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface TransitionTarget extends Target {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @MainThread
        @Deprecated
        public static void onError(@NotNull TransitionTarget transitionTarget, @Nullable Drawable drawable) {
            XQ1.m65505a(transitionTarget, drawable);
        }

        @MainThread
        @Deprecated
        public static void onStart(@NotNull TransitionTarget transitionTarget, @Nullable Drawable drawable) {
            XQ1.m65504b(transitionTarget, drawable);
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull TransitionTarget transitionTarget, @NotNull Drawable drawable) {
            XQ1.m65503c(transitionTarget, drawable);
        }
    }

    @Nullable
    Drawable getDrawable();

    @NotNull
    View getView();
}
