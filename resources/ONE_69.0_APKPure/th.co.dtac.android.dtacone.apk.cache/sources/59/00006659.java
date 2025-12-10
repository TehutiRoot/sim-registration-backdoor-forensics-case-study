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

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
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
        long m58862a;
        long m58862a2;
        long m58862a3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m58862a = UtilsKt.m58862a(this.$startTimeMs$delegate);
        Long valueOf = Long.valueOf(m58862a);
        Animation<T, V> animation = this.$this_createTransitionInfo;
        m58862a2 = UtilsKt.m58862a(this.$startTimeMs$delegate);
        linkedHashMap.put(valueOf, animation.getValueFromNanos(UtilsKt.millisToNanos(m58862a2)));
        linkedHashMap.put(Long.valueOf(this.$endTimeMs), this.$this_createTransitionInfo.getValueFromNanos(UtilsKt.millisToNanos(this.$endTimeMs)));
        m58862a3 = UtilsKt.m58862a(this.$startTimeMs$delegate);
        while (m58862a3 <= this.$endTimeMs) {
            linkedHashMap.put(Long.valueOf(m58862a3), this.$this_createTransitionInfo.getValueFromNanos(UtilsKt.millisToNanos(m58862a3)));
            m58862a3 += this.$stepMs;
        }
        return linkedHashMap;
    }
}