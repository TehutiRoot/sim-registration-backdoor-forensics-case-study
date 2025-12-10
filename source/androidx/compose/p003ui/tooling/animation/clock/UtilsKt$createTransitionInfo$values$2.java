package androidx.compose.p003ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.animation.clock.UtilsKt$createTransitionInfo$values$2 */
/* loaded from: classes2.dex */
public final class UtilsKt$createTransitionInfo$values$2 extends Lambda implements Function0<Map<Long, T>> {
    final /* synthetic */ long $endTimeMs;
    final /* synthetic */ Lazy<Long> $startTimeMs$delegate;
    final /* synthetic */ long $stepMs;
    final /* synthetic */ Animation<T, V> $this_createTransitionInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$createTransitionInfo$values$2(Animation<T, V> animation, long j, long j2, Lazy<Long> lazy) {
        super(0);
        this.$this_createTransitionInfo = animation;
        this.$endTimeMs = j;
        this.$stepMs = j2;
        this.$startTimeMs$delegate = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<Long, T> invoke() {
        long m58912a;
        long m58912a2;
        long m58912a3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m58912a = UtilsKt.m58912a(this.$startTimeMs$delegate);
        Long valueOf = Long.valueOf(m58912a);
        Animation<T, V> animation = this.$this_createTransitionInfo;
        m58912a2 = UtilsKt.m58912a(this.$startTimeMs$delegate);
        linkedHashMap.put(valueOf, animation.getValueFromNanos(UtilsKt.millisToNanos(m58912a2)));
        linkedHashMap.put(Long.valueOf(this.$endTimeMs), this.$this_createTransitionInfo.getValueFromNanos(UtilsKt.millisToNanos(this.$endTimeMs)));
        m58912a3 = UtilsKt.m58912a(this.$startTimeMs$delegate);
        while (m58912a3 <= this.$endTimeMs) {
            linkedHashMap.put(Long.valueOf(m58912a3), this.$this_createTransitionInfo.getValueFromNanos(UtilsKt.millisToNanos(m58912a3)));
            m58912a3 += this.$stepMs;
        }
        return linkedHashMap;
    }
}
