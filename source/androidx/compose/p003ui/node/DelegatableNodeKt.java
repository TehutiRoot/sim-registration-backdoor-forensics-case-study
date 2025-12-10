package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a=\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000e\u001a3\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u001a3\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000e\u001a3\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aG\u0010\u0015\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001aG\u0010\u0016\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u000e\u001aQ\u0010\t\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\n\u001aS\u0010 \u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a8\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010#\u001a6\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0017\u0018\u0001*\u00020%*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b&\u0010'\u001aG\u0010\r\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u0010\u000e\u001aG\u0010\u0013\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b)\u0010\u000e\u001aG\u0010+\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010\u000e\u001aG\u0010\u0014\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010\u000e\u001a%\u0010/\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b-\u0010.\u001a%\u00104\u001a\u000201*\u00020\u00002\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u00020\u0000H\u0000¢\u0006\u0004\b6\u00107\u001a\u0013\u00109\u001a\u000208*\u00020\u0000H\u0000¢\u0006\u0004\b9\u0010:\u001a\u0011\u0010<\u001a\u00020;*\u00020\u0000¢\u0006\u0004\b<\u0010=\u001a\u0011\u0010?\u001a\u00020>*\u00020\u0000¢\u0006\u0004\b?\u0010@\u001a\u0011\u0010A\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\bA\u0010B\u001a\u0015\u0010D\u001a\u0004\u0018\u00010C*\u00020\u0006H\u0000¢\u0006\u0004\bD\u0010E\u001aG\u0010H\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00062\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bF\u0010G\u001a\u001d\u0010I\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0002¢\u0006\u0004\bI\u0010J\"\u0018\u0010K\u001a\u00020\u0003*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006M"}, m28850d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "mask", "", "includeSelf", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Node;", "", "block", "visitAncestors", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "nearestAncestor", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/Modifier$Node;", "visitSubtree", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/collection/MutableVector;", "node", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V", "visitChildren", "visitSubtreeIf", "visitLocalDescendants", "visitLocalAncestors", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "visitLocalDescendants-6rFNWt0", "visitLocalAncestors-6rFNWt0", "visitAncestors-Y-YKmho", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndAncestors", "", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "ancestors", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "visitSubtree-6rFNWt0", "visitChildren-6rFNWt0", "visitSelfAndChildren-6rFNWt0", "visitSelfAndChildren", "visitSubtreeIf-6rFNWt0", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "Landroidx/compose/ui/node/LayoutNode;", "requireLayoutNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/unit/Density;", "requireDensity", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutDirection", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/LayoutDirection;", "invalidateSubtree", "(Landroidx/compose/ui/node/DelegatableNode;)V", "Landroidx/compose/ui/node/LayoutModifierNode;", "asLayoutModifierNode", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "dispatchForKind", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;", "isDelegationRoot", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,424:1\n190#1:444\n191#1,6:446\n383#1,6:452\n393#1,2:459\n395#1,8:464\n403#1,9:475\n412#1,8:487\n198#1,3:495\n206#1:498\n207#1,4:500\n383#1,6:504\n393#1,2:511\n395#1,8:516\n403#1,9:527\n412#1,8:539\n212#1,3:547\n58#1:550\n59#1,8:552\n383#1,6:560\n393#1,2:567\n395#1,8:572\n403#1,9:583\n412#1,8:595\n68#1,7:603\n58#1,9:610\n383#1,12:619\n395#1,8:634\n403#1,9:645\n412#1,8:657\n68#1,7:665\n58#1:672\n59#1,8:674\n383#1,6:684\n393#1,2:691\n395#1,8:696\n403#1,9:707\n412#1,8:719\n68#1,7:727\n230#1,5:734\n58#1:739\n59#1,8:741\n383#1,6:749\n393#1,2:756\n395#1,8:761\n403#1,9:772\n412#1,8:784\n68#1,7:792\n230#1,5:799\n58#1:804\n59#1,8:806\n383#1,6:814\n393#1,2:821\n395#1,8:826\n403#1,9:837\n412#1,8:849\n68#1,7:857\n100#1:864\n101#1,15:866\n383#1,6:881\n393#1,2:888\n395#1,8:893\n403#1,9:904\n412#1,8:916\n117#1,8:924\n133#1:932\n134#1:934\n135#1,7:938\n142#1,9:946\n383#1,6:955\n393#1,2:962\n395#1,17:967\n412#1,8:987\n151#1,6:995\n383#1,6:1001\n393#1,2:1008\n395#1,8:1013\n403#1,9:1024\n412#1,8:1036\n133#1:1044\n134#1:1046\n135#1,7:1050\n142#1,9:1058\n383#1,6:1067\n393#1,2:1074\n395#1,8:1079\n403#1,9:1090\n412#1,8:1102\n151#1,6:1110\n163#1:1116\n164#1:1118\n165#1,12:1122\n383#1,6:1134\n393#1,2:1141\n395#1,8:1146\n403#1,9:1157\n412#1,8:1169\n177#1,8:1177\n1#2:425\n1#2:445\n1#2:499\n1#2:551\n1#2:673\n1#2:740\n1#2:805\n1#2:865\n1#2:933\n1#2:1045\n1#2:1117\n492#3,11:426\n48#3:440\n48#3:945\n48#3:1057\n1182#4:437\n1161#4,2:438\n1182#4:441\n1161#4,2:442\n1182#4:472\n1161#4,2:473\n1182#4:524\n1161#4,2:525\n1182#4:580\n1161#4,2:581\n1182#4:642\n1161#4,2:643\n1182#4:704\n1161#4,2:705\n1182#4:769\n1161#4,2:770\n1182#4:834\n1161#4,2:835\n1182#4:901\n1161#4,2:902\n1182#4:935\n1161#4,2:936\n1182#4:1021\n1161#4,2:1022\n1182#4:1047\n1161#4,2:1048\n1182#4:1087\n1161#4,2:1088\n1182#4:1119\n1161#4,2:1120\n1182#4:1154\n1161#4,2:1155\n1182#4:1194\n1161#4,2:1195\n261#5:458\n261#5:510\n261#5:566\n261#5:682\n261#5:683\n261#5:690\n261#5:755\n261#5:820\n261#5:887\n261#5:961\n261#5:1007\n261#5:1073\n261#5:1140\n261#5:1186\n261#5:1188\n261#5:1189\n261#5:1193\n234#6,3:461\n237#6,3:484\n234#6,3:513\n237#6,3:536\n234#6,3:569\n237#6,3:592\n234#6,3:631\n237#6,3:654\n234#6,3:693\n237#6,3:716\n234#6,3:758\n237#6,3:781\n234#6,3:823\n237#6,3:846\n234#6,3:890\n237#6,3:913\n234#6,3:964\n237#6,3:984\n234#6,3:1010\n237#6,3:1033\n234#6,3:1076\n237#6,3:1099\n234#6,3:1143\n237#6,3:1166\n234#6,3:1190\n237#6,3:1197\n72#7:1185\n72#7:1187\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n219#1:444\n219#1:446,6\n220#1:452,6\n220#1:459,2\n220#1:464,8\n220#1:475,9\n220#1:487,8\n219#1:495,3\n226#1:498\n226#1:500,4\n227#1:504,6\n227#1:511,2\n227#1:516,8\n227#1:527,9\n227#1:539,8\n226#1:547,3\n234#1:550\n234#1:552,8\n234#1:560,6\n234#1:567,2\n234#1:572,8\n234#1:583,9\n234#1:595,8\n234#1:603,7\n234#1:610,9\n234#1:619,12\n234#1:634,8\n234#1:645,9\n234#1:657,8\n234#1:665,7\n242#1:672\n242#1:674,8\n245#1:684,6\n245#1:691,2\n245#1:696,8\n245#1:707,9\n245#1:719,8\n242#1:727,7\n254#1:734,5\n254#1:739\n254#1:741,8\n254#1:749,6\n254#1:756,2\n254#1:761,8\n254#1:772,9\n254#1:784,8\n254#1:792,7\n262#1:799,5\n262#1:804\n262#1:806,8\n262#1:814,6\n262#1:821,2\n262#1:826,8\n262#1:837,9\n262#1:849,8\n262#1:857,7\n271#1:864\n271#1:866,15\n271#1:881,6\n271#1:888,2\n271#1:893,8\n271#1:904,9\n271#1:916,8\n271#1:924,8\n276#1:932\n276#1:934\n276#1:938,7\n276#1:946,9\n276#1:955,6\n276#1:962,2\n276#1:967,17\n276#1:987,8\n276#1:995,6\n282#1:1001,6\n282#1:1008,2\n282#1:1013,8\n282#1:1024,9\n282#1:1036,8\n283#1:1044\n283#1:1046\n283#1:1050,7\n283#1:1058,9\n283#1:1067,6\n283#1:1074,2\n283#1:1079,8\n283#1:1090,9\n283#1:1102,8\n283#1:1110,6\n289#1:1116\n289#1:1118\n289#1:1122,12\n290#1:1134,6\n290#1:1141,2\n290#1:1146,8\n290#1:1157,9\n290#1:1169,8\n289#1:1177,8\n219#1:445\n226#1:499\n234#1:551\n242#1:673\n254#1:740\n262#1:805\n271#1:865\n276#1:933\n283#1:1045\n289#1:1117\n127#1:426,11\n141#1:440\n276#1:945\n283#1:1057\n134#1:437\n134#1:438,2\n164#1:441\n164#1:442,2\n220#1:472\n220#1:473,2\n227#1:524\n227#1:525,2\n234#1:580\n234#1:581,2\n234#1:642\n234#1:643,2\n245#1:704\n245#1:705,2\n254#1:769\n254#1:770,2\n262#1:834\n262#1:835,2\n271#1:901\n271#1:902,2\n276#1:935\n276#1:936,2\n282#1:1021\n282#1:1022,2\n283#1:1047\n283#1:1048,2\n283#1:1087\n283#1:1088,2\n289#1:1119\n289#1:1120,2\n290#1:1154\n290#1:1155,2\n402#1:1194\n402#1:1195,2\n220#1:458\n227#1:510\n234#1:566\n243#1:682\n244#1:683\n245#1:690\n254#1:755\n262#1:820\n271#1:887\n276#1:961\n282#1:1007\n283#1:1073\n290#1:1140\n345#1:1186\n351#1:1188\n388#1:1189\n395#1:1193\n220#1:461,3\n220#1:484,3\n227#1:513,3\n227#1:536,3\n234#1:569,3\n234#1:592,3\n234#1:631,3\n234#1:654,3\n245#1:693,3\n245#1:716,3\n254#1:758,3\n254#1:781,3\n262#1:823,3\n262#1:846,3\n271#1:890,3\n271#1:913,3\n276#1:964,3\n276#1:984,3\n282#1:1010,3\n282#1:1033,3\n283#1:1076,3\n283#1:1099,3\n290#1:1143,3\n290#1:1166,3\n394#1:1190,3\n394#1:1197,3\n345#1:1185\n351#1:1187\n*E\n"})
/* renamed from: androidx.compose.ui.node.DelegatableNodeKt */
/* loaded from: classes2.dex */
public final class DelegatableNodeKt {
    /* renamed from: a */
    public static final void m59510a(MutableVector mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i].getNodes$ui_release().getHead$ui_release());
                i--;
            } while (i >= 0);
        }
    }

    public static final /* synthetic */ Modifier.Node access$pop(MutableVector mutableVector) {
        return m59509b(mutableVector);
    }

    /* renamed from: ancestors-64DMado */
    public static final /* synthetic */ <T> List<T> m72890ancestors64DMado(DelegatableNode ancestors, int i) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(ancestors, "$this$ancestors");
        if (ancestors.getNode().isAttached()) {
            Modifier.Node parent$ui_release = ancestors.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(ancestors);
            ArrayList arrayList = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = m59509b(null)) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Nullable
    public static final LayoutModifierNode asLayoutModifierNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "<this>");
        if ((NodeKind.m72961constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                while (delegate$ui_release != null) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    if ((delegate$ui_release instanceof DelegatingNode) && (NodeKind.m72961constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) != 0) {
                        delegate$ui_release = ((DelegatingNode) delegate$ui_release).getDelegate$ui_release();
                    } else {
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final Modifier.Node m59509b(MutableVector mutableVector) {
        if (mutableVector != null && !mutableVector.isEmpty()) {
            return (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0 */
    public static final /* synthetic */ <T> void m72891dispatchForKind6rFNWt0(Modifier.Node dispatchForKind, int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(dispatchForKind, "$this$dispatchForKind");
        Intrinsics.checkNotNullParameter(block, "block");
        while (dispatchForKind != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            block.invoke(dispatchForKind);
            dispatchForKind = m59509b(null);
        }
    }

    /* renamed from: has-64DMado */
    public static final boolean m72892has64DMado(@NotNull DelegatableNode has, int i) {
        Intrinsics.checkNotNullParameter(has, "$this$has");
        if ((has.getNode().getAggregateChildKindSet$ui_release() & i) != 0) {
            return true;
        }
        return false;
    }

    public static final void invalidateSubtree(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode() == delegatableNode) {
            return true;
        }
        return false;
    }

    @Nullable
    public static final Modifier.Node nearestAncestor(@NotNull DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            return parent$ui_release;
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return null;
        }
        throw new IllegalStateException("nearestAncestor called on an unattached node".toString());
    }

    /* renamed from: nearestAncestor-64DMado */
    public static final /* synthetic */ <T> T m72893nearestAncestor64DMado(DelegatableNode nearestAncestor, int i) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(nearestAncestor, "$this$nearestAncestor");
        if (nearestAncestor.getNode().isAttached()) {
            Object parent$ui_release = nearestAncestor.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(nearestAncestor);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((((Modifier.Node) parent$ui_release).getKindSet$ui_release() & i) != 0) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            return (T) parent$ui_release;
                        }
                        parent$ui_release = (T) ((Modifier.Node) parent$ui_release).getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = (T) nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = (T) null;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @NotNull
    /* renamed from: requireCoordinator-64DMado */
    public static final NodeCoordinator m72894requireCoordinator64DMado(@NotNull DelegatableNode requireCoordinator, int i) {
        Intrinsics.checkNotNullParameter(requireCoordinator, "$this$requireCoordinator");
        NodeCoordinator coordinator$ui_release = requireCoordinator.getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator$ui_release);
        if (coordinator$ui_release.getTail() == requireCoordinator && NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(i)) {
            NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(wrapped$ui_release);
            return wrapped$ui_release;
        }
        return coordinator$ui_release;
    }

    @NotNull
    public static final Density requireDensity(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        return requireLayoutNode(delegatableNode).getDensity();
    }

    @NotNull
    public static final LayoutDirection requireLayoutDirection(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    @NotNull
    public static final LayoutNode requireLayoutNode(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    @NotNull
    public static final Owner requireOwner(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final void visitAncestors(@NotNull DelegatableNode delegatableNode, int i, boolean z, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (delegatableNode.getNode().isAttached()) {
            if (z) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            block.invoke(parent$ui_release);
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i, boolean z, Function1 block, int i2, Object obj) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if ((i2 & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (delegatableNode.getNode().isAttached()) {
            if (z) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            block.invoke(parent$ui_release);
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitAncestors-Y-YKmho */
    public static final /* synthetic */ <T> void m72895visitAncestorsYYKmho(DelegatableNode visitAncestors, int i, boolean z, Function1<? super T, Unit> block) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(visitAncestors, "$this$visitAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (visitAncestors.getNode().isAttached()) {
            if (z) {
                parent$ui_release = visitAncestors.getNode();
            } else {
                parent$ui_release = visitAncestors.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(visitAncestors);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = m59509b(null)) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                block.invoke(node);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitAncestors-Y-YKmho$default */
    public static /* synthetic */ void m72896visitAncestorsYYKmho$default(DelegatableNode visitAncestors, int i, boolean z, Function1 block, int i2, Object obj) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if ((i2 & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(visitAncestors, "$this$visitAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (visitAncestors.getNode().isAttached()) {
            if (z) {
                parent$ui_release = visitAncestors.getNode();
            } else {
                parent$ui_release = visitAncestors.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(visitAncestors);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = m59509b(null)) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                block.invoke(node);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final void visitChildren(@NotNull DelegatableNode delegatableNode, int i, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                m59510a(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    m59510a(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & i) != 0) {
                            block.invoke(node);
                            break;
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: visitChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m72897visitChildren6rFNWt0(DelegatableNode visitChildren, int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitChildren, "$this$visitChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        if (visitChildren.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = visitChildren.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                m59510a(mutableVector, visitChildren.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    m59510a(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & i) != 0) {
                            while (node != null) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                block.invoke(node);
                                node = m59509b(null);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void visitLocalAncestors(@NotNull DelegatableNode delegatableNode, int i, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                    block.invoke(parent$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
    }

    /* renamed from: visitLocalAncestors-6rFNWt0 */
    public static final /* synthetic */ <T> void m72898visitLocalAncestors6rFNWt0(DelegatableNode visitLocalAncestors, int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalAncestors, "$this$visitLocalAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (visitLocalAncestors.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = visitLocalAncestors.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (Modifier.Node node = parent$ui_release; node != null; node = m59509b(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        block.invoke(node);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
    }

    public static final void visitLocalDescendants(@NotNull DelegatableNode delegatableNode, int i, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                return;
            }
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                    block.invoke(child$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: visitLocalDescendants-6rFNWt0 */
    public static final /* synthetic */ <T> void m72899visitLocalDescendants6rFNWt0(DelegatableNode visitLocalDescendants, int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalDescendants, "$this$visitLocalDescendants");
        Intrinsics.checkNotNullParameter(block, "block");
        if (visitLocalDescendants.getNode().isAttached()) {
            Modifier.Node node = visitLocalDescendants.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                        for (Modifier.Node node2 = child$ui_release; node2 != null; node2 = m59509b(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            block.invoke(node2);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I */
    public static final /* synthetic */ <T> void m72900visitSelfAndAncestors5BbP62I(DelegatableNode visitSelfAndAncestors, int i, int i2, Function1<? super T, Unit> block) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(visitSelfAndAncestors, "$this$visitSelfAndAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        Modifier.Node node = visitSelfAndAncestors.getNode();
        int i3 = i | i2;
        if (visitSelfAndAncestors.getNode().isAttached()) {
            Modifier.Node node2 = visitSelfAndAncestors.getNode();
            LayoutNode requireLayoutNode = requireLayoutNode(visitSelfAndAncestors);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i3) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui_release() & i3) != 0) {
                            if (node2 != node && (node2.getKindSet$ui_release() & i2) != 0) {
                                return;
                            }
                            if ((node2.getKindSet$ui_release() & i) != 0) {
                                for (Modifier.Node node3 = node2; node3 != null; node3 = m59509b(null)) {
                                    Intrinsics.reifiedOperationMarker(3, "T");
                                    block.invoke(node3);
                                }
                            }
                        }
                        node2 = node2.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    node2 = nodes$ui_release.getTail$ui_release();
                } else {
                    node2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitSelfAndChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m72901visitSelfAndChildren6rFNWt0(DelegatableNode visitSelfAndChildren, int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitSelfAndChildren, "$this$visitSelfAndChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node node = visitSelfAndChildren.getNode(); node != null; node = m59509b(null)) {
            Intrinsics.reifiedOperationMarker(3, "T");
            block.invoke(node);
        }
        if (visitSelfAndChildren.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = visitSelfAndChildren.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                m59510a(mutableVector, visitSelfAndChildren.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node2.getAggregateChildKindSet$ui_release() & i) == 0) {
                    m59510a(mutableVector, node2);
                } else {
                    while (true) {
                        if (node2 == null) {
                            break;
                        } else if ((node2.getKindSet$ui_release() & i) != 0) {
                            while (node2 != null) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                block.invoke(node2);
                                node2 = m59509b(null);
                            }
                        } else {
                            node2 = node2.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void visitSubtree(@NotNull DelegatableNode delegatableNode, int i, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                            block.invoke(child$ui_release);
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                child$ui_release = null;
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitSubtree called on an unattached node".toString());
    }

    /* renamed from: visitSubtree-6rFNWt0 */
    public static final /* synthetic */ <T> void m72902visitSubtree6rFNWt0(DelegatableNode visitSubtree, int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitSubtree, "$this$visitSubtree");
        Intrinsics.checkNotNullParameter(block, "block");
        if (visitSubtree.getNode().isAttached()) {
            Modifier.Node child$ui_release = visitSubtree.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(visitSubtree);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                            for (Modifier.Node node = child$ui_release; node != null; node = m59509b(null)) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                block.invoke(node);
                            }
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
                child$ui_release = null;
            }
            return;
        }
        throw new IllegalStateException("visitSubtree called on an unattached node".toString());
    }

    public static final void visitSubtreeIf(@NotNull DelegatableNode delegatableNode, int i, @NotNull Function1<? super Modifier.Node, Boolean> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                m59510a(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & i) == 0 || block.invoke(node2).booleanValue()) {
                        }
                    }
                }
                m59510a(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    /* renamed from: visitSubtreeIf-6rFNWt0 */
    public static final /* synthetic */ <T> void m72903visitSubtreeIf6rFNWt0(DelegatableNode visitSubtreeIf, int i, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(visitSubtreeIf, "$this$visitSubtreeIf");
        Intrinsics.checkNotNullParameter(block, "block");
        if (visitSubtreeIf.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = visitSubtreeIf.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                m59510a(mutableVector, visitSubtreeIf.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & i) != 0) {
                            for (Modifier.Node node3 = node2; node3 != null; node3 = m59509b(null)) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                if (!block.invoke(node3).booleanValue()) {
                                    break;
                                }
                            }
                            continue;
                        }
                    }
                }
                m59510a(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }
}
