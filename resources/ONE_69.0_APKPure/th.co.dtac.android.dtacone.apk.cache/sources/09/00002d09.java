package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.State;
import kotlin.Metadata;

/* loaded from: classes.dex */
public final class TextFieldTransitionScope {

    /* renamed from: a */
    public static final TextFieldTransitionScope f14793a = new TextFieldTransitionScope();

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: b */
    public static final float m60713b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: c */
    public static final float m60712c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: d */
    public static final long m60711d(State state) {
        return ((Color) state.getValue()).m71929unboximpl();
    }

    /* renamed from: e */
    public static final long m60710e(State state) {
        return ((Color) state.getValue()).m71929unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fa, code lost:
        if (r32 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
        if (r32 != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ac  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60714a(androidx.compose.material.InputPhase r26, long r27, long r29, kotlin.jvm.functions.Function3 r31, boolean r32, kotlin.jvm.functions.Function6 r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m60714a(androidx.compose.material.InputPhase, long, long, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function6, androidx.compose.runtime.Composer, int):void");
    }
}