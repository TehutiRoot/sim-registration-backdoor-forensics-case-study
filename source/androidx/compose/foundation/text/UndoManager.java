package androidx.compose.foundation.text;

import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p003ui.text.input.TextFieldValue;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m28850d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "", "maxStoredCharacters", "<init>", "(I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "now", "", "snapshotIfNeeded", "(Landroidx/compose/ui/text/input/TextFieldValue;J)V", "forceNextSnapshot", "()V", "makeSnapshot", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "undo", "()Landroidx/compose/ui/text/input/TextFieldValue;", "redo", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getMaxStoredCharacters", "()I", "Landroidx/compose/foundation/text/UndoManager$a;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/text/UndoManager$a;", "undoStack", OperatorName.CURVE_TO, "redoStack", "d", "storedCharacters", "e", "Ljava/lang/Long;", "lastSnapshot", "", OperatorName.FILL_NON_ZERO, "Z", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UndoManager {

    /* renamed from: a */
    public final int f14076a;

    /* renamed from: b */
    public C3027a f14077b;

    /* renamed from: c */
    public C3027a f14078c;

    /* renamed from: d */
    public int f14079d;

    /* renamed from: e */
    public Long f14080e;

    /* renamed from: f */
    public boolean f14081f;

    /* renamed from: androidx.compose.foundation.text.UndoManager$a */
    /* loaded from: classes.dex */
    public static final class C3027a {

        /* renamed from: a */
        public C3027a f14082a;

        /* renamed from: b */
        public TextFieldValue f14083b;

        public C3027a(C3027a c3027a, TextFieldValue value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f14082a = c3027a;
            this.f14083b = value;
        }

        /* renamed from: a */
        public final C3027a m61049a() {
            return this.f14082a;
        }

        /* renamed from: b */
        public final TextFieldValue m61048b() {
            return this.f14083b;
        }

        /* renamed from: c */
        public final void m61047c(C3027a c3027a) {
            this.f14082a = c3027a;
        }

        /* renamed from: d */
        public final void m61046d(TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
            this.f14083b = textFieldValue;
        }
    }

    public UndoManager() {
        this(0, 1, null);
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[LOOP:0: B:8:0x000e->B:14:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[EDGE_INSN: B:19:0x0023->B:15:0x0023 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m61050a() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$a r0 = r3.f14077b
            r1 = 0
            if (r0 == 0) goto La
            androidx.compose.foundation.text.UndoManager$a r2 = r0.m61049a()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$a r2 = r0.m61049a()
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$a r2 = r2.m61049a()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            androidx.compose.foundation.text.UndoManager$a r0 = r0.m61049a()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.m61047c(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.m61050a():void");
    }

    public final void forceNextSnapshot() {
        this.f14081f = true;
    }

    public final int getMaxStoredCharacters() {
        return this.f14076a;
    }

    public final void makeSnapshot(@NotNull TextFieldValue value) {
        TextFieldValue textFieldValue;
        String str;
        TextFieldValue m61048b;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f14081f = false;
        C3027a c3027a = this.f14077b;
        if (c3027a != null) {
            textFieldValue = c3027a.m61048b();
        } else {
            textFieldValue = null;
        }
        if (Intrinsics.areEqual(value, textFieldValue)) {
            return;
        }
        String text = value.getText();
        C3027a c3027a2 = this.f14077b;
        if (c3027a2 != null && (m61048b = c3027a2.m61048b()) != null) {
            str = m61048b.getText();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(text, str)) {
            C3027a c3027a3 = this.f14077b;
            if (c3027a3 != null) {
                c3027a3.m61046d(value);
                return;
            }
            return;
        }
        this.f14077b = new C3027a(this.f14077b, value);
        this.f14078c = null;
        int length = this.f14079d + value.getText().length();
        this.f14079d = length;
        if (length > this.f14076a) {
            m61050a();
        }
    }

    @Nullable
    public final TextFieldValue redo() {
        C3027a c3027a = this.f14078c;
        if (c3027a != null) {
            this.f14078c = c3027a.m61049a();
            this.f14077b = new C3027a(this.f14077b, c3027a.m61048b());
            this.f14079d += c3027a.m61048b().getText().length();
            return c3027a.m61048b();
        }
        return null;
    }

    public final void snapshotIfNeeded(@NotNull TextFieldValue value, long j) {
        long j2;
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.f14081f) {
            Long l = this.f14080e;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            if (j <= j2 + UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.f14080e = Long.valueOf(j);
        makeSnapshot(value);
    }

    @Nullable
    public final TextFieldValue undo() {
        C3027a m61049a;
        C3027a c3027a = this.f14077b;
        if (c3027a == null || (m61049a = c3027a.m61049a()) == null) {
            return null;
        }
        this.f14077b = m61049a;
        this.f14079d -= c3027a.m61048b().getText().length();
        this.f14078c = new C3027a(this.f14078c, c3027a.m61048b());
        return m61049a.m61048b();
    }

    public UndoManager(int i) {
        this.f14076a = i;
    }

    public /* synthetic */ UndoManager(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength : i);
    }
}
