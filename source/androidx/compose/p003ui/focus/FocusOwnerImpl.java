package androidx.compose.p003ui.focus;

import android.view.KeyEvent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p003ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p003ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p003ui.node.DelegatableNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020%H\u0016¢\u0006\u0004\b#\u0010&J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020'H\u0016¢\u0006\u0004\b#\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u0004\u0018\u00010-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010\u0014R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010$R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00107R\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010@\u001a\u00020?8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "takeFocus", "()V", "releaseFocus", "", "force", "clearFocus", "(Z)V", "refreshFocusEvents", "(ZZ)V", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "moveFocus-3ESFkO8", "(I)Z", "moveFocus", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "dispatchKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "Landroidx/compose/ui/geometry/Rect;", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "rootFocusNode", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/Modifier;", OperatorName.CURVE_TO, "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,290:1\n244#1:361\n245#1:433\n246#1:440\n247#1:487\n248#1:534\n249#1:541\n244#1:612\n245#1:684\n246#1:691\n247#1:738\n248#1:785\n249#1:792\n244#1:863\n245#1:935\n246#1:942\n247#1:989\n248#1:1036\n249#1:1043\n96#2:291\n96#2:360\n104#2:542\n104#2:611\n98#2:793\n98#2:862\n90#2,7:1213\n90#2:1229\n262#3:292\n230#3,5:293\n58#3:298\n59#3,8:300\n383#3,5:308\n263#3:313\n388#3:314\n393#3,2:316\n395#3,8:321\n403#3,9:332\n412#3,8:344\n68#3,7:352\n265#3:359\n253#3,2:362\n230#3,5:364\n58#3:369\n59#3,8:371\n383#3,5:379\n255#3,3:384\n388#3:387\n393#3,2:389\n395#3,8:394\n403#3,9:405\n412#3,8:417\n68#3,7:425\n258#3:432\n383#3,12:441\n395#3,8:456\n403#3,9:467\n412#3,8:479\n383#3,12:488\n395#3,8:503\n403#3,9:514\n412#3,8:526\n262#3:543\n230#3,5:544\n58#3:549\n59#3,8:551\n383#3,5:559\n263#3:564\n388#3:565\n393#3,2:567\n395#3,8:572\n403#3,9:583\n412#3,8:595\n68#3,7:603\n265#3:610\n253#3,2:613\n230#3,5:615\n58#3:620\n59#3,8:622\n383#3,5:630\n255#3,3:635\n388#3:638\n393#3,2:640\n395#3,8:645\n403#3,9:656\n412#3,8:668\n68#3,7:676\n258#3:683\n383#3,12:692\n395#3,8:707\n403#3,9:718\n412#3,8:730\n383#3,12:739\n395#3,8:754\n403#3,9:765\n412#3,8:777\n262#3:794\n230#3,5:795\n58#3:800\n59#3,8:802\n383#3,5:810\n263#3:815\n388#3:816\n393#3,2:818\n395#3,8:823\n403#3,9:834\n412#3,8:846\n68#3,7:854\n265#3:861\n253#3,2:864\n230#3,5:866\n58#3:871\n59#3,8:873\n383#3,5:881\n255#3,3:886\n388#3:889\n393#3,2:891\n395#3,8:896\n403#3,9:907\n412#3,8:919\n68#3,7:927\n258#3:934\n383#3,12:943\n395#3,8:958\n403#3,9:969\n412#3,8:981\n383#3,12:990\n395#3,8:1005\n403#3,9:1016\n412#3,8:1028\n253#3,2:1044\n230#3,5:1046\n58#3:1051\n59#3,8:1053\n383#3,5:1061\n255#3,3:1066\n388#3:1069\n393#3,2:1071\n395#3,8:1076\n403#3,9:1087\n412#3,8:1099\n68#3,7:1107\n258#3:1114\n383#3,6:1121\n393#3,2:1128\n395#3,8:1133\n403#3,9:1144\n412#3,8:1156\n383#3,6:1164\n393#3,2:1171\n395#3,8:1176\n403#3,9:1187\n412#3,8:1199\n190#3:1221\n191#3,6:1223\n198#3,3:1231\n1#4:299\n1#4:370\n1#4:550\n1#4:621\n1#4:801\n1#4:872\n1#4:1052\n1#4:1222\n261#5:315\n261#5:388\n261#5:566\n261#5:639\n261#5:817\n261#5:890\n261#5:1070\n261#5:1127\n261#5:1170\n261#5:1230\n234#6,3:318\n237#6,3:341\n234#6,3:391\n237#6,3:414\n234#6,3:453\n237#6,3:476\n234#6,3:500\n237#6,3:523\n234#6,3:569\n237#6,3:592\n234#6,3:642\n237#6,3:665\n234#6,3:704\n237#6,3:727\n234#6,3:751\n237#6,3:774\n234#6,3:820\n237#6,3:843\n234#6,3:893\n237#6,3:916\n234#6,3:955\n237#6,3:978\n234#6,3:1002\n237#6,3:1025\n234#6,3:1073\n237#6,3:1096\n234#6,3:1130\n237#6,3:1153\n234#6,3:1173\n237#6,3:1196\n1182#7:329\n1161#7,2:330\n1182#7:402\n1161#7,2:403\n1182#7:464\n1161#7,2:465\n1182#7:511\n1161#7,2:512\n1182#7:580\n1161#7,2:581\n1182#7:653\n1161#7,2:654\n1182#7:715\n1161#7,2:716\n1182#7:762\n1161#7,2:763\n1182#7:831\n1161#7,2:832\n1182#7:904\n1161#7,2:905\n1182#7:966\n1161#7,2:967\n1182#7:1013\n1161#7,2:1014\n1182#7:1084\n1161#7,2:1085\n1182#7:1141\n1161#7,2:1142\n1182#7:1184\n1161#7,2:1185\n51#8,6:434\n33#8,6:535\n51#8,6:685\n33#8,6:786\n51#8,6:936\n33#8,6:1037\n51#8,6:1115\n33#8,6:1207\n47#9:1220\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n190#1:361\n190#1:433\n190#1:440\n190#1:487\n190#1:534\n190#1:541\n203#1:612\n203#1:684\n203#1:691\n203#1:738\n203#1:785\n203#1:792\n218#1:863\n218#1:935\n218#1:942\n218#1:989\n218#1:1036\n218#1:1043\n188#1:291\n191#1:360\n201#1:542\n204#1:611\n216#1:793\n219#1:862\n260#1:1213,7\n261#1:1229\n188#1:292\n188#1:293,5\n188#1:298\n188#1:300,8\n188#1:308,5\n188#1:313\n188#1:314\n188#1:316,2\n188#1:321,8\n188#1:332,9\n188#1:344,8\n188#1:352,7\n188#1:359\n190#1:362,2\n190#1:364,5\n190#1:369\n190#1:371,8\n190#1:379,5\n190#1:384,3\n190#1:387\n190#1:389,2\n190#1:394,8\n190#1:405,9\n190#1:417,8\n190#1:425,7\n190#1:432\n190#1:441,12\n190#1:456,8\n190#1:467,9\n190#1:479,8\n190#1:488,12\n190#1:503,8\n190#1:514,9\n190#1:526,8\n201#1:543\n201#1:544,5\n201#1:549\n201#1:551,8\n201#1:559,5\n201#1:564\n201#1:565\n201#1:567,2\n201#1:572,8\n201#1:583,9\n201#1:595,8\n201#1:603,7\n201#1:610\n203#1:613,2\n203#1:615,5\n203#1:620\n203#1:622,8\n203#1:630,5\n203#1:635,3\n203#1:638\n203#1:640,2\n203#1:645,8\n203#1:656,9\n203#1:668,8\n203#1:676,7\n203#1:683\n203#1:692,12\n203#1:707,8\n203#1:718,9\n203#1:730,8\n203#1:739,12\n203#1:754,8\n203#1:765,9\n203#1:777,8\n216#1:794\n216#1:795,5\n216#1:800\n216#1:802,8\n216#1:810,5\n216#1:815\n216#1:816\n216#1:818,2\n216#1:823,8\n216#1:834,9\n216#1:846,8\n216#1:854,7\n216#1:861\n218#1:864,2\n218#1:866,5\n218#1:871\n218#1:873,8\n218#1:881,5\n218#1:886,3\n218#1:889\n218#1:891,2\n218#1:896,8\n218#1:907,9\n218#1:919,8\n218#1:927,7\n218#1:934\n218#1:943,12\n218#1:958,8\n218#1:969,9\n218#1:981,8\n218#1:990,12\n218#1:1005,8\n218#1:1016,9\n218#1:1028,8\n244#1:1044,2\n244#1:1046,5\n244#1:1051\n244#1:1053,8\n244#1:1061,5\n244#1:1066,3\n244#1:1069\n244#1:1071,2\n244#1:1076,8\n244#1:1087,9\n244#1:1099,8\n244#1:1107,7\n244#1:1114\n246#1:1121,6\n246#1:1128,2\n246#1:1133,8\n246#1:1144,9\n246#1:1156,8\n247#1:1164,6\n247#1:1171,2\n247#1:1176,8\n247#1:1187,9\n247#1:1199,8\n260#1:1221\n260#1:1223,6\n260#1:1231,3\n188#1:299\n190#1:370\n201#1:550\n203#1:621\n216#1:801\n218#1:872\n244#1:1052\n260#1:1222\n188#1:315\n190#1:388\n201#1:566\n203#1:639\n216#1:817\n218#1:890\n244#1:1070\n246#1:1127\n247#1:1170\n261#1:1230\n188#1:318,3\n188#1:341,3\n190#1:391,3\n190#1:414,3\n190#1:453,3\n190#1:476,3\n190#1:500,3\n190#1:523,3\n201#1:569,3\n201#1:592,3\n203#1:642,3\n203#1:665,3\n203#1:704,3\n203#1:727,3\n203#1:751,3\n203#1:774,3\n216#1:820,3\n216#1:843,3\n218#1:893,3\n218#1:916,3\n218#1:955,3\n218#1:978,3\n218#1:1002,3\n218#1:1025,3\n244#1:1073,3\n244#1:1096,3\n246#1:1130,3\n246#1:1153,3\n247#1:1173,3\n247#1:1196,3\n188#1:329\n188#1:330,2\n190#1:402\n190#1:403,2\n190#1:464\n190#1:465,2\n190#1:511\n190#1:512,2\n201#1:580\n201#1:581,2\n203#1:653\n203#1:654,2\n203#1:715\n203#1:716,2\n203#1:762\n203#1:763,2\n216#1:831\n216#1:832,2\n218#1:904\n218#1:905,2\n218#1:966\n218#1:967,2\n218#1:1013\n218#1:1014,2\n244#1:1084\n244#1:1085,2\n246#1:1141\n246#1:1142,2\n247#1:1184\n247#1:1185,2\n190#1:434,6\n190#1:535,6\n203#1:685,6\n203#1:786,6\n218#1:936,6\n218#1:1037,6\n245#1:1115,6\n248#1:1207,6\n260#1:1220\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl */
/* loaded from: classes2.dex */
public final class FocusOwnerImpl implements FocusOwner {

