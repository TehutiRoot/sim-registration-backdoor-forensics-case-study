package androidx.compose.runtime;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class GroupKind {

    /* renamed from: a */
    public static final Companion f28415a = new Companion(null);

    /* renamed from: b */
    public static final int f28416b = m60219d(0);

    /* renamed from: c */
    public static final int f28417c = m60219d(1);

    /* renamed from: d */
    public static final int f28418d = m60219d(2);

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m29142d2 = {"Landroidx/compose/runtime/GroupKind$Companion;", "", "()V", PDAnnotationMarkup.RT_GROUP, "Landroidx/compose/runtime/GroupKind;", "getGroup-ULZAiWs", "()I", "I", "Node", "getNode-ULZAiWs", "ReusableNode", "getReusableNode-ULZAiWs", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getGroup-ULZAiWs  reason: not valid java name */
        public final int m71565getGroupULZAiWs() {
            return GroupKind.f28416b;
        }

        /* renamed from: getNode-ULZAiWs  reason: not valid java name */
        public final int m71566getNodeULZAiWs() {
            return GroupKind.f28417c;
        }

        /* renamed from: getReusableNode-ULZAiWs  reason: not valid java name */
        public final int m71567getReusableNodeULZAiWs() {
            return GroupKind.f28418d;
        }

        public Companion() {
        }
    }

    /* renamed from: d */
    public static int m60219d(int i) {
        return i;
    }
}