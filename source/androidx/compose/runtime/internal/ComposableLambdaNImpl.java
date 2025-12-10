package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0014\"\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m28850d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "", Action.KEY_ATTRIBUTE, "", "tracked", "arity", "<init>", "(IZI)V", "", OperatorName.CURVE_TO, "()V", "Landroidx/compose/runtime/Composer;", "composer", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/runtime/Composer;)V", "", "block", "update", "(Ljava/lang/Object;)V", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "params", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "I", "getKey", "()I", "Z", "getArity", "d", "Ljava/lang/Object;", "_block", "Landroidx/compose/runtime/RecomposeScope;", "e", "Landroidx/compose/runtime/RecomposeScope;", Action.SCOPE_ATTRIBUTE, "", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "scopes", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,179:1\n37#2,2:180\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n111#1:180,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {

    /* renamed from: a */
    public final int f28660a;

    /* renamed from: b */
    public final boolean f28661b;

    /* renamed from: c */
    public final int f28662c;

    /* renamed from: d */
    public Object f28663d;

    /* renamed from: e */
    public RecomposeScope f28664e;

    /* renamed from: f */
    public List f28665f;

    public ComposableLambdaNImpl(int i, boolean z, int i2) {
        this.f28660a = i;
        this.f28661b = z;
        this.f28662c = i2;
    }

    /* renamed from: b */
    private final void m59953b(Composer composer) {
        RecomposeScope recomposeScope;
        if (this.f28661b && (recomposeScope = composer.getRecomposeScope()) != null) {
            composer.recordUsed(recomposeScope);
            if (ComposableLambdaKt.replacableWith(this.f28664e, recomposeScope)) {
                this.f28664e = recomposeScope;
                return;
            }
            List list = this.f28665f;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f28665f = arrayList;
                arrayList.add(recomposeScope);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (ComposableLambdaKt.replacableWith((RecomposeScope) list.get(i), recomposeScope)) {
                    list.set(i, recomposeScope);
                    return;
                }
            }
            list.add(recomposeScope);
        }
    }

    /* renamed from: c */
    private final void m59952c() {
        if (this.f28661b) {
            RecomposeScope recomposeScope = this.f28664e;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.f28664e = null;
            }
            List list = this.f28665f;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((RecomposeScope) list.get(i)).invalidate();
                }
                list.clear();
            }
        }
    }

    /* renamed from: a */
    public final int m59954a(int i) {
        int i2 = i - 2;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f28662c;
    }

    public final int getKey() {
        return this.f28660a;
    }

    @Override // kotlin.jvm.functions.FunctionN
    @Nullable
    public Object invoke(@NotNull Object... args) {
        int sameBits;
        Intrinsics.checkNotNullParameter(args, "args");
        int m59954a = m59954a(args.length);
        Object obj = args[m59954a];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = ArraysKt___ArraysKt.slice(args, AbstractC11719c.until(0, args.length - 1)).toArray(new Object[0]);
        Object obj2 = args[args.length - 1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Composer startRestartGroup = ((Composer) obj).startRestartGroup(this.f28660a);
        m59953b(startRestartGroup);
        if (startRestartGroup.changed(this)) {
            sameBits = ComposableLambdaKt.differentBits(m59954a);
        } else {
            sameBits = ComposableLambdaKt.sameBits(m59954a);
        }
        int i = intValue | sameBits;
        Object obj3 = this.f28663d;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(Integer.valueOf(i));
        Object invoke = ((FunctionN) obj3).invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaNImpl$invoke$1(args, m59954a, this));
        }
        return invoke;
    }

    public final void update(@NotNull Object block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (!Intrinsics.areEqual(block, this.f28663d)) {
            if (this.f28663d == null) {
                z = true;
            } else {
                z = false;
            }
            this.f28663d = (FunctionN) block;
            if (!z) {
                m59952c();
            }
        }
    }
}
