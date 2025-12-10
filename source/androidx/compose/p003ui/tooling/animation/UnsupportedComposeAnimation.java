package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "", "label", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", OperatorName.CURVE_TO, "Ljava/lang/Object;", "getAnimationObject", "()Ljava/lang/Object;", "animationObject", "", "", "d", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "Companion", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUnsupportedComposeAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsupportedComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,52:1\n12744#2,2:53\n*S KotlinDebug\n*F\n+ 1 UnsupportedComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n*L\n40#1:53,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation */
/* loaded from: classes2.dex */
public final class UnsupportedComposeAnimation implements ComposeAnimation {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static boolean f31684e;

    /* renamed from: a */
    public final String f31685a;

    /* renamed from: b */
    public final ComposeAnimationType f31686b;

    /* renamed from: c */
    public final Object f31687c;

    /* renamed from: d */
    public final Set f31688d;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "create", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "label", "", "testOverrideAvailability", "", "override", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final UnsupportedComposeAnimation create(@Nullable String str) {
            if (!getApiAvailable()) {
                return null;
            }
            return new UnsupportedComposeAnimation(str, null);
        }

        public final boolean getApiAvailable() {
            return UnsupportedComposeAnimation.f31684e;
        }

        public final void testOverrideAvailability(boolean z) {
            UnsupportedComposeAnimation.f31684e = z;
        }

        public Companion() {
        }
    }

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Intrinsics.areEqual(values[i].name(), "UNSUPPORTED")) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        f31684e = z;
    }

    public /* synthetic */ UnsupportedComposeAnimation(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public Object getAnimationObject() {
        return this.f31687c;
    }

    @Nullable
    public String getLabel() {
        return this.f31685a;
    }

    @NotNull
    public Set<Integer> getStates() {
        return this.f31688d;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.f31686b;
    }

    public UnsupportedComposeAnimation(String str) {
        this.f31685a = str;
        this.f31686b = ComposeAnimationType.UNSUPPORTED;
        this.f31687c = 0;
        this.f31688d = DG1.emptySet();
    }
}
