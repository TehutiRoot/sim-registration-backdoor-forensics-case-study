package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: a */
    public final ArrayList f32646a = new ArrayList();

    /* renamed from: b */
    public Measure f32647b = new Measure();

    /* renamed from: c */
    public ConstraintWidgetContainer f32648c;

    /* loaded from: classes2.dex */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    /* loaded from: classes2.dex */
    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32648c = constraintWidgetContainer;
    }

    /* renamed from: a */
    public final boolean m58545a(Measurer measurer, ConstraintWidget constraintWidget, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f32647b.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.f32647b.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.f32647b.horizontalDimension = constraintWidget.getWidth();
        this.f32647b.verticalDimension = constraintWidget.getHeight();
        Measure measure = this.f32647b;
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z = true;
        } else {
            z = false;
        }
        if (measure.verticalBehavior == dimensionBehaviour2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && constraintWidget.mDimensionRatio > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && constraintWidget.mDimensionRatio > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.f32647b.measuredWidth);
        constraintWidget.setHeight(this.f32647b.measuredHeight);
        constraintWidget.setHasBaseline(this.f32647b.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.f32647b.measuredBaseline);
        Measure measure2 = this.f32647b;
        measure2.measureStrategy = Measure.SELF_DIMENSIONS;
        return measure2.measuredNeedsSolverPass;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r8 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r5.mDimensionRatio <= 0.0f) goto L58;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m58544b(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r2 = r13.getMeasurer()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r5.verticalRun
            if (r7 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f32691c
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r7.f32691c
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 == r7) goto L61
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.mMatchConstraintDefaultWidth
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L7d
            r10 = 1
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.mMatchConstraintDefaultHeight
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L8c
            r10 = 1
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r12.m58545a(r2, r5, r6)
            androidx.constraintlayout.core.Metrics r5 = r13.mMetrics
            if (r5 == 0) goto Lac
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.m58544b(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):void");
    }

    /* renamed from: c */
    public final void m58543c(ConstraintWidgetContainer constraintWidgetContainer, String str, int i, int i2, int i3) {
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setHeight(i3);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.f32648c.setPass(i);
        this.f32648c.layout();
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        boolean z3;
        int i10;
        int i11;
        boolean z4;
        boolean z5;
        boolean z6;
        int i12;
        Measurer measurer;
        int i13;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        Metrics metrics;
        boolean z10;
        boolean z11;
        boolean z12;
        Measurer measurer2 = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean enabled = Optimizer.enabled(i, 128);
        if (!enabled && !Optimizer.enabled(i, 64)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i16);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour == dimensionBehaviour) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && z11 && constraintWidget.getDimensionRatio() > 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((constraintWidget.isInHorizontalChain() && z12) || ((constraintWidget.isInVerticalChain() && z12) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z = false;
                    break;
                }
            }
        }
        if (z && (metrics = LinearSystem.sMetrics) != null) {
            metrics.measures++;
        }
        if ((i4 == 1073741824 && i6 == 1073741824) || enabled) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z13 = z & z2;
        if (z13) {
            int min = Math.min(constraintWidgetContainer.getMaxWidth(), i5);
            int min2 = Math.min(constraintWidgetContainer.getMaxHeight(), i7);
            if (i4 == 1073741824 && constraintWidgetContainer.getWidth() != min) {
                constraintWidgetContainer.setWidth(min);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i6 == 1073741824 && constraintWidgetContainer.getHeight() != min2) {
                constraintWidgetContainer.setHeight(min2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z3 = constraintWidgetContainer.directMeasure(enabled);
                i10 = 2;
            } else {
                boolean directMeasureSetup = constraintWidgetContainer.directMeasureSetup(enabled);
                if (i4 == 1073741824) {
                    directMeasureSetup &= constraintWidgetContainer.directMeasureWithOrientation(enabled, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z3 = constraintWidgetContainer.directMeasureWithOrientation(enabled, 1) & directMeasureSetup;
                    i10++;
                } else {
                    z3 = directMeasureSetup;
                }
            }
            if (z3) {
                if (i4 == 1073741824) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i6 == 1073741824) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                constraintWidgetContainer.updateFromRuns(z8, z9);
            }
        } else {
            z3 = false;
            i10 = 0;
        }
        if (!z3 || i10 != 2) {
            int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
            if (size > 0) {
                m58544b(constraintWidgetContainer);
            }
            updateHierarchy(constraintWidgetContainer);
            int size2 = this.f32646a.size();
            if (size > 0) {
                m58543c(constraintWidgetContainer, "First pass", 0, width, height);
            }
            if (size2 > 0) {
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (horizontalDimensionBehaviour2 == dimensionBehaviour2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (constraintWidgetContainer.getVerticalDimensionBehaviour() == dimensionBehaviour2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int max = Math.max(constraintWidgetContainer.getWidth(), this.f32648c.getMinWidth());
                int max2 = Math.max(constraintWidgetContainer.getHeight(), this.f32648c.getMinHeight());
                int i17 = 0;
                boolean z14 = false;
                while (i17 < size2) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget) this.f32646a.get(i17);
                    if (!(constraintWidget2 instanceof VirtualLayout)) {
                        i13 = optimizationLevel;
                        i15 = width;
                        i14 = height;
                    } else {
                        int width2 = constraintWidget2.getWidth();
                        i13 = optimizationLevel;
                        int height2 = constraintWidget2.getHeight();
                        i14 = height;
                        boolean m58545a = m58545a(measurer2, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS) | z14;
                        Metrics metrics2 = constraintWidgetContainer.mMetrics;
                        i15 = width;
                        if (metrics2 != null) {
                            metrics2.measuredMatchWidgets++;
                        }
                        int width3 = constraintWidget2.getWidth();
                        int height3 = constraintWidget2.getHeight();
                        if (width3 != width2) {
                            constraintWidget2.setWidth(width3);
                            if (z4 && constraintWidget2.getRight() > max) {
                                max = Math.max(max, constraintWidget2.getRight() + constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            z7 = true;
                        } else {
                            z7 = m58545a;
                        }
                        if (height3 != height2) {
                            constraintWidget2.setHeight(height3);
                            if (z5 && constraintWidget2.getBottom() > max2) {
                                max2 = Math.max(max2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            z7 = true;
                        }
                        z14 = z7 | ((VirtualLayout) constraintWidget2).needSolverPass();
                    }
                    i17++;
                    optimizationLevel = i13;
                    height = i14;
                    width = i15;
                }
                int i18 = optimizationLevel;
                int i19 = width;
                int i20 = height;
                int i21 = 2;
                int i22 = 0;
                while (i22 < i21) {
                    int i23 = 0;
                    while (i23 < size2) {
                        ConstraintWidget constraintWidget3 = (ConstraintWidget) this.f32646a.get(i23);
                        if (((constraintWidget3 instanceof Helper) && !(constraintWidget3 instanceof VirtualLayout)) || (constraintWidget3 instanceof Guideline) || constraintWidget3.getVisibility() == 8 || ((z13 && constraintWidget3.horizontalRun.f32691c.resolved && constraintWidget3.verticalRun.f32691c.resolved) || (constraintWidget3 instanceof VirtualLayout))) {
                            z6 = z13;
                            i12 = size2;
                            measurer = measurer2;
                        } else {
                            int width4 = constraintWidget3.getWidth();
                            int height4 = constraintWidget3.getHeight();
                            int baselineDistance = constraintWidget3.getBaselineDistance();
                            int i24 = Measure.TRY_GIVEN_DIMENSIONS;
                            z6 = z13;
                            if (i22 == 1) {
                                i24 = Measure.USE_GIVEN_DIMENSIONS;
                            }
                            boolean m58545a2 = m58545a(measurer2, constraintWidget3, i24) | z14;
                            Metrics metrics3 = constraintWidgetContainer.mMetrics;
                            i12 = size2;
                            measurer = measurer2;
                            if (metrics3 != null) {
                                metrics3.measuredMatchWidgets++;
                            }
                            int width5 = constraintWidget3.getWidth();
                            int height5 = constraintWidget3.getHeight();
                            if (width5 != width4) {
                                constraintWidget3.setWidth(width5);
                                if (z4 && constraintWidget3.getRight() > max) {
                                    max = Math.max(max, constraintWidget3.getRight() + constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                m58545a2 = true;
                            }
                            if (height5 != height4) {
                                constraintWidget3.setHeight(height5);
                                if (z5 && constraintWidget3.getBottom() > max2) {
                                    max2 = Math.max(max2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                m58545a2 = true;
                            }
                            if (constraintWidget3.hasBaseline() && baselineDistance != constraintWidget3.getBaselineDistance()) {
                                z14 = true;
                            } else {
                                z14 = m58545a2;
                            }
                        }
                        i23++;
                        measurer2 = measurer;
                        z13 = z6;
                        size2 = i12;
                    }
                    boolean z15 = z13;
                    int i25 = size2;
                    Measurer measurer3 = measurer2;
                    if (!z14) {
                        break;
                    }
                    i22++;
                    m58543c(constraintWidgetContainer, "intermediate pass", i22, i19, i20);
                    measurer2 = measurer3;
                    z13 = z15;
                    size2 = i25;
                    i21 = 2;
                    z14 = false;
                }
                i11 = i18;
            } else {
                i11 = optimizationLevel;
            }
            constraintWidgetContainer.setOptimizationLevel(i11);
            return 0L;
        }
        return 0L;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32646a.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                this.f32646a.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }
}