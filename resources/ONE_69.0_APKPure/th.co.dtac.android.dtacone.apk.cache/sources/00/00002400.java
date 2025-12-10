package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Stable;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\ba\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m29142d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory;", "", "canUpdateZoom", "", "getCanUpdateZoom", "()Z", "create", "Landroidx/compose/foundation/PlatformMagnifier;", "style", "Landroidx/compose/foundation/MagnifierStyle;", Promotion.ACTION_VIEW, "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialZoom", "", "Companion", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public interface PlatformMagnifierFactory {
    @NotNull
    public static final Companion Companion = Companion.f12991a;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;", "", "()V", "getForCurrentPlatform", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f12991a = new Companion();

        @Stable
        @NotNull
        public final PlatformMagnifierFactory getForCurrentPlatform() {
            if (MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null)) {
                if (Build.VERSION.SDK_INT == 28) {
                    return PlatformMagnifierFactoryApi28Impl.INSTANCE;
                }
                return PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    @NotNull
    PlatformMagnifier create(@NotNull MagnifierStyle magnifierStyle, @NotNull View view, @NotNull Density density, float f);

    boolean getCanUpdateZoom();
}