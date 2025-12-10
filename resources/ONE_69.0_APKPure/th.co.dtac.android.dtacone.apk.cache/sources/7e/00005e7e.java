package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\"@\u0010\u0012\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e0\rj\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"*\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m29142d2 = {"", "enableLiveLiterals", "()V", "T", "", Action.KEY_ATTRIBUTE, "value", "Landroidx/compose/runtime/State;", "liveLiteral", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/State;", "", "updateLiveLiteralValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/HashMap;", "Landroidx/compose/runtime/MutableState;", "Lkotlin/collections/HashMap;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/HashMap;", "liveLiteralCache", "", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isLiveLiteralsEnabled", "()Z", "isLiveLiteralsEnabled$annotations", "runtime_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,99:1\n361#2,7:100\n361#2,7:107\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:100,7\n92#1:107,7\n*E\n"})
/* loaded from: classes2.dex */
public final class LiveLiteralKt {

    /* renamed from: a */
    public static final HashMap f28754a = new HashMap();

    /* renamed from: b */
    public static boolean f28755b;

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        f28755b = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return f28755b;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }

    @ComposeCompilerApi
    @InternalComposeApi
    @NotNull
    public static final <T> State<T> liveLiteral(@NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap hashMap = f28754a;
        Object obj = hashMap.get(key);
        if (obj == null) {
            obj = AbstractC19036aL1.m65148g(t, null, 2, null);
            hashMap.put(key, obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return (State) obj;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(@NotNull String key, @Nullable Object obj) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap hashMap = f28754a;
        Object obj2 = hashMap.get(key);
        if (obj2 == null) {
            obj2 = AbstractC19036aL1.m65148g(obj, null, 2, null);
            hashMap.put(key, obj2);
            z = false;
        } else {
            z = true;
        }
        MutableState mutableState = (MutableState) obj2;
        if (z) {
            mutableState.setValue(obj);
        }
    }
}