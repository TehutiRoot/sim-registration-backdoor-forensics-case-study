package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Stable
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "<init>", "()V", "", "requestFocus", "", "focus$ui_release", "()Z", "focus", "captureFocus", "freeFocus", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/collection/MutableVector;", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "focusRequesterNodes", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,211:1\n196#1:215\n197#1,4:217\n201#1:228\n202#1,5:258\n207#1:304\n208#1:309\n1182#2:212\n1161#2,2:213\n1182#2:233\n1161#2,2:234\n1182#2:345\n1161#2,2:346\n1#3:216\n1#3:310\n1#3:343\n460#4,7:221\n48#4:243\n467#4,4:305\n460#4,11:311\n460#4,11:322\n460#4,7:333\n48#4:355\n467#4,4:411\n90#5:229\n90#5:340\n276#6:230\n133#6,2:231\n135#6,7:236\n142#6,9:244\n383#6,5:253\n388#6:263\n393#6,2:265\n395#6,17:270\n412#6,8:290\n151#6,6:298\n276#6:341\n133#6:342\n134#6:344\n135#6,7:348\n142#6,9:356\n383#6,6:365\n393#6,2:372\n395#6,17:377\n412#6,8:397\n151#6,6:405\n261#7:264\n261#7:371\n234#8,3:267\n237#8,3:287\n234#8,3:374\n237#8,3:394\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n69#1:215\n69#1:217,4\n69#1:228\n69#1:258,5\n69#1:304\n69#1:309\n53#1:212\n53#1:213,2\n69#1:233\n69#1:234,2\n201#1:345\n201#1:346,2\n69#1:216\n201#1:343\n69#1:221,7\n69#1:243\n69#1:305,4\n98#1:311,11\n122#1:322,11\n200#1:333,7\n201#1:355\n200#1:411,4\n69#1:229\n201#1:340\n69#1:230\n69#1:231,2\n69#1:236,7\n69#1:244,9\n69#1:253,5\n69#1:263\n69#1:265,2\n69#1:270,17\n69#1:290,8\n69#1:298,6\n201#1:341\n201#1:342\n201#1:344\n201#1:348,7\n201#1:356,9\n201#1:365,6\n201#1:372,2\n201#1:377,17\n201#1:397,8\n201#1:405,6\n69#1:264\n201#1:371\n69#1:267,3\n69#1:287,3\n201#1:374,3\n201#1:394,3\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusRequester */
/* loaded from: classes2.dex */
public final class FocusRequester {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final FocusRequester f28934b = new FocusRequester();

    /* renamed from: c */
    public static final FocusRequester f28935c = new FocusRequester();

    /* renamed from: a */
    public final MutableVector f28936a = new MutableVector(new FocusRequesterModifierNode[16], 0);

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "()V", "Cancel", "Landroidx/compose/ui/focus/FocusRequester;", "getCancel$annotations", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", Constant.OnePostpaidVerifyKey.Default, "getDefault", "createRefs", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "FocusRequesterFactory", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusRequester$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "()V", "component1", "Landroidx/compose/ui/focus/FocusRequester;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        @ExperimentalComposeUiApi
        /* renamed from: androidx.compose.ui.focus.FocusRequester$Companion$FocusRequesterFactory */
        /* loaded from: classes2.dex */
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            @NotNull
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            @NotNull
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCancel$annotations() {
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequester getCancel() {
            return FocusRequester.f28935c;
        }

        @NotNull
        public final FocusRequester getDefault() {
            return FocusRequester.f28934b;
        }

        public Companion() {
        }
    }

    public final boolean captureFocus() {
        if (this.f28936a.isNotEmpty()) {
            MutableVector mutableVector = this.f28936a;
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i = 0;
            while (!FocusRequesterModifierNodeKt.captureFocus((FocusRequesterModifierNode) content[i])) {
                i++;
                if (i >= size) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0059, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean focus$ui_release() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.focus.FocusRequester.focus$ui_release():boolean");
    }

    public final boolean freeFocus() {
        if (this.f28936a.isNotEmpty()) {
            MutableVector mutableVector = this.f28936a;
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i = 0;
            while (!FocusRequesterModifierNodeKt.freeFocus((FocusRequesterModifierNode) content[i])) {
                i++;
                if (i >= size) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    @NotNull
    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.f28936a;
    }

    public final void requestFocus() {
        focus$ui_release();
    }
}
