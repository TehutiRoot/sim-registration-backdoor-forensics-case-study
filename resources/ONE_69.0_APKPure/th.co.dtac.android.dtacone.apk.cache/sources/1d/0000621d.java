package androidx.compose.p003ui.modifier;

import androidx.compose.runtime.MutableState;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0016\u001a\u00020\u00132\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0090\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c\"\u0004\b\u001a\u0010\n¨\u0006\u001d"}, m29142d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocal;", Action.KEY_ATTRIBUTE, "<init>", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", "", "value", "", "forceValue$ui_release", "(Ljava/lang/Object;)V", "forceValue", "T", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/modifier/ModifierLocal;", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "()Ljava/lang/Object;", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,208:1\n81#2:209\n107#2,2:210\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n41#1:209\n41#1:210,2\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.SingleLocalMap */
/* loaded from: classes2.dex */
public final class SingleLocalMap extends ModifierLocalMap {

    /* renamed from: a */
    public final ModifierLocal f30270a;

    /* renamed from: b */
    public final MutableState f30271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleLocalMap(@NotNull ModifierLocal<?> key) {
        super(null);
        MutableState m65148g;
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30270a = key;
        m65148g = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f30271b = m65148g;
    }

    /* renamed from: a */
    public final Object m59468a() {
        return this.f30271b.getValue();
    }

    /* renamed from: b */
    public final void m59467b(Object obj) {
        this.f30271b.setValue(obj);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key == this.f30270a) {
            return true;
        }
        return false;
    }

    public final void forceValue$ui_release(@Nullable Object obj) {
        m59467b(obj);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalMap
    @Nullable
    public <T> T get$ui_release(@NotNull ModifierLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key == this.f30270a) {
            T t = (T) m59468a();
            if (t == null) {
                return null;
            }
            return t;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalMap
    public <T> void set$ui_release(@NotNull ModifierLocal<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key == this.f30270a) {
            m59467b(t);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}