package androidx.compose.p003ui.text.input;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.TextInputServiceAndroid;
import androidx.compose.runtime.collection.MutableVector;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001_B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013JP\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001b0\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\"J!\u0010'\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b1\u0010\"J\u000f\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u0010\"J\u0017\u00105\u001a\u00020\u001b2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010@R%\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b/\u0010@R$\u0010F\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010GR\"\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b;\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020-0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, m28850d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Landroidx/compose/ui/text/input/PlatformTextInput;", "platformTextInput", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;Landroidx/compose/ui/text/input/PlatformTextInput;Ljava/util/concurrent/Executor;)V", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/view/View;Landroidx/compose/ui/text/input/PlatformTextInput;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "stopInput", "()V", "showSoftwareKeyboard", "hideSoftwareKeyboard", "oldValue", "newValue", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "command", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;)V", OperatorName.CURVE_TO, "e", "", "visible", OperatorName.CLOSE_PATH, "(Z)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "getView", "()Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/input/InputMethodManager;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "d", "Ljava/util/concurrent/Executor;", "Lkotlin/jvm/functions/Function1;", "<set-?>", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/text/input/ImeOptions;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/Lazy;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", OperatorName.NON_STROKING_CMYK, "Landroid/graphics/Rect;", "focusedRect", "Landroidx/compose/runtime/collection/MutableVector;", OperatorName.LINE_TO, "Landroidx/compose/runtime/collection/MutableVector;", "textInputCommandQueue", "Ljava/lang/Runnable;", OperatorName.MOVE_TO, "Ljava/lang/Runnable;", "frameCallback", "TextInputCommand", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,514:1\n1182#2:515\n1161#2,2:516\n728#3,2:518\n460#3,11:521\n1#4:520\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n108#1:515\n108#1:516,2\n212#1:518,2\n289#1:521,11\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid */
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* renamed from: a */
    public final View f31445a;

    /* renamed from: b */
    public final InputMethodManager f31446b;

    /* renamed from: c */
    public final PlatformTextInput f31447c;

    /* renamed from: d */
    public final Executor f31448d;

    /* renamed from: e */
    public Function1 f31449e;

    /* renamed from: f */
    public Function1 f31450f;

    /* renamed from: g */
    public TextFieldValue f31451g;

    /* renamed from: h */
    public ImeOptions f31452h;

    /* renamed from: i */
    public List f31453i;

    /* renamed from: j */
    public final Lazy f31454j;

    /* renamed from: k */
    public Rect f31455k;

    /* renamed from: l */
    public final MutableVector f31456l;

    /* renamed from: m */
    public Runnable f31457m;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand */
    /* loaded from: classes2.dex */
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(@NotNull View view, @NotNull InputMethodManager inputMethodManager, @Nullable PlatformTextInput platformTextInput, @NotNull Executor inputCommandProcessorExecutor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        Intrinsics.checkNotNullParameter(inputCommandProcessorExecutor, "inputCommandProcessorExecutor");
        this.f31445a = view;
        this.f31446b = inputMethodManager;
        this.f31447c = platformTextInput;
        this.f31448d = inputCommandProcessorExecutor;
        this.f31449e = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.f31450f = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.f31451g = new TextFieldValue("", TextRange.Companion.m73221getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.f31452h = ImeOptions.Companion.getDefault();
        this.f31453i = new ArrayList();
        this.f31454j = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new TextInputServiceAndroid$baseInputConnection$2(this));
        this.f31456l = new MutableVector(new TextInputCommand[16], 0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m59015a(TextInputServiceAndroid textInputServiceAndroid) {
        m59009g(textInputServiceAndroid);
    }

    public static final /* synthetic */ BaseInputConnection access$getBaseInputConnection(TextInputServiceAndroid textInputServiceAndroid) {
        return textInputServiceAndroid.m59014b();
    }

    public static final /* synthetic */ List access$getIcs$p(TextInputServiceAndroid textInputServiceAndroid) {
        return textInputServiceAndroid.f31453i;
    }

    public static final /* synthetic */ Function1 access$getOnEditCommand$p(TextInputServiceAndroid textInputServiceAndroid) {
        return textInputServiceAndroid.f31449e;
    }

    public static final /* synthetic */ Function1 access$getOnImeActionPerformed$p(TextInputServiceAndroid textInputServiceAndroid) {
        return textInputServiceAndroid.f31450f;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    /* renamed from: d */
    public static final void m59012d(TextInputCommand textInputCommand, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        int i = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if ((i == 3 || i == 4) && !Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
                    if (textInputCommand != TextInputCommand.ShowKeyboard) {
                        z = false;
                    }
                    objectRef2.element = Boolean.valueOf(z);
                    return;
                }
                return;
            }
            ?? r3 = Boolean.FALSE;
            objectRef.element = r3;
            objectRef2.element = r3;
            return;
        }
        ?? r32 = Boolean.TRUE;
        objectRef.element = r32;
        objectRef2.element = r32;
    }

    /* renamed from: g */
    public static final void m59009g(TextInputServiceAndroid this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f31457m = null;
        this$0.m59013c();
    }

    /* renamed from: b */
    public final BaseInputConnection m59014b() {
        return (BaseInputConnection) this.f31454j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m59013c() {
        /*
            r6 = this;
            android.view.View r0 = r6.f31445a
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto Le
            androidx.compose.runtime.collection.MutableVector r0 = r6.f31456l
            r0.clear()
            return
        Le:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.compose.runtime.collection.MutableVector r2 = r6.f31456l
            int r3 = r2.getSize()
            if (r3 <= 0) goto L30
            java.lang.Object[] r2 = r2.getContent()
            r4 = 0
        L25:
            r5 = r2[r4]
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r5 = (androidx.compose.p003ui.text.input.TextInputServiceAndroid.TextInputCommand) r5
            m59012d(r5, r0, r1)
            int r4 = r4 + 1
            if (r4 < r3) goto L25
        L30:
            T r2 = r0.element
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L3d
            r6.m59011e()
        L3d:
            T r1 = r1.element
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L4a
            boolean r1 = r1.booleanValue()
            r6.m59008h(r1)
        L4a:
            T r0 = r0.element
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L57
            r6.m59011e()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.input.TextInputServiceAndroid.m59013c():void");
    }

    @NotNull
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        TextInputServiceAndroid_androidKt.update(outAttrs, this.f31452h, this.f31451g);
        TextInputServiceAndroid_androidKt.m59002f(outAttrs);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.f31451g, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.p003ui.text.input.InputEventCallback2
            public void onConnectionClosed(@NotNull RecordingInputConnection ic) {
                Intrinsics.checkNotNullParameter(ic, "ic");
                int size = TextInputServiceAndroid.access$getIcs$p(TextInputServiceAndroid.this).size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.areEqual(((WeakReference) TextInputServiceAndroid.access$getIcs$p(TextInputServiceAndroid.this).get(i)).get(), ic)) {
                        TextInputServiceAndroid.access$getIcs$p(TextInputServiceAndroid.this).remove(i);
                        return;
                    }
                }
            }

            @Override // androidx.compose.p003ui.text.input.InputEventCallback2
            public void onEditCommands(@NotNull List<? extends EditCommand> editCommands) {
                Intrinsics.checkNotNullParameter(editCommands, "editCommands");
                TextInputServiceAndroid.access$getOnEditCommand$p(TextInputServiceAndroid.this).invoke(editCommands);
            }

            @Override // androidx.compose.p003ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo73379onImeActionKlQnJC8(int i) {
                TextInputServiceAndroid.access$getOnImeActionPerformed$p(TextInputServiceAndroid.this).invoke(ImeAction.m73350boximpl(i));
            }

            @Override // androidx.compose.p003ui.text.input.InputEventCallback2
            public void onKeyEvent(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                TextInputServiceAndroid.access$getBaseInputConnection(TextInputServiceAndroid.this).sendKeyEvent(event);
            }
        }, this.f31452h.getAutoCorrect());
        this.f31453i.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }

    /* renamed from: e */
    public final void m59011e() {
        this.f31446b.restartInput();
    }

    /* renamed from: f */
    public final void m59010f(TextInputCommand textInputCommand) {
        this.f31456l.add(textInputCommand);
        if (this.f31457m == null) {
            Runnable runnable = new Runnable() { // from class: jS1
                {
                    TextInputServiceAndroid.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.m59015a(TextInputServiceAndroid.this);
                }
            };
            this.f31448d.execute(runnable);
            this.f31457m = runnable;
        }
    }

    @NotNull
    public final TextFieldValue getState$ui_release() {
        return this.f31451g;
    }

    @NotNull
    public final View getView() {
        return this.f31445a;
    }

    /* renamed from: h */
    public final void m59008h(boolean z) {
        if (z) {
            this.f31446b.showSoftInput();
        } else {
            this.f31446b.hideSoftInput();
        }
    }

    @Override // androidx.compose.p003ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        m59010f(TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.p003ui.text.input.PlatformTextInputService
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(@NotNull androidx.compose.p003ui.geometry.Rect rect) {
        Rect rect2;
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f31455k = new Rect(AbstractC21140mr0.roundToInt(rect.getLeft()), AbstractC21140mr0.roundToInt(rect.getTop()), AbstractC21140mr0.roundToInt(rect.getRight()), AbstractC21140mr0.roundToInt(rect.getBottom()));
        if (this.f31453i.isEmpty() && (rect2 = this.f31455k) != null) {
            this.f31445a.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // androidx.compose.p003ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        m59010f(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.p003ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> onEditCommand, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        PlatformTextInput platformTextInput = this.f31447c;
        if (platformTextInput != null) {
            platformTextInput.requestInputFocus();
        }
        this.f31451g = value;
        this.f31452h = imeOptions;
        this.f31449e = onEditCommand;
        this.f31450f = onImeActionPerformed;
        m59010f(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.p003ui.text.input.PlatformTextInputService
    public void stopInput() {
        PlatformTextInput platformTextInput = this.f31447c;
        if (platformTextInput != null) {
            platformTextInput.releaseInputFocus();
        }
        this.f31449e = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.f31450f = TextInputServiceAndroid$stopInput$2.INSTANCE;
        this.f31455k = null;
        m59010f(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.p003ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue textFieldValue, @NotNull TextFieldValue newValue) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (TextRange.m73209equalsimpl0(this.f31451g.m73425getSelectiond9O1mEE(), newValue.m73425getSelectiond9O1mEE()) && Intrinsics.areEqual(this.f31451g.m73424getCompositionMzsxiRA(), newValue.m73424getCompositionMzsxiRA())) {
            z = false;
        } else {
            z = true;
        }
        this.f31451g = newValue;
        int size = this.f31453i.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.f31453i.get(i2)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(newValue);
            }
        }
        if (Intrinsics.areEqual(textFieldValue, newValue)) {
            if (z) {
                InputMethodManager inputMethodManager = this.f31446b;
                int m73214getMinimpl = TextRange.m73214getMinimpl(newValue.m73425getSelectiond9O1mEE());
                int m73213getMaximpl = TextRange.m73213getMaximpl(newValue.m73425getSelectiond9O1mEE());
                TextRange m73424getCompositionMzsxiRA = this.f31451g.m73424getCompositionMzsxiRA();
                int i3 = -1;
                if (m73424getCompositionMzsxiRA != null) {
                    i = TextRange.m73214getMinimpl(m73424getCompositionMzsxiRA.m73220unboximpl());
                } else {
                    i = -1;
                }
                TextRange m73424getCompositionMzsxiRA2 = this.f31451g.m73424getCompositionMzsxiRA();
                if (m73424getCompositionMzsxiRA2 != null) {
                    i3 = TextRange.m73213getMaximpl(m73424getCompositionMzsxiRA2.m73220unboximpl());
                }
                inputMethodManager.updateSelection(m73214getMinimpl, m73213getMaximpl, i, i3);
            }
        } else if (textFieldValue != null && (!Intrinsics.areEqual(textFieldValue.getText(), newValue.getText()) || (TextRange.m73209equalsimpl0(textFieldValue.m73425getSelectiond9O1mEE(), newValue.m73425getSelectiond9O1mEE()) && !Intrinsics.areEqual(textFieldValue.m73424getCompositionMzsxiRA(), newValue.m73424getCompositionMzsxiRA())))) {
            m59011e();
        } else {
            int size2 = this.f31453i.size();
            for (int i4 = 0; i4 < size2; i4++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.f31453i.get(i4)).get();
                if (recordingInputConnection2 != null) {
                    recordingInputConnection2.updateInputState(this.f31451g, this.f31446b);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextInputServiceAndroid(android.view.View r1, androidx.compose.p003ui.text.input.InputMethodManager r2, androidx.compose.p003ui.text.input.PlatformTextInput r3, java.util.concurrent.Executor r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L11
            android.view.Choreographer r4 = android.view.Choreographer.getInstance()
            java.lang.String r5 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.concurrent.Executor r4 = androidx.compose.p003ui.text.input.TextInputServiceAndroid_androidKt.asExecutor(r4)
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.input.TextInputServiceAndroid.<init>(android.view.View, androidx.compose.ui.text.input.InputMethodManager, androidx.compose.ui.text.input.PlatformTextInput, java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextInputServiceAndroid(android.view.View r1, androidx.compose.p003ui.text.input.InputMethodManager r2, java.util.concurrent.Executor r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L11
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            java.lang.String r4 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.concurrent.Executor r3 = androidx.compose.p003ui.text.input.TextInputServiceAndroid_androidKt.asExecutor(r3)
        L11:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.input.TextInputServiceAndroid.<init>(android.view.View, androidx.compose.ui.text.input.InputMethodManager, java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(@NotNull View view, @NotNull InputMethodManager inputMethodManager, @NotNull Executor inputCommandProcessorExecutor) {
        this(view, inputMethodManager, (PlatformTextInput) null, inputCommandProcessorExecutor);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        Intrinsics.checkNotNullParameter(inputCommandProcessorExecutor, "inputCommandProcessorExecutor");
    }

    public /* synthetic */ TextInputServiceAndroid(View view, PlatformTextInput platformTextInput, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? null : platformTextInput);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(@NotNull View view, @Nullable PlatformTextInput platformTextInput) {
        this(view, new InputMethodManagerImpl(view), platformTextInput, null, 8, null);
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
