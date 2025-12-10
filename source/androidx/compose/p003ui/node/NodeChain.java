package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.ModifierInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0002\\}B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001d\u0010\u0012JE\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0\"H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&JC\u0010*\u001a\u00020\b\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u0010)J/\u0010*\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b.\u0010)J'\u0010*\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b0\u0010/JC\u00103\u001a\u00020\b\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u0010)J/\u00103\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b4\u0010)J'\u00103\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b4\u0010/J.\u00107\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b5\u00106J.\u00109\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b8\u00106J!\u0010<\u001a\u00020#2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020#2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b=\u0010;J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020-H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020-2\u0006\u0010C\u001a\u00020-H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u0012JG\u0010N\u001a\u00060MR\u00020\u00002\u0006\u00109\u001a\u00020-2\u0006\u0010G\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020I0H2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010S\u001a\u00020\b2\u0006\u0010P\u001a\u00020-2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJC\u0010U\u001a\u00020\b2\u0006\u0010G\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020I0H2\u0006\u00107\u001a\u00020-2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0002¢\u0006\u0004\bX\u0010EJ\u0017\u0010Y\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0002¢\u0006\u0004\bY\u0010EJ\u001f\u0010\\\u001a\u00020-2\u0006\u0010Z\u001a\u00020I2\u0006\u0010[\u001a\u00020-H\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00020-2\u0006\u0010W\u001a\u00020-2\u0006\u0010[\u001a\u00020-H\u0002¢\u0006\u0004\b^\u0010_J'\u0010b\u001a\u00020\b2\u0006\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020I2\u0006\u0010W\u001a\u00020-H\u0002¢\u0006\u0004\bb\u0010cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010d\u001a\u0004\be\u0010fR\u001a\u0010k\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010h\u001a\u0004\bi\u0010jR$\u0010q\u001a\u00020Q2\u0006\u0010l\u001a\u00020Q8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u00107\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010r\u001a\u0004\bs\u0010BR$\u00109\u001a\u00020-2\u0006\u0010l\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b^\u0010r\u001a\u0004\bt\u0010BR\u001e\u0010v\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010uR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010uR\u001c\u0010y\u001a\b\u0018\u00010MR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010xR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010zR\u0014\u0010|\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010{\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006~"}, m28850d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "", "useLogger$ui_release", "(Landroidx/compose/ui/node/NodeChain$Logger;)V", "useLogger", "Landroidx/compose/ui/Modifier;", OperatorName.MOVE_TO, "updateFrom$ui_release", "(Landroidx/compose/ui/Modifier;)V", "updateFrom", "resetState$ui_release", "()V", "resetState", "syncCoordinators", "markAsAttached", "runAttachLifecycle", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "markAsDetached$ui_release", "markAsDetached", "runDetachLifecycle$ui_release", "runDetachLifecycle", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "", "block", "firstFromHead-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstFromHead", "headToTail-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "headToTail", "", "mask", "Landroidx/compose/ui/Modifier$Node;", "headToTail$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "headToTailExclusive$ui_release", "headToTailExclusive", "tailToHead-aLcG6gQ$ui_release", "tailToHead", "tailToHead$ui_release", "tail-H91voCI$ui_release", "(I)Ljava/lang/Object;", "tail", "head-H91voCI$ui_release", HeaderTable.TAG, "has-H91voCI$ui_release", "(I)Z", "has", "has$ui_release", "", "toString", "()Ljava/lang/String;", OperatorName.FILL_NON_ZERO, "()Landroidx/compose/ui/Modifier$Node;", "paddedHead", OperatorName.NON_STROKING_CMYK, "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", OperatorName.SET_LINE_JOINSTYLE, TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "after", "shouldAttachOnInsert", "Landroidx/compose/ui/node/NodeChain$a;", "d", "(Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/NodeChain$a;", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V", "i", "(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "node", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CLOSE_PATH, "element", "parent", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "e", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "prev", "next", OperatorName.LINE_TO, "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "<set-?>", OperatorName.CURVE_TO, "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui_release", "getHead$ui_release", "Landroidx/compose/runtime/collection/MutableVector;", "current", "buffer", "Landroidx/compose/ui/node/NodeChain$a;", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Logger;", "()I", "aggregateChildKindSet", "Logger", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,831:1\n743#1,6:842\n712#1,6:848\n712#1,6:854\n720#1,3:861\n723#1,3:867\n743#1,6:870\n743#1,6:876\n689#1,8:884\n712#1,3:892\n697#1,2:895\n690#1:897\n691#1,11:941\n715#1,3:952\n702#1:955\n692#1:956\n695#1,2:957\n712#1,3:959\n697#1,2:962\n700#1,2:1007\n715#1,3:1009\n702#1:1012\n712#1,6:1013\n734#1,12:1019\n746#1,3:1074\n740#1:1077\n743#1,6:1078\n728#1,18:1084\n746#1,3:1145\n740#1:1148\n731#1:1149\n689#1,8:1150\n712#1,3:1158\n697#1,2:1161\n690#1:1163\n691#1,11:1207\n715#1,3:1218\n702#1:1221\n692#1:1222\n720#1,6:1223\n1#2:832\n1182#3:833\n1161#3,2:834\n1161#3,2:840\n1162#3:860\n1182#3:918\n1161#3,2:919\n1182#3:984\n1161#3,2:985\n1182#3:1051\n1161#3,2:1052\n1182#3:1122\n1161#3,2:1123\n1182#3:1184\n1161#3,2:1185\n523#4:836\n523#4:837\n523#4:838\n523#4:839\n523#4:864\n728#4,2:865\n72#5:882\n261#6:883\n261#6:904\n261#6:970\n261#6:1037\n261#6:1108\n261#6:1170\n383#7,6:898\n393#7,2:905\n395#7,8:910\n403#7,9:921\n412#7,8:933\n383#7,6:964\n393#7,2:971\n395#7,8:976\n403#7,9:987\n412#7,8:999\n383#7,6:1031\n393#7,2:1038\n395#7,8:1043\n403#7,9:1054\n412#7,8:1066\n383#7,6:1102\n393#7,2:1109\n395#7,8:1114\n403#7,9:1125\n412#7,8:1137\n383#7,6:1164\n393#7,2:1171\n395#7,8:1176\n403#7,9:1187\n412#7,8:1199\n234#8,3:907\n237#8,3:930\n234#8,3:973\n237#8,3:996\n234#8,3:1040\n237#8,3:1063\n234#8,3:1111\n237#8,3:1134\n234#8,3:1173\n237#8,3:1196\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n218#1:842,6\n278#1:848,6\n288#1:854,6\n314#1:861,3\n314#1:867,3\n346#1:870,6\n352#1:876,6\n682#1:884,8\n682#1:892,3\n682#1:895,2\n682#1:897\n682#1:941,11\n682#1:952,3\n682#1:955\n682#1:956\n689#1:957,2\n689#1:959,3\n689#1:962,2\n689#1:1007,2\n689#1:1009,3\n689#1:1012\n696#1:1013,6\n728#1:1019,12\n728#1:1074,3\n728#1:1077\n735#1:1078,6\n751#1:1084,18\n751#1:1145,3\n751#1:1148\n751#1:1149\n758#1:1150,8\n758#1:1158,3\n758#1:1161,2\n758#1:1163\n758#1:1207,11\n758#1:1218,3\n758#1:1221\n758#1:1222\n774#1:1223,6\n113#1:833\n113#1:834,2\n195#1:840,2\n312#1:860\n682#1:918\n682#1:919,2\n690#1:984\n690#1:985,2\n729#1:1051\n729#1:1052,2\n751#1:1122\n751#1:1123,2\n758#1:1184\n758#1:1185,2\n124#1:836\n125#1:837\n175#1:838\n187#1:839\n340#1:864\n340#1:865,2\n394#1:882\n394#1:883\n682#1:904\n690#1:970\n729#1:1037\n751#1:1108\n758#1:1170\n682#1:898,6\n682#1:905,2\n682#1:910,8\n682#1:921,9\n682#1:933,8\n690#1:964,6\n690#1:971,2\n690#1:976,8\n690#1:987,9\n690#1:999,8\n729#1:1031,6\n729#1:1038,2\n729#1:1043,8\n729#1:1054,9\n729#1:1066,8\n751#1:1102,6\n751#1:1109,2\n751#1:1114,8\n751#1:1125,9\n751#1:1137,8\n758#1:1164,6\n758#1:1171,2\n758#1:1176,8\n758#1:1187,9\n758#1:1199,8\n682#1:907,3\n682#1:930,3\n690#1:973,3\n690#1:996,3\n729#1:1040,3\n729#1:1063,3\n751#1:1111,3\n751#1:1134,3\n758#1:1173,3\n758#1:1196,3\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeChain */
/* loaded from: classes2.dex */
public final class NodeChain {

    /* renamed from: a */
    public final LayoutNode f30372a;

    /* renamed from: b */
    public final InnerNodeCoordinator f30373b;

    /* renamed from: c */
    public NodeCoordinator f30374c;

    /* renamed from: d */
    public final Modifier.Node f30375d;

    /* renamed from: e */
    public Modifier.Node f30376e;

    /* renamed from: f */
    public MutableVector f30377f;

    /* renamed from: g */
    public MutableVector f30378g;

    /* renamed from: h */
    public C3521a f30379h;

    /* renamed from: i */
    public Logger f30380i;

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "linearDiffAborted", "", FirebaseAnalytics.Param.INDEX, "", "prev", "Landroidx/compose/ui/Modifier$Element;", "next", "node", "Landroidx/compose/ui/Modifier$Node;", "nodeInserted", "atIndex", "newIndex", "element", "child", "inserted", "nodeRemoved", "oldIndex", "nodeReused", "nodeUpdated", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.NodeChain$Logger */
    /* loaded from: classes2.dex */
    public interface Logger {
        void linearDiffAborted(int i, @NotNull Modifier.Element element, @NotNull Modifier.Element element2, @NotNull Modifier.Node node);

        void nodeInserted(int i, int i2, @NotNull Modifier.Element element, @NotNull Modifier.Node node, @NotNull Modifier.Node node2);

        void nodeRemoved(int i, @NotNull Modifier.Element element, @NotNull Modifier.Node node);

        void nodeReused(int i, int i2, @NotNull Modifier.Element element, @NotNull Modifier.Element element2, @NotNull Modifier.Node node);

        void nodeUpdated(int i, int i2, @NotNull Modifier.Element element, @NotNull Modifier.Element element2, @NotNull Modifier.Node node);
    }

    /* renamed from: androidx.compose.ui.node.NodeChain$a */
    /* loaded from: classes2.dex */
    public final class C3521a implements DiffCallback {

        /* renamed from: a */
        public Modifier.Node f30381a;

        /* renamed from: b */
        public int f30382b;

        /* renamed from: c */
        public MutableVector f30383c;

        /* renamed from: d */
        public MutableVector f30384d;

        /* renamed from: e */
        public boolean f30385e;

        /* renamed from: f */
        public final /* synthetic */ NodeChain f30386f;

        public C3521a(NodeChain nodeChain, Modifier.Node node, int i, MutableVector before, MutableVector after, boolean z) {
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(before, "before");
            Intrinsics.checkNotNullParameter(after, "after");
            this.f30386f = nodeChain;
            this.f30381a = node;
            this.f30382b = i;
            this.f30383c = before;
            this.f30384d = after;
            this.f30385e = z;
        }

        /* renamed from: a */
        public final void m59419a(MutableVector mutableVector) {
            Intrinsics.checkNotNullParameter(mutableVector, "<set-?>");
            this.f30384d = mutableVector;
        }

        @Override // androidx.compose.p003ui.node.DiffCallback
        public boolean areItemsTheSame(int i, int i2) {
            MutableVector mutableVector = this.f30383c;
            int i3 = this.f30382b + i;
            MutableVector mutableVector2 = this.f30384d;
            if (NodeChainKt.actionForModifiers((Modifier.Element) mutableVector.getContent()[i3], (Modifier.Element) mutableVector2.getContent()[this.f30382b + i2]) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void m59418b(MutableVector mutableVector) {
            Intrinsics.checkNotNullParameter(mutableVector, "<set-?>");
            this.f30383c = mutableVector;
        }

        /* renamed from: c */
        public final void m59417c(Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "<set-?>");
            this.f30381a = node;
        }

        /* renamed from: d */
        public final void m59416d(int i) {
            this.f30382b = i;
        }

        /* renamed from: e */
        public final void m59415e(boolean z) {
            this.f30385e = z;
        }

        @Override // androidx.compose.p003ui.node.DiffCallback
        public void insert(int i) {
            int i2 = this.f30382b + i;
            Modifier.Node node = this.f30381a;
            this.f30381a = this.f30386f.m59431a((Modifier.Element) this.f30384d.getContent()[i2], node);
            Logger logger = this.f30386f.f30380i;
            if (logger != null) {
                logger.nodeInserted(i2, i2, (Modifier.Element) this.f30384d.getContent()[i2], node, this.f30381a);
            }
            if (this.f30385e) {
                Modifier.Node child$ui_release = this.f30381a.getChild$ui_release();
                Intrinsics.checkNotNull(child$ui_release);
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                Intrinsics.checkNotNull(coordinator$ui_release);
                LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.f30381a);
                if (asLayoutModifierNode != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.f30386f.getLayoutNode(), asLayoutModifierNode);
                    this.f30381a.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                    this.f30386f.m59425g(this.f30381a, layoutModifierNodeCoordinator);
                    layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                    layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                    coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                } else {
                    this.f30381a.updateCoordinator$ui_release(coordinator$ui_release);
                }
                this.f30381a.markAsAttached$ui_release();
                this.f30381a.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(this.f30381a);
                return;
            }
            this.f30381a.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }

        @Override // androidx.compose.p003ui.node.DiffCallback
        public void remove(int i, int i2) {
            Modifier.Node child$ui_release = this.f30381a.getChild$ui_release();
            Intrinsics.checkNotNull(child$ui_release);
            Logger logger = this.f30386f.f30380i;
            if (logger != null) {
                logger.nodeRemoved(i2, (Modifier.Element) this.f30383c.getContent()[this.f30382b + i2], child$ui_release);
            }
            if ((NodeKind.m72961constructorimpl(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                Intrinsics.checkNotNull(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                Intrinsics.checkNotNull(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                this.f30386f.m59425g(this.f30381a, wrapped$ui_release);
            }
            this.f30381a = this.f30386f.m59430b(child$ui_release);
        }

        @Override // androidx.compose.p003ui.node.DiffCallback
        public void same(int i, int i2) {
            Modifier.Node child$ui_release = this.f30381a.getChild$ui_release();
            Intrinsics.checkNotNull(child$ui_release);
            this.f30381a = child$ui_release;
            Modifier.Element element = (Modifier.Element) this.f30383c.getContent()[this.f30382b + i];
            Modifier.Element element2 = (Modifier.Element) this.f30384d.getContent()[this.f30382b + i2];
            if (!Intrinsics.areEqual(element, element2)) {
                this.f30386f.m59420l(element, element2, this.f30381a);
                Logger logger = this.f30386f.f30380i;
                if (logger != null) {
                    int i3 = this.f30382b;
                    logger.nodeUpdated(i3 + i, i3 + i2, element, element2, this.f30381a);
                    return;
                }
                return;
            }
            Logger logger2 = this.f30386f.f30380i;
            if (logger2 != null) {
                int i4 = this.f30382b;
                logger2.nodeReused(i4 + i, i4 + i2, element, element2, this.f30381a);
            }
        }
    }

    public NodeChain(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30372a = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.f30373b = innerNodeCoordinator;
        this.f30374c = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.f30375d = tail;
        this.f30376e = tail;
    }

    /* renamed from: a */
    public final Modifier.Node m59431a(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!backwardsCompatNode.isAttached()) {
            backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            return m59427e(backwardsCompatNode, node);
        }
        throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
    }

    /* renamed from: b */
    public final Modifier.Node m59430b(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return m59424h(node);
    }

    /* renamed from: c */
    public final int m59429c() {
        return this.f30376e.getAggregateChildKindSet$ui_release();
    }

    /* renamed from: d */
    public final C3521a m59428d(Modifier.Node node, int i, MutableVector mutableVector, MutableVector mutableVector2, boolean z) {
        C3521a c3521a = this.f30379h;
        if (c3521a == null) {
            C3521a c3521a2 = new C3521a(this, node, i, mutableVector, mutableVector2, z);
            this.f30379h = c3521a2;
            return c3521a2;
        }
        c3521a.m59417c(node);
        c3521a.m59416d(i);
        c3521a.m59418b(mutableVector);
        c3521a.m59419a(mutableVector2);
        c3521a.m59415e(z);
        return c3521a;
    }

    /* renamed from: e */
    public final Modifier.Node m59427e(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui_release = node2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        node2.setChild$ui_release(node);
        node.setParent$ui_release(node2);
        return node;
    }

    /* renamed from: f */
    public final Modifier.Node m59426f() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        Modifier.Node node = this.f30376e;
        nodeChainKt$SentinelHead$1 = NodeChainKt.f30387a;
        if (node != nodeChainKt$SentinelHead$1) {
            Modifier.Node node2 = this.f30376e;
            nodeChainKt$SentinelHead$12 = NodeChainKt.f30387a;
            node2.setParent$ui_release(nodeChainKt$SentinelHead$12);
            nodeChainKt$SentinelHead$13 = NodeChainKt.f30387a;
            nodeChainKt$SentinelHead$13.setChild$ui_release(node2);
            nodeChainKt$SentinelHead$14 = NodeChainKt.f30387a;
            return nodeChainKt$SentinelHead$14;
        }
        throw new IllegalStateException("padChain called on already padded chain".toString());
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> T m72933firstFromHeadaLcG6gQ$ui_release(int i, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((m59429c() & i) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (Modifier.Node node = head$ui_release; node != null; node = DelegatableNodeKt.m59509b(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if (block.invoke(node).booleanValue()) {
                            return (T) node;
                        }
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void m59425g(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeCoordinator nodeCoordinator2;
        for (Modifier.Node parent$ui_release = node.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.f30387a;
            if (parent$ui_release == nodeChainKt$SentinelHead$1) {
                LayoutNode parent$ui_release2 = this.f30372a.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    nodeCoordinator2 = parent$ui_release2.getInnerCoordinator$ui_release();
                } else {
                    nodeCoordinator2 = null;
                }
                nodeCoordinator.setWrappedBy$ui_release(nodeCoordinator2);
                this.f30374c = nodeCoordinator;
                return;
            } else if ((NodeKind.m72961constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) == 0) {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            } else {
                return;
            }
        }
    }

    @NotNull
    public final Modifier.Node getHead$ui_release() {
        return this.f30376e;
    }

    @NotNull
    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.f30373b;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.f30372a;
    }

    @NotNull
    public final List<ModifierInfo> getModifierInfo() {
        MutableVector mutableVector = this.f30377f;
        if (mutableVector == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            NodeCoordinator coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release != null) {
                OwnedLayer layer = coordinator$ui_release.getLayer();
                this.f30373b.getLayer();
                Modifier.Node child$ui_release = head$ui_release.getChild$ui_release();
                OwnedLayer ownedLayer = (child$ui_release != this.f30375d || head$ui_release.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) ? null : null;
                if (layer == null) {
                    layer = ownedLayer;
                }
                mutableVector2.add(new ModifierInfo((Modifier) mutableVector.getContent()[i], coordinator$ui_release, layer));
                head$ui_release = head$ui_release.getChild$ui_release();
                i++;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return mutableVector2.asMutableList();
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.f30374c;
    }

    @NotNull
    public final Modifier.Node getTail$ui_release() {
        return this.f30375d;
    }

    /* renamed from: h */
    public final Modifier.Node m59424h(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(parent$ui_release);
        return parent$ui_release;
    }

    public final boolean has$ui_release(int i) {
        if ((i & m59429c()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: has-H91voCI$ui_release */
    public final boolean m72934hasH91voCI$ui_release(int i) {
        if ((i & m59429c()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: head-H91voCI$ui_release */
    public final /* synthetic */ <T> T m72935headH91voCI$ui_release(int i) {
        if ((m59429c() & i) != 0) {
            for (T t = (T) getHead$ui_release(); t != null; t = (T) ((Modifier.Node) t).getChild$ui_release()) {
                if ((((Modifier.Node) t).getKindSet$ui_release() & i) != 0) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    return t;
                } else if ((((Modifier.Node) t).getAggregateChildKindSet$ui_release() & i) == 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final void headToTail$ui_release(int i, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((m59429c() & i) == 0) {
            return;
        }
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                block.invoke(head$ui_release);
            }
            if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                return;
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m72936headToTailaLcG6gQ$ui_release(int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((m59429c() & i) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (Modifier.Node node = head$ui_release; node != null; node = DelegatableNodeKt.m59509b(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        block.invoke(node);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null && head$ui_release != getTail$ui_release(); head$ui_release = head$ui_release.getChild$ui_release()) {
            block.invoke(head$ui_release);
        }
    }

    /* renamed from: i */
    public final void m59423i(int i, MutableVector mutableVector, MutableVector mutableVector2, Modifier.Node node, boolean z) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i, mutableVector2.getSize() - i, m59428d(node, i, mutableVector, mutableVector2, z));
        m59422j();
    }

    /* renamed from: j */
    public final void m59422j() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        int i = 0;
        for (Modifier.Node parent$ui_release = this.f30375d.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.f30387a;
            if (parent$ui_release != nodeChainKt$SentinelHead$1) {
                i |= parent$ui_release.getKindSet$ui_release();
                parent$ui_release.setAggregateChildKindSet$ui_release(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final Modifier.Node m59421k(Modifier.Node node) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$15;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$16;
        nodeChainKt$SentinelHead$1 = NodeChainKt.f30387a;
        if (node == nodeChainKt$SentinelHead$1) {
            nodeChainKt$SentinelHead$12 = NodeChainKt.f30387a;
            Modifier.Node child$ui_release = nodeChainKt$SentinelHead$12.getChild$ui_release();
            if (child$ui_release == null) {
                child$ui_release = this.f30375d;
            }
            child$ui_release.setParent$ui_release(null);
            nodeChainKt$SentinelHead$13 = NodeChainKt.f30387a;
            nodeChainKt$SentinelHead$13.setChild$ui_release(null);
            nodeChainKt$SentinelHead$14 = NodeChainKt.f30387a;
            nodeChainKt$SentinelHead$14.setAggregateChildKindSet$ui_release(-1);
            nodeChainKt$SentinelHead$15 = NodeChainKt.f30387a;
            nodeChainKt$SentinelHead$15.updateCoordinator$ui_release(null);
            nodeChainKt$SentinelHead$16 = NodeChainKt.f30387a;
            if (child$ui_release != nodeChainKt$SentinelHead$16) {
                return child$ui_release;
            }
            throw new IllegalStateException("trimChain did not update the head".toString());
        }
        throw new IllegalStateException("trimChain called on already trimmed chain".toString());
    }

    /* renamed from: l */
    public final void m59420l(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.m59413b((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
        } else if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).setElement(element2);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
    }

    public final void syncCoordinators() {
        NodeCoordinator nodeCoordinator;
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator2 = this.f30373b;
        for (Modifier.Node parent$ui_release = this.f30375d.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (asLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    Intrinsics.checkNotNull(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(asLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.f30372a, asLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator2.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator2);
                nodeCoordinator2 = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator2);
            }
        }
        LayoutNode parent$ui_release2 = this.f30372a.getParent$ui_release();
        if (parent$ui_release2 != null) {
            nodeCoordinator = parent$ui_release2.getInnerCoordinator$ui_release();
        } else {
            nodeCoordinator = null;
        }
        nodeCoordinator2.setWrappedBy$ui_release(nodeCoordinator);
        this.f30374c = nodeCoordinator2;
    }

    /* renamed from: tail-H91voCI$ui_release */
    public final /* synthetic */ <T> T m72937tailH91voCI$ui_release(int i) {
        if ((m59429c() & i) != 0) {
            for (T t = (T) getTail$ui_release(); t != null; t = (T) ((Modifier.Node) t).getParent$ui_release()) {
                if ((((Modifier.Node) t).getKindSet$ui_release() & i) != 0) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    return t;
                }
            }
            return null;
        }
        return null;
    }

    public final void tailToHead$ui_release(int i, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((m59429c() & i) == 0) {
            return;
        }
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((tail$ui_release.getKindSet$ui_release() & i) != 0) {
                block.invoke(tail$ui_release);
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m72938tailToHeadaLcG6gQ$ui_release(int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((m59429c() & i) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i) != 0) {
                    for (Modifier.Node node = tail$ui_release; node != null; node = DelegatableNodeKt.m59509b(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        block.invoke(node);
                    }
                }
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f30376e == this.f30375d) {
            sb.append("]");
        } else {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.f30375d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x008b, code lost:
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0097, code lost:
        if (r4 >= r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0099, code lost:
        if (r8 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x009b, code lost:
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x009d, code lost:
        m59423i(r4, r8, r9, r5, r18.f30372a.isAttached());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00bb, code lost:
        throw new java.lang.IllegalStateException("structuralUpdate requires a non-null tail".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00c5, code lost:
        throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateFrom$ui_release(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.Modifier r19) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui_release(@Nullable Logger logger) {
        this.f30380i = logger;
    }

    public final void tailToHead$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            block.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            block.invoke(head$ui_release);
        }
    }
}
