package io.fotoapparat.selector;

import io.fotoapparat.parameter.Flash;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005*<\u0010\n\"\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u00052\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u0005¨\u0006\u000b"}, m28850d2 = {"autoFlash", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/selector/FlashSelector;", "Lkotlin/ExtensionFunctionType;", "autoRedEye", "off", "on", "torch", "FlashSelector", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class FlashSelectorsKt {
    @NotNull
    public static final Function1<Iterable<? extends Flash>, Flash> autoFlash() {
        return SelectorsKt.single(Flash.Auto.INSTANCE);
    }

    @NotNull
    public static final Function1<Iterable<? extends Flash>, Flash> autoRedEye() {
        return SelectorsKt.single(Flash.AutoRedEye.INSTANCE);
    }

    @NotNull
    public static final Function1<Iterable<? extends Flash>, Flash> off() {
        return SelectorsKt.single(Flash.Off.INSTANCE);
    }

    @NotNull
    /* renamed from: on */
    public static final Function1<Iterable<? extends Flash>, Flash> m30478on() {
        return SelectorsKt.single(Flash.C10496On.INSTANCE);
    }

    @NotNull
    public static final Function1<Iterable<? extends Flash>, Flash> torch() {
        return SelectorsKt.single(Flash.Torch.INSTANCE);
    }
}