    /* renamed from: a */
    public FocusTargetNode f28918a;

    /* renamed from: b */
    public final FocusInvalidationManager f28919b;

    /* renamed from: c */
    public final Modifier f28920c;
    public LayoutDirection layoutDirection;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FocusOwnerImpl(@NotNull Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.f28918a = new FocusTargetNode();
        this.f28919b = new FocusInvalidationManager(onRequestApplyChangesListener);
        this.f28920c = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public boolean equals(@Nullable Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public int hashCode() {
                return FocusOwnerImpl.this.getRootFocusNode$ui_release().hashCode();
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
                inspectorInfo.setName("RootFocusTarget");
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public void update(@NotNull FocusTargetNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            @NotNull
            public FocusTargetNode create() {
                return FocusOwnerImpl.this.getRootFocusNode$ui_release();
            }
        };
    }

    /* renamed from: a */
    public final Modifier.Node m59826a(DelegatableNode delegatableNode) {
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024) | NodeKind.m72961constructorimpl(8192);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            Modifier.Node node2 = null;
            if ((node.getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                        if ((NodeKind.m72961constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                            return node2;
                        }
                        node2 = child$ui_release;
                    }
                }
            }
            return node2;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: b */
    public final boolean m59825b(int i) {
        boolean m71432equalsimpl0;
        if (this.f28918a.getFocusState().getHasFocus() && !this.f28918a.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m71432equalsimpl0(i, companion.m71445getNextdhqQ8s())) {
                m71432equalsimpl0 = true;
            } else {
                m71432equalsimpl0 = FocusDirection.m71432equalsimpl0(i, companion.m71447getPreviousdhqQ8s());
            }
            if (m71432equalsimpl0) {
                clearFocus(false);
                if (!this.f28918a.getFocusState().isFocused()) {
                    return false;
                }
                return mo71450moveFocus3ESFkO8(i);
            }
        }
        return false;
    }

    @Override // androidx.compose.p003ui.focus.FocusManager
    public void clearFocus(boolean z) {
        clearFocus(z, true);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo71451dispatchInterceptedSoftKeyboardEventZmokQxo(@NotNull KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int i;
        NodeChain nodes$ui_release;
        Modifier.Node node;
        NodeChain nodes$ui_release2;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.f28918a);
        if (findActiveFocusNode != null) {
            int m72961constructorimpl = NodeKind.m72961constructorimpl(131072);
            if (findActiveFocusNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                loop0: while (true) {
                    if (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    node = parent$ui_release;
                                    while (node != null) {
                                        if (node instanceof SoftKeyboardInterceptionModifierNode) {
                                            break loop0;
                                        }
                                        if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                            int i2 = 0;
                                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        node = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector.add(node);
                                                            node = null;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        node = DelegatableNodeKt.m59509b(mutableVector);
                                    }
                                    continue;
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release2.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    } else {
                        node = null;
                        break;
                    }
                }
                softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) node;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int m72961constructorimpl2 = NodeKind.m72961constructorimpl(131072);
            if (softKeyboardInterceptionModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release2 = softKeyboardInterceptionModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
                ArrayList arrayList = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                Modifier.Node node2 = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node2 != null) {
                                    if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node2);
                                    } else if ((node2.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    node2 = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node2 != null) {
                                                        mutableVector2.add(node2);
                                                        node2 = null;
                                                    }
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    node2 = DelegatableNodeKt.m59509b(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                        parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release2 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = i - 1;
                        if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i)).mo69183onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        i = i4;
                    }
                }
                Modifier.Node node3 = softKeyboardInterceptionModifierNode.getNode();
                MutableVector mutableVector3 = null;
                while (node3 != null) {
                    if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                        if (((SoftKeyboardInterceptionModifierNode) node3).mo69183onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node3.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        int i5 = 0;
                        for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node3 = delegate$ui_release3;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != null) {
                                        mutableVector3.add(node3);
                                        node3 = null;
                                    }
                                    mutableVector3.add(delegate$ui_release3);
                                }
                            }
                        }
                        if (i5 == 1) {
                        }
                    }
                    node3 = DelegatableNodeKt.m59509b(mutableVector3);
                }
                Modifier.Node node4 = softKeyboardInterceptionModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node4 != null) {
                    if (node4 instanceof SoftKeyboardInterceptionModifierNode) {
                        if (((SoftKeyboardInterceptionModifierNode) node4).mo69182onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node4.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                        int i6 = 0;
                        for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                            if ((delegate$ui_release4.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node4 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node4 != null) {
                                        mutableVector4.add(node4);
                                        node4 = null;
                                    }
                                    mutableVector4.add(delegate$ui_release4);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    node4 = DelegatableNodeKt.m59509b(mutableVector4);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i7)).mo69182onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo71452dispatchKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        int i;
        NodeChain nodes$ui_release;
        Modifier.Node node;
        NodeChain nodes$ui_release2;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.f28918a);
        if (findActiveFocusNode != null) {
            Modifier.Node m59826a = m59826a(findActiveFocusNode);
            if (m59826a == null) {
                int m72961constructorimpl = NodeKind.m72961constructorimpl(8192);
                if (findActiveFocusNode.getNode().isAttached()) {
                    Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                    loop0: while (true) {
                        if (requireLayoutNode != null) {
                            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                        MutableVector mutableVector = null;
                                        node = parent$ui_release;
                                        while (node != null) {
                                            if (node instanceof KeyInputModifierNode) {
                                                break loop0;
                                            }
                                            if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                                int i2 = 0;
                                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                    if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            node = delegate$ui_release;
                                                        } else {
                                                            if (mutableVector == null) {
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (node != null) {
                                                                mutableVector.add(node);
                                                                node = null;
                                                            }
                                                            mutableVector.add(delegate$ui_release);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                }
                                            }
                                            node = DelegatableNodeKt.m59509b(mutableVector);
                                        }
                                        continue;
                                    }
                                    parent$ui_release = parent$ui_release.getParent$ui_release();
                                }
                            }
                            requireLayoutNode = requireLayoutNode.getParent$ui_release();
                            if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                                parent$ui_release = nodes$ui_release2.getTail$ui_release();
                            } else {
                                parent$ui_release = null;
                            }
                        } else {
                            node = null;
                            break;
                        }
                    }
                    KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) node;
                    if (keyInputModifierNode != null) {
                        m59826a = keyInputModifierNode.getNode();
                    } else {
                        m59826a = null;
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            if (m59826a != null) {
                int m72961constructorimpl2 = NodeKind.m72961constructorimpl(8192);
                if (m59826a.getNode().isAttached()) {
                    Modifier.Node parent$ui_release2 = m59826a.getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(m59826a);
                    ArrayList arrayList = null;
                    while (requireLayoutNode2 != null) {
                        if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl2) != 0) {
                            while (parent$ui_release2 != null) {
                                if ((parent$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                    Modifier.Node node2 = parent$ui_release2;
                                    MutableVector mutableVector2 = null;
                                    while (node2 != null) {
                                        if (node2 instanceof KeyInputModifierNode) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(node2);
                                        } else if ((node2.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                            int i3 = 0;
                                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                if ((delegate$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        node2 = delegate$ui_release2;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node2 != null) {
                                                            mutableVector2.add(node2);
                                                            node2 = null;
                                                        }
                                                        mutableVector2.add(delegate$ui_release2);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                        node2 = DelegatableNodeKt.m59509b(mutableVector2);
                                    }
                                }
                                parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                            }
                        }
                        requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                        if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                            parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                        } else {
                            parent$ui_release2 = null;
                        }
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i4 = i - 1;
                            if (((KeyInputModifierNode) arrayList.get(i)).mo69162onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            i = i4;
                        }
                    }
                    Modifier.Node node3 = m59826a.getNode();
                    MutableVector mutableVector3 = null;
                    while (node3 != null) {
                        if (node3 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) node3).mo69162onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else if ((node3.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                            int i5 = 0;
                            for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                                if ((delegate$ui_release3.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        node3 = delegate$ui_release3;
                                    } else {
                                        if (mutableVector3 == null) {
                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node3 != null) {
                                            mutableVector3.add(node3);
                                            node3 = null;
                                        }
                                        mutableVector3.add(delegate$ui_release3);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        node3 = DelegatableNodeKt.m59509b(mutableVector3);
                    }
                    Modifier.Node node4 = m59826a.getNode();
                    MutableVector mutableVector4 = null;
                    while (node4 != null) {
                        if (node4 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) node4).mo69161onKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else if ((node4.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                            int i6 = 0;
                            for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                                if ((delegate$ui_release4.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                    i6++;
                                    if (i6 == 1) {
                                        node4 = delegate$ui_release4;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node4 != null) {
                                            mutableVector4.add(node4);
                                            node4 = null;
                                        }
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                        node4 = DelegatableNodeKt.m59509b(mutableVector4);
                    }
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            if (((KeyInputModifierNode) arrayList.get(i7)).mo69161onKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int i;
        NodeChain nodes$ui_release;
        Modifier.Node node;
        NodeChain nodes$ui_release2;
        Intrinsics.checkNotNullParameter(event, "event");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.f28918a);
        if (findActiveFocusNode != null) {
            int m72961constructorimpl = NodeKind.m72961constructorimpl(16384);
            if (findActiveFocusNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = findActiveFocusNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
                loop0: while (true) {
                    if (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    node = parent$ui_release;
                                    while (node != null) {
                                        if (node instanceof RotaryInputModifierNode) {
                                            break loop0;
                                        }
                                        if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                            int i2 = 0;
                                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        node = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector.add(node);
                                                            node = null;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        node = DelegatableNodeKt.m59509b(mutableVector);
                                    }
                                    continue;
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release2.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    } else {
                        node = null;
                        break;
                    }
                }
                rotaryInputModifierNode = (RotaryInputModifierNode) node;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int m72961constructorimpl2 = NodeKind.m72961constructorimpl(16384);
            if (rotaryInputModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release2 = rotaryInputModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
                ArrayList arrayList = null;
                while (requireLayoutNode2 != null) {
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                Modifier.Node node2 = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node2 != null) {
                                    if (node2 instanceof RotaryInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node2);
                                    } else if ((node2.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    node2 = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node2 != null) {
                                                        mutableVector2.add(node2);
                                                        node2 = null;
                                                    }
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    node2 = DelegatableNodeKt.m59509b(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                        parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release2 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = i - 1;
                        if (((RotaryInputModifierNode) arrayList.get(i)).onPreRotaryScrollEvent(event)) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        i = i4;
                    }
                }
                Modifier.Node node3 = rotaryInputModifierNode.getNode();
                MutableVector mutableVector3 = null;
                while (node3 != null) {
                    if (node3 instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) node3).onPreRotaryScrollEvent(event)) {
                            return true;
                        }
                    } else if ((node3.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        int i5 = 0;
                        for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node3 = delegate$ui_release3;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != null) {
                                        mutableVector3.add(node3);
                                        node3 = null;
                                    }
                                    mutableVector3.add(delegate$ui_release3);
                                }
                            }
                        }
                        if (i5 == 1) {
                        }
                    }
                    node3 = DelegatableNodeKt.m59509b(mutableVector3);
                }
                Modifier.Node node4 = rotaryInputModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node4 != null) {
                    if (node4 instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) node4).onRotaryScrollEvent(event)) {
                            return true;
                        }
                    } else if ((node4.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                        int i6 = 0;
                        for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                            if ((delegate$ui_release4.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node4 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node4 != null) {
                                        mutableVector4.add(node4);
                                        node4 = null;
                                    }
                                    mutableVector4.add(delegate$ui_release4);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    node4 = DelegatableNodeKt.m59509b(mutableVector4);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((RotaryInputModifierNode) arrayList.get(i7)).onRotaryScrollEvent(event)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    @Nullable
    public Rect getFocusRect() {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.f28918a);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    @NotNull
    public Modifier getModifier() {
        return this.f28920c;
    }

    @NotNull
    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.f28918a;
    }

    @Override // androidx.compose.p003ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo71450moveFocus3ESFkO8(int i) {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.f28918a);
        if (findActiveFocusNode == null) {
            return false;
        }
        FocusRequester m71461customFocusSearchOMvw8 = FocusTraversalKt.m71461customFocusSearchOMvw8(findActiveFocusNode, i, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.Companion;
        if (m71461customFocusSearchOMvw8 != companion.getDefault()) {
            if (m71461customFocusSearchOMvw8 == companion.getCancel() || !m71461customFocusSearchOMvw8.focus$ui_release()) {
                return false;
            }
            return true;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean m71462focusSearchsMXa3k8 = FocusTraversalKt.m71462focusSearchsMXa3k8(this.f28918a, i, getLayoutDirection(), new FocusOwnerImpl$moveFocus$foundNextItem$1(findActiveFocusNode, i, booleanRef));
        if (booleanRef.element) {
            return false;
        }
        if (!m71462focusSearchsMXa3k8 && !m59825b(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.f28918a, true, true);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusTargetNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f28919b.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setRootFocusNode$ui_release(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<set-?>");
        this.f28918a = focusTargetNode;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void takeFocus() {
        if (this.f28918a.getFocusState() == FocusStateImpl.Inactive) {
            this.f28918a.setFocusState(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void clearFocus(boolean z, boolean z2) {
        FocusStateImpl focusStateImpl;
        if (!z) {
            int i = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m71459performCustomClearFocusMxy_nc0(this.f28918a, FocusDirection.Companion.m71442getExitdhqQ8s()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return;
            }
        }
        FocusStateImpl focusState = this.f28918a.getFocusState();
        if (FocusTransactionsKt.clearFocus(this.f28918a, z, z2)) {
            FocusTargetNode focusTargetNode = this.f28918a;
            int i2 = WhenMappings.$EnumSwitchMapping$1[focusState.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusTargetNode.setFocusState(focusStateImpl);
        }
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f28919b.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f28919b.scheduleInvalidation(node);
    }
}
