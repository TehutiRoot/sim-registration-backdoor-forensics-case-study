package coil.util;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m28850d2 = {"Lcoil/util/Time;", "", "<init>", "()V", "", "currentMillis", "()J", "", "setCurrentMillis", "(J)V", "reset", "Lkotlin/Function0;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function0;", "provider", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Time {
    @NotNull
    public static final Time INSTANCE = new Time();

    /* renamed from: a */
    public static Function0 f40876a = Time$provider$1.INSTANCE;

    public final long currentMillis() {
        return ((Number) f40876a.invoke()).longValue();
    }

    public final void reset() {
        f40876a = Time$reset$1.INSTANCE;
    }

    public final void setCurrentMillis(long j) {
        f40876a = new Time$setCurrentMillis$1(j);
    }
}
