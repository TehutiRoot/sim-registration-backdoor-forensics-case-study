package coil.size;

import androidx.annotation.InterfaceC2055Px;
import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b¨\u0006\b"}, m28850d2 = {"Dimension", "Lcoil/size/Dimension$Pixels;", "px", "", "pxOrElse", "Lcoil/size/Dimension;", "block", "Lkotlin/Function0;", "coil-base_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@JvmName(name = "-Dimensions")
/* renamed from: coil.size.-Dimensions  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Dimensions {
    @NotNull
    public static final Dimension.Pixels Dimension(@InterfaceC2055Px int i) {
        return new Dimension.Pixels(i);
    }

    public static final int pxOrElse(@NotNull Dimension dimension, @NotNull Function0<Integer> function0) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f40827px;
        }
        return function0.invoke().intValue();
    }
}
